package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.performance.PerformanceMonitor;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;

/* loaded from: classes16.dex */
public final class XU1 implements IAVInfoService.IGetInfoCallback<Integer> {
    public final /* synthetic */ MusicModel LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ PerformanceMonitor LIZJ;
    public final /* synthetic */ MusicDownloadPlayHelper LIZLLL;

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback
    public final void finish(Integer num) {
        if (num.intValue() == 0) {
            MusicDownloadPlayHelper musicDownloadPlayHelper = this.LIZLLL;
            String localPath = this.LIZ.getLocalPath();
            MusicModel musicModel = this.LIZ;
            musicDownloadPlayHelper.LJIILJJIL(musicModel, localPath, MusicDownloadPlayHelper.LIZLLL(this.LIZIZ, this.LIZLLL.LJLILLLLZI, musicModel.getFromCollectionType(), this.LIZ.getMusicType()));
            if (this.LIZJ != null) {
                AVExternalServiceImpl.LIZ().provideAVPerformance().step(this.LIZJ, "check local music legal success");
                return;
            }
            return;
        }
        Activity LJJIZ = this.LIZLLL.LJLIL.LJJIZ();
        if (LJJIZ == null) {
            return;
        }
        C5S1 c5s1 = new C5S1(LJJIZ);
        c5s1.LIZJ(R.string.hvu);
        c5s1.LJ();
    }

    public XU1(MusicDownloadPlayHelper musicDownloadPlayHelper, MusicModel musicModel, int i, PerformanceMonitor performanceMonitor) {
        this.LIZLLL = musicDownloadPlayHelper;
        this.LIZ = musicModel;
        this.LIZIZ = i;
        this.LIZJ = performanceMonitor;
    }
}
