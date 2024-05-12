package com.ss.android.ugc.aweme.fe.method;

import X.AbstractC51036K1g;
import X.C10K;
import X.C38049EwX;
import X.C39061g6;
import X.C49671JeV;
import X.FMX;
import X.InterfaceC36488ETs;
import X.QD3;
import Y.ACallableS85S0200000_8;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.fe.method.feeds.pojo.FeedsResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import defpackage.i0;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class OpenFeedsFlowMethod extends BaseCommonJavaMethod {
    public String LJLJI;

    public OpenFeedsFlowMethod() {
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

    public OpenFeedsFlowMethod(C38049EwX c38049EwX) {
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        AbstractC51036K1g abstractC51036K1g;
        String aid;
        int i = 1;
        boolean z = false;
        if (jSONObject != null && jSONObject.has("react_id") && jSONObject.has("enter_from") && 1 != 0) {
            String optString = jSONObject.optString("react_id");
            o.LJIIIIZZ(optString, "optString(FIELD_REACT_ID)");
            this.LJLJI = optString;
            Activity activity = (Activity) getActContext();
            if (activity == null || (abstractC51036K1g = (AbstractC51036K1g) activity.findViewById(R.id.content).getTag(com.zhiliaoapp.musically.R.id.asv)) == null) {
                return;
            }
            if (abstractC51036K1g.getItems().size() <= 0) {
                if (TextUtils.equals(jSONObject.optString("enter_from"), "feed_low_quality")) {
                    FMX.onEventV3("ads_specialist_show_fail");
                    return;
                }
                return;
            }
            if (jSONObject.has("aweme_id")) {
                aid = jSONObject.optString("aweme_id");
            } else {
                aid = ((Aweme) ListProtector.get(abstractC51036K1g.getItems(), 0)).getAid();
            }
            String optString2 = jSONObject.optString("enter_from");
            C39061g6 c39061g6 = new C39061g6(i0.LJFF("aweme://aweme/detail/", aid));
            c39061g6.LIZIZ("react_session_id", this.LJLJI);
            c39061g6.LIZIZ("page_type", optString2);
            c39061g6.LIZIZ("refer", optString2);
            c39061g6.LIZIZ("video_from", "from_feeds_operate");
            c39061g6.LIZIZ("from_group_id", jSONObject.optString("from_group_id"));
            c39061g6.LIZIZ("carrier_type", jSONObject.optString("carrier_type"));
            c39061g6.LIZIZ("refer_commodity_id", jSONObject.optString("refer_commodity_id"));
            c39061g6.LIZIZ("data_type", jSONObject.optString("data_type"));
            c39061g6.LIZIZ("previous_page", jSONObject.optString("previous_page"));
            c39061g6.LIZIZ("enter_method", jSONObject.optString("enter_method"));
            c39061g6.LIZ(((FeedsResponse) abstractC51036K1g.getData()).isNewUser ? 1 : 0, "is_new_low_quality_user");
            if (jSONObject.has("current_time")) {
                c39061g6.LIZ((int) (jSONObject.optDouble("current_time") * 1000.0f), "video_current_position");
            }
            C10K.LIZIZ(new ACallableS85S0200000_8(this, c39061g6, 4), C10K.LJIIIIZZ, null);
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
