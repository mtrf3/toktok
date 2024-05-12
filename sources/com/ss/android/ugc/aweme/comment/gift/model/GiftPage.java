package com.ss.android.ugc.aweme.comment.gift.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class GiftPage {

    @InterfaceC65349Pkn("gifts")
    public final List<GiftStruct> giftList;

    @InterfaceC65349Pkn("page_type")
    public final int giftPageType;

    @InterfaceC65349Pkn("page_name")
    public final String pageName;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GiftPage copy$default(GiftPage giftPage, String str, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = giftPage.pageName;
        }
        if ((i2 & 2) != 0) {
            list = giftPage.giftList;
        }
        if ((i2 & 4) != 0) {
            i = giftPage.giftPageType;
        }
        return giftPage.copy(str, list, i);
    }

    public final GiftPage copy(String pageName, List<GiftStruct> list, int i) {
        o.LJIIIZ(pageName, "pageName");
        return new GiftPage(pageName, list, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftPage)) {
            return false;
        }
        GiftPage giftPage = (GiftPage) obj;
        return o.LJ(this.pageName, giftPage.pageName) && o.LJ(this.giftList, giftPage.giftList) && this.giftPageType == giftPage.giftPageType;
    }

    public int hashCode() {
        int hashCode = this.pageName.hashCode() * 31;
        List<GiftStruct> list = this.giftList;
        return ((hashCode + (list == null ? 0 : list.hashCode())) * 31) + this.giftPageType;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GiftPage(pageName=");
        LIZ.append(this.pageName);
        LIZ.append(", giftList=");
        LIZ.append(this.giftList);
        LIZ.append(", giftPageType=");
        return b0.LIZJ(LIZ, this.giftPageType, ')', LIZ);
    }

    public final List<GiftStruct> getGiftList() {
        return this.giftList;
    }

    public final int getGiftPageType() {
        return this.giftPageType;
    }

    public final String getPageName() {
        return this.pageName;
    }

    public GiftPage(String pageName, List<GiftStruct> list, int i) {
        o.LJIIIZ(pageName, "pageName");
        this.pageName = pageName;
        this.giftList = list;
        this.giftPageType = i;
    }
}
