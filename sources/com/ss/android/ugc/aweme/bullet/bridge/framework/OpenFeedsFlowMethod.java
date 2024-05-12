package com.ss.android.ugc.aweme.bullet.bridge.framework;

import X.C10K;
import X.C39061g6;
import X.C45804HyK;
import X.C49671JeV;
import X.C51648KOu;
import X.F3T;
import X.FMX;
import X.InterfaceC37146Ehy;
import X.QD3;
import Y.ACallableS85S0200000_8;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import defpackage.i0;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class OpenFeedsFlowMethod extends BaseBridgeMethod {
    public final String LJLIL;
    public String LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final C51648KOu LIZJ() {
        Activity LJIJJ;
        Context context = getContext();
        if (context != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null) {
            return (C51648KOu) LJIJJ.findViewById(R.id.content).getTag(com.zhiliaoapp.musically.R.id.asv);
        }
        return null;
    }

    @Override // X.AbstractC37121EhZ, X.InterfaceC37788EsK
    public final void release() {
        super.release();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenFeedsFlowMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "openFeedsFlow";
        this.LJLILLLLZI = "";
        Object context = getContext();
        if ((context instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) context) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @QD3
    public final void onEvent(C49671JeV event) {
        o.LJIIIZ(event, "event");
        if (TextUtils.equals(event.LJLIL, this.LJLILLLLZI)) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("play_state", event.LJLILLLLZI);
            long j = event.LJLJI;
            if (j < 0) {
                j = 0;
            }
            jSONObject2.put("current_time", Float.valueOf(((float) j) / 1000.0f));
            jSONObject2.put("current_item_id", event.LJLJJI);
            jSONObject2.put("react_id", this.LJLILLLLZI);
            jSONObject.put("data", jSONObject2);
            jSONObject.put("eventName", "video_state_change");
            sendEvent("notification", jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        String aid;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        int i = 1;
        boolean z = false;
        if (params.has("react_id") && params.has("enter_from") && 1 != 0) {
            String optString = params.optString("react_id");
            o.LJIIIIZZ(optString, "optString(FIELD_REACT_ID)");
            this.LJLILLLLZI = optString;
            C51648KOu LIZJ = LIZJ();
            if (LIZJ == null) {
                return;
            }
            if (LIZJ.getItems().size() <= 0) {
                if (TextUtils.equals(params.optString("enter_from"), "feed_low_quality")) {
                    FMX.onEventV3("ads_specialist_show_fail");
                    return;
                }
                return;
            }
            if (params.has("aweme_id")) {
                aid = params.optString("aweme_id");
            } else {
                aid = ((Aweme) ListProtector.get(LIZJ.getItems(), 0)).getAid();
            }
            String optString2 = params.optString("enter_from");
            C39061g6 c39061g6 = new C39061g6(i0.LJFF("aweme://aweme/detail/", aid));
            c39061g6.LIZIZ("react_session_id", this.LJLILLLLZI);
            c39061g6.LIZIZ("page_type", optString2);
            c39061g6.LIZIZ("refer", optString2);
            c39061g6.LIZIZ("video_from", "from_feeds_operate");
            c39061g6.LIZIZ("from_group_id", params.optString("from_group_id"));
            c39061g6.LIZIZ("carrier_type", params.optString("carrier_type"));
            c39061g6.LIZIZ("refer_commodity_id", params.optString("refer_commodity_id"));
            c39061g6.LIZIZ("data_type", params.optString("data_type"));
            c39061g6.LIZIZ("previous_page", params.optString("previous_page"));
            c39061g6.LIZ(LIZJ.getData().isNewUser ? 1 : 0, "is_new_low_quality_user");
            if (params.has("current_time")) {
                c39061g6.LIZ((int) (params.optDouble("current_time") * 1000.0f), "video_current_position");
            }
            C10K.LIZIZ(new ACallableS85S0200000_8(this, c39061g6, 1), C10K.LJIIIIZZ, null);
            z = true;
        }
        JSONObject jSONObject = new JSONObject();
        if (!z) {
            i = -1;
        }
        jSONObject.put("code", i);
        iReturn.LIZIZ(jSONObject);
    }
}
