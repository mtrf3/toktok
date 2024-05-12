package com.ss.android.ugc.aweme.services.story;

import X.ActivityC45651qj;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.shortvideo.recoverpanel.PublishFailureReason;

/* loaded from: classes8.dex */
public interface IStoryPublishService {
    void getCover(SimplePublishModel simplePublishModel, StoryCoverExtractConfig storyCoverExtractConfig, InterfaceC88472Yns<? super Bitmap, C76800UCe> interfaceC88472Yns);

    IStoryGroupScheduleService getGroupScheduleService();

    void retryPublish(ActivityC45651qj activityC45651qj, SimplePublishModel simplePublishModel, PublishFailureReason publishFailureReason, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns);
}
