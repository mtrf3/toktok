package com.bytedance.pitaya.api;

import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;

/* loaded from: classes4.dex */
public interface PTYTaskResultCallback extends ReflectionCall {
    void onResult(boolean z, PTYError pTYError, PTYTaskData pTYTaskData, PTYPackageInfo pTYPackageInfo);
}
