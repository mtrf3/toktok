package com.ss.android.ugc.aweme.fe.method;

import X.C38049EwX;
import X.C39061g6;
import X.C45804HyK;
import X.C61200O0e;
import X.HG3;
import X.InterfaceC36488ETs;
import X.RBX;
import X.V1B;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class EnterUserPostFeedsMethod extends BaseCommonJavaMethod {
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public EnterUserPostFeedsMethod(C38049EwX c38049EwX) {
        super(c38049EwX);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        Activity LJIJJ;
        String str;
        WeakReference<Context> weakReference = this.mContextRef;
        Context context = null;
        if (weakReference != null) {
            context = weakReference.get();
        }
        if (!(context instanceof Activity) || (LJIJJ = C45804HyK.LJIJJ(context)) == null || !V1B.LJJZZI(LJIJJ, true)) {
            return;
        }
        String optString = jSONObject.optString("user_id");
        int optInt = jSONObject.optInt("task");
        C61200O0e LIZLLL = C61200O0e.LIZLLL();
        C39061g6 c39061g6 = new C39061g6("aweme://aweme/detail/0");
        if (TextUtils.equals(((RBX) HG3.LJIILL()).getCurUserId(), optString)) {
            str = "from_profile_self";
        } else {
            str = "from_profile_other";
        }
        c39061g6.LIZIZ("video_from", str);
        c39061g6.LIZ(0, "video_type");
        c39061g6.LIZIZ("userid", optString);
        c39061g6.LIZ(optInt, "task_type");
        LIZLLL.LJI(LJIJJ, c39061g6.LIZJ());
    }
}
