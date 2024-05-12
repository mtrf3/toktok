package X;

import Y.ARunnableS40S0100000_4;
import Y.AfS56S0100000_4;
import android.os.Handler;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.slot.AbsSlotWidget;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.api.IPaidSeriesLiveApiService;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.A6q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25696A6q extends AbsSlotWidget<IIconSlot, IIconSlot.SlotViewModel, EnumC30736C4m> implements InterfaceC31748Cd6 {
    public A72 LJLJI;
    public IIconSlot.SlotViewModel LJLJJI;
    public Room LJLJJL;
    public final C73318Sq2 LJLJJLL = new C73318Sq2();
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(A62.LJLIL);
    public final Handler LJLJLJ = new Handler(C16880lQ.LLJJJJ());

    @Override // X.InterfaceC31710CcU
    public final String LIZ() {
        return "live_paid_series";
    }

    public final void LJIIIZ() {
        long j;
        IPaidSeriesLiveApiService iPaidSeriesLiveApiService = (IPaidSeriesLiveApiService) this.LJLJL.getValue();
        Room room = this.LJLJJL;
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        C78999UzT.LJFF(iPaidSeriesLiveApiService.getSeriesNum(j).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS56S0100000_4(this, 96), C25695A6p.LJLIL), this.LJLJJLL);
    }

    @Override // X.InterfaceC31710CcU
    public final Object LLJJJIL() {
        return new C25697A6r(new C25694A6o(this));
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onDestroy() {
        this.LJLJJLL.dispose();
    }

    @Override // X.InterfaceC31710CcU
    public final Enum LLJJJJLIIL() {
        return EnumC30736C4m.SLOT_BROADCAST_PREVIEW_TOOLBAR;
    }

    @Override // X.InterfaceC31748Cd6
    public final Object LJII(InterfaceC67352kd interfaceC67352kd) {
        long j;
        try {
            IPaidSeriesLiveApiService iPaidSeriesLiveApiService = (IPaidSeriesLiveApiService) this.LJLJL.getValue();
            Room room = this.LJLJJL;
            if (room != null) {
                j = room.getId();
            } else {
                j = 0;
            }
            if (iPaidSeriesLiveApiService.LIZ(j).LJ().status_code == 0) {
                this.LJLJLJ.post(new ARunnableS40S0100000_4(this, 111));
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
            return Boolean.FALSE;
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void LLJJJJ(ViewModel viewModel, A72 slotGate) {
        long j;
        IIconSlot.SlotViewModel viewModel2 = (IIconSlot.SlotViewModel) viewModel;
        o.LJIIIZ(viewModel2, "viewModel");
        o.LJIIIZ(slotGate, "slotGate");
        this.LJLIL = viewModel2;
        this.LJLILLLLZI = slotGate;
        this.LJLJI = slotGate;
        this.LJLJJI = viewModel2;
        LJIIIZ();
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_series_dollar;
        c2068389v.LIZLLL = Integer.valueOf(C04330Ez.LIZIZ(slotGate.getContext(), R.color.acm));
        ActivityC45651qj context = slotGate.getContext();
        o.LJIIIIZZ(context, "slotGate.context");
        SY9 LIZ = c2068389v.LIZ(context);
        C2068389v c2068389v2 = new C2068389v();
        c2068389v2.LIZ = R.raw.icon_series_dollar;
        ActivityC45651qj context2 = slotGate.getContext();
        o.LJIIIIZZ(context2, "slotGate.context");
        SY9 LIZ2 = c2068389v2.LIZ(context2);
        viewModel2.LJLJJL.setValue(Boolean.FALSE);
        viewModel2.LJLILLLLZI.setValue(Boolean.TRUE);
        viewModel2.LJLJL.setValue(LIZ);
        viewModel2.LJLLI.setValue(slotGate.getContext().getString(R.string.qhu));
        viewModel2.LJLJLLL.setValue(LIZ2);
        viewModel2.LJLLILLLL.setValue(slotGate.getContext().getString(R.string.qhl));
        viewModel2.LL = 10000L;
        viewModel2.LJLLJ.setValue(slotGate.getContext().getString(R.string.qht));
        String currentUserID = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID();
        Room room = this.LJLJJL;
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        A4N.LIZIZ(currentUserID, String.valueOf(j));
    }

    @Override // X.InterfaceC31710CcU
    public final void LLJJLIIIJLLLLLLLZ(java.util.Map<String, Object> params, InterfaceC25704A6y interfaceC25704A6y) {
        o.LJIIIZ(params, "params");
        Object obj = params.get("param_live_paid_series");
        Room room = null;
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        Object obj2 = params.get("param_room");
        if (obj2 instanceof Room) {
            room = (Room) obj2;
        }
        this.LJLJJL = room;
        interfaceC25704A6y.LIZ(o.LJ(obj, Boolean.TRUE));
    }
}
