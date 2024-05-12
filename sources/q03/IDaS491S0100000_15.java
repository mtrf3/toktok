package q03;

import X.C62724OjY;
import X.C84735XNj;
import X.C85062XZy;
import X.C98T;
import X.InterfaceC86642XzS;
import X.XOX;
import android.view.View;
import android.view.animation.Animation;
import com.bytedance.android.livesdk.broadcast.preview.LiveCoverCameraFragment;
import com.ss.android.ugc.aweme.audiomode.fullepisodev2.FullEpisodeDetailFragment;
import com.ss.android.ugc.aweme.audiomode.fullepisodev2.FullEpisodeDetailsViewModel;
import com.ss.android.ugc.aweme.relation.friendlist.cell.FriendUserCell;
import com.zhiliaoapp.musically.R;

/* loaded from: classes16.dex */
public class IDaS491S0100000_15 extends C98T {
    public final int $t;
    public Object l0;

    @Override // X.C98T
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            case 2:
                LIZ$2(this, view);
                return;
            case 3:
                LIZ$3(this, view);
                return;
            case 4:
                LIZ$4(this, view);
                return;
            case 5:
                LIZ$5(this, view);
                return;
            case 6:
                LIZ$6(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDaS491S0100000_15(LiveCoverCameraFragment liveCoverCameraFragment, int i) {
        super(200L);
        this.$t = i;
        this.l0 = liveCoverCameraFragment;
    }

    public static final void LIZ$0(IDaS491S0100000_15 iDaS491S0100000_15, View view) {
        ((InterfaceC86642XzS) iDaS491S0100000_15.l0).LJJZZIII();
    }

    public static final void LIZ$1(IDaS491S0100000_15 iDaS491S0100000_15, View view) {
        if (view != null) {
            FullEpisodeDetailsViewModel Hl = ((FullEpisodeDetailFragment) iDaS491S0100000_15.l0).Hl();
            FullEpisodeDetailFragment fullEpisodeDetailFragment = (FullEpisodeDetailFragment) iDaS491S0100000_15.l0;
            Hl.clickFavorite(fullEpisodeDetailFragment.LLIIIZ, fullEpisodeDetailFragment.requireContext());
        }
    }

    public static final void LIZ$2(IDaS491S0100000_15 iDaS491S0100000_15, View view) {
        if (view != null) {
            ((FullEpisodeDetailFragment) iDaS491S0100000_15.l0).Hl().clickPlayButton();
        }
    }

    public static final void LIZ$3(IDaS491S0100000_15 iDaS491S0100000_15, View view) {
        if (view != null && !((FullEpisodeDetailFragment) iDaS491S0100000_15.l0).Hl().getPlayerState().isStopState()) {
            long playBackTime = ((FullEpisodeDetailFragment) iDaS491S0100000_15.l0).Hl().getPlayBackTime() + 10000;
            ((FullEpisodeDetailFragment) iDaS491S0100000_15.l0).Hl().seekPlayerProgress(Long.valueOf(playBackTime));
            FullEpisodeDetailFragment fullEpisodeDetailFragment = (FullEpisodeDetailFragment) iDaS491S0100000_15.l0;
            fullEpisodeDetailFragment.Kl(fullEpisodeDetailFragment.Hl().getPlayBackTime());
            XOX playerState = ((FullEpisodeDetailFragment) iDaS491S0100000_15.l0).Hl().getPlayerState();
            if (playerState.isPauseState()) {
                if (playBackTime >= ((FullEpisodeDetailFragment) iDaS491S0100000_15.l0).Hl().getPlayerDuration()) {
                    FullEpisodeDetailsViewModel.playPlayer$default(((FullEpisodeDetailFragment) iDaS491S0100000_15.l0).Hl(), new C84735XNj("RESUME_FROM_SEEK"), 0, 2, null);
                }
            } else if (playerState.isStopState()) {
                FullEpisodeDetailsViewModel.playPlayer$default(((FullEpisodeDetailFragment) iDaS491S0100000_15.l0).Hl(), new C84735XNj("RESUME_FROM_SEEK"), 0, 2, null);
            } else if (playerState.isErrorState()) {
                FullEpisodeDetailsViewModel.playPlayer$default(((FullEpisodeDetailFragment) iDaS491S0100000_15.l0).Hl(), new C84735XNj("RESUME_FROM_SEEK"), 0, 2, null);
            }
            FullEpisodeDetailFragment fullEpisodeDetailFragment2 = (FullEpisodeDetailFragment) iDaS491S0100000_15.l0;
            C85062XZy.LIZIZ(fullEpisodeDetailFragment2.Hl().getIsBackGround(), fullEpisodeDetailFragment2.LLIIIZ);
        }
    }

    public static final void LIZ$4(IDaS491S0100000_15 iDaS491S0100000_15, View view) {
        if (view != null) {
            long playBackTime = ((FullEpisodeDetailFragment) iDaS491S0100000_15.l0).Hl().getPlayBackTime() - 10000;
            if (playBackTime <= 0) {
                playBackTime = 0;
            }
            ((FullEpisodeDetailFragment) iDaS491S0100000_15.l0).Hl().seekPlayerProgress(Long.valueOf(playBackTime));
            FullEpisodeDetailFragment fullEpisodeDetailFragment = (FullEpisodeDetailFragment) iDaS491S0100000_15.l0;
            fullEpisodeDetailFragment.Kl(fullEpisodeDetailFragment.Hl().getPlayBackTime());
            XOX playerState = ((FullEpisodeDetailFragment) iDaS491S0100000_15.l0).Hl().getPlayerState();
            if (playerState.isStopState()) {
                FullEpisodeDetailsViewModel.playPlayer$default(((FullEpisodeDetailFragment) iDaS491S0100000_15.l0).Hl(), new C84735XNj("RESUME_FROM_SEEK"), 0, 2, null);
                ((FullEpisodeDetailFragment) iDaS491S0100000_15.l0).Hl().pausePlayer(new C84735XNj("PAUSE_FROM_USER_PAUSE"));
                ((FullEpisodeDetailFragment) iDaS491S0100000_15.l0).Kl(playBackTime);
            } else if (playerState.isErrorState()) {
                FullEpisodeDetailsViewModel.playPlayer$default(((FullEpisodeDetailFragment) iDaS491S0100000_15.l0).Hl(), new C84735XNj("RESUME_FROM_SEEK"), 0, 2, null);
            }
            FullEpisodeDetailFragment fullEpisodeDetailFragment2 = (FullEpisodeDetailFragment) iDaS491S0100000_15.l0;
            C85062XZy.LJ(fullEpisodeDetailFragment2.Hl().getIsBackGround(), fullEpisodeDetailFragment2.LLIIIZ);
        }
    }

    public static final void LIZ$5(IDaS491S0100000_15 iDaS491S0100000_15, View view) {
        if (view == null) {
            return;
        }
        ((FriendUserCell) iDaS491S0100000_15.l0).LJLIL.getValue();
        throw null;
    }

    public static final void LIZ$6(IDaS491S0100000_15 iDaS491S0100000_15, View view) {
        if (view != null) {
            ((LiveCoverCameraFragment) iDaS491S0100000_15.l0)._$_findCachedViewById(R.id.b36).startAnimation((Animation) ((LiveCoverCameraFragment) iDaS491S0100000_15.l0).LJLJLLL.getValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDaS491S0100000_15(FullEpisodeDetailFragment fullEpisodeDetailFragment, int i) {
        super(300L);
        this.$t = i;
        this.l0 = fullEpisodeDetailFragment;
    }

    public IDaS491S0100000_15(InterfaceC86642XzS interfaceC86642XzS, int i) {
        this.$t = i;
        this.l0 = interfaceC86642XzS;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDaS491S0100000_15(FriendUserCell friendUserCell, C62724OjY c62724OjY, int i) {
        super(300L);
        this.$t = i;
        this.l0 = friendUserCell;
    }
}
