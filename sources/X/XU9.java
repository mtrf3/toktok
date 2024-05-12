package X;

import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.performance.PerformanceMonitor;
import com.ss.android.ugc.aweme.services.performance.IAVPerformance;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import java.util.Objects;

/* loaded from: classes16.dex */
public final class XU9 implements InterfaceC84870XSo {
    public final /* synthetic */ MusicModel LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ MusicDownloadPlayHelper LIZJ;

    @Override // X.InterfaceC84870XSo
    public final void onCancel() {
    }

    @Override // X.InterfaceC84870XSo
    public final void onProgress(int i) {
    }

    @Override // X.InterfaceC84870XSo
    public final void onStart() {
    }

    @Override // X.InterfaceC84870XSo
    public final void LIZ(XSX xsx) {
        this.LIZJ.dismissDialog();
        XUC xuc = this.LIZJ.LJLIL;
        if (xuc == null || !xuc.LJJIIZI() || this.LIZJ.LJLIL.LJJIZ() == null) {
            return;
        }
        this.LIZJ.LJLIL.LJJJJIZL(this.LIZ, xsx);
        MusicDownloadPlayHelper musicDownloadPlayHelper = this.LIZJ;
        musicDownloadPlayHelper.LJI(this.LIZ, musicDownloadPlayHelper.LJLJLLL, "fail");
        MobClick obtain = MobClick.obtain();
        obtain.setEventName("music_download_end");
        obtain.setLabelName("perf_monitor");
        obtain.setExtValueString(this.LIZ.getMusicId());
        C76W c76w = new C76W();
        c76w.LIZ("is_success", String.valueOf(0));
        c76w.LIZ("sdk_type", String.valueOf(MusicService.LJJLIIIJJI().LJIJJLI()));
        obtain.setJsonObject(c76w.LIZIZ());
        FMX.onEvent(obtain);
    }

    public XU9(MusicDownloadPlayHelper musicDownloadPlayHelper, MusicModel musicModel, String str) {
        this.LIZJ = musicDownloadPlayHelper;
        this.LIZ = musicModel;
        this.LIZIZ = str;
    }

    @Override // X.InterfaceC84870XSo
    public final void LIZIZ(String str, MusicWaveBean musicWaveBean, Boolean bool) {
        this.LIZ.setMusicWaveBean(musicWaveBean);
        if (C5IO.LIZIZ(this.LIZ.getMusicId()) != null) {
            IAVPerformance provideAVPerformance = AVExternalServiceImpl.LIZ().provideAVPerformance();
            PerformanceMonitor LIZIZ = C5IO.LIZIZ(this.LIZ.getMusicId());
            Objects.requireNonNull(LIZIZ);
            provideAVPerformance.step(LIZIZ, "music download success");
        }
        this.LIZJ.LJIILJJIL(this.LIZ, str, this.LIZIZ);
        MusicDownloadPlayHelper musicDownloadPlayHelper = this.LIZJ;
        musicDownloadPlayHelper.LJI(this.LIZ, musicDownloadPlayHelper.LJLJLLL, "success");
        MobClick obtain = MobClick.obtain();
        obtain.setEventName("music_download_end");
        obtain.setLabelName("perf_monitor");
        obtain.setExtValueString(this.LIZ.getMusicId());
        C76W c76w = new C76W();
        c76w.LIZ("is_success", String.valueOf(1));
        c76w.LIZ("downloadStrategy", String.valueOf(MusicService.LJJLIIIJJI().LJIJJLI()));
        obtain.setJsonObject(c76w.LIZIZ());
        FMX.onEvent(obtain);
    }
}
