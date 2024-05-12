package com.ss.android.ugc.aweme.services.story.forward;

import X.C47261Igj;
import com.ss.android.ugc.aweme.services.story.SimplePublishModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ForwardDataKt {
    public static final SimplePublishModel convert2SimplePublishModel(QuickForwardResult quickForwardResult) {
        o.LJIIIZ(quickForwardResult, "<this>");
        return new SimplePublishModel(quickForwardResult.getCreationId(), quickForwardResult.getScheduleId(), quickForwardResult.getShootWay(), quickForwardResult.getStoryType(), C47261Igj.LJJIJ(quickForwardResult.getCoverPath()), null);
    }
}
