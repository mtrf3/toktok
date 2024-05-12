package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class BonusInfo {

    @InterfaceC65349Pkn("non_redeem_reason")
    public final String nonRedeemReason;

    @InterfaceC65349Pkn("redeem_amount")
    public final ColorText redeemAmount;

    @InterfaceC65349Pkn("redeem_amount_value")
    public final String redeemAmountValue;

    @InterfaceC65349Pkn("redeem_can_be_used")
    public final Boolean redeemCanBeUsed;

    @InterfaceC65349Pkn("redeem_icon")
    public final Icon redeemIcon;

    @InterfaceC65349Pkn("redeem_info")
    public final ExceptionUX redeemInfo;

    @InterfaceC65349Pkn("redeem_title")
    public final String redeemTitle;

    @InterfaceC65349Pkn("use_bonus_redeem")
    public final Boolean useBonusRedeem;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BonusInfo)) {
            return false;
        }
        BonusInfo bonusInfo = (BonusInfo) obj;
        return o.LJ(this.redeemIcon, bonusInfo.redeemIcon) && o.LJ(this.redeemTitle, bonusInfo.redeemTitle) && o.LJ(this.redeemAmount, bonusInfo.redeemAmount) && o.LJ(this.redeemCanBeUsed, bonusInfo.redeemCanBeUsed) && o.LJ(this.useBonusRedeem, bonusInfo.useBonusRedeem) && o.LJ(this.nonRedeemReason, bonusInfo.nonRedeemReason) && o.LJ(this.redeemInfo, bonusInfo.redeemInfo) && o.LJ(this.redeemAmountValue, bonusInfo.redeemAmountValue);
    }

    public final int hashCode() {
        Icon icon = this.redeemIcon;
        int hashCode = (icon == null ? 0 : icon.hashCode()) * 31;
        String str = this.redeemTitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ColorText colorText = this.redeemAmount;
        int hashCode3 = (hashCode2 + (colorText == null ? 0 : colorText.hashCode())) * 31;
        Boolean bool = this.redeemCanBeUsed;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.useBonusRedeem;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.nonRedeemReason;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ExceptionUX exceptionUX = this.redeemInfo;
        int hashCode7 = (hashCode6 + (exceptionUX == null ? 0 : exceptionUX.hashCode())) * 31;
        String str3 = this.redeemAmountValue;
        return hashCode7 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BonusInfo(redeemIcon=");
        LIZ.append(this.redeemIcon);
        LIZ.append(", redeemTitle=");
        LIZ.append(this.redeemTitle);
        LIZ.append(", redeemAmount=");
        LIZ.append(this.redeemAmount);
        LIZ.append(", redeemCanBeUsed=");
        LIZ.append(this.redeemCanBeUsed);
        LIZ.append(", useBonusRedeem=");
        LIZ.append(this.useBonusRedeem);
        LIZ.append(", nonRedeemReason=");
        LIZ.append(this.nonRedeemReason);
        LIZ.append(", redeemInfo=");
        LIZ.append(this.redeemInfo);
        LIZ.append(", redeemAmountValue=");
        return q.LIZIZ(LIZ, this.redeemAmountValue, ')', LIZ);
    }

    public BonusInfo(Icon icon, String str, ColorText colorText, Boolean bool, Boolean bool2, String str2, ExceptionUX exceptionUX, String str3) {
        this.redeemIcon = icon;
        this.redeemTitle = str;
        this.redeemAmount = colorText;
        this.redeemCanBeUsed = bool;
        this.useBonusRedeem = bool2;
        this.nonRedeemReason = str2;
        this.redeemInfo = exceptionUX;
        this.redeemAmountValue = str3;
    }
}
