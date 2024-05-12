package X;

import Y.ARunnableS46S0100000_10;
import Y.AfS28S0110000_10;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.slot.AbsSlotWidget;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.commercialize.live.leadgen.BALeadsGenEvent;
import com.ss.android.ugc.aweme.commercialize.live.leadgen.OpenBAPolicyWebViewEvent;
import com.ss.android.ugc.aweme.commercialize.live.leadgen.api.BALeadsGenLiveApi;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OKJ extends AbsSlotWidget<IIconSlot, IIconSlot.SlotViewModel, EnumC30736C4m> implements InterfaceC31748Cd6 {
    public A72 LJLJI;
    public IIconSlot.SlotViewModel LJLJJI;
    public final Keva LJLJJL = Keva.getRepo("commercialize_live_leads_gen_keva_name");
    public final C73318Sq2 LJLJJLL = new C73318Sq2();
    public final Handler LJLJL = new Handler(C16880lQ.LLJJJJ());
    public final User LJLJLJ = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser();
    public boolean LJLJLLL;

    @Override // X.InterfaceC31710CcU
    public final String LIZ() {
        return "ba_leads_gen";
    }

    @Override // X.InterfaceC31710CcU
    public final Object LLJJJIL() {
        return new OKN(new OKD(this));
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onDestroy() {
        this.LJLJJLL.dispose();
        this.LJLJJL.storeInt("before_report_show_event_times", 0);
        this.LJLJJL.storeInt("before_report_click_event_times", 0);
        C42625Go9.LIZJ(this);
    }

    @Override // X.InterfaceC31710CcU
    public final Enum LLJJJJLIIL() {
        return EnumC30736C4m.SLOT_BROADCAST_PREVIEW_TOOLBAR;
    }

    @Override // X.InterfaceC31748Cd6
    public final Object LJII(InterfaceC67352kd interfaceC67352kd) {
        try {
            if (((BALeadsGenLiveApi) C45336Hqm.LIZ(BALeadsGenLiveApi.class)).clearLeadsGen().LJ().status_code == 0) {
                this.LJLJL.post(new ARunnableS46S0100000_10(this, 117));
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
            return Boolean.FALSE;
        }
    }

    public final void LJIIIZ(boolean z) {
        C78999UzT.LJFF(((BALeadsGenLiveApi) C45336Hqm.LIZ(BALeadsGenLiveApi.class)).getLeadsGenAddCount(0L).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS28S0110000_10(this, z, 0), OKH.LJLIL), this.LJLJJLL);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void LLJJL(String str) {
        String str2;
        int i = this.LJLJJL.getInt("before_report_show_event_times", 0);
        User user = this.LJLJLJ;
        if (user == null || (str2 = user.getUid()) == null) {
            str2 = "";
        }
        NIJ.LIZJ(i, CardStruct.IStatusCode.DEFAULT, str2, str);
        this.LJLJJL.storeInt("before_report_show_event_times", i + 1);
    }

    @QD3
    public final void listenToAddLeadGenLiveEvent(BALeadsGenEvent event) {
        MutableLiveData<String> mutableLiveData;
        o.LJIIIZ(event, "event");
        String actionType = event.actionType;
        IIconSlot.SlotViewModel slotViewModel = this.LJLJJI;
        o.LJIIIZ(actionType, "actionType");
        if (o.LJ(actionType, EnumC46531INz.ADDED.getValue())) {
            if (slotViewModel != null) {
                MutableLiveData<Boolean> mutableLiveData2 = slotViewModel.LJLJJL;
                if (mutableLiveData2 != null) {
                    mutableLiveData2.setValue(Boolean.FALSE);
                }
                MutableLiveData<String> mutableLiveData3 = slotViewModel.LJLJJI;
                if (mutableLiveData3 == null) {
                    return;
                }
                mutableLiveData3.setValue("1");
                return;
            }
            return;
        }
        if (!o.LJ(actionType, EnumC46531INz.REMOVE.getValue()) || slotViewModel == null || (mutableLiveData = slotViewModel.LJLJJI) == null) {
            return;
        }
        mutableLiveData.setValue("");
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onCreate(Bundle bundle) {
        C42625Go9.LIZIZ(this);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public void onEvent(Boolean bool) {
        if (bool != null) {
            bool.booleanValue();
            IIconSlot.SlotViewModel slotViewModel = this.LJLJJI;
            if (slotViewModel != null) {
                slotViewModel.LJLILLLLZI.setValue(bool);
                if (bool.booleanValue() && this.LJLJLLL) {
                    MutableLiveData<Boolean> mutableLiveData = slotViewModel.LJLJJL;
                    if (mutableLiveData != null) {
                        mutableLiveData.setValue(Boolean.FALSE);
                    }
                    MutableLiveData<String> mutableLiveData2 = slotViewModel.LJLJJI;
                    if (mutableLiveData2 == null) {
                        return;
                    }
                    mutableLiveData2.setValue("1");
                    return;
                }
                MutableLiveData<String> mutableLiveData3 = slotViewModel.LJLJJI;
                if (mutableLiveData3 == null) {
                    return;
                }
                mutableLiveData3.setValue("");
            }
        }
    }

    @QD3
    public final void openPolicyWebView(OpenBAPolicyWebViewEvent params) {
        ActivityC45651qj context;
        o.LJIIIZ(params, "params");
        A72 a72 = this.LJLJI;
        if (a72 != null && (context = a72.getContext()) != null) {
            NIJ.LIZ(context, params);
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void LLJJJJ(ViewModel viewModel, A72 slotGate) {
        SY9 sy9;
        IIconSlot.SlotViewModel viewModel2 = (IIconSlot.SlotViewModel) viewModel;
        o.LJIIIZ(viewModel2, "viewModel");
        o.LJIIIZ(slotGate, "slotGate");
        this.LJLIL = viewModel2;
        this.LJLILLLLZI = slotGate;
        this.LJLJI = slotGate;
        this.LJLJJI = viewModel2;
        viewModel2.LJLILLLLZI.setValue(Boolean.TRUE);
        viewModel2.LJLJL.setValue(C04270Et.LIZIZ(slotGate.getContext(), R.drawable.b8e));
        viewModel2.LJLLI.setValue(C86V.LJFF(R.string.hqf));
        MutableLiveData<Drawable> mutableLiveData = viewModel2.LJLJLLL;
        ActivityC45651qj context = slotGate.getContext();
        if (context != null) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_clipboard_two_bars_ltr;
            sy9 = c2068389v.LIZ(context);
        } else {
            sy9 = null;
        }
        mutableLiveData.setValue(sy9);
        viewModel2.LJLLILLLL.setValue(C86V.LJFF(R.string.hqd));
        int i = this.LJLJJL.getInt("leads_gen_before_live_icon_display_times", 0);
        if (i >= 5) {
            LJIIIZ(true);
        } else {
            LJIIIZ(false);
        }
        this.LJLJJL.storeInt("leads_gen_before_live_icon_display_times", i + 1);
    }

    @Override // X.InterfaceC31710CcU
    public final void LLJJLIIIJLLLLLLLZ(java.util.Map<String, Object> params, InterfaceC25704A6y interfaceC25704A6y) {
        o.LJIIIZ(params, "params");
        Object obj = params.get("param_live_ba_leads_gen");
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        interfaceC25704A6y.LIZ(o.LJ(obj, Boolean.TRUE));
    }
}
