package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.CKn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31153CKn {
    public static final /* synthetic */ int LIZ = 0;

    public static C31152CKm LIZ(boolean z, boolean z2, boolean z3) {
        EnumC31157CKr enumC31157CKr;
        EnumC31157CKr enumC31157CKr2;
        EnumC31157CKr enumC31157CKr3;
        if (z) {
            enumC31157CKr = EnumC31157CKr.YES;
        } else {
            enumC31157CKr = EnumC31157CKr.NO;
        }
        if (z2) {
            enumC31157CKr2 = EnumC31157CKr.YES;
        } else {
            enumC31157CKr2 = EnumC31157CKr.NO;
        }
        if (z3) {
            enumC31157CKr3 = EnumC31157CKr.YES;
        } else {
            enumC31157CKr3 = EnumC31157CKr.NO;
        }
        EnumC31157CKr enumC31157CKr4 = EnumC31157CKr.WHATEVER;
        return new C31152CKm(enumC31157CKr, enumC31157CKr2, enumC31157CKr4, enumC31157CKr3, enumC31157CKr4);
    }

    public static final EnumC31154CKo LIZIZ(boolean z, boolean z2, boolean z3) {
        C31152CKm LIZ2 = LIZ(z, z2, z3);
        for (EnumC31154CKo enumC31154CKo : EnumC31154CKo.values()) {
            List<C31152CKm> mStatusSets = enumC31154CKo.getMStatusSets();
            if (mStatusSets != null) {
                Iterator<C31152CKm> it = mStatusSets.iterator();
                boolean z4 = false;
                while (it.hasNext()) {
                    if (it.next().LIZ(LIZ2)) {
                        z4 = true;
                    }
                }
                if (z4) {
                    return enumC31154CKo;
                }
            }
        }
        return EnumC31154CKo.GREY;
    }
}
