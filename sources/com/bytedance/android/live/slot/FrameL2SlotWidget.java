package com.bytedance.android.live.slot;

import X.ActivityC45651qj;
import X.BCN;
import X.C16880lQ;
import X.C30326BvG;
import X.C31723Cch;
import X.C73411SrX;
import X.C76800UCe;
import X.EnumC31701CcL;
import X.InterfaceC31336CRo;
import X.InterfaceC31710CcU;
import X.InterfaceC31721Ccf;
import X.InterfaceC88472Yns;
import Y.AObserverS69S0200000_5;
import Y.ARunnableS9S0101000_5;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdk.livesetting.watchlive.WatchMemoryLeakOpt;
import com.bytedance.android.livesdk.slot.FrameL2SlotVisibilityChannel;
import com.bytedance.android.livesdk.slot.FullBottomContainerHeightChannel;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

/* loaded from: classes6.dex */
public class FrameL2SlotWidget extends LiveRecyclableWidget implements InterfaceC31336CRo, WeakHandler.IHandler, InterfaceC31721Ccf {
    public FrameSlotController LJLIL;
    public IFrameSlot.SlotViewModel LJLILLLLZI;
    public View LJLJI;
    public boolean LJLJJI;
    public C73411SrX LJLJJL;
    public boolean LJLJJLL;
    public long LJLJL;
    public ActivityC45651qj LJLJLJ;
    public String LJLJLLL;

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
        IFrameSlot.SlotViewModel slotViewModel = this.LJLILLLLZI;
        if (slotViewModel != null) {
            slotViewModel.gv0(this);
        }
        C73411SrX c73411SrX = this.LJLJJL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(FullBottomContainerHeightChannel.class, 0);
            this.dataChannel.rv0(FrameL2SlotVisibilityChannel.class, Boolean.FALSE);
        }
        this.LJLJJI = false;
        if (this.LJLIL != null) {
            getLifecycle().removeObserver(this.LJLIL);
            this.LJLIL.onDestroy();
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.rv0(FullBottomContainerHeightChannel.class, 0);
            this.dataChannel.rv0(FrameL2SlotVisibilityChannel.class, Boolean.FALSE);
            DataChannel dataChannel3 = this.dataChannel;
            dataChannel3.getClass();
            dataChannel3.jv0(this);
        }
        if (WatchMemoryLeakOpt.INSTANCE.valueForEc()) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            dataChannelGlobal.getClass();
            dataChannelGlobal.jv0(this);
            if (this.LJLJI != null) {
                C16880lQ.LJLLL(this.LJLJI, (ViewGroup) getView());
            }
        }
    }

    @Override // X.InterfaceC31336CRo
    public final String getLogTag() {
        return getClass().getName();
    }

    public final C76800UCe LJLZ(Boolean bool) {
        IFrameSlot.SlotViewModel slotViewModel;
        Pair<Boolean, String> value;
        if (bool.booleanValue() && (slotViewModel = this.LJLILLLLZI) != null && (value = slotViewModel.LJLIL.getValue()) != null && ((Boolean) value.first).booleanValue()) {
            this.LJLILLLLZI.LJLIL.setValue(new Pair<>(Boolean.FALSE, "visibility_reason_conflict"));
        }
        return C76800UCe.LIZ;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        hide();
        if (this.dataChannel.kv0(BCN.class) == null) {
            return;
        }
        this.LJLJL = SystemClock.uptimeMillis();
        C30326BvG.LIZ.post(new ARunnableS9S0101000_5(0, this, 6), this);
    }

    @Override // X.InterfaceC31721Ccf
    public final void LJLJLJ(C31723Cch c31723Cch, IFrameSlot.SlotViewModel slotViewModel) {
        InterfaceC31710CcU interfaceC31710CcU = c31723Cch.LIZIZ;
        this.LJLILLLLZI = slotViewModel;
        slotViewModel.LJLIL.observe(this, new AObserverS69S0200000_5((Object) interfaceC31710CcU, (User) this, (InterfaceC88472Yns<? super User, C76800UCe>) 6));
    }
}
