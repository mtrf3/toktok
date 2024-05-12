package com.bytedance.android.live.wallet.model;

import X.C08880Wm;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.JBR;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class RevenueExchange {

    @InterfaceC65349Pkn("ab_retention_popup")
    public final boolean allowRetentionPopup;

    @InterfaceC65349Pkn("revenue")
    public final long balance;

    @InterfaceC65349Pkn("currency")
    public final String currency;

    @InterfaceC65349Pkn("price_dot")
    public final int dot;

    @InterfaceC65349Pkn("enable")
    public final boolean enableExchange;

    @InterfaceC65349Pkn("exchange_input_option")
    public final int exchangeInputOption;

    @InterfaceC65349Pkn("has_short_video_gift")
    public final boolean isRevenue;

    @InterfaceC65349Pkn("behavior_data")
    public final PopupData popupData;

    @InterfaceC65349Pkn("unit_price")
    public final int price;

    @InterfaceC65349Pkn("region")
    public final String region;

    @InterfaceC65349Pkn("show_exchange_amount_adjusted_text")
    public final boolean showExchangeAmountAdjustedText;

    @InterfaceC65349Pkn("show_exchange_tooltip")
    public final boolean showExchangeTooltip;

    public static /* synthetic */ RevenueExchange copy$default(RevenueExchange revenueExchange, String str, boolean z, boolean z2, int i, String str2, long j, int i2, boolean z3, boolean z4, int i3, PopupData popupData, boolean z5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = revenueExchange.currency;
        }
        if ((i4 & 2) != 0) {
            z = revenueExchange.enableExchange;
        }
        if ((i4 & 4) != 0) {
            z2 = revenueExchange.isRevenue;
        }
        if ((i4 & 8) != 0) {
            i = revenueExchange.dot;
        }
        if ((i4 & 16) != 0) {
            str2 = revenueExchange.region;
        }
        if ((i4 & 32) != 0) {
            j = revenueExchange.balance;
        }
        if ((i4 & 64) != 0) {
            i2 = revenueExchange.price;
        }
        if ((i4 & 128) != 0) {
            z3 = revenueExchange.showExchangeTooltip;
        }
        if ((i4 & 256) != 0) {
            z4 = revenueExchange.showExchangeAmountAdjustedText;
        }
        if ((i4 & 512) != 0) {
            i3 = revenueExchange.exchangeInputOption;
        }
        if ((i4 & 1024) != 0) {
            popupData = revenueExchange.popupData;
        }
        if ((i4 & 2048) != 0) {
            z5 = revenueExchange.allowRetentionPopup;
        }
        return revenueExchange.copy(str, z, z2, i, str2, j, i2, z3, z4, i3, popupData, z5);
    }

    public final RevenueExchange copy(String currency, boolean z, boolean z2, int i, String region, long j, int i2, boolean z3, boolean z4, int i3, PopupData popupData, boolean z5) {
        o.LJIIIZ(currency, "currency");
        o.LJIIIZ(region, "region");
        return new RevenueExchange(currency, z, z2, i, region, j, i2, z3, z4, i3, popupData, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RevenueExchange)) {
            return false;
        }
        RevenueExchange revenueExchange = (RevenueExchange) obj;
        return o.LJ(this.currency, revenueExchange.currency) && this.enableExchange == revenueExchange.enableExchange && this.isRevenue == revenueExchange.isRevenue && this.dot == revenueExchange.dot && o.LJ(this.region, revenueExchange.region) && this.balance == revenueExchange.balance && this.price == revenueExchange.price && this.showExchangeTooltip == revenueExchange.showExchangeTooltip && this.showExchangeAmountAdjustedText == revenueExchange.showExchangeAmountAdjustedText && this.exchangeInputOption == revenueExchange.exchangeInputOption && o.LJ(this.popupData, revenueExchange.popupData) && this.allowRetentionPopup == revenueExchange.allowRetentionPopup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2 = this.currency.hashCode() * 31;
        boolean z = this.enableExchange;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode2 + i2) * 31;
        boolean z2 = this.isRevenue;
        int i4 = z2;
        if (z2 != 0) {
            i4 = 1;
        }
        int LIZJ = (JBR.LIZJ(this.balance, C79062V1e.LJ(this.region, (((i3 + i4) * 31) + this.dot) * 31, 31), 31) + this.price) * 31;
        boolean z3 = this.showExchangeTooltip;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (LIZJ + i5) * 31;
        boolean z4 = this.showExchangeAmountAdjustedText;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int i8 = (((i6 + i7) * 31) + this.exchangeInputOption) * 31;
        PopupData popupData = this.popupData;
        if (popupData == null) {
            hashCode = 0;
        } else {
            hashCode = popupData.hashCode();
        }
        int i9 = (i8 + hashCode) * 31;
        if (!this.allowRetentionPopup) {
            i = 0;
        }
        return i9 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RevenueExchange(currency=");
        sb.append(this.currency);
        sb.append(", enableExchange=");
        sb.append(this.enableExchange);
        sb.append(", isRevenue=");
        sb.append(this.isRevenue);
        sb.append(", dot=");
        sb.append(this.dot);
        sb.append(", region=");
        sb.append(this.region);
        sb.append(", balance=");
        sb.append(this.balance);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", showExchangeTooltip=");
        sb.append(this.showExchangeTooltip);
        sb.append(", showExchangeAmountAdjustedText=");
        sb.append(this.showExchangeAmountAdjustedText);
        sb.append(", exchangeInputOption=");
        sb.append(this.exchangeInputOption);
        sb.append(", popupData=");
        sb.append(this.popupData);
        sb.append(", allowRetentionPopup=");
        return C08880Wm.LIZJ(sb, this.allowRetentionPopup, ')');
    }

    public final boolean getAllowRetentionPopup() {
        return this.allowRetentionPopup;
    }

    public final long getBalance() {
        return this.balance;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final int getDot() {
        return this.dot;
    }

    public final boolean getEnableExchange() {
        return this.enableExchange;
    }

    public final int getExchangeInputOption() {
        return this.exchangeInputOption;
    }

    public final PopupData getPopupData() {
        return this.popupData;
    }

    public final int getPrice() {
        return this.price;
    }

    public final String getRegion() {
        return this.region;
    }

    public final boolean getShowExchangeAmountAdjustedText() {
        return this.showExchangeAmountAdjustedText;
    }

    public final boolean getShowExchangeTooltip() {
        return this.showExchangeTooltip;
    }

    public final boolean isRevenue() {
        return this.isRevenue;
    }

    public RevenueExchange(String currency, boolean z, boolean z2, int i, String region, long j, int i2, boolean z3, boolean z4, int i3, PopupData popupData, boolean z5) {
        o.LJIIIZ(currency, "currency");
        o.LJIIIZ(region, "region");
        this.currency = currency;
        this.enableExchange = z;
        this.isRevenue = z2;
        this.dot = i;
        this.region = region;
        this.balance = j;
        this.price = i2;
        this.showExchangeTooltip = z3;
        this.showExchangeAmountAdjustedText = z4;
        this.exchangeInputOption = i3;
        this.popupData = popupData;
        this.allowRetentionPopup = z5;
    }

    public /* synthetic */ RevenueExchange(String str, boolean z, boolean z2, int i, String str2, long j, int i2, boolean z3, boolean z4, int i3, PopupData popupData, boolean z5, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? false : z, (i4 & 4) != 0 ? false : z2, (i4 & 8) != 0 ? 0 : i, (i4 & 16) == 0 ? str2 : "", (i4 & 32) != 0 ? 0L : j, (i4 & 64) != 0 ? 0 : i2, (i4 & 128) != 0 ? false : z3, (i4 & 256) != 0 ? false : z4, (i4 & 512) != 0 ? 0 : i3, popupData, (i4 & 2048) != 0 ? false : z5);
    }
}
