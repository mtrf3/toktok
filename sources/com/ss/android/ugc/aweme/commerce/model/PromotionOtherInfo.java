package com.ss.android.ugc.aweme.commerce.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes13.dex */
public final class PromotionOtherInfo implements Serializable {

    @InterfaceC65349Pkn("card_predict_duration")
    public int cardPredictDuration;

    @InterfaceC65349Pkn("order_share_recommend")
    public boolean isOrderShareRecommend;

    @InterfaceC65349Pkn("recall_reason")
    public String recallReason = "";

    public final int getCardPredictDuration() {
        return this.cardPredictDuration;
    }

    public final String getRecallReason() {
        return this.recallReason;
    }

    public final boolean isOrderShareRecommend() {
        return this.isOrderShareRecommend;
    }

    public final void setCardPredictDuration(int i) {
        this.cardPredictDuration = i;
    }

    public final void setOrderShareRecommend(boolean z) {
        this.isOrderShareRecommend = z;
    }

    public final void setRecallReason(String str) {
        this.recallReason = str;
    }
}
