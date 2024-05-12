package X;

/* renamed from: X.Zsk, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public enum EnumC91322Zsk {
    RESSO_YDM,
    RESSO_FAVORITES;

    public static EnumC91322Zsk valueOf(String str) {
        return (EnumC91322Zsk) V0N.LJJJ(EnumC91322Zsk.class, str);
    }

    public final boolean isResso() {
        if (this == RESSO_YDM || this == RESSO_FAVORITES) {
            return true;
        }
        return false;
    }
}
