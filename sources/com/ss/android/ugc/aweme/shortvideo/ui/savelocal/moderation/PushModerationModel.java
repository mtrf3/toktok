package com.ss.android.ugc.aweme.shortvideo.ui.savelocal.moderation;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PushModerationModel {

    @InterfaceC65349Pkn("frame_id")
    public final String frameId;

    @InterfaceC65349Pkn("pass")
    public final boolean result;

    public final String getFrameId() {
        return this.frameId;
    }

    public final boolean getResult() {
        return this.result;
    }

    public PushModerationModel(String frameId, boolean z) {
        o.LJIIIZ(frameId, "frameId");
        this.frameId = frameId;
        this.result = z;
    }
}
