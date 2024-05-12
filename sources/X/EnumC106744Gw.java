package X;

/* renamed from: X.4Gw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC106744Gw {
    SUCCESS(0),
    CLIENT_ERROR(1),
    SERVER_ERROR(2),
    CHECK_CODE_ERROR(3);

    public final int code;

    public static EnumC106744Gw valueOf(String str) {
        return (EnumC106744Gw) V0N.LJJJ(EnumC106744Gw.class, str);
    }

    EnumC106744Gw(int i) {
        this.code = i;
    }
}
