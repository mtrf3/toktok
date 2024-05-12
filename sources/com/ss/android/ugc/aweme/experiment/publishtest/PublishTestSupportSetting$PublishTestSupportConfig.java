package com.ss.android.ugc.aweme.experiment.publishtest;

import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.Q89;
import X.X1D;

/* loaded from: classes7.dex */
public class PublishTestSupportSetting$PublishTestSupportConfig {

    @InterfaceC65349Pkn("testTriggerProbability")
    public long testTriggerProbability;

    @InterfaceC65349Pkn("testTriggerRange")
    public int testTriggerRange;

    @InterfaceC65349Pkn("crashType")
    public String crashType = "java";

    @InterfaceC65349Pkn("crashStack")
    public String crashStack = "";

    @InterfaceC65349Pkn("testTriggerDelay")
    public long testTriggerDelay = -1;

    @InterfaceC65349Pkn("crashMsg")
    public String crashMsg = "PUBLISH_FUSED_TEST_EXCEPTION";

    @InterfaceC65349Pkn("customerDataTags")
    public String customerDataTags = "";

    @InterfaceC65349Pkn("customerFilters")
    public String customerFilters = "";

    @InterfaceC65349Pkn("logType")
    public String logType = "LOG_TYPE_PUBLISH_FUSED_TEST";

    @InterfaceC65349Pkn("appLogEvent")
    public String appLogEvent = "PUBLISH_TEST_DRILL";

    @InterfaceC65349Pkn("appLogWithDataTags")
    public String appLogWithDataTags = "";

    @InterfaceC65349Pkn("drillPath")
    public String drillPath = "";

    @InterfaceC65349Pkn("syncWithException")
    public boolean syncWithException = true;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PublishTestSupportConfig{crashType='");
        Q89.LIZIZ(LIZ, this.crashType, '\'', ", crashStack='");
        Q89.LIZIZ(LIZ, this.crashStack, '\'', ", testTriggerDelay=");
        LIZ.append(this.testTriggerDelay);
        LIZ.append(", testTriggerProbability=");
        LIZ.append(this.testTriggerProbability);
        LIZ.append(", testTriggerRange=");
        LIZ.append(this.testTriggerRange);
        LIZ.append(", crashMsg='");
        Q89.LIZIZ(LIZ, this.crashMsg, '\'', ", customerDataTags='");
        Q89.LIZIZ(LIZ, this.customerDataTags, '\'', ", customerFilters='");
        Q89.LIZIZ(LIZ, this.customerFilters, '\'', ", logType='");
        Q89.LIZIZ(LIZ, this.logType, '\'', ", appLogEvent='");
        Q89.LIZIZ(LIZ, this.appLogEvent, '\'', ", drillPath='");
        Q89.LIZIZ(LIZ, this.drillPath, '\'', ", syncWithException=");
        return C48339Iy7.LIZJ(LIZ, this.syncWithException, '}', LIZ);
    }
}
