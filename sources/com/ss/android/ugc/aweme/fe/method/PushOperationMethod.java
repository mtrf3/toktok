package com.ss.android.ugc.aweme.fe.method;

import X.C279017q;
import X.C38049EwX;
import X.C40322Fs6;
import X.C62905OmT;
import X.C67142kI;
import X.C68322mC;
import X.FMX;
import X.InterfaceC36488ETs;
import X.OQJ;
import X.OQK;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class PushOperationMethod extends BaseCommonJavaMethod {
    public String LJLJI;

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public PushOperationMethod(C38049EwX c38049EwX) {
        super(c38049EwX);
        this.LJLJI = "";
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [org.json.JSONObject, T] */
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject params, InterfaceC36488ETs iReturn) {
        Context context;
        Activity activity;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        WeakReference<Context> weakReference = this.mContextRef;
        if (weakReference != null) {
            context = weakReference.get();
        } else {
            context = null;
        }
        String optString = params.optString("track_info", "");
        o.LJIIIIZZ(optString, "params.optString(\"track_info\", \"\")");
        this.LJLJI = optString;
        if (!(context instanceof Activity) || (activity = (Activity) context) == null || activity.isFinishing()) {
            iReturn.LIZ(0, null);
            return;
        }
        if (!C40322Fs6.LIZJ(activity)) {
            C62905OmT c62905OmT = new C62905OmT(activity);
            C68322mC c68322mC = new C68322mC();
            ?? jSONObject = new JSONObject();
            c68322mC.element = jSONObject;
            jSONObject.put("code", 1);
            c62905OmT.LJ(R.string.r16);
            c62905OmT.LIZ(R.string.r19);
            c62905OmT.LJIIJ(R.string.r18, new OQJ(this, c68322mC, iReturn, activity));
            c62905OmT.LJII(R.string.r17, new OQK(this, c68322mC, iReturn));
            C279017q.LIZLLL(c62905OmT);
            String str = this.LJLJI;
            HashMap hashMap = new HashMap();
            C67142kI.LIZ(str, hashMap);
            FMX.LJIIL("push_pre_permission_show", hashMap);
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", 1);
        jSONObject2.put("auth_result", 1);
        iReturn.LIZIZ(jSONObject2);
    }
}
