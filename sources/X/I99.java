package X;

import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I99 implements InterfaceC84897XTp {
    public final /* synthetic */ C46183IAp LIZ;

    @Override // X.InterfaceC84897XTp
    public final void LIZIZ(Integer num, String str) {
    }

    @Override // X.InterfaceC84897XTp
    public final void onProgress(int i) {
    }

    @Override // X.InterfaceC84897XTp
    public final void onStart() {
    }

    public I99(C46183IAp c46183IAp) {
        this.LIZ = c46183IAp;
    }

    @Override // X.InterfaceC84897XTp
    public final void LIZ(String musicFile, MusicWaveBean musicWaveBean) {
        o.LJIIIZ(musicFile, "musicFile");
        C46183IAp c46183IAp = this.LIZ;
        AVMusic aVMusic = c46183IAp.LLFFF;
        c46183IAp.LLJILJILJ().creativeModel.reuseSoundAndEffectModel.setMusicFromDiscoveryPage(true);
        C82632Wbs c82632Wbs = c46183IAp.LJLJLLL;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = C46183IAp.LLI;
        ((I27) c82632Wbs.LIZ(c46183IAp, interfaceC74236TBoArr[6])).onChooseMusicDone(false, "prop_panel_discovery", aVMusic, musicFile);
        ((I27) c46183IAp.LJLJLLL.LIZ(c46183IAp, interfaceC74236TBoArr[6])).handleChooseMusic(C145385nC.LIZ(Boolean.FALSE, "prop_panel_discovery", aVMusic, musicFile, null, 0L, 0L, 112));
        I9T.LJI(aVMusic, false, c46183IAp.LLJILJILJ().creativeModel.musicBuzModel);
        ((I27) c46183IAp.LJLJLLL.LIZ(c46183IAp, interfaceC74236TBoArr[6])).changeCancelMusicBtnVisible(true);
    }
}
