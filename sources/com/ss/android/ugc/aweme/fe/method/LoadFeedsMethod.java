package com.ss.android.ugc.aweme.fe.method;

import X.C221108m2;
import X.C38049EwX;
import X.C51648KOu;
import X.C62822Ol8;
import X.C8BS;
import X.InterfaceC36488ETs;
import X.InterfaceC51622KNu;
import android.R;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.fe.method.feeds.pojo.FeedsResponse;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class LoadFeedsMethod extends BaseCommonJavaMethod implements InterfaceC51622KNu {
    public final C62822Ol8 LJLJI;
    public String LJLJJI;

    public LoadFeedsMethod() {
        this(null);
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
        ((C51648KOu) this.LJLJI.getValue()).LJLJI.dispose();
        Activity activity = (Activity) getActContext();
        if (activity != null) {
            activity.findViewById(R.id.content).setTag(com.zhiliaoapp.musically.R.id.asv, null);
        }
    }

    public LoadFeedsMethod(C38049EwX c38049EwX) {
        super(c38049EwX);
        this.LJLJI = C221108m2.LIZIZ(new AqS156S0100000_6(this, 40));
        this.LJLJJI = "";
    }

    @Override // X.InterfaceC51622KNu
    public final void LIZ(JSONObject jSONObject) {
        sendEvent("notification", jSONObject, 3);
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
        int i = 1;
        boolean z = false;
        if (jSONObject != null && jSONObject.has("base_url") && jSONObject.has("react_id") && jSONObject.has("page") && jSONObject.has("size") && !jSONObject.optBoolean("clear", false)) {
            String optString = jSONObject.optString("react_id");
            o.LJIIIIZZ(optString, "optString(FIELD_REACT_ID)");
            this.LJLJJI = optString;
            String baseUrl = jSONObject.optString("base_url");
            int optInt = jSONObject.optInt("page");
            int optInt2 = jSONObject.optInt("size");
            ((FeedsResponse) ((C8BS) this.LJLJI.getValue()).getData()).list.clear();
            C51648KOu c51648KOu = (C51648KOu) this.LJLJI.getValue();
            o.LJIIIIZZ(baseUrl, "baseUrl");
            Context actContext = getActContext();
            o.LJII(actContext, "null cannot be cast to non-null type android.app.Activity");
            c51648KOu.LJIIIZ(baseUrl, optInt, optInt2, (Activity) actContext);
            z = true;
        }
        if (interfaceC36488ETs != null) {
            JSONObject jSONObject2 = new JSONObject();
            if (!z) {
                i = -1;
            }
            jSONObject2.put("code", i);
            interfaceC36488ETs.LIZIZ(jSONObject2);
        }
    }
}
