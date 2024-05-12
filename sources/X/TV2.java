package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.room.MultiLiveUIChangeEvent;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TV2 {
    public static final /* synthetic */ int LIZ = 0;

    public static final MultiLiveAnchorPanelSettings LJI() {
        TVD LIZ2 = TTV.LIZ();
        if (LIZ2 != null) {
            return LIZ2.LJIIJ;
        }
        return null;
    }

    public static LinkPlayerInfo LJ() {
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room == null) {
            return null;
        }
        LinkPlayerInfo linkPlayerInfo = new LinkPlayerInfo();
        linkPlayerInfo.LIZIZ = 0;
        User owner = room.getOwner();
        if (owner == null) {
            return null;
        }
        linkPlayerInfo.mUser = owner;
        return linkPlayerInfo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0016, code lost:
    
        if (r3 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LJFF() {
        /*
            com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings r3 = LJI()
            r2 = 3
            if (r3 == 0) goto L30
            int r0 = r3.allowViewerReq
            if (r0 != r2) goto L2e
            r0 = 1
        Lc:
            r1 = 4
            if (r0 == 0) goto L16
            int r0 = r3.onlyAllowFollowerReq
            if (r0 != r1) goto L18
            java.lang.String r0 = "all_viewers"
        L15:
            return r0
        L16:
            if (r3 == 0) goto L30
        L18:
            int r0 = r3.allowViewerReq
            if (r0 != r2) goto L23
            int r0 = r3.onlyAllowFollowerReq
            if (r0 != r2) goto L23
            java.lang.String r0 = "only_followers"
            goto L15
        L23:
            int r0 = r3.allowViewerReq
            if (r0 != r1) goto L30
            int r0 = r3.onlyAllowFollowerReq
            if (r0 != r1) goto L30
            java.lang.String r0 = "none"
            goto L15
        L2e:
            r0 = 0
            goto Lc
        L30:
            java.lang.String r0 = "error"
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TV2.LJFF():java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean LJIIJJI() {
        Integer num;
        Integer num2;
        if (!C74838TYs.LJ().LJIIIZ && (((num = (Integer) C74740TUy.LIZLLL().LIZIZ) == null || num.intValue() != 2) && ((num2 = (Integer) C74740TUy.LIZLLL().LIZIZ) == null || num2.intValue() != 1))) {
            return true;
        }
        return false;
    }

    public static LinkPlayerInfo LIZ(LinkListUser linkListUser) {
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

    public static LinkListUser LIZIZ(LinkPlayerInfo linkPlayerInfo) {
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

    public static final void LIZLLL(DataChannel dataChannel) {
        Room room;
        if (!LiveAppBundleUtils.isPluginAvailable(EnumC38440F6u.LINK_MIC)) {
            C0NB.LJIIIZ("GameLinkUtil", "LINK_MIC is not available");
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("button = ");
        EnumC30204BtI enumC30204BtI = EnumC30204BtI.MULTIGUEST;
        LIZ2.append(enumC30204BtI);
        TYP.LIZJ("GameLinkUtil", X1D.LIZIZ(LIZ2));
        InterfaceC30205BtJ pk = ((IToolbarService) CN1.LIZ(IToolbarService.class)).pk(dataChannel);
        if (!TSR.LJII) {
            if (pk != null) {
                if (pk.LJIIL(dataChannel, enumC30204BtI) != null && (!C29306Beo.LJJIIJ(r0)) && dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
                    long followStatus = room.getOwner().getFollowInfo().getFollowStatus();
                    if (!C74838TYs.LJ().LJJIJ) {
                        HashMap hashMap = new HashMap();
                        TWL.LIZ(hashMap);
                        hashMap.put("request_page", "connection_button");
                        hashMap.put("anchor_relationship", String.valueOf(followStatus));
                        TWL.LJIL("livesdk_guest_connection_icon_show", hashMap);
                    }
                }
                pk.LJIIJJI(enumC30204BtI, dataChannel, false);
                pk.LJIILLIIL(dataChannel, enumC30204BtI);
            }
            if (dataChannel != null) {
                dataChannel.qv0(MultiLiveUIChangeEvent.class, 2);
            }
        }
    }

    public static final void LJIIIIZZ(DataChannel dataChannel) {
        InterfaceC30205BtJ pk = ((IToolbarService) CN1.LIZ(IToolbarService.class)).pk(dataChannel);
        if (pk != null) {
            pk.LIZ(EnumC30204BtI.MULTIGUEST, dataChannel, false);
        }
        if (dataChannel != null) {
            dataChannel.qv0(MultiLiveUIChangeEvent.class, 3);
        }
    }

    public static boolean LJIIIZ(User user) {
        User user2;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            user2 = room.getOwner();
        } else {
            user2 = null;
        }
        if (user2 == null || user2.getId() != user.getId() || user.getId() == 0) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIJ(Room room) {
        if (room == null) {
            return false;
        }
        if (((int) room.getOwner().getFollowInfo().getFollowStatus()) != 1 && ((int) room.getOwner().getFollowInfo().getFollowStatus()) != 2) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIL(MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings) {
        if (multiLiveAnchorPanelSettings != null && multiLiveAnchorPanelSettings.onlyAllowFollowerReq == 3 && multiLiveAnchorPanelSettings.allowViewerReq == 3) {
            return true;
        }
        return false;
    }

    public static final boolean LJIILIIL(MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings) {
        if (multiLiveAnchorPanelSettings != null && multiLiveAnchorPanelSettings.allowViewerReq == 3) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x000d, code lost:
    
        if (r0 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZJ(com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser r1, X.TVD r2) {
        /*
            java.lang.String r0 = "dataHolder"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            if (r1 == 0) goto Lb
            java.lang.String r1 = r1.linkMicId
            if (r1 != 0) goto L24
        Lb:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        Ld:
            if (r0 == 0) goto L22
        Lf:
            boolean r1 = r0.booleanValue()
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r0.intValue()
            if (r1 == 0) goto L22
            int r0 = r0.intValue()
        L21:
            return r0
        L22:
            r0 = 1
            goto L21
        L24:
            X.Ol8 r0 = r2.LJIIL
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 != 0) goto Lf
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TV2.LIZJ(com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser, X.TVD):int");
    }

    public static final void LJII(Room room, DataChannel dataChannel, boolean z) {
        if (room == null) {
            return;
        }
        MultiLiveAnchorPanelSettings LJI = LJI();
        if (LJIILIIL(LJI)) {
            if (LJIIL(LJI)) {
                LIZLLL(dataChannel);
            }
        } else if (z) {
            LIZLLL(dataChannel);
        } else {
            LJIIIIZZ(dataChannel);
        }
    }
}
