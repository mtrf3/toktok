package com.bytedance.android.livesdk.comp.api.linkcore.model;

import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class MultiCoHostViolationException extends Exception {
    public final PerceptionMessage perceptionMessage;

    public final PerceptionMessage getPerceptionMessage() {
        return this.perceptionMessage;
    }

    public MultiCoHostViolationException(PerceptionMessage perceptionMessage) {
        o.LJIIIZ(perceptionMessage, "perceptionMessage");
        this.perceptionMessage = perceptionMessage;
    }
}
