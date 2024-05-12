package com.ss.android.ugc.aweme.services.story.forward;

import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class QuickForwardPublishLock {
    public final MutableLiveData<Boolean> releaseLockEvent;

    public final MutableLiveData<Boolean> getReleaseLockEvent() {
        return this.releaseLockEvent;
    }

    public QuickForwardPublishLock(MutableLiveData<Boolean> releaseLockEvent) {
        o.LJIIIZ(releaseLockEvent, "releaseLockEvent");
        this.releaseLockEvent = releaseLockEvent;
    }
}
