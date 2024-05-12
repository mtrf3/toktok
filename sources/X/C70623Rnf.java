package X;

import com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.module.header.vh.UsHeaderVH;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Rnf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70623Rnf implements IQB {
    public final /* synthetic */ UsHeaderVH LJLIL;

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
        if (this.LJLIL.M().isMute()) {
            i = R.raw.icon_speaker_x_mark_fill_ltr;
        } else {
            i = R.raw.icon_speaker_2_fill_ltr;
        }
        c70653Ro9.setIconRes(i);
        this.LJLIL._$_findCachedViewById(R.id.n4s).setVisibility(0);
        this.LJLIL.N(8);
        LIZLLL(this.LJLIL.M().isMute());
    }

    @Override // X.IPR
    public final void LJJJJZI() {
        ((C70653Ro9) this.LJLIL._$_findCachedViewById(R.id.n4s)).setIconRes(R.raw.icon_play_fill);
        if (this.LJLIL.L() != 0) {
            this.LJLIL._$_findCachedViewById(R.id.n4s).setVisibility(8);
        }
        this.LJLIL.N(0);
    }

    public C70623Rnf(UsHeaderVH usHeaderVH) {
        this.LJLIL = usHeaderVH;
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
        if (this.LJLIL.L() != 0) {
            this.LJLIL._$_findCachedViewById(R.id.n4s).setVisibility(8);
        }
        this.LJLIL.N(0);
    }

    @Override // X.IPR
    public final void onResumePlay(String str) {
        this.LJLIL._$_findCachedViewById(R.id.n4s).setVisibility(0);
        this.LJLIL.N(8);
        LIZLLL(this.LJLIL.M().isMute());
    }
}
