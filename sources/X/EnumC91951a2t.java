package X;

/* renamed from: X.a2t, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public enum EnumC91951a2t {
    Visa("pm_pi_ccdc_visa_c_d"),
    MasterCard("pm_pi_ccdc_mastercard_c_d");

    public final String LJLIL;

    public static EnumC91951a2t valueOf(String str) {
        return (EnumC91951a2t) V0N.LJJJ(EnumC91951a2t.class, str);
    }

    public final String getId() {
        return this.LJLIL;
    }

    EnumC91951a2t(String str) {
        this.LJLIL = str;
    }
}
