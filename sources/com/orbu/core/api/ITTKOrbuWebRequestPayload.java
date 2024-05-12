package com.orbu.core.api;

import java.util.Map;

/* loaded from: classes7.dex */
public interface ITTKOrbuWebRequestPayload extends ITTKOrbuRequestPayload {
    byte[] data();

    Map<String, String> headers();

    String method();

    String url();
}
