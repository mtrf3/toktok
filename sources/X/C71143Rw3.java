package X;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.services.BaseUserService;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* renamed from: X.Rw3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71143Rw3 extends AbstractC32179Ck3 implements InterfaceC71121Rvh {
    public final C48502J1u LJLJJLL;
    public final C71113RvZ LJLJL;
    public final C31727Ccl LJLJLJ;
    public Room LJLJLLL;
    public String LJLL;
    public String LJLLI;
    public String LJLLILLLL;

    @Override // X.InterfaceC31710CcU
    public final String LIZ() {
        return "ec_coupon";
    }

    @Override // X.AbstractC32179Ck3, com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onDestroy() {
        String idStr;
        C71113RvZ c71113RvZ = this.LJLJL;
        c71113RvZ.LIZ = null;
        c71113RvZ.LJI.LJLJJL = null;
        EventBus.LIZJ().LJIJ(c71113RvZ);
        XKQ xkq = c71113RvZ.LJIIIIZZ;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        c71113RvZ.LJIIIIZZ = null;
        XKQ xkq2 = c71113RvZ.LJIIJ;
        if (xkq2 != null) {
            xkq2.LIZIZ(null);
        }
        c71113RvZ.LJIIJ = null;
        C71120Rvg c71120Rvg = c71113RvZ.LJII;
        c71120Rvg.LJLILLLLZI = null;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PopCardShowTask destroy , popCardState = ");
        LIZ.append(c71120Rvg.LJLJJLL);
        LIZ.append(" , popcardType = ");
        LIZ.append(1);
        C36746EbW.LIZ(4, X1D.LIZIZ(LIZ));
        if (4 == c71120Rvg.LJLJJLL) {
            C36746EbW.LIZ(6, "destroy, but destroyed");
        } else {
            c71120Rvg.LJLJJLL = 4;
            XKQ xkq3 = c71120Rvg.LJLJI;
            if (xkq3 != null) {
                xkq3.LIZIZ(null);
            }
            c71120Rvg.LJLJI = null;
        }
        C71144Rw4.LIZIZ(c71113RvZ);
        Room room = this.LJLJLLL;
        if (room != null && (idStr = room.getIdStr()) != null) {
            C53799L9n.LIZJ(idStr, "SLOT_LIVE_COUPON_CARD");
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onPause() {
        this.LJLJL.LIZLLL = false;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onResume() {
        C71113RvZ c71113RvZ = this.LJLJL;
        c71113RvZ.LIZLLL = true;
        if (c71113RvZ.LJIILJJIL) {
            C36746EbW.LIZ(5, "resume gone card");
            c71113RvZ.LJ(false);
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onStart() {
        this.LJLJL.getClass();
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onStop() {
        this.LJLJL.getClass();
    }

    @Override // X.InterfaceC31710CcU
    public final /* bridge */ /* synthetic */ Object LLJJJIL() {
        return this.LJLJLJ;
    }

    @Override // X.InterfaceC31710CcU
    public final Enum LLJJJJLIIL() {
        return EnumC31730Cco.SLOT_LIVE_BOTTOM_POP_L2_AUDIENCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71143Rw3(Context context) {
        super(true);
        o.LJIIIZ(context, "context");
        C48502J1u c48502J1u = new C48502J1u("ECLiveCouponCardWidget");
        this.LJLJJLL = c48502J1u;
        C71113RvZ c71113RvZ = new C71113RvZ(context, this, c48502J1u);
        this.LJLJL = c71113RvZ;
        C31727Ccl c31727Ccl = new C31727Ccl();
        this.LJLJLJ = c31727Ccl;
        C71118Rve couponCardSlot = c71113RvZ.LJI;
        o.LJIIIZ(couponCardSlot, "couponCardSlot");
        c31727Ccl.LJLIL = couponCardSlot;
    }

    @Override // X.InterfaceC71121Rvh
    public final boolean LIZLLL(boolean z) {
        boolean z2;
        int i;
        IFrameSlot.SlotViewModel slotViewModel;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData;
        Pair<Boolean, String> value;
        InterfaceC71145Rw5 interfaceC71145Rw5 = this.LJLJJI;
        if (interfaceC71145Rw5 != null) {
            z2 = interfaceC71145Rw5.LIZJ(this, z);
        } else {
            z2 = false;
        }
        Room room = this.LJLJLLL;
        if (room != null) {
            String valueOf = String.valueOf(room.getId());
            ViewModel viewModel = this.LJLIL;
            if ((viewModel instanceof IFrameSlot.SlotViewModel) && (slotViewModel = (IFrameSlot.SlotViewModel) viewModel) != null && (mutableLiveData = slotViewModel.LJLIL) != null && (value = mutableLiveData.getValue()) != null && o.LJ(value.first, Boolean.TRUE)) {
                i = 2;
            } else {
                i = 3;
            }
            C53799L9n.LIZLLL(i, valueOf, "SLOT_LIVE_COUPON_CARD");
        }
        return z2;
    }

    @Override // X.AbstractC32179Ck3
    public final boolean LJIIIZ(java.util.Map<String, Object> params) {
        Room room;
        String str;
        String str2;
        String str3;
        String str4;
        Room room2;
        boolean z;
        String str5;
        CommerceStruct commerceStruct;
        o.LJIIIZ(params, "params");
        Object obj = params.get("param_room");
        String str6 = null;
        if (obj instanceof Room) {
            room = (Room) obj;
        } else {
            room = null;
        }
        this.LJLJLLL = room;
        Object obj2 = params.get("param_live_enter_from_merge");
        if (obj2 instanceof String) {
            str = (String) obj2;
        } else {
            str = null;
        }
        this.LJLL = str;
        Object obj3 = params.get("param_live_enter_method_merge");
        if (obj3 instanceof String) {
            str2 = (String) obj3;
        } else {
            str2 = null;
        }
        this.LJLLI = str2;
        Object obj4 = params.get("param_live_action_type");
        if (obj4 instanceof String) {
            str3 = (String) obj4;
        } else {
            str3 = null;
        }
        this.LJLLILLLL = str3;
        Room room3 = this.LJLJLLL;
        if (room3 != null) {
            str4 = C17280m4.LIZ(room3);
        } else {
            str4 = null;
        }
        if (str4 == null || ujb.o.LJJJJJL(str4)) {
            return false;
        }
        C71113RvZ c71113RvZ = this.LJLJL;
        c71113RvZ.getClass();
        Object obj5 = params.get("param_room");
        if (obj5 instanceof Room) {
            room2 = (Room) obj5;
        } else {
            room2 = null;
        }
        c71113RvZ.LIZIZ = room2;
        if (room2 != null && (commerceStruct = room2.getCommerceStruct()) != null && commerceStruct.commercePermission == 1) {
            z = true;
        } else {
            z = false;
        }
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin == null || (str5 = createIUserServicebyMonsterPlugin.getCurrentUserID()) == null) {
            str5 = "";
        }
        Room room4 = c71113RvZ.LIZIZ;
        if (room4 != null) {
            str6 = Long.valueOf(room4.getOwnerUserId()).toString();
        }
        boolean LJ = o.LJ(str5, str6);
        if (z && !LJ) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onCreate(Bundle bundle) {
        this.LJLJL.getClass();
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void LLJJJJ(ViewModel viewModel, A72 slotGate) {
        String str;
        Long l;
        Long l2;
        Long l3;
        User owner;
        FollowInfo followInfo;
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(slotGate, "slotGate");
        this.LJLIL = viewModel;
        this.LJLILLLLZI = slotGate;
        Room room = this.LJLJLLL;
        if (room == null || (owner = room.getOwner()) == null || (followInfo = owner.getFollowInfo()) == null || (str = Q4K.LIZJ(followInfo)) == null) {
            str = "-1";
        }
        C48502J1u c48502J1u = this.LJLJJLL;
        Room room2 = this.LJLJLLL;
        if (room2 != null) {
            l = Long.valueOf(room2.getOwnerUserId());
        } else {
            l = null;
        }
        c48502J1u.LJII("author_id", String.valueOf(l), false);
        c48502J1u.LJII("EVENT_ORIGIN_FEATURE", "TEMAI", false);
        Room room3 = this.LJLJLLL;
        if (room3 != null) {
            l2 = Long.valueOf(room3.getId());
        } else {
            l2 = null;
        }
        c48502J1u.LJII("room_id", String.valueOf(l2), false);
        String str2 = this.LJLL;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        c48502J1u.LJII("enter_from_merge", str2, false);
        String str4 = this.LJLLI;
        if (str4 == null) {
            str4 = "";
        }
        c48502J1u.LJII("enter_method", str4, false);
        String str5 = this.LJLLILLLL;
        if (str5 != null) {
            str3 = str5;
        }
        c48502J1u.LJII("action_type", str3, false);
        c48502J1u.LJII("page_type", "live", false);
        c48502J1u.LJII("follow_status", str, false);
        c48502J1u.LJII("page_name", "live", false);
        C71113RvZ c71113RvZ = this.LJLJL;
        c71113RvZ.getClass();
        C71120Rvg c71120Rvg = c71113RvZ.LJII;
        C71115Rvb showStateChangeListener = c71113RvZ.LJIILLIIL;
        c71120Rvg.getClass();
        o.LJIIIZ(showStateChangeListener, "showStateChangeListener");
        c71120Rvg.LJLILLLLZI = showStateChangeListener;
        Room room4 = c71113RvZ.LIZIZ;
        if (room4 != null) {
            l3 = Long.valueOf(room4.getId());
        } else {
            l3 = null;
        }
        String valueOf = String.valueOf(l3);
        StringBuilder LIZIZ = C25620zW.LIZIZ("registerShowCallback start roomId = ", valueOf, " , currentRoomId = ");
        CK3.LIZIZ(LIZIZ, C71144Rw4.LJFF, LIZIZ, 4);
        if (o.LJ(valueOf, C71144Rw4.LJFF)) {
            if (C71144Rw4.LIZJ) {
                C71144Rw4.LIZIZ = c71113RvZ;
                return;
            }
            InterfaceC71142Rw2 interfaceC71142Rw2 = C71144Rw4.LIZIZ;
            if (interfaceC71142Rw2 == null) {
                return;
            }
            interfaceC71142Rw2.LIZ(C71144Rw4.LIZ, C71144Rw4.LIZLLL, C71144Rw4.LJ);
            return;
        }
        InterfaceC71142Rw2 interfaceC71142Rw22 = C71144Rw4.LIZIZ;
        if (interfaceC71142Rw22 == null) {
            return;
        }
        interfaceC71142Rw22.LIZ(null, false, 0L);
    }
}
