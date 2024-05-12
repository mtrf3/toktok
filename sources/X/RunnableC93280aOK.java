package X;

import com.bytedance.pitaya.api.PTYSetupCallback;
import com.bytedance.pitaya.inner.api.bean.SetupInfo;
import com.bytedance.pitaya.inner.impl.CoreDefaultImpl;

/* renamed from: X.aOK, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class RunnableC93280aOK implements Runnable {
    public final /* synthetic */ CoreDefaultImpl LJLIL;
    public final /* synthetic */ SetupInfo LJLILLLLZI;
    public final /* synthetic */ PTYSetupCallback LJLJI;

    public RunnableC93280aOK(CoreDefaultImpl coreDefaultImpl, SetupInfo setupInfo, PTYSetupCallback pTYSetupCallback) {
        this.LJLIL = coreDefaultImpl;
        this.LJLILLLLZI = setupInfo;
        this.LJLJI = pTYSetupCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLIL.asyncSetup(this.LJLILLLLZI, this.LJLJI);
        } finally {
            if (LIZ) {
            }
        }
    }
}
