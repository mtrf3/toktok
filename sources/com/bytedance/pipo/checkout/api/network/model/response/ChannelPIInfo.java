package com.bytedance.pipo.checkout.api.network.model.response;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class ChannelPIInfo {

    @InterfaceC65349Pkn("balance_amount")
    public final String balanceAmount;

    @InterfaceC65349Pkn("balance_check")
    public final String balanceCheck;

    @InterfaceC65349Pkn("balance_currency")
    public final String balanceCurrency;

    @InterfaceC65349Pkn("bind_status")
    public final String bindStatus;

    @InterfaceC65349Pkn("dana_mask_id")
    public final String dataMaskId;

    @InterfaceC65349Pkn("query_status")
    public final String queryStatus;

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelPIInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ChannelPIInfo copy$default(ChannelPIInfo channelPIInfo, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = channelPIInfo.balanceAmount;
        }
        if ((i & 2) != 0) {
            str2 = channelPIInfo.balanceCheck;
        }
        if ((i & 4) != 0) {
            str3 = channelPIInfo.balanceCurrency;
        }
        if ((i & 8) != 0) {
            str4 = channelPIInfo.bindStatus;
        }
        if ((i & 16) != 0) {
            str5 = channelPIInfo.dataMaskId;
        }
        if ((i & 32) != 0) {
            str6 = channelPIInfo.queryStatus;
        }
        return channelPIInfo.copy(str, str2, str3, str4, str5, str6);
    }

    public final ChannelPIInfo copy(String str, String str2, String str3, String str4, String str5, String str6) {
        return new ChannelPIInfo(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelPIInfo)) {
            return false;
        }
        ChannelPIInfo channelPIInfo = (ChannelPIInfo) obj;
        return o.LJ(this.balanceAmount, channelPIInfo.balanceAmount) && o.LJ(this.balanceCheck, channelPIInfo.balanceCheck) && o.LJ(this.balanceCurrency, channelPIInfo.balanceCurrency) && o.LJ(this.bindStatus, channelPIInfo.bindStatus) && o.LJ(this.dataMaskId, channelPIInfo.dataMaskId) && o.LJ(this.queryStatus, channelPIInfo.queryStatus);
    }

    public int hashCode() {
        String str = this.balanceAmount;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.balanceCheck;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.balanceCurrency;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bindStatus;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.dataMaskId;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.queryStatus;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ChannelPIInfo(balanceAmount=");
        LIZ.append((Object) this.balanceAmount);
        LIZ.append(", balanceCheck=");
        LIZ.append((Object) this.balanceCheck);
        LIZ.append(", balanceCurrency=");
        LIZ.append((Object) this.balanceCurrency);
        LIZ.append(", bindStatus=");
        LIZ.append((Object) this.bindStatus);
        LIZ.append(", dataMaskId=");
        LIZ.append((Object) this.dataMaskId);
        LIZ.append(", queryStatus=");
        LIZ.append((Object) this.queryStatus);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getBalanceAmount() {
        return this.balanceAmount;
    }

    public final String getBalanceCheck() {
        return this.balanceCheck;
    }

    public final String getBalanceCurrency() {
        return this.balanceCurrency;
    }

    public final String getBindStatus() {
        return this.bindStatus;
    }

    public final String getDataMaskId() {
        return this.dataMaskId;
    }

    public final String getQueryStatus() {
        return this.queryStatus;
    }

    public ChannelPIInfo(String str, String str2, String str3, String str4, String str5, String str6) {
        this.balanceAmount = str;
        this.balanceCheck = str2;
        this.balanceCurrency = str3;
        this.bindStatus = str4;
        this.dataMaskId = str5;
        this.queryStatus = str6;
    }

    public /* synthetic */ ChannelPIInfo(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) == 0 ? str6 : null);
    }
}
