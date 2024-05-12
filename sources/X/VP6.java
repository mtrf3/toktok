package X;

import java.lang.reflect.Method;

/* loaded from: classes15.dex */
public class VP6 extends AbstractC79677VOv {
    public final double LIZLLL;

    @Override // X.AbstractC79677VOv
    public final Object LIZIZ(VPA vpa) {
        return Double.valueOf(vpa.LIZJ(this.LIZ, this.LIZLLL));
    }

    public VP6(VPD vpd, Method method, double d) {
        super(vpd, method);
        this.LIZLLL = d;
    }

    public VP6(VPE vpe, Method method, int i, double d) {
        super(vpe, method, i);
        this.LIZLLL = d;
    }
}
