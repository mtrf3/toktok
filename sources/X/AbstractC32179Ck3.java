package X;

import com.bytedance.android.live.slot.AbsSlotWidget;
import com.bytedance.android.live.slot.IFrameSlot;
import kotlin.jvm.internal.o;

/* renamed from: X.Ck3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC32179Ck3 extends AbsSlotWidget<IFrameSlot, IFrameSlot.SlotViewModel, EnumC31730Cco> {
    public final boolean LJLJI;
    public InterfaceC71145Rw5 LJLJJI;
    public InterfaceC71003Rtn LJLJJL;

    public abstract boolean LJIIIZ(java.util.Map<String, Object> map);

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public void onDestroy() {
        this.LJLJJI = null;
    }

    public AbstractC32179Ck3(boolean z) {
        this.LJLJI = z;
    }

    @Override // X.InterfaceC31710CcU
    public final void LLJJLIIIJLLLLLLLZ(java.util.Map<String, Object> params, InterfaceC25704A6y interfaceC25704A6y) {
        o.LJIIIZ(params, "params");
        if (!this.LJLJI) {
            interfaceC25704A6y.LIZ(LJIIIZ(params));
        }
    }
}
