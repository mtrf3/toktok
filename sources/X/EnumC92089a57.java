package X;

/* renamed from: X.a57, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public enum EnumC92089a57 {
    Success("success"),
    Redirect("redirect"),
    NeedOtpVerify("need_otp_verify"),
    Accepted("accepted"),
    Canceled("canceled"),
    Pending("pending"),
    Error("error");

    public final String LJLIL;

    public static EnumC92089a57 valueOf(String str) {
        return (EnumC92089a57) V0N.LJJJ(EnumC92089a57.class, str);
    }

    public final String getDesc() {
        return this.LJLIL;
    }

    EnumC92089a57(String str) {
        this.LJLIL = str;
    }
}
