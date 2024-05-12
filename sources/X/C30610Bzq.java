package X;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.slot.AbsSlotWidget;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.model.message.PartnershipGameOfflineMessage;
import com.bytedance.android.livesdk.model.message.PartnershipPunishMessage;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS136S0200000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.Bzq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30610Bzq extends AbsSlotWidget<IIconSlot, IIconSlot.SlotViewModel, EnumC30736C4m> implements InterfaceC31748Cd6 {
    public final Context LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public Room LJLJJLL;
    public C30574BzG LJLJL;
    public final C30609Bzp LJLJLJ;

    @Override // X.InterfaceC31710CcU
    public final String LIZ() {
        return "game_partnership";
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final List<EnumC29188Bcu> LLJJJ() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final List<Integer> getMessageType() {
        return C47261Igj.LJJIJIL(Integer.valueOf(EnumC31509CYf.PARTNERSHIP_GAME_OFFLINE_MESSAGE.getIntType()), Integer.valueOf(EnumC31509CYf.PARTNERSHIP_PUNISH_MESSAGE.getIntType()));
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onCreate(Bundle bundle) {
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onDestroy() {
        C30577BzJ.LJFF(this.LJLJLJ);
        Application application = (Application) C16880lQ.LLLLL(this.LJLJI);
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this.LJLJL);
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onDispose() {
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public void onEvent(Boolean bool) {
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

    @Override // X.InterfaceC31710CcU
    public final Object LLJJJIL() {
        return new C05(new C30595Bzb(this));
    }

    @Override // X.InterfaceC31710CcU
    public final Enum LLJJJJLIIL() {
        return EnumC30736C4m.SLOT_BROADCAST_PREVIEW_TOOLBAR;
    }

    public C30610Bzq(Context context) {
        o.LJIIIZ(context, "context");
        this.LJLJI = context;
        this.LJLJJI = true;
        this.LJLJLJ = new C30609Bzp(this);
    }

    @Override // X.InterfaceC31748Cd6
    public final Object LJII(InterfaceC67352kd interfaceC67352kd) {
        return Boolean.TRUE;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void LLJJL(String str) {
        if (!this.LJLJJI) {
            return;
        }
        BZI LIZIZ = C0JU.LIZIZ("livesdk_gamepad_btn_show", "video_live", "live_type", "icon", "btn_name");
        LIZIZ.LJIJJ("host", "user_type");
        LIZIZ.LJIJJ("live_detail", "page_name");
        LIZIZ.LJIJJ(CardStruct.IStatusCode.DEFAULT, "is_grey");
        LIZIZ.LJIJJ(String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "user_id");
        LIZIZ.LJJIIJZLJL();
        this.LJLJJI = false;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onMessage(IMessage iMessage) {
        PunishEventInfo punishEventInfo;
        Integer num;
        MutableLiveData<Boolean> mutableLiveData;
        IIconSlot.SlotViewModel slotViewModel;
        MutableLiveData<Boolean> mutableLiveData2;
        if (iMessage == null) {
            return;
        }
        if (iMessage instanceof PartnershipGameOfflineMessage) {
            List<PartnershipGameOfflineMessage.OfflineGameInfo> list = ((PartnershipGameOfflineMessage) iMessage).offlineGameList;
            o.LJIIIIZZ(list, "message.offlineGameList");
            if (!list.isEmpty()) {
                if (((PartnershipGameOfflineMessage.OfflineGameInfo) ListProtector.get(list, 0)).taskListLen <= 0 && (slotViewModel = (IIconSlot.SlotViewModel) this.LJLIL) != null && (mutableLiveData2 = slotViewModel.LJLILLLLZI) != null) {
                    mutableLiveData2.postValue(Boolean.FALSE);
                }
                C30868C9o.LJI(((PartnershipGameOfflineMessage.OfflineGameInfo) ListProtector.get(list, 0)).toastText);
                C72818Shy.LIZ(new C76052yf(System.currentTimeMillis(), null, "gamePartnershipPunished"));
                return;
            }
            return;
        }
        if (!(iMessage instanceof PartnershipPunishMessage) || (punishEventInfo = ((PartnershipPunishMessage) iMessage).punishInfo) == null || punishEventInfo.punishTypeId == null || (num = punishEventInfo.punishTypeId) == null) {
            return;
        }
        int intValue = num.intValue();
        if (intValue != 25 && intValue != 26) {
            return;
        }
        IIconSlot.SlotViewModel slotViewModel2 = (IIconSlot.SlotViewModel) this.LJLIL;
        if (slotViewModel2 != null && (mutableLiveData = slotViewModel2.LJLILLLLZI) != null) {
            mutableLiveData.postValue(Boolean.FALSE);
        }
        C72818Shy.LIZ(new C76052yf(System.currentTimeMillis(), null, "gamePartnershipPunished"));
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void LLJJJJ(ViewModel viewModel, A72 slotGate) {
        IIconSlot.SlotViewModel slotViewModel;
        IIconSlot.SlotViewModel viewModel2 = (IIconSlot.SlotViewModel) viewModel;
        o.LJIIIZ(viewModel2, "viewModel");
        o.LJIIIZ(slotGate, "slotGate");
        this.LJLIL = viewModel2;
        this.LJLILLLLZI = slotGate;
        Boolean bool = Boolean.TRUE;
        viewModel2.LLIFFJFJJ = bool;
        viewModel2.LJLJLLL.setValue(C04270Et.LIZIZ(slotGate.getContext(), R.drawable.ct2));
        viewModel2.LJLJL.setValue(C04270Et.LIZIZ(slotGate.getContext(), R.drawable.cv9));
        viewModel2.LJLLI.setValue(C15380j0.LJIILJJIL(R.string.lh6));
        viewModel2.LJLLILLLL.setValue(C15380j0.LJIILJJIL(R.string.lb6));
        viewModel2.LJLILLLLZI.setValue(bool);
        Room room = this.LJLJJLL;
        if (room == null || !C78897Uxp.LJJIJLIJ(room)) {
            viewModel2.LLII = 0.5f;
        }
        Room room2 = this.LJLJJLL;
        if (room2 != null && C78897Uxp.LJJIJLIJ(room2) && (slotViewModel = (IIconSlot.SlotViewModel) this.LJLIL) != null) {
            slotViewModel.LLFFF = 1;
        }
        this.LJLJL = new C30574BzG();
        Application application = (Application) C16880lQ.LLLLL(this.LJLJI);
        if (application != null) {
            application.registerActivityLifecycleCallbacks(this.LJLJL);
        }
    }

    @Override // X.InterfaceC31710CcU
    public final void LLJJLIIIJLLLLLLLZ(java.util.Map<String, Object> params, InterfaceC25704A6y interfaceC25704A6y) {
        Room room;
        o.LJIIIZ(params, "params");
        Object obj = params.get("param_room");
        Object obj2 = null;
        if (obj instanceof Room) {
            room = (Room) obj;
        } else {
            room = null;
        }
        Object obj3 = params.get("param_enter_from_effect_ad_bool");
        if (obj3 instanceof Boolean) {
            obj2 = obj3;
        }
        this.LJLJJL = o.LJ(obj2, Boolean.TRUE);
        this.LJLJJLL = room;
        if (C29137Bc5.LJFF(room) && C78897Uxp.LJJIJLIJ(room)) {
            if (room != null) {
                ((IGamePartnershipService) CN1.LIZ(IGamePartnershipService.class)).nh(room.getId(), new AqS136S0200000_5(this, interfaceC25704A6y, 50));
                return;
            }
            return;
        }
        interfaceC25704A6y.LIZ(false);
    }
}
