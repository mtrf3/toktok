package com.ss.android.ugc.aweme.choosemusic.utils;

import X.C16880lQ;
import X.C68029Qmv;
import X.C84982XWw;
import X.InterfaceC47330Ihq;
import X.XTL;
import X.XU2;
import X.XU5;
import X.XU6;
import X.XUC;
import X.XUJ;
import X.XUL;
import X.XVF;
import X.XVG;
import android.os.CountDownTimer;
import android.os.Message;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.choosemusic.utils.ChooseMusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* loaded from: classes16.dex */
public class ChooseMusicDownloadPlayHelper extends MusicDownloadPlayHelper {
    public XU5 LLFF;
    public XVG LLFFF;
    public XUL LLFII;
    public C68029Qmv LLFZ;

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper
    public final void LJ() {
        this.LJLJJI.LIZIZ(new InterfaceC47330Ihq() { // from class: X.XU8
            @Override // X.InterfaceC47330Ihq
            public final void LIZ(int i, int i2) {
                ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = ChooseMusicDownloadPlayHelper.this;
                MusicModel musicModel = chooseMusicDownloadPlayHelper.LJLLLLLL;
                if (musicModel != null) {
                    CountDownTimer countDownTimer = chooseMusicDownloadPlayHelper.LJZ;
                    if (countDownTimer != null) {
                        countDownTimer.cancel();
                    }
                    if (musicModel.getDuration() != musicModel.getAuditionDuration().intValue()) {
                        XU7 xu7 = new XU7(chooseMusicDownloadPlayHelper, musicModel.getRealAuditionDuration());
                        chooseMusicDownloadPlayHelper.LJZ = xu7;
                        xu7.start();
                    }
                }
                XVF.LJIIJ(chooseMusicDownloadPlayHelper.LLFFF, chooseMusicDownloadPlayHelper.LJLLLLLL, false);
                String musicId = chooseMusicDownloadPlayHelper.LJLLLLLL.getMusicId();
                if (XVF.LJIIJ == null) {
                    XVF.LJIIJ = new XUK();
                }
                XUK xuk = XVF.LJIIJ;
                xuk.LIZ = musicId;
                xuk.LIZJ = 0L;
                xuk.LIZIZ = System.currentTimeMillis();
                xuk.LIZLLL = i2;
                String musicId2 = chooseMusicDownloadPlayHelper.LJLLLLLL.getMusicId();
                C68029Qmv c68029Qmv = chooseMusicDownloadPlayHelper.LLFZ;
                if (c68029Qmv != null && TextUtils.equals(musicId2, (String) c68029Qmv.LIZIZ)) {
                    long currentTimeMillis = System.currentTimeMillis() - chooseMusicDownloadPlayHelper.LLFZ.LIZ;
                    new H96().LJIIJJI(currentTimeMillis);
                    C198517qh c198517qh = new C198517qh();
                    c198517qh.LIZ.put("duration", Long.valueOf(currentTimeMillis));
                    C09900aA.LJ("time_from_click_music_to_start_play", c198517qh.LJ());
                }
                if (chooseMusicDownloadPlayHelper.LJLLLL && chooseMusicDownloadPlayHelper.LJLJJI != null) {
                    chooseMusicDownloadPlayHelper.LJIIIIZZ();
                }
                XUC xuc = chooseMusicDownloadPlayHelper.LJLIL;
                if (xuc != null && xuc.LIZLLL() != null && i2 != 0) {
                    chooseMusicDownloadPlayHelper.LJLIL.LIZLLL().setDuration(i2);
                }
                XUP xup = chooseMusicDownloadPlayHelper.LJLJJLL;
                if (xup != null) {
                    xup.LIZ();
                }
            }
        });
        this.LJLJJI.LIZJ(new XU6(this));
        this.LJLJJI.LJFF(new XUJ(this));
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper
    public final void LJIIIIZZ() {
        CountDownTimer countDownTimer = this.LJZ;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        if (this.LLFF == null) {
            XU2 xu2 = this.LJLJJI;
            if (xu2 != null) {
                xu2.pause();
                return;
            }
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 2;
        this.LLFF.sendMessage(obtain);
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper, X.XUQ
    public final void onDestroy() {
        super.onDestroy();
        XU5 xu5 = this.LLFF;
        if (xu5 != null) {
            xu5.removeCallbacksAndMessages(null);
            this.LLFF = null;
        }
        XU2 xu2 = this.LJLJJI;
        if (xu2 != null) {
            xu2.LIZJ(null);
            this.LJLJJI.LJFF(null);
            this.LJLJJI.LIZIZ(null);
            this.LJLJJI.release();
        }
        this.LLFII = null;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper, X.XUQ
    public final void pause() {
        LJIIIIZZ();
        MusicModel musicModel = this.LJLLLLLL;
        if (musicModel != null && this.LLFFF != null) {
            XVF.LJ(musicModel.getMusicId());
            XVF.LJIIJJI(this.LJLLLLLL.getMusicId(), this.LLFFF, this.LJLLLLLL);
        }
    }

    public ChooseMusicDownloadPlayHelper(XUC xuc, C84982XWw c84982XWw) {
        super(xuc, "video_shoot_page");
        this.LLFII = c84982XWw;
    }

    public ChooseMusicDownloadPlayHelper(XUC xuc, XUL xul) {
        super(xuc);
        this.LLFII = xul;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper
    public final void LJIIJ(MusicModel musicModel, boolean z, int i) {
        LJIIIZ(musicModel, i, z, 0, -1);
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper
    public final void LJIIIZ(MusicModel musicModel, int i, boolean z, int i2, int i3) {
        UrlModel url;
        if (musicModel.getMusicType() == MusicModel.MusicType.REUSE_AUDIO) {
            url = musicModel.getReuseAudioPlayUrl();
        } else {
            url = musicModel.getUrl();
        }
        if ((url == null || url.getUrlList() == null || url.getUrlList().isEmpty()) && !musicModel.isLocalMusic()) {
            return;
        }
        XTL xtl = new XTL(musicModel, z, i);
        this.LLFZ = new C68029Qmv(musicModel.getMusicId(), System.currentTimeMillis());
        this.LLFF = new XU5(this, C16880lQ.LLJJJJ());
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = xtl;
        this.LLFF.sendMessage(obtain);
    }
}
