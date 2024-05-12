package com.ss.android.ugc.aweme.settingsrequest.api;

import X.C76800UCe;
import X.InterfaceC88472Yns;
import com.google.gson.m;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public interface IConfigCenterBridgeApi {
    void LIZ(JSONObject jSONObject, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Exception, C76800UCe> interfaceC88472Yns2);

    void LIZIZ(m mVar, String str);

    boolean LIZJ();

    Map<String, Object> getSettings(List<String> list);
}
