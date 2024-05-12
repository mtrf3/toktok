package kotlin.jvm.internal;

import X.A0B;
import X.ARI;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C03880Dg;
import X.C65300Pk0;
import X.C76800UCe;
import X.DialogC25756A8y;
import X.InterfaceC88472Yns;
import X.R41;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.services.BindService;
import com.ss.android.ugc.aweme.setting.page.account.ThirdPartyBindingPage;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* loaded from: classes5.dex */
public class AqS10S2200000_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS10S2200000_4 aqS10S2200000_4, Object obj) {
        String str;
        Map sendLog = (Map) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        if (o.LJ((Boolean) aqS10S2200000_4.l2, Boolean.TRUE)) {
            str = "reactivate";
        } else {
            str = "active_now";
        }
        sendLog.put("button_name", str);
        sendLog.put("button_type", "confirm");
        String str2 = aqS10S2200000_4.s0;
        if (str2 != null) {
            sendLog.put("payment_option", str2);
        }
        Boolean bool = (Boolean) aqS10S2200000_4.l3;
        if (bool != null) {
            sendLog.put("is_option_discounted", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        String str3 = aqS10S2200000_4.s1;
        if (str3 != null && str3.length() > 0) {
            sendLog.put("pay_bind_status", aqS10S2200000_4.s1);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS10S2200000_4 aqS10S2200000_4, Object it) {
        o.LJIIIZ(it, "it");
        ThirdPartyBindingPage thirdPartyBindingPage = (ThirdPartyBindingPage) aqS10S2200000_4.l2;
        String str = aqS10S2200000_4.s0;
        thirdPartyBindingPage.getClass();
        ThirdPartyBindingPage.Al(str, "remove", "remove");
        DialogC25756A8y dialogC25756A8y = (DialogC25756A8y) aqS10S2200000_4.l3;
        if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingDialogHUD", "show", dialogC25756A8y, new Object[0], "void", new C65300Pk0(false, "()V", "3762403870877877881")).LIZ) {
            dialogC25756A8y.show();
        }
        BindService LIZIZ = R41.LIZIZ();
        ActivityC45651qj mo49getActivity = ((ThirdPartyBindingPage) aqS10S2200000_4.l2).mo49getActivity();
        String str2 = aqS10S2200000_4.s0;
        LIZIZ.unbindPlatform(mo49getActivity, str2, new A0B((DialogC25756A8y) aqS10S2200000_4.l3, (ThirdPartyBindingPage) aqS10S2200000_4.l2, aqS10S2200000_4.s1, str2));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS10S2200000_4 aqS10S2200000_4, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        String string = ((ThirdPartyBindingPage) aqS10S2200000_4.l2).getString(R.string.s88);
        o.LJIIIIZZ(string, "getString(R.string.thrp_unbind_back_btn)");
        actionGroup.LJIIIZ(string, new AqS58S1100000_4((ThirdPartyBindingPage) aqS10S2200000_4.l2, aqS10S2200000_4.s0, 36));
        String string2 = ((ThirdPartyBindingPage) aqS10S2200000_4.l2).getString(R.string.s8a);
        o.LJIIIIZZ(string2, "getString(R.string.thrp_unbind_remove_btn)");
        actionGroup.LJII(string2, new AqS10S2200000_4((DialogC25756A8y) aqS10S2200000_4.l3, (ThirdPartyBindingPage) aqS10S2200000_4.l2, aqS10S2200000_4.s0, aqS10S2200000_4.s1, 1));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0116 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AqS10S2200000_4 r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS10S2200000_4.invoke$3(kotlin.jvm.internal.AqS10S2200000_4, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS10S2200000_4(DialogC25756A8y dialogC25756A8y, ThirdPartyBindingPage thirdPartyBindingPage, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = thirdPartyBindingPage;
        this.s0 = str;
        this.l3 = dialogC25756A8y;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS10S2200000_4(String str, AddressEditViewModel addressEditViewModel, String str2, CandInputData candInputData, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l2 = addressEditViewModel;
        this.s1 = str2;
        this.l3 = candInputData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS10S2200000_4(String str, String str2, Boolean bool, Boolean bool2, int i) {
        super(1);
        this.$t = i;
        this.l2 = bool;
        this.s0 = str;
        this.l3 = bool2;
        this.s1 = str2;
    }
}
