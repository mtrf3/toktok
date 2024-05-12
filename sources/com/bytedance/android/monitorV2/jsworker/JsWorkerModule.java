package com.bytedance.android.monitorV2.jsworker;

import X.C37712Er6;
import X.C79605VMb;
import X.InterfaceC37580Eoy;
import X.VNS;
import android.content.Context;
import android.view.View;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import com.bytedance.vmsdk.jsbridge.JSModule;
import com.bytedance.vmsdk.jsbridge.utils.Callback;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyMap;
import com.bytedance.vmsdk.jsbridge.utils.ReadableMap;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class JsWorkerModule extends JSModule {
    public static final C37712Er6 Companion = new C37712Er6();
    public static final String NAME = "hybridMonitor";
    public final Queue<JSONObject> mPendingEvents;
    public WeakReference<View> mViewRef;

    public final synchronized void fireAllEvents() {
        while (!this.mPendingEvents.isEmpty()) {
            reportInternally(this.mPendingEvents.poll());
        }
    }

    private final void reportInternally(JSONObject jSONObject) {
        View view;
        if (jSONObject != null) {
            String optString = jSONObject.optString("eventName", "");
            JSONObject optJSONObject = jSONObject.optJSONObject("metrics");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("category");
            int optInt = jSONObject.optInt("level", -1);
            String optString2 = jSONObject.optString("bid", "");
            if (!o.LJ(optString, "")) {
                C79605VMb c79605VMb = new C79605VMb(optString);
                if (optJSONObject != null) {
                    c79605VMb.LJ = optJSONObject;
                }
                if (optJSONObject2 != null) {
                    c79605VMb.LJ = optJSONObject2;
                }
                if (optInt != -1) {
                    c79605VMb.LIZIZ(optInt);
                }
                if (!o.LJ(optString2, "")) {
                    c79605VMb.LIZIZ = optString2;
                }
                WeakReference<View> weakReference = this.mViewRef;
                if (weakReference == null || (view = weakReference.get()) == null) {
                    HybridMultiMonitor.getInstance().customReport(c79605VMb.LIZ());
                } else {
                    if (!(view instanceof VNS)) {
                        return;
                    }
                    LynxViewMonitor.Companion.getClass();
                    LynxViewMonitor.INSTANCE.reportCustom((VNS) view, c79605VMb.LIZ());
                }
            }
        }
    }

    public final void onAttachView(View view) {
        o.LJIIJ(view, "view");
        this.mViewRef = new WeakReference<>(view);
        fireAllEvents();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsWorkerModule(Context ctx, Object obj) {
        super(ctx, obj);
        o.LJIIJ(ctx, "ctx");
        this.mPendingEvents = new LinkedList();
    }

    private final JavaOnlyMap callbackResponse(int i, String str) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putInt("errorCode", i);
        javaOnlyMap.putString("errorMessage", str);
        return javaOnlyMap;
    }

    @InterfaceC37580Eoy
    public final void customReport(ReadableMap readableMap, Callback callback) {
        HashMap<String, Object> hashMap;
        if (readableMap != null) {
            hashMap = readableMap.toHashMap();
        } else {
            hashMap = null;
        }
        if (hashMap != null) {
            JSONObject jSONObject = new JSONObject(hashMap);
            if (this.mViewRef != null) {
                reportInternally(jSONObject);
            } else {
                this.mPendingEvents.add(jSONObject);
            }
            if (callback != null) {
                callback.invoke(callbackResponse(0, "success"));
                return;
            }
            return;
        }
        if (callback == null) {
            return;
        }
        callback.invoke(callbackResponse(-1, "bad parameters"));
    }
}
