package com.ss.android.ugc.aweme.services.story;

import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class SimplePublishModelKt {
    public static final SimplePublishModel convert2SimplePublishModel(PublishModel publishModel) {
        o.LJIIIZ(publishModel, "<this>");
        return new SimplePublishModel(publishModel.creationId, publishModel.publishId, publishModel.shootWay, publishModel.storyType, publishModel.videoCoverPaths, publishModel);
    }
}
