package com.ss.android.ugc.aweme.services.video;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.effect.IEffectService;

/* loaded from: classes8.dex */
public interface IVideoCoverService {
    void getVideoCoverByCallback(AwemeDraft awemeDraft, IEffectService.OnVideoCoverCallback onVideoCoverCallback);
}
