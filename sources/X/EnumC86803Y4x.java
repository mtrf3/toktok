package X;

/* renamed from: X.Y4x, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public enum EnumC86803Y4x {
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

    public static EnumC86803Y4x valueOf(String str) {
        return (EnumC86803Y4x) V0N.LJJJ(EnumC86803Y4x.class, str);
    }

    EnumC86803Y4x(String str) {
        this.LJLIL = str;
    }
}
