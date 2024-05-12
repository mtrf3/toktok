package com.bytedance.android.livesdk.toolbar;

import X.EnumC30204BtI;
import X.EnumC30206BtK;
import X.EnumC30226Bte;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LandscapeAudienceToolbarWidget extends LiveAudienceToolbarWidget {
    @Override // com.bytedance.android.livesdk.toolbar.LiveAudienceToolbarWidget, com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dl7;
    }

    @Override // com.bytedance.android.livesdk.toolbar.LiveAudienceToolbarWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.toolbar.LiveAudienceToolbarWidget
    public final EnumC30226Bte LJZ(boolean z) {
        return EnumC30226Bte.ICON_LAND;
    }

    @Override // com.bytedance.android.livesdk.toolbar.LiveAudienceToolbarWidget
    public final void LJLZ(List<EnumC30204BtI> list, EnumC30226Bte enumC30226Bte) {
        if (list == null || enumC30226Bte == null) {
            return;
        }
        EnumC30206BtK enumC30206BtK = EnumC30206BtK.RIGHT;
        DataChannel dataChannel = this.dataChannel;
        View view = getView();
        o.LJII(view, "null cannot be cast to non-null type android.widget.LinearLayout");
        enumC30206BtK.createHolder(dataChannel, (ViewGroup) view, list, enumC30226Bte);
    }
}
