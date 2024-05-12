package X;

/* loaded from: classes12.dex */
public final class PIJ {
    public static PIF LIZ(String str, PIL pil, PIN pin, boolean z, PIS pis, String str2) {
        int i = PIM.LIZ[pin.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return new PIG(new PIE(str, pil, z, pis, str2));
        }
        return new PIH(new PIE(str, pil, z, pis, str2));
    }
}
