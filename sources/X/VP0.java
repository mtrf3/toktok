package X;

import java.lang.reflect.Method;

/* loaded from: classes15.dex */
public class VP0 extends AbstractC79677VOv {
    public final int LIZLLL;

    @Override // X.AbstractC79677VOv
    public final Object LIZIZ(VPA vpa) {
        return Integer.valueOf(vpa.LJFF(this.LIZ, this.LIZLLL));
    }

    public VP0(VPD vpd, Method method, int i) {
        super(vpd, method);
        this.LIZLLL = i;
    }

    public VP0(VPE vpe, Method method, int i, int i2) {
        super(vpe, method, i);
        this.LIZLLL = i2;
    }
}
