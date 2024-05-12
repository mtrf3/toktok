package com.ss.android.ugc.aweme.fe.method.im;

import X.C36922EeM;
import X.C62374Odu;
import X.C84763XOl;
import X.InterfaceC109344Qw;
import X.InterfaceC36488ETs;
import X.OY1;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.im.service.share.ImWebSharePackage;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class ShareWebToChatMethod extends BaseCommonJavaMethod {
    public ShareWebToChatMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        IMUser iMUser;
        if (jSONObject == null) {
            if (interfaceC36488ETs != null) {
                interfaceC36488ETs.LIZ(0, "no params found");
                return;
            }
            return;
        }
        int optInt = jSONObject.optInt("type");
        if (optInt != 1) {
            if (optInt != 2) {
                if (interfaceC36488ETs != null) {
                    interfaceC36488ETs.LIZ(0, "unknown type");
                    return;
                }
                return;
            } else {
                String optString = jSONObject.optString("cid");
                IMConversation iMConversation = new IMConversation();
                iMConversation.setConversationId(optString);
                iMUser = iMConversation;
            }
        } else {
            String optString2 = jSONObject.optString("uid");
            IMUser iMUser2 = new IMUser();
            iMUser2.setUid(optString2);
            iMUser = iMUser2;
        }
        if (C84763XOl.LJIIIIZZ() == null) {
            if (interfaceC36488ETs != null) {
                interfaceC36488ETs.LIZ(0, "activity is null");
                return;
            }
            return;
        }
        try {
            String title = JSONObjectProtectorUtils.getString(jSONObject, "title");
            String desc = JSONObjectProtectorUtils.getString(jSONObject, "desc");
            String string = JSONObjectProtectorUtils.getString(jSONObject, "pic_url");
            String webUrl = JSONObjectProtectorUtils.getString(jSONObject, "web_url");
            String enterFrom = jSONObject.optString("enter_from");
            String messageType = jSONObject.optString("message_type");
            C36922EeM.LIZLLL(4, "ShareWebToChatMethod", "start to share ");
            InterfaceC109344Qw shareService = IMService.createIIMServicebyMonsterPlugin(false).getShareService();
            C62374Odu c62374Odu = new C62374Odu();
            c62374Odu.LIZ = "web";
            o.LJIIIIZZ(title, "title");
            c62374Odu.LIZLLL = title;
            o.LJIIIIZZ(desc, "desc");
            c62374Odu.LJ = desc;
            o.LJIIIIZZ(webUrl, "webUrl");
            c62374Odu.LJFF = webUrl;
            o.LJIIIIZZ(enterFrom, "enterFrom");
            c62374Odu.LIZIZ("enter_from", enterFrom);
            o.LJIIIIZZ(messageType, "messageType");
            c62374Odu.LIZIZ("message_type", messageType);
            ImWebSharePackage imWebSharePackage = new ImWebSharePackage(c62374Odu);
            imWebSharePackage.imagePath = string;
            imWebSharePackage.needImTips = false;
            imWebSharePackage.extras.putString("thumb_url", string);
            shareService.LIZIZ(iMUser, imWebSharePackage, new OY1(interfaceC36488ETs));
        } catch (Exception e) {
            C36922EeM.LJFF(e);
            if (interfaceC36488ETs != null) {
                interfaceC36488ETs.LIZ(0, "catch exception:" + e.getMessage());
            }
        }
    }
}
