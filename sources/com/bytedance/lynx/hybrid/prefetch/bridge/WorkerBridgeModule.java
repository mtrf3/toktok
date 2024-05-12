package com.bytedance.lynx.hybrid.prefetch.bridge;

import X.C141335gf;
import X.C25620zW;
import X.C37699Eqt;
import X.C37700Equ;
import X.C37701Eqv;
import X.C3C5;
import X.C76800UCe;
import X.InterfaceC37580Eoy;
import X.X1D;
import android.content.Context;
import com.bytedance.vmsdk.jsbridge.JSModule;
import com.bytedance.vmsdk.jsbridge.utils.Callback;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyMap;
import com.bytedance.vmsdk.jsbridge.utils.ReadableMap;
import com.bytedance.vmsdk.jsbridge.utils.WritableArray;
import com.bytedance.vmsdk.jsbridge.utils.WritableMap;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class WorkerBridgeModule extends JSModule {
    public static final C37699Eqt Companion = new C37699Eqt();
    public static final String NAME = "bridge";
    public final C37700Equ ctx;

    public static final WritableArray convertJSONArray2JavaOnlyArray(JSONArray jSONArray) {
        Companion.getClass();
        return C37699Eqt.LIZ(jSONArray);
    }

    public static final WritableMap convertJSONObject2JavaOnlyMap(JSONObject jSONObject) {
        Companion.getClass();
        return C37699Eqt.LIZIZ(jSONObject);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkerBridgeModule(Context context, Object obj) {
        super(context, obj);
        o.LJIIJ(context, "context");
        this.ctx = (C37700Equ) (obj instanceof C37700Equ ? obj : null);
    }

    @InterfaceC37580Eoy
    public final void call(String bridgeName, ReadableMap readableMap, Callback callback) {
        Object LIZ;
        ReadableMap readableMap2;
        JavaOnlyMap javaOnlyMap;
        o.LJIIJ(bridgeName, "bridgeName");
        try {
            if (this.ctx == null && callback != null) {
                callback.invoke(new JSONObject().put("code", 0).put("msg", "init worker bridge error"));
            }
            if (!(readableMap instanceof JavaOnlyMap)) {
                readableMap2 = null;
            } else {
                readableMap2 = readableMap;
            }
            javaOnlyMap = (JavaOnlyMap) readableMap2;
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (javaOnlyMap != null) {
            Companion.getClass();
            JSONObject LIZLLL = C37699Eqt.LIZLLL(javaOnlyMap);
            C37700Equ c37700Equ = this.ctx;
            if (c37700Equ != null) {
                c37700Equ.LIZJ.LIZLLL(c37700Equ.LIZ, bridgeName, LIZLLL, new C37701Eqv(callback, readableMap));
                LIZ = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ);
                Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
                if (m10exceptionOrNullimpl != null && callback != null) {
                    JSONObject put = new JSONObject().put("code", 0);
                    StringBuilder LIZIZ = C25620zW.LIZIZ("fail to invoke ", bridgeName, ", error = ");
                    LIZIZ.append(m10exceptionOrNullimpl.getMessage());
                    callback.invoke(put.put("msg", X1D.LIZIZ(LIZIZ)));
                    return;
                }
                return;
            }
            o.LJIIZILJ();
            throw null;
        }
    }

    public static /* synthetic */ void call$default(WorkerBridgeModule workerBridgeModule, String str, ReadableMap readableMap, Callback callback, int i, Object obj) {
        if ((i & 2) != 0) {
            readableMap = null;
        }
        if ((i & 4) != 0) {
            callback = null;
        }
        workerBridgeModule.call(str, readableMap, callback);
    }
}
