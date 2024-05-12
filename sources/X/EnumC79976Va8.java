package X;

/* renamed from: X.Va8, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public enum EnumC79976Va8 {
    Finished("stopped"),
    Playing("playing"),
    Stopped("paused");

    public final String LJLIL;

    public static EnumC79976Va8 valueOf(String str) {
        return (EnumC79976Va8) V0N.LJJJ(EnumC79976Va8.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC79976Va8(String str) {
        this.LJLIL = str;
    }
}
