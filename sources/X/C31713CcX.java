package X;

import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.IconSlotController;

/* renamed from: X.CcX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C31713CcX implements A72 {
    public final /* synthetic */ IconSlotController LIZ;

    @Override // X.A72
    public final ActivityC45651qj getContext() {
        return this.LIZ.mActivity;
    }

    public C31713CcX(IconSlotController iconSlotController) {
        this.LIZ = iconSlotController;
    }

    @Override // X.A72
    public final boolean LIZ(InterfaceC31710CcU<IIconSlot, IIconSlot.SlotViewModel, EnumC30736C4m> interfaceC31710CcU, IIconSlot.SlotViewModel slotViewModel) {
        IconSlotController iconSlotController = this.LIZ;
        if (iconSlotController.mAggregateSlotWidgetWrapper != null) {
            iconSlotController.mIconSlotView.LJLLL(interfaceC31710CcU, slotViewModel);
            return true;
        }
        return false;
    }
}
