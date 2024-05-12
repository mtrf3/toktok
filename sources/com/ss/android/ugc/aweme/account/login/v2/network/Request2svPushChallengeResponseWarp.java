package com.ss.android.ugc.aweme.account.login.v2.network;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class Request2svPushChallengeResponseWarp {

    @InterfaceC65349Pkn("data")
    public final Request2svPushChallengeResponse data;

    @InterfaceC65349Pkn("message")
    public final String message;

    /* JADX WARN: Multi-variable type inference failed */
    public Request2svPushChallengeResponseWarp() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Request2svPushChallengeResponseWarp)) {
            return false;
        }
        Request2svPushChallengeResponseWarp request2svPushChallengeResponseWarp = (Request2svPushChallengeResponseWarp) obj;
        return o.LJ(this.message, request2svPushChallengeResponseWarp.message) && o.LJ(this.data, request2svPushChallengeResponseWarp.data);
    }

    public final int hashCode() {
        String str = this.message;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Request2svPushChallengeResponse request2svPushChallengeResponse = this.data;
        return hashCode + (request2svPushChallengeResponse != null ? request2svPushChallengeResponse.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Request2svPushChallengeResponseWarp(message=");
        LIZ.append(this.message);
        LIZ.append(", data=");
        LIZ.append(this.data);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public Request2svPushChallengeResponseWarp(String str, Request2svPushChallengeResponse request2svPushChallengeResponse) {
        this.message = str;
        this.data = request2svPushChallengeResponse;
    }

    public /* synthetic */ Request2svPushChallengeResponseWarp(String str, Request2svPushChallengeResponse request2svPushChallengeResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : request2svPushChallengeResponse);
    }
}
