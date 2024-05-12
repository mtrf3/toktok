package com.bytedance.pitaya.inner.api;

import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import com.bytedance.pitaya.inner.api.bean.TaskData;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;

/* loaded from: classes30.dex */
public interface TaskResultCallback extends ReflectionCall {
    void onResult(boolean z, PTYError pTYError, TaskData taskData, PTYPackageInfo pTYPackageInfo);
}
