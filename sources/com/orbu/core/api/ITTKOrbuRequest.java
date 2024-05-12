package com.orbu.core.api;

import com.orbu.core.api.ITTKOrbuRequestPayload;
import java.util.Map;

/* loaded from: classes7.dex */
public interface ITTKOrbuRequest<T extends ITTKOrbuRequestPayload> {
    Channel channel();

    String description();

    Map<String, String> metadata();

    T payload();
}
