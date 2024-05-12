package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.InterfaceC65349Pkn;
import X.WM7;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class CardInfo {

    @InterfaceC65349Pkn("business_id")
    public String businessId;

    @InterfaceC65349Pkn("business_type")
    public String businessType;

    @InterfaceC65349Pkn("card_key")
    public String cardKey;

    @InterfaceC65349Pkn("card_template")
    public String cardTemplate;

    @InterfaceC65349Pkn("default_height")
    public final int defaultHeight;

    @InterfaceC65349Pkn("default_width")
    public final int defaultWidth;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public String scene;

    public static /* synthetic */ CardInfo copy$default(CardInfo cardInfo, String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = cardInfo.cardKey;
        }
        if ((i3 & 2) != 0) {
            str2 = cardInfo.cardTemplate;
        }
        if ((i3 & 4) != 0) {
            str3 = cardInfo.businessType;
        }
        if ((i3 & 8) != 0) {
            str4 = cardInfo.businessId;
        }
        if ((i3 & 16) != 0) {
            str5 = cardInfo.scene;
        }
        if ((i3 & 32) != 0) {
            i = cardInfo.defaultWidth;
        }
        if ((i3 & 64) != 0) {
            i2 = cardInfo.defaultHeight;
        }
        return cardInfo.copy(str, str2, str3, str4, str5, i, i2);
    }

    public final CardInfo copy(String str, String str2, String str3, String str4, String str5, int i, int i2) {
        return new CardInfo(str, str2, str3, str4, str5, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardInfo)) {
            return false;
        }
        CardInfo cardInfo = (CardInfo) obj;
        return o.LJ(this.cardKey, cardInfo.cardKey) && o.LJ(this.cardTemplate, cardInfo.cardTemplate) && o.LJ(this.businessType, cardInfo.businessType) && o.LJ(this.businessId, cardInfo.businessId) && o.LJ(this.scene, cardInfo.scene) && this.defaultWidth == cardInfo.defaultWidth && this.defaultHeight == cardInfo.defaultHeight;
    }

    public int hashCode() {
        String str = this.cardKey;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cardTemplate;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.businessType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.businessId;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.scene;
        return ((((hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.defaultWidth) * 31) + this.defaultHeight;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CardInfo(cardKey=");
        LIZ.append(this.cardKey);
        LIZ.append(", cardTemplate=");
        LIZ.append(this.cardTemplate);
        LIZ.append(", businessType=");
        LIZ.append(this.businessType);
        LIZ.append(", businessId=");
        LIZ.append(this.businessId);
        LIZ.append(", scene=");
        LIZ.append(this.scene);
        LIZ.append(", defaultWidth=");
        LIZ.append(this.defaultWidth);
        LIZ.append(", defaultHeight=");
        return b0.LIZJ(LIZ, this.defaultHeight, ')', LIZ);
    }

    public final String getBusinessId() {
        return this.businessId;
    }

    public final String getBusinessType() {
        return this.businessType;
    }

    public final String getCardKey() {
        return this.cardKey;
    }

    public final String getCardTemplate() {
        return this.cardTemplate;
    }

    public final int getDefaultHeight() {
        return this.defaultHeight;
    }

    public final int getDefaultWidth() {
        return this.defaultWidth;
    }

    public final String getScene() {
        return this.scene;
    }

    public final void setBusinessId(String str) {
        this.businessId = str;
    }

    public final void setBusinessType(String str) {
        this.businessType = str;
    }

    public final void setCardKey(String str) {
        this.cardKey = str;
    }

    public final void setCardTemplate(String str) {
        this.cardTemplate = str;
    }

    public final void setScene(String str) {
        this.scene = str;
    }

    public CardInfo(String str, String str2, String str3, String str4, String str5, int i, int i2) {
        this.cardKey = str;
        this.cardTemplate = str2;
        this.businessType = str3;
        this.businessId = str4;
        this.scene = str5;
        this.defaultWidth = i;
        this.defaultHeight = i2;
    }

    public /* synthetic */ CardInfo(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? null : str3, (i3 & 8) != 0 ? null : str4, (i3 & 16) == 0 ? str5 : null, i, i2);
    }
}
