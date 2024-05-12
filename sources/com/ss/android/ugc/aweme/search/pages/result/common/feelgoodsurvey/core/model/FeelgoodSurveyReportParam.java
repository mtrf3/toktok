package com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class FeelgoodSurveyReportParam extends F9E {

    @InterfaceC65349Pkn("device")
    public final int device;

    @InterfaceC65349Pkn("deviceID")
    public final String deviceID;

    @InterfaceC65349Pkn("language")
    public final String language;

    @InterfaceC65349Pkn("referUrl")
    public final String referUrl;

    @InterfaceC65349Pkn("sign")
    public final Map<String, String> sign;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.sign, this.referUrl, this.language, Integer.valueOf(this.device), this.deviceID};
    }

    public FeelgoodSurveyReportParam(Map<String, String> sign, String referUrl, String language, int i, String deviceID) {
        o.LJIIIZ(sign, "sign");
        o.LJIIIZ(referUrl, "referUrl");
        o.LJIIIZ(language, "language");
        o.LJIIIZ(deviceID, "deviceID");
        this.sign = sign;
        this.referUrl = referUrl;
        this.language = language;
        this.device = i;
        this.deviceID = deviceID;
    }
}
