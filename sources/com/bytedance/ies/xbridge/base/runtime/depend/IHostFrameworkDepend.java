package com.bytedance.ies.xbridge.base.runtime.depend;

import X.C31926Cfy;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public interface IHostFrameworkDepend {
    void addObserverEvent(C31926Cfy c31926Cfy, String str, List<String> list, List<? extends JSONObject> list2);

    String getContainerID(C31926Cfy c31926Cfy);
}
