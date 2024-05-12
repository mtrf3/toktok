package com.bytedance.android.live.slot;

import X.BCN;
import X.C30326BvG;
import X.C31723Cch;
import X.EnumC31701CcL;
import X.InterfaceC31336CRo;
import X.InterfaceC31710CcU;
import X.InterfaceC31721Ccf;
import Y.AObserverS73S0100000_5;
import Y.ARunnableS41S0100000_5;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdk.livesetting.watchlive.WatchMemoryLeakOpt;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class EcSlotBarrageWidget extends LiveRecyclableWidget implements InterfaceC31336CRo, InterfaceC31721Ccf {
    public FrameSlotController LJLIL;
    public IFrameSlot LJLILLLLZI;
    public final int LJLJI = -1;
    public final int LJLJJI = -2;
    public FrameLayout LJLJJL;

    @Override // X.InterfaceC31721Ccf
    public final void LJLIL(EnumC31701CcL enumC31701CcL) {
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dnz;
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
        FrameSlotController frameSlotController;
        this.LJLJJL = null;
        this.LJLILLLLZI = null;
        if (WatchMemoryLeakOpt.INSTANCE.valueForEc() && (frameSlotController = this.LJLIL) != null) {
            frameSlotController.onDestroy();
        }
        this.LJLIL = null;
    }

    @Override // X.InterfaceC31336CRo
    public final String getLogTag() {
        return EcSlotBarrageWidget.class.getName();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        if (this.LJLJJL == null) {
            FrameLayout frameLayout = new FrameLayout(this.context);
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(this.LJLJI, this.LJLJJI));
            this.LJLJJL = frameLayout;
            if (getView() instanceof ViewGroup) {
                View view = getView();
                o.LJII(view, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) view).addView(this.LJLJJL);
            }
        }
        hide();
        Long l = (Long) this.dataChannel.kv0(BCN.class);
        if (l != null) {
            l.longValue();
            C30326BvG.LIZ.post(new ARunnableS41S0100000_5(this, 42), this);
        }
    }

    @Override // X.InterfaceC31721Ccf
    public final void LJLJLJ(C31723Cch c31723Cch, IFrameSlot.SlotViewModel slotViewModel) {
        InterfaceC31710CcU interfaceC31710CcU;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData;
        Object obj = null;
        if (c31723Cch == null || (interfaceC31710CcU = c31723Cch.LIZIZ) == null || slotViewModel == null) {
            return;
        }
        if (interfaceC31710CcU != null) {
            obj = interfaceC31710CcU.LLJJJIL();
        }
        o.LJII(obj, "null cannot be cast to non-null type com.bytedance.android.live.slot.IFrameSlot");
        this.LJLILLLLZI = (IFrameSlot) obj;
        if (slotViewModel == null || (mutableLiveData = slotViewModel.LJLIL) == null) {
            return;
        }
        mutableLiveData.observe(this, new AObserverS73S0100000_5(this, 14));
    }
}
