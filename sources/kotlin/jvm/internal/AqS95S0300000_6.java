package kotlin.jvm.internal;

import X.AMI;
import X.AbstractC65781Prl;
import X.C10K;
import X.C16880lQ;
import X.C40453FuD;
import X.C56662Kg;
import X.C76800UCe;
import X.EnumC38900FOm;
import X.FOR;
import X.InterfaceC39061FUr;
import X.InterfaceC40404FtQ;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.OUE;
import Y.ARunnableS42S0100000_6;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* loaded from: classes7.dex */
public class AqS95S0300000_6 extends AbstractC65781Prl implements InterfaceC65784Pro {
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

    public final void invoke$0() {
        if (!C56662Kg.LIZ().LJII("cold_boot_after_sync_user_to_signup_destroy")) {
            C56662Kg.LIZ().LIZJ("cold_boot_after_sync_user_to_signup_destroy", false);
        }
        if (!((List) this.l0).isEmpty()) {
            ((InterfaceC40404FtQ) ListProtector.remove((List) this.l0, 0)).run();
            return;
        }
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) this.l1;
            Bundle bundle = (Bundle) this.l2;
            Object LIZLLL = C40453FuD.LIZIZ(bundle, null).LIZLLL(new OUE(bundle));
            o.LJIIIIZZ(LIZLLL, "runAfterLogin(bundle)");
            interfaceC88472Yns.invoke(LIZLLL);
            return;
        }
        "Need to run on UI Thread".toString();
        throw new IllegalArgumentException("Need to run on UI Thread");
    }

    public static final Object invoke$0(AqS95S0300000_6 aqS95S0300000_6) {
        int i;
        if (AMI.LIZ((Context) aqS95S0300000_6.l0)) {
            if (((InterfaceC39061FUr) aqS95S0300000_6.l1).threadMode() == EnumC38900FOm.MUTIPLE && ((i = Build.VERSION.SDK_INT) < 24 || i > 27)) {
                FOR.LJFF.LIZIZ().execute(new ARunnableS42S0100000_6((Object) aqS95S0300000_6, 142));
            } else {
                FOR.LJFF.LIZ().post(new ARunnableS42S0100000_6((Object) aqS95S0300000_6, 143));
            }
        }
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AqS95S0300000_6 aqS95S0300000_6) {
        aqS95S0300000_6.invoke$0();
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS95S0300000_6(Context context, InterfaceC39061FUr interfaceC39061FUr, AqS69S0201000_6 aqS69S0201000_6, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = interfaceC39061FUr;
        this.l2 = aqS69S0201000_6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS95S0300000_6(List list, List<InterfaceC40404FtQ> list2, InterfaceC88472Yns<? super C10K<Bundle>, C76800UCe> interfaceC88472Yns, Bundle bundle) {
        super(0);
        this.$t = bundle;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = interfaceC88472Yns;
    }
}
