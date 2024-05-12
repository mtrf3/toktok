package com.bytedance.pia.core.plugins;

import X.AbstractC37502Eni;
import X.C37499Enf;
import X.C37584Ep2;
import X.C37587Ep5;
import X.C37607EpP;
import com.bytedance.pia.core.PiaManifest;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyArray;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyMap;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class BridgeDowngradePlugin extends AbstractC37502Eni {
    public final C37607EpP<C37587Ep5> LIZIZ;

    @Override // X.AbstractC37502Eni
    public final String LIZ() {
        return "bridgeDowngrade";
    }

    public static JavaOnlyArray LJII(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object opt = jSONArray.opt(i);
            if (opt instanceof JSONObject) {
                javaOnlyArray.add(LJIIIIZZ((JSONObject) opt));
            } else if (opt instanceof JSONArray) {
                javaOnlyArray.add(LJII((JSONArray) opt));
            } else {
                javaOnlyArray.add(opt);
            }
        }
        return javaOnlyArray;
    }

    public static JavaOnlyMap LJIIIIZZ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> keys = jSONObject.keys();
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt instanceof JSONObject) {
                javaOnlyMap.put(next, LJIIIIZZ((JSONObject) opt));
            } else if (opt instanceof JSONArray) {
                javaOnlyMap.put(next, LJII((JSONArray) opt));
            } else if (opt == JSONObject.NULL) {
                javaOnlyMap.put(next, null);
            } else {
                javaOnlyMap.put(next, opt);
            }
        }
        return javaOnlyMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BridgeDowngradePlugin(C37499Enf runtime, PiaManifest manifest) {
        super(runtime);
        o.LJIIJ(runtime, "runtime");
        o.LJIIJ(manifest, "manifest");
        this.LIZIZ = new C37607EpP<>();
    }

    @Override // X.AbstractC37502Eni
    public final void LJFF(String str, Object... objArr) {
        if (!o.LJ("event-on-bind-bridge-handle", str)) {
            return;
        }
        this.LIZIZ.LIZJ(new C37584Ep2(this, objArr));
    }
}
