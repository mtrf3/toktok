package X;

import com.bytedance.ies.sdk.widgets.ConstraintProperty;

/* loaded from: classes14.dex */
public final /* synthetic */ class UJY extends TBS implements InterfaceC88474Ynu<Integer, Boolean, Boolean, Boolean, C76800UCe> {
    public UJY(UJX ujx) {
        super(4, ujx, UJX.class, "onBottomSectionLayoutChange", "onBottomSectionLayoutChange$liveroomfunction_impl_release(IZZZ)V", 0);
    }

    @Override // X.InterfaceC88474Ynu
    public final C76800UCe invoke(Integer num, Boolean bool, Boolean bool2, Boolean bool3) {
        int intValue = num.intValue();
        boolean booleanValue = bool.booleanValue();
        boolean booleanValue2 = bool2.booleanValue();
        boolean booleanValue3 = bool3.booleanValue();
        UJX ujx = (UJX) this.receiver;
        if (!booleanValue2 || !ujx.LLFF) {
            ujx.LJLLLLLL = intValue;
            ujx.LJZL = booleanValue;
            ConstraintProperty constraintPropertyById = ujx.LJLIL.getConstraintPropertyById(ujx.getId());
            if (constraintPropertyById != null) {
                ujx.LJ(constraintPropertyById);
            }
            UJX.LIZLLL(ujx, false, !booleanValue3, 1);
        }
        return C76800UCe.LIZ;
    }
}
