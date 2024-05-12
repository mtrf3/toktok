package com.bytedance.android.livesdk.programmedlive.ui;

import X.C13670gF;
import X.C2A8;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.google.gson.internal.b;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class ProgrammedLiveOnlineAudienceLandscapeWidget extends ProgrammedLiveOnlineAudienceWidget {
    @Override // com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveOnlineAudienceWidget, com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dhg;
    }

    @Override // com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveOnlineAudienceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveOnlineAudienceWidget
    public final void LJLZ() {
        C2A8 c2a8 = this.LJLIL;
        if (c2a8 != null) {
            c2a8.setText(c2a8.getContext().getResources().getQuantityString(R.plurals.o8, this.LJLILLLLZI, C13670gF.LIZJ().LJFF(b.LJIILIIL(this.LJLILLLLZI))));
        }
    }
}
