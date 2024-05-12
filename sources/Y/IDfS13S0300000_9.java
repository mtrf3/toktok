package Y;

import X.C57318MeY;
import X.C76800UCe;
import X.InterfaceC64672gJ;
import X.InterfaceC65784Pro;
import X.InterfaceC67352kd;
import X.InterfaceC88472Yns;
import X.MJ0;
import X.XGT;
import X.XGW;
import X.XGX;

/* loaded from: classes10.dex */
public class IDfS13S0300000_9 implements InterfaceC64672gJ {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC64672gJ
    public final Object emit(XGX<C57318MeY> xgx, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        switch (this.$t) {
            case 0:
                return emit$0(this, xgx, interfaceC67352kd);
            case 1:
                return emit$1(this, xgx, interfaceC67352kd);
            default:
                return null;
        }
    }

    public static final Object emit$0(IDfS13S0300000_9 iDfS13S0300000_9, Object obj, InterfaceC67352kd interfaceC67352kd) {
        XGX xgx = (XGX) obj;
        if (xgx instanceof XGW) {
            XGW xgw = (XGW) xgx;
            ((MJ0) iDfS13S0300000_9.l0).LIZIZ(((C57318MeY) xgw.LJ).LIZ);
            ((InterfaceC88472Yns) iDfS13S0300000_9.l1).invoke(((C57318MeY) xgw.LJ).LIZ);
        } else if (xgx instanceof XGT) {
            ((MJ0) iDfS13S0300000_9.l0).LIZIZ(((XGT) xgx).LJFF);
            ((InterfaceC65784Pro) iDfS13S0300000_9.l2).invoke();
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$1(Y.IDfS13S0300000_9 r14, java.lang.Object r15, X.InterfaceC67352kd r16) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDfS13S0300000_9.emit$1(Y.IDfS13S0300000_9, java.lang.Object, X.2kd):java.lang.Object");
    }

    public IDfS13S0300000_9(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
