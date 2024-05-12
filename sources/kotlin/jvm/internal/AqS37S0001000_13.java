package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76439TzH;
import X.C76449TzR;
import X.C76800UCe;
import X.C77177UQr;
import X.EnumC77147UPn;
import X.InterfaceC75441TjB;
import X.InterfaceC88472Yns;
import X.URJ;
import X.USH;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.BattleItem4FEModel;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState;

/* loaded from: classes14.dex */
public class AqS37S0001000_13 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i0;

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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS37S0001000_13(int i) {
        super(1);
        this.$t = i;
        this.i0 = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS37S0001000_13(int i, int i2) {
        super(1);
        this.$t = i2;
        this.i0 = i;
    }

    public static final Object invoke$0(AqS37S0001000_13 aqS37S0001000_13, Object obj) {
        C76439TzH setState = (C76439TzH) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C76439TzH.M(setState, null, null, null, new BattleItem4FEModel(), new C76449TzR(aqS37S0001000_13.i0, false), 7);
    }

    public static final Object invoke$1(AqS37S0001000_13 aqS37S0001000_13, Object obj) {
        C76439TzH setState = (C76439TzH) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C76439TzH.M(setState, null, null, new BattleItem4FEModel(), null, new C76449TzR(aqS37S0001000_13.i0, false), 11);
    }

    public static final Object invoke$2(AqS37S0001000_13 aqS37S0001000_13, Object obj) {
        UserState changeLocalUserStateImmediately = (UserState) obj;
        o.LJIIIZ(changeLocalUserStateImmediately, "$this$changeLocalUserStateImmediately");
        return UserState.LIZ(changeLocalUserStateImmediately, 0, aqS37S0001000_13.i0, 0, 0, 0, 0, 991);
    }

    public static final Object invoke$3(AqS37S0001000_13 aqS37S0001000_13, Object obj) {
        UserState changeLocalUserStateImmediately = (UserState) obj;
        o.LJIIIZ(changeLocalUserStateImmediately, "$this$changeLocalUserStateImmediately");
        return UserState.LIZ(changeLocalUserStateImmediately, 0, 0, 0, 0, aqS37S0001000_13.i0, 0, 767);
    }

    public static final Object invoke$4(AqS37S0001000_13 aqS37S0001000_13, Object obj) {
        UserState changeLocalUserStateImmediately = (UserState) obj;
        o.LJIIIZ(changeLocalUserStateImmediately, "$this$changeLocalUserStateImmediately");
        return UserState.LIZ(changeLocalUserStateImmediately, aqS37S0001000_13.i0, 0, 0, 0, 0, 0, 1007);
    }

    public static final Object invoke$5(AqS37S0001000_13 aqS37S0001000_13, Object obj) {
        UserState changeLocalUserStateImmediately = (UserState) obj;
        o.LJIIIZ(changeLocalUserStateImmediately, "$this$changeLocalUserStateImmediately");
        return UserState.LIZ(changeLocalUserStateImmediately, 0, 0, aqS37S0001000_13.i0, 0, 0, 0, 959);
    }

    public static final Object invoke$6(AqS37S0001000_13 aqS37S0001000_13, Object obj) {
        C76439TzH setState = (C76439TzH) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C76439TzH.M(setState, null, new BattleItem4FEModel(), null, null, new C76449TzR(aqS37S0001000_13.i0, true), 13);
    }

    public static final Object invoke$7(AqS37S0001000_13 aqS37S0001000_13, Object obj) {
        EnumC77147UPn enumC77147UPn;
        URJ urj;
        USH pipelineConfig = (USH) obj;
        o.LJIIIZ(pipelineConfig, "$this$pipelineConfig");
        if (aqS37S0001000_13.i0 == 2) {
            enumC77147UPn = EnumC77147UPn.FACEBOOK;
        } else {
            enumC77147UPn = EnumC77147UPn.CONTACT;
        }
        pipelineConfig.LIZ(enumC77147UPn);
        boolean z = true;
        pipelineConfig.LIZIZ = true;
        if (aqS37S0001000_13.i0 == 2) {
            urj = URJ.DIALOG_ACTUAL_AND_USER;
        } else {
            urj = URJ.BLACK_BACKGROUND_ACTUAL_DIALOG_USER;
        }
        pipelineConfig.LIZIZ(urj);
        if (C77177UQr.LJFF != null) {
            z = false;
        }
        pipelineConfig.LIZLLL = z;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS37S0001000_13 aqS37S0001000_13, Object obj) {
        boolean z;
        if (((InterfaceC75441TjB) obj).scene() == aqS37S0001000_13.i0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
