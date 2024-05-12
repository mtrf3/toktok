package X;

import Y.IDRunnableS2S0400000_24;
import Y.IDRunnableS30S0200000_24;
import Y.IDRunnableS86S0100000_24;
import android.content.Context;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.CastMonitor;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.Dispatcher;
import com.byted.cast.common.LogDumper;
import com.byted.cast.common.TeaEventTrack;
import com.byted.cast.common.api.IBrowseListener;
import com.byted.cast.common.api.ICastSource;
import com.byted.cast.common.config.Config;
import com.byted.cast.common.config.IInitListener;
import com.byted.cast.common.source.IMessageListener;
import com.byted.cast.common.source.IServerListener;
import com.byted.cast.common.source.ISinkDeviceInfoListener;
import com.byted.cast.common.source.ServiceInfo;
import java.lang.Thread;
import java.util.UUID;
import java.util.concurrent.TimeoutException;

/* renamed from: X.Zep, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90459Zep {
    public final C90801ZkL LIZ;
    public final CastLogger LIZIZ;
    public final CastMonitor LIZJ;
    public final TeaEventTrack LIZLLL;
    public boolean LJ;

    public final C90436ZeS LIZLLL() {
        return this.LIZ.LJJJLIIL;
    }

    public final C90442ZeY LJ() {
        return this.LIZ.LJJJLL;
    }

    public final String LJI() {
        return this.LIZ.getVersion();
    }

    public final void LJIIIZ() {
        this.LIZ.LIZIZ.setLogLevel(0);
    }

    public C90459Zep() {
        String uuid = UUID.randomUUID().toString();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("source_");
        LIZ.append(uuid);
        ContextManager.CastContext castContext = new ContextManager.CastContext(X1D.LIZIZ(LIZ));
        CastLogger logger = ContextManager.getLogger(castContext);
        this.LIZIZ = logger;
        this.LIZJ = ContextManager.getMonitor(castContext);
        TeaEventTrack teaEventTrack = ContextManager.getTeaEventTrack(castContext);
        this.LIZLLL = teaEventTrack;
        teaEventTrack.isSource = Boolean.TRUE;
        Dispatcher.enableCompatibleConfig("source");
        LogDumper.enableCompatibleConfig("source");
        if (!this.LJ) {
            logger.d("ByteCastSource", "initUncaughtTimeoutExceptionHandler");
            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: X.Zem
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    C90459Zep c90459Zep = C90459Zep.this;
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = defaultUncaughtExceptionHandler;
                    c90459Zep.getClass();
                    if (thread.getName().equals("FinalizerWatchdogDaemon") && (th instanceof TimeoutException)) {
                        CastLogger castLogger = c90459Zep.LIZIZ;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("Caught TimeoutException:");
                        LIZ2.append(th);
                        castLogger.w("ByteCastSource", X1D.LIZIZ(LIZ2));
                        return;
                    }
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            });
            this.LJ = true;
        }
        this.LIZ = new C90801ZkL(castContext);
    }

    public final void LIZIZ() {
        Dispatcher.getInstance().runOnByteCastThread(new IDRunnableS86S0100000_24(this, 22));
    }

    public final void LJIILJJIL() {
        Dispatcher.getInstance().runOnByteCastThread(new IDRunnableS86S0100000_24(this, 24));
    }

    public final void LJIILL() {
        Dispatcher.getInstance().runOnByteCastThread(new IDRunnableS86S0100000_24(this, 23));
    }

    public final void LIZ(ServiceInfo serviceInfo) {
        this.LIZ.connect(serviceInfo);
    }

    public final void LIZJ(ServiceInfo serviceInfo) {
        this.LIZ.disConnect(serviceInfo);
    }

    public final void LJFF(ServiceInfo serviceInfo) {
        boolean z;
        C90801ZkL c90801ZkL = this.LIZ;
        c90801ZkL.LIZIZ.i("ByteCastSourceImpl", "getSinkDeviceInfo");
        if (serviceInfo == null) {
            c90801ZkL.LIZIZ.i("ByteCastSourceImpl", "getSinkDeviceInfo serviceInfo is null");
            return;
        }
        c90801ZkL.LIZLLL.trackSourceGetDeviceInfoEvent("start", null);
        if (!serviceInfo.protocols.contains("ChromeCast")) {
            return;
        }
        CastLogger castLogger = c90801ZkL.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getSinkDeviceInfo by chromeCastSource protocol:");
        if (c90801ZkL.LJIIJJI != null) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        castLogger.i("ByteCastSourceImpl", X1D.LIZIZ(LIZ));
        if (c90801ZkL.LJIIJJI == null) {
            return;
        }
        Boolean[] boolArr = {Boolean.FALSE};
        Dispatcher.getInstance().delaySchedule(new IDRunnableS30S0200000_24(boolArr, c90801ZkL, 4), 5);
        c90801ZkL.LJIIJJI.getSinkDeviceInfo(serviceInfo, new C90804ZkO(c90801ZkL, boolArr));
    }

    public final void LJIIIIZZ(IBrowseListener iBrowseListener) {
        this.LIZ.setBrowseResultListener(iBrowseListener);
    }

    public final void LJIIJ(IMessageListener iMessageListener) {
        this.LIZ.setMessageListener(iMessageListener);
    }

    public final void LJIIL(IServerListener iServerListener) {
        C90801ZkL c90801ZkL = this.LIZ;
        c90801ZkL.LJJJJIZL = iServerListener;
        C90436ZeS c90436ZeS = c90801ZkL.LJJJLIIL;
        c90436ZeS.LJIIL = iServerListener;
        ICastSource iCastSource = c90436ZeS.LIZJ;
        if (iCastSource != null) {
            iCastSource.setServerListener(new C90808ZkS(c90436ZeS));
        }
    }

    public final void LJIILIIL(ISinkDeviceInfoListener iSinkDeviceInfoListener) {
        this.LIZ.LJJL = iSinkDeviceInfoListener;
    }

    public final void LJIIJJI(int i, Object... objArr) {
        this.LIZ.setOption(i, objArr);
    }

    public final void LJII(Context context, Config config, IInitListener iInitListener) {
        Dispatcher.getInstance().runOnByteCastThread(new IDRunnableS2S0400000_24(iInitListener, this, context, config, 2));
    }
}
