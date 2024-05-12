package com.orbu.core.api;

import org.json.JSONObject;

/* loaded from: classes7.dex */
public interface ITTKOrbuAppToAppRequestPayload extends ITTKOrbuRequestPayload {
    JSONObject sharedData();

    String targetAppName();
}
