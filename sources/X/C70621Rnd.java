package X;

import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.header.GlobalHeaderVH;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Rnd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70621Rnd implements IQB {
    public final /* synthetic */ GlobalHeaderVH LJLIL;

    @Override // X.IPR
    public final void LIZIZ(int i) {
    }

    @Override // X.IPR
    public final void LIZJ(String str) {
    }

    @Override // X.IPR
    public final void LJIILL(String str) {
    }

    @Override // X.IPR
    public final void LJJJI() {
    }

    @Override // X.IPR
    public final void onBuffering(boolean z) {
    }

    @Override // X.IPR
    public final void onPlayProgressChange(float f) {
    }

    @Override // X.IPR
    public final void LIZ() {
        int i;
        C70653Ro9 c70653Ro9 = (C70653Ro9) this.LJLIL._$_findCachedViewById(R.id.n4s);
        if (this.LJLIL.P().isMute()) {
            i = R.raw.icon_speaker_x_mark_fill_ltr;
        } else {
            i = R.raw.icon_speaker_2_fill_ltr;
        }
        c70653Ro9.setIconRes(i);
        this.LJLIL._$_findCachedViewById(R.id.n4s).setVisibility(0);
        this.LJLIL.T(8);
        LIZLLL(this.LJLIL.P().isMute());
    }

    @Override // X.IPR
    public final void LJJJJZI() {
        ((C70653Ro9) this.LJLIL._$_findCachedViewById(R.id.n4s)).setIconRes(R.raw.icon_play_fill);
        if (this.LJLIL.N() != 0) {
            this.LJLIL._$_findCachedViewById(R.id.n4s).setVisibility(8);
        }
        this.LJLIL.T(0);
    }

    public C70621Rnd(GlobalHeaderVH globalHeaderVH) {
        this.LJLIL = globalHeaderVH;
    }

    @Override // X.IQB
    public final void LIZLLL(boolean z) {
        int i;
        C70653Ro9 c70653Ro9 = (C70653Ro9) this.LJLIL._$_findCachedViewById(R.id.n4s);
        if (z) {
            i = R.raw.icon_speaker_x_mark_fill_ltr;
        } else {
            i = R.raw.icon_speaker_2_fill_ltr;
        }
        c70653Ro9.setIconRes(i);
    }

    @Override // X.IPR
    public final void onPlayCompleted(String str) {
        ((C70653Ro9) this.LJLIL._$_findCachedViewById(R.id.n4s)).setIconRes(R.raw.icon_play_fill);
        if (this.LJLIL.N() != 0) {
            this.LJLIL._$_findCachedViewById(R.id.n4s).setVisibility(8);
        }
        this.LJLIL.T(0);
    }

    @Override // X.IPR
    public final void onResumePlay(String str) {
        this.LJLIL._$_findCachedViewById(R.id.n4s).setVisibility(0);
        this.LJLIL.T(8);
        LIZLLL(this.LJLIL.P().isMute());
    }
}
