package X;

import android.app.Application;
import android.hardware.Sensor;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import com.ss.android.ugc.playerkit.injector.InjectedConfigManager;
import com.ss.android.ugc.playerkit.radar.IRadarTransmitter;
import com.ss.android.ugc.playerkit.simapicommon.IAppConfig;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IALog;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IEvent;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* renamed from: X.IcE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46982IcE {
    public static Application LIZ;
    public static final Object LIZIZ = new Object();
    public static volatile ExecutorService LIZJ = null;
    public static final ExecutorService LIZLLL = PThreadExecutorsUtils.newCachedThreadPool(new DefaultThreadFactory("on/SimContext"));
    public static final HandlerC46761IWv LJ = new HandlerC46761IWv(C16880lQ.LLJJJJ());
    public static Sensor LJFF;
    public static Cert LJI;
    public static Cert LJII;

    public static IALog LIZ() {
        return (IALog) InjectedConfigManager.getConfig(IALog.class);
    }

    public static IAppConfig LIZIZ() {
        return (IAppConfig) InjectedConfigManager.getConfig(IAppConfig.class);
    }

    public static IEvent LIZJ() {
        return (IEvent) InjectedConfigManager.getConfig(IEvent.class);
    }

    public static ExecutorService LJFF() {
        if (LIZJ == null) {
            synchronized (LIZIZ) {
                if (LIZJ == null) {
                    Object value = IZ8.f70X.getValue();
                    o.LJIIIIZZ(value, "<get-executorThreadPoolCapacity>(...)");
                    int intValue = ((Number) value).intValue();
                    if (intValue >= 8) {
                        intValue = 8;
                    }
                    if (intValue > 0) {
                        LIZJ = C16880lQ.LLLLZ(intValue);
                    } else {
                        LIZJ = LIZLLL;
                    }
                }
            }
        }
        return LIZJ;
    }

    public static IMonitor LJI() {
        return (IMonitor) InjectedConfigManager.getConfig(IMonitor.class);
    }

    public static IRadarTransmitter LJII() {
        return (IRadarTransmitter) InjectedConfigManager.getConfig(IRadarTransmitter.class);
    }

    public static Application LIZLLL() {
        return LIZ;
    }

    public static Cert LJ(boolean z) {
        if (z) {
            if (LJI == null) {
                LJI = LIZIZ().getLightSensorCert(true);
            }
            return LJI;
        }
        if (LJII == null) {
            LJII = LIZIZ().getLightSensorCert(false);
        }
        return LJII;
    }
}
