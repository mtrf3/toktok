package com.orbu.core.adapter;

import com.orbu.core.api.Channel;
import com.orbu.core.api.ITTKOrbuAppToAppRequestPayload;
import com.orbu.core.api.ITTKOrbuRequest;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class TTKAppToAppRequest implements ITTKOrbuRequest<ITTKOrbuAppToAppRequestPayload> {
    public final Map<String, String> metadata;
    public final JSONObject sharedData;
    public final String targetAppName;

    @Override // com.orbu.core.api.ITTKOrbuRequest
    public String description() {
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.orbu.core.api.ITTKOrbuRequest
    public ITTKOrbuAppToAppRequestPayload payload() {
        return new ITTKOrbuAppToAppRequestPayload() { // from class: com.orbu.core.adapter.TTKAppToAppRequest$payload$1
            @Override // com.orbu.core.api.ITTKOrbuAppToAppRequestPayload
            public JSONObject sharedData() {
                return TTKAppToAppRequest.this.sharedData;
            }

            @Override // com.orbu.core.api.ITTKOrbuAppToAppRequestPayload
            public String targetAppName() {
                return TTKAppToAppRequest.this.targetAppName;
            }

            public String toString() {
                return String.valueOf(TTKAppToAppRequest.this.targetAppName);
            }
        };
    }

    @Override // com.orbu.core.api.ITTKOrbuRequest
    public Channel channel() {
        return Channel.APP_TO_APP;
    }

    @Override // com.orbu.core.api.ITTKOrbuRequest
    public Map<String, String> metadata() {
        return this.metadata;
    }

    public TTKAppToAppRequest(JSONObject jSONObject, String str, Map<String, String> metadata) {
        o.LJIIIZ(metadata, "metadata");
        this.sharedData = jSONObject;
        this.targetAppName = str;
        this.metadata = metadata;
    }
}
