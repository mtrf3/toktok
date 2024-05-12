package Y;

import X.ARH;
import X.ARI;
import X.ARL;
import X.ARN;
import X.AbstractC247499nV;
import X.AbstractDialogInterfaceC26236ARk;
import X.C0JU;
import X.C16880lQ;
import X.C244309iM;
import X.C247219n3;
import X.C2MW;
import X.C76800UCe;
import X.C86184Xs4;
import X.C95J;
import X.InterfaceC247459nR;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import android.app.Activity;
import android.view.View;
import android.widget.Toast;
import com.bytedance.touchpoint.core.invitecode.InviteCodeResponse;
import com.bytedance.touchpoint.core.model.IncentiveCommon;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class ACListenerS17S0301000_4 implements View.OnClickListener {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS17S0301000_4 aCListenerS17S0301000_4, View view) {
        InterfaceC88472Yns<ARN, C76800UCe> interfaceC88472Yns = ((ARL) aCListenerS17S0301000_4.l0).LIZIZ;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke((ARN) aCListenerS17S0301000_4.l1);
        }
        if (((ARN) aCListenerS17S0301000_4.l1).LIZJ) {
            AbstractDialogInterfaceC26236ARk abstractDialogInterfaceC26236ARk = (AbstractDialogInterfaceC26236ARk) ((ARI) aCListenerS17S0301000_4.l2).LIZLLL;
            if (abstractDialogInterfaceC26236ARk != null) {
                abstractDialogInterfaceC26236ARk.LIZIZ(Integer.valueOf(aCListenerS17S0301000_4.i3));
            } else {
                o.LJIJI("dialog");
                throw null;
            }
        }
    }

    public static final void onClick$1(ACListenerS17S0301000_4 aCListenerS17S0301000_4, View view) {
        InterfaceC88472Yns<ARN, C76800UCe> interfaceC88472Yns = ((ARL) aCListenerS17S0301000_4.l0).LIZIZ;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke((ARN) aCListenerS17S0301000_4.l1);
        }
        if (((ARN) aCListenerS17S0301000_4.l1).LIZJ) {
            AbstractDialogInterfaceC26236ARk abstractDialogInterfaceC26236ARk = (AbstractDialogInterfaceC26236ARk) ((ARH) aCListenerS17S0301000_4.l2).LIZLLL;
            if (abstractDialogInterfaceC26236ARk != null) {
                abstractDialogInterfaceC26236ARk.LIZIZ(Integer.valueOf(aCListenerS17S0301000_4.i3));
            } else {
                o.LJIJI("dialog");
                throw null;
            }
        }
    }

    public static final void onClick$2(ACListenerS17S0301000_4 aCListenerS17S0301000_4, View view) {
        C86184Xs4 c86184Xs4 = (C86184Xs4) aCListenerS17S0301000_4.l0;
        HashMap hashMap = (HashMap) aCListenerS17S0301000_4.l1;
        Activity activity = (Activity) aCListenerS17S0301000_4.l2;
        int i = aCListenerS17S0301000_4.i3;
        c86184Xs4.getClass();
        C244309iM.LJIIIIZZ("shoot", "click_edit_profile", hashMap);
        if (c86184Xs4.LJI()) {
            return;
        }
        if (activity != null && MSAdaptionService.LJIIL().LJI(activity)) {
            C16880lQ.LLZILL(Toast.makeText(activity, activity.getString(R.string.f1i), 0));
        } else {
            c86184Xs4.LJIIL(i);
        }
    }

    public static final void onClick$3(ACListenerS17S0301000_4 aCListenerS17S0301000_4, View view) {
        String str;
        String str2;
        InviteCodeResponse.InviteResultPopup inviteResultPopup;
        TuxSheet tuxSheet = C247219n3.LIZ;
        if (tuxSheet != null) {
            tuxSheet.dismiss();
        }
        InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) aCListenerS17S0301000_4.l0;
        if (interfaceC88471Ynr != null) {
            interfaceC88471Ynr.invoke(Integer.valueOf(aCListenerS17S0301000_4.i3), (InviteCodeResponse.Button) aCListenerS17S0301000_4.l1);
        }
        InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
        if (interfaceC247459nR != null) {
            LinkedHashMap LIZ = C0JU.LIZ("button_name", "ok");
            InviteCodeResponse.Data data = ((InviteCodeResponse) aCListenerS17S0301000_4.l2).data;
            String str3 = null;
            if (data != null && (inviteResultPopup = data.inviteResultPopup) != null) {
                str = inviteResultPopup.popupType;
            } else {
                str = null;
            }
            LIZ.put("pop_name", str);
            LIZ.put("position", "now tab");
            IncentiveCommon incentiveCommon = (IncentiveCommon) C2MW.LIZ().LIZLLL(23);
            if (incentiveCommon != null) {
                str2 = incentiveCommon.notificationName;
            } else {
                str2 = null;
            }
            LIZ.put("activity_name", str2);
            AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
            if (abstractC247499nV != null) {
                str3 = abstractC247499nV.LJIIJ();
            }
            LIZ.put("region", str3);
            interfaceC247459nR.LIZIZ("referral_dialog_pop_click", LIZ);
        }
    }

    public ACListenerS17S0301000_4(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.i3 = i;
    }
}
