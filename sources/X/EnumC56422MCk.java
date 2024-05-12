package X;

/* renamed from: X.MCk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC56422MCk {
    DESIGNER_CHOOSE(1),
    AUTO_BIND(2),
    TOP_LIKED(3);

    public final int featureVideoSource;

    public static EnumC56422MCk getCurrentFeatureVideoSource(int i) {
        if (i != 1) {
            if (i != 3) {
                return AUTO_BIND;
            }
            return TOP_LIKED;
        }
        return DESIGNER_CHOOSE;
    }

    public static EnumC56422MCk valueOf(String str) {
        return (EnumC56422MCk) V0N.LJJJ(EnumC56422MCk.class, str);
    }

    EnumC56422MCk(int i) {
        this.featureVideoSource = i;
    }
}
