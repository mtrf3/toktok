package X;

/* renamed from: X.FjM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public enum EnumC39780FjM {
    BLOCKING,
    NOTICE;

    public static EnumC39780FjM valueOf(String str) {
        return (EnumC39780FjM) V0N.LJJJ(EnumC39780FjM.class, str);
    }

    public final boolean isBlocking() {
        if (this == BLOCKING) {
            return true;
        }
        return false;
    }
}
