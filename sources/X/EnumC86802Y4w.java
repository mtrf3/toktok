package X;

/* renamed from: X.Y4w, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public enum EnumC86802Y4w {
    PHONE("phone"),
    PAD("pad"),
    TV("tv"),
    CAR("car"),
    VR("vr"),
    AR("ar"),
    WATCH("watch");

    public final String LJLIL;

    public String getLower() {
        return this.LJLIL;
    }

    public static EnumC86802Y4w valueOf(String str) {
        return (EnumC86802Y4w) V0N.LJJJ(EnumC86802Y4w.class, str);
    }

    EnumC86802Y4w(String str) {
        this.LJLIL = str;
    }
}
