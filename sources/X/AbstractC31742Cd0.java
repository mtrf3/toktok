package X;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.slot.AbsSlotWidget;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Cd0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31742Cd0 extends AbsSlotWidget<IFrameSlot, IFrameSlot.SlotViewModel, EnumC31730Cco> implements InterfaceC71145Rw5 {
    public final List<AbstractC32179Ck3> LJLJI;
    public AbstractC32179Ck3 LJLJJI;
    public final C31706CcQ LJLJJL;

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final /* bridge */ /* synthetic */ List LLJJJ() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final boolean LLJJJJJIL() {
        return true;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onDestroy() {
        Iterator<AbstractC32179Ck3> it = this.LJLJI.iterator();
        while (it.hasNext()) {
            it.next().onDestroy();
        }
        ((ArrayList) this.LJLJI).clear();
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onDispose() {
        Iterator<AbstractC32179Ck3> it = this.LJLJI.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onPause() {
        Iterator<AbstractC32179Ck3> it = this.LJLJI.iterator();
        while (it.hasNext()) {
            it.next().onPause();
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onResume() {
        Iterator<AbstractC32179Ck3> it = this.LJLJI.iterator();
        while (it.hasNext()) {
            it.next().onResume();
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onStart() {
        Iterator<AbstractC32179Ck3> it = this.LJLJI.iterator();
        while (it.hasNext()) {
            it.next().onStart();
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onStop() {
        Iterator<AbstractC32179Ck3> it = this.LJLJI.iterator();
        while (it.hasNext()) {
            it.next().onStop();
        }
    }

    @Override // X.InterfaceC31710CcU
    public final /* bridge */ /* synthetic */ Object LLJJJIL() {
        return this.LJLJJL;
    }

    public AbstractC31742Cd0(Context context) {
        o.LJIIIZ(context, "context");
        this.LJLJI = new ArrayList();
        this.LJLJJL = new C31706CcQ();
    }

    @Override // X.InterfaceC71145Rw5
    public final boolean LJI(AbstractC32179Ck3 slotWidget) {
        o.LJIIIZ(slotWidget, "slotWidget");
        return o.LJ(slotWidget, this.LJLJJI);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void LLJJL(String str) {
        Iterator<AbstractC32179Ck3> it = this.LJLJI.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onCreate(Bundle bundle) {
        Iterator it = ((ArrayList) this.LJLJI).iterator();
        while (it.hasNext()) {
            ((AbsSlotWidget) it.next()).onCreate(bundle);
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public void onEvent(Boolean bool) {
        Iterator<AbstractC32179Ck3> it = this.LJLJI.iterator();
        while (it.hasNext()) {
            it.next().onEvent(bool);
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onMessage(IMessage iMessage) {
        Iterator<AbstractC32179Ck3> it = this.LJLJI.iterator();
        while (it.hasNext()) {
            it.next().onMessage(iMessage);
        }
    }

    @Override // X.InterfaceC71145Rw5
    public final boolean LIZJ(AbstractC32179Ck3 slotWidget, boolean z) {
        String str;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData;
        Pair<Boolean, String> value;
        Pair<Boolean, String> value2;
        o.LJIIIZ(slotWidget, "slotWidget");
        StringBuilder LJI = JBR.LJI("AbsECCardWidgetWrapper setSlotVisible= ", z, ", currentShowSlotWidget = ");
        AbstractC32179Ck3 abstractC32179Ck3 = this.LJLJJI;
        IFrameSlot.SlotViewModel slotViewModel = null;
        if (abstractC32179Ck3 != null) {
            str = C16880lQ.LJLLJ(abstractC32179Ck3.getClass());
        } else {
            str = null;
        }
        LJI.append(str);
        LJI.append(", slotWidget = ");
        LJI.append(C16880lQ.LJLLJ(slotWidget.getClass()));
        C36746EbW.LIZ(4, X1D.LIZIZ(LJI));
        ViewModel viewModel = this.LJLIL;
        if (viewModel instanceof IFrameSlot.SlotViewModel) {
            slotViewModel = (IFrameSlot.SlotViewModel) viewModel;
        }
        if (slotViewModel != null) {
            if (z) {
                C36746EbW.LIZ(4, "setSlotVisible visible = true");
                MutableLiveData<Pair<Boolean, String>> mutableLiveData2 = slotViewModel.LJLIL;
                if (mutableLiveData2 != null && (value2 = mutableLiveData2.getValue()) != null && o.LJ(value2.first, Boolean.TRUE)) {
                    C36746EbW.LIZ(4, "setSlotVisible is also visible");
                    return false;
                }
                this.LJLJJI = slotWidget;
                C31706CcQ c31706CcQ = this.LJLJJL;
                IFrameSlot LLJJJIL = slotWidget.LLJJJIL();
                o.LJIIIIZZ(LLJJJIL, "slotWidget.liveSlot");
                c31706CcQ.getClass();
                c31706CcQ.LJLIL = LLJJJIL;
                C78897Uxp.LJJJJZI(slotViewModel, true);
                return true;
            }
            if (o.LJ(this.LJLJJI, slotWidget) && (mutableLiveData = slotViewModel.LJLIL) != null && (value = mutableLiveData.getValue()) != null && o.LJ(value.first, Boolean.TRUE)) {
                C36746EbW.LIZ(4, "setSlotVisible visible = false");
                C78897Uxp.LJJJJZI(slotViewModel, false);
                return true;
            }
            C36746EbW.LIZ(4, "setSlotVisible fail visible = false");
        }
        return false;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void LLJJJJ(ViewModel viewModel, A72 slotGate) {
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(slotGate, "slotGate");
        this.LJLIL = viewModel;
        this.LJLILLLLZI = slotGate;
        Iterator it = ((ArrayList) this.LJLJI).iterator();
        while (it.hasNext()) {
            ((AbsSlotWidget) it.next()).LLJJJJ(viewModel, slotGate);
        }
    }

    @Override // X.InterfaceC31710CcU
    public final void LLJJLIIIJLLLLLLLZ(java.util.Map<String, Object> params, InterfaceC25704A6y interfaceC25704A6y) {
        Room room;
        o.LJIIIZ(params, "params");
        Object obj = params.get("param_room");
        String str = null;
        if ((obj instanceof Room) && (room = (Room) obj) != null) {
            str = C17280m4.LIZ(room);
        }
        boolean z = false;
        if (str == null || ujb.o.LJJJJJL(str)) {
            interfaceC25704A6y.LIZ(false);
            return;
        }
        Iterator it = ((ArrayList) this.LJLJI).iterator();
        while (it.hasNext()) {
            boolean LJIIIZ = ((AbstractC32179Ck3) it.next()).LJIIIZ(params);
            if (!LJIIIZ) {
                it.remove();
            }
            z |= LJIIIZ;
        }
        interfaceC25704A6y.LIZ(z);
    }
}
