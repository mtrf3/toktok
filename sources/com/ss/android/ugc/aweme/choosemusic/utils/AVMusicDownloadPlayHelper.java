package com.ss.android.ugc.aweme.choosemusic.utils;

import X.C16880lQ;
import X.C221108m2;
import X.C47334Ihu;
import X.C62822Ol8;
import X.C84868XSm;
import X.XTL;
import X.XU2;
import X.XU3;
import X.XUC;
import X.XUF;
import X.XUG;
import android.app.Activity;
import android.content.Context;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.widget.Toast;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class AVMusicDownloadPlayHelper extends MusicDownloadPlayHelper {
    public final XUC LLFF;
    public final C62822Ol8 LLFFF;
    public Handler LLFII;
    public Toast LLFZ;

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper
    public final void LJ() {
        this.LJLJJI.LIZIZ(new XUF(this));
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper
    public final void LJIIIIZZ() {
        CountDownTimer countDownTimer = this.LJZ;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        XU2 xu2 = this.LJLJJI;
        if (xu2 != null) {
            xu2.pause();
        }
        Handler handler = this.LLFII;
        if (handler != null) {
            Message obtain = Message.obtain();
            obtain.what = 2;
            handler.sendMessage(obtain);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper, X.XUQ
    public final void onDestroy() {
        super.onDestroy();
        ((HandlerThread) this.LLFFF.getValue()).quit();
        Handler handler = this.LLFII;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.LJLJJI.LIZJ(null);
        this.LJLJJI.LJFF(null);
        this.LJLJJI.LIZIZ(null);
        this.LJLJJI.release();
    }

    public AVMusicDownloadPlayHelper(XUG xug) {
        super(xug);
        this.LLFF = xug;
        this.LLFFF = C221108m2.LIZIZ(C47334Ihu.LJLIL);
        Activity LJJIZ = xug.LJJIZ();
        o.LJIIIIZZ(LJJIZ, "downloadPlayView.curActivity");
        C84868XSm c84868XSm = new C84868XSm((Context) LJJIZ, "av_record_player_music", true, true, true);
        c84868XSm.LIZ.LJ = 1;
        this.LJLJJL = c84868XSm;
        LJ();
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper
    public final boolean LIZ(MusicModel musicModel, Context context) {
        if (musicModel != null && !musicModel.isLocalMusic() && !musicModel.isPlayUrlValid()) {
            String string = context.getString(R.string.iid);
            o.LJIIIIZZ(string, "context.getString(R.string.music_no_copyright)");
            Toast toast = this.LLFZ;
            if (toast != null) {
                toast.cancel();
            }
            Toast makeText = Toast.makeText(context, string, 0);
            makeText.setGravity(17, 0, 0);
            this.LLFZ = makeText;
            C16880lQ.LLZILL(makeText);
            return false;
        }
        if (musicModel == null || musicModel.getMusicStatus() != 0) {
            return true;
        }
        String message = musicModel.getOfflineDesc();
        o.LJIIIIZZ(message, "message");
        if (message.length() == 0) {
            message = context.getString(R.string.iia);
        }
        o.LJIIIIZZ(message, "message");
        Toast toast2 = this.LLFZ;
        if (toast2 != null) {
            toast2.cancel();
        }
        Toast makeText2 = Toast.makeText(context, message, 0);
        makeText2.setGravity(17, 0, 0);
        this.LLFZ = makeText2;
        C16880lQ.LLZILL(makeText2);
        return false;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper
    public final void LJIIJ(MusicModel musicModel, boolean z, int i) {
        LJIIIZ(musicModel, i, z, 0, -1);
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper
    public final void LJIIIZ(MusicModel musicModel, int i, boolean z, int i2, int i3) {
        if (this.LLFII == null) {
            this.LLFII = new Handler(((HandlerThread) this.LLFFF.getValue()).getLooper(), new XU3(this));
        }
        Handler handler = this.LLFII;
        if (handler != null) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = new XTL(musicModel, z, i);
            handler.sendMessage(obtain);
        }
    }
}
