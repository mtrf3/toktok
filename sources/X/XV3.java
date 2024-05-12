package X;

import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XV3 implements InterfaceC84870XSo {
    public final /* synthetic */ XV5 LIZ;
    public final /* synthetic */ MusicModel LIZIZ;

    @Override // X.InterfaceC84870XSo
    public final void onProgress(int i) {
    }

    @Override // X.InterfaceC84870XSo
    public final void onStart() {
    }

    @Override // X.InterfaceC84870XSo
    public final void onCancel() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ.LJIILLIIL);
        LIZ.append("musicFile download cancel");
        H7B.LIZ(X1D.LIZIZ(LIZ));
        XV5 xv5 = this.LIZ;
        xv5.LJFF(xv5.LIZIZ, false);
    }

    @Override // X.InterfaceC84870XSo
    public final void LIZ(XSX error) {
        o.LJIIIZ(error, "error");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ.LJIILLIIL);
        LIZ.append("musicFile download onFailed, show default WaveBean");
        H7B.LIZ(X1D.LIZIZ(LIZ));
        this.LIZ.LIZJ(this.LIZIZ, "");
        C16880lQ.LLLLIIL(error);
    }

    public XV3(XV5 xv5, MusicModel musicModel) {
        this.LIZ = xv5;
        this.LIZIZ = musicModel;
    }

    @Override // X.InterfaceC84870XSo
    public final void LIZIZ(String musicFile, MusicWaveBean musicWaveBean, Boolean bool) {
        o.LJIIIZ(musicFile, "musicFile");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ.LJIILLIIL);
        LIZ.append("musicFile download  ready:");
        LIZ.append(musicFile);
        H7B.LIZ(X1D.LIZIZ(LIZ));
        this.LIZ.LJIILJJIL = musicFile;
        int musicDuration = (int) MusicService.LJJLIIIJJI().getMusicDuration(this.LIZ.LJIILJJIL);
        Integer shootDuration = this.LIZIZ.getShootDuration();
        if (shootDuration == null || shootDuration.intValue() != 0) {
            Integer shootDuration2 = this.LIZIZ.getShootDuration();
            o.LJIIIIZZ(shootDuration2, "musicModel.shootDuration");
            int intValue = shootDuration2.intValue();
            XV5 xv5 = this.LIZ;
            int i = xv5.LJIILIIL;
            if (intValue <= i && i <= musicDuration) {
                Integer shootDuration3 = this.LIZIZ.getShootDuration();
                o.LJIIIIZZ(shootDuration3, "musicModel.shootDuration");
                xv5.LJIILIIL = shootDuration3.intValue();
            }
        }
        this.LIZ.LIZJ(this.LIZIZ, musicFile);
    }
}
