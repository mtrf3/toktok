package X;

import com.ss.android.ugc.aweme.audiomode.fullepisodev2.FullEpisodeDetailsViewModel;

/* renamed from: X.Xa8, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85072Xa8 implements InterfaceC63764P0u {
    public final /* synthetic */ FullEpisodeDetailsViewModel LJLIL;

    @Override // X.InterfaceC63764P0u
    public final void onAppBackground() {
        this.LJLIL.mediaPlayerController.LIZIZ.LIZIZ().getClass();
        FullEpisodeDetailsViewModel fullEpisodeDetailsViewModel = this.LJLIL;
        if (fullEpisodeDetailsViewModel.isBackground == 1) {
            return;
        }
        fullEpisodeDetailsViewModel.mobPlayTime();
        this.LJLIL.isBackground = 1;
    }

    @Override // X.InterfaceC63764P0u
    public final void onAppForeground() {
        this.LJLIL.mediaPlayerController.LIZIZ.LIZIZ().getClass();
        FullEpisodeDetailsViewModel fullEpisodeDetailsViewModel = this.LJLIL;
        if (fullEpisodeDetailsViewModel.isBackground == 0) {
            return;
        }
        fullEpisodeDetailsViewModel.mobPlayTime();
        this.LJLIL.isBackground = 0;
    }

    public C85072Xa8(FullEpisodeDetailsViewModel fullEpisodeDetailsViewModel) {
        this.LJLIL = fullEpisodeDetailsViewModel;
    }
}
