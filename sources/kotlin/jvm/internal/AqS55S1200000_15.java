package kotlin.jvm.internal;

import X.ARI;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C188727au;
import X.C3C1;
import X.C76800UCe;
import X.C84492XEa;
import X.C85144XbI;
import X.C85167Xbf;
import X.FMX;
import X.InterfaceC84498XEg;
import X.InterfaceC88472Yns;
import X.XEY;
import com.ss.android.ugc.aweme.account.login.twostep.AddVerificationResponse;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationDetailFragment;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.zhiliaoapp.musically.R;

/* loaded from: classes16.dex */
public class AqS55S1200000_15 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public Object l2;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS55S1200000_15 aqS55S1200000_15, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        String str = aqS55S1200000_15.s0;
        actionGroup.LJI(R.string.rn6, new AqS55S1200000_15((AddVerificationResponse) aqS55S1200000_15.l2, (TwoStepVerificationDetailFragment) aqS55S1200000_15.l1, str, 1));
        actionGroup.LJIIIIZZ(R.string.rmt, null);
        actionGroup.LJI = true;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS55S1200000_15 aqS55S1200000_15, Object it) {
        TwoStepVerificationManageActivity twoStepVerificationManageActivity;
        String str;
        o.LJIIIZ(it, "it");
        String str2 = aqS55S1200000_15.s0;
        String enterFrom = ((TwoStepVerificationDetailFragment) aqS55S1200000_15.l1).getEnterFrom();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        C85144XbI.LJJIJL(str2, enterFrom);
        String enterFrom2 = ((TwoStepVerificationDetailFragment) aqS55S1200000_15.l1).getEnterFrom();
        o.LJIIIIZZ(enterFrom2, "enterFrom");
        String popupType = ((TwoStepVerificationDetailFragment) aqS55S1200000_15.l1).LJLL;
        o.LJIIIZ(popupType, "popupType");
        C188727au LJFF = C85144XbI.LJFF();
        LJFF.LJIIIZ("enter_from", enterFrom2);
        LJFF.LJIIIZ("popup_type", popupType);
        LJFF.LJIIIZ("click_button", "turnOff");
        FMX.LJIIL("twosv_setup_update_turnoff_click", LJFF.LIZ);
        ActivityC45651qj mo49getActivity = ((TwoStepVerificationDetailFragment) aqS55S1200000_15.l1).mo49getActivity();
        if ((mo49getActivity instanceof TwoStepVerificationManageActivity) && (twoStepVerificationManageActivity = (TwoStepVerificationManageActivity) mo49getActivity) != null) {
            AddVerificationResponse.Data data = ((AddVerificationResponse) aqS55S1200000_15.l2).getData();
            if (data == null || (str = data.getDefault_verify_way()) == null) {
                str = "";
            }
            twoStepVerificationManageActivity.LLJILLL(str, "", "authorized_logins");
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS55S1200000_15 aqS55S1200000_15, Object obj) {
        if (obj != null) {
            ((InterfaceC88472Yns) aqS55S1200000_15.l1).invoke(obj);
        }
        if (C84492XEa.LIZ == null) {
            InterfaceC84498XEg interfaceC84498XEg = (InterfaceC84498XEg) aqS55S1200000_15.l2;
            interfaceC84498XEg.LJJJJLI(aqS55S1200000_15.s0, false, false, new XEY(interfaceC84498XEg, (InterfaceC88472Yns) aqS55S1200000_15.l1));
        } else {
            EffectChannelResponse effectChannelResponse = C84492XEa.LIZ;
            if (effectChannelResponse != null) {
                C84492XEa.LIZIZ(effectChannelResponse, (InterfaceC84498XEg) aqS55S1200000_15.l2, (InterfaceC88472Yns) aqS55S1200000_15.l1);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS55S1200000_15 aqS55S1200000_15, Object obj) {
        C85167Xbf setState = (C85167Xbf) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C85167Xbf.LIZ(setState, null, new C3C1(TwoStepVerificationActivityViewModel.kv0((TwoStepVerificationActivityViewModel) aqS55S1200000_15.l1, (Integer) aqS55S1200000_15.l2, aqS55S1200000_15.s0)), null, false, null, 29);
    }

    public static final Object invoke$4(AqS55S1200000_15 aqS55S1200000_15, Object obj) {
        C85167Xbf setState = (C85167Xbf) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C85167Xbf.LIZ(setState, null, null, new C3C1(TwoStepVerificationActivityViewModel.kv0((TwoStepVerificationActivityViewModel) aqS55S1200000_15.l1, (Integer) aqS55S1200000_15.l2, aqS55S1200000_15.s0)), false, null, 27);
    }

    public static final Object invoke$5(AqS55S1200000_15 aqS55S1200000_15, Object it) {
        o.LJIIIZ(it, "it");
        TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel = (TwoStepVerificationActivityViewModel) aqS55S1200000_15.l1;
        twoStepVerificationActivityViewModel.setState(new AqS55S1200000_15(twoStepVerificationActivityViewModel, (Integer) aqS55S1200000_15.l2, aqS55S1200000_15.s0, 4));
        TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel2 = (TwoStepVerificationActivityViewModel) aqS55S1200000_15.l1;
        twoStepVerificationActivityViewModel2.listSetItems(twoStepVerificationActivityViewModel2.nv0());
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS55S1200000_15(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns<? super Effect, C76800UCe> interfaceC88472Yns2, InterfaceC84498XEg interfaceC84498XEg, String str) {
        super(1);
        this.$t = str;
        this.l1 = interfaceC88472Yns;
        this.l2 = interfaceC88472Yns2;
        this.s0 = interfaceC84498XEg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS55S1200000_15(AddVerificationResponse addVerificationResponse, TwoStepVerificationDetailFragment twoStepVerificationDetailFragment, String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = twoStepVerificationDetailFragment;
        this.l2 = addVerificationResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS55S1200000_15(TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel, Integer num, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = twoStepVerificationActivityViewModel;
        this.l2 = num;
        this.s0 = str;
    }
}
