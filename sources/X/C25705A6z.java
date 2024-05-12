package X;

import android.graphics.drawable.Drawable;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.slot.AbsSlotWidget;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdkapi.depend.model.live.PaidContentInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.A6z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25705A6z extends AbsSlotWidget<IIconSlot, IIconSlot.SlotViewModel, EnumC30736C4m> {
    public IIconSlot.SlotViewModel LJLJI;
    public A72 LJLJJI;
    public Room LJLJJL;

    @Override // X.InterfaceC31710CcU
    public final String LIZ() {
        return "live_paid_series";
    }

    @Override // X.InterfaceC31710CcU
    public final Object LLJJJIL() {
        return new A70(new A71(this));
    }

    @Override // X.InterfaceC31710CcU
    public final Enum LLJJJJLIIL() {
        return EnumC30736C4m.SLOT_LIVE_ANCHOR_TOOLBAR;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onDestroy() {
        C42625Go9.LIZJ(this);
    }

    @QD3
    public final void onPopCardEvent(C61272ap event) {
        MutableLiveData<Drawable> mutableLiveData;
        ActivityC45651qj context;
        IIconSlot.SlotViewModel slotViewModel;
        MutableLiveData<Drawable> mutableLiveData2;
        o.LJIIIZ(event, "event");
        if (event.LJLIL) {
            A72 a72 = this.LJLJJI;
            if (a72 == null || (context = a72.getContext()) == null || (slotViewModel = this.LJLJI) == null || (mutableLiveData2 = slotViewModel.LJLL) == null) {
                return;
            }
            mutableLiveData2.setValue(C40681ii.LIZ(context.getResources(), R.drawable.b2m, null));
            return;
        }
        IIconSlot.SlotViewModel slotViewModel2 = this.LJLJI;
        if (slotViewModel2 == null || (mutableLiveData = slotViewModel2.LJLL) == null) {
            return;
        }
        mutableLiveData.postValue(null);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void LLJJJJ(ViewModel viewModel, A72 slotGate) {
        IIconSlot.SlotViewModel viewModel2 = (IIconSlot.SlotViewModel) viewModel;
        o.LJIIIZ(viewModel2, "viewModel");
        o.LJIIIZ(slotGate, "slotGate");
        this.LJLIL = viewModel2;
        this.LJLILLLLZI = slotGate;
        this.LJLJJI = slotGate;
        this.LJLJI = viewModel2;
        C42625Go9.LIZIZ(this);
        Long l = null;
        Drawable LIZ = C0OW.LIZ(slotGate.getContext().getResources(), R.drawable.b3u, null);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_series_dollar;
        ActivityC45651qj context = slotGate.getContext();
        o.LJIIIIZZ(context, "slotGate.context");
        SY9 LIZ2 = c2068389v.LIZ(context);
        viewModel2.LJLILLLLZI.setValue(Boolean.TRUE);
        viewModel2.LJLJL.setValue(LIZ);
        viewModel2.LJLLI.setValue(slotGate.getContext().getString(R.string.qhu));
        viewModel2.LJLJLLL.setValue(LIZ2);
        viewModel2.LJLLILLLL.setValue(slotGate.getContext().getString(R.string.qhl));
        String currentUserID = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID();
        Room room = this.LJLJJL;
        if (room != null) {
            l = Long.valueOf(room.getId());
        }
        A4N.LIZIZ(currentUserID, String.valueOf(l));
    }

    @Override // X.InterfaceC31710CcU
    public final void LLJJLIIIJLLLLLLLZ(java.util.Map<String, Object> params, InterfaceC25704A6y interfaceC25704A6y) {
        Room room;
        PaidContentInfo paidContentInfo;
        o.LJIIIZ(params, "params");
        Object obj = params.get("param_room");
        Boolean bool = null;
        if (obj instanceof Room) {
            room = (Room) obj;
        } else {
            room = null;
        }
        this.LJLJJL = room;
        if (room != null && (paidContentInfo = room.paidContentInfo) != null) {
            bool = Boolean.valueOf(paidContentInfo.paidContentPermission);
        }
        interfaceC25704A6y.LIZ(o.LJ(bool, Boolean.TRUE));
    }
}
