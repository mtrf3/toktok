package com.bytedance.pia.core.worker.bridge;

import X.AbstractC37502Eni;
import X.BQ6;
import X.C37394Ely;
import X.C37406EmA;
import X.C37449Emr;
import X.C37499Enf;
import X.C37585Ep3;
import X.C37587Ep5;
import X.C37697Eqr;
import X.InterfaceC37580Eoy;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.pia.core.plugins.BridgeDowngradePlugin;
import com.bytedance.pia.core.worker.bridge.BridgeModule;
import com.bytedance.vmsdk.jsbridge.JSModule;
import com.bytedance.vmsdk.jsbridge.utils.Callback;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyMap;
import com.bytedance.vmsdk.jsbridge.utils.ReadableMap;
import com.google.gson.m;

/* loaded from: classes7.dex */
public class BridgeModule extends JSModule {
    public static final String NAME = "bridge";
    public final C37449Emr bridge;

    public static JavaOnlyMap invalidParams() {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.put("code", -3);
        return javaOnlyMap;
    }

    public BridgeModule(Context context, Object obj) {
        super(context, obj);
        this.bridge = (C37449Emr) obj;
    }

    private void returnResult(Callback callback, JavaOnlyMap javaOnlyMap) {
        if (callback != null) {
            callback.invoke(javaOnlyMap);
        }
    }

    @InterfaceC37580Eoy
    public void call(final String str, final ReadableMap readableMap, final Callback callback) {
        m mVar;
        if (TextUtils.isEmpty(str)) {
            returnResult(callback, invalidParams());
        }
        ReadableMap map = readableMap.getMap("data");
        if (map != null) {
            mVar = C37697Eqr.LIZLLL(map);
        } else {
            mVar = null;
        }
        this.bridge.LIZIZ(new C37585Ep3(callback), new BQ6() { // from class: X.Ep6
            @Override // X.BQ6
            public final void accept(Object obj) {
                BridgeModule.this.lambda$call$0(str, readableMap, callback, (C37394Ely) obj);
            }
        }, mVar, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$call$0(String str, ReadableMap readableMap, Callback callback, C37394Ely c37394Ely) {
        if (c37394Ely instanceof C37406EmA) {
            AbstractC37502Eni LJFF = ((C37499Enf) this.bridge.LIZIZ).LJFF("bridgeDowngrade");
            if (LJFF instanceof BridgeDowngradePlugin) {
                ((BridgeDowngradePlugin) LJFF).LIZIZ.LIZ(new C37587Ep5(str, readableMap.getMap("rawData"), callback));
                return;
            }
        }
        if (callback == null) {
            return;
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (c37394Ely != null) {
            javaOnlyMap.put("code", Integer.valueOf(c37394Ely.getCode()));
            javaOnlyMap.put("msg", c37394Ely.getMessage());
        } else {
            javaOnlyMap.put("code", 0);
        }
        callback.invoke(javaOnlyMap);
    }
}
