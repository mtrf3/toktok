package com.ss.android.ugc.aweme.port.internal;

import X.C76800UCe;
import X.C78551UsF;
import X.InterfaceC88472Yns;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public interface IFluencyService {
    public static final C78551UsF Companion = C78551UsF.LIZ;

    void getCurrentFluencyInfo(long j, InterfaceC88472Yns<? super JSONObject, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super JSONObject, C76800UCe> interfaceC88472Yns2);

    void getSceneFluencyInfo(String str, long j, InterfaceC88472Yns<? super JSONObject, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super JSONObject, C76800UCe> interfaceC88472Yns2);

    void sceneReport(String str);
}
