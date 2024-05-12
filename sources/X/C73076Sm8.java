package X;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.LiveReplayVideoPlayerDialogFragment;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Sm8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73076Sm8 implements KRL {
    public final /* synthetic */ LiveReplayVideoPlayerDialogFragment LJLIL;

    @Override // X.KRL
    public final void LJIILL(String str) {
    }

    @Override // X.KRL
    public final void onBufferedPercent(String str, long j, int i) {
    }

    @Override // X.KRL
    public final void onBuffering(boolean z) {
    }

    @Override // X.KRL
    public final void onPlayProgressChange(float f) {
    }

    @Override // X.KRL
    public final void onPreparePlay(String str) {
    }

    public C73076Sm8(LiveReplayVideoPlayerDialogFragment liveReplayVideoPlayerDialogFragment) {
        this.LJLIL = liveReplayVideoPlayerDialogFragment;
    }

    @Override // X.KRL
    public final void LIZJ(String str) {
        LiveReplayVideoPlayerDialogFragment liveReplayVideoPlayerDialogFragment = this.LJLIL;
        liveReplayVideoPlayerDialogFragment.LJLL = Boolean.TRUE;
        JIT jit = liveReplayVideoPlayerDialogFragment.LJZI;
        if (jit != null) {
            jit.LIZLLL();
        }
        this.LJLIL.Il("show", "1", "other");
    }

    @Override // X.KRL
    public final void onPausePlay(String str) {
        C116454hd c116454hd = this.LJLIL.LJLJJL;
        if (c116454hd == null) {
            return;
        }
        c116454hd.setVisibility(0);
    }

    @Override // X.KRL
    public final void onPlayCompleted(String str) {
        C73051Slj c73051Slj = this.LJLIL.LJLILLLLZI;
        if (c73051Slj != null) {
            c73051Slj.LJII(0.0f, false);
        }
    }

    @Override // X.KRL
    public final void onResumePlay(String str) {
        C116454hd c116454hd = this.LJLIL.LJLJJL;
        if (c116454hd == null) {
            return;
        }
        c116454hd.setVisibility(4);
    }

    @Override // X.KRL
    public final void LJIIIIZZ(float f, int i) {
        ConstraintLayout constraintLayout = this.LJLIL.LJLJJLL;
        if (constraintLayout != null) {
            constraintLayout.setAlpha(f);
        }
        View _$_findCachedViewById = this.LJLIL._$_findCachedViewById(R.id.dxb);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setAlpha(f);
        }
        ConstraintLayout constraintLayout2 = this.LJLIL.LJLJJLL;
        if (constraintLayout2 != null) {
            constraintLayout2.setVisibility(i);
        }
        ImageView imageView = (ImageView) this.LJLIL._$_findCachedViewById(R.id.dxb);
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(i);
    }

    @Override // X.KRL
    public final void LJLIIL(int i, int i2, long j) {
        LiveReplayVideoPlayerDialogFragment liveReplayVideoPlayerDialogFragment = this.LJLIL;
        liveReplayVideoPlayerDialogFragment.LJLL = Boolean.FALSE;
        if (j != liveReplayVideoPlayerDialogFragment.LJLJLLL) {
            liveReplayVideoPlayerDialogFragment.LJLJLLL = j;
            if (j >= liveReplayVideoPlayerDialogFragment.LLFF * 1000) {
                liveReplayVideoPlayerDialogFragment._$_findCachedViewById(R.id.fyi).setAlpha(1.0f);
                this.LJLIL.Il("show", CardStruct.IStatusCode.DEFAULT, null);
            } else {
                liveReplayVideoPlayerDialogFragment.Il("show", "1", "short");
            }
            LiveReplayVideoPlayerDialogFragment liveReplayVideoPlayerDialogFragment2 = this.LJLIL;
            C73051Slj c73051Slj = liveReplayVideoPlayerDialogFragment2.LJLILLLLZI;
            if (c73051Slj != null) {
                c73051Slj.setVideoLength$live_release(liveReplayVideoPlayerDialogFragment2.LJLJLLL);
            }
        }
        if (i > i2) {
            ((ImageView) this.LJLIL._$_findCachedViewById(R.id.fyj)).setVisibility(0);
        } else {
            ((ImageView) this.LJLIL._$_findCachedViewById(R.id.fyj)).setVisibility(8);
        }
    }
}
