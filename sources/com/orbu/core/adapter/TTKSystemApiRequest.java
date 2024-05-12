package com.orbu.core.adapter;

import X.X1D;
import com.orbu.core.api.Channel;
import com.orbu.core.api.ITTKOrbuRequest;
import com.orbu.core.api.ITTKOrbuSystemAPIRequestPayload;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class TTKSystemApiRequest implements ITTKOrbuRequest<ITTKOrbuSystemAPIRequestPayload> {
    public final String className;
    public final Map<String, String> metadata;
    public final String methodName;
    public final Map<String, Object> params;

    @Override // com.orbu.core.api.ITTKOrbuRequest
    public String description() {
        return null;
    }

    @Override // com.orbu.core.api.ITTKOrbuRequest
    public ITTKOrbuSystemAPIRequestPayload payload() {
        return new ITTKOrbuSystemAPIRequestPayload() { // from class: com.orbu.core.adapter.TTKSystemApiRequest$payload$1
            @Override // com.orbu.core.api.ITTKOrbuSystemAPIRequestPayload
            public String className() {
                return TTKSystemApiRequest.this.className;
            }

            @Override // com.orbu.core.api.ITTKOrbuSystemAPIRequestPayload
            public String methodName() {
                return TTKSystemApiRequest.this.methodName;
            }

            @Override // com.orbu.core.api.ITTKOrbuSystemAPIRequestPayload
            public Map<String, Object> params() {
                return TTKSystemApiRequest.this.params;
            }

            public String toString() {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(TTKSystemApiRequest.this.className);
                LIZ.append('#');
                LIZ.append(TTKSystemApiRequest.this.methodName);
                return X1D.LIZIZ(LIZ);
            }
        };
    }

    @Override // com.orbu.core.api.ITTKOrbuRequest
    public Channel channel() {
        return Channel.SYSTEM_API;
    }

    @Override // com.orbu.core.api.ITTKOrbuRequest
    public Map<String, String> metadata() {
        return this.metadata;
    }

    public TTKSystemApiRequest(String className, String methodName, Map<String, ? extends Object> map, Map<String, String> metadata) {
        o.LJIIIZ(className, "className");
        o.LJIIIZ(methodName, "methodName");
        o.LJIIIZ(metadata, "metadata");
        this.className = className;
        this.methodName = methodName;
        this.params = map;
        this.metadata = metadata;
    }
}
