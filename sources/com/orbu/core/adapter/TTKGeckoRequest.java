package com.orbu.core.adapter;

import com.orbu.core.api.Channel;
import com.orbu.core.api.ITTKOrbuGeckoRequestPayload;
import com.orbu.core.api.ITTKOrbuRequest;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes17.dex */
public final class TTKGeckoRequest implements ITTKOrbuRequest<ITTKOrbuGeckoRequestPayload> {
    public final String geckoFilePath;
    public final Map<String, String> metadata;
    public final String sourceChannel;
    public final String temporaryPath;

    @Override // com.orbu.core.api.ITTKOrbuRequest
    public String description() {
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.orbu.core.api.ITTKOrbuRequest
    public ITTKOrbuGeckoRequestPayload payload() {
        return new ITTKOrbuGeckoRequestPayload() { // from class: com.orbu.core.adapter.TTKGeckoRequest$payload$1
            @Override // com.orbu.core.api.ITTKOrbuGeckoRequestPayload
            public String geckoFilePath() {
                return TTKGeckoRequest.this.geckoFilePath;
            }

            @Override // com.orbu.core.api.ITTKOrbuGeckoRequestPayload
            public String sourceChannel() {
                return TTKGeckoRequest.this.sourceChannel;
            }

            @Override // com.orbu.core.api.ITTKOrbuGeckoRequestPayload
            public String temporaryPath() {
                return TTKGeckoRequest.this.temporaryPath;
            }
        };
    }

    @Override // com.orbu.core.api.ITTKOrbuRequest
    public Channel channel() {
        return Channel.GECKO;
    }

    @Override // com.orbu.core.api.ITTKOrbuRequest
    public Map<String, String> metadata() {
        return this.metadata;
    }

    public TTKGeckoRequest(String str, String str2, String str3, Map<String, String> metadata) {
        o.LJIIIZ(metadata, "metadata");
        this.temporaryPath = str;
        this.geckoFilePath = str2;
        this.sourceChannel = str3;
        this.metadata = metadata;
    }
}
