package X;

import com.bytedance.android.live.slot.FreeFrameSlotController;
import com.bytedance.android.live.slot.IIconSlot;
import kotlin.jvm.internal.o;

/* renamed from: X.CcS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31708CcS implements A72 {
    public final /* synthetic */ FreeFrameSlotController LIZ;

    @Override // X.A72
    public final boolean LIZ(InterfaceC31710CcU<IIconSlot, IIconSlot.SlotViewModel, EnumC30736C4m> slotWidget, IIconSlot.SlotViewModel viewModel) {
        o.LJIIIZ(slotWidget, "slotWidget");
        o.LJIIIZ(viewModel, "viewModel");
        return false;
    }

    @Override // X.A72
    public final ActivityC45651qj getContext() {
        return this.LIZ.LJLIL;
    }

    public C31708CcS(FreeFrameSlotController freeFrameSlotController) {
        this.LIZ = freeFrameSlotController;
    }
}
