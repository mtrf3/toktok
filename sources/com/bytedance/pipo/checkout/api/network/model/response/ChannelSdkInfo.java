package com.bytedance.pipo.checkout.api.network.model.response;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class ChannelSdkInfo {

    @InterfaceC65349Pkn("sdk_data")
    public String sdkData;

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelSdkInfo() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ChannelSdkInfo copy$default(ChannelSdkInfo channelSdkInfo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = channelSdkInfo.sdkData;
        }
        return channelSdkInfo.copy(str);
    }

    public final ChannelSdkInfo copy(String str) {
        return new ChannelSdkInfo(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChannelSdkInfo) && o.LJ(this.sdkData, ((ChannelSdkInfo) obj).sdkData);
    }

    public int hashCode() {
        String str = this.sdkData;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ChannelSdkInfo(sdkData=");
        LIZ.append((Object) this.sdkData);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getSdkData() {
        return this.sdkData;
    }

    public ChannelSdkInfo(String str) {
        this.sdkData = str;
    }

    public final void setSdkData(String str) {
        this.sdkData = str;
    }

    public /* synthetic */ ChannelSdkInfo(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
