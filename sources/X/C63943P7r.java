package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import com.ss.android.vesdk.runtime.VERuntime;

/* renamed from: X.P7r, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63943P7r extends PthreadThread {
    public final /* synthetic */ VERuntime LJLIL;

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            EnumC36866EdS enumC36866EdS = EnumC36866EdS.LJLILLLLZI;
            if (!((Boolean) enumC36866EdS.LJLIL.LIZ("sensor_reported", Boolean.FALSE)).booleanValue()) {
                C63867P4t.LJ(this.LJLIL.mContext);
                enumC36866EdS.LJLIL.LIZIZ("sensor_reported", false, Boolean.TRUE);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            if (C39223FaN.LIZ(th)) {
            } else {
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63943P7r(VERuntime vERuntime) {
        super("e/VERuntime$4");
        this.LJLIL = vERuntime;
    }
}
