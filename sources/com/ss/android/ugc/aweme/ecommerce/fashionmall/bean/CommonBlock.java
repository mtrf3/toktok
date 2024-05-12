package com.ss.android.ugc.aweme.ecommerce.fashionmall.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CommonBlock {

    @InterfaceC65349Pkn(alternate = {"data"}, value = "card_list")
    public List<Card> cardList;

    @InterfaceC65349Pkn(alternate = {"key"}, value = "id")
    public String id;

    @InterfaceC65349Pkn("style")
    public String style;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommonBlock copy$default(CommonBlock commonBlock, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commonBlock.id;
        }
        if ((i & 2) != 0) {
            list = commonBlock.cardList;
        }
        if ((i & 4) != 0) {
            str2 = commonBlock.style;
        }
        return commonBlock.copy(str, list, str2);
    }

    public final CommonBlock copy(String str, List<Card> list, String str2) {
        return new CommonBlock(str, list, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonBlock)) {
            return false;
        }
        CommonBlock commonBlock = (CommonBlock) obj;
        return o.LJ(this.id, commonBlock.id) && o.LJ(this.cardList, commonBlock.cardList) && o.LJ(this.style, commonBlock.style);
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Card> list = this.cardList;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.style;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommonBlock(id=");
        LIZ.append(this.id);
        LIZ.append(", cardList=");
        LIZ.append(this.cardList);
        LIZ.append(", style=");
        return q.LIZIZ(LIZ, this.style, ')', LIZ);
    }

    public final List<Card> getCardList() {
        return this.cardList;
    }

    public final String getId() {
        return this.id;
    }

    public final String getStyle() {
        return this.style;
    }

    public final void setCardList(List<Card> list) {
        this.cardList = list;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setStyle(String str) {
        this.style = str;
    }

    public CommonBlock(String str, List<Card> list, String str2) {
        this.id = str;
        this.cardList = list;
        this.style = str2;
    }
}
