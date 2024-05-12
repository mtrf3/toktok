package com.ss.android.ugc.aweme.services.story.forward;

import com.ss.android.ugc.aweme.sticker.data.VideoShareInfoStruct;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public abstract class ForwardConfig implements Serializable {
    public final VideoShareInfoStruct videoShareInfoStruct;

    public /* synthetic */ ForwardConfig(VideoShareInfoStruct videoShareInfoStruct, DefaultConstructorMarker defaultConstructorMarker) {
        this(videoShareInfoStruct);
    }

    public VideoShareInfoStruct getVideoShareInfoStruct() {
        return this.videoShareInfoStruct;
    }

    public ForwardConfig(VideoShareInfoStruct videoShareInfoStruct) {
        this.videoShareInfoStruct = videoShareInfoStruct;
    }

    public /* synthetic */ ForwardConfig(VideoShareInfoStruct videoShareInfoStruct, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : videoShareInfoStruct);
    }
}
