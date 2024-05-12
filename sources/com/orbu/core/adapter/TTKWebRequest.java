package com.orbu.core.adapter;

import com.orbu.core.api.Channel;
import com.orbu.core.api.ITTKOrbuRequest;
import com.orbu.core.api.ITTKOrbuWebRequestPayload;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes17.dex */
public final class TTKWebRequest implements ITTKOrbuRequest<ITTKOrbuWebRequestPayload> {
    public final Map<String, String> headers;
    public final Map<String, String> metadata;
    public final String method;
    public final byte[] reqDataByte;
    public final String url;

    @Override // com.orbu.core.api.ITTKOrbuRequest
    public String description() {
        return null;
    }

    @Override // com.orbu.core.api.ITTKOrbuRequest
    public ITTKOrbuWebRequestPayload payload() {
        return new ITTKOrbuWebRequestPayload() { // from class: com.orbu.core.adapter.TTKWebRequest$payload$1
            @Override // com.orbu.core.api.ITTKOrbuWebRequestPayload
            public byte[] data() {
                return TTKWebRequest.this.reqDataByte;
            }

            @Override // com.orbu.core.api.ITTKOrbuWebRequestPayload
            public Map<String, String> headers() {
                return TTKWebRequest.this.headers;
            }

            @Override // com.orbu.core.api.ITTKOrbuWebRequestPayload
            public String method() {
                return TTKWebRequest.this.method;
            }

            @Override // com.orbu.core.api.ITTKOrbuWebRequestPayload
            public String url() {
                return TTKWebRequest.this.url;
            }
        };
    }

    @Override // com.orbu.core.api.ITTKOrbuRequest
    public Channel channel() {
        return Channel.WEB;
    }

    @Override // com.orbu.core.api.ITTKOrbuRequest
    public Map<String, String> metadata() {
        return this.metadata;
    }

    public TTKWebRequest(String str, String str2, Map<String, String> map, byte[] bArr, Map<String, String> metadata) {
        o.LJIIIZ(metadata, "metadata");
        this.url = str;
        this.method = str2;
        this.headers = map;
        this.reqDataByte = bArr;
        this.metadata = metadata;
    }
}
