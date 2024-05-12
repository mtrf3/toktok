package X;

import android.os.HandlerThread;
import android.os.Message;
import com.ss.android.ugc.aweme.live.alphaplayer.listener.IProgressListener;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;

/* loaded from: classes15.dex */
public final class VXM implements InterfaceC79420VEy {
    public static final C79893VXd LJFF = new C79893VXd();
    public IMediaPlayer<AbsPlayer<AbsPlayer>> LIZ;
    public IProgressListener LIZIZ = LJFF;
    public long LIZJ = 500;
    public HandlerC79419VEx LIZLLL;
    public HandlerThread LJ;

    public final void LIZ() {
        synchronized (VXM.class) {
            HandlerC79419VEx handlerC79419VEx = this.LIZLLL;
            if (handlerC79419VEx != null) {
                handlerC79419VEx.removeCallbacksAndMessages(null);
                this.LIZLLL = null;
            }
        }
    }

    public final void LIZJ() {
        if (this.LIZ == null || this.LIZIZ == LJFF) {
            return;
        }
        LIZ();
        if (this.LJ == null) {
            HandlerThread handlerThread = new HandlerThread("progress - thread");
            this.LJ = handlerThread;
            handlerThread.start();
        }
        synchronized (VXM.class) {
            this.LIZLLL = new HandlerC79419VEx(this, this.LJ.getLooper());
        }
        LIZIZ(this.LIZJ - (this.LIZ.getCurrentPosition() % this.LIZJ));
    }

    public final void LIZLLL() {
        if (this.LIZ == null || this.LIZIZ == LJFF) {
            return;
        }
        LIZ();
    }

    public final void LIZIZ(long j) {
        synchronized (VXM.class) {
            if (this.LIZLLL != null) {
                Message obtain = Message.obtain();
                obtain.what = 0;
                this.LIZLLL.sendMessageDelayed(obtain, j);
            }
        }
    }

    @Override // X.InterfaceC79420VEy
    public final void handleMsg(Message message) {
        if (message.what == 0) {
            if (this.LIZ != null && this.LIZIZ != null) {
                try {
                    this.LIZIZ.onProgress(r1.getCurrentPosition());
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            LIZIZ(this.LIZJ);
        }
    }
}
