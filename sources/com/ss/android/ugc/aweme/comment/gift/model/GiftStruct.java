package com.ss.android.ugc.aweme.comment.gift.model;

import X.C16880lQ;
import X.C48339Iy7;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class GiftStruct {

    @InterfaceC65349Pkn("describe")
    public final String describeMessage;

    @InterfaceC65349Pkn("diamond_count")
    public final int diamondCount;

    @InterfaceC65349Pkn("asset")
    public final UrlModel effectAsset;

    @InterfaceC65349Pkn("icon")
    public final UrlModel iconList;

    @InterfaceC65349Pkn("id")
    public final long id;

    @InterfaceC65349Pkn("image")
    public final UrlModel imageList;
    public boolean isFromGiftBag;

    @InterfaceC65349Pkn("name")
    public final String name;
    public Integer selectedIndex;

    public static /* synthetic */ GiftStruct copy$default(GiftStruct giftStruct, long j, String str, String str2, int i, UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, Integer num, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = giftStruct.id;
        }
        if ((i2 & 2) != 0) {
            str = giftStruct.name;
        }
        if ((i2 & 4) != 0) {
            str2 = giftStruct.describeMessage;
        }
        if ((i2 & 8) != 0) {
            i = giftStruct.diamondCount;
        }
        if ((i2 & 16) != 0) {
            urlModel = giftStruct.imageList;
        }
        if ((i2 & 32) != 0) {
            urlModel2 = giftStruct.iconList;
        }
        if ((i2 & 64) != 0) {
            urlModel3 = giftStruct.effectAsset;
        }
        if ((i2 & 128) != 0) {
            num = giftStruct.selectedIndex;
        }
        if ((i2 & 256) != 0) {
            z = giftStruct.isFromGiftBag;
        }
        return giftStruct.copy(j, str, str2, i, urlModel, urlModel2, urlModel3, num, z);
    }

    public final GiftStruct copy(long j, String name, String str, int i, UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, Integer num, boolean z) {
        o.LJIIIZ(name, "name");
        return new GiftStruct(j, name, str, i, urlModel, urlModel2, urlModel3, num, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftStruct)) {
            return false;
        }
        GiftStruct giftStruct = (GiftStruct) obj;
        return this.id == giftStruct.id && o.LJ(this.name, giftStruct.name) && o.LJ(this.describeMessage, giftStruct.describeMessage) && this.diamondCount == giftStruct.diamondCount && o.LJ(this.imageList, giftStruct.imageList) && o.LJ(this.iconList, giftStruct.iconList) && o.LJ(this.effectAsset, giftStruct.effectAsset) && o.LJ(this.selectedIndex, giftStruct.selectedIndex) && this.isFromGiftBag == giftStruct.isFromGiftBag;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int LJ = C79062V1e.LJ(this.name, C16880lQ.LLJIJIL(this.id) * 31, 31);
        String str = this.describeMessage;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (((LJ + hashCode) * 31) + this.diamondCount) * 31;
        UrlModel urlModel = this.imageList;
        if (urlModel == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = urlModel.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        UrlModel urlModel2 = this.iconList;
        if (urlModel2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = urlModel2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        UrlModel urlModel3 = this.effectAsset;
        if (urlModel3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = urlModel3.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Integer num = this.selectedIndex;
        if (num != null) {
            i = num.hashCode();
        }
        int i6 = (i5 + i) * 31;
        boolean z = this.isFromGiftBag;
        int i7 = z;
        if (z != 0) {
            i7 = 1;
        }
        return i6 + i7;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GiftStruct(id=");
        LIZ.append(this.id);
        LIZ.append(", name=");
        LIZ.append(this.name);
        LIZ.append(", describeMessage=");
        LIZ.append(this.describeMessage);
        LIZ.append(", diamondCount=");
        LIZ.append(this.diamondCount);
        LIZ.append(", imageList=");
        LIZ.append(this.imageList);
        LIZ.append(", iconList=");
        LIZ.append(this.iconList);
        LIZ.append(", effectAsset=");
        LIZ.append(this.effectAsset);
        LIZ.append(", selectedIndex=");
        LIZ.append(this.selectedIndex);
        LIZ.append(", isFromGiftBag=");
        return C48339Iy7.LIZJ(LIZ, this.isFromGiftBag, ')', LIZ);
    }

    public final String getDescribeMessage() {
        return this.describeMessage;
    }

    public final int getDiamondCount() {
        return this.diamondCount;
    }

    public final UrlModel getEffectAsset() {
        return this.effectAsset;
    }

    public final UrlModel getIconList() {
        return this.iconList;
    }

    public final long getId() {
        return this.id;
    }

    public final UrlModel getImageList() {
        return this.imageList;
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getSelectedIndex() {
        return this.selectedIndex;
    }

    public final boolean isFromGiftBag() {
        return this.isFromGiftBag;
    }

    public final void setFromGiftBag(boolean z) {
        this.isFromGiftBag = z;
    }

    public final void setSelectedIndex(Integer num) {
        this.selectedIndex = num;
    }

    public GiftStruct(long j, String name, String str, int i, UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, Integer num, boolean z) {
        o.LJIIIZ(name, "name");
        this.id = j;
        this.name = name;
        this.describeMessage = str;
        this.diamondCount = i;
        this.imageList = urlModel;
        this.iconList = urlModel2;
        this.effectAsset = urlModel3;
        this.selectedIndex = num;
        this.isFromGiftBag = z;
    }

    public /* synthetic */ GiftStruct(long j, String str, String str2, int i, UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, Integer num, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, i, urlModel, urlModel2, urlModel3, num, (i2 & 256) != 0 ? false : z);
    }
}
