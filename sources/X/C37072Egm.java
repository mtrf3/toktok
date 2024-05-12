package X;

import Y.ACallableS109S0100000_6;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.Egm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37072Egm implements InterfaceC37074Ego {
    public final C36712Eay LIZ = new C36712Eay();

    @Override // X.InterfaceC37074Ego
    public final C37076Egq LIZ(C32449CoP request) {
        Object LIZ;
        String LIZIZ;
        int i;
        o.LJIIIZ(request, "request");
        C78217Umr second = C32450CoQ.LIZ(request).getSecond();
        boolean z = true;
        if (second.LJI) {
            i = 10001;
            LIZIZ = "url force downgrade";
        } else {
            C36712Eay c36712Eay = this.LIZ;
            long j = second.LJII;
            c36712Eay.getClass();
            if (j > 0) {
                if (System.currentTimeMillis() >= c36712Eay.LIZIZ + c36712Eay.LIZ) {
                    try {
                        Object LIZ2 = C32260ClM.LIZ(InterfaceC32247Cl9.class);
                        o.LJI(LIZ2);
                        LIZ = (Long) ((InterfaceC32247Cl9) LIZ2).LIZ().submit(new ACallableS109S0100000_6(c36712Eay, 13)).get(50L, TimeUnit.MILLISECONDS);
                        C3C5.m7constructorimpl(LIZ);
                    } catch (Throwable th) {
                        LIZ = C141335gf.LIZ(th);
                        C3C5.m7constructorimpl(LIZ);
                    }
                    C3C5.m10exceptionOrNullimpl(LIZ);
                }
                long j2 = c36712Eay.LIZJ;
                if (1 <= j2 && j2 <= j) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("allow min memory = ");
                    long j3 = 1024;
                    LIZ3.append((second.LJII / j3) / j3);
                    LIZ3.append("MB, but current free memory = ");
                    LIZ3.append((this.LIZ.LIZJ / j3) / j3);
                    LIZ3.append("MB");
                    LIZIZ = X1D.LIZIZ(LIZ3);
                    i = 10002;
                }
            }
            if (second.LIZJ == null) {
                i = 10005;
                LIZIZ = "uri in null";
            } else {
                LIZIZ = "";
                i = 0;
                z = false;
            }
        }
        return new C37076Egq(i, LIZIZ, z);
    }
}
