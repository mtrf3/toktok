package com.bytedance.pitaya.cep_engine.helper;

import com.bytedance.pitaya.cep_engine.port.CepKeeper;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class JsonHelper implements CepKeeper {
    public static final JsonHelper INSTANCE = new JsonHelper();

    public final DictProxyHelper createDict(String jsonString) {
        o.LJIIIZ(jsonString, "jsonString");
        try {
            return new DictProxyHelper(new JSONObject(jsonString));
        } catch (Throwable unused) {
            return null;
        }
    }
}
