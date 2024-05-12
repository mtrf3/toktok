package X;

import com.ss.android.legoimpl.InitAndInflaterTask;

/* loaded from: classes7.dex */
public final class FOP implements FOQ {
    public final void LIZ(Throwable th) {
        if (!C16970lZ.LIZ.LJI) {
            C34281Dcr.LIZ().LJI();
            if (InitAndInflaterTask.LIZLLL()) {
                PEH.LIZLLL(th, "x2c");
                return;
            }
            return;
        }
        throw new IllegalStateException(th);
    }

    public final void LIZJ(final long j, final InterfaceC39061FUr interfaceC39061FUr) {
        final boolean z;
        if (!InitAndInflaterTask.LIZLLL()) {
            return;
        }
        if (C16880lQ.LLJJJJ().getThread() == C16880lQ.LLLLIIIILLL()) {
            z = true;
        } else {
            z = false;
        }
        FMX.LIZIZ().execute(new Runnable() { // from class: X.FV8
            @Override // java.lang.Runnable
            public final void run() {
                long j2 = j;
                InterfaceC39061FUr interfaceC39061FUr2 = interfaceC39061FUr;
                boolean z2 = z;
                C76W c76w = new C76W();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(j2);
                LIZ.append("");
                c76w.LIZ("duration", X1D.LIZIZ(LIZ));
                c76w.LIZ("layout", interfaceC39061FUr2.LJII());
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(z2);
                LIZ2.append("");
                c76w.LIZ("main", X1D.LIZIZ(LIZ2));
                FMX.LJIILJJIL("inflate_preload_report", c76w.LIZIZ());
            }
        });
    }

    public final void LIZIZ(final long j, final InterfaceC39061FUr interfaceC39061FUr, final boolean z) {
        final boolean z2;
        if (!InitAndInflaterTask.LIZLLL()) {
            return;
        }
        if (C16880lQ.LLJJJJ().getThread() == C16880lQ.LLLLIIIILLL()) {
            z2 = true;
        } else {
            z2 = false;
        }
        FMX.LIZIZ().execute(new Runnable() { // from class: X.FV7
            @Override // java.lang.Runnable
            public final void run() {
                long j2 = j;
                InterfaceC39061FUr interfaceC39061FUr2 = interfaceC39061FUr;
                boolean z3 = z;
                boolean z4 = z2;
                C76W c76w = new C76W();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(j2);
                LIZ.append("");
                c76w.LIZ("duration", X1D.LIZIZ(LIZ));
                c76w.LIZ("layout", interfaceC39061FUr2.LJII());
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(z3);
                LIZ2.append("");
                c76w.LIZ("cached", X1D.LIZIZ(LIZ2));
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(z4);
                LIZ3.append("");
                c76w.LIZ("main", X1D.LIZIZ(LIZ3));
                FMX.LJIILJJIL("inflate_getview_report", c76w.LIZIZ());
            }
        });
    }
}
