package X;

import Y.ACallableS110S0100000_7;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
public final class I2K implements InterfaceC83697Wt3 {
    public final C0R2 LIZ = new C0R2(0);
    public final ConcurrentHashMap<String, I2L> LIZIZ = new ConcurrentHashMap<>();
    public String LIZJ;
    public long LIZLLL;
    public long LJ;

    @Override // X.InterfaceC83697Wt3
    public final void end() {
        this.LJ = System.currentTimeMillis();
        C10K.LIZJ(new ACallableS110S0100000_7(this, 25));
    }

    @Override // X.InterfaceC83697Wt3
    public final void LIZ(String... strArr) {
        long currentTimeMillis = System.currentTimeMillis();
        for (String str : strArr) {
            I2L i2l = this.LIZIZ.get(str);
            if (i2l != null) {
                if (i2l.LIZIZ == 0) {
                    i2l.LIZIZ = currentTimeMillis;
                    i2l.LIZJ = this.LIZ.LIZJ();
                    C1JX.LJIIIIZZ("Finish -> ", str);
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Step ");
                    LIZ.append(str);
                    LIZ.append(" end timestamp already exists");
                    X1D.LIZIZ(LIZ);
                }
                if (C76800UCe.LIZ != null) {
                }
            }
            I2L i2l2 = new I2L();
            i2l2.LIZIZ = currentTimeMillis;
            this.LIZIZ.put(str, i2l2);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Finish callback executed before ");
            LIZ2.append(str);
            LIZ2.append(" start");
            X1D.LIZIZ(LIZ2);
        }
    }

    @Override // X.InterfaceC83697Wt3
    public final void LIZIZ(String... strArr) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.LIZIZ.size() == 0) {
            this.LIZLLL = currentTimeMillis;
        }
        for (String str : strArr) {
            I2L i2l = this.LIZIZ.get(str);
            if (i2l != null) {
                if (i2l.LIZ > 0) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Step ");
                    LIZ.append(str);
                    LIZ.append(" start timestamp already exists");
                    X1D.LIZIZ(LIZ);
                } else if (i2l.LIZIZ > 0) {
                    i2l.LIZ = currentTimeMillis;
                    i2l.LIZJ = this.LIZ.LIZJ();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Start callback executed after ");
                    LIZ2.append(str);
                    LIZ2.append(" finish");
                    X1D.LIZIZ(LIZ2);
                }
            } else {
                I2L i2l2 = new I2L();
                i2l2.LIZ = currentTimeMillis;
                this.LIZIZ.put(str, i2l2);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("Start -> ");
                LIZ3.append(str);
                X1D.LIZIZ(LIZ3);
            }
        }
    }
}
