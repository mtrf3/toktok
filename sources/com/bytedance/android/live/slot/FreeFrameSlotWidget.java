package com.bytedance.android.live.slot;

import X.BCN;
import X.C06540Nm;
import X.C16880lQ;
import X.C221108m2;
import X.C30326BvG;
import X.C31717Ccb;
import X.C31719Ccd;
import X.C31723Cch;
import X.C62822Ol8;
import X.EnumC29188Bcu;
import X.EnumC31701CcL;
import X.InterfaceC31336CRo;
import X.InterfaceC31721Ccf;
import Y.ACListenerS40S0200000_5;
import Y.ARunnableS41S0100000_5;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class FreeFrameSlotWidget extends LiveRecyclableWidget implements InterfaceC31336CRo, InterfaceC31721Ccf {
    public FreeFrameSlotController LJLIL;
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C31719Ccd.LJLIL);
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(C31717Ccb.LJLIL);

    @Override // X.InterfaceC31721Ccf
    public final void LJLIL(EnumC31701CcL enumC31701CcL) {
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.do_;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final HashMap<EnumC29188Bcu, ArrayList<IFrameSlot.SlotViewModel>> LJLZ() {
        return (HashMap) this.LJLJI.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        if (this.dataChannel.kv0(BCN.class) == null) {
            return;
        }
        Iterator LJ = C06540Nm.LJ((HashMap) this.LJLILLLLZI.getValue(), "viewModelMap.values");
        while (LJ.hasNext()) {
            ((IFrameSlot.SlotViewModel) LJ.next()).gv0(this);
        }
        ((HashMap) this.LJLILLLLZI.getValue()).clear();
        LJLZ().clear();
        if (this.LJLIL != null) {
            Lifecycle lifecycle = getLifecycle();
            FreeFrameSlotController freeFrameSlotController = this.LJLIL;
            if (freeFrameSlotController != null) {
                lifecycle.removeObserver(freeFrameSlotController);
                FreeFrameSlotController freeFrameSlotController2 = this.LJLIL;
                if (freeFrameSlotController2 != null) {
                    freeFrameSlotController2.onDestroy();
                    return;
                } else {
                    o.LJIJI("frameSlotController");
                    throw null;
                }
            }
            o.LJIJI("frameSlotController");
            throw null;
        }
        o.LJIJI("frameSlotController");
        throw null;
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
        C30326BvG.LIZ.post(new ARunnableS41S0100000_5(this, 43), this);
    }

    @Override // X.InterfaceC31721Ccf
    public final void LJLJLJ(C31723Cch widgetWrapper, IFrameSlot.SlotViewModel viewModel) {
        IFrameSlot iFrameSlot;
        o.LJIIIZ(widgetWrapper, "widgetWrapper");
        o.LJIIIZ(viewModel, "viewModel");
        View view = getView();
        if (view != null) {
            Object LLJJJIL = widgetWrapper.LIZIZ.LLJJJIL();
            if (!(LLJJJIL instanceof IFrameSlot) || (iFrameSlot = (IFrameSlot) LLJJJIL) == null) {
                return;
            }
            View LJFF = iFrameSlot.LJFF(this.context);
            if (!(view instanceof ViewGroup) || LJFF == null) {
                return;
            }
            ((HashMap) this.LJLILLLLZI.getValue()).put(widgetWrapper, viewModel);
            List<EnumC29188Bcu> LLJJJ = widgetWrapper.LIZIZ.LLJJJ();
            if ((LLJJJ instanceof List) && LLJJJ != null) {
                for (EnumC29188Bcu enumC29188Bcu : LLJJJ) {
                    ArrayList<IFrameSlot.SlotViewModel> arrayList = LJLZ().get(enumC29188Bcu);
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                        LJLZ().put(enumC29188Bcu, arrayList);
                    }
                    arrayList.add(viewModel);
                }
            }
            show();
            ((ViewGroup) view).addView(LJFF);
            if (iFrameSlot.LIZ() == null && TextUtils.isEmpty(iFrameSlot.getScheme())) {
                return;
            }
            C16880lQ.LJIIJ(new ACListenerS40S0200000_5(this, iFrameSlot, 2), LJFF);
        }
    }
}
