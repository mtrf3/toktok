package com.bytedance.android.livesdk.lynx.bridge;

import X.C03880Dg;
import X.C141335gf;
import X.C38117Exd;
import X.C38129Exp;
import X.C38377F4j;
import X.C3C5;
import X.C65300Pk0;
import X.C76800UCe;
import X.InterfaceC37728ErM;
import android.content.Context;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.lynx.jsbridge.LynxModule;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class TTLiveLynxBridgeModule extends LynxModule {
    public final C38129Exp bridge;
    public final ConcurrentHashMap<C38117Exd, Callback> callRegistry;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.Yns, X.Prl] */
    public TTLiveLynxBridgeModule(Context context, Object param) {
        super(context);
        C38129Exp c38129Exp;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(param, "param");
        this.callRegistry = new ConcurrentHashMap<>();
        if (param instanceof C38129Exp) {
            c38129Exp = (C38129Exp) param;
        } else {
            c38129Exp = null;
        }
        this.bridge = c38129Exp;
        if (c38129Exp == null) {
            return;
        }
        c38129Exp.LJIIL = this;
        ?? r0 = c38129Exp.LJIILJJIL;
        if (r0 == 0) {
            return;
        }
        r0.invoke(this);
    }

    public final void invokeCallback$livehybrid_impl_release(JSONObject data, C38117Exd call) {
        C76800UCe c76800UCe;
        o.LJIIIZ(data, "data");
        o.LJIIIZ(call, "call");
        try {
            Object remove = data.remove("__params");
            if (remove != null && (remove instanceof JSONObject)) {
                ((JSONObject) remove).remove("__data");
                ((JSONObject) remove).remove("__msg_type");
                String optString = ((JSONObject) remove).optString("__callback_id", CardStruct.IStatusCode.DEFAULT);
                o.LJIIIIZZ(optString, "it.optString(\"__callback_id\", \"0\")");
                data.put("eventId", CastLongProtector.parseLong(optString));
                if (!((JSONObject) remove).has("___error___")) {
                    data.put("code", ((JSONObject) remove).optInt("code", 1));
                } else {
                    data.put("code", 0);
                    data.put("errMsg", ((JSONObject) remove).remove("___error___"));
                }
                data.put("data", remove);
            }
            JavaOnlyMap LIZLLL = C38377F4j.LIZLLL(data);
            Callback remove2 = this.callRegistry.remove(call);
            if (remove2 != null) {
                remove2.invoke(LIZLLL);
                c76800UCe = C76800UCe.LIZ;
            } else {
                c76800UCe = null;
            }
            C3C5.m7constructorimpl(c76800UCe);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    @InterfaceC37728ErM
    public final void call(String func, ReadableMap params, Callback callback) {
        C38117Exd c38117Exd;
        String str;
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {func, params, callback};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/String;Lcom/lynx/react/bridge/ReadableMap;Lcom/lynx/react/bridge/Callback;)V", "9134161720273347129");
        if (c03880Dg.LIZJ(300002, "com/bytedance/android/livesdk/lynx/bridge/TTLiveLynxBridgeModule", "call", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300002, "com/bytedance/android/livesdk/lynx/bridge/TTLiveLynxBridgeModule", "call", null, objArr, this, c65300Pk0, false);
            return;
        }
        o.LJIIIZ(func, "func");
        o.LJIIIZ(params, "params");
        o.LJIIIZ(callback, "callback");
        try {
            JSONObject LIZIZ = C38377F4j.LIZIZ(params);
            C38129Exp c38129Exp = this.bridge;
            if (c38129Exp != null) {
                JSONObject optJSONObject = LIZIZ.optJSONObject("data");
                if (optJSONObject == null || (str = optJSONObject.toString()) == null) {
                    str = "{}";
                }
                String optString = LIZIZ.optString("namespace", "webcast");
                o.LJIIIIZZ(optString, "paramsObject.optString(\"namespace\", \"webcast\")");
                String optString2 = LIZIZ.optString("eventId", "lynx");
                o.LJIIIIZZ(optString2, "paramsObject.optString(\"eventId\", \"lynx\")");
                c38117Exd = c38129Exp.LJIILLIIL(func, str, optString, optString2);
                this.callRegistry.put(c38117Exd, callback);
            } else {
                c38117Exd = null;
            }
            C3C5.m7constructorimpl(c38117Exd);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        c03880Dg.LIZIZ(300002, "com/bytedance/android/livesdk/lynx/bridge/TTLiveLynxBridgeModule", "call", null, objArr, this, c65300Pk0, true);
    }
}
