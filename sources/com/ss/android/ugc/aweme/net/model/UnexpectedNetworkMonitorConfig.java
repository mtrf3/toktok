package com.ss.android.ugc.aweme.net.model;

import X.X1D;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class UnexpectedNetworkMonitorConfig {
    public final UnexpectedConfig[] responses;
    public final UnexpectedConfig[] urls;

    public static /* synthetic */ UnexpectedNetworkMonitorConfig copy$default(UnexpectedNetworkMonitorConfig unexpectedNetworkMonitorConfig, UnexpectedConfig[] unexpectedConfigArr, UnexpectedConfig[] unexpectedConfigArr2, int i, Object obj) {
        if ((i & 1) != 0) {
            unexpectedConfigArr = unexpectedNetworkMonitorConfig.urls;
        }
        if ((i & 2) != 0) {
            unexpectedConfigArr2 = unexpectedNetworkMonitorConfig.responses;
        }
        return unexpectedNetworkMonitorConfig.copy(unexpectedConfigArr, unexpectedConfigArr2);
    }

    public final UnexpectedNetworkMonitorConfig copy(UnexpectedConfig[] urls, UnexpectedConfig[] responses) {
        o.LJIIIZ(urls, "urls");
        o.LJIIIZ(responses, "responses");
        return new UnexpectedNetworkMonitorConfig(urls, responses);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UnexpectedNetworkMonitorConfig(urls=");
        LIZ.append(Arrays.toString(this.urls));
        LIZ.append(", responses=");
        LIZ.append(Arrays.toString(this.responses));
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public int hashCode() {
        return Arrays.hashCode(this.urls) + (Arrays.hashCode(this.responses) * 31);
    }

    public final UnexpectedConfig[] getResponses() {
        return this.responses;
    }

    public final UnexpectedConfig[] getUrls() {
        return this.urls;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!o.LJ(UnexpectedNetworkMonitorConfig.class, cls)) {
            return false;
        }
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.net.model.UnexpectedNetworkMonitorConfig");
        UnexpectedNetworkMonitorConfig unexpectedNetworkMonitorConfig = (UnexpectedNetworkMonitorConfig) obj;
        if (Arrays.equals(this.responses, unexpectedNetworkMonitorConfig.responses) && Arrays.equals(this.urls, unexpectedNetworkMonitorConfig.urls)) {
            return true;
        }
        return false;
    }

    public UnexpectedNetworkMonitorConfig(UnexpectedConfig[] urls, UnexpectedConfig[] responses) {
        o.LJIIIZ(urls, "urls");
        o.LJIIIZ(responses, "responses");
        this.urls = urls;
        this.responses = responses;
    }
}
