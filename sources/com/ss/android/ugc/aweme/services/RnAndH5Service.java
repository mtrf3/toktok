package com.ss.android.ugc.aweme.services;

import X.C113554cx;
import X.C38049EwX;
import X.C69101RAb;
import X.C78939UyV;
import X.InterfaceC38012Evw;
import X.OSZ;
import X.R3Q;
import X.R3R;
import X.R3T;
import X.R3U;
import X.R3V;
import X.R3Z;
import X.R4Q;
import X.R4T;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class RnAndH5Service {
    public Map<String, Class<?>> getJavaMethodClass() {
        return C113554cx.LJJL(new OSZ("sendVerifyCode", R4Q.class), new OSZ("validateVerifyCode", R4T.class), new OSZ("recentLoginUsersInfo", R3T.class), new OSZ("open_2sv", R3U.class), new OSZ("loginH5Failed", R3R.class), new OSZ("loginFromH5", R3Q.class), new OSZ("update_account_info", R3Z.class));
    }

    public void notifyFromRnAndH5(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            if (TextUtils.equals("find_account_back", JSONObjectProtectorUtils.getString(jSONObject, "eventName"))) {
                JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "data");
                JSONObjectProtectorUtils.getString(jSONObject2, "platform");
                C78939UyV.LJJIIJ(new R3V(new JSONObject(JSONObjectProtectorUtils.getString(jSONObject2, "user_info"))));
                C69101RAb.LIZIZ(4);
            } else if (TextUtils.equals("rebindPhone_certify_success", JSONObjectProtectorUtils.getString(jSONObject, "eventName"))) {
                C69101RAb.LIZIZ(8);
            }
            if (TextUtils.equals(JSONObjectProtectorUtils.getString(jSONObject, "eventName"), "account_recover_done")) {
                C69101RAb.LIZIZ(12);
            }
        } catch (Exception unused) {
        }
    }

    public Map<String, InterfaceC38012Evw> getJavaMethods(WeakReference<Context> contextWrf, C38049EwX iesJsBridge) {
        o.LJIIIZ(contextWrf, "contextWrf");
        o.LJIIIZ(iesJsBridge, "iesJsBridge");
        return C113554cx.LJJJLZIJ(new OSZ("sendVerifyCode", new R4Q(contextWrf, iesJsBridge)), new OSZ("validateVerifyCode", new R4T(contextWrf, iesJsBridge)), new OSZ("recentLoginUsersInfo", new R3T(iesJsBridge)), new OSZ("open_2sv", new R3U(contextWrf, iesJsBridge)), new OSZ("loginH5Failed", new R3R(contextWrf, iesJsBridge)), new OSZ("loginFromH5", new R3Q(contextWrf, iesJsBridge)), new OSZ("update_account_info", new R3Z(contextWrf, iesJsBridge)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public InterfaceC38012Evw getJavaMethodByName(WeakReference<Context> contextWrf, C38049EwX iesJsBridge, String name) {
        o.LJIIIZ(contextWrf, "contextWrf");
        o.LJIIIZ(iesJsBridge, "iesJsBridge");
        o.LJIIIZ(name, "name");
        switch (name.hashCode()) {
            case -1863948490:
                if (name.equals("update_account_info")) {
                    return new R3Z(contextWrf, iesJsBridge);
                }
                return null;
            case -504370528:
                if (name.equals("open_2sv")) {
                    return new R3U(contextWrf, iesJsBridge);
                }
                return null;
            case -318443352:
                if (name.equals("recentLoginUsersInfo")) {
                    return new R3T(iesJsBridge);
                }
                return null;
            case 940754656:
                if (name.equals("loginFromH5")) {
                    return new R3Q(contextWrf, iesJsBridge);
                }
                return null;
            case 1046271932:
                if (name.equals("validateVerifyCode")) {
                    return new R4T(contextWrf, iesJsBridge);
                }
                return null;
            case 1094035374:
                if (name.equals("sendVerifyCode")) {
                    return new R4Q(contextWrf, iesJsBridge);
                }
                return null;
            case 1825757683:
                if (name.equals("loginH5Failed")) {
                    return new R3R(contextWrf, iesJsBridge);
                }
                return null;
            default:
                return null;
        }
    }
}
