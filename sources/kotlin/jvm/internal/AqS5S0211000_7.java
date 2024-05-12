package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C10K;
import X.C37356ElM;
import X.C43933HMb;
import X.C45411Hrz;
import X.C45804HyK;
import X.C76800UCe;
import X.CallableC45401Hrp;
import X.HMY;
import X.InterfaceC88472Yns;
import X.InterfaceC88474Ynu;
import Y.AgS124S0100000_7;
import android.graphics.Bitmap;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;

/* loaded from: classes8.dex */
public class AqS5S0211000_7 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS5S0211000_7 aqS5S0211000_7, Object obj) {
        C43933HMb info = (C43933HMb) obj;
        o.LJIIIZ(info, "info");
        if (aqS5S0211000_7.z2) {
            C45804HyK.LJJLIIIJJI(((HMY) aqS5S0211000_7.l0).LIZ, info.LJLJJL, aqS5S0211000_7.i3, 0, 24);
        }
        ((InterfaceC88474Ynu) aqS5S0211000_7.l1).invoke(info.LJLILLLLZI, Long.valueOf(info.LJLJI), Integer.valueOf(info.LJLJJL), info.LJLJJLL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS5S0211000_7 aqS5S0211000_7, Object obj) {
        C43933HMb info = (C43933HMb) obj;
        o.LJIIIZ(info, "info");
        if (aqS5S0211000_7.z2) {
            C45804HyK.LJJLIIIJJI(((HMY) aqS5S0211000_7.l0).LIZ, info.LJLJJL, aqS5S0211000_7.i3, 0, 24);
        }
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS5S0211000_7.l1;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Integer.valueOf(info.LJLJJL));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS5S0211000_7 aqS5S0211000_7, Object obj) {
        C45411Hrz c45411Hrz = (C45411Hrz) aqS5S0211000_7.l0;
        int i = aqS5S0211000_7.i3;
        boolean z = aqS5S0211000_7.z2;
        CompletionBlock completionBlock = (CompletionBlock) aqS5S0211000_7.l1;
        c45411Hrz.getClass();
        C10K.LIZIZ(new CallableC45401Hrp((Bitmap) obj, i, c45411Hrz, z), C10K.LJI, null).LJ(new AgS124S0100000_7(completionBlock, 33), C10K.LJIIIIZZ, null);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS5S0211000_7(boolean z, HMY hmy, int i, int i2) {
        super(1);
        this.$t = i2;
        this.z2 = z;
        this.l0 = hmy;
        this.i3 = i;
        this.l1 = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS5S0211000_7(C45411Hrz c45411Hrz, int i, boolean z, C37356ElM c37356ElM, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c45411Hrz;
        this.i3 = i;
        this.z2 = z;
        this.l1 = c37356ElM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS5S0211000_7(boolean z, boolean z2, HMY hmy, int i, InterfaceC88474Ynu<? super String, ? super Long, ? super Integer, ? super String, C76800UCe> interfaceC88474Ynu) {
        super(1);
        this.$t = interfaceC88474Ynu;
        this.z2 = z;
        this.l0 = z2;
        this.i3 = hmy;
        this.l1 = i;
    }
}
