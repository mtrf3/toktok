package com.bytedance.android.live.slot;

import X.ActivityC45651qj;
import X.BCN;
import X.C30326BvG;
import X.C31723Cch;
import X.EnumC31701CcL;
import X.InterfaceC31336CRo;
import X.InterfaceC31721Ccf;
import Y.AObserverS36S0400000_5;
import Y.ARunnableS12S0101000_8;
import Y.IDComparatorS33S0000000_5;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

/* loaded from: classes6.dex */
public class FrameSlotWidget extends LiveRecyclableWidget implements InterfaceC31336CRo, WeakHandler.IHandler, InterfaceC31721Ccf {
    public FrameSlotController LJLIL;
    public View LJLILLLLZI;
    public EnumC31701CcL LJLJI;
    public Queue<C31723Cch> LJLJJI;
    public Map<C31723Cch, IFrameSlot.SlotViewModel> LJLJJL;
    public boolean LJLJJLL;
    public long LJLJL;
    public ActivityC45651qj LJLJLJ;

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
        Map<C31723Cch, IFrameSlot.SlotViewModel> map = this.LJLJJL;
        if (map != null) {
            Iterator it = ((HashMap) map).values().iterator();
            while (it.hasNext()) {
                ((IFrameSlot.SlotViewModel) it.next()).gv0(this);
            }
            ((HashMap) this.LJLJJL).clear();
        }
        if (this.LJLIL != null) {
            getLifecycle().removeObserver(this.LJLIL);
            this.LJLIL.onDestroy();
        }
    }

    @Override // X.InterfaceC31336CRo
    public final String getLogTag() {
        return getClass().getName();
    }

    @Override // X.InterfaceC31721Ccf
    public final void LJLIL(EnumC31701CcL enumC31701CcL) {
        this.LJLJI = enumC31701CcL;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        hide();
        if (this.dataChannel.kv0(BCN.class) == null) {
            return;
        }
        this.LJLJL = SystemClock.uptimeMillis();
        this.LJLJJI = new PriorityBlockingQueue(3, new IDComparatorS33S0000000_5(2));
        this.LJLJJL = new HashMap();
        C30326BvG.LIZ.post(new ARunnableS12S0101000_8(1, this, 25), this);
    }

    @Override // X.InterfaceC31721Ccf
    public final void LJLJLJ(C31723Cch c31723Cch, IFrameSlot.SlotViewModel slotViewModel) {
        ((PriorityBlockingQueue) this.LJLJJI).add(c31723Cch);
        ((HashMap) this.LJLJJL).put(c31723Cch, slotViewModel);
        IFrameSlot iFrameSlot = (IFrameSlot) c31723Cch.LIZIZ.LLJJJIL();
        if (this.LJLJI == EnumC31701CcL.LAST) {
            slotViewModel.LJLIL.observe(this, new AObserverS36S0400000_5(slotViewModel, c31723Cch, iFrameSlot, this, 0));
        }
    }
}
