package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.FreeFrameSlotController;
import com.bytedance.android.live.slot.IFrameSlot;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.CcT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31709CcT implements InterfaceC25704A6y {
    public final /* synthetic */ C31723Cch LIZ;
    public final /* synthetic */ ActivityC45651qj LIZIZ;
    public final /* synthetic */ InterfaceC31710CcU<IFrameSlot, IFrameSlot.SlotViewModel, EnumC31730Cco> LIZJ;
    public final /* synthetic */ FreeFrameSlotController LIZLLL;

    public C31709CcT(C31723Cch c31723Cch, ActivityC45651qj activityC45651qj, InterfaceC31710CcU<IFrameSlot, IFrameSlot.SlotViewModel, EnumC31730Cco> interfaceC31710CcU, FreeFrameSlotController freeFrameSlotController) {
        this.LIZ = c31723Cch;
        this.LIZIZ = activityC45651qj;
        this.LIZJ = interfaceC31710CcU;
        this.LIZLLL = freeFrameSlotController;
    }

    @Override // X.InterfaceC25704A6y
    public final void LIZ(boolean z) {
        C31723Cch c31723Cch = this.LIZ;
        c31723Cch.LIZLLL = true;
        c31723Cch.LIZJ = z;
        if (z) {
            IFrameSlot.SlotViewModel hv0 = IFrameSlot.SlotViewModel.hv0(c31723Cch.LIZIZ, this.LIZIZ);
            List<EnumC29188Bcu> LLJJJ = this.LIZJ.LLJJJ();
            if (LLJJJ != null) {
                for (EnumC29188Bcu enumC29188Bcu : LLJJJ) {
                    java.util.Map<EnumC29188Bcu, MutableLiveData<Object>> map = hv0.LJLJI;
                    o.LJIIIIZZ(map, "viewModel.shareData");
                    ((ConcurrentHashMap) map).put(enumC29188Bcu, new MutableLiveData());
                }
            }
            this.LIZLLL.LJLILLLLZI.LJLJLJ(this.LIZ, hv0);
            this.LIZ.LIZIZ.LLJJJJ(hv0, (A72) this.LIZLLL.LJLJJLL.getValue());
            this.LIZ.LJ = true;
        }
    }
}
