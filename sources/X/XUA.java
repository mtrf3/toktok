package X;

import android.os.CountDownTimer;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* loaded from: classes16.dex */
public final class XUA implements InterfaceC47330Ihq {
    public final /* synthetic */ MusicDownloadPlayHelper LIZ;

    public XUA(MusicDownloadPlayHelper musicDownloadPlayHelper) {
        this.LIZ = musicDownloadPlayHelper;
    }

    @Override // X.InterfaceC47330Ihq
    public final void LIZ(int i, int i2) {
        MusicDownloadPlayHelper musicDownloadPlayHelper = this.LIZ;
        MusicModel musicModel = musicDownloadPlayHelper.LJLLLLLL;
        if (musicModel != null) {
            int i3 = musicDownloadPlayHelper.LJLZ;
            boolean z = musicDownloadPlayHelper.LJZI;
            CountDownTimer countDownTimer = musicDownloadPlayHelper.LJZ;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            if (musicModel.getDuration() != musicModel.getAuditionDuration().intValue()) {
                long realAuditionDuration = musicModel.getRealAuditionDuration();
                if (realAuditionDuration <= 0) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("MusicDownloadPlayHelper: audition_duration is zero, music id: ");
                    LIZ.append(musicModel.getMusicId());
                    C36922EeM.LJ(X1D.LIZIZ(LIZ));
                } else {
                    XUD xud = new XUD(musicDownloadPlayHelper, realAuditionDuration, z, musicModel, i3);
                    musicDownloadPlayHelper.LJZ = xud;
                    xud.start();
                }
            }
        }
        MusicDownloadPlayHelper musicDownloadPlayHelper2 = this.LIZ;
        if (musicDownloadPlayHelper2.LLD) {
            musicDownloadPlayHelper2.LJFF();
        }
        MusicDownloadPlayHelper musicDownloadPlayHelper3 = this.LIZ;
        if (musicDownloadPlayHelper3.LJLLLL && musicDownloadPlayHelper3.LJLJJI != null) {
            musicDownloadPlayHelper3.LJIIIIZZ();
        }
        XUC xuc = this.LIZ.LJLIL;
        if (xuc == null) {
            return;
        }
        if (xuc.LIZLLL() != null && i2 != 0) {
            this.LIZ.LJLIL.LIZLLL().setDuration(i2);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        MusicDownloadPlayHelper musicDownloadPlayHelper4 = this.LIZ;
        musicDownloadPlayHelper4.LJLIL.LLLL(musicDownloadPlayHelper4.LJLLLLLL, elapsedRealtime - musicDownloadPlayHelper4.LL);
        XUP xup = this.LIZ.LJLJJLL;
        if (xup != null) {
            xup.LIZ();
        }
    }
}
