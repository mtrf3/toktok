package com.ss.android.ugc.aweme.fe.method;

import X.C118234kV;
import X.C32I;
import X.C38049EwX;
import X.C38281F0r;
import X.C40517FvF;
import X.C49671JeV;
import X.C61200O0e;
import X.C78842Uww;
import X.InterfaceC36488ETs;
import X.ORZ;
import X.QD3;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import defpackage.i0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class OpenShortVideoMethod extends BaseCommonJavaMethod {
    public String LJLJI;

    public OpenShortVideoMethod() {
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

    public OpenShortVideoMethod(C38049EwX c38049EwX) {
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
        if (jSONObject != null && jSONObject.has("current_item_id") && jSONObject.has("item_ids") && jSONObject.has("react_id") && 1 != 0) {
            this.LJLJI = jSONObject.optString("react_id");
            String optString = jSONObject.optString("current_item_id");
            JSONArray optJSONArray = jSONObject.optJSONArray("item_ids");
            String optString2 = jSONObject.optString("enter_from");
            C38281F0r c38281F0r = new C38281F0r(i0.LJFF("aweme://aweme/detaillist/", optString));
            c38281F0r.LIZLLL("react_session_id", this.LJLJI);
            int length = optJSONArray.length();
            if (length > 0) {
                C40517FvF LJJ = C78842Uww.LJJ(0, length);
                ArrayList arrayList = new ArrayList(C32I.LJJL(LJJ, 10));
                C118234kV it = LJJ.iterator();
                while (it.LJLJI) {
                    arrayList.add(optJSONArray.get(it.nextInt()));
                }
                c38281F0r.LIZLLL("ids", ORZ.LLD(arrayList, ",", null, null, null, 62));
            }
            if (jSONObject.has("current_time")) {
                c38281F0r.LIZ((int) (jSONObject.optDouble("current_time") * 1000.0f), "video_current_position");
            }
            if (optString2 != null) {
                c38281F0r.LIZLLL("enter_from", optString2);
            }
            if (jSONObject.has("tracker_data")) {
                c38281F0r.LIZLLL("tracker_data", jSONObject.optString("tracker_data"));
            }
            c38281F0r.LIZLLL("video_from", "commerce_general");
            c38281F0r.LIZLLL("from_group_id", jSONObject.optString("from_group_id"));
            c38281F0r.LIZLLL("carrier_type", jSONObject.optString("carrier_type"));
            c38281F0r.LIZLLL("refer_commodity_id", jSONObject.optString("refer_commodity_id"));
            c38281F0r.LIZLLL("data_type", jSONObject.optString("data_type"));
            c38281F0r.LIZLLL("previous_page", jSONObject.optString("previous_page"));
            c38281F0r.LIZLLL("enter_method", jSONObject.optString("enter_method"));
            c38281F0r.LIZLLL("auto_route_schema", jSONObject.optString("auto_route_schema"));
            C61200O0e.LIZLLL().LJII(c38281F0r.LJ());
        }
        if (interfaceC36488ETs != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", 1);
            interfaceC36488ETs.LIZIZ(jSONObject2);
        }
    }
}
