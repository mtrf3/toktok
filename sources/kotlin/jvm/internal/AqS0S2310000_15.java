package kotlin.jvm.internal;

import X.ARI;
import X.AbstractC65781Prl;
import X.C76800UCe;
import X.InterfaceC85767XlL;
import X.InterfaceC88472Yns;
import android.app.Activity;
import com.ss.android.ugc.aweme.account.login.passkey.PasskeyService;
import com.ss.android.ugc.aweme.account.login.passkey.passkeyets.RespondReplacePasskeyPopupEvent;
import com.zhiliaoapp.musically.R;

/* loaded from: classes16.dex */
public class AqS0S2310000_15 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;
    public boolean z5;

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

    public static final Object invoke$0(AqS0S2310000_15 aqS0S2310000_15, Object it) {
        o.LJIIIZ(it, "it");
        RespondReplacePasskeyPopupEvent respondReplacePasskeyPopupEvent = new RespondReplacePasskeyPopupEvent();
        respondReplacePasskeyPopupEvent.LIZLLL("account_page", "enter_from");
        respondReplacePasskeyPopupEvent.LIZLLL("click", "enter_method");
        respondReplacePasskeyPopupEvent.LIZLLL(1, "result");
        respondReplacePasskeyPopupEvent.LJFF();
        PasskeyService passkeyService = (PasskeyService) aqS0S2310000_15.l2;
        Activity activity = (Activity) aqS0S2310000_15.l3;
        String str = aqS0S2310000_15.s0;
        String str2 = aqS0S2310000_15.s1;
        boolean z = aqS0S2310000_15.z5;
        InterfaceC85767XlL interfaceC85767XlL = (InterfaceC85767XlL) aqS0S2310000_15.l4;
        passkeyService.getClass();
        PasskeyService.LJI(activity, str, str2, z, false, false, interfaceC85767XlL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS0S2310000_15 aqS0S2310000_15, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        String string = ((Activity) aqS0S2310000_15.l2).getString(R.string.jf0);
        o.LJIIIIZZ(string, "activity.getString(R.str…curitySettings_modal_btn)");
        PasskeyService passkeyService = (PasskeyService) aqS0S2310000_15.l3;
        actionGroup.LJII(string, new AqS0S2310000_15((Activity) aqS0S2310000_15.l2, (InterfaceC85767XlL) aqS0S2310000_15.l4, passkeyService, aqS0S2310000_15.s0, aqS0S2310000_15.s1, aqS0S2310000_15.z5, 0));
        actionGroup.LJIIIIZZ(R.string.jf1, null);
        actionGroup.LJI = true;
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S2310000_15(Activity activity, InterfaceC85767XlL interfaceC85767XlL, PasskeyService passkeyService, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = activity;
        this.l3 = passkeyService;
        this.s0 = str;
        this.s1 = str2;
        this.z5 = true;
        this.l4 = interfaceC85767XlL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S2310000_15(Activity activity, InterfaceC85767XlL interfaceC85767XlL, PasskeyService passkeyService, String str, String str2, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l2 = passkeyService;
        this.l3 = activity;
        this.s0 = str;
        this.s1 = str2;
        this.z5 = z;
        this.l4 = interfaceC85767XlL;
    }
}
