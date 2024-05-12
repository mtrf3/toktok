package com.bytedance.android.live.wallet.service;

import X.InterfaceC06390Mx;
import com.bytedance.android.live.wallet.model.FeedBackList;

/* loaded from: classes11.dex */
public interface IFeedbackService extends InterfaceC06390Mx {
    int getFeedBackEntrance(int i);

    FeedBackList getFeedBackListItem();

    @Override // X.InterfaceC06390Mx
    /* bridge */ /* synthetic */ void onInit();

    void setFeedBackCancelCount();

    void setFeedBackListCompleted();

    void setFeedBackListItem(FeedBackList feedBackList);

    boolean showFeedBackListWhenPaymentCancel();
}
