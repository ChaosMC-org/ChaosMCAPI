package xyz.lncvrt.chaosmcapi.utils

@Suppress("unused")
class MessageFormat {
    companion object {
        fun name(bold: Boolean): String {
            val name = "<gradient:#${Colors.SECONDARY}:#${Colors.PRIMARY}:#${Colors.SECONDARY}>ChaosMC</gradient>"
            return if (bold) {
                "<bold>${name}</bold>"
            } else {
                name
            }
        }

        fun name(): String {
            return name(true)
        }

        fun setPrefix(text: String): String {
            return "<bold>${name(false)} <gray>»</gray></bold> $text"
        }

        fun setStaffPrefix(text: String): String {
            return "<bold>${name(false)} <gradient:green:dark_green:green>Staff Mode</gradient> <gray>»</gray></bold> $text"
        }

        fun setPrimaryColor(text: String): String {
            return "<color:#${Colors.PRIMARY}>$text</color>"
        }

        fun setSecondaryColor(text: String): String {
            return "<color:#${Colors.SECONDARY}>$text</color>"
        }
    }
}
