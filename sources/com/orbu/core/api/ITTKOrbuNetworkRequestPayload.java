package com.orbu.core.api;

import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public interface ITTKOrbuNetworkRequestPayload extends ITTKOrbuRequestPayload {
    byte[] data();

    Map<String, List<String>> headers();

    String method();

    String url();
}
