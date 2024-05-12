package X;

import android.widget.SeekBar;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.audiomode.fullepisodev2.FullEpisodeDetailFragment;
import com.ss.android.ugc.aweme.audiomode.fullepisodev2.FullEpisodeDetailsViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.XZx, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85061XZx implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ FullEpisodeDetailFragment LJLIL;

    public C85061XZx(FullEpisodeDetailFragment fullEpisodeDetailFragment) {
        this.LJLIL = fullEpisodeDetailFragment;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        FullEpisodeDetailFragment fullEpisodeDetailFragment = this.LJLIL;
        fullEpisodeDetailFragment.LLII = true;
        fullEpisodeDetailFragment.LLIIIJ = false;
        C81312Vvg c81312Vvg = fullEpisodeDetailFragment.LLIFFJFJJ;
        if (c81312Vvg != null) {
            c81312Vvg.removeCallbacks(fullEpisodeDetailFragment.LLIIIILZ);
            C81312Vvg c81312Vvg2 = this.LJLIL.LLIFFJFJJ;
            if (c81312Vvg2 != null) {
                c81312Vvg2.setMode(EnumC81316Vvk.DRAGGING);
                FullEpisodeDetailFragment fullEpisodeDetailFragment2 = this.LJLIL;
                C85062XZy.LIZLLL((int) fullEpisodeDetailFragment2.Hl().getPlayerDuration(), this.LJLIL.Hl().getIsBackGround(), fullEpisodeDetailFragment2.LLIIIZ);
                return;
            }
            o.LJIJI("playerSeekBarView");
            throw null;
        }
        o.LJIJI("playerSeekBarView");
        throw null;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        if (this.LJLIL.LLII && seekBar != null) {
            long progress = seekBar.getProgress();
            FullEpisodeDetailFragment fullEpisodeDetailFragment = this.LJLIL;
            fullEpisodeDetailFragment.Hl().seekPlayerProgress(Long.valueOf(progress));
            XOX playerState = fullEpisodeDetailFragment.Hl().getPlayerState();
            if (playerState.isPauseState()) {
                if (progress >= fullEpisodeDetailFragment.Hl().getPlayerDuration()) {
                    FullEpisodeDetailsViewModel.playPlayer$default(fullEpisodeDetailFragment.Hl(), new C84735XNj("RESUME_FROM_SEEK"), 0, 2, null);
                }
            } else if (playerState.isStopState()) {
                FullEpisodeDetailsViewModel.playPlayer$default(fullEpisodeDetailFragment.Hl(), new C84735XNj("RESUME_FROM_SEEK"), 0, 2, null);
            } else if (playerState.isErrorState()) {
                FullEpisodeDetailsViewModel.playPlayer$default(fullEpisodeDetailFragment.Hl(), new C84735XNj("RESUME_FROM_SEEK"), 0, 2, null);
            }
        }
        FullEpisodeDetailFragment fullEpisodeDetailFragment2 = this.LJLIL;
        fullEpisodeDetailFragment2.LLII = false;
        fullEpisodeDetailFragment2.LLIIIJ = true;
        C81312Vvg c81312Vvg = fullEpisodeDetailFragment2.LLIFFJFJJ;
        if (c81312Vvg != null) {
            c81312Vvg.removeCallbacks(fullEpisodeDetailFragment2.LLIIIILZ);
            FullEpisodeDetailFragment fullEpisodeDetailFragment3 = this.LJLIL;
            C81312Vvg c81312Vvg2 = fullEpisodeDetailFragment3.LLIFFJFJJ;
            if (c81312Vvg2 != null) {
                c81312Vvg2.postDelayed(fullEpisodeDetailFragment3.LLIIIILZ, 0L);
                return;
            } else {
                o.LJIJI("playerSeekBarView");
                throw null;
            }
        }
        o.LJIJI("playerSeekBarView");
        throw null;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        FullEpisodeDetailFragment fullEpisodeDetailFragment = this.LJLIL;
        if (fullEpisodeDetailFragment.LLII) {
            C81312Vvg c81312Vvg = fullEpisodeDetailFragment.LLIFFJFJJ;
            if (c81312Vvg != null) {
                if (c81312Vvg.getHasMove()) {
                    FullEpisodeDetailFragment fullEpisodeDetailFragment2 = this.LJLIL;
                    fullEpisodeDetailFragment2.getClass();
                    int i2 = i / 1000;
                    TuxTextView tuxTextView = fullEpisodeDetailFragment2.LLFII;
                    if (tuxTextView != null) {
                        tuxTextView.setText(C56451MDn.LIZ(i2, fullEpisodeDetailFragment2.LLIIZ));
                        return;
                    } else {
                        o.LJIJI("curPlayTime");
                        throw null;
                    }
                }
                return;
            }
            o.LJIJI("playerSeekBarView");
            throw null;
        }
    }
}
