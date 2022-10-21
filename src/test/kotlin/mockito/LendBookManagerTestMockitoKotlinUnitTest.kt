package mockito;

import com.baeldung.mockito.BookService
import com.baeldung.mockito.LendBookManager
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import org.junit.jupiter.api.Test

class LibraryManagementTestMockitoKotlin {

    @Test
    fun whenBookIsAvailable_thenLendMethodIsCalled() {
        val mockBookService: BookService = mock()

        whenever(mockBookService.inStock(100)).thenReturn(true)

        val manager = LendBookManager(mockBookService)

        manager.checkout(100, 1)

        verify(mockBookService).lend(100, 1)
    }
}