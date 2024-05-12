package com.ss.android.ugc.aweme.shortvideo.ui.savelocal.moderation;

import X.AbstractC73672Svk;
import X.E4T;
import X.InterfaceC27211Am7;

/* loaded from: classes2.dex */
public interface VideoModerationService {
    @E4T("/tiktok/moderation/results/v1/")
    AbstractC73672Svk<VideoModerationResponseModels> queryModerationResult(@InterfaceC27211Am7 ModerationsRequest moderationsRequest);
}
