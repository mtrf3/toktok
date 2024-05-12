package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.V0N;

/* loaded from: classes2.dex */
public enum IMNoticePosition {
    NOTICE_POSITION_TOP(0),
    NOTICE_POSITION_BOTTOM(1);

    public final int position;

    public static IMNoticePosition valueOf(String str) {
        return (IMNoticePosition) V0N.LJJJ(IMNoticePosition.class, str);
    }

    public final int getPosition() {
        return this.position;
    }

    IMNoticePosition(int i) {
        this.position = i;
    }
}
