package com.ss.android.ugc.aweme.ecommerce.mall.bean;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class Card {

    @InterfaceC65349Pkn("style")
    public String style;

    @InterfaceC65349Pkn("tip_list")
    public List<CardTip> tipList;

    @InterfaceC65349Pkn("type")
    public int type;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Card copy$default(Card card, int i, String str, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = card.type;
        }
        if ((i2 & 2) != 0) {
            str = card.style;
        }
        if ((i2 & 4) != 0) {
            list = card.tipList;
        }
        return card.copy(i, str, list);
    }

    public final Card copy(int i, String str, List<CardTip> list) {
        return new Card(i, str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Card)) {
            return false;
        }
        Card card = (Card) obj;
        return this.type == card.type && o.LJ(this.style, card.style) && o.LJ(this.tipList, card.tipList);
    }

    public int hashCode() {
        int i = this.type * 31;
        String str = this.style;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        List<CardTip> list = this.tipList;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Card(type=");
        LIZ.append(this.type);
        LIZ.append(", style=");
        LIZ.append(this.style);
        LIZ.append(", tipList=");
        return C1NE.LIZIZ(LIZ, this.tipList, ')', LIZ);
    }

    public final String getStyle() {
        return this.style;
    }

    public final List<CardTip> getTipList() {
        return this.tipList;
    }

    public final int getType() {
        return this.type;
    }

    public final void setStyle(String str) {
        this.style = str;
    }

    public final void setTipList(List<CardTip> list) {
        this.tipList = list;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public Card(int i, String str, List<CardTip> list) {
        this.type = i;
        this.style = str;
        this.tipList = list;
    }
}
