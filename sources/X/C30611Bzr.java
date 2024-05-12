package X;

import Y.AfS57S0100000_5;
import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.slot.AbsSlotWidget;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.comp.api.game.PartnershipGameTaskShowCount;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.game.api.GameLivePartnershipRetrofitApi;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.Bzr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30611Bzr extends AbsSlotWidget<IIconSlot, IIconSlot.SlotViewModel, EnumC30736C4m> implements InterfaceC31748Cd6 {
    public static boolean LJLLLL;
    public final Context LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public C73411SrX LJLJJLL;
    public boolean LJLJL;
    public String LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public Boolean LJLLI;
    public C30574BzG LJLLILLLL;
    public final C00 LJLLJ;
    public final C30612Bzs LJLLL;

    @Override // X.InterfaceC31710CcU
    public final String LIZ() {
        return "game_partnership";
    }

    public final void LJIIIZ() {
        MutableLiveData<Drawable> mutableLiveData;
        MutableLiveData<String> mutableLiveData2;
        this.LJLJL = true;
        ViewModel viewModel = this.LJLIL;
        IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) viewModel;
        if (slotViewModel != null) {
            slotViewModel.LLII = 0.5f;
        }
        IIconSlot.SlotViewModel slotViewModel2 = (IIconSlot.SlotViewModel) viewModel;
        if (slotViewModel2 != null && (mutableLiveData2 = slotViewModel2.LJLJJI) != null) {
            mutableLiveData2.postValue("");
        }
        IIconSlot.SlotViewModel slotViewModel3 = (IIconSlot.SlotViewModel) this.LJLIL;
        if (slotViewModel3 != null && (mutableLiveData = slotViewModel3.LJLJL) != null) {
            mutableLiveData.postValue(C04270Et.LIZIZ(this.LJLJI, R.drawable.d9i));
        }
        C30576BzI.LIZIZ = false;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final List<EnumC29188Bcu> LLJJJ() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onCreate(Bundle bundle) {
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onDestroy() {
        C30577BzJ.LJFF(this.LJLLL);
        if (this.LJLJJI) {
            BHT.LIZ().destroy();
            C30579BzL S00 = ((IGamePartnershipService) CN1.LIZ(IGamePartnershipService.class)).S00();
            if (S00 != null) {
                S00.LIZJ();
            }
        }
        Application application = (Application) C16880lQ.LLLLL(this.LJLJI);
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this.LJLLILLLL);
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.getClass();
        dataChannelGlobal.jv0(this);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onDispose() {
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public void onEvent(Boolean bool) {
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onMessage(IMessage iMessage) {
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onPause() {
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onResume() {
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onStart() {
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onStop() {
    }

    public final void LJIIL() {
        if (!this.LJLJJL) {
            this.LJLJJLL = (C73411SrX) ((GameLivePartnershipRetrofitApi) TTL.LIZ(GameLivePartnershipRetrofitApi.class, "get()\n                .g…pRetrofitApi::class.java)")).addGamePartnershipBusinessStatus(1).LJII(new C62705OjF()).LJJJJJ(3L).LJJJLIIL(new AfS57S0100000_5(this, 311), C30613Bzt.LJLIL);
        }
    }

    public final void LJIILIIL() {
        if (!this.LJLJJL) {
            return;
        }
        XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C65162h6(this, null), 2);
    }

    public final void LJIILJJIL() {
        if (this.LJLJLLL) {
            return;
        }
        C00 c00 = this.LJLLJ;
        if (c00 != null) {
            c00.LIZ(LiveMode.VIDEO);
        }
        C00 c002 = this.LJLLJ;
        if (c002 != null) {
            c002.LIZIZ(LiveMode.VIDEO, "gamecp_video");
        }
        C30577BzJ.LJI(this.LJLJI, new AqS171S0100000_5(this, 789), true);
        this.LJLJLLL = true;
    }

    @Override // X.InterfaceC31710CcU
    public final Object LLJJJIL() {
        return new C05(new C30596Bzc(this));
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final List<Integer> getMessageType() {
        return new ArrayList();
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget
    public final void onAggregateClick() {
        LJIIJ("business");
    }

    @Override // X.InterfaceC31710CcU
    public final Enum LLJJJJLIIL() {
        return EnumC30736C4m.SLOT_BROADCAST_PREVIEW_TOOLBAR;
    }

    public C30611Bzr(Context context) {
        o.LJIIIZ(context, "context");
        this.LJLJI = context;
        this.LJLJLJ = "";
        this.LJLL = true;
        this.LJLLJ = ((IGamePartnershipService) CN1.LIZ(IGamePartnershipService.class)).S00();
        this.LJLLL = new C30612Bzs(this);
    }

    @Override // X.InterfaceC31748Cd6
    public final Object LJII(InterfaceC67352kd interfaceC67352kd) {
        MutableLiveData<String> mutableLiveData;
        C73411SrX c73411SrX;
        C73411SrX c73411SrX2 = this.LJLJJLL;
        boolean z = true;
        if (c73411SrX2 != null && !c73411SrX2.isDisposed() && (c73411SrX = this.LJLJJLL) != null) {
            c73411SrX.dispose();
        }
        if (((GameLivePartnershipRetrofitApi) TTL.LIZ(GameLivePartnershipRetrofitApi.class, "get()\n            .getSe…pRetrofitApi::class.java)")).removeGamePartnershipBusinessStatus(2).execute().LIZIZ.statusCode != 0) {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        if (valueOf.booleanValue()) {
            BHT.LIZ().os0(0, 2, null);
            this.LJLJLLL = false;
            C30576BzI.LIZLLL = false;
            this.LJLJJL = false;
            IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) this.LJLIL;
            if (slotViewModel != null && (mutableLiveData = slotViewModel.LJLJJI) != null) {
                mutableLiveData.postValue("");
            }
        }
        return valueOf;
    }

    public final void LJIIJ(String str) {
        String str2;
        String str3;
        MutableLiveData<Boolean> mutableLiveData;
        BZI LIZ = C28787BRn.LIZ("livesdk_gamepad_btn_click");
        LIZ.LJIJJ("video_live", "live_type");
        if (str == null) {
            IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) this.LJLIL;
            if (slotViewModel != null && (mutableLiveData = slotViewModel.LJLIL) != null && o.LJ(mutableLiveData.getValue(), Boolean.TRUE)) {
                str2 = "icon";
            } else {
                str2 = "add_partnership";
            }
        } else {
            str2 = str;
        }
        LIZ.LJIJJ(str2, "btn_name");
        LIZ.LJIJJ("host", "user_type");
        LIZ.LJIJJ("live_start", "page_name");
        if (!o.LJ(str, "business")) {
            if (this.LJLJL) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            LIZ.LJIJJ(str3, "is_grey");
        }
        LIZ.LJIJJ(String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "user_id");
        LIZ.LJJIIJZLJL();
    }

    public final void LJIIJJI(String str) {
        String str2;
        String str3;
        MutableLiveData<Boolean> mutableLiveData;
        BZI LIZ = C28787BRn.LIZ("livesdk_gamepad_btn_show");
        LIZ.LJIJJ("video_live", "live_type");
        if (str == null) {
            IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) this.LJLIL;
            if (slotViewModel != null && (mutableLiveData = slotViewModel.LJLIL) != null && o.LJ(mutableLiveData.getValue(), Boolean.TRUE)) {
                str2 = "icon";
            } else {
                str2 = "add_partnership";
            }
        } else {
            str2 = str;
        }
        LIZ.LJIJJ(str2, "btn_name");
        LIZ.LJIJJ("host", "user_type");
        LIZ.LJIJJ("live_start", "page_name");
        LIZ.LJIJJ(String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "user_id");
        if (!o.LJ(str, "business")) {
            if (this.LJLJL) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            LIZ.LJIJJ(str3, "is_grey");
        }
        LIZ.LJJIIJZLJL();
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void LLJJL(String str) {
        IIconSlot.SlotViewModel slotViewModel;
        MutableLiveData<Boolean> mutableLiveData;
        if (this.LJLL && (slotViewModel = (IIconSlot.SlotViewModel) this.LJLIL) != null && (mutableLiveData = slotViewModel.LJLIL) != null && o.LJ(mutableLiveData.getValue(), Boolean.TRUE)) {
            this.LJLL = false;
        } else {
            LJIIJJI(null);
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget
    public final void onAggregateExposure(String str) {
        LJIIJJI("business");
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void LLJJJJ(ViewModel viewModel, A72 slotGate) {
        IIconSlot.SlotViewModel viewModel2 = (IIconSlot.SlotViewModel) viewModel;
        o.LJIIIZ(viewModel2, "viewModel");
        o.LJIIIZ(slotGate, "slotGate");
        this.LJLIL = viewModel2;
        this.LJLILLLLZI = slotGate;
        Boolean bool = Boolean.TRUE;
        viewModel2.LLIFFJFJJ = bool;
        viewModel2.LJLJLLL.setValue(C04270Et.LIZIZ(slotGate.getContext(), R.drawable.ct2));
        viewModel2.LJLJL.setValue(C04270Et.LIZIZ(slotGate.getContext(), R.drawable.d9i));
        viewModel2.LJLLI.setValue(C15380j0.LJIILJJIL(R.string.las));
        viewModel2.LJLLILLLL.setValue(C15380j0.LJIILJJIL(R.string.lb6));
        if (this.LJLJL) {
            viewModel2.LLII = 0.5f;
        }
        viewModel2.LJLILLLLZI.setValue(bool);
        if (o.LJ(this.LJLLI, bool)) {
            LJIILJJIL();
        }
        BHT.LIZ().init();
        this.LJLLILLLL = new C30574BzG();
        Application application = (Application) C16880lQ.LLLLL(this.LJLJI);
        if (application != null) {
            application.registerActivityLifecycleCallbacks(this.LJLLILLLL);
        }
    }

    @Override // X.InterfaceC31710CcU
    public final void LLJJLIIIJLLLLLLLZ(java.util.Map<String, Object> params, InterfaceC25704A6y interfaceC25704A6y) {
        o.LJIIIZ(params, "params");
        Object obj = params.get("gamecp_video_live_permissions");
        Object obj2 = null;
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        Boolean bool = Boolean.TRUE;
        this.LJLJJI = o.LJ(obj, bool);
        Object obj3 = params.get("gamecp_last_video_live_added");
        if (obj3 instanceof Boolean) {
            obj2 = obj3;
        }
        this.LJLLI = Boolean.valueOf(o.LJ(obj2, bool));
        if (this.LJLJJI) {
            C30577BzJ.LJ(this.LJLLL);
            DataChannelGlobal.LJLJJI.ov0(PartnershipGameTaskShowCount.class, this, new AqS171S0100000_5(this, 790));
            C65814PsI.LIZ().getClass();
            ((GameLivePartnershipRetrofitApi) C65814PsI.LIZJ(GameLivePartnershipRetrofitApi.class)).requestGetAnchorPartnershipInfo().LJII(new C62705OjF()).LJJJJJ(3L).LJJJJZI(new AfS57S0100000_5(this, 312));
            C30576BzI.LIZIZ = true;
            C31043CGh eD = ((IGamePartnershipService) CN1.LIZ(IGamePartnershipService.class)).eD();
            if (eD != null) {
                eD.LIZIZ();
            }
        }
        interfaceC25704A6y.LIZ(this.LJLJJI);
    }
}
