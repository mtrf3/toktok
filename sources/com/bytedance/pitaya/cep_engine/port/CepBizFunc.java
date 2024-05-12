package com.bytedance.pitaya.cep_engine.port;

import com.bytedance.pitaya.cep_engine.helper.ListProxyHelper;
import com.bytedance.pitaya.cep_engine.helper.ProxyHelper;
import org.json.JSONArray;

/* loaded from: classes7.dex */
public interface CepBizFunc extends CepKeeper {
    ProxyHelper apply(ListProxyHelper listProxyHelper);

    Object apply(JSONArray jSONArray);
}
