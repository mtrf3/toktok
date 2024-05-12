package X;

import java.util.List;
import v5.n;

/* loaded from: classes8.dex */
public final class HQI extends C42416Gkm {
    public final /* synthetic */ n LIZLLL;
    public final /* synthetic */ C44066HRe LJ;

    @Override // X.AbstractC42414Gkk
    public final boolean LIZ() {
        return this.LJ.LJIJ;
    }

    @Override // X.AbstractC42414Gkk
    public final void LIZLLL(int i) {
        C44066HRe c44066HRe = this.LJ;
        if (c44066HRe.LJIIJJI != null) {
            c44066HRe.LJJ = i;
            c44066HRe.LJII = i;
            if (!C42431Gl1.LIZ()) {
                C38816FLg.LIZJ(this.LJ.LJJIII);
            }
        }
    }

    @Override // X.AbstractC42414Gkk
    public final void LJ(String str, String str2) {
        super.LJ(str, str2);
        if (C78496UrM.LIZ(str2) == 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("WaterMarkComposer download file size == 0: ");
            LIZ.append(this.LJ.LJIILIIL);
            Exception exc = new Exception(X1D.LIZIZ(LIZ));
            C36922EeM.LJFF(exc);
            this.LIZLLL.LIZLLL(exc);
            return;
        }
        this.LJ.LIZLLL = str2;
        this.LIZLLL.LJ(null);
    }

    @Override // X.AbstractC42414Gkk
    public final void LIZJ(Exception exc, Integer num, String str) {
        super.LIZJ(exc, num, str);
        this.LIZLLL.LIZLLL(exc);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HQI(C44066HRe c44066HRe, List list, String str, n nVar) {
        super(list, str);
        this.LJ = c44066HRe;
        this.LIZLLL = nVar;
    }
}
