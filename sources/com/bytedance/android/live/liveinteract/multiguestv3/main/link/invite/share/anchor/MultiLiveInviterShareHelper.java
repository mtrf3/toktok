package com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.share.anchor;

import X.ActivityC45651qj;
import X.BCW;
import X.BCX;
import X.C28787BRn;
import X.C28835BTj;
import X.C29075Bb5;
import X.C29929Bor;
import X.C29930Bos;
import X.C30868C9o;
import X.C30985CEb;
import X.C31037CGb;
import X.C31038CGc;
import X.C31040CGe;
import X.C31657Cbd;
import X.C32014ChO;
import X.C5H3;
import X.C65352Pkq;
import X.C73318Sq2;
import X.C77800Ug8;
import X.C78996UzQ;
import X.C8E;
import X.CGZ;
import X.CN1;
import X.EnumC30736C4m;
import X.InterfaceC06390Mx;
import X.InterfaceC31036CGa;
import X.InterfaceC74236TBo;
import X.InterfaceC74805TXl;
import X.InterfaceC75560Tl6;
import X.TBT;
import X.U44;
import X.X1D;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.live.slot.ISlotService;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AqS144S0200000_13;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

@InterfaceC75560Tl6(name = "DATA_MULTI_LIVE_INVITER_SHARE_HELPER")
/* loaded from: classes6.dex */
public final class MultiLiveInviterShareHelper implements InterfaceC31036CGa {
    public static final C31037CGb LJIIJ;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJIIJJI;
    public final Room LIZ;
    public final ActivityC45651qj LIZIZ;
    public final DataChannel LIZJ;
    public final LiveMode LIZLLL;
    public final boolean LJ;
    public final C73318Sq2 LJFF;
    public final C5H3 LJI;
    public final Set<Long> LJII;
    public final C5H3 LJIIIIZZ;
    public final C31657Cbd LJIIIZ;

    static {
        TBT tbt = new TBT(MultiLiveInviterShareHelper.class, "multiGuestDataHolder", "getMultiGuestDataHolder()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/common/MultiGuestDataHolder;", 0);
        C65352Pkq.LIZ.getClass();
        LJIIJJI = new InterfaceC74236TBo[]{tbt};
        LJIIJ = new C31037CGb();
    }

    public MultiLiveInviterShareHelper(Room room, ActivityC45651qj activityC45651qj, DataChannel dataChannel) {
        this.LIZ = room;
        this.LIZIZ = activityC45651qj;
        this.LIZJ = dataChannel;
        LiveMode liveMode = LiveMode.VIDEO;
        this.LIZLLL = liveMode;
        this.LJ = true;
        this.LJFF = new C73318Sq2();
        this.LJI = C78996UzQ.LJJIJIIJI(CGZ.INSTANCE);
        this.LJII = new LinkedHashSet();
        this.LJIIIIZZ = C78996UzQ.LJJIJIIJI(C30985CEb.LJLIL);
        this.LJIIIZ = new C31657Cbd("MULTI_GUEST_DATA_HOLDER");
        LiveMode liveMode2 = (LiveMode) dataChannel.kv0(BCX.class);
        this.LIZLLL = liveMode2 != null ? liveMode2 : liveMode;
        Boolean bool = (Boolean) dataChannel.kv0(BCW.class);
        this.LJ = bool != null ? bool.booleanValue() : true;
    }

    @Override // X.InterfaceC31036CGa
    public final void LIZ(LinkPlayerInfo playerInfo, int i, boolean z, AqS163S0100000_13 aqS163S0100000_13, AqS144S0200000_13 aqS144S0200000_13) {
        String LIZIZ;
        boolean z2;
        String str;
        int i2;
        AdLiveEnterRoomConfig LJII;
        String str2;
        o.LJIIIZ(playerInfo, "playerInfo");
        User user = playerInfo.mUser;
        long id = user.getId();
        if (((C31040CGe) this.LJIIIIZZ.getValue()).LIZ()) {
            C30868C9o.LIZJ(R.string.mif);
            aqS144S0200000_13.invoke(Long.valueOf(id));
            return;
        }
        if (id <= 0) {
            if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
                StackTraceElement LJ = C32014ChO.LJ();
                StringBuilder LIZ = X1D.LIZ();
                str2 = C77800Ug8.LIZLLL(U44.BIZ, LIZ, "_IMultiLiveInviterShareHelper_", LJ, LIZ);
            } else {
                str2 = "IMultiLiveInviterShareHelper";
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("inviteFriendBySharingMessage return as uid:");
            LIZ2.append(id);
            LIZ2.append(" is smaller than zero");
            C32014ChO.LJIIJ(str2, X1D.LIZIZ(LIZ2));
            aqS144S0200000_13.invoke(Long.valueOf(id));
            return;
        }
        aqS163S0100000_13.invoke();
        ((C31040CGe) this.LJIIIIZZ.getValue()).LIZJ.add(Long.valueOf(System.currentTimeMillis()));
        InterfaceC06390Mx LIZ3 = CN1.LIZ(IHostShare.class);
        o.LJIIIIZZ(LIZ3, "getService(T::class.java)");
        IHostShare iHostShare = (IHostShare) LIZ3;
        ActivityC45651qj activityC45651qj = this.LIZIZ;
        String valueOf = String.valueOf(id);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(C28787BRn.LIZ("").LJIILJJIL());
        Room room = this.LIZ;
        DataChannel dataChannel = this.LIZJ;
        String str3 = "multi_guest_invite";
        if (z) {
            LIZIZ = C29075Bb5.LIZIZ(room.getOwner());
            if (LIZIZ.length() != 0) {
                LIZIZ = a1.LJ(LIZIZ, "&share_live_intent=", "multi_guest_invite");
            }
        } else {
            LIZIZ = C29075Bb5.LIZIZ(room.getOwner());
        }
        C29929Bor LIZLLL = C29075Bb5.LIZLLL(room, dataChannel, LIZIZ, "invitation_tab_friends", linkedHashMap);
        LIZLLL.LJJIL = this.LJ;
        if (!z) {
            str3 = "";
        }
        LIZLLL.LJJJJJ = str3;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        RoomAuthStatus roomAuthStatus = this.LIZ.mRoomAuthStatus;
        if (roomAuthStatus != null && roomAuthStatus.isEnablePromote()) {
            z2 = true;
        } else {
            z2 = false;
        }
        linkedHashMap2.put("param_broadcast_room_auth_promote_bool", Boolean.valueOf(z2));
        InterfaceC06390Mx LIZ4 = CN1.LIZ(ISlotService.class);
        o.LJIIIIZZ(LIZ4, "getService(T::class.java)");
        ((ArrayList) LIZLLL.LJIL).addAll(((ISlotService) LIZ4).getLiveShareSheetAction(linkedHashMap2, EnumC30736C4m.SLOT_BROADCAST_SHARE));
        InterfaceC06390Mx LIZ5 = CN1.LIZ(IShareService.class);
        o.LJIIIIZZ(LIZ5, "getService(T::class.java)");
        ((ArrayList) LIZLLL.LJIL).addAll(((IShareService) LIZ5).Zp0(this.LIZLLL, this.LIZ, this.LIZJ));
        if (C28835BTj.LJII(this.LIZJ) != null && (LJII = C28835BTj.LJII(this.LIZJ)) != null) {
            str = LJII.aid;
        } else {
            str = null;
        }
        LIZLLL.LJJIJIIJI = str;
        LIZLLL.LJJIJL = C28835BTj.LIZLLL(this.LIZJ);
        LIZLLL.LJJIJLIJ = C28835BTj.LJII(this.LIZJ);
        InterfaceC06390Mx LIZ6 = CN1.LIZ(IUserManageService.class);
        o.LJIIIIZZ(LIZ6, "getService(T::class.java)");
        LIZLLL.LJJIJIL = ((IUserManageService) LIZ6).Ab0();
        LIZLLL.LIZ(Boolean.valueOf(this.LJ), "show_cancel");
        InterfaceC74805TXl C4 = C8E.LJ().C4();
        if (C4 != null) {
            i2 = C4.LIZ(4);
        } else {
            i2 = -1;
        }
        LIZLLL.LIZIZ("layout_scene_version", String.valueOf(i2));
        iHostShare.shareSingleMessage(activityC45651qj, valueOf, new C29930Bos(LIZLLL), new C31038CGc(z, this, id, user, playerInfo, i, aqS144S0200000_13));
    }
}
