package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.slot.AbsSlotWidget;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.model.BaLeadsGenInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.commercialize.live.leadgen.OpenBAPolicyWebViewEvent;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OKL extends AbsSlotWidget<IIconSlot, IIconSlot.SlotViewModel, EnumC30736C4m> {
    public Room LJLJI;
    public A72 LJLJJI;
    public final Keva LJLJJL = Keva.getRepo("commercialize_live_leads_gen_keva_name");

    @Override // X.InterfaceC31710CcU
    public final String LIZ() {
        return "ba_leads_gen";
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final List<Integer> getMessageType() {
        return C47261Igj.LJJIJIL(Integer.valueOf(EnumC31509CYf.BA_LEAD_GEN.getIntType()));
    }

    @Override // X.InterfaceC31710CcU
    public final Object LLJJJIL() {
        return new OKO(new OKB(this));
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onDestroy() {
        this.LJLJJL.storeInt("during_live_report_show_event_times", 0);
        C42625Go9.LIZJ(this);
    }

    @Override // X.InterfaceC31710CcU
    public final Enum LLJJJJLIIL() {
        return EnumC30736C4m.SLOT_LIVE_ANCHOR_TOOLBAR;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void LLJJL(String str) {
        Long l;
        User owner;
        int i = this.LJLJJL.getInt("during_live_report_show_event_times", 0);
        Room room = this.LJLJI;
        Long l2 = null;
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        String valueOf = String.valueOf(l);
        Room room2 = this.LJLJI;
        if (room2 != null && (owner = room2.getOwner()) != null) {
            l2 = Long.valueOf(owner.getId());
        }
        NIJ.LIZJ(i, valueOf, String.valueOf(l2), str);
        this.LJLJJL.storeInt("during_live_report_show_event_times", i + 1);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onCreate(Bundle bundle) {
        C42625Go9.LIZIZ(this);
    }

    @QD3
    public final void openPolicyWebView(OpenBAPolicyWebViewEvent params) {
        ActivityC45651qj context;
        o.LJIIIZ(params, "params");
        A72 a72 = this.LJLJJI;
        if (a72 != null && (context = a72.getContext()) != null) {
            NIJ.LIZ(context, params);
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void LLJJJJ(ViewModel viewModel, A72 slotGate) {
        String str;
        SY9 sy9;
        int i;
        BaLeadsGenInfo baLeadsGenInfo;
        IIconSlot.SlotViewModel viewModel2 = (IIconSlot.SlotViewModel) viewModel;
        o.LJIIIZ(viewModel2, "viewModel");
        o.LJIIIZ(slotGate, "slotGate");
        this.LJLIL = viewModel2;
        this.LJLILLLLZI = slotGate;
        this.LJLJJI = slotGate;
        viewModel2.LJLILLLLZI.setValue(Boolean.TRUE);
        viewModel2.LJLJL.setValue(C04270Et.LIZIZ(slotGate.getContext(), R.drawable.b8d));
        MutableLiveData<String> mutableLiveData = viewModel2.LJLLI;
        String str2 = null;
        if (slotGate.getContext() != null) {
            str = C86V.LJFF(R.string.hqf);
        } else {
            str = null;
        }
        mutableLiveData.setValue(str);
        MutableLiveData<Drawable> mutableLiveData2 = viewModel2.LJLJLLL;
        ActivityC45651qj context = slotGate.getContext();
        if (context != null) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_clipboard_two_bars_ltr;
            sy9 = c2068389v.LIZ(context);
        } else {
            sy9 = null;
        }
        mutableLiveData2.setValue(sy9);
        viewModel2.LJLLILLLL.setValue(C86V.LJFF(R.string.hqd));
        Room room = this.LJLJI;
        if (room != null && (baLeadsGenInfo = room.baLeadsGenInfo) != null) {
            str2 = baLeadsGenInfo.leadsGenModel;
        }
        if (str2 == null || str2.length() == 0) {
            i = 0;
        } else {
            i = 1;
        }
        viewModel2.LLFFF = i;
    }

    @Override // X.InterfaceC31710CcU
    public final void LLJJLIIIJLLLLLLLZ(java.util.Map<String, Object> params, InterfaceC25704A6y interfaceC25704A6y) {
        Room room;
        BaLeadsGenInfo baLeadsGenInfo;
        o.LJIIIZ(params, "params");
        Object obj = params.get("param_room");
        Boolean bool = null;
        if (obj instanceof Room) {
            room = (Room) obj;
        } else {
            room = null;
        }
        this.LJLJI = room;
        if (room != null && (baLeadsGenInfo = room.baLeadsGenInfo) != null) {
            bool = Boolean.valueOf(baLeadsGenInfo.leadsGenPermission);
        }
        interfaceC25704A6y.LIZ(o.LJ(bool, Boolean.TRUE));
    }
}
