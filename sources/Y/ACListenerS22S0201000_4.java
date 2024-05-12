package Y;

import X.AbstractC247499nV;
import X.C0JU;
import X.C244309iM;
import X.C247219n3;
import X.C2MW;
import X.C76800UCe;
import X.C86184Xs4;
import X.C95J;
import X.EnumC26325AUv;
import X.InterfaceC247459nR;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.touchpoint.core.invitecode.InviteCodeResponse;
import com.bytedance.touchpoint.core.model.IncentiveCommon;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeSortModel;
import com.ss.android.ugc.aweme.notification.creator.widget.SortPopupWindow;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes5.dex */
public class ACListenerS22S0201000_4 implements View.OnClickListener {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$0(ACListenerS22S0201000_4 aCListenerS22S0201000_4, View view) {
        InterfaceC88472Yns<NoticeSortModel, C76800UCe> interfaceC88472Yns = ((SortPopupWindow) aCListenerS22S0201000_4.l0).LJLIL;
        if (interfaceC88472Yns != 0) {
            interfaceC88472Yns.invoke(ListProtector.get((List) aCListenerS22S0201000_4.l1, aCListenerS22S0201000_4.i2));
        }
        ((SortPopupWindow) aCListenerS22S0201000_4.l0).dismiss();
    }

    public static final void onClick$1(ACListenerS22S0201000_4 aCListenerS22S0201000_4, View view) {
        C86184Xs4 c86184Xs4 = (C86184Xs4) aCListenerS22S0201000_4.l0;
        HashMap hashMap = (HashMap) aCListenerS22S0201000_4.l1;
        int i = aCListenerS22S0201000_4.i2;
        c86184Xs4.getClass();
        C244309iM.LJIIIIZZ("click_upload_entrance", "click_edit_profile", hashMap);
        if (c86184Xs4.LJI()) {
            return;
        }
        c86184Xs4.LJIILJJIL(i);
    }

    public static final void onClick$2(ACListenerS22S0201000_4 aCListenerS22S0201000_4, View view) {
        C86184Xs4 c86184Xs4 = (C86184Xs4) aCListenerS22S0201000_4.l0;
        HashMap<String, String> hashMap = (HashMap) aCListenerS22S0201000_4.l1;
        int i = aCListenerS22S0201000_4.i2;
        c86184Xs4.LJIIL.LJFF(EnumC26325AUv.UPLOAD_PHOTO, hashMap);
        if (c86184Xs4.LJI()) {
            return;
        }
        c86184Xs4.LJIILJJIL(i);
    }

    public static final void onClick$3(ACListenerS22S0201000_4 aCListenerS22S0201000_4, View view) {
        String str;
        String str2;
        InviteCodeResponse.InviteResultPopup inviteResultPopup;
        Object obj;
        InviteCodeResponse.InviteResultPopup inviteResultPopup2;
        List<InviteCodeResponse.Button> list;
        TuxSheet tuxSheet = C247219n3.LIZ;
        if (tuxSheet != null) {
            tuxSheet.dismiss();
        }
        InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) aCListenerS22S0201000_4.l0;
        String str3 = null;
        if (interfaceC88471Ynr != null) {
            Integer valueOf = Integer.valueOf(aCListenerS22S0201000_4.i2);
            InviteCodeResponse.Data data = ((InviteCodeResponse) aCListenerS22S0201000_4.l1).data;
            if (data != null && (inviteResultPopup2 = data.inviteResultPopup) != null && (list = inviteResultPopup2.buttons) != null) {
                obj = ListProtector.get(list, 0);
            } else {
                obj = null;
            }
            interfaceC88471Ynr.invoke(valueOf, obj);
        }
        InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
        if (interfaceC247459nR != null) {
            LinkedHashMap LIZ = C0JU.LIZ("button_name", "ok");
            InviteCodeResponse.Data data2 = ((InviteCodeResponse) aCListenerS22S0201000_4.l1).data;
            if (data2 != null && (inviteResultPopup = data2.inviteResultPopup) != null) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public ACListenerS22S0201000_4(Object obj, SortPopupWindow sortPopupWindow, List<NoticeSortModel> list, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = sortPopupWindow;
        this.i2 = list;
    }
}
