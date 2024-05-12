package com.orbu.core.adapter;

import X.X1D;
import com.orbu.core.api.Channel;
import com.orbu.core.api.ITTKOrbuRequest;
import com.orbu.core.api.ITTKOrbuSDKRequestPayload;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class TTKSDKRequest implements ITTKOrbuRequest<ITTKOrbuSDKRequestPayload> {
    public final Map<String, String> metadata;
    public final String methodName;
    public final Map<String, Object> params;
    public final String sdkDescriptor;

    @Override // com.orbu.core.api.ITTKOrbuRequest
    public String description() {
        return null;
    }

    @Override // com.orbu.core.api.ITTKOrbuRequest
    public ITTKOrbuSDKRequestPayload payload() {
        return new ITTKOrbuSDKRequestPayload() { // from class: com.orbu.core.adapter.TTKSDKRequest$payload$1
            @Override // com.orbu.core.api.ITTKOrbuSDKRequestPayload
            public String methodName() {
                return TTKSDKRequest.this.methodName;
            }

            @Override // com.orbu.core.api.ITTKOrbuSDKRequestPayload
            public Map<String, Object> params() {
                return TTKSDKRequest.this.params;
            }

            @Override // com.orbu.core.api.ITTKOrbuSDKRequestPayload
            public String sdkDescriptor() {
                return TTKSDKRequest.this.sdkDescriptor;
            }

            public String toString() {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(TTKSDKRequest.this.sdkDescriptor);
                LIZ.append('#');
                LIZ.append(TTKSDKRequest.this.methodName);
                return X1D.LIZIZ(LIZ);
            }
        };
    }

    @Override // com.orbu.core.api.ITTKOrbuRequest
    public Channel channel() {
        return Channel.SDK;
    }

    @Override // com.orbu.core.api.ITTKOrbuRequest
    public Map<String, String> metadata() {
        return this.metadata;
    }

    public TTKSDKRequest(String sdkDescriptor, String methodName, Map<String, ? extends Object> map, Map<String, String> metadata) {
        o.LJIIIZ(sdkDescriptor, "sdkDescriptor");
        o.LJIIIZ(methodName, "methodName");
        o.LJIIIZ(metadata, "metadata");
        this.sdkDescriptor = sdkDescriptor;
        this.methodName = methodName;
        this.params = map;
        this.metadata = metadata;
    }
}
