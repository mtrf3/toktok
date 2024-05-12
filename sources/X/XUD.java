package X;

import android.os.CountDownTimer;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* loaded from: classes16.dex */
public final class XUD extends CountDownTimer {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ MusicModel LIZIZ;
    public final /* synthetic */ int LIZJ;
    public final /* synthetic */ MusicDownloadPlayHelper LIZLLL;

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.LIZLLL.LJLJJI.pause();
        InterfaceC47328Iho interfaceC47328Iho = this.LIZLLL.LLF;
        if (interfaceC47328Iho != null) {
            interfaceC47328Iho.LIZIZ();
        }
        if (this.LIZ) {
            this.LIZLLL.LJIIJ(this.LIZIZ, true, this.LIZJ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XUD(MusicDownloadPlayHelper musicDownloadPlayHelper, long j, boolean z, MusicModel musicModel, int i) {
        super(j, 1000L);
        this.LIZLLL = musicDownloadPlayHelper;
        this.LIZ = z;
        this.LIZIZ = musicModel;
        this.LIZJ = i;
    }
}
