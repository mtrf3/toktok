package X;

import java.lang.reflect.Method;

/* loaded from: classes15.dex */
public class VPB extends AbstractC79677VOv {
    public final boolean LIZLLL;

    @Override // X.AbstractC79677VOv
    public final Object LIZIZ(VPA vpa) {
        if (vpa.LIZIZ(this.LIZ, this.LIZLLL)) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public VPB(VPD vpd, Method method, boolean z) {
        super(vpd, method);
        this.LIZLLL = z;
    }
}
