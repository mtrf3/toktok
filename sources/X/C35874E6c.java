package X;

import Y.AObserverS74S0100000_6;
import Y.ARunnableS42S0100000_6;
import android.os.Handler;
import android.os.SystemClock;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.journey.step.ComponentDependencies;
import com.ss.android.ugc.aweme.plugin.PluginService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS36S0100100_6;
import kotlin.jvm.internal.o;

/* renamed from: X.E6c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35874E6c extends G0N<C76800UCe, InterfaceC35877E6f> {
    public InterfaceC79713Ax LIZ;
    public AqS36S0100100_6 LIZIZ;
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C35875E6d.INSTANCE);

    @Override // X.G0N, X.InterfaceC40768FzI
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.InterfaceC40768FzI
    public final boolean LJ(ComponentDependencies componentDependencies) {
        return true;
    }

    @Override // X.InterfaceC40768FzI
    public final void LIZIZ(ComponentDependencies dependencies) {
        o.LJIIIZ(dependencies, "dependencies");
        this.LIZIZ = new AqS36S0100100_6(SystemClock.elapsedRealtime(), dependencies, 0);
        this.LIZ = PluginService.createIPluginServicebyMonsterPlugin(false).observeInitialLaunchRequestResultForever(new AObserverS74S0100000_6(this, 10));
        Handler handler = (Handler) this.LIZLLL.getValue();
        ARunnableS42S0100000_6 aRunnableS42S0100000_6 = new ARunnableS42S0100000_6(this, 75);
        long Z1 = 2500 - dependencies.Z1();
        if (Z1 < 0) {
            Z1 = 0;
        }
        handler.postDelayed(aRunnableS42S0100000_6, Z1);
    }

    @Override // X.InterfaceC40768FzI
    public final Object LIZLLL(ComponentDependencies dependencies) {
        o.LJIIIZ(dependencies, "dependencies");
        return C76800UCe.LIZ;
    }

    public final void LJII(String str) {
        if (this.LIZJ.compareAndSet(false, true)) {
            C35878E6g.LIZ = true;
            C35878E6g.LIZIZ = true;
            ((Handler) this.LIZLLL.getValue()).removeCallbacksAndMessages(null);
            InterfaceC79713Ax interfaceC79713Ax = this.LIZ;
            if (interfaceC79713Ax != null) {
                interfaceC79713Ax.onComplete();
            }
            AqS36S0100100_6 aqS36S0100100_6 = this.LIZIZ;
            if (aqS36S0100100_6 != null) {
                aqS36S0100100_6.invoke();
                if (C78857UxB.LJJJIL(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId())) {
                    C35865E5t.LIZIZ();
                    return;
                } else {
                    DeviceRegisterManager.addOnDeviceConfigUpdateListener(new C35876E6e());
                    return;
                }
            }
            o.LJIJI("nextStepRunnableWrapper");
            throw null;
        }
    }
}
