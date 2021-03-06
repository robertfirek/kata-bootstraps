import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.BehaviorSpec

class ThingBehaviorSpec : BehaviorSpec() { init {

    given("a thing") {
        val thing = Thing()

        `when`("call for action") {
            val value = thing.callForAction()

            then("result should be food") {
                value shouldBe "Food"
            }
        }

        `when`("call for action with bone") {
            val value = thing.callForAction("bone")

            then("result should be: Dog eats fish.") {
                value shouldBe "Dog eats fish."
            }
        }
    }
}}
