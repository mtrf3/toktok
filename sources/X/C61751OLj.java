package X;

import Y.ARunnableS46S0100000_10;
import Y.AfS28S0110000_10;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.slot.AbsSlotWidget;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.commercialize.live.business.links.api.BusinessLinksLiveApi;
import com.ss.android.ugc.aweme.commercialize.live.business.links.model.BusinessLinksLiveLinkPin;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.OLj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61751OLj extends AbsSlotWidget<IIconSlot, IIconSlot.SlotViewModel, EnumC30736C4m> implements InterfaceC31748Cd6 {
    public A72 LJLJJI;
    public IIconSlot.SlotViewModel LJLJJL;
    public AbstractC40333FsH LJLJJLL;
    public String LJLJLLL;
    public String LJLL;
    public C188727au LJLLI;
    public final Keva LJLJI = Keva.getRepo("commercialize_live_business_links_keva_name");
    public final C73318Sq2 LJLJL = new C73318Sq2();
    public final Handler LJLJLJ = new Handler(C16880lQ.LLJJJJ());

    @Override // X.InterfaceC31710CcU
    public final String LIZ() {
        return "business_links";
    }

    @Override // X.InterfaceC31710CcU
    public final Object LLJJJIL() {
        return new C61758OLq(new C61753OLl(this));
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onDestroy() {
        AbstractC40333FsH abstractC40333FsH;
        A72 a72 = this.LJLJJI;
        if (a72 != null && (abstractC40333FsH = this.LJLJJLL) != null) {
            ActivityC45651qj context = a72.getContext();
            o.LJIIIIZZ(context, "it.context");
            abstractC40333FsH.LIZ(context);
        }
        this.LJLJL.dispose();
        C42625Go9.LIZJ(this);
    }

    @Override // X.InterfaceC31710CcU
    public final Enum LLJJJJLIIL() {
        return EnumC30736C4m.SLOT_BROADCAST_PREVIEW_TOOLBAR;
    }

    @Override // X.InterfaceC31748Cd6
    public final Object LJII(InterfaceC67352kd interfaceC67352kd) {
        try {
            if (((BusinessLinksLiveApi) C45336Hqm.LIZ(BusinessLinksLiveApi.class)).clearBusinessLinksCards().LJ().status_code == 0) {
                this.LJLJLJ.post(new ARunnableS46S0100000_10(this, 186));
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
            return Boolean.FALSE;
        }
    }

    public final void LJIIIZ(boolean z) {
        C78999UzT.LJFF(((BusinessLinksLiveApi) C45336Hqm.LIZ(BusinessLinksLiveApi.class)).getActiveLinksCount().LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS28S0110000_10(this, z, 1), C61756OLo.LJLIL), this.LJLJL);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void LLJJL(String str) {
        String str2;
        C188727au c188727au = new C188727au();
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin == null || (str2 = createIUserServicebyMonsterPlugin.getCurrentUserID()) == null) {
            str2 = "";
        }
        c188727au.LJIIIZ("anchor_id", str2);
        c188727au.LJIIIZ("room_id", "");
        c188727au.LJIIIZ("live_status", "before_live");
        c188727au.LJIIIZ("enter_from_merge", this.LJLJLLL);
        c188727au.LJIIIZ("enter_method", this.LJLL);
        this.LJLLI = c188727au;
        java.util.Map<String, String> map = null;
        if (o.LJ(str, "before_live")) {
            C188727au c188727au2 = this.LJLLI;
            if (c188727au2 != null) {
                c188727au2.LJIIIZ("type", "toolbar");
                map = c188727au2.LIZ;
            }
            FMX.LJIIL("livesdk_add_links_show", map);
            return;
        }
        if (!o.LJ(str, "before_live_dialog_item")) {
            return;
        }
        C188727au c188727au3 = this.LJLLI;
        if (c188727au3 != null) {
            c188727au3.LJIIIZ("type", "subpage");
            map = c188727au3.LIZ;
        }
        FMX.LJIIL("livesdk_add_links_show", map);
    }

    @QD3
    public final void listenToLinksLiveEvent(C59416NTo event) {
        IIconSlot.SlotViewModel slotViewModel;
        MutableLiveData<String> mutableLiveData;
        String str;
        AbstractC40333FsH abstractC40333FsH;
        o.LJIIIZ(event, "event");
        BusinessLinksLiveLinkPin businessLinksLiveLinkPin = event.LJLIL;
        if (businessLinksLiveLinkPin != null && o.LJ(businessLinksLiveLinkPin.liveStatus, EnumC61755OLn.BEFORE_LIVE.getValue())) {
            String str2 = businessLinksLiveLinkPin.actionType;
            if (o.LJ(str2, EnumC61765OLx.CLOSE.getValue())) {
                A72 a72 = this.LJLJJI;
                if (a72 != null && (abstractC40333FsH = this.LJLJJLL) != null) {
                    ActivityC45651qj context = a72.getContext();
                    o.LJIIIIZZ(context, "it.context");
                    abstractC40333FsH.LIZ(context);
                    return;
                }
                return;
            }
            if (!o.LJ(str2, EnumC61765OLx.COUNT.getValue()) || (slotViewModel = this.LJLJJL) == null || (mutableLiveData = slotViewModel.LJLJJI) == null) {
                return;
            }
            int i = businessLinksLiveLinkPin.count;
            if (i >= 1) {
                str = String.valueOf(i);
            } else {
                str = new String();
            }
            mutableLiveData.setValue(str);
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onCreate(Bundle bundle) {
        C42625Go9.LIZIZ(this);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void LLJJJJ(ViewModel viewModel, A72 slotGate) {
        IIconSlot.SlotViewModel viewModel2 = (IIconSlot.SlotViewModel) viewModel;
        o.LJIIIZ(viewModel2, "viewModel");
        o.LJIIIZ(slotGate, "slotGate");
        this.LJLIL = viewModel2;
        this.LJLILLLLZI = slotGate;
        this.LJLJJI = slotGate;
        this.LJLJJL = viewModel2;
        viewModel2.LJLILLLLZI.setValue(Boolean.TRUE);
        viewModel2.LJLJL.setValue(C04270Et.LIZIZ(slotGate.getContext(), R.drawable.axk));
        viewModel2.LJLLI.setValue(slotGate.getContext().getString(R.string.o0));
        viewModel2.LJLJLLL.setValue(C04270Et.LIZIZ(slotGate.getContext(), R.drawable.axh));
        viewModel2.LJLLILLLL.setValue(slotGate.getContext().getString(R.string.i3));
        int i = this.LJLJI.getInt("business_links_before_live_icon_display_times", 0);
        if (i > 5) {
            LJIIIZ(true);
        } else {
            LJIIIZ(false);
        }
        this.LJLJI.storeInt("business_links_before_live_icon_display_times", i + 1);
    }

    @Override // X.InterfaceC31710CcU
    public final void LLJJLIIIJLLLLLLLZ(java.util.Map<String, Object> params, InterfaceC25704A6y interfaceC25704A6y) {
        String str;
        o.LJIIIZ(params, "params");
        Object obj = params.get("param_live_ba_link");
        String str2 = null;
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        Object obj2 = params.get("param_live_enter_from_merge");
        if (obj2 instanceof String) {
            str = (String) obj2;
        } else {
            str = null;
        }
        this.LJLJLLL = str;
        Object obj3 = params.get("param_live_enter_method_merge");
        if (obj3 instanceof String) {
            str2 = (String) obj3;
        }
        this.LJLL = str2;
        interfaceC25704A6y.LIZ(o.LJ(obj, Boolean.TRUE));
    }
}
