package com.ss.android.ugc.aweme.fe.method;

import X.C10K;
import X.C38049EwX;
import X.C39061g6;
import X.C49671JeV;
import X.InterfaceC36488ETs;
import X.QD3;
import Y.ACallableS85S0200000_8;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import defpackage.i0;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class OpenAwemeDetailMethod extends BaseCommonJavaMethod {
    public String LJLJI;

    public OpenAwemeDetailMethod() {
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
        EventBus.LIZJ().LJIJ(this);
    }

    public OpenAwemeDetailMethod(C38049EwX c38049EwX) {
        super(c38049EwX);
        this.LJLJI = "";
        EventBus.LIZJ().LJIILJJIL(this);
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

    @QD3
    public final void onEvent(C49671JeV event) {
        o.LJIIIZ(event, "event");
        if (TextUtils.equals(event.LJLIL, this.LJLJI)) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("play_state", event.LJLILLLLZI);
            long j = event.LJLJI;
            if (j < 0) {
                j = 0;
            }
            jSONObject2.put("current_time", Float.valueOf(((float) j) / 1000.0f));
            jSONObject2.put("current_item_id", event.LJLJJI);
            jSONObject2.put("react_id", this.LJLJI);
            jSONObject.put("data", jSONObject2);
            jSONObject.put("eventName", "video_state_change");
            sendEvent("notification", jSONObject, 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        String optString;
        String optString2;
        int i = 1;
        boolean z = false;
        if (jSONObject != null && jSONObject.has("react_id") && ((jSONObject.has("aweme_id") || jSONObject.has("init_index")) && jSONObject.has("enter_from") && 1 != 0)) {
            String optString3 = jSONObject.optString("react_id");
            o.LJIIIIZZ(optString3, "optString(FIELD_REACT_ID)");
            this.LJLJI = optString3;
            if (jSONObject.has("init_index")) {
                optString = jSONObject.optString("aweme_id");
            } else {
                optString = jSONObject.optString("");
            }
            String optString4 = jSONObject.optString("enter_from");
            if (jSONObject.has("init_index")) {
                optString2 = jSONObject.optString("init_index");
            } else {
                optString2 = jSONObject.optString(CardStruct.IStatusCode.DEFAULT);
            }
            C39061g6 c39061g6 = new C39061g6(i0.LJFF("aweme://aweme/detail/", optString));
            c39061g6.LIZIZ("react_session_id", this.LJLJI);
            c39061g6.LIZIZ("index", optString2);
            c39061g6.LIZIZ("page_type", optString4);
            c39061g6.LIZIZ("refer", optString4);
            c39061g6.LIZIZ("video_from", "from_feeds_operate_optimized");
            c39061g6.LIZIZ("entrance_info", jSONObject.optString("entrance_info"));
            if (jSONObject.has("log_extra")) {
                JSONObject jSONObject2 = new JSONObject(jSONObject.optString("log_extra"));
                c39061g6.LIZIZ("carrier_type", jSONObject2.optString("carrier_type"));
                c39061g6.LIZIZ("from_group_id", jSONObject2.optString("from_group_id"));
                c39061g6.LIZIZ("refer_commodity_id", jSONObject2.optString("refer_commodity_id"));
                c39061g6.LIZIZ("data_type", jSONObject2.optString("data_type"));
                c39061g6.LIZIZ("previous_page", jSONObject2.optString("previous_page"));
                c39061g6.LIZIZ("enter_from", jSONObject2.optString("enter_from"));
                c39061g6.LIZIZ("tab_name", jSONObject2.optString("tab_name"));
                c39061g6.LIZIZ("enter_method", jSONObject2.optString("enter_method"));
            }
            if (jSONObject.has("current_time")) {
                c39061g6.LIZ((int) (jSONObject.optDouble("current_time") * 1000.0f), "video_current_position");
            }
            if (jSONObject.has("report_reason")) {
                c39061g6.LIZIZ("ad_report_reason", jSONObject.optString("report_reason"));
            }
            if (jSONObject.has("report_reason_type")) {
                c39061g6.LIZIZ("ad_report_reason_type", jSONObject.optString("report_reason_type"));
            }
            if (jSONObject.has("ace_enter_from")) {
                c39061g6.LIZIZ("ace_enter_from", jSONObject.optString("report_reason_type"));
            }
            if (jSONObject.has("creative_hub_type")) {
                c39061g6.LIZ(jSONObject.optInt("creative_hub_type"), "creative_hub_type");
            }
            if (jSONObject.has("creative_hub_text")) {
                c39061g6.LIZIZ("creative_hub_text", jSONObject.optString("creative_hub_text"));
            }
            if (jSONObject.has("cvh_open_record_id")) {
                c39061g6.LIZIZ("cvh_open_record_id", jSONObject.optString("cvh_open_record_id"));
            }
            C10K.LIZIZ(new ACallableS85S0200000_8(this, c39061g6, 3), C10K.LJIIIIZZ, null);
            z = true;
        }
        if (interfaceC36488ETs != null) {
            JSONObject jSONObject3 = new JSONObject();
            if (!z) {
                i = -1;
            }
            jSONObject3.put("code", i);
            interfaceC36488ETs.LIZIZ(jSONObject3);
        }
    }
}
