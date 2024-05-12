package X;

import Y.IDLListenerS63S0200000_13;
import Y.IDObjectS0S0101000;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicSafePostOptimizeSetting;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TV3 {
    public static final boolean LIZJ() {
        User user;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            user = room.getOwner();
        } else {
            user = null;
        }
        if (user == null || C025908h.LIZ() != user.getId()) {
            return false;
        }
        return true;
    }

    public static final User LJ() {
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            return room.getOwner();
        }
        return null;
    }

    public static final boolean LJIIJ() {
        return C29137Bc5.LIZIZ((Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class));
    }

    public static final int LIZLLL() {
        U8H LJJZZI;
        C76696U8e LJJIII;
        List<InterfaceC75179Tex> allLayoutWindows;
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LJJZZI = R6.LJJZZI()) != null && (LJJIII = LJJZZI.LJJIII()) != null && (allLayoutWindows = LJJIII.getAllLayoutWindows()) != null) {
            return allLayoutWindows.size();
        }
        return 1;
    }

    public static final LinkPlayerInfo LIZ(LinkListUser linkListUser) {
        o.LJIIIZ(linkListUser, "<this>");
        LinkPlayerInfo linkPlayerInfo = new LinkPlayerInfo();
        linkPlayerInfo.mFanTicket = linkListUser.fanTicket;
        linkPlayerInfo.mUser = linkListUser.user;
        linkPlayerInfo.mModifyTime = linkListUser.modifyTime;
        linkPlayerInfo.mLinkType = linkListUser.linkType;
        linkPlayerInfo.mRoleType = linkListUser.roleType;
        linkPlayerInfo.paidMoney = (int) linkListUser.payedMoney;
        linkPlayerInfo.mInteractIdStr = linkListUser.linkMicId;
        linkPlayerInfo.mFanTicketType = linkListUser.fanTicketType;
        linkPlayerInfo.LIZ = linkListUser.LIZ;
        linkPlayerInfo.linkTypePermission = -1L;
        return linkPlayerInfo;
    }

    public static final LinkListUser LIZIZ(LinkPlayerInfo linkPlayerInfo) {
        o.LJIIIZ(linkPlayerInfo, "<this>");
        LinkListUser linkListUser = new LinkListUser();
        linkListUser.fanTicket = linkPlayerInfo.mFanTicket;
        linkListUser.user = linkPlayerInfo.mUser;
        linkListUser.modifyTime = linkPlayerInfo.mModifyTime;
        linkListUser.linkType = linkPlayerInfo.mLinkType;
        linkListUser.roleType = linkPlayerInfo.mRoleType;
        linkListUser.payedMoney = linkPlayerInfo.paidMoney;
        String str = linkPlayerInfo.mInteractIdStr;
        o.LJIIIIZZ(str, "this@adapt.mInteractIdStr");
        linkListUser.linkMicId = str;
        linkListUser.fanTicketType = linkPlayerInfo.mFanTicketType;
        linkListUser.LIZ = linkPlayerInfo.LIZ;
        return linkListUser;
    }

    public static final boolean LJFF(User user) {
        o.LJIIIZ(user, "<this>");
        return C74947TbD.LJIIZILJ(Long.valueOf(user.getId()));
    }

    public static final boolean LJI(User user) {
        o.LJIIIZ(user, "<this>");
        if (C74947TbD.LJIILLIIL(user) || LJIIIZ(user)) {
            return false;
        }
        return true;
    }

    public static final boolean LJII(User user) {
        o.LJIIIZ(user, "<this>");
        if (!C74947TbD.LJIIZILJ(Long.valueOf(user.getId())) && ((IInteractService) CN1.LIZ(IInteractService.class)).QD().contains(Long.valueOf(user.getId()))) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIIIZZ(User user) {
        o.LJIIIZ(user, "<this>");
        if (C74947TbD.LJIILLIIL(user)) {
            return false;
        }
        return LJIIIZ(user);
    }

    public static final boolean LJIIIZ(User user) {
        AbstractC74727TUl LIZ;
        List LJJI;
        AbstractC74727TUl LIZ2;
        List LJJI2;
        o.LJIIIZ(user, "<this>");
        boolean z = true;
        if (LIZJ()) {
            InterfaceC31805Ce1 interfaceC31805Ce1 = (InterfaceC31805Ce1) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
            if (interfaceC31805Ce1 == null || (LIZ2 = interfaceC31805Ce1.LIZ()) == null || (LJJI2 = LIZ2.LJJI()) == null) {
                return false;
            }
            if (!LJJI2.isEmpty()) {
                Iterator it = LJJI2.iterator();
                while (it.hasNext()) {
                    User user2 = ((LinkPlayerInfo) it.next()).mUser;
                    if (user2 != null && user2.getId() == user.getId()) {
                        break;
                    }
                }
            }
            z = false;
            return z;
        }
        TQ8 tq8 = (TQ8) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        if (tq8 == null || (LIZ = tq8.LIZ()) == null || (LJJI = LIZ.LJJI()) == null) {
            return false;
        }
        if (!LJJI.isEmpty()) {
            Iterator it2 = LJJI.iterator();
            while (it2.hasNext()) {
                User user3 = ((LinkListUser) it2.next()).user;
                if (user3 != null && user3.getId() == user.getId()) {
                    break;
                }
            }
        }
        z = false;
        return z;
    }

    public static final void LJIIJJI(View view) {
        ViewGroup viewGroup;
        o.LJIIIZ(view, "<this>");
        ViewParent parent = view.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C16880lQ.LJLLL(view, viewGroup);
        }
    }

    public static final void LJIILJJIL(LiveDialogFragment liveDialogFragment) {
        if (liveDialogFragment != null && liveDialogFragment.isShowing()) {
            liveDialogFragment.dismiss();
        }
    }

    public static final void LJIIL(ViewGroup viewGroup, InterfaceC88472Yns<? super View, Boolean> interfaceC88472Yns) {
        o.LJIIIZ(viewGroup, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<View> it = C78924UyG.LIZLLL(viewGroup).iterator();
        while (true) {
            IDObjectS0S0101000 iDObjectS0S0101000 = (IDObjectS0S0101000) it;
            if (!iDObjectS0S0101000.hasNext()) {
                break;
            }
            Object next = iDObjectS0S0101000.next();
            Boolean invoke = interfaceC88472Yns.invoke(next);
            if (!invoke.booleanValue()) {
                invoke = null;
            }
            Boolean bool = invoke;
            if (bool != null) {
                bool.booleanValue();
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C29306Beo.LJJIJIIJIL((View) it2.next());
        }
    }

    public static final void LJIILL(View view, Runnable runnable) {
        o.LJIIIZ(view, "<this>");
        view.getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS63S0200000_13(view, runnable, 1));
        if (LivesdkLinkmicSafePostOptimizeSetting.INSTANCE.getValue()) {
            view.requestLayout();
        }
    }

    public static final void LJIILIIL(int i, View view, ViewGroup parent) {
        o.LJIIIZ(view, "<this>");
        o.LJIIIZ(parent, "parent");
        if (view.getParent() == null) {
            parent.addView(view, i);
        }
        if (o.LJ(view.getParent(), parent)) {
            return;
        }
        C29306Beo.LJJIJIIJIL(view);
        parent.addView(view, i);
    }
}
