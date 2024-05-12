package X;

/* renamed from: X.a39, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public enum EnumC91967a39 {
    CCDC("CCDC"),
    EWallet("E_WALLET"),
    CashPin("CASH_PIN"),
    InternetBanking("INTERNET_BANKING"),
    BankTransfer("BANK_TRANSFER"),
    BankAccountProxy("BANK_ACCOUNT_PROXY"),
    Aggregator("AGGREGATOR"),
    DirectDebit("DIRECT_DEBIT");

    public final String LJLIL;

    public static EnumC91967a39 valueOf(String str) {
        return (EnumC91967a39) V0N.LJJJ(EnumC91967a39.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC91967a39(String str) {
        this.LJLIL = str;
    }
}
