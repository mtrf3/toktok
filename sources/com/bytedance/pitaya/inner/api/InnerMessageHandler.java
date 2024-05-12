package com.bytedance.pitaya.inner.api;

import com.bytedance.pitaya.inner.api.bean.TaskData;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;

/* loaded from: classes30.dex */
public interface InnerMessageHandler extends ReflectionCall {
    TaskData onMessage(TaskData taskData);
}
