package X;

import ccb.t;

/* renamed from: X.VAf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class RunnableC79297VAf implements Runnable {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final /* synthetic */ t LJLJJL;

    public final void LIZ() {
        long j;
        synchronized (this.LJLJJL.V6) {
            boolean Y0 = this.LJLJJL.Y0(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
            EnumC48169IvN X2 = this.LJLJJL.X();
            EnumC48169IvN enumC48169IvN = EnumC48169IvN.PREPARING;
            if (X2 == enumC48169IvN) {
                VAD vad = this.LJLJJL.LJLJJI;
                if (Y0) {
                    j = System.currentTimeMillis();
                } else {
                    j = -2;
                }
                vad.h5 = j;
            }
            if (!Y0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("call from prepare() -- ");
                LIZ.append(this.LJLJJL.u5);
                X1D.LIZIZ(LIZ);
                C46496IMq.LIZJ();
                this.LJLJJL.u1(EnumC48169IvN.IDLE);
            } else {
                if (this.LJLJJL.X() != enumC48169IvN) {
                    this.LJLJJL.U0();
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("call from prepare() -- ");
                    LIZ2.append(this.LJLJJL.u5);
                    X1D.LIZIZ(LIZ2);
                    C46496IMq.LIZJ();
                }
                this.LJLJJL.u1(EnumC48169IvN.PREPARED);
            }
        }
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

    public RunnableC79297VAf(t tVar, String str, String str2, String str3, String str4) {
        this.LJLJJL = tVar;
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = str4;
    }
}
