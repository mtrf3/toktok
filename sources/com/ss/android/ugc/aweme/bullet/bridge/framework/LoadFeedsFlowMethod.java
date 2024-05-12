package com.ss.android.ugc.aweme.bullet.bridge.framework;

import X.C221108m2;
import X.C45804HyK;
import X.C51621KNt;
import X.C61878OQg;
import X.C62822Ol8;
import X.C8BS;
import X.ETR;
import X.F3T;
import X.InterfaceC37146Ehy;
import X.InterfaceC51622KNu;
import X.ORY;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.fe.method.feeds.pojo.FeedsResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class LoadFeedsFlowMethod extends BaseBridgeMethod implements InterfaceC51622KNu {
    public final String LJLIL;
    public String LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.AbstractC37121EhZ, X.InterfaceC37788EsK
    public final void release() {
        Activity LJIJJ;
        super.release();
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
    public LoadFeedsFlowMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "loadFeedsFlow";
        this.LJLILLLLZI = "";
        this.LJLJI = C221108m2.LIZIZ(new AqS156S0100000_6(this, 28));
        Object context = getContext();
        if ((context instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) context) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
        this.LJLJJI = C221108m2.LIZIZ(ETR.LJLIL);
    }

    @Override // X.InterfaceC51622KNu
    public final void LIZ(JSONObject jSONObject) {
        sendEvent("notification", jSONObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        Activity LJIJJ;
        List<? extends Aweme> list;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        int i = 1;
        boolean z = false;
        if (params.has("react_id") && params.has("has_more") && params.has("aweme_list") && params.has("page")) {
            if (!TextUtils.isEmpty(this.LJLILLLLZI) && !TextUtils.equals(this.LJLILLLLZI, params.optString("react_id"))) {
                ((FeedsResponse) ((C8BS) this.LJLJI.getValue()).mData).list.clear();
            }
            String optString = params.optString("react_id");
            o.LJIIIIZZ(optString, "optString(FIELD_REACT_ID)");
            this.LJLILLLLZI = optString;
            C51621KNt c51621KNt = (C51621KNt) this.LJLJI.getValue();
            Object[] objArr = (Object[]) GsonProtectorUtils.fromJson((Gson) this.LJLJJI.getValue(), params.optString("aweme_list"), Aweme[].class);
            if (objArr == null || (list = ORY.LJJZZIII(objArr)) == null) {
                list = C61878OQg.INSTANCE;
            }
            c51621KNt.LJIIJ(list, params.optInt("page", 0), params.optBoolean("has_more", false), params.optBoolean("insert_before", false));
            z = true;
        }
        Context context = getContext();
        if (context != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null) {
            LJIJJ.findViewById(R.id.content).setTag(com.zhiliaoapp.musically.R.id.asv, this.LJLJI.getValue());
        }
        JSONObject jSONObject = new JSONObject();
        if (!z) {
            i = -1;
        }
        jSONObject.put("code", i);
        iReturn.LIZIZ(jSONObject);
    }
}
