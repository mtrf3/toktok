package com.ss.android.ugc.aweme.feed.model.cardinsert;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class CardInsertInfo implements Serializable {

    @InterfaceC65349Pkn("card_id")
    public long cardId;

    @InterfaceC65349Pkn("card_material")
    public String cardInsertStatus;

    @InterfaceC65349Pkn("card_type")
    public int cardType;

    /* JADX WARN: Multi-variable type inference failed */
    public CardInsertInfo() {
        this(0, 0L, null, 7, 0 == true ? 1 : 0);
    }

    public final long getCardId() {
        return this.cardId;
    }

    public final String getCardInsertStatus() {
        return this.cardInsertStatus;
    }

    public final int getCardType() {
        return this.cardType;
    }

    public final void setCardId(long j) {
        this.cardId = j;
    }

    public final void setCardInsertStatus(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.cardInsertStatus = str;
    }

    public final void setCardType(int i) {
        this.cardType = i;
    }

    public CardInsertInfo(int i, long j, String cardInsertStatus) {
        o.LJIIIZ(cardInsertStatus, "cardInsertStatus");
        this.cardType = i;
        this.cardId = j;
        this.cardInsertStatus = cardInsertStatus;
    }

    public /* synthetic */ CardInsertInfo(int i, long j, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? "" : str);
    }
}
