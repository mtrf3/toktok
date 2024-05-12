package com.ss.android.ugc.aweme.fe.method;

import X.C38049EwX;
import X.C40271FrH;
import X.InterfaceC36488ETs;
import X.InterfaceC40288FrY;
import X.NP7;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class JsAppDownloadMethod extends BaseCommonJavaMethod implements InterfaceC40288FrY {
    public C40271FrH LJLJI;

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        WeakReference<Context> weakReference;
        if (this.LJLJI != null && (weakReference = this.mContextRef) != null && weakReference.get() != null) {
            this.LJLJI.getClass();
            this.LJLJI = null;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        C40271FrH c40271FrH = this.LJLJI;
        if (c40271FrH != null) {
            c40271FrH.getClass();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        WeakReference<Context> weakReference;
        if (this.LJLJI != null && (weakReference = this.mContextRef) != null && weakReference.get() != null) {
            C40271FrH c40271FrH = this.LJLJI;
            this.mContextRef.get();
            c40271FrH.getClass();
        }
    }

    public JsAppDownloadMethod(C38049EwX c38049EwX) {
        super(c38049EwX);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final BaseCommonJavaMethod attach(WeakReference<Context> weakReference) {
        Object obj = (Context) weakReference.get();
        if (obj instanceof LifecycleOwner) {
            ((LifecycleOwner) obj).getLifecycle().addObserver(this);
        }
        super.attach(weakReference);
        return this;
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        WeakReference<Context> weakReference = this.mContextRef;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        if (this.LJLJI == null) {
            this.mContextRef.get();
            this.LJLJI = new C40271FrH(this);
        }
        String optString = jSONObject.optString("func");
        if (TextUtils.equals("subscribe_app_ad", optString)) {
            C40271FrH c40271FrH = this.LJLJI;
            Context context = this.mContextRef.get();
            c40271FrH.getClass();
            if (context == null) {
                return;
            }
            new NP7().LIZ(jSONObject.optJSONObject("data"));
            return;
        }
        if (TextUtils.equals("unsubscribe_app_ad", optString)) {
            if (this.LJLJI == null) {
                return;
            }
            new NP7().LIZ(jSONObject.optJSONObject("data"));
            return;
        }
        if (TextUtils.equals("cancel_download_app_ad", optString)) {
            C40271FrH c40271FrH2 = this.LJLJI;
            if (c40271FrH2 == null || c40271FrH2.LIZ == null) {
                return;
            }
            new NP7().LIZ(jSONObject.optJSONObject("data"));
            return;
        }
        if (TextUtils.equals("get_download_pause_task", optString) || TextUtils.equals("get_downloading_task", optString) || !TextUtils.equals("get_install_status", optString) || this.LJLJI == null || jSONObject.length() == 0) {
            return;
        }
        jSONObject.optJSONArray("task_list");
    }
}
