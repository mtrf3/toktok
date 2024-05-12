package X;

/* renamed from: X.Qlp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public enum EnumC67961Qlp {
    Success(0),
    ParameterError(201),
    LaunchActivityError(202),
    ParseError(1),
    GoogleAPIError(203),
    UserCancel(206);

    public final int LJLIL;

    public static EnumC67961Qlp valueOf(String str) {
        return (EnumC67961Qlp) V0N.LJJJ(EnumC67961Qlp.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC67961Qlp(int i) {
        this.LJLIL = i;
    }
}
