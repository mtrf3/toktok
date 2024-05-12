package X;

import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;

/* renamed from: X.PxJ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC66125PxJ implements Runnable {
    public final /* synthetic */ Service LJLIL;
    public final /* synthetic */ Intent LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ String LJLJJL = "onStartCommand";

    public RunnableC66125PxJ(Service service, Intent intent, int i, int i2) {
        this.LJLIL = service;
        this.LJLILLLLZI = intent;
        this.LJLJI = i;
        this.LJLJJI = i2;
    }

    public final void LIZ() {
        Context baseContext;
        int i;
        C66120PxE LIZIZ = new C66115Px9(null, this.LJLIL, new Object[]{this.LJLILLLLZI, Integer.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI)}, 102701, System.currentTimeMillis(), false, false, this.LJLIL.getClass().getName(), null, "Service", this.LJLJJL).LIZIZ();
        if (LIZIZ != null) {
            C66175Py7 c66175Py7 = C66175Py7.LIZJ;
            if (C66175Py7.LIZIZ) {
                synchronized (c66175Py7) {
                    HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
                    o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
                    Application application = heliosEnvImpl.LJIIIIZZ;
                    if (application != null && (baseContext = application.getBaseContext()) != null && C36836Ecy.LIZIZ(baseContext)) {
                        AtomicInteger atomicInteger = C66175Py7.LIZ;
                        if (atomicInteger.get() == -1) {
                            InterfaceC66048Pw4 interfaceC66048Pw4 = C66046Pw2.LIZ;
                            if (interfaceC66048Pw4 != null) {
                                i = interfaceC66048Pw4.LIZIZ();
                            } else {
                                i = -1;
                            }
                            atomicInteger.set(i);
                        }
                        int i2 = atomicInteger.get();
                        if (i2 == -1) {
                            int myPid = Process.myPid();
                            atomicInteger.set(myPid);
                            InterfaceC66048Pw4 interfaceC66048Pw42 = C66046Pw2.LIZ;
                            if (interfaceC66048Pw42 != null) {
                                interfaceC66048Pw42.LIZ(myPid);
                            }
                        } else if (i2 != Process.myPid()) {
                            int myPid2 = Process.myPid();
                            atomicInteger.set(myPid2);
                            InterfaceC66048Pw4 interfaceC66048Pw43 = C66046Pw2.LIZ;
                            if (interfaceC66048Pw43 != null) {
                                interfaceC66048Pw43.LIZ(myPid2);
                            }
                            LifecycleOwner lifecycleOwner = ProcessLifecycleOwner.get();
                            o.LJIIIIZZ(lifecycleOwner, "ProcessLifecycleOwner.get()");
                            Lifecycle lifecycle = lifecycleOwner.getLifecycle();
                            o.LJIIIIZZ(lifecycle, "ProcessLifecycleOwner.get().lifecycle");
                            boolean isAtLeast = lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED);
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("isAppAutoStart isForeground=");
                            LIZ.append(isAtLeast);
                            C66063PwJ.LIZIZ("Helios-Log-Api-Call", X1D.LIZIZ(LIZ));
                            boolean z = !isAtLeast;
                            if (z) {
                                LIZIZ.LLD = 6;
                                LIZIZ.LJLZ = "AppAutoStartException";
                                LIZIZ.LJLL = "BACK_SENSITIVE_CALL";
                                LIZIZ.LJLJLLL = true;
                                C66059PwF.LIZIZ(LIZIZ);
                            }
                        }
                    }
                }
            }
        }
        C66175Py7.LIZIZ = false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
