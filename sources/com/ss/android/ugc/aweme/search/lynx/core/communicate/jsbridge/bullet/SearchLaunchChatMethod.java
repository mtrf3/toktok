package com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet;

import X.C221108m2;
import X.C50345JpN;
import X.C50603JtX;
import X.C62822Ol8;
import X.C98593tv;
import X.F2Y;
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
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class SearchLaunchChatMethod extends BaseBridgeMethod {
    public final C62822Ol8 LJLIL;
    public final String LJLILLLLZI;
    public final C50345JpN LJLJI;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return this.LJLILLLLZI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchLaunchChatMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = C221108m2.LIZIZ(new AqS158S0100000_8(contextProviderFactory, 179));
        this.LJLILLLLZI = "searchLaunchChat";
        this.LJLJI = new C50345JpN(contextProviderFactory, "searchLaunchChat");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        Context context;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        if (this.LJLJI.LIZ(params, iReturn)) {
            return;
        }
        F2Y f2y = (F2Y) this.LJLIL.getValue();
        if (f2y != null) {
            context = (Context) f2y.LIZIZ();
        } else {
            context = null;
        }
        if (context == null) {
            iReturn.LIZ(0, "no params found");
            return;
        }
        IMUser iMUser = new IMUser();
        iMUser.setUid(params.optString("uid"));
        iMUser.setNickName(params.optString("nick_name"));
        String enterFrom = params.optString("enter_from", "search");
        String enterMethod = params.optString("enter_method", "button");
        iMUser.setFake(true);
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            if (context instanceof Activity) {
                J9P.LIZIZ((Activity) context, enterFrom, enterMethod, null, new C50603JtX(this, context, iMUser, enterFrom, enterMethod, iReturn));
            }
        } else {
            o.LJIIIIZZ(enterFrom, "enterFrom");
            o.LJIIIIZZ(enterMethod, "enterMethod");
            if (LIZJ(context, iMUser, enterFrom, enterMethod)) {
                iReturn.onSuccess(1);
            } else {
                iReturn.LIZ(0, "open chat fail");
            }
        }
    }

    public static boolean LIZJ(Context context, IMUser iMUser, String str, String str2) {
        if (context == null) {
            return false;
        }
        InterfaceC98813uH imChatService = IMService.createIIMServicebyMonsterPlugin(false).getImChatService();
        C98593tv c98593tv = new C98593tv(context, iMUser);
        c98593tv.setEnterFromForMob(str);
        c98593tv.setEnterMethodForMob(str2);
        c98593tv.setNoEvent(true);
        imChatService.LJFF(c98593tv);
        return true;
    }
}
