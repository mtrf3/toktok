package com.bytedance.pipo.checkout.api.network.model.response;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class ChannelExtraInfo {

    @InterfaceC65349Pkn("channel_merchant_id")
    public String channelMerchantId;

    @InterfaceC65349Pkn("channel_order_id")
    public String channelOrderId;

    @InterfaceC65349Pkn("channel_refund_id")
    public String channelRefundId;

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelExtraInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ChannelExtraInfo copy$default(ChannelExtraInfo channelExtraInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = channelExtraInfo.channelMerchantId;
        }
        if ((i & 2) != 0) {
            str2 = channelExtraInfo.channelOrderId;
        }
        if ((i & 4) != 0) {
            str3 = channelExtraInfo.channelRefundId;
        }
        return channelExtraInfo.copy(str, str2, str3);
    }

    public final ChannelExtraInfo copy(String str, String str2, String str3) {
        return new ChannelExtraInfo(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelExtraInfo)) {
            return false;
        }
        ChannelExtraInfo channelExtraInfo = (ChannelExtraInfo) obj;
        return o.LJ(this.channelMerchantId, channelExtraInfo.channelMerchantId) && o.LJ(this.channelOrderId, channelExtraInfo.channelOrderId) && o.LJ(this.channelRefundId, channelExtraInfo.channelRefundId);
    }

    public int hashCode() {
        String str = this.channelMerchantId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.channelOrderId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.channelRefundId;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ChannelExtraInfo(channelMerchantId=");
        LIZ.append((Object) this.channelMerchantId);
        LIZ.append(", channelOrderId=");
        LIZ.append((Object) this.channelOrderId);
        LIZ.append(", channelRefundId=");
        LIZ.append((Object) this.channelRefundId);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getChannelMerchantId() {
        return this.channelMerchantId;
    }

    public final String getChannelOrderId() {
        return this.channelOrderId;
    }

    public final String getChannelRefundId() {
        return this.channelRefundId;
    }

    public final void setChannelMerchantId(String str) {
        this.channelMerchantId = str;
    }

    public final void setChannelOrderId(String str) {
        this.channelOrderId = str;
    }

    public final void setChannelRefundId(String str) {
        this.channelRefundId = str;
    }

    public ChannelExtraInfo(String str, String str2, String str3) {
        this.channelMerchantId = str;
        this.channelOrderId = str2;
        this.channelRefundId = str3;
    }

    public /* synthetic */ ChannelExtraInfo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
