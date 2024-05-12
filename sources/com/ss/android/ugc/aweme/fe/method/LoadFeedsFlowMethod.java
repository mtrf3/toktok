package com.ss.android.ugc.aweme.fe.method;

import X.C16880lQ;
import X.C221108m2;
import X.C38049EwX;
import X.C51621KNt;
import X.C61878OQg;
import X.C62822Ol8;
import X.C63081OpJ;
import X.ETQ;
import X.InterfaceC36488ETs;
import X.InterfaceC51622KNu;
import X.ORY;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.fe.method.feeds.pojo.FeedsResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class LoadFeedsFlowMethod extends BaseCommonJavaMethod implements InterfaceC51622KNu {
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public String LJLJJL;

    public LoadFeedsFlowMethod() {
        this(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final C51621KNt LIZIZ() {
        return (C51621KNt) this.LJLJI.getValue();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        Activity activity = (Activity) getActContext();
        if (activity != null) {
            activity.findViewById(R.id.content).setTag(com.zhiliaoapp.musically.R.id.asv, null);
        }
    }

    public LoadFeedsFlowMethod(C38049EwX c38049EwX) {
        super(c38049EwX);
        this.LJLJI = C221108m2.LIZIZ(new AqS156S0100000_6(this, 39));
        this.LJLJJI = C221108m2.LIZIZ(ETQ.LJLIL);
        this.LJLJJL = "";
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        List<? extends Aweme> list;
        int i = 1;
        boolean z = false;
        if (jSONObject != null && jSONObject.has("react_id") && jSONObject.has("has_more") && jSONObject.has("aweme_list") && jSONObject.has("page") && 1 != 0) {
            if (!TextUtils.isEmpty(this.LJLJJL) && !TextUtils.equals(this.LJLJJL, jSONObject.optString("react_id"))) {
                ((FeedsResponse) LIZIZ().mData).list.clear();
            }
            String optString = jSONObject.optString("react_id");
            o.LJIIIIZZ(optString, "optString(FIELD_REACT_ID)");
            this.LJLJJL = optString;
            if (jSONObject.has("clear_data") && jSONObject.optInt("clear_data") == 1) {
                ((FeedsResponse) LIZIZ().mData).list.clear();
            }
            if (jSONObject.has("delete_data")) {
                try {
                    C51621KNt LIZIZ = LIZIZ();
                    JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "delete_data");
                    o.LJIIIIZZ(jSONArray, "getJSONArray(FIELD_DELETE_DATA)");
                    LIZIZ.LJIIIZ(JsonExtKt.toList(jSONArray));
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            Object[] objArr = (Object[]) GsonProtectorUtils.fromJson((Gson) this.LJLJJI.getValue(), jSONObject.optString("aweme_list"), Aweme[].class);
            if (objArr == null || (list = ORY.LJJZZIII(objArr)) == null) {
                list = C61878OQg.INSTANCE;
            }
            if (list.isEmpty()) {
                list = C61878OQg.INSTANCE;
            } else if (C63081OpJ.LJLL((Aweme) ListProtector.get(list, 0)) && !TextUtils.isEmpty(((Aweme) ListProtector.get(list, 0)).getCommerceVideoAuthInfo().getItemId())) {
                ArrayList arrayList = new ArrayList();
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Aweme R1 = AwemeService.LIZ().R1((Aweme) ListProtector.get(list, i2));
                    o.LJI(R1);
                    arrayList.add(R1);
                }
                list = arrayList;
            }
            LIZIZ().LJIIJ(list, jSONObject.optInt("page", 0), jSONObject.optBoolean("has_more", false), jSONObject.optBoolean("insert_before", false));
            z = true;
        }
        Activity activity = (Activity) getActContext();
        if (activity != null) {
            activity.findViewById(R.id.content).setTag(com.zhiliaoapp.musically.R.id.asv, LIZIZ());
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
