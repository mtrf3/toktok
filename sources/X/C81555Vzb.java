package X;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.Vzb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81555Vzb implements GHB {
    public final /* synthetic */ C81556Vzc LJLIL;

    @Override // X.GHB
    public final boolean onBackPressed() {
        BottomSheetBehavior<?> behavior;
        C81478VyM c81478VyM = this.LJLIL.LJLLLL;
        if (c81478VyM == null || (behavior = c81478VyM.getBehavior()) == null || !this.LJLIL.LJLLI || behavior.getState() == 5) {
            return false;
        }
        C81556Vzc c81556Vzc = this.LJLIL;
        if (!c81556Vzc.LJLJJL) {
            C78923UyF.LJIILLIIL(c81556Vzc).LLJJL(this);
        }
        this.LJLIL.LLJJ(false);
        return true;
    }

    public C81555Vzb(C81556Vzc c81556Vzc) {
        this.LJLIL = c81556Vzc;
    }
}
