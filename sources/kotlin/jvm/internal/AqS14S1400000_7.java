package kotlin.jvm.internal;

import X.ARI;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C76732zl;
import X.C76800UCe;
import X.GWN;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import android.app.Activity;
import com.zhiliaoapp.musically.R;

/* loaded from: classes8.dex */
public class AqS14S1400000_7 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

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

    public static final Object invoke$0(AqS14S1400000_7 aqS14S1400000_7, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.rtj, new AqS30S1300000_7((String[]) aqS14S1400000_7.l1, (String[]) aqS14S1400000_7.l2, (ActivityC45651qj) aqS14S1400000_7.s0, (String) aqS14S1400000_7.l3, (InterfaceC65784Pro<C76800UCe>) 1));
        actionGroup.LJIIIIZZ(R.string.rti, new AqS30S1300000_7((String[]) aqS14S1400000_7.l1, (String[]) aqS14S1400000_7.l2, (ActivityC45651qj) aqS14S1400000_7.s0, (String) aqS14S1400000_7.l4, (InterfaceC65784Pro<C76800UCe>) 2));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS14S1400000_7 aqS14S1400000_7, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(((C76732zl) aqS14S1400000_7.l1).element, new AqS138S0200000_7((GWN) aqS14S1400000_7.l3, (Activity) aqS14S1400000_7.l4, aqS14S1400000_7.s0, 113));
        actionGroup.LJIIIIZZ(((C76732zl) aqS14S1400000_7.l2).element, new AqS138S0200000_7((GWN) aqS14S1400000_7.l3, (Activity) aqS14S1400000_7.l4, aqS14S1400000_7.s0, 114));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS14S1400000_7(C76732zl c76732zl, C76732zl c76732zl2, GWN gwn, Activity activity, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c76732zl;
        this.l2 = c76732zl2;
        this.l3 = gwn;
        this.l4 = activity;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS14S1400000_7(String[] strArr, String[] strArr2, ActivityC45651qj activityC45651qj, String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        super(1);
        this.$t = interfaceC65784Pro2;
        this.l1 = strArr;
        this.l2 = strArr2;
        this.s0 = activityC45651qj;
        this.l3 = str;
        this.l4 = interfaceC65784Pro;
    }
}
