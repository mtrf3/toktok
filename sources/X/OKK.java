package X;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.slot.AbsSlotWidget;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.model.BaLeadsGenInfo;
import com.bytedance.android.livesdk.model.message.BALeadGenMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.commercialize.live.leadgen.BALeadsGenModel;
import com.ss.android.ugc.aweme.commercialize.live.leadgen.OpenBAPolicyWebViewEvent;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OKK extends AbsSlotWidget<IIconSlot, IIconSlot.SlotViewModel, EnumC30736C4m> {
    public Room LJLJI;
    public A72 LJLJJI;
    public IIconSlot.SlotViewModel LJLJJL;
    public long LJLJL;
    public String LJLJLLL;
    public String LJLL;
    public final Keva LJLJJLL = Keva.getRepo("commercialize_live_leads_gen_keva_name");
    public Integer LJLJLJ = 0;

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
        return new OKM(new OKE(this));
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onDestroy() {
        this.LJLJJLL.storeInt("audience_report_show_event_times", 0);
        C42625Go9.LIZJ(this);
    }

    @Override // X.InterfaceC31710CcU
    public final Enum LLJJJJLIIL() {
        return EnumC30736C4m.SLOT_LIVE_WATCHER_TOOLBAR;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000b. Please report as an issue. */
    public static String LJIIIZ(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case 81960759:
                    if (str.equals("cta_extension_applynow")) {
                        String LJFF = C86V.LJFF(R.string.ecn);
                        o.LJIIIIZZ(LJFF, "getString(R.string.cta_extension_applynow)");
                        return LJFF;
                    }
                    break;
                case 692902994:
                    if (str.equals("cta_extension_specialoffer")) {
                        String LJFF2 = C86V.LJFF(R.string.ecr);
                        o.LJIIIIZZ(LJFF2, "getString(R.string.cta_extension_specialoffer)");
                        return LJFF2;
                    }
                    break;
                case 835541147:
                    if (str.equals("cta_extension_subscribe")) {
                        String LJFF3 = C86V.LJFF(R.string.ecs);
                        o.LJIIIIZZ(LJFF3, "getString(R.string.cta_extension_subscribe)");
                        return LJFF3;
                    }
                    break;
                case 895298421:
                    if (str.equals("cta_extension_getquote")) {
                        String LJFF4 = C86V.LJFF(R.string.eco);
                        o.LJIIIIZZ(LJFF4, "getString(R.string.cta_extension_getquote)");
                        return LJFF4;
                    }
                    break;
                case 1876509418:
                    if (str.equals("cta_extension_learnmore")) {
                        String LJFF5 = C86V.LJFF(R.string.ecp);
                        o.LJIIIIZZ(LJFF5, "getString(R.string.cta_extension_learnmore)");
                        return LJFF5;
                    }
                    break;
                case 2046107495:
                    if (str.equals("cta_extension_signup")) {
                        String LJFF6 = C86V.LJFF(R.string.ecq);
                        o.LJIIIIZZ(LJFF6, "getString(R.string.cta_extension_signup)");
                        return LJFF6;
                    }
                    break;
            }
        }
        String LJFF7 = C86V.LJFF(R.string.eco);
        o.LJIIIIZZ(LJFF7, "getString(R.string.cta_extension_getquote)");
        return LJFF7;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void LLJJL(String str) {
        Long l;
        User owner;
        int i = this.LJLJJLL.getInt("audience_report_show_event_times", 0);
        if (i < 1) {
            String currentUserID = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID();
            Room room = this.LJLJI;
            if (room != null && (owner = room.getOwner()) != null) {
                l = Long.valueOf(owner.getId());
            } else {
                l = null;
            }
            String valueOf = String.valueOf(l);
            Integer num = this.LJLJLJ;
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "live_anchor");
            c188727au.LJIIIZ("from_uid_id", currentUserID);
            c188727au.LJIIIZ("to_user_id", valueOf);
            c188727au.LJFF(num, "is_ad");
            FMX.LJIIL("ttelite_ba_lead_tt_show_cta", c188727au.LIZ);
        }
        this.LJLJJLL.storeInt("audience_report_show_event_times", i + 1);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onCreate(Bundle bundle) {
        C42625Go9.LIZIZ(this);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onMessage(IMessage iMessage) {
        IIconSlot.SlotViewModel slotViewModel;
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2;
        MutableLiveData<String> mutableLiveData3;
        MutableLiveData<Boolean> mutableLiveData4;
        IIconSlot.SlotViewModel slotViewModel2;
        MutableLiveData<Boolean> mutableLiveData5;
        if (!(iMessage instanceof BALeadGenMessage)) {
            return;
        }
        BALeadGenMessage bALeadGenMessage = (BALeadGenMessage) iMessage;
        long j = bALeadGenMessage.opTime;
        if (j < this.LJLJL) {
            return;
        }
        this.LJLJL = j;
        int i = bALeadGenMessage.op;
        if (i != 1) {
            if (i != 2) {
                C78983UzD.LJIILL("BALeadGenMessage is not add or delete!");
                return;
            }
            IIconSlot.SlotViewModel slotViewModel3 = this.LJLJJL;
            if (slotViewModel3 == null || (mutableLiveData4 = slotViewModel3.LJLILLLLZI) == null || !o.LJ(mutableLiveData4.getValue(), Boolean.TRUE) || (slotViewModel2 = this.LJLJJL) == null || (mutableLiveData5 = slotViewModel2.LJLILLLLZI) == null) {
                return;
            }
            mutableLiveData5.setValue(Boolean.FALSE);
            return;
        }
        String LJIIIZ = LJIIIZ(bALeadGenMessage.ctaText);
        this.LJLL = LJIIIZ;
        IIconSlot.SlotViewModel slotViewModel4 = this.LJLJJL;
        if (slotViewModel4 != null && (mutableLiveData3 = slotViewModel4.LJLLI) != null) {
            mutableLiveData3.setValue(LJIIIZ);
        }
        this.LJLJLLL = bALeadGenMessage.schema;
        IIconSlot.SlotViewModel slotViewModel5 = this.LJLJJL;
        if ((slotViewModel5 != null && (mutableLiveData2 = slotViewModel5.LJLILLLLZI) != null && o.LJ(mutableLiveData2.getValue(), Boolean.TRUE)) || (slotViewModel = this.LJLJJL) == null || (mutableLiveData = slotViewModel.LJLILLLLZI) == null) {
            return;
        }
        mutableLiveData.setValue(Boolean.TRUE);
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
        boolean z;
        String str;
        BaLeadsGenInfo baLeadsGenInfo;
        BaLeadsGenInfo baLeadsGenInfo2;
        String str2;
        IIconSlot.SlotViewModel viewModel2 = (IIconSlot.SlotViewModel) viewModel;
        o.LJIIIZ(viewModel2, "viewModel");
        o.LJIIIZ(slotGate, "slotGate");
        this.LJLIL = viewModel2;
        this.LJLILLLLZI = slotGate;
        this.LJLJJI = slotGate;
        this.LJLJJL = viewModel2;
        Room room = this.LJLJI;
        if (room != null && (baLeadsGenInfo2 = room.baLeadsGenInfo) != null && (str2 = baLeadsGenInfo2.leadsGenModel) != null && str2.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        viewModel2.LJLILLLLZI.setValue(Boolean.valueOf(z));
        viewModel2.LJLJL.setValue(C04270Et.LIZIZ(slotGate.getContext(), R.drawable.b8b));
        viewModel2.LJLJLJ.setValue(C04270Et.LIZIZ(slotGate.getContext(), R.drawable.b8c));
        if (z) {
            Gson gson = new Gson();
            Room room2 = this.LJLJI;
            if (room2 != null && (baLeadsGenInfo = room2.baLeadsGenInfo) != null) {
                str = baLeadsGenInfo.leadsGenModel;
            } else {
                str = null;
            }
            BALeadsGenModel bALeadsGenModel = (BALeadsGenModel) GsonProtectorUtils.fromJson(gson, str, new OKP().getType());
            if (bALeadsGenModel != null) {
                String LJIIIZ = LJIIIZ(bALeadsGenModel.leadsGenText);
                this.LJLL = LJIIIZ;
                viewModel2.LJLLI.setValue(LJIIIZ);
                this.LJLJLLL = bALeadsGenModel.leadsGenSchema;
            }
        }
    }

    @Override // X.InterfaceC31710CcU
    public final void LLJJLIIIJLLLLLLLZ(java.util.Map<String, Object> params, InterfaceC25704A6y interfaceC25704A6y) {
        Room room;
        int i;
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
        Object obj2 = params.get("param_enter_from_effect_ad_bool");
        if (!(obj2 instanceof Boolean)) {
            obj2 = null;
        }
        Boolean bool2 = Boolean.TRUE;
        if (o.LJ(obj2, bool2)) {
            i = 1;
        } else {
            i = 0;
        }
        this.LJLJLJ = i;
        Room room2 = this.LJLJI;
        if (room2 != null && (baLeadsGenInfo = room2.baLeadsGenInfo) != null) {
            bool = Boolean.valueOf(baLeadsGenInfo.leadsGenPermission);
        }
        interfaceC25704A6y.LIZ(o.LJ(bool, bool2));
    }
}
