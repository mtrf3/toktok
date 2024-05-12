package X;

import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.MainTabStrip;

/* loaded from: classes10.dex */
public final class LOD implements InterfaceC54161LNl {
    public final /* synthetic */ MainTabStrip LIZ;
    public final /* synthetic */ LOP LIZIZ;
    public final /* synthetic */ boolean LIZJ;

    @Override // X.InterfaceC54161LNl
    public final void LJIIJJI() {
        LOF lof = this.LIZ.LJLJJI;
        if (lof != null) {
            lof.setCurrentItem(this.LIZIZ.LIZ, this.LIZJ);
        }
    }

    public LOD(MainTabStrip mainTabStrip, LOP lop, boolean z) {
        this.LIZ = mainTabStrip;
        this.LIZIZ = lop;
        this.LIZJ = z;
    }
}
