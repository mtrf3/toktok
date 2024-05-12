package X;

import com.bytedance.android.livesdk.drawerfeed.LiveDrawerDialogV3;
import com.bytedance.android.livesdk.drawerfeed.tab.DrawerTabsItem;
import com.bytedance.mt.protector.impl.collections.ListProtector;

/* loaded from: classes6.dex */
public final class BOP implements LHW {
    public final /* synthetic */ LiveDrawerDialogV3 LJLIL;

    @Override // X.InterfaceC54357LUz
    public final void LIZ(C78856UxA c78856UxA) {
    }

    @Override // X.InterfaceC54357LUz
    public final void LIZJ(C78856UxA c78856UxA) {
    }

    public BOP(LiveDrawerDialogV3 liveDrawerDialogV3) {
        this.LJLIL = liveDrawerDialogV3;
    }

    @Override // X.InterfaceC54357LUz
    public final void LIZIZ(C78856UxA c78856UxA) {
        int i;
        String str;
        if (this.LJLIL.LJLLLLLL) {
            C08680Vs c08680Vs = C08680Vs.LJIILJJIL;
            c08680Vs.getClass();
            c08680Vs.LJIIJJI = "auto";
            if (c78856UxA != null) {
                i = c78856UxA.LJ;
            } else {
                i = 0;
            }
            BOO boo = this.LJLIL.LJLJL;
            if (boo != null) {
                str = ((DrawerTabsItem) ListProtector.get(boo.LJLJLJ, i)).tabType;
            } else {
                str = null;
            }
            c08680Vs.LJII = str;
        }
    }
}
