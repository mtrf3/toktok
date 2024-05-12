package X;

import com.ss.android.ugc.aweme.mix.mixdetail.MixVideosDialog;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;

/* loaded from: classes10.dex */
public final class M82 extends C72300SZc {
    public final /* synthetic */ MixVideosDialog LJLIL;

    @Override // X.C72300SZc
    public final void LJIIIIZZ() {
        C73305Spp c73305Spp = (C73305Spp) this.LJLIL._$_findCachedViewById(R.id.kf_);
        if (c73305Spp == null) {
            return;
        }
        c73305Spp.setVisibility(8);
    }

    public M82(MixVideosDialog mixVideosDialog) {
        this.LJLIL = mixVideosDialog;
    }

    @Override // X.C72300SZc
    public final void LJI(Exception exc) {
        C73305Spp c73305Spp = (C73305Spp) this.LJLIL._$_findCachedViewById(R.id.kf_);
        if (c73305Spp != null) {
            C73306Spq c73306Spq = new C73306Spq();
            C73312Spw.LJIIJ(c73306Spq, new AqS159S0100000_9(this.LJLIL, 1012));
            c73305Spp.setStatus(c73306Spq);
        }
        C73305Spp c73305Spp2 = (C73305Spp) this.LJLIL._$_findCachedViewById(R.id.kf_);
        if (c73305Spp2 == null) {
            return;
        }
        c73305Spp2.setVisibility(0);
    }
}
