package com.ss.android.ugc.aweme.services.now;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.now.model.CreativeNowDraft;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;

/* loaded from: classes7.dex */
public interface ICreativeNowDataConverter {
    CreativeNowDraft convert2NowDraft(AwemeDraft awemeDraft);

    CreativeNowDraft convert2NowDraft(PublishModel publishModel);

    Bitmap getNowCover(CreativeNowDraft creativeNowDraft);
}
