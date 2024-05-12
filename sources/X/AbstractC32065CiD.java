package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.IIconSlot;
import kotlin.jvm.internal.o;

/* renamed from: X.CiD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC32065CiD extends AbstractC32066CiE<IIconSlot, IIconSlot.SlotViewModel, EnumC30736C4m> {
    public IIconSlot.SlotViewModel LJLJJL;

    public final void LJIIIZ() {
        MutableLiveData<Boolean> mutableLiveData;
        IIconSlot.SlotViewModel slotViewModel = this.LJLJJL;
        if (slotViewModel != null && (mutableLiveData = slotViewModel.LJLLLL) != null) {
            mutableLiveData.setValue(Boolean.FALSE);
        }
        IIconSlot.SlotViewModel slotViewModel2 = this.LJLJJL;
        if (slotViewModel2 == null) {
            return;
        }
        slotViewModel2.LLF = null;
        slotViewModel2.LLFF = null;
    }

    public final void LJIIJJI(String str) {
        IIconSlot.SlotViewModel slotViewModel = this.LJLJJL;
        if (slotViewModel == null) {
            return;
        }
        slotViewModel.LLF = str;
        if (slotViewModel == null) {
            return;
        }
        slotViewModel.LLFF = null;
        MutableLiveData<Boolean> mutableLiveData = slotViewModel.LJLLLL;
        if (mutableLiveData == null) {
            return;
        }
        mutableLiveData.setValue(Boolean.TRUE);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    /* renamed from: LJIIJ, reason: merged with bridge method [inline-methods] */
    public void LLJJJJ(IIconSlot.SlotViewModel viewModel, A72 slotGate) {
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(slotGate, "slotGate");
        this.LJLIL = viewModel;
        this.LJLILLLLZI = slotGate;
        this.LJLJJL = viewModel;
    }
}
