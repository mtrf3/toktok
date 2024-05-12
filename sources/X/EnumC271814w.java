package X;

/* renamed from: X.14w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC271814w {
    Star(1),
    Polygon(2);

    public final int LJLIL;

    public static EnumC271814w forValue(int i) {
        for (EnumC271814w enumC271814w : values()) {
            if (enumC271814w.LJLIL == i) {
                return enumC271814w;
            }
        }
        return null;
    }

    public static EnumC271814w valueOf(String str) {
        return (EnumC271814w) V0N.LJJJ(EnumC271814w.class, str);
    }

    EnumC271814w(int i) {
        this.LJLIL = i;
    }
}
