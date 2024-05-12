package com.ss.android.ugc.aweme.feed.model;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class VideoMaskUtil {
    public static final VideoMaskUtil INSTANCE = new VideoMaskUtil();

    public final VideoMaskInfo getMaskInfo(List<VideoMaskInfo> infos, int i) {
        o.LJIIIZ(infos, "infos");
        for (VideoMaskInfo videoMaskInfo : infos) {
            Integer maskType = videoMaskInfo.getMaskType();
            if (maskType != null && maskType.intValue() == i) {
                return videoMaskInfo;
            }
        }
        return new VideoMaskInfo(null, null, null, null, null, null, null, null, null, 511, null);
    }
}
