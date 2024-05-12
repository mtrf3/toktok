package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicView;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XZK implements XZU {
    public final /* synthetic */ VerticalMusicView LIZ;

    @Override // X.XZU
    public final boolean LIZ() {
        MusicModel musicModel = this.LIZ.LLJJI;
        if (musicModel != null && musicModel.isSpeechToSong() && this.LIZ.LLIZLLLIL.LJIIL.getMusicStatus() == 12) {
            return true;
        }
        return false;
    }

    @Override // X.XZU
    public final void LIZIZ() {
        int musicStatus = this.LIZ.LLIZLLLIL.LJIIL.getMusicStatus();
        if (musicStatus != 10) {
            if (musicStatus != 12) {
                if (musicStatus != 13) {
                    return;
                }
            } else {
                this.LIZ.LJJJJIZL();
                return;
            }
        }
        VerticalMusicView verticalMusicView = this.LIZ;
        verticalMusicView.LJIIIZ(verticalMusicView.LLJILJILJ, false);
        this.LIZ.LLJJI = null;
    }

    @Override // X.XZU
    public final void LIZJ() {
        MusicModel musicModel = this.LIZ.LLJJI;
        if (musicModel != null && musicModel.isSpeechToSong()) {
            VerticalMusicView verticalMusicView = this.LIZ;
            verticalMusicView.LJIIIZ(verticalMusicView.LLJILJILJ, false);
        }
        this.LIZ.LJJJJI(true);
    }

    @Override // X.XZU
    public final void LIZLLL() {
        this.LIZ.LJJJJI(false);
        VideoPublishEditModel publishEditModel = this.LIZ.LJLILLLLZI.LLLLIL();
        boolean A8 = this.LIZ.LJLILLLLZI.A8();
        o.LJIIIZ(publishEditModel, "publishEditModel");
        C145995oB LIZIZ = C135015Rp.LIZIZ(publishEditModel);
        LIZIZ.LIZ(A8 ? 1 : 0, "is_dubbed");
        FMX.LJIIL("click_speech_to_song", LIZIZ.LIZ);
    }

    public XZK(VerticalMusicView verticalMusicView) {
        this.LIZ = verticalMusicView;
    }
}
