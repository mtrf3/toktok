package com.ss.android.ugc.aweme.services.story.forward;

import X.ORZ;
import com.ss.android.ugc.aweme.canvas.ForwardVideo;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ForwardMediaKt {
    public static final String getDownloadUrl(ForwardVideo forwardVideo) {
        o.LJIIIZ(forwardVideo, "<this>");
        return (String) ORZ.LLFF(forwardVideo.getPlayAddressList());
    }

    public static final String getDownloadUrl(ForwardMedia forwardMedia) {
        o.LJIIIZ(forwardMedia, "<this>");
        return getDownloadUrl(forwardMedia.getVideo());
    }
}
