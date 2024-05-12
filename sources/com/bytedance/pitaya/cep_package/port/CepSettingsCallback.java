package com.bytedance.pitaya.cep_package.port;

import com.bytedance.pitaya.cep_engine.port.CepKeeper;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public interface CepSettingsCallback extends CepKeeper {
    JSONObject getSettings(String str);
}
