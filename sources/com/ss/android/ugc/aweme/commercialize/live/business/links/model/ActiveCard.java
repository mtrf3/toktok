package com.ss.android.ugc.aweme.commercialize.live.business.links.model;

import X.C16880lQ;
import X.C43588H8u;
import X.C48339Iy7;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ActiveCard implements Serializable {

    @InterfaceC65349Pkn("cardType")
    public final int cardType;

    @InterfaceC65349Pkn("gameUrl")
    public final String gameUrl;

    @InterfaceC65349Pkn("id")
    public final long id;

    @InterfaceC65349Pkn("isPinned")
    public final boolean isPinned;

    @InterfaceC65349Pkn("pic")
    public final String pic;

    @InterfaceC65349Pkn("subtitle")
    public final String subtitle;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("url")
    public final String url;

    public static /* synthetic */ ActiveCard copy$default(ActiveCard activeCard, long j, String str, String str2, String str3, String str4, int i, String str5, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = activeCard.id;
        }
        if ((i2 & 2) != 0) {
            str = activeCard.title;
        }
        if ((i2 & 4) != 0) {
            str2 = activeCard.subtitle;
        }
        if ((i2 & 8) != 0) {
            str3 = activeCard.url;
        }
        if ((i2 & 16) != 0) {
            str4 = activeCard.pic;
        }
        if ((i2 & 32) != 0) {
            i = activeCard.cardType;
        }
        if ((i2 & 64) != 0) {
            str5 = activeCard.gameUrl;
        }
        if ((i2 & 128) != 0) {
            z = activeCard.isPinned;
        }
        return activeCard.copy(j, str, str2, str3, str4, i, str5, z);
    }

    public final ActiveCard copy(long j, String title, String subtitle, String url, String pic, int i, String str, boolean z) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(subtitle, "subtitle");
        o.LJIIIZ(url, "url");
        o.LJIIIZ(pic, "pic");
        return new ActiveCard(j, title, subtitle, url, pic, i, str, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActiveCard)) {
            return false;
        }
        ActiveCard activeCard = (ActiveCard) obj;
        return this.id == activeCard.id && o.LJ(this.title, activeCard.title) && o.LJ(this.subtitle, activeCard.subtitle) && o.LJ(this.url, activeCard.url) && o.LJ(this.pic, activeCard.pic) && this.cardType == activeCard.cardType && o.LJ(this.gameUrl, activeCard.gameUrl) && this.isPinned == activeCard.isPinned;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int LJ = (C79062V1e.LJ(this.pic, C79062V1e.LJ(this.url, C79062V1e.LJ(this.subtitle, C79062V1e.LJ(this.title, C16880lQ.LLJIJIL(this.id) * 31, 31), 31), 31), 31) + this.cardType) * 31;
        String str = this.gameUrl;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i = (LJ + hashCode) * 31;
        boolean z = this.isPinned;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ActiveCard(id=");
        LIZ.append(this.id);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", subtitle=");
        LIZ.append(this.subtitle);
        LIZ.append(", url=");
        LIZ.append(this.url);
        LIZ.append(", pic=");
        LIZ.append(this.pic);
        LIZ.append(", cardType=");
        LIZ.append(this.cardType);
        LIZ.append(", gameUrl=");
        LIZ.append(this.gameUrl);
        LIZ.append(", isPinned=");
        return C48339Iy7.LIZJ(LIZ, this.isPinned, ')', LIZ);
    }

    public final int getCardType() {
        return this.cardType;
    }

    public final String getGameUrl() {
        return this.gameUrl;
    }

    public final long getId() {
        return this.id;
    }

    public final String getPic() {
        return this.pic;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean isPinned() {
        return this.isPinned;
    }

    public ActiveCard(long j, String str, String str2, String str3, String str4, int i, String str5, boolean z) {
        C43588H8u.LIZLLL(str, "title", str2, "subtitle", str3, "url", str4, "pic");
        this.id = j;
        this.title = str;
        this.subtitle = str2;
        this.url = str3;
        this.pic = str4;
        this.cardType = i;
        this.gameUrl = str5;
        this.isPinned = z;
    }
}
