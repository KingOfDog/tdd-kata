import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class MainTest : FreeSpec({

    "adding 12 and 17 should return 29" {
        add(12, 17) shouldBe 29
    }

    "substracting 12 from 17 should be 5" {
        substract(17, 12) shouldBe 5
    }
})