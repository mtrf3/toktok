package X;

/* renamed from: X.7Hz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C183477Hz {
    public static final C5H3 LIZ = C221108m2.LIZ(EnumC221088m0.NONE, C183337Hl.LJLIL);

    public static C7I0 LIZ(float f, float f2, int i, int i2) {
        if (f >= 0.0f && f <= i * 0.15f) {
            return C7I0.LEFT_HOT_ZONE;
        }
        float f3 = i;
        if (f >= 0.85f * f3 && f <= f3) {
            if (((Boolean) LIZ.getValue()).booleanValue()) {
                float f4 = i2;
                if (0.836f * f4 < f2 && f2 < f4 * 0.924f) {
                    return C7I0.INVALID_ZONE;
                }
            }
            return C7I0.RIGHT_HOT_ZONE;
        }
        return C7I0.INVALID_ZONE;
    }
}
