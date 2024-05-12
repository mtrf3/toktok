package com.bytedance.ies.xbridge.base.runtime.depend;

import X.C31926Cfy;
import X.C59963Ng7;
import X.C76800UCe;
import X.EnumC37847EtH;
import java.util.Map;

/* loaded from: classes7.dex */
public interface IHostLogDepend {
    void handleReportADLog(C31926Cfy c31926Cfy, String str, C59963Ng7 c59963Ng7, IReportADLogResultCallback iReportADLogResultCallback, EnumC37847EtH enumC37847EtH);

    void onEventV3Map(String str, Map<String, String> map);

    void putCommonParams(Map<String, String> map, boolean z);

    C76800UCe reportJSBError(C31926Cfy c31926Cfy, Map<String, ? extends Object> map);

    C76800UCe reportJSBFetchError(C31926Cfy c31926Cfy, Map<String, ? extends Object> map);
}
