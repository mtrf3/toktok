package com.bytedance.android.livesdk.chatroom.api;

import X.AbstractC73672Svk;
import X.E8L;
import webcast.api.room.SwipingGuidanceResponse;

/* loaded from: classes6.dex */
public interface SlideGuideApi {
    @E8L("/webcast/room/swiping_guidance")
    AbstractC73672Svk<SwipingGuidanceResponse> getUserTypeForSlideGuide();
}
