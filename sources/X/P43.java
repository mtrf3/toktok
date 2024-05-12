package X;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.vesdk.VEAudioCaptureSettings;
import com.ss.android.vesdk.VEInfo;
import com.ss.android.vesdk.audio.TEAudioRecord;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes12.dex */
public final class P43 implements InterfaceC63842P3u {
    public int LIZ;
    public boolean LIZIZ;
    public final boolean LIZJ;
    public TEAudioRecord LIZLLL;
    public P4E LJ;
    public Handler LJFF;
    public HandlerThread LJI;
    public final ConditionVariable LJII = new ConditionVariable();
    public final AtomicBoolean LJIIIIZZ = new AtomicBoolean(false);
    public int LJIIIZ = 3;
    public int LJIIJ = 3;
    public Cert LJIIJJI = null;
    public final ConcurrentHashMap LJIIL = new ConcurrentHashMap();
    public final Object LJIILIIL = new Object();
    public IC8 LJIILJJIL;

    public final synchronized Handler LIZ() {
        Looper LLJJJJ;
        try {
            HandlerThread handlerThread = this.LJI;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            HandlerThread handlerThread2 = new HandlerThread("TEAudioCaptureProxy");
            this.LJI = handlerThread2;
            handlerThread2.start();
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CreateHandler failed!: ");
            LIZ.append(e.toString());
            P4Q.LIZJ("TEAudioCaptureProxy", X1D.LIZIZ(LIZ));
            if (Looper.myLooper() != null) {
                LLJJJJ = Looper.myLooper();
            } else {
                LLJJJJ = C16880lQ.LLJJJJ();
            }
            return new Handler(LLJJJJ, new P41(this));
        }
        return new Handler(this.LJI.getLooper(), new P41(this));
    }

    public final synchronized void LIZIZ() {
        HandlerThread handlerThread = this.LJI;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.LJI = null;
            this.LJFF = null;
        }
    }

    public P43() {
        boolean LJFF = C65429Pm5.LJFF("ve_enable_background_strategy", false);
        this.LIZJ = LJFF;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("KEY_ENABLE_BACKGROUND_STRATEGY : ");
        LIZ.append(LJFF);
        P4Q.LIZ("TEAudioCaptureProxy", X1D.LIZIZ(LIZ));
    }

    public final void LIZJ(Cert cert) {
        synchronized (this.LJIILIIL) {
            if (this.LIZ == 2) {
                LIZLLL(cert);
            }
            TEAudioRecord tEAudioRecord = this.LIZLLL;
            if (tEAudioRecord != null) {
                tEAudioRecord.release(cert);
                this.LIZLLL = null;
            }
            this.LJIIIIZZ.set(false);
            this.LJII.open();
            this.LIZ = 0;
        }
    }

    public final int LIZLLL(Cert cert) {
        synchronized (this.LJIILIIL) {
            if (this.LIZ != 2) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("mic stop in error state: ");
                LIZ.append(this.LIZ);
                P4Q.LIZJ("TEAudioCaptureProxy", X1D.LIZIZ(LIZ));
                return 0;
            }
            TEAudioRecord tEAudioRecord = this.LIZLLL;
            if (tEAudioRecord == null) {
                P4Q.LIZJ("TEAudioCaptureProxy", "mic stop error, audio record is null");
                return -105;
            }
            int stop = tEAudioRecord.stop(cert);
            this.LJ.LIZ(VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_STOP, stop, null);
            this.LIZ = 1;
            return stop;
        }
    }

    @Override // X.InterfaceC63842P3u
    public final synchronized int init(VEAudioCaptureSettings vEAudioCaptureSettings) {
        if (this.LJFF != null) {
            return 0;
        }
        this.LJFF = LIZ();
        this.LJIIIZ = 3;
        this.LJIIJ = 3;
        LJ(0L, 0, vEAudioCaptureSettings);
        return 0;
    }

    @Override // X.InterfaceC63842P3u
    public final synchronized void release(Cert cert) {
        if (this.LJFF == null) {
            P4Q.LJII("TEAudioCaptureProxy", "release, mHandler is null!");
            return;
        }
        this.LJIIIIZZ.set(true);
        long currentTimeMillis = System.currentTimeMillis();
        this.LJII.close();
        this.LJFF.removeCallbacksAndMessages(null);
        LJ(0L, 3, cert);
        this.LJII.block(2000L);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("mic release cost: ");
        LIZ.append(currentTimeMillis2);
        LIZ.append("ms");
        P4Q.LJFF("TEAudioCaptureProxy", X1D.LIZIZ(LIZ));
        if (currentTimeMillis2 >= 2000) {
            P4Q.LIZJ("TEAudioCaptureProxy", "mic release timeout");
        }
        if (this.LJIIIIZZ.get() && this.LIZLLL != null) {
            LIZJ(cert);
        }
        LIZIZ();
    }

    @Override // X.InterfaceC63842P3u
    public final int start(Cert cert) {
        if (this.LJFF == null) {
            P4Q.LIZJ("TEAudioCaptureProxy", "start, mHandler is null!");
            return -108;
        }
        this.LJIIJJI = cert;
        LJ(0L, 1, cert);
        return 0;
    }

    @Override // X.InterfaceC63842P3u
    public final int stop(Cert cert) {
        if (this.LJFF == null) {
            P4Q.LIZJ("TEAudioCaptureProxy", "stop, mHandler is null!");
            return -108;
        }
        C63868P4u.LJFF(0, "te_record_audio_mic_start_info", this.LJIIL.toString());
        LJ(0L, 2, cert);
        return 0;
    }

    public final synchronized void LJ(long j, int i, Object obj) {
        Handler handler = this.LJFF;
        if (handler == null) {
            P4Q.LJFF("TEAudioCaptureProxy", "send MSG error mHandler is null");
            return;
        }
        if (handler.hasMessages(i)) {
            this.LJFF.removeMessages(i);
        }
        Message obtain = Message.obtain();
        obtain.obj = obj;
        obtain.what = i;
        if (j <= 0) {
            this.LJFF.sendMessage(obtain);
        } else {
            this.LJFF.sendMessageDelayed(obtain, j);
        }
    }
}
