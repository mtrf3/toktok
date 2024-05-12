package com.ss.android.ugc.aweme.experiment;

import X.V0N;

/* loaded from: classes2.dex */
public enum PhotoUiType {
    NO_SWIPE_OR_PINCH,
    STORY_LINES,
    DOT_STYLE;

    public static PhotoUiType valueOf(String str) {
        return (PhotoUiType) V0N.LJJJ(PhotoUiType.class, str);
    }
}
