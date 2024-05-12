package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C15890jp;
import X.X1D;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class JoinRtcChannelResult {
    public final Map<String, byte[]> extraItems;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JoinRtcChannelResult copy$default(JoinRtcChannelResult joinRtcChannelResult, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = joinRtcChannelResult.extraItems;
        }
        return joinRtcChannelResult.copy(map);
    }

    public final Map<String, byte[]> component1() {
        return this.extraItems;
    }

    public final JoinRtcChannelResult copy(Map<String, byte[]> map) {
        return new JoinRtcChannelResult(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof JoinRtcChannelResult) && o.LJ(this.extraItems, ((JoinRtcChannelResult) obj).extraItems);
    }

    public int hashCode() {
        Map<String, byte[]> map = this.extraItems;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("JoinRtcChannelResult(extraItems=");
        return C15890jp.LIZ(LIZ, this.extraItems, ')', LIZ);
    }

    public JoinRtcChannelResult(Map<String, byte[]> map) {
        this.extraItems = map;
    }
}
