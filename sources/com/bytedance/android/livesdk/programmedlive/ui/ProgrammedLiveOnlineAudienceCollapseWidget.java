package com.bytedance.android.livesdk.programmedlive.ui;

import X.C13670gF;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.google.gson.internal.b;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class ProgrammedLiveOnlineAudienceCollapseWidget extends ProgrammedLiveOnlineAudienceWidget {
    @Override // com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveOnlineAudienceWidget, com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dhe;
    }

    @Override // com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveOnlineAudienceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveOnlineAudienceWidget
    public final void LJLZ() {
        TextView textView;
        View view = getView();
        if ((view instanceof TextView) && (textView = (TextView) view) != null) {
            textView.setText(textView.getContext().getResources().getQuantityString(R.plurals.o8, this.LJLILLLLZI, C13670gF.LIZJ().LJFF(b.LJIILIIL(this.LJLILLLLZI))));
        }
    }
}
