package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget;

import X.C62814Ol0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.assem.desc.FeedModeBaseProtocol;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class InteractStickerWidget$setScope$$inlined$registerProtocol$default$3 implements LifecycleEventObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        if (event != Lifecycle.Event.ON_DESTROY) {
            return;
        }
        C62814Ol0.LJJIJL(null, FeedModeBaseProtocol.class, null);
        throw null;
    }
}
