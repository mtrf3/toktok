package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.CKq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31156CKq {
    public static final /* synthetic */ int LIZ = 0;

    public static final EnumC31155CKp LIZ(boolean z, boolean z2, boolean z3) {
        C31152CKm LIZ2 = C31153CKn.LIZ(z, z2, z3);
        for (EnumC31155CKp enumC31155CKp : EnumC31155CKp.values()) {
            List<C31152CKm> mStatusSets = enumC31155CKp.getMStatusSets();
            if (mStatusSets != null) {
                Iterator<C31152CKm> it = mStatusSets.iterator();
                boolean z4 = false;
                while (it.hasNext()) {
                    if (it.next().LIZ(LIZ2)) {
                        z4 = true;
                    }
                }
                if (z4) {
                    return enumC31155CKp;
                }
            }
        }
        return EnumC31155CKp.TOAST;
    }
}
