package kotlin.jvm.internal;

import X.ARI;
import X.AbstractC65781Prl;
import X.C36466ESw;
import X.C37284EkC;
import X.C76800UCe;
import X.EnumC36113EFh;
import X.InterfaceC88472Yns;
import android.app.Activity;
import com.bytedance.router.SmartRouter;
import com.zhiliaoapp.musically.R;

/* loaded from: classes7.dex */
public class AqS0S0100500_6 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public long j1;
    public long j2;
    public long j3;
    public long j4;
    public long j5;
    public Object l0;

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

    public static final Object invoke$0(AqS0S0100500_6 aqS0S0100500_6, Object it) {
        o.LJIIIZ(it, "it");
        SmartRouter.buildRoute((Activity) aqS0S0100500_6.l0, "//setting/diskmanager").open();
        C37284EkC.LIZ = false;
        C37284EkC.LIZJ(EnumC36113EFh.CLEAN_STORAGE_WITH_LOADING, aqS0S0100500_6.j1, aqS0S0100500_6.j2, aqS0S0100500_6.j3, aqS0S0100500_6.j4, aqS0S0100500_6.j5, false, true);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS0S0100500_6 aqS0S0100500_6, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.bqr, new AqS0S0100500_6((Activity) aqS0S0100500_6.l0, aqS0S0100500_6.j1, aqS0S0100500_6.j2, aqS0S0100500_6.j3, aqS0S0100500_6.j4, aqS0S0100500_6.j5, 0));
        actionGroup.LJIIIIZZ(R.string.bqq, new C36466ESw(aqS0S0100500_6.j1, aqS0S0100500_6.j2, aqS0S0100500_6.j3, aqS0S0100500_6.j4, aqS0S0100500_6.j5));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S0100500_6(Activity activity, long j, long j2, long j3, long j4, long j5, int i) {
        super(1);
        this.$t = i;
        this.l0 = activity;
        this.j1 = j;
        this.j2 = j2;
        this.j3 = j3;
        this.j4 = j4;
        this.j5 = j5;
    }
}
