package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class IX7 {
    public String LIZ;
    public String LIZIZ;
    public boolean LIZJ;
    public final HandlerThread LIZLLL;
    public final HandlerC46758IWs LJ;
    public final IXA LJFF;
    public final Handler LJI;
    public IX4 LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public OnUIPlayListener LJIIJ;
    public volatile int LJIIJJI;
    public volatile boolean LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public final boolean LJIILL;
    public final AtomicInteger LJIILLIIL;
    public IVM LJIIZILJ;

    public boolean LIZJ() {
        return this instanceof C47004Ica;
    }

    public String toString() {
        return C16880lQ.LLLZ("PlaySession{this=%s, key=%s, mIsReleasing=%s, mIsReleased=%s}", new Object[]{super.toString(), this.LIZ, Boolean.valueOf(this.LJIIIIZZ), Boolean.valueOf(this.LJIIIZ)});
    }

    public void LIZLLL() {
        this.LJ.sendEmptyMessage(16);
    }

    public void LJII() {
        Message obtainMessage = this.LJ.obtainMessage(17);
        if (1 == IZ8.LJJJI()) {
            obtainMessage.obj = Boolean.TRUE;
        }
        if (1 == IZ8.LJJJ()) {
            LIZIZ(IZ8.LJJIZ().recycleStory);
        } else {
            LIZ(4, obtainMessage);
        }
        LJIIL();
        this.LJ.removeMessages(12);
        obtainMessage.sendToTarget();
    }

    public void LJFF() {
        if (IZ8.LIZ()) {
            IXB.LIZJ(android.util.Log.getStackTraceString(new Throwable()));
        }
        Message obtainMessage = this.LJ.obtainMessage(7);
        if (1 == IZ8.LJJJI()) {
            obtainMessage.obj = Boolean.TRUE;
        }
        if (1 == IZ8.LJJJ()) {
            LIZIZ(IZ8.LJJIZ().releaseStory);
        } else {
            LIZ(3, obtainMessage);
        }
        this.LJFF.LJIJJLI.getAndSet(true);
        this.LJ.removeCallbacksAndMessages(null);
        obtainMessage.sendToTarget();
        this.LJIIIIZZ = true;
    }

    public final void LJI() {
        LJIIL();
        this.LJ.removeMessages(12);
        this.LJ.sendEmptyMessage(17);
    }

    public void LJIIL() {
        if (IZ8.LIZ()) {
            IXB.LIZJ(android.util.Log.getStackTraceString(new Throwable()));
        }
        this.LJ.sendEmptyMessage(6);
    }

    public final void LIZIZ(int i) {
        HandlerThread handlerThread;
        int threadId;
        if (1 != IZ8.LJJJ() || (handlerThread = this.LIZLLL) == null || handlerThread.getLooper() == null || this.LIZLLL.getLooper() == C16880lQ.LLJJJJ() || (threadId = this.LIZLLL.getThreadId()) <= 0) {
            return;
        }
        try {
            Process.setThreadPriority(threadId, i);
        } catch (Exception unused) {
        }
    }

    public void LJ(IX4 ix4) {
        boolean z;
        boolean z2;
        String strategyTokens;
        IX4 ix42 = this.LJII;
        if (ix42 != null && ix42.LJJ && ix4 != null && !ix4.LJJ && TextUtils.equals(ix4.LJIIIZ, ix42.LJIIIZ)) {
            ix4.LJLJLJ = this.LJII.LJLJLJ;
            z = true;
        } else {
            z = false;
        }
        this.LJII = ix4;
        ix4.LJZ = this.LJIILL;
        this.LIZJ = ix4.LLD;
        this.LIZ = ix4.LJIIIZ;
        this.LIZIZ = ix4.LJJIIJ;
        this.LJIIJJI = ix4.LJIILIIL;
        IX4 ix43 = this.LJII;
        this.LJIILIIL = ix43.LJJJLIIL;
        this.LJIILJJIL = ix43.LJJJLL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("prepare: ");
        if (this.LJII == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        LIZ.append(z2);
        LIZ.append("  ");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(" ");
        LIZ.append(this.LJIIIZ);
        X1D.LIZIZ(LIZ);
        IX4 ix44 = this.LJII;
        if (ix44 == null || this.LJIIIIZZ || this.LJIIIZ) {
            return;
        }
        if (!ix44.LJJ || !ix44.LJLLLL) {
            if (1 == IZ8.LJJJ()) {
                LIZIZ(IZ8.LJJIZ().prepareStory);
            } else {
                LIZIZ(0);
            }
        } else if (1 == IZ8.LJJJ()) {
            LIZIZ(IZ8.LJJIZ().preprepareStory);
        } else {
            LIZIZ(10);
        }
        long currentTimeMillis = System.currentTimeMillis();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        IZG izg = this.LJII.LJIJJ;
        if (izg == null) {
            strategyTokens = null;
        } else {
            strategyTokens = izg.getStrategyTokens();
        }
        IVM ivm = this.LJIIZILJ;
        String str = this.LIZ;
        int i = 2;
        if (ivm != null && !TextUtils.isEmpty(str) && elapsedRealtime > 0) {
            ((IVL) ivm).LIZ(2, elapsedRealtime, str);
        }
        this.LJ.removeCallbacks(null);
        IX4 ix45 = this.LJII;
        if (ix45.LJJIJ && !IUH.LIZ(ix45)) {
            if (this.LJII.LJJZZIII) {
                Object value = IZ8.y0.getValue();
                o.LJIIIIZZ(value, "<get-onlyScheduleOnRenderMsg>(...)");
                if (!((Boolean) value).booleanValue()) {
                    OnUIPlayListener onUIPlayListener = this.LJIIJ;
                    if (onUIPlayListener != null) {
                        onUIPlayListener.onPreparePlay(this.LIZ);
                        IPH iph = new IPH(this.LIZ);
                        iph.LIZ(strategyTokens);
                        iph.LJII = this.LJFF.isMute();
                        iph.LIZLLL = currentTimeMillis;
                        iph.LJFF = currentTimeMillis;
                        iph.LJ = elapsedRealtime;
                        if (!z) {
                            i = 3;
                        }
                        iph.LJIIJ = i;
                        iph.LJI = this.LIZJ;
                        IX4 ix46 = this.LJII;
                        iph.LJIILJJIL = ix46.LLIFFJFJJ;
                        iph.LJIIIIZZ = null;
                        iph.LJIIJJI = ix46.LJLJLJ;
                        try {
                            this.LJIIJ.onPreparePlay(this.LIZ, iph);
                        } catch (AbstractMethodError e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            if (this.LJIIJ != null) {
                IPH iph2 = new IPH(this.LIZ);
                iph2.LJII = this.LJFF.isMute();
                iph2.LIZ(strategyTokens);
                this.LJI.post(new IPI(this, iph2, currentTimeMillis, elapsedRealtime, z));
            }
        }
        this.LJ.obtainMessage(1, this.LJII).sendToTarget();
    }

    public final void LJIIIIZZ(OnUIPlayListener onUIPlayListener) {
        this.LJIIJ = onUIPlayListener;
        this.LJFF.LJJII = onUIPlayListener;
    }

    public final void LJIIIZ(IVM ivm) {
        this.LJIIZILJ = ivm;
        IXA ixa = this.LJFF;
        if (ixa != null) {
            ixa.LJJIIZ = ivm;
        }
    }

    public final void LJIIJ(Surface surface) {
        Object value = IZ8.LJLLLLLL.getValue();
        o.LJIIIIZZ(value, "<get-PLAYER_SET_SURFACE_BY_MSG>(...)");
        if (((Boolean) value).booleanValue()) {
            this.LJ.obtainMessage(21, surface).sendToTarget();
        } else {
            this.LJFF.setSurface(surface);
        }
    }

    public final void LIZ(int i, Message message) {
        HandlerThread handlerThread = this.LIZLLL;
        if (handlerThread == null || handlerThread.getLooper() == null || this.LIZLLL.getLooper() == C16880lQ.LLJJJJ()) {
            return;
        }
        int threadId = this.LIZLLL.getThreadId();
        if (!this.LJIILL || threadId <= 0) {
            return;
        }
        Object value = IZ8.LLLLIILL.getValue();
        o.LJIIIIZZ(value, "<get-PLAY_SESSION_THREAD_SHADOW_MODE>(...)");
        if (((Boolean) value).booleanValue()) {
            Process.setThreadPriority(threadId, 10);
        }
        if ((i != 4 && i != 3) || message == null) {
            return;
        }
        message.obj = Boolean.TRUE;
    }

    public final void LJIIJJI(float f, float f2) {
        this.LJ.obtainMessage(9, new Pair(Float.valueOf(f), Float.valueOf(f2))).sendToTarget();
    }

    public IX7(ITZ itz, HandlerThread handlerThread, IX4 ix4, IXI ixi, ITX itx, boolean z) {
        this(itz, handlerThread, ix4, ixi, itx, null, z, -1);
    }

    public IX7(ITZ itz, HandlerThread handlerThread, IX4 ix4, IXI ixi, ITX itx, C47000IcW c47000IcW, boolean z, int i) {
        Looper looper;
        this.LJIIL = true;
        this.LJIILLIIL = new AtomicInteger(0);
        IXA ixa = new IXA(this, itz, i);
        this.LJFF = ixa;
        ixa.LJJIIJZLJL = itx;
        this.LIZLLL = handlerThread;
        this.LJII = ix4;
        this.LJIILL = z;
        this.LIZJ = ix4 != null ? ix4.LLD : false;
        if (ix4 != null) {
            this.LIZ = ix4.LJIIIZ;
            this.LIZIZ = ix4.LJJIIJ;
            this.LJIIJJI = ix4.LJIILIIL;
            this.LJIILIIL = ix4.LJJJLIIL;
            this.LJIILJJIL = ix4.LJJJLL;
        }
        Object value = IZ8.k.getValue();
        o.LJIIIIZZ(value, "<get-enableUseCustomOrderlyHandler>(...)");
        if (((Boolean) value).booleanValue()) {
            this.LJI = IXE.LIZ;
        } else {
            this.LJI = new HandlerC46761IWv(C16880lQ.LLJJJJ());
        }
        if (handlerThread == null) {
            looper = C16880lQ.LLJJJJ();
        } else {
            looper = handlerThread.getLooper();
        }
        if (handlerThread == null && IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PlaySession create play thread null, looper:");
            LIZ.append(looper);
            LIZ.append(", di:");
            LIZ.append(c47000IcW);
            IXB.LIZIZ("PlaySession", X1D.LIZIZ(LIZ));
        }
        if (looper == null && IXB.LIZ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("PlaySession create with looper null, playThread:");
            LIZ2.append(handlerThread);
            LIZ2.append(", di:");
            LIZ2.append(c47000IcW);
            IXB.LIZIZ("PlaySession", X1D.LIZIZ(LIZ2));
        }
        this.LJ = new HandlerC46758IWs(new IXD(this, ixi), looper, ixa);
    }
}
