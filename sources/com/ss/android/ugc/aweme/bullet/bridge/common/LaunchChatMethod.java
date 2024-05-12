package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.C50907JyR;
import X.C98593tv;
import X.F3T;
import X.HG3;
import X.InterfaceC37146Ehy;
import X.InterfaceC98813uH;
import X.J9P;
import X.RBX;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class LaunchChatMethod extends BaseBridgeMethod {
    public final String LJLIL;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LaunchChatMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "launchChat";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        String str;
        int i;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        Context context = (Context) this.contextProviderFactory.LIZJ(Context.class);
        IMUser iMUser = new IMUser();
        iMUser.setUid(params.optString("uid"));
        iMUser.setNickName(params.optString("nick_name"));
        iMUser.setSignature(params.optString("alias"));
        iMUser.setFake(true);
        boolean optBoolean = params.optBoolean("is_author_service");
        if (optBoolean) {
            str = "message";
        } else {
            str = "";
        }
        if (optBoolean) {
            i = 12;
        } else {
            i = 0;
        }
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            if (context != null && (context instanceof Activity)) {
                J9P.LIZIZ((Activity) context, str, "click_chat_button", null, new C50907JyR(this, context, iMUser, i, iReturn));
                return;
            }
            return;
        }
        if (context == null) {
            iReturn.LIZ(0, "open chat fail");
            return;
        }
        InterfaceC98813uH imChatService = IMService.createIIMServicebyMonsterPlugin(false).getImChatService();
        C98593tv c98593tv = new C98593tv(context, iMUser);
        c98593tv.setEnterFrom(i);
        imChatService.LJFF(c98593tv);
        iReturn.onSuccess(1);
    }
}
