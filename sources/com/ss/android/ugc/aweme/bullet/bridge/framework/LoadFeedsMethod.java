package com.ss.android.ugc.aweme.bullet.bridge.framework;

import X.C221108m2;
import X.C45804HyK;
import X.C51648KOu;
import X.C62822Ol8;
import X.C8BS;
import X.F3T;
import X.InterfaceC37146Ehy;
import X.InterfaceC51622KNu;
import android.R;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.fe.method.feeds.pojo.FeedsResponse;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class LoadFeedsMethod extends BaseBridgeMethod implements InterfaceC51622KNu {
    public final String LJLIL;
    public String LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.AbstractC37121EhZ, X.InterfaceC37788EsK
    public final void release() {
        Activity LJIJJ;
        super.release();
        ((C51648KOu) this.LJLJI.getValue()).LJLJI.dispose();
        Context context = getContext();
        if (context != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null) {
            LJIJJ.findViewById(R.id.content).setTag(com.zhiliaoapp.musically.R.id.asv, null);
        }
    }

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadFeedsMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "loadFeeds";
        this.LJLILLLLZI = "";
        this.LJLJI = C221108m2.LIZIZ(new AqS156S0100000_6(this, 29));
        Object context = getContext();
        if ((context instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) context) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
    }

    @Override // X.InterfaceC51622KNu
    public final void LIZ(JSONObject jSONObject) {
        sendEvent("notification", jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        int i = 1;
        boolean z = false;
        if (params.has("base_url") && params.has("react_id") && params.has("page") && params.has("size") && !params.optBoolean("clear", false)) {
            Activity activity = null;
            if (1 != 0) {
                String optString = params.optString("react_id");
                o.LJIIIIZZ(optString, "optString(FIELD_REACT_ID)");
                this.LJLILLLLZI = optString;
                String baseUrl = params.optString("base_url");
                int optInt = params.optInt("page");
                int optInt2 = params.optInt("size");
                ((FeedsResponse) ((C8BS) this.LJLJI.getValue()).getData()).list.clear();
                C51648KOu c51648KOu = (C51648KOu) this.LJLJI.getValue();
                o.LJIIIIZZ(baseUrl, "baseUrl");
                Context context = getContext();
                if (context != null) {
                    activity = C45804HyK.LJIJJ(context);
                }
                o.LJI(activity);
                c51648KOu.LJIIIZ(baseUrl, optInt, optInt2, activity);
                z = true;
            }
        }
        JSONObject jSONObject = new JSONObject();
        if (!z) {
            i = -1;
        }
        jSONObject.put("code", i);
        iReturn.LIZIZ(jSONObject);
    }
}
