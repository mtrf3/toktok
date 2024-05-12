package X;

import com.bytedance.helios.api.config.SettingsModel;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.Eq7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37651Eq7 implements InterfaceC66065PwL {
    public static InterfaceC37650Eq6 LIZJ;
    public static final C37651Eq7 LIZLLL = new C37651Eq7();
    public static final ConcurrentLinkedQueue<EKE> LIZ = new ConcurrentLinkedQueue<>();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);

    public static boolean LIZJ() {
        InterfaceC37650Eq6 interfaceC37650Eq6 = LIZJ;
        if (interfaceC37650Eq6 != null && interfaceC37650Eq6.isLoggerReady()) {
            return true;
        }
        return false;
    }

    public static void LIZLLL(C37651Eq7 c37651Eq7) {
        c37651Eq7.getClass();
        if ((!LIZ.isEmpty()) && !LIZIZ.getAndSet(true)) {
            RunnableC37649Eq5 runnableC37649Eq5 = RunnableC37649Eq5.LJLIL;
            HandlerThreadC65936PuG.LIZ();
            HandlerThreadC65936PuG.LJLILLLLZI.post(runnableC37649Eq5);
        }
    }

    @Override // X.InterfaceC66065PwL
    public final void LIZ(Throwable th) {
        HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
        SettingsModel settingsModel = heliosEnvImpl.LJIIJ;
        if (settingsModel == null || !settingsModel.alogEnabled) {
            return;
        }
        if (!LIZJ()) {
            LIZIZ(1, "Helios-Detection-Task", "beginAnchorRunnable", th);
            return;
        }
        LIZLLL(this);
        InterfaceC37650Eq6 interfaceC37650Eq6 = LIZJ;
        if (interfaceC37650Eq6 == null) {
            return;
        }
        interfaceC37650Eq6.d("Helios-Detection-Task", "beginAnchorRunnable", th);
    }

    @Override // X.InterfaceC66065PwL
    public final void e(String str, String message, Throwable th) {
        o.LJIIIZ(message, "message");
        HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
        SettingsModel settingsModel = heliosEnvImpl.LJIIJ;
        if (settingsModel == null || !settingsModel.alogEnabled) {
            return;
        }
        if (!LIZJ()) {
            LIZIZ(4, str, message, th);
            return;
        }
        LIZLLL(this);
        InterfaceC37650Eq6 interfaceC37650Eq6 = LIZJ;
        if (interfaceC37650Eq6 == null) {
            return;
        }
        interfaceC37650Eq6.e(str, message, th);
    }

    @Override // X.InterfaceC66065PwL
    public final void i(String str, String message, Throwable th) {
        o.LJIIIZ(message, "message");
        HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
        SettingsModel settingsModel = heliosEnvImpl.LJIIJ;
        if (settingsModel == null || !settingsModel.alogEnabled) {
            return;
        }
        if (!LIZJ()) {
            LIZIZ(2, str, message, th);
            return;
        }
        LIZLLL(this);
        InterfaceC37650Eq6 interfaceC37650Eq6 = LIZJ;
        if (interfaceC37650Eq6 == null) {
            return;
        }
        interfaceC37650Eq6.i(str, message, th);
    }

    @Override // X.InterfaceC66065PwL
    public final void w(String str, String message, Throwable th) {
        o.LJIIIZ(message, "message");
        HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
        SettingsModel settingsModel = heliosEnvImpl.LJIIJ;
        if (settingsModel == null || !settingsModel.alogEnabled) {
            return;
        }
        if (!LIZJ()) {
            LIZIZ(3, str, message, th);
            return;
        }
        LIZLLL(this);
        InterfaceC37650Eq6 interfaceC37650Eq6 = LIZJ;
        if (interfaceC37650Eq6 == null) {
            return;
        }
        interfaceC37650Eq6.w(str, message, th);
    }

    public static void LIZIZ(int i, String str, String str2, Throwable th) {
        EKE eke = new EKE(str, str2, i, th);
        ConcurrentLinkedQueue<EKE> concurrentLinkedQueue = LIZ;
        if (concurrentLinkedQueue.size() > 1000) {
            concurrentLinkedQueue.poll();
        }
        concurrentLinkedQueue.offer(eke);
    }
}
