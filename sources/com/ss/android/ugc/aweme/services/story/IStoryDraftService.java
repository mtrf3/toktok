package com.ss.android.ugc.aweme.services.story;

import X.C76800UCe;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.List;

/* loaded from: classes8.dex */
public interface IStoryDraftService {
    void deleteDraft(SimplePublishModel simplePublishModel);

    void getStoryDraftList(InterfaceC88472Yns<? super List<PublishModel>, C76800UCe> interfaceC88472Yns);
}
