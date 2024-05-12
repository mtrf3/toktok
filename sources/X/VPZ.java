package X;

import com.bytedance.ies.xelement.viewpager.viewpager.BaseLynxViewPager;

/* loaded from: classes15.dex */
public final class VPZ implements InterfaceC79857VVt {
    public final /* synthetic */ BaseLynxViewPager LIZ;

    public VPZ(BaseLynxViewPager baseLynxViewPager) {
        this.LIZ = baseLynxViewPager;
    }

    @Override // X.InterfaceC79857VVt
    public final void LIZ(boolean z) {
        VNU vnu;
        VPV vpv;
        if (z && (vnu = this.LIZ.mContext) != null && (vpv = vnu.LJLJJLL) != null) {
            vpv.LJIIJJI = true;
            if (!vpv.LIZLLL.isEmpty()) {
                vpv.LIZIZ(8);
            }
        }
    }
}
