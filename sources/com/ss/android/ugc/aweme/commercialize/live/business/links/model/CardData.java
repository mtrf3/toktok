package com.ss.android.ugc.aweme.commercialize.live.business.links.model;

import X.C43588H8u;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class CardData {

    @InterfaceC65349Pkn("card_type")
    public final int cardType;

    @InterfaceC65349Pkn("game_url")
    public final String gameUrl;

    @InterfaceC65349Pkn("link_id")
    public final long linkId;

    @InterfaceC65349Pkn("link_url")
    public final String linkUrl;

    @InterfaceC65349Pkn("pic_url")
    public final String picUrl;

    @InterfaceC65349Pkn("subtitle")
    public final String subtitle;

    @InterfaceC65349Pkn("title")
    public final String title;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardData)) {
            return false;
        }
        CardData cardData = (CardData) obj;
        return o.LJ(this.title, cardData.title) && o.LJ(this.subtitle, cardData.subtitle) && o.LJ(this.picUrl, cardData.picUrl) && this.linkId == cardData.linkId && o.LJ(this.linkUrl, cardData.linkUrl) && this.cardType == cardData.cardType && o.LJ(this.gameUrl, cardData.gameUrl);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = (C79062V1e.LJ(this.linkUrl, JBR.LIZJ(this.linkId, C79062V1e.LJ(this.picUrl, C79062V1e.LJ(this.subtitle, this.title.hashCode() * 31, 31), 31), 31), 31) + this.cardType) * 31;
        String str = this.gameUrl;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return LJ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CardData(title=");
        LIZ.append(this.title);
        LIZ.append(", subtitle=");
        LIZ.append(this.subtitle);
        LIZ.append(", picUrl=");
        LIZ.append(this.picUrl);
        LIZ.append(", linkId=");
        LIZ.append(this.linkId);
        LIZ.append(", linkUrl=");
        LIZ.append(this.linkUrl);
        LIZ.append(", cardType=");
        LIZ.append(this.cardType);
        LIZ.append(", gameUrl=");
        return q.LIZIZ(LIZ, this.gameUrl, ')', LIZ);
    }

    public CardData(String str, String str2, String str3, long j, String str4, int i, String str5) {
        C43588H8u.LIZLLL(str, "title", str2, "subtitle", str3, "picUrl", str4, "linkUrl");
        this.title = str;
        this.subtitle = str2;
        this.picUrl = str3;
        this.linkId = j;
        this.linkUrl = str4;
        this.cardType = i;
        this.gameUrl = str5;
    }

    public /* synthetic */ CardData(String str, String str2, String str3, long j, String str4, int i, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, j, str4, i, (i2 & 64) != 0 ? null : str5);
    }
}
