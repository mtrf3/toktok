package X;

/* renamed from: X.Hkc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC44954Hkc {
    DOWNLOAD_VIDEO(".mp4"),
    DOWNLOAD_IMAGE(".png");

    public final String LJLIL;

    public static EnumC44954Hkc valueOf(String str) {
        return (EnumC44954Hkc) V0N.LJJJ(EnumC44954Hkc.class, str);
    }

    public final String getSuffix() {
        return this.LJLIL;
    }

    EnumC44954Hkc(String str) {
        this.LJLIL = str;
    }
}
