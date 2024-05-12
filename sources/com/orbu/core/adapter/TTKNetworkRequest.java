package com.orbu.core.adapter;

import com.orbu.core.api.Channel;
import com.orbu.core.api.ITTKOrbuNetworkRequestPayload;
import com.orbu.core.api.ITTKOrbuRequest;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class TTKNetworkRequest implements ITTKOrbuRequest<ITTKOrbuNetworkRequestPayload> {
    public final Map<String, List<String>> headers;
    public final Map<String, String> metadata;
    public final String method;
    public final byte[] reqDataByte;
    public final String url;

    @Override // com.orbu.core.api.ITTKOrbuRequest
    public String description() {
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.orbu.core.api.ITTKOrbuRequest
    public ITTKOrbuNetworkRequestPayload payload() {
        return new ITTKOrbuNetworkRequestPayload() { // from class: com.orbu.core.adapter.TTKNetworkRequest$payload$1
            @Override // com.orbu.core.api.ITTKOrbuNetworkRequestPayload
            public byte[] data() {
                return TTKNetworkRequest.this.reqDataByte;
            }

            @Override // com.orbu.core.api.ITTKOrbuNetworkRequestPayload
            public Map<String, List<String>> headers() {
                return TTKNetworkRequest.this.headers;
            }

            @Override // com.orbu.core.api.ITTKOrbuNetworkRequestPayload
            public String method() {
                return TTKNetworkRequest.this.method;
            }

            @Override // com.orbu.core.api.ITTKOrbuNetworkRequestPayload
            public String url() {
                return TTKNetworkRequest.this.url;
            }
        };
    }

    @Override // com.orbu.core.api.ITTKOrbuRequest
    public Channel channel() {
        return Channel.NETWORK;
    }

    @Override // com.orbu.core.api.ITTKOrbuRequest
    public Map<String, String> metadata() {
        return this.metadata;
    }

    public TTKNetworkRequest(String str, String str2, Map<String, List<String>> map, byte[] bArr, Map<String, String> metadata) {
        o.LJIIIZ(metadata, "metadata");
        this.url = str;
        this.method = str2;
        this.headers = map;
        this.reqDataByte = bArr;
        this.metadata = metadata;
    }
}
