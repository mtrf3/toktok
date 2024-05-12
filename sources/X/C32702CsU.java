package X;

import android.os.SystemClock;

/* renamed from: X.CsU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32702CsU extends V1B {
    public long LJLJJL;
    public final /* synthetic */ AbstractC32677Cs5 LJLJJLL;

    @Override // X.V1B, X.InterfaceC75158Tec
    public final void LJ() {
        AbstractC32698CsQ<?> abstractC32698CsQ = this.LJLJJLL.LJLJLJ;
        if (abstractC32698CsQ != null) {
            C32783Ctn.LIZ.LJFF(abstractC32698CsQ.LIZJ());
        }
        this.LJLJJL = SystemClock.elapsedRealtime();
    }

    public C32702CsU(AbstractC32677Cs5 abstractC32677Cs5) {
        this.LJLJJLL = abstractC32677Cs5;
    }

    @Override // X.V1B, X.InterfaceC75158Tec
    public final void LJIILL(Exception exc, String str) {
        long j;
        String str2;
        AbstractC32698CsQ<?> abstractC32698CsQ = this.LJLJJLL.LJLJLJ;
        boolean z = false;
        if (abstractC32698CsQ != null && abstractC32698CsQ.LIZ == 1) {
            z = true;
        }
        long j2 = -1;
        if (z) {
            if (abstractC32698CsQ != null) {
                j = abstractC32698CsQ.LIZJ();
            } else {
                j = -1;
            }
            if (exc == null || (str2 = exc.getMessage()) == null) {
                str2 = "";
            }
            C32454CoU.LJI(j, str, str2);
        }
        try {
            C32683CsB c32683CsB = C32783Ctn.LIZ;
            AbstractC32698CsQ<?> abstractC32698CsQ2 = this.LJLJJLL.LJLJLJ;
            if (abstractC32698CsQ2 != null) {
                j2 = abstractC32698CsQ2.LIZJ();
            }
            c32683CsB.LJ(j2);
        } catch (Exception unused) {
        }
    }

    @Override // X.V1B, X.InterfaceC75158Tec
    public final void LJIILJJIL(int i, int i2, String str) {
        boolean z;
        long j;
        long j2;
        AbstractC32698CsQ<?> abstractC32698CsQ = this.LJLJJLL.LJLJLJ;
        if (abstractC32698CsQ != null && abstractC32698CsQ.LIZ == 1) {
            z = true;
        } else {
            z = false;
        }
        long j3 = -1;
        if (z) {
            if (abstractC32698CsQ != null) {
                j2 = abstractC32698CsQ.LIZJ();
            } else {
                j2 = -1;
            }
            C32454CoU.LJII(j2, str);
        }
        if (C88137YiT.LIZ.LIZ) {
            C32694CsM.LJJIII++;
        }
        C32694CsM.LJJIIJ++;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJLJJL;
        AbstractC32698CsQ<?> abstractC32698CsQ2 = this.LJLJJLL.LJLJLJ;
        if (abstractC32698CsQ2 != null) {
            j = abstractC32698CsQ2.LIZJ();
        } else {
            j = -1;
        }
        if (str == null) {
            str = "";
        }
        CGY.LIZIZ(elapsedRealtime, j, str);
        try {
            C32683CsB c32683CsB = C32783Ctn.LIZ;
            AbstractC32698CsQ<?> abstractC32698CsQ3 = this.LJLJJLL.LJLJLJ;
            if (abstractC32698CsQ3 != null) {
                j3 = abstractC32698CsQ3.LIZJ();
            }
            c32683CsB.LIZLLL(j3);
        } catch (Exception unused) {
        }
    }
}
