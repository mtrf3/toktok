package com.ss.android.ugc.aweme.feed.model.cardinsert;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class CardInsertResultInfo extends F9E implements Serializable {

    @InterfaceC65349Pkn("card_id")
    public long cardId;

    @InterfaceC65349Pkn("card_insert_status")
    public int cardInsertStatus;

    @InterfaceC65349Pkn("card_type")
    public int cardType;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CardInsertResultInfo() {
        /*
            r7 = this;
            r1 = 0
            r2 = 0
            r5 = 7
            r6 = 0
            r0 = r7
            r4 = r1
            r0.<init>(r1, r2, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertResultInfo.<init>():void");
    }

    public static /* synthetic */ CardInsertResultInfo copy$default(CardInsertResultInfo cardInsertResultInfo, int i, long j, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = cardInsertResultInfo.cardType;
        }
        if ((i3 & 2) != 0) {
            j = cardInsertResultInfo.cardId;
        }
        if ((i3 & 4) != 0) {
            i2 = cardInsertResultInfo.cardInsertStatus;
        }
        return cardInsertResultInfo.copy(i, j, i2);
    }

    public final CardInsertResultInfo copy(int i, long j, int i2) {
        return new CardInsertResultInfo(i, j, i2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.cardType), Long.valueOf(this.cardId), Integer.valueOf(this.cardInsertStatus)};
    }

    public final long getCardId() {
        return this.cardId;
    }

    public final int getCardInsertStatus() {
        return this.cardInsertStatus;
    }

    public final int getCardType() {
        return this.cardType;
    }

    public final void setCardId(long j) {
        this.cardId = j;
    }

    public final void setCardInsertStatus(int i) {
        this.cardInsertStatus = i;
    }

    public final void setCardType(int i) {
        this.cardType = i;
    }

    public CardInsertResultInfo(int i, long j, int i2) {
        this.cardType = i;
        this.cardId = j;
        this.cardInsertStatus = i2;
    }

    public /* synthetic */ CardInsertResultInfo(int i, long j, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0L : j, (i3 & 4) != 0 ? 0 : i2);
    }
}
