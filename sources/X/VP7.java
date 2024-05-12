package X;

import java.lang.reflect.Method;

/* loaded from: classes15.dex */
public class VP7 extends AbstractC79677VOv {
    public final float LIZLLL;

    @Override // X.AbstractC79677VOv
    public final Object LIZIZ(VPA vpa) {
        return Float.valueOf(vpa.LJ(this.LIZ, this.LIZLLL));
    }

    public VP7(VPD vpd, Method method, float f) {
        super(vpd, method);
        this.LIZLLL = f;
    }

    public VP7(VPE vpe, Method method, int i, float f) {
        super(vpe, method, i);
        this.LIZLLL = f;
    }
}
