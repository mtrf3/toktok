package com.orbu.core.adapter;

import X.X1D;
import com.orbu.core.api.Channel;
import com.orbu.core.api.ITTKOrbuRequest;
import com.orbu.core.api.ITTKOrbuWebRouterRequestPayload;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes17.dex */
public final class TTKWebRouterRequest implements ITTKOrbuRequest<ITTKOrbuWebRouterRequestPayload> {
    public final Map<String, String> metadata;
    public final String routerString;
    public final String url;
    public final String webviewRuntime;

    @Override // com.orbu.core.api.ITTKOrbuRequest
    public String description() {
        return null;
    }

    @Override // com.orbu.core.api.ITTKOrbuRequest
    public ITTKOrbuWebRouterRequestPayload payload() {
        return new ITTKOrbuWebRouterRequestPayload() { // from class: com.orbu.core.adapter.TTKWebRouterRequest$payload$1
            @Override // com.orbu.core.api.ITTKOrbuWebRouterRequestPayload
            public String routerString() {
                return TTKWebRouterRequest.this.routerString;
            }

            @Override // com.orbu.core.api.ITTKOrbuWebRouterRequestPayload
            public String url() {
                return TTKWebRouterRequest.this.url;
            }

            @Override // com.orbu.core.api.ITTKOrbuWebRouterRequestPayload
            public String webviewRuntime() {
                return TTKWebRouterRequest.this.webviewRuntime;
            }

            public String toString() {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(TTKWebRouterRequest.this.webviewRuntime);
                LIZ.append(", ");
                LIZ.append(TTKWebRouterRequest.this.routerString);
                return X1D.LIZIZ(LIZ);
            }
        };
    }

    @Override // com.orbu.core.api.ITTKOrbuRequest
    public Channel channel() {
        return Channel.WEB_ROUTER;
    }

    @Override // com.orbu.core.api.ITTKOrbuRequest
    public Map<String, String> metadata() {
        return this.metadata;
    }

    public TTKWebRouterRequest(String str, String str2, String str3, Map<String, String> metadata) {
        o.LJIIIZ(metadata, "metadata");
        this.routerString = str;
        this.url = str2;
        this.webviewRuntime = str3;
        this.metadata = metadata;
    }
}
