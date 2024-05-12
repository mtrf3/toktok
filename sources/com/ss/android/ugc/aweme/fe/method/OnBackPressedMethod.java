package com.ss.android.ugc.aweme.fe.method;

import X.C38049EwX;
import X.C40329FsD;
import X.InterfaceC36488ETs;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class OnBackPressedMethod extends BaseCommonJavaMethod {
    public OnBackPressedMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        CrossPlatformActivity crossPlatformActivity;
        Context actContext = getActContext();
        if (!(actContext instanceof CrossPlatformActivity) || (crossPlatformActivity = (CrossPlatformActivity) actContext) == null) {
            return;
        }
        crossPlatformActivity.LJLJL = null;
    }

    public OnBackPressedMethod(C38049EwX c38049EwX) {
        super(c38049EwX);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final BaseCommonJavaMethod attach(WeakReference<Context> contextRef) {
        o.LJIIIZ(contextRef, "contextRef");
        Object obj = (Context) contextRef.get();
        if (obj instanceof LifecycleOwner) {
            ((LifecycleOwner) obj).getLifecycle().addObserver(this);
        }
        super.attach(contextRef);
        o.LJIIIIZZ(this, "super.attach(contextRef)");
        return this;
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        CrossPlatformActivity crossPlatformActivity;
        if (jSONObject == null || interfaceC36488ETs == null) {
            return;
        }
        Context actContext = getActContext();
        if (!(actContext instanceof CrossPlatformActivity) || (crossPlatformActivity = (CrossPlatformActivity) actContext) == null) {
            return;
        }
        int optInt = jSONObject.optInt("actionType", 0);
        if (optInt == 0) {
            crossPlatformActivity.LJLJL = null;
        } else {
            crossPlatformActivity.LJLJL = new C40329FsD(this, optInt);
        }
    }
}
