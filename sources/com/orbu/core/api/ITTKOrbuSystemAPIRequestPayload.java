package com.orbu.core.api;

import java.util.Map;

/* loaded from: classes7.dex */
public interface ITTKOrbuSystemAPIRequestPayload extends ITTKOrbuRequestPayload {
    String className();

    String methodName();

    Map<String, Object> params();
}
