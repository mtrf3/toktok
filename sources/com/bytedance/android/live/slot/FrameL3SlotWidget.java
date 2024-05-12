package com.bytedance.android.live.slot;

import X.ActivityC45651qj;
import X.BCN;
import X.C30326BvG;
import X.C31684Cc4;
import X.C31723Cch;
import X.C73411SrX;
import X.C76800UCe;
import X.EnumC31701CcL;
import X.InterfaceC31336CRo;
import X.InterfaceC31710CcU;
import X.InterfaceC31721Ccf;
import X.InterfaceC88472Yns;
import X.X1D;
import Y.AObserverS69S0200000_5;
import Y.ARunnableS11S0110000_5;
import Y.ARunnableS9S0101000_5;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdk.slot.FrameL3SlotHeightChannel;
import com.bytedance.android.livesdk.slot.FrameL3SlotVisibilityChannel;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

/* loaded from: classes6.dex */
public class FrameL3SlotWidget extends LiveRecyclableWidget implements InterfaceC31336CRo, WeakHandler.IHandler, InterfaceC31721Ccf {
    public FrameSlotController LJLIL;
    public IFrameSlot LJLILLLLZI;
    public IFrameSlot.SlotViewModel LJLJI;
    public View LJLJJI;
    public C73411SrX LJLJJL;
    public C73411SrX LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public long LJLJLLL;
    public ActivityC45651qj LJLL;

    @Override // X.InterfaceC31721Ccf
    public final void LJLIL(EnumC31701CcL enumC31701CcL) {
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        IFrameSlot.SlotViewModel slotViewModel = this.LJLJI;
        if (slotViewModel != null) {
            slotViewModel.gv0(this);
        }
        C73411SrX c73411SrX = this.LJLJJL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        C73411SrX c73411SrX2 = this.LJLJJLL;
        if (c73411SrX2 != null) {
            c73411SrX2.dispose();
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(FrameL3SlotVisibilityChannel.class, Boolean.FALSE);
            this.dataChannel.rv0(FrameL3SlotHeightChannel.class, 0);
        }
        this.LJLJL = false;
        if (this.LJLIL != null) {
            getLifecycle().removeObserver(this.LJLIL);
            this.LJLIL.onDestroy();
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.rv0(FrameL3SlotVisibilityChannel.class, Boolean.FALSE);
            this.dataChannel.rv0(FrameL3SlotHeightChannel.class, 0);
            DataChannel dataChannel3 = this.dataChannel;
            dataChannel3.getClass();
            dataChannel3.jv0(this);
        }
    }

    public final void LJLZ() {
        IFrameSlot.SlotViewModel slotViewModel;
        boolean z;
        if (getView() == null || this.LJLJJI == null || (slotViewModel = this.LJLJI) == null || slotViewModel.LJLIL.getValue() == null || !((Boolean) this.LJLJI.LJLIL.getValue().first).booleanValue()) {
            return;
        }
        if (!this.LJLJL) {
            z = true;
            show();
        } else {
            z = false;
            hide();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("slot visible change for changeContainerVisibilityDirect, visible: ");
        LIZ.append(z);
        C31684Cc4.LIZIZ("FrameL3SlotWidget", null, X1D.LIZIZ(LIZ));
        this.dataChannel.rv0(FrameL3SlotVisibilityChannel.class, Boolean.valueOf(z));
        this.LJLJJI.post(new ARunnableS11S0110000_5(this, z, 1));
    }

    @Override // X.InterfaceC31336CRo
    public final String getLogTag() {
        return getClass().getName();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        hide();
        if (this.dataChannel.kv0(BCN.class) == null) {
            return;
        }
        this.LJLJLLL = SystemClock.uptimeMillis();
        C30326BvG.LIZ.post(new ARunnableS9S0101000_5(1, this, 13), this);
    }

    @Override // X.InterfaceC31721Ccf
    public final void LJLJLJ(C31723Cch c31723Cch, IFrameSlot.SlotViewModel slotViewModel) {
        InterfaceC31710CcU interfaceC31710CcU = c31723Cch.LIZIZ;
        this.LJLILLLLZI = (IFrameSlot) interfaceC31710CcU.LLJJJIL();
        this.LJLJI = slotViewModel;
        slotViewModel.LJLIL.observe(this, new AObserverS69S0200000_5((Object) interfaceC31710CcU, (User) this, (InterfaceC88472Yns<? super User, C76800UCe>) 8));
    }
}
