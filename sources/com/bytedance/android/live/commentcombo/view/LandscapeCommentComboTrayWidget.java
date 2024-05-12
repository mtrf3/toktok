package com.bytedance.android.live.commentcombo.view;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.zhiliaoapp.musically.R;

/* loaded from: classes.dex */
public final class LandscapeCommentComboTrayWidget extends CommentComboTrayWidget {
    @Override // com.bytedance.android.live.commentcombo.view.CommentComboTrayWidget, com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dnu;
    }

    @Override // com.bytedance.android.live.commentcombo.view.CommentComboTrayWidget, com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }
}
