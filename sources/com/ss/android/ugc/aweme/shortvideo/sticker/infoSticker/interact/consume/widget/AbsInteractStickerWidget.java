package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.arch.widgets.base.LifecycleOwnerWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes5.dex */
public abstract class AbsInteractStickerWidget extends LifecycleOwnerWidget {
    public abstract InteractStickerViewModel LJIILJJIL();

    public abstract void LJIILL();

    public abstract void LJIILLIIL();

    public abstract void LLIFFJFJJ(Aweme aweme);

    public abstract void onDestroyView();

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.LifecycleOwnerWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }
}
