package X;

/* renamed from: X.a2w, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public enum EnumC91954a2w {
    OVO("OVO"),
    Dana("DANA"),
    GoPay("GO_PAY"),
    Momo("MOMO"),
    ZaloPay("ZALOPAY"),
    YooMoney("YOOMONEY"),
    SamsungPay("SAMSUNGPAY"),
    WeChatPay("wechatpay"),
    WeChatPayHK("wechatpayhk"),
    Venmo("VENMO"),
    TrueMoney("TRUEMONEY"),
    TouchAndGo("TOUCHNGO"),
    TossPay("TOSSPAY"),
    ShopeePay("SHOPEEPAY"),
    RazerGold("RAZER_GOLD"),
    LinePay("LINEPAY"),
    PayPal("PAYPAL"),
    Qiwi("QIWI"),
    PayMaya("PAYMAYA"),
    Payoneer("Payoneer"),
    RabbitLinePay("RABBITLINEPAY"),
    Payco("PAYCO"),
    PayCellTiko("PAYCELL"),
    Papara("PAPARA"),
    NaverPay("NAVERPAY"),
    MPayEWallet("MPAY_WALLET"),
    MercadoPago("MERCADO_PAGO"),
    Linkaja("LINKAJA"),
    KakaoPay("KAKAOPAY"),
    GrabPay("GRABPAY"),
    GCash("GCASH"),
    CoinsPH("COINSPH"),
    Boost("BOOST"),
    AliPayHK("ALIPAYHK"),
    AliPay("ALIPAY"),
    WingBank("WING_BANK"),
    KPlus("KBANK");

    public final String LJLIL;

    public static EnumC91954a2w valueOf(String str) {
        return (EnumC91954a2w) V0N.LJJJ(EnumC91954a2w.class, str);
    }

    public final String getPaymentMethod() {
        return this.LJLIL;
    }

    EnumC91954a2w(String str) {
        this.LJLIL = str;
    }
}
