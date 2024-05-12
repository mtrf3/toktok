package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C34K;
import X.C60237NkX;
import X.C60376Nmm;
import X.C76800UCe;
import X.InterfaceC60381Nmr;
import X.InterfaceC88472Yns;
import android.net.Uri;

/* loaded from: classes11.dex */
public class AqS16S0200100_10 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS16S0200100_10 aqS16S0200100_10, Object obj) {
        InterfaceC60381Nmr interfaceC60381Nmr = (InterfaceC60381Nmr) obj;
        if (interfaceC60381Nmr != null) {
            C60376Nmm c60376Nmm = (C60376Nmm) aqS16S0200100_10.l0;
            Uri schema = interfaceC60381Nmr.getSchema();
            long j = aqS16S0200100_10.j2;
            c60376Nmm.getClass();
            C60237NkX.LIZIZ(c60376Nmm.LJLIL, schema, "page", "success", null, System.currentTimeMillis() - j, 162);
            ((C34K) aqS16S0200100_10.l1).element = true;
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS16S0200100_10 aqS16S0200100_10, Object obj) {
        InterfaceC60381Nmr interfaceC60381Nmr = (InterfaceC60381Nmr) obj;
        if (interfaceC60381Nmr != null) {
            C60376Nmm c60376Nmm = (C60376Nmm) aqS16S0200100_10.l0;
            Uri schema = interfaceC60381Nmr.getSchema();
            long j = aqS16S0200100_10.j2;
            c60376Nmm.getClass();
            C60237NkX.LIZIZ(c60376Nmm.LJLIL, schema, "popup", "success", null, System.currentTimeMillis() - j, 162);
            ((C34K) aqS16S0200100_10.l1).element = true;
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS16S0200100_10(C60376Nmm c60376Nmm, long j, C34K c34k, int i) {
        super(1);
        this.$t = i;
        this.l0 = c60376Nmm;
        this.j2 = j;
        this.l1 = c34k;
    }
}
