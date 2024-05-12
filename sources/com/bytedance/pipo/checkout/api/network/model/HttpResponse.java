package com.bytedance.pipo.checkout.api.network.model;

import X.PVC;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class HttpResponse {
    public final byte[] responseBytes;
    public final String responseString;
    public final int statusCode;

    public final byte[] getResponseBytes() {
        return this.responseBytes;
    }

    public final String getResponseString() {
        return this.responseString;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public HttpResponse(int i, byte[] responseBytes) {
        o.LJIIIZ(responseBytes, "responseBytes");
        this.statusCode = i;
        this.responseBytes = responseBytes;
        this.responseString = new String(responseBytes, PVC.LIZ);
    }
}
