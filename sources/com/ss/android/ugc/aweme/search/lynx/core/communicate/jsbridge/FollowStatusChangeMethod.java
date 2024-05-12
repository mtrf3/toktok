package com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge;

import X.ActivityC45651qj;
import X.C2U8;
import X.C50345JpN;
import X.C84763XOl;
import X.F3T;
import X.InterfaceC37146Ehy;
import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.userservice.UserService;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class FollowStatusChangeMethod extends BaseBridgeMethod {
    public static final JSONObject LJLJI = new JSONObject();
    public final String LJLIL;
    public final C50345JpN LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowStatusChangeMethod(F3T factory) {
        super(factory);
        o.LJIIIZ(factory, "factory");
        this.LJLIL = "userFollowNotice";
        this.LJLILLLLZI = new C50345JpN(this.contextProviderFactory, "userFollowNotice");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        ActivityC45651qj activityC45651qj;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        if (this.LJLILLLLZI.LIZ(params, iReturn)) {
            return;
        }
        String it = params.optString("id");
        o.LJIIIIZZ(it, "it");
        if (it.length() > 0 && 1 != 0) {
            Integer valueOf = Integer.valueOf(params.optInt("status", LiveLayoutPreloadThreadPriority.DEFAULT));
            if (valueOf.intValue() != Integer.MIN_VALUE) {
                int intValue = valueOf.intValue();
                Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                if (!(LJIIIIZZ instanceof ActivityC45651qj) || (activityC45651qj = (ActivityC45651qj) LJIIIIZZ) == null) {
                    iReturn.LIZ(0, "Failed retrieving current Activity");
                    return;
                }
                ((SearchGlobalViewModel) ViewModelProviders.of(activityC45651qj).get(SearchGlobalViewModel.class)).pv0(intValue, it);
                FollowStatus followStatus = new FollowStatus(it, intValue);
                C2U8.LIZ(new FollowStatusEvent(followStatus));
                UserService.LIZ().LJFF().postValue(followStatus);
                iReturn.onSuccess(LJLJI);
                return;
            }
            iReturn.LIZ(0, "Param \"status\" not found");
            return;
        }
        iReturn.LIZ(0, "Param \"id\" not found");
    }
}
