package X;

import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;

/* loaded from: classes8.dex */
public final class HZB implements WG2 {
    public final /* synthetic */ ShortVideoContext LIZ;
    public final /* synthetic */ InterfaceC73573Su9<AbstractC65743Pr9<AVMusicWaveBean>> LIZIZ;

    @Override // X.WG2
    public final void LIZ(AVMusicWaveBean aVMusicWaveBean) {
        this.LIZ.musicWaveBean = aVMusicWaveBean;
        this.LIZIZ.onNext(AbstractC65743Pr9.fromNullable(aVMusicWaveBean));
        this.LIZIZ.onComplete();
    }

    public HZB(ShortVideoContext shortVideoContext, C73433Srt c73433Srt) {
        this.LIZ = shortVideoContext;
        this.LIZIZ = c73433Srt;
    }
}
