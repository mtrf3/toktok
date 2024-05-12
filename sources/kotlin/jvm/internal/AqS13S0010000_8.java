package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C25848ACm;
import X.C43I;
import X.C49517Jc1;
import X.C49740Jfc;
import X.C51009K0f;
import X.C76800UCe;
import X.InterfaceC49926Jic;
import X.InterfaceC88472Yns;
import X.JBB;
import X.K42;
import X.KI0;
import X.KSM;
import X.X1D;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.agilelogger.ALog;

/* loaded from: classes9.dex */
public class AqS13S0010000_8 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public boolean z0;

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
            case 10:
                return invoke$10(this, obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj);
            case 12:
                return invoke$12(this, obj);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS13S0010000_8(int i) {
        super(1);
        this.$t = i;
        this.z0 = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS13S0010000_8(boolean z, int i) {
        super(1);
        this.$t = i;
        this.z0 = z;
    }

    public static final Object invoke$0(AqS13S0010000_8 aqS13S0010000_8, Object obj) {
        InterfaceC49926Jic runDelegates = (InterfaceC49926Jic) obj;
        o.LJIIIZ(runDelegates, "$this$runDelegates");
        runDelegates.H30(aqS13S0010000_8.z0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS13S0010000_8 aqS13S0010000_8, Object obj) {
        InterfaceC49926Jic runDelegates = (InterfaceC49926Jic) obj;
        o.LJIIIZ(runDelegates, "$this$runDelegates");
        runDelegates.JC(aqS13S0010000_8.z0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS13S0010000_8 aqS13S0010000_8, Object obj) {
        KSM setState = (KSM) obj;
        o.LJIIIZ(setState, "$this$setState");
        boolean z = aqS13S0010000_8.z0;
        String nowSelectCell = setState.LJLIL;
        o.LJIIIZ(nowSelectCell, "nowSelectCell");
        return new KSM(nowSelectCell, z);
    }

    public static final Object invoke$11(AqS13S0010000_8 aqS13S0010000_8, Object obj) {
        KI0 setState = (KI0) obj;
        o.LJIIIZ(setState, "$this$setState");
        return KI0.LIZ(setState, 0, null, null, false, new C43I(Boolean.valueOf(aqS13S0010000_8.z0)), null, 47);
    }

    public static final Object invoke$12(AqS13S0010000_8 aqS13S0010000_8, Object obj) {
        KI0 setState = (KI0) obj;
        o.LJIIIZ(setState, "$this$setState");
        return KI0.LIZ(setState, 0, null, null, aqS13S0010000_8.z0, null, null, 55);
    }

    public static final Object invoke$13(AqS13S0010000_8 aqS13S0010000_8, Object obj) {
        K42 setState = (K42) obj;
        o.LJIIIZ(setState, "$this$setState");
        return K42.LIZ(setState, null, null, null, null, null, null, aqS13S0010000_8.z0, 63);
    }

    public static final Object invoke$2(AqS13S0010000_8 aqS13S0010000_8, Object obj) {
        JBB setState = (JBB) obj;
        o.LJIIIZ(setState, "$this$setState");
        return JBB.LIZ(setState, new C43I(Boolean.valueOf(aqS13S0010000_8.z0)), null, null, null, null, null, 62);
    }

    public static final Object invoke$3(AqS13S0010000_8 aqS13S0010000_8, Object obj) {
        C25848ACm it = (C25848ACm) obj;
        o.LJIIIZ(it, "it");
        return C25848ACm.LJIILJJIL(it, false, null, null, false, null, null, null, aqS13S0010000_8.z0, false, false, 63487);
    }

    public static final Object invoke$4(AqS13S0010000_8 aqS13S0010000_8, Object obj) {
        C49517Jc1 setState = (C49517Jc1) obj;
        o.LJIIIZ(setState, "$this$setState");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateClientTrigger : ");
        LIZ.append(aqS13S0010000_8.z0);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("TakoPollingVM", X1D.LIZIZ(LIZ));
        return C49517Jc1.LIZIZ(setState, aqS13S0010000_8.z0, null, false, 0, 0L, null, null, null, null, null, 1022);
    }

    public static final Object invoke$5(AqS13S0010000_8 aqS13S0010000_8, Object setState) {
        o.LJIIIZ(setState, "$this$setState");
        return new C51009K0f(true, aqS13S0010000_8.z0, false);
    }

    public static final Object invoke$6(AqS13S0010000_8 aqS13S0010000_8, Object setState) {
        o.LJIIIZ(setState, "$this$setState");
        return new C51009K0f(false, aqS13S0010000_8.z0, false);
    }

    public static final Object invoke$7(AqS13S0010000_8 aqS13S0010000_8, Object obj) {
        C25848ACm it = (C25848ACm) obj;
        o.LJIIIZ(it, "it");
        return C25848ACm.LJIILJJIL(it, aqS13S0010000_8.z0, null, null, false, null, null, null, false, false, false, 65534);
    }

    public static final Object invoke$8(AqS13S0010000_8 aqS13S0010000_8, Object obj) {
        C49740Jfc setState = (C49740Jfc) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C49740Jfc.L(setState, false, null, aqS13S0010000_8.z0, 3);
    }

    public static final Object invoke$9(AqS13S0010000_8 aqS13S0010000_8, Object obj) {
        C49740Jfc setState = (C49740Jfc) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C49740Jfc.L(setState, aqS13S0010000_8.z0, null, false, 6);
    }
}
