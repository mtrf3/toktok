package com.ss.android.ugc.aweme.services.story.forward;

import com.ss.android.ugc.aweme.sticker.data.VideoShareInfoStruct;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class QuickForwardConfig extends ForwardConfig {
    public final QuickForwardPublishLock publishLock;
    public final VideoShareInfoStruct videoShareInfoStruct;
    public final boolean withoutLanding;

    /* JADX WARN: Multi-variable type inference failed */
    public QuickForwardConfig() {
        this(null, 0 == true ? 1 : 0, false, 7, 0 == true ? 1 : 0);
    }

    public final QuickForwardPublishLock getPublishLock() {
        return this.publishLock;
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardConfig
    public VideoShareInfoStruct getVideoShareInfoStruct() {
        return this.videoShareInfoStruct;
    }

    public final boolean getWithoutLanding() {
        return this.withoutLanding;
    }

    public QuickForwardConfig(VideoShareInfoStruct videoShareInfoStruct, QuickForwardPublishLock quickForwardPublishLock, boolean z) {
        super(videoShareInfoStruct);
        this.videoShareInfoStruct = videoShareInfoStruct;
        this.publishLock = quickForwardPublishLock;
        this.withoutLanding = z;
    }

    public /* synthetic */ QuickForwardConfig(VideoShareInfoStruct videoShareInfoStruct, QuickForwardPublishLock quickForwardPublishLock, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : videoShareInfoStruct, (i & 2) != 0 ? null : quickForwardPublishLock, (i & 4) != 0 ? true : z);
    }
}
