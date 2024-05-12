package X;

import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.slot.AbsSlotWidget;
import com.bytedance.android.live.slot.IFrameSlot;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.A6n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25693A6n extends AbsSlotWidget<IFrameSlot, IFrameSlot.SlotViewModel, EnumC31730Cco> {
    public final C25689A6j LJLJI = new C25689A6j(false);

    @Override // X.InterfaceC31710CcU
    public final String LIZ() {
        this.LJLJI.getClass();
        return "live_paid_series";
    }

    @Override // X.InterfaceC31710CcU
    public final Object LLJJJIL() {
        return this.LJLJI.LJIIIZ();
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final List<Integer> getMessageType() {
        return this.LJLJI.getMessageType();
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onDestroy() {
        this.LJLJI.onDestroy();
    }

    @Override // X.InterfaceC31710CcU
    public final Enum LLJJJJLIIL() {
        return EnumC31730Cco.SLOT_LIVE_BOTTOM_POP_L2_ANCHOR;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onMessage(IMessage iMessage) {
        this.LJLJI.onMessage(iMessage);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void LLJJJJ(ViewModel viewModel, A72 slotGate) {
        IFrameSlot.SlotViewModel viewModel2 = (IFrameSlot.SlotViewModel) viewModel;
        o.LJIIIZ(viewModel2, "viewModel");
        o.LJIIIZ(slotGate, "slotGate");
        this.LJLJI.LLJJJJ(viewModel2, slotGate);
    }

    @Override // X.InterfaceC31710CcU
    public final void LLJJLIIIJLLLLLLLZ(java.util.Map<String, Object> params, InterfaceC25704A6y interfaceC25704A6y) {
        o.LJIIIZ(params, "params");
        this.LJLJI.LLJJLIIIJLLLLLLLZ(params, interfaceC25704A6y);
    }
}
