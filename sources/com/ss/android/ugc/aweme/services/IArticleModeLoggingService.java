package com.ss.android.ugc.aweme.services;

import X.C188727au;

/* loaded from: classes11.dex */
public interface IArticleModeLoggingService {
    void logArticleDetailExit(String str);

    void logArticleDetailStaytime(C188727au c188727au, Integer num, Long l);

    void logClickCopyLink();

    void logClickMoreAction();

    void logClickOpenOtherBrowser(String str, String str2);

    void logClickReport(String str, Integer num, String str2, String str3);

    void logClickRetry(String str, String str2);

    void logEnterArticleDetail(C188727au c188727au, Integer num);

    void logMultiAnchorStayTime(C188727au c188727au, long j);

    void logRssFeedClick(String str);
}
