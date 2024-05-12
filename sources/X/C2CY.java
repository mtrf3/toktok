package X;

import Y.IDRunnableS6S0101000;
import android.os.Handler;

/* renamed from: X.2CY, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C2CY extends C74232TBk implements InterfaceC65784Pro<C0T7> {
    public static final C2CY LJLIL = new C2CY();

    public C2CY() {
        super(0);
    }

    @Override // X.AbstractC74233TBl, X.InterfaceC74234TBm
    public final String getName() {
        return "createMainScheduler";
    }

    @Override // X.AbstractC74233TBl
    public final InterfaceC36731EbH getOwner() {
        return C65352Pkq.LIZIZ(C1MA.class, "kn_common_release");
    }

    @Override // X.AbstractC74233TBl
    public final String getSignature() {
        return "createMainScheduler()Lbytekn/foundation/concurrent/scheduler/Scheduler;";
    }

    @Override // X.InterfaceC65784Pro
    public final C0T7 invoke() {
        return new C0T7() { // from class: X.1ME
            @Override // X.C0T7
            public final C0T6 LIZ() {
                return new C0T6() { // from class: X.1MD
                    public volatile Handler LIZ = new Handler(C16880lQ.LLJJJJ());
                    public final Object LIZIZ = new Object();

                    @Override // X.C0T6
                    public final void LIZ(InterfaceC65784Pro interfaceC65784Pro, long j) {
                        if (this.LIZ != null) {
                            synchronized (this.LIZIZ) {
                                Handler handler = this.LIZ;
                                if (handler != null) {
                                    handler.postDelayed(new IDRunnableS6S0101000(0, interfaceC65784Pro, 22), j);
                                }
                            }
                        }
                    }
                };
            }
        };
    }
}
