package kotlin.jvm.internal;

import X.ARI;
import X.AbstractC65781Prl;
import X.C189737cX;
import X.C43277Gyf;
import X.C43278Gyg;
import X.C43921HLp;
import X.C45087Hml;
import X.C65282hI;
import X.C76800UCe;
import X.InterfaceC43927HLv;
import X.InterfaceC88472Yns;
import android.os.BaseBundle;

/* loaded from: classes8.dex */
public class AqS30S1000000_7 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public String s0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS30S1000000_7(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(AqS30S1000000_7 aqS30S1000000_7, Object obj) {
        C45087Hml.LIZLLL(aqS30S1000000_7.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS30S1000000_7 aqS30S1000000_7, Object obj) {
        C65282hI.LIZLLL(aqS30S1000000_7.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS30S1000000_7 aqS30S1000000_7, Object obj) {
        C65282hI.LIZLLL(aqS30S1000000_7.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS30S1000000_7 aqS30S1000000_7, Object obj) {
        BaseBundle generateCreationBundle = (BaseBundle) obj;
        o.LJIIIZ(generateCreationBundle, "$this$generateCreationBundle");
        generateCreationBundle.putString("new_avatar_uri", aqS30S1000000_7.s0);
        generateCreationBundle.putString("enter_method", "direct_post");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS30S1000000_7 aqS30S1000000_7, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJII(aqS30S1000000_7.s0, C43277Gyf.LJLIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS30S1000000_7 aqS30S1000000_7, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJII(aqS30S1000000_7.s0, C43278Gyg.LJLIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS30S1000000_7 aqS30S1000000_7, Object obj) {
        C65282hI.LIZLLL(aqS30S1000000_7.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS30S1000000_7 aqS30S1000000_7, Object obj) {
        C65282hI.LIZLLL(aqS30S1000000_7.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS30S1000000_7 aqS30S1000000_7, Object obj) {
        InterfaceC43927HLv invokeCallback = (InterfaceC43927HLv) obj;
        o.LJIIIZ(invokeCallback, "$this$invokeCallback");
        invokeCallback.LJFF(aqS30S1000000_7.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS30S1000000_7 aqS30S1000000_7, Object obj) {
        InterfaceC43927HLv invokeCallback = (InterfaceC43927HLv) obj;
        o.LJIIIZ(invokeCallback, "$this$invokeCallback");
        C43921HLp c43921HLp = C43921HLp.LIZ;
        String str = aqS30S1000000_7.s0;
        c43921HLp.getClass();
        C189737cX LJIJI = C43921HLp.LJIJI(str);
        if (LJIJI != null) {
            invokeCallback.LJ(aqS30S1000000_7.s0, LJIJI.LJLILLLLZI);
        }
        return C76800UCe.LIZ;
    }
}
