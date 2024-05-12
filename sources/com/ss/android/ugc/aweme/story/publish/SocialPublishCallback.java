package com.ss.android.ugc.aweme.story.publish;

import X.C41759GaB;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;

/* loaded from: classes8.dex */
public interface SocialPublishCallback {
    void onPublishFailed(PublishModel publishModel, C41759GaB c41759GaB, String str);

    void onPublishProgress(int i, PublishModel publishModel);

    void onPublishStart(PublishModel publishModel);

    void onPublishSuccess(PublishModel publishModel, CreateAwemeResponse createAwemeResponse);

    void onReadyToCreateAweme(PublishModel publishModel);

    void onSynthetiseSuccess(PublishModel publishModel, String str);
}
