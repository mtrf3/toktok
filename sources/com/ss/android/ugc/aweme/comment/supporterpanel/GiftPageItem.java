package com.ss.android.ugc.aweme.comment.supporterpanel;

import X.C16880lQ;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GiftPageItem {

    @InterfaceC65349Pkn("asset")
    public final UrlModel assetURL;

    @InterfaceC65349Pkn("describe")
    public final String describe;

    @InterfaceC65349Pkn("diamond_count")
    public final long diamondCount;

    @InterfaceC65349Pkn("icon_large")
    public final UrlModel iconLarge;

    @InterfaceC65349Pkn("icon_medium")
    public final UrlModel iconMedium;

    @InterfaceC65349Pkn("icon")
    public final UrlModel iconURL;

    @InterfaceC65349Pkn("id")
    public final long id;

    @InterfaceC65349Pkn("image")
    public final UrlModel imageURL;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("type")
    public final Integer type;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftPageItem)) {
            return false;
        }
        GiftPageItem giftPageItem = (GiftPageItem) obj;
        return this.id == giftPageItem.id && o.LJ(this.name, giftPageItem.name) && o.LJ(this.describe, giftPageItem.describe) && this.diamondCount == giftPageItem.diamondCount && o.LJ(this.imageURL, giftPageItem.imageURL) && o.LJ(this.iconURL, giftPageItem.iconURL) && o.LJ(this.assetURL, giftPageItem.assetURL) && o.LJ(this.iconMedium, giftPageItem.iconMedium) && o.LJ(this.iconLarge, giftPageItem.iconLarge) && o.LJ(this.type, giftPageItem.type);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int LLJIJIL = C16880lQ.LLJIJIL(this.id) * 31;
        String str = this.name;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LLJIJIL + hashCode) * 31;
        String str2 = this.describe;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.diamondCount, (i2 + hashCode2) * 31, 31);
        UrlModel urlModel = this.imageURL;
        if (urlModel == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = urlModel.hashCode();
        }
        int i3 = (LIZJ + hashCode3) * 31;
        UrlModel urlModel2 = this.iconURL;
        if (urlModel2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = urlModel2.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        UrlModel urlModel3 = this.assetURL;
        if (urlModel3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = urlModel3.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        UrlModel urlModel4 = this.iconMedium;
        if (urlModel4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = urlModel4.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        UrlModel urlModel5 = this.iconLarge;
        if (urlModel5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = urlModel5.hashCode();
        }
        int i7 = (i6 + hashCode7) * 31;
        Integer num = this.type;
        if (num != null) {
            i = num.hashCode();
        }
        return i7 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GiftPageItem(id=");
        LIZ.append(this.id);
        LIZ.append(", name=");
        LIZ.append(this.name);
        LIZ.append(", describe=");
        LIZ.append(this.describe);
        LIZ.append(", diamondCount=");
        LIZ.append(this.diamondCount);
        LIZ.append(", imageURL=");
        LIZ.append(this.imageURL);
        LIZ.append(", iconURL=");
        LIZ.append(this.iconURL);
        LIZ.append(", assetURL=");
        LIZ.append(this.assetURL);
        LIZ.append(", iconMedium=");
        LIZ.append(this.iconMedium);
        LIZ.append(", iconLarge=");
        LIZ.append(this.iconLarge);
        LIZ.append(", type=");
        return s0.LIZJ(LIZ, this.type, ')', LIZ);
    }

    public GiftPageItem(long j, String str, String str2, long j2, UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, UrlModel urlModel4, UrlModel urlModel5, Integer num) {
        this.id = j;
        this.name = str;
        this.describe = str2;
        this.diamondCount = j2;
        this.imageURL = urlModel;
        this.iconURL = urlModel2;
        this.assetURL = urlModel3;
        this.iconMedium = urlModel4;
        this.iconLarge = urlModel5;
        this.type = num;
    }
}
