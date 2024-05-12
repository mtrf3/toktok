package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.mt.protector.impl.color.ColorProtector;

/* loaded from: classes13.dex */
public final class CaptionModelKt {
    public static final Long getCreatorEditedCaptionIdIfExists(CaptionModel captionModel) {
        if (captionModel == null || captionModel.getCreatorEditedCaptionId() == null) {
            return null;
        }
        Long creatorEditedCaptionId = captionModel.getCreatorEditedCaptionId();
        if (creatorEditedCaptionId != null && creatorEditedCaptionId.longValue() == 0) {
            return null;
        }
        return captionModel.getCreatorEditedCaptionId();
    }

    public static final Integer toColor(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return Integer.valueOf(ColorProtector.parseColor(str));
    }
}
