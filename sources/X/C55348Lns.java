package X;

import com.ss.android.ugc.aweme.mix.videodetail.MixVideoPlayDetailPageFragmentPanel;

/* renamed from: X.Lns, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55348Lns implements C0C3 {
    public boolean LJLIL;
    public final /* synthetic */ MixVideoPlayDetailPageFragmentPanel LJLILLLLZI;

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public C55348Lns(MixVideoPlayDetailPageFragmentPanel mixVideoPlayDetailPageFragmentPanel) {
        this.LJLILLLLZI = mixVideoPlayDetailPageFragmentPanel;
    }

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
        if (i != 0) {
            if (i != 1) {
                return;
            }
            this.LJLIL = true;
            return;
        }
        this.LJLIL = false;
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        if (this.LJLIL) {
            this.LJLILLLLZI.LLJJJJ = "slide";
        }
    }
}
