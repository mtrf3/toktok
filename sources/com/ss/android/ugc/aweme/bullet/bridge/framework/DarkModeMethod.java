package com.ss.android.ugc.aweme.bullet.bridge.framework;

import X.C45804HyK;
import X.F3T;
import X.InterfaceC37146Ehy;
import X.JF3;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.Window;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class DarkModeMethod extends BaseBridgeMethod {
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
    public DarkModeMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "darkMode";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        Activity activity;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        String optString = params.optString("enable");
        try {
            Context context = getContext();
            Window window = null;
            if (context != null) {
                activity = C45804HyK.LJIJJ(context);
            } else {
                activity = null;
            }
            if (activity != null) {
                window = activity.getWindow();
            }
            JF3.LIZIZ(activity, window, TextUtils.equals(optString, "true"));
            iReturn.onSuccess(new JSONObject());
        } catch (Exception e) {
            iReturn.LIZ(0, e.getMessage());
        }
    }
}
