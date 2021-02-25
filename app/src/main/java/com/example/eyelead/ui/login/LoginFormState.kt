package com.example.eyelead.ui.login

/**
 * Data validation state of the login form.
 */
data class LoginFormState(val pin1Error: Int? = null,
                          val pin2Error: Int? = null,
                          val pin3Error: Int? = null,
                          val pin4Error: Int? = null,
                          val isDataValid: Boolean = false)