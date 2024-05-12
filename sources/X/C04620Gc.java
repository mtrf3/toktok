package X;

import java.util.Comparator;

/* renamed from: X.0Gc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C04620Gc implements Comparator<C15070iV<String, Float>> {
    @Override // java.util.Comparator
    public final int compare(C15070iV<String, Float> c15070iV, C15070iV<String, Float> c15070iV2) {
        float floatValue = c15070iV.LIZIZ.floatValue();
        float floatValue2 = c15070iV2.LIZIZ.floatValue();
        if (floatValue2 > floatValue) {
            return 1;
        }
        if (floatValue > floatValue2) {
            return -1;
        }
        return 0;
    }
}
