package com.orbu.core.api;

import java.util.Map;

/* loaded from: classes7.dex */
public interface ITTKOrbuSDKRequestPayload extends ITTKOrbuRequestPayload {
    String methodName();

    Map<String, Object> params();

    String sdkDescriptor();
}
