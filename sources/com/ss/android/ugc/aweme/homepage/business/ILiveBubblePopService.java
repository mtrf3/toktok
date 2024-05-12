package com.ss.android.ugc.aweme.homepage.business;

/* loaded from: classes10.dex */
public interface ILiveBubblePopService {
    boolean isShowingAd();

    boolean isShowingDialog();

    boolean isShowingInnerPush();

    boolean isShowingVideoGuide();

    void observerIsShowInnerPush();

    void unregisterObserverInnerPush();
}
