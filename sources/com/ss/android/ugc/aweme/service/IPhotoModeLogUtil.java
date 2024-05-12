package com.ss.android.ugc.aweme.service;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.PostModeEgressEtData;

/* loaded from: classes2.dex */
public interface IPhotoModeLogUtil {
    void logBackToFeed(PostModeEgressEtData postModeEgressEtData, String str, Aweme aweme);

    void logPinchZoom(String str, Aweme aweme, int i, long j, boolean z, Integer num, boolean z2, Float f, Boolean bool, Boolean bool2, Boolean bool3);
}
