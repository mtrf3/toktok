package com.ss.android.ugc.aweme.im.service.search;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.inbox.InboxFragment;
import com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public abstract class IIMSearchEntranceWidget extends InboxAdapterWidget {
    public abstract boolean LJIILLIIL();

    public abstract void LJIIZILJ();

    @Override // com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IIMSearchEntranceWidget(InboxFragment fragment, LiveData parentWidgetState) {
        super(fragment, parentWidgetState);
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(parentWidgetState, "parentWidgetState");
    }
}
