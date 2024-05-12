package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.Io8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47720Io8 extends AbstractC47721Io9 {
    public AbstractC47721Io9 LIZIZ;
    public AbstractC47721Io9 LIZJ;

    @Override // X.AbstractC47721Io9
    public final int LIZIZ() {
        return this.LIZIZ.LIZIZ();
    }

    public C47720Io8(int i) {
        super(i);
        this.LIZIZ = AbstractC47721Io9.LIZ(i);
        this.LIZJ = AbstractC47721Io9.LIZ(1);
    }

    @Override // X.AbstractC47721Io9
    public final void LIZJ(int i) {
        this.LIZIZ.LIZJ(i);
    }

    @Override // X.AbstractC47721Io9
    public final void LJ(int i) {
        try {
            this.LIZIZ.LJ(i);
        } catch (IllegalMonitorStateException e) {
            C16880lQ.LLLLIIL(e);
            try {
                this.LIZJ.LJ(i);
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
            }
        }
    }

    public final void LJFF(int i) {
        if (this.LIZIZ.LIZIZ() != i) {
            this.LIZJ = this.LIZIZ;
            this.LIZIZ = AbstractC47721Io9.LIZ(i);
        }
    }

    @Override // X.AbstractC47721Io9
    public final boolean LIZLLL(long j, TimeUnit timeUnit) {
        return this.LIZIZ.LIZLLL(j, timeUnit);
    }
}
