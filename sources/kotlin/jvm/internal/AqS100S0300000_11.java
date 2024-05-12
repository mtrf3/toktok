package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C64797Pbt;
import X.C65902Pti;
import X.InterfaceC65784Pro;
import X.X1D;

/* loaded from: classes12.dex */
public class AqS100S0300000_11 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS100S0300000_11 aqS100S0300000_11) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("get response error:");
        LIZ.append(((Exception) aqS100S0300000_11.l0).getMessage());
        LIZ.append(", url:");
        LIZ.append(((C65902Pti) aqS100S0300000_11.l2).getUrl());
        LIZ.append(", body:");
        Object obj = aqS100S0300000_11.l1;
        if (obj != null) {
            str = obj.getClass().getName();
        } else {
            str = null;
        }
        LIZ.append(str);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$1(AqS100S0300000_11 aqS100S0300000_11) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("get response error:");
        LIZ.append(((Throwable) aqS100S0300000_11.l0).getMessage());
        LIZ.append(", url:");
        LIZ.append(((C65902Pti) aqS100S0300000_11.l2).getUrl());
        LIZ.append(", body:");
        T t = ((C64797Pbt) aqS100S0300000_11.l1).LIZIZ;
        if (t != 0) {
            str = t.getClass().getName();
        } else {
            str = null;
        }
        LIZ.append(str);
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS100S0300000_11(Exception exc, Object obj, C65902Pti c65902Pti, int i) {
        super(0);
        this.$t = i;
        this.l0 = exc;
        this.l1 = obj;
        this.l2 = c65902Pti;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS100S0300000_11(Throwable th, C64797Pbt c64797Pbt, C65902Pti c65902Pti, int i) {
        super(0);
        this.$t = i;
        this.l0 = th;
        this.l1 = c64797Pbt;
        this.l2 = c65902Pti;
    }
}
