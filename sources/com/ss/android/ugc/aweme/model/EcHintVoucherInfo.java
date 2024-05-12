package com.ss.android.ugc.aweme.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class EcHintVoucherInfo {

    @InterfaceC65349Pkn("ecom_promotion_icon")
    public final EcPromotionIcon ecomPromotionIcon;

    @InterfaceC65349Pkn("face_value_text")
    public final String faceValueText;

    @InterfaceC65349Pkn("is_show_voucher_icon")
    public final Boolean isShowVoucherIcon;

    /* JADX WARN: Multi-variable type inference failed */
    public EcHintVoucherInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ EcHintVoucherInfo copy$default(EcHintVoucherInfo ecHintVoucherInfo, EcPromotionIcon ecPromotionIcon, Boolean bool, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            ecPromotionIcon = ecHintVoucherInfo.ecomPromotionIcon;
        }
        if ((i & 2) != 0) {
            bool = ecHintVoucherInfo.isShowVoucherIcon;
        }
        if ((i & 4) != 0) {
            str = ecHintVoucherInfo.faceValueText;
        }
        return ecHintVoucherInfo.copy(ecPromotionIcon, bool, str);
    }

    public static /* synthetic */ void getFaceValueText$annotations() {
    }

    public static /* synthetic */ void isShowVoucherIcon$annotations() {
    }

    public final EcHintVoucherInfo copy(EcPromotionIcon ecPromotionIcon, Boolean bool, String str) {
        return new EcHintVoucherInfo(ecPromotionIcon, bool, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcHintVoucherInfo)) {
            return false;
        }
        EcHintVoucherInfo ecHintVoucherInfo = (EcHintVoucherInfo) obj;
        return o.LJ(this.ecomPromotionIcon, ecHintVoucherInfo.ecomPromotionIcon) && o.LJ(this.isShowVoucherIcon, ecHintVoucherInfo.isShowVoucherIcon) && o.LJ(this.faceValueText, ecHintVoucherInfo.faceValueText);
    }

    public int hashCode() {
        EcPromotionIcon ecPromotionIcon = this.ecomPromotionIcon;
        int hashCode = (ecPromotionIcon == null ? 0 : ecPromotionIcon.hashCode()) * 31;
        Boolean bool = this.isShowVoucherIcon;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.faceValueText;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EcHintVoucherInfo(ecomPromotionIcon=");
        LIZ.append(this.ecomPromotionIcon);
        LIZ.append(", isShowVoucherIcon=");
        LIZ.append(this.isShowVoucherIcon);
        LIZ.append(", faceValueText=");
        return q.LIZIZ(LIZ, this.faceValueText, ')', LIZ);
    }

    public final EcPromotionIcon getEcomPromotionIcon() {
        return this.ecomPromotionIcon;
    }

    public final String getFaceValueText() {
        return this.faceValueText;
    }

    public final Boolean isShowVoucherIcon() {
        return this.isShowVoucherIcon;
    }

    public EcHintVoucherInfo(EcPromotionIcon ecPromotionIcon, Boolean bool, String str) {
        this.ecomPromotionIcon = ecPromotionIcon;
        this.isShowVoucherIcon = bool;
        this.faceValueText = str;
    }

    public /* synthetic */ EcHintVoucherInfo(EcPromotionIcon ecPromotionIcon, Boolean bool, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : ecPromotionIcon, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : str);
    }
}
