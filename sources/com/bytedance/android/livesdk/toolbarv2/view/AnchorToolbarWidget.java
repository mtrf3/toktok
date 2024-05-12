package com.bytedance.android.livesdk.toolbarv2.view;

import X.C15380j0;
import X.C26338AVi;
import X.C30246Bty;
import X.CN1;
import X.EnumC30206BtK;
import X.EnumC30254Bu6;
import X.InterfaceC30205BtJ;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.gift.DutyGiftChangedEvent;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class AnchorToolbarWidget extends AbsToolbarWidget {
    public LinearLayout LJLILLLLZI;
    public LinearLayout LJLJI;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dng;
    }

    @Override // com.bytedance.android.livesdk.toolbarv2.view.AbsToolbarWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.toolbarv2.view.AbsToolbarWidget
    public final void LJLZ() {
        InterfaceC30205BtJ pk;
        InterfaceC30205BtJ pk2;
        if (this.LJLILLLLZI != null && (pk2 = ((IToolbarService) CN1.LIZ(IToolbarService.class)).pk(this.dataChannel)) != null) {
            DataChannel dataChannel = this.dataChannel;
            o.LJIIIIZZ(dataChannel, "dataChannel");
            pk2.LJIIIZ(dataChannel, EnumC30206BtK.LEFT, this.LJLILLLLZI);
        }
        if (this.LJLJI != null && (pk = ((IToolbarService) CN1.LIZ(IToolbarService.class)).pk(this.dataChannel)) != null) {
            DataChannel dataChannel2 = this.dataChannel;
            o.LJIIIIZZ(dataChannel2, "dataChannel");
            pk.LJIIIZ(dataChannel2, EnumC30206BtK.RIGHT, this.LJLJI);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        InterfaceC30205BtJ pk = ((IToolbarService) CN1.LIZ(IToolbarService.class)).pk(this.dataChannel);
        if (pk != null) {
            pk.releaseAll();
        }
    }

    @Override // com.bytedance.android.livesdk.toolbarv2.view.AbsToolbarWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        LinearLayout linearLayout;
        View view = getView();
        LinearLayout linearLayout2 = null;
        if (view != null) {
            linearLayout = (LinearLayout) view.findViewById(R.id.for);
        } else {
            linearLayout = null;
        }
        this.LJLILLLLZI = linearLayout;
        View view2 = getView();
        if (view2 != null) {
            linearLayout2 = (LinearLayout) view2.findViewById(R.id.j2_);
        }
        this.LJLJI = linearLayout2;
        LinearLayout linearLayout3 = this.LJLILLLLZI;
        if (linearLayout3 != null) {
            EnumC30254Bu6 enumC30254Bu6 = EnumC30254Bu6.PORTRAIT;
            EnumC30206BtK enumC30206BtK = EnumC30206BtK.LEFT;
            C26338AVi.LJIIIZ(linearLayout3, Integer.valueOf(C15380j0.LIZ(C30246Bty.LIZLLL(enumC30254Bu6, enumC30206BtK, true))), 0, Integer.valueOf(C15380j0.LIZ(C30246Bty.LIZLLL(enumC30254Bu6, enumC30206BtK, false))), 0, 16);
        }
        LinearLayout linearLayout4 = this.LJLJI;
        if (linearLayout4 != null) {
            EnumC30254Bu6 enumC30254Bu62 = EnumC30254Bu6.PORTRAIT;
            EnumC30206BtK enumC30206BtK2 = EnumC30206BtK.RIGHT;
            C26338AVi.LJIIIZ(linearLayout4, Integer.valueOf(C15380j0.LIZ(C30246Bty.LIZLLL(enumC30254Bu62, enumC30206BtK2, true))), 0, Integer.valueOf(C15380j0.LIZ(C30246Bty.LIZLLL(enumC30254Bu62, enumC30206BtK2, false))), 0, 16);
        }
    }

    @Override // com.bytedance.android.livesdk.toolbarv2.view.AbsToolbarWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        LJLZ();
        this.dataChannel.ov0(this, DutyGiftChangedEvent.class, new AqS171S0100000_5(this, 490));
    }
}
