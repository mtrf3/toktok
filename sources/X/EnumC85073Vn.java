package X;

/* renamed from: X.3Vn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC85073Vn {
    SUCCESS(0),
    NETWORK_NOT_CONNECT(2),
    VIDEO_REQUEST_FAIL(3),
    CHECK_VIDEO_PERMISSION_FAIL(4),
    GET_LOCAL_VIDEO_URL_FAIL(5);

    public final int LJLIL;

    public static EnumC85073Vn valueOf(String str) {
        return (EnumC85073Vn) V0N.LJJJ(EnumC85073Vn.class, str);
    }

    public final int getStatus() {
        return this.LJLIL;
    }

    EnumC85073Vn(int i) {
        this.LJLIL = i;
    }
}
