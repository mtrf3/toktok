package com.orbu.core.adapter;

import com.orbu.core.api.Channel;
import com.orbu.core.api.ITTKOrbuRequest;
import com.orbu.core.api.ITTKOrbuSettingsRequestPayload;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes17.dex */
public final class TTKSettingsRequest implements ITTKOrbuRequest<ITTKOrbuSettingsRequestPayload> {
    public final Map<String, String> metadata;
    public final String settingsResponse;

    @Override // com.orbu.core.api.ITTKOrbuRequest
    public String description() {
        return null;
    }

    @Override // com.orbu.core.api.ITTKOrbuRequest
    public ITTKOrbuSettingsRequestPayload payload() {
        return new ITTKOrbuSettingsRequestPayload() { // from class: com.orbu.core.adapter.TTKSettingsRequest$payload$1
            @Override // com.orbu.core.api.ITTKOrbuSettingsRequestPayload
            public String settingsResponse() {
                return TTKSettingsRequest.this.settingsResponse;
            }
        };
    }

    @Override // com.orbu.core.api.ITTKOrbuRequest
    public Channel channel() {
        return Channel.SETTINGS;
    }

    @Override // com.orbu.core.api.ITTKOrbuRequest
    public Map<String, String> metadata() {
        return this.metadata;
    }

    public TTKSettingsRequest(String str, Map<String, String> metadata) {
        o.LJIIIZ(metadata, "metadata");
        this.settingsResponse = str;
        this.metadata = metadata;
    }
}
