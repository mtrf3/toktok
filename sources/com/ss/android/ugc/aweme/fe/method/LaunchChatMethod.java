package com.ss.android.ugc.aweme.fe.method;

import X.C50906JyQ;
import X.C98593tv;
import X.HG3;
import X.InterfaceC36488ETs;
import X.InterfaceC98813uH;
import X.J9P;
import X.RBX;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class LaunchChatMethod extends BaseCommonJavaMethod {
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        String str;
        int i;
        if (jSONObject == null) {
            if (interfaceC36488ETs != null) {
                interfaceC36488ETs.LIZ(0, "no params found");
                return;
            }
            return;
        }
        IMUser iMUser = new IMUser();
        iMUser.setUid(jSONObject.optString("uid"));
        iMUser.setNickName(jSONObject.optString("nick_name"));
        iMUser.setSignature(jSONObject.optString("alias"));
        iMUser.setFake(true);
        if (jSONObject.optBoolean("is_author_service")) {
            str = "message";
            i = 12;
        } else {
            str = "";
            i = 0;
        }
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            Context actContext = getActContext();
            if (actContext != null && (actContext instanceof Activity)) {
                J9P.LIZIZ((Activity) actContext, str, "click_chat_button", null, new C50906JyQ(this, iMUser, i, interfaceC36488ETs));
                return;
            }
            return;
        }
        Context actContext2 = getActContext();
        if (actContext2 == null) {
            if (interfaceC36488ETs != null) {
                interfaceC36488ETs.LIZ(0, "open chat fail");
                return;
            }
            return;
        }
        InterfaceC98813uH imChatService = IMService.createIIMServicebyMonsterPlugin(false).getImChatService();
        C98593tv c98593tv = new C98593tv(actContext2, iMUser);
        c98593tv.setEnterFrom(i);
        imChatService.LJFF(c98593tv);
        if (interfaceC36488ETs == null) {
            return;
        }
        interfaceC36488ETs.onSuccess(1);
    }
}
