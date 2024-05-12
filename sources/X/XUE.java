package X;

import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* loaded from: classes16.dex */
public final class XUE implements I98 {
    public XUQ LIZ;

    @Override // X.I98
    public final void onDestroy() {
        XUQ xuq = this.LIZ;
        if (xuq != null) {
            xuq.onDestroy();
        }
    }

    @Override // X.I98
    public final void pause() {
        XUQ xuq = this.LIZ;
        if (xuq != null) {
            xuq.pause();
        }
    }

    @Override // X.I98
    public final void stop() {
        XUQ xuq = this.LIZ;
        if (xuq != null) {
            ((MusicDownloadPlayHelper) xuq).LJIIIIZZ();
        }
    }

    public final void LIZIZ(I93 i93) {
        this.LIZ = MusicService.LJJLIIIJJI().LJJLIIIIJ(new XUG(i93));
    }

    @Override // X.I98
    public final void LIZ(MusicModel musicModel, boolean z) {
        XUQ xuq = this.LIZ;
        if (xuq != null) {
            ((MusicDownloadPlayHelper) xuq).LIZIZ(11, musicModel, z, false);
        }
    }
}
