package X;

/* renamed from: X.3eT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC89013eT {
    SUCCESS(0),
    CHECK_VIDEO_PERMISSION_FAIL(1),
    FETCH_UPLOAD_CONFIG_FAIL(3),
    UPLOAD_IMAGE_FAIL(4),
    CREATE_REQUEST_FAIL(5);

    public final int LJLIL;

    public static EnumC89013eT valueOf(String str) {
        return (EnumC89013eT) V0N.LJJJ(EnumC89013eT.class, str);
    }

    public final int getStatus() {
        return this.LJLIL;
    }

    EnumC89013eT(int i) {
        this.LJLIL = i;
    }
}
