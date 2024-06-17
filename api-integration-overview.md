---
description: >-
  Our API provides a robust platform for integrating payment processing
  capabilities directly into your applications. All API endpoints are prefixed
  with: https://gate.sitesway.sa/api/v1/
---

# API Integration Overview

**Authentication**

To interact with our API, you will need an API key, obtainable from the Developers section of your account. Use this key as a bearer token in the Authorization header for every request:

```vbnet
vbnetCopy codeAuthorization: Bearer <secret key>
```

#### Plugins and Libraries

To streamline your development process, we offer ready-to-go connectors and libraries for popular platforms and programming languages.

**Plugins**

Easily integrate with major e-commerce platforms using our pre-built plugins:

* **WooCommerce**
* **OpenCart**
* **Magento**
* **PrestaShop**

**Libraries**

Develop custom solutions with our libraries available for:

* **PHP**
* **Java**
* **C#**
* **Node.js**

**SDKs**

Build mobile applications with our SDKs for:

* **iOS**
* **Android**

#### Integration Methods

**Online Purchases: Redirect Integration**

This method involves a prebuilt payment flow where you create a purchase using `POST /purchases/` to obtain a `checkout_url`. Redirect customers to this URL for payment processing, and upon completion, they will be redirected back to your site based on the `success_redirect` or `failure_redirect` parameters.

**Direct Post Integration**

For custom payment flows, use the `POST /purchases/` endpoint to create a purchase and capture card details through an HTML form on your site. This method raises your PCI DSS requirements to SAQ A-EP, as your system does not process card data directly.

**Server-to-Server (S2S) Integration**

S2S integration allows for backend payment processing without direct interaction between the client’s browser and the API. This method supports 3D Secure checks and direct API calls for payment authorization.

#### Advanced Features

**Tokenization & Recurring Payments**

Store card tokens for recurring payments without user interaction. Use the `POST /purchases/{new_purchase_id}/charge/` with a `recurring_token` to charge stored cards.

**Custom and Recurring Billing**

Create custom billing templates and manage subscriptions directly through the API. Use endpoints like `POST /billing_templates/` for recurring invoicing and subscription management.

#### Testing and Support

Utilize our sandbox environment for testing integrations with both 3D Secure and non-3D Secure card flows. Access detailed API documentation and support via the Developers section of your account for any integration assistance.



All the endpoints below have a prefix of `https://gate.sitesway.sa/api/v1/` (e.g. `POST https://gate.sitesway.sa/api/v1/purchases/`).

You will need your API key that you can obtain in the Developers section in your account. Please use this key as a bearer token in the Authorization header included in every request: `Authorization: Bearer <secret key>`.

Before starting the development, we recommend checking out the list of ready-to-go connectors to the popular platforms we’ve already built for you. It might save you some precious time if you use one of these to develop your project.

Plugins: [WooCommerce](https://gate.sitesway.sa/apis/plugins/WooCommerce%20v3.5+), [OpenCart](https://gate.sitesway.sa/apis/plugins/OpenCart%20v3.0+), [Magento](https://gate.sitesway.sa/apis/plugins/Magento%20v2.0+), [PrestaShop](https://gate.sitesway.sa/apis/plugins/PrestaShop%20v1.7+)

Libraries: [PHP](https://gate.sitesway.sa/apis/libraries/PHP), [Java](https://gate.sitesway.sa/apis/libraries/Java), [C#](https://gate.sitesway.sa/apis/libraries/C%23), [Node.js](https://gate.sitesway.sa/apis/libraries/Node.js)

SDKs: [iOS](https://gate.sitesway.sa/apis/sdks/iOS), [Android](https://gate.sitesway.sa/apis/sdks/Android)

***

## Online Purchases

### Prebuilt payment flow — Redirect

Redirect integration allows running payments using the prebuilt payment flow.

To accept payments in your application or website via redirect, use `POST /purchases/` request to create the `Purchase` and receive the `checkout_url`. Redirect the customer to the `checkout_url` to enter their card details for processing. After the payment is processed, the system will redirect the customer back to your website (take note of `success_redirect`, `failure_redirect`).

_You have three options to check payment status:_

1. Use `success_callback` parameter of the `Purchase` object.
2. Use `GET /purchases/<purchase_id>/` request.
3. Set up a Webhook using the Developers section of your account or use Webhook API to listen to `purchase.paid`, or `purchase.payment_failure` event on your server.

Setting the `skip_capture` flag to `true` allows you to separate the authentication and payment execution steps, allowing you to reserve funds on the customer's card account for some time.

This flag can also enable preauthorization capability, allowing you to save the card without a financial transaction, if possible.

If the customer agrees to store his card for future purchases, there will be an option to pay with a single click next time. To enable this, create a `Client` object for each of your clients and provide `client_id` parameter value in your Purchase creation requests.

To create a Purchase or a BillingTemplate, you must specify the `Brand ID` and `API key`. You can find both in the Developers section of your account.

### Custom payment flow — Direct Post

Direct post integration allows running payments through the custom payment flow.

To accept payments in your application or website, use `POST /purchases/` request to create a `Purchase`.

To capture customers card details use an HTML `<form>` hosted on your website with `method="POST"` and `action` pointing to the `direct_post_url` of the transaction.

You will also need to fill the form with `<input>`'s for the fields with card details. As a result, when a customer submits their card details, it will be posted straight to our system, allowing you to customize the checkout as you wish. At the same time, your PCI DSS requirement is only raised to Self-Assessment Questionnaire (SAQ A-EP), as your system doesn't receive or process card data.

For more details, see the documentation on Purchase's `direct_post_url` field.

#### Tokenization & recurring payments

You can store card tokens and charge the respective cards without user interaction if the payment channel supports tokenization.

When you pass `remember_card=on` to `direct_post_url`, the respective `Purchase`'s ID will serve as a card token. This initial `Purchase` will have the `is_recurring_token` field set to `true`.

To charge the tokenized card once again, create a new Purchase and then call the `POST /purchases/{new_purchase_id}/charge/`. In the request body, provide `"recurring_token": "initial_purchase_id"`. When the request succeeds (response code `200`), the new Purchase will become paid. The token will be persisted in the Purchase's recurring\_token field.

Use `"recurring_token": "initial_purchase_id"` in all the upcoming `POST /purchases/{new_purchase_id}/charge/` requests.

If you wish to delete the recurring token stored for the initial `Purchase`, use the `POST /purchases/{initial_purhcase_id}/delete_recurring_token/` request. Its `is_recurring_token` will reset to `false`.

### Custom payment flow — Server-to-Server

Server-to-Server ("S2S") integration allows running payments on the server level without direct interaction between the client’s browser or application and API.

You can build an integration that prevents payers from accessing platform resources directly. In this flow, 3D Secure implementation allows API clients to:

Check 3D Secure enrolment, and if the card is enrolled, receive ACS URL together with all the necessary params for redirection to ACS (PaReq, MD); Redirect the payer to the ACS system of their issuer bank; Receive the payer back and execute the authorization with a separate request.

If the card is not enrolled in 3D Secure, authorization will execute synchronously.

Please note that 3DSv2 which is now the industry standard is fully supported by the S2S flow. While PaReq/PaRes below are 3DSv1 parameters (replaced by creq/cres in 3DSv2 challenge), in case of 3DSv2 proxy ACS solution (where the system is accepting the cardholder navigation using 3DSv1 flow and is performing all parts of 3DSv2 verification and challenge on behalf of merchant) is implemented to maintain API compatibility for older integrations.

To accept payments in your application or website via S2S:

1. Ensure the Purchase is created as described in Custom payment flow — Direct Post. As per the Purchase's direct\_post\_url field description, you will need to ensure all the necessary criteria are met, including success\_redirect/failure\_redirect fields defined for Purchase and set to arbitrary valid URLs (they will not receive any redirects in the S2S scenario);
2.  Implement the following request in your server code, appending "?s2s=true" to direct\_post\_url to form the resulting endpoint (you can obtain the S2S token value from your account manager):

    ```
    POST {direct_post_url}?s2s=true
    ```

    Specify the following headers:

    ```
    Content-Type: application/json
    Authorization: Bearer {S2S token}
    ```

    In the request body, provide the following data in JSON (you can omit some of the fields, then system will use default values; We recommend providing correct values from the user’s browser as it can affect 3D Secure success rate):

    ```
    {
      "cardholder_name": "John Doe",
      "card_number": "4444333322221111",
      "expires": "01/23",
      "cvc": "123",
      "remember_card": "on",
      "remote_ip": "8.8.8.8",
      "user_agent": "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.103 Safari/537.36",
      "accept_header": "text/html",
      "language": "en-US",
      "java_enabled": false,
      "javascript_enabled": true,
      "color_depth": 24,
      "utc_offset": 0,
      "screen_width": 1920,
      "screen_height": 1080
    }
    ```

    | Field name          | Required | Validation criteria/remarks                                                                                  | Default value                                                                                                |
    | ------------------- | -------- | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
    | cardholder\_name    | Y        | Latin letters only (space and apostrophe ('), dot (.), dash (-) symbols are also allowed), max 45 characters |                                                                                                              |
    | card\_number        | Y        | text, digits only, no whitespace, max 19 characters                                                          |                                                                                                              |
    | expires             | Y        | text in 'MM/YY' format, digits and a slash only (/^\d{2}\\/\d{2}$/), max 5 characters                        |                                                                                                              |
    | cvc                 | Y        | numeric string of 3 or 4 digits                                                                              |                                                                                                              |
    | remember\_card      | N        | literal value "on" to save card, any other string otherwise                                                  |                                                                                                              |
    | remote\_ip          | Y        | external IP of payer’s browser in IPv4 or IPv6 format                                                        |                                                                                                              |
    | user\_agent         | N        | User-Agent as sent by the payer’s browser, max 2048 charge                                                   | Mozilla/5.0 (X11; Linux x86\_64) AppleWebKit/ 537.36 (KHTML, like Gecko) Chrome/ 88.0.4324.96 Safari/ 537.36 |
    | accept\_header      | N        | Same as above, max 2048 characters                                                                           | text/html                                                                                                    |
    | language            | N        | Same as above, max 8 characters                                                                              | en-US                                                                                                        |
    | java\_enabled       | N        | boolean                                                                                                      | false                                                                                                        |
    | javascript\_enabled | N        | boolean                                                                                                      | true                                                                                                         |
    | color\_depth        | N        | integer in 0-255 range                                                                                       | 24                                                                                                           |
    | utc\_offset         | N        | integer in -32,768 to 32,767 range                                                                           | 0                                                                                                            |
    | screen\_width       | N        | integer in uint64 range                                                                                      | 1920                                                                                                         |
    | screen\_height      | N        | integer in uint64 range                                                                                      | 1080                                                                                                         |
3.  If the card is not enrolled in 3S Secure, then a response will contain the field "status" with one of the following values: "executed" in case of a successful payment authorization; "authorized" in case fund reservation using Purchase.skip\_capture was requested; "error" in case of an authorization error.

    Example:

    ```
    {"status": "executed"}
    ```

    You will receive "executed" or "authorized" statuses with a response status code 200 and "error" status - with a status code of 400.

    In all of those cases, it is necessary to set up webhooks for purchase events (`purchase.paid, purchase.payment_failure` at least) to receive further information about the status of the financial transaction.
4.  If the card is enrolled in 3D Secure, the response will have a status code of 200, the status will be 3DS\_required, and the response will contain additional fields:

    ```
    {
      "status": "3DS_required",
      "Method": "(POST|GET)",
      "PaReq": "...",
      "MD": "... (can arrive empty)",
      "URL": "http://url.of.acs.bank/",
      "callback_url": "https://..."
    }
    ```

    It’s necessary to ensure your client’s browser makes a request with the method specified in `Method` (GET or POST only) to the ACS of issuer bank returned in "URL", including the values of `MD` and `PaReq` as received (use query params in case of GET and request body params in case of POST). Be aware that MD might arrive empty – in that case, you can send it further as an empty string.

    In addition to those, you also **need to include the `TermUrl` parameter** in the client’s browser request, pointing to the URL in your system where the customer’s navigation will be expected. Once the payer approves the transaction, he will be redirected using the POST method to that URL with `MD` and `PaRes` params in the request body.
5.  Once the client is back to `TermUrl` in your system and you have received the `MD` and `PaRes`, it’s needed to transmit them to the platform to complete the authorization. Send the following request from your server code (no auth headers required):

    ```
    POST {callback_url from step 4.}

    Content-Type: application/x-www-form-urlencoded
    MD={MD received, if any}&PaRes={PaRes received}
    ```

    The response will contain the authorization status in JSON format and will be identical to the format described in the previous section.

### Testing Integration

It’s possible to test-drive all checkouts using a test Purchase.

For a successful payment, you can use the following card numbers:

* 4444 3333 2222 1111 - non-3D Secure card
* 5555 5555 5555 4444 - 3D Secure card

For both cards, please use:

* any cardholder name
* any expiry larger or equal to the current month/year
* CVC = 123

For a failed payment, please change the CVC or expiration date.

When using a 3D Secure enrolled card in S2S checkout, an incorrect CVC will trigger an authorization failure on the S2S callback step (after the customer returns from test ACS). Using a wrong expiry date emulates data validation failure and results in immediate error before that step.

***

## Billing

### Invoicing

To send one-off invoices, use `POST /billing/` request. It's similar to `POST /purchases/` except that customers are an array, allowing you to bulk-issue invoices to several customers at once.

To send invoices using a template, use a separate `POST /billing_templates/` request (without `clients`!). Then, for each of your clients, use `POST /billing_templates/{billing_template_id}/send_invoice/`.

If the customer agrees to store his card for future purchases, then the next time the option to pay with a single click will appear if the payment channel supports tokenization.

***

### Subscriptions

Subscriptions allow you to automate recurring purchases. You can create a subscription using the same request `POST /billing_templates/` as for invoices. To create a subscription billing template, specify `is_subscription: true` and `subscription_*` fields in `POST /billing_templates/` request body. Then, add subscribers using the `POST /billing_templates/<billing_template_id>/add_subscriber/` request.

If the payment channel supports tokenization and the customer agreed to store his datafor future purchases, payments will be processed automatically, while the customer will get a receipt for each purchase. Note that whenever a subscription payment fails, your customer will automatically receive an invoice he can pay (and store a new card for upcoming payments in the process). Your system will also receive the `purchase.subscription_charge_failure` webhook event, if configured.

By default, the system generates invoices and processes subscription payments at the beginning of the billing cycle.

If you want to send an invoice or charge a customer at the end of the billing cycle, just set `subscription_charge_period_end` to `true` in `POST /billing_templates/` request.

The API also provides you with an option to give a trial to your customers before enabling paid subscription period. To do that just set `subscription_trial_periods` in `POST /billing_templates/` request.

***

## Callbacks

Two methods for defining asynchronous callbacks are supported - `Purchase` success callbacks and webhooks.

### Purchase success callbacks

`Purchase` success callbacks are defined by providing a target URL in the `success_callback` field on `Purchase` creation (see [POST /purchases/](https://gate.sitesway.sa/api/#/Purchases/purchases\_create)). The system will generate a callback when:

* a `Purchase` with `skip_capture=false` is successfully paid;
* a `Purchase` with `skip_capture=true` is successfully captured (see [POST /purchases/{id}/capture/](https://gate.sitesway.sa/api/#/Purchases/purchases\_capture));
* a `Purchase` is successfully paid using a recurring token (see [POST /purchases/{id}/charge/](https://gate.sitesway.sa/api/#/Purchases/purchases\_charge));

These callbacks pass a JSON-encoded `Purchase` as their payload. The payload represents a snapshot of the state of the `Purchase` when the event was created. The payload will include an `event_type` field to indicate which specific event (see [Event schema](https://gate.sitesway.sa/api/#model-Event)) triggered the callback.

The payload is signed using a company-wide key pair. You can obtain the public key with `GET /public_key/`. See the `Authentication` section below for more details.

### Webhooks

For creating and modifying webhooks, see the Webhook [CRUD API specification](https://gate.sitesway.sa/api/#operations-tag-Webhooks).

`Webhook` callback payloads are signed using a dedicated key pair. You can obtain the public key from `Webhook.public_key`. See the [Authentication](https://gate.sitesway.sa/api/#callback-auth) section below for more details.

### Delivery protocol

When a callback is not successfully delivered (received by the target server and responded to with a 200 series HTTP response code), the system will make up to 8 additional attempts at exponentially increasing intervals between attempts. No further delivery attempts will be made if the callback is not successfully delivered 36 hours after triggering.

Please note that due to the asynchronous nature of network requests, it is possible for a callback delivery confirmation (HTTP response with a 200 series status code) to not properly arrive from the callback's target server. Therefore it is possible in case of severe network faults for the target server to receive a callback, respond to it with a 200 series HTTP status code and then receive the same callback after an interval.

Callback deliveries are guaranteed to be sequential to events triggered on their source objects. For example, when registering webhooks for both the `purchase.created` and `purchase.paid` events, there will be no `purchase.paid` callbacks for this `Purchase` until all `purchase.created` callbacks for this `Purchase` are successfully delivered.

### Authentication

Payloads are signed using asymmetric A.K.A. public-key cryptography to guarantee the authenticity of delivered callbacks. Each callback delivery request includes an X-Signature header field. This field contains a base64-encoded RSA PKCS#1 v1.5 signature of the SHA256 digest of the request body buffer.

You can obtain the public key for `Webhook` authentication from `Webhook.public_key` of the corresponding `Webhook`.

You can obtain the public key for success callback authentication from [GET /public\_key/](https://gate.sitesway.sa/api/#operations-Public\_Key-public\_key).

Please note the provider is not responsible for any financial losses incurred due to not implementing payload signature verification.

\
\
