package com.bytedance.android.livesdk.toolbarv2.view;

import X.C15380j0;
import X.C26338AVi;
import X.C30246Bty;
import X.CN1;
import X.EnumC30206BtK;
import X.EnumC30254Bu6;
import X.InterfaceC30205BtJ;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class AudienceLandscapeToolbarWidget extends AbsToolbarWidget {
    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dnh;
    }

    @Override // com.bytedance.android.livesdk.toolbarv2.view.AbsToolbarWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.toolbarv2.view.AbsToolbarWidget
    public final void LJLZ() {
        InterfaceC30205BtJ pk;
        if (this.LJLIL != null && (pk = ((IToolbarService) CN1.LIZ(IToolbarService.class)).pk(this.dataChannel)) != null) {
            DataChannel dataChannel = this.dataChannel;
            o.LJIIIIZZ(dataChannel, "dataChannel");
            pk.LJIIIZ(dataChannel, EnumC30206BtK.RIGHT, this.LJLIL);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        EnumC30206BtK.RIGHT.release(this.dataChannel);
    }

    @Override // com.bytedance.android.livesdk.toolbarv2.view.AbsToolbarWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        super.onInit(objArr);
        LinearLayout linearLayout = this.LJLIL;
        if (linearLayout != null) {
            EnumC30254Bu6 enumC30254Bu6 = EnumC30254Bu6.LANDSCAPE;
            EnumC30206BtK enumC30206BtK = EnumC30206BtK.RIGHT;
            C26338AVi.LJIIIZ(linearLayout, Integer.valueOf(C15380j0.LIZ(C30246Bty.LIZLLL(enumC30254Bu6, enumC30206BtK, true))), 0, Integer.valueOf(C15380j0.LIZ(C30246Bty.LIZLLL(enumC30254Bu6, enumC30206BtK, false))), 0, 16);
        }
    }
}
