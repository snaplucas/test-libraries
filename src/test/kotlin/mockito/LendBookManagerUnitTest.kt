package mockito;

import com.baeldung.mockito.BookService
import com.baeldung.mockito.LendBookManager
import org.junit.jupiter.api.Test
import org.mockito.Mockito

class LibraryManagementTest {

    @Test
    fun whenBookIsAvailable_thenLendMethodIsCalled() {
        val mockBookService = Mockito.mock(BookService::class.java)

        Mockito.`when`(mockBookService.inStock(100)).thenReturn(true)

        val manager = LendBookManager(mockBookService)

        manager.checkout(100, 1)

        Mockito.verify(mockBookService).lend(100, 1)
    }
}