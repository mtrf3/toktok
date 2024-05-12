package com.ss.android.ugc.aweme.services.story.forward;

import com.ss.android.ugc.aweme.sticker.data.VideoShareInfoStruct;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class NormalForwardConfig extends ForwardConfig {
    public final VideoShareInfoStruct videoShareInfoStruct;

    /* JADX WARN: Multi-variable type inference failed */
    public NormalForwardConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardConfig
    public VideoShareInfoStruct getVideoShareInfoStruct() {
        return this.videoShareInfoStruct;
    }

    public NormalForwardConfig(VideoShareInfoStruct videoShareInfoStruct) {
        super(videoShareInfoStruct);
        this.videoShareInfoStruct = videoShareInfoStruct;
    }

    public /* synthetic */ NormalForwardConfig(VideoShareInfoStruct videoShareInfoStruct, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : videoShareInfoStruct);
    }
}
