package Y;

import X.ActivityC45651qj;
import X.B83;
import X.BH7;
import X.BJM;
import X.BJT;
import X.BZI;
import X.C0N7;
import X.C28439BEd;
import X.C28571BJf;
import X.C28787BRn;
import X.C28835BTj;
import X.C28940BXk;
import X.C28949BXt;
import X.C29182Bco;
import X.C29210BdG;
import X.C29212BdI;
import X.C29213BdJ;
import X.C29215BdL;
import X.C29306Beo;
import X.C29364Bfk;
import X.C29374Bfu;
import X.C29666Bkc;
import X.C32044Chs;
import X.C34K;
import X.C38350F3i;
import X.C51029K0z;
import X.C72242sW;
import X.C74838TYs;
import X.C75017TcL;
import X.C78857UxB;
import X.CN1;
import X.EnumC28583BJr;
import X.InterfaceC29405BgP;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.InterfaceC77939UiN;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.rank.impl.list.controller.RankRootController;
import com.bytedance.android.live.rank.impl.setting.PreviewRankingSettingFragment;
import com.bytedance.android.live.rank.impl.setting.PreviewRankingSettingFragmentSheet;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.chatroom.ui.LiveStickerDonationListDialog;
import com.bytedance.android.livesdk.chatroom.ui.LiveStickerDonationListFragmentSheet;
import com.bytedance.android.livesdk.dataChannel.DismissSettingDialogEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.SelectedDonationStickerChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveSdkAppealWebviewSetting;
import com.bytedance.android.livesdk.model.DonationSticker;
import com.bytedance.android.livesdk.model.OrganizationModel;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import defpackage.t1;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class IDCListenerS49S0200000_5 implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onClick$8(IDCListenerS49S0200000_5 iDCListenerS49S0200000_5, DialogInterface dialogInterface, int i) {
        C29666Bkc.LJLILLLLZI((C29666Bkc) iDCListenerS49S0200000_5.l0, (InterfaceC65784Pro) iDCListenerS49S0200000_5.l1, dialogInterface);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$t) {
            case 0:
                onClick$0(this, dialogInterface, i);
                return;
            case 1:
                onClick$1(this, dialogInterface, i);
                return;
            case 2:
                onClick$2(this, dialogInterface, i);
                return;
            case 3:
                onClick$3(this, dialogInterface, i);
                return;
            case 4:
                onClick$4(this, dialogInterface, i);
                return;
            case 5:
                onClick$5(this, dialogInterface, i);
                return;
            case 6:
                onClick$6(this, dialogInterface, i);
                return;
            case 7:
                onClick$7(this, dialogInterface, i);
                return;
            case 8:
                onClick$8(this, dialogInterface, i);
                return;
            case 9:
                onClick$9(this, dialogInterface, i);
                return;
            case 10:
                onClick$10(this, dialogInterface, i);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onClick$11(this, dialogInterface, i);
                return;
            case 12:
                onClick$12(this, dialogInterface, i);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onClick$13(this, dialogInterface, i);
                return;
            case 14:
                onClick$14(this, dialogInterface, i);
                return;
            case 15:
                onClick$15(this, dialogInterface, i);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onClick$16(this, dialogInterface, i);
                return;
            case 17:
                onClick$17(this, dialogInterface, i);
                return;
            case 18:
                onClick$18(this, dialogInterface, i);
                return;
            default:
                return;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public IDCListenerS49S0200000_5(android.content.Context r2, com.bytedance.ies.sdk.datachannel.DataChannel r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 15: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDCListenerS49S0200000_5.<init>(android.content.Context, com.bytedance.ies.sdk.datachannel.DataChannel, int):void");
    }

    public static final void onClick$0(IDCListenerS49S0200000_5 iDCListenerS49S0200000_5, DialogInterface dialogInterface, int i) {
        DataChannel dataChannel;
        Object obj;
        Room room;
        RankRootController rankRootController = (RankRootController) iDCListenerS49S0200000_5.l0;
        RankListV2Response.RankInfo rankInfo = (RankListV2Response.RankInfo) iDCListenerS49S0200000_5.l1;
        rankRootController.getClass();
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        C29364Bfk c29364Bfk = new C29364Bfk();
        c29364Bfk.LIZIZ(rankInfo.user.getId());
        c29364Bfk.LJ(rankInfo.roomId);
        ((C29374Bfu) LIZIZ).LJIIIIZZ(c29364Bfk.LIZJ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.9Cb
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj2) {
            }
        }, new InterfaceC64592gB() { // from class: X.9Cc
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj2) {
            }
        });
        InterfaceC77939UiN interfaceC77939UiN = rankRootController.LJLJJI;
        if (interfaceC77939UiN != null) {
            dataChannel = interfaceC77939UiN.Fe();
        } else {
            dataChannel = null;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_follow");
        LIZ.LJIILLIIL(dataChannel);
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            LIZ.LJIJJ(Integer.valueOf(((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).u4(room.getId())), "server_heat_level");
            LIZ.LJIJJ(Integer.valueOf(((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).F(room.getId())), "client_heat_level");
        }
        LIZ.LIZLLL(C28835BTj.LIZIZ(null, dataChannel, "user_live_follow"));
        if (o.LJ(((IInteractService) CN1.LIZ(IInteractService.class)).getConnectionType(), "manual_pk")) {
            if (((IInteractService) CN1.LIZ(IInteractService.class)).Qe0()) {
                LIZ.LJIJJ("pk_phase", "match_status");
            } else {
                LIZ.LJIJJ("punish", "match_status");
            }
            LIZ.LJJIFFI(((IInteractService) CN1.LIZ(IInteractService.class)).L00());
        }
        ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) CN1.LIZ(ILiveHostCrossRoomEventHelper.class);
        LIZ.LJIJJ(iLiveHostCrossRoomEventHelper.getFromRequestId(), "cohost_from_request_id");
        LIZ.LJIJJ(iLiveHostCrossRoomEventHelper.getFromRoomId(), "cohost_from_room_id");
        String str = "1";
        if (o.LJ(BJM.LJIIIIZZ(), "portal")) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(obj, "is_portal_user");
        LIZ.LJIJJ(Long.valueOf(BJM.LJIIL()), "portal_id");
        LIZ.LJIJJ("live_audience_c_anchor", "request_page");
        LIZ.LJIJJ(((IInteractService) CN1.LIZ(IInteractService.class)).getConnectionType(), "connection_type");
        LIZ.LJIJJ("private_host_follow", "click_user_position");
        LIZ.LJIJJ(Long.valueOf(rankInfo.user.getId()), "to_user_id");
        if (C74838TYs.LJ().LJJ <= 0) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(str, "is_guest_connection");
        LIZ.LJJIIJZLJL();
        dialogInterface.dismiss();
    }

    public static final void onClick$1(IDCListenerS49S0200000_5 iDCListenerS49S0200000_5, DialogInterface dialogInterface, int i) {
        long j;
        dialogInterface.dismiss();
        LiveStickerDonationListDialog liveStickerDonationListDialog = (LiveStickerDonationListDialog) iDCListenerS49S0200000_5.l0;
        OrganizationModel organizationModel = ((C28940BXk) iDCListenerS49S0200000_5.l1).LIZ;
        o.LJIIIIZZ(organizationModel, "selectStickerDonationEvent.organizationModel");
        liveStickerDonationListDialog.getClass();
        DonationSticker donationSticker = new DonationSticker();
        String str = organizationModel.donateLink;
        if (str == null || ujb.o.LJJJJJL(str)) {
            j = 6;
        } else {
            String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(organizationModel.donateLink), "campaignId");
            if (queryParameter == null) {
                queryParameter = "";
            }
            Long LJJIZ = C38350F3i.LJJIZ(queryParameter);
            if (LJJIZ != null) {
                j = LJJIZ.longValue();
            } else {
                j = 0;
            }
        }
        donationSticker.id = j;
        donationSticker.type = 3;
        donationSticker.content = organizationModel;
        liveStickerDonationListDialog.dismissAllowingStateLoss();
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(liveStickerDonationListDialog);
        if (LJIILIIL != null) {
            LJIILIIL.rv0(SelectedDonationStickerChannel.class, donationSticker.LIZ());
        }
        DataChannel LJIILIIL2 = C51029K0z.LJIILIIL(liveStickerDonationListDialog);
        if (LJIILIIL2 != null) {
            LJIILIIL2.pv0(DismissSettingDialogEvent.class);
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_donation_sticker_setting_success");
        LIZ.LJIILLIIL(C51029K0z.LJIILIIL(liveStickerDonationListDialog));
        LIZ.LJIIJJI(liveStickerDonationListDialog.LJLJLLL);
        LIZ.LJIJJ(organizationModel.name, "NGO_name");
        LIZ.LJIJJ(C28949BXt.LIZIZ(), "powered_by");
        LIZ.LJJIIJZLJL();
    }

    public static final void onClick$10(IDCListenerS49S0200000_5 iDCListenerS49S0200000_5, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        ((BJT) iDCListenerS49S0200000_5.l0).LIZ();
        BZI Al = ((PreviewRankingSettingFragment) iDCListenerS49S0200000_5.l1).Al("livesdk_turn_on_ranking_popup_click");
        Al.LJIJJ("turn_on", "button_click_type");
        Al.LJJIIJZLJL();
    }

    public static final void onClick$11(IDCListenerS49S0200000_5 iDCListenerS49S0200000_5, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        ((BJT) iDCListenerS49S0200000_5.l0).onCancel();
        BZI Al = ((PreviewRankingSettingFragment) iDCListenerS49S0200000_5.l1).Al("livesdk_turn_on_ranking_popup_click");
        Al.LJIJJ("cancel", "button_click_type");
        Al.LJJIIJZLJL();
    }

    public static final void onClick$12(IDCListenerS49S0200000_5 iDCListenerS49S0200000_5, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        ((BJT) iDCListenerS49S0200000_5.l0).LIZ();
        BZI Ol = ((PreviewRankingSettingFragmentSheet) iDCListenerS49S0200000_5.l1).Ol("livesdk_turn_on_ranking_popup_click");
        Ol.LJIJJ("turn_on", "button_click_type");
        Ol.LJJIIJZLJL();
    }

    public static final void onClick$13(IDCListenerS49S0200000_5 iDCListenerS49S0200000_5, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        ((BJT) iDCListenerS49S0200000_5.l0).onCancel();
        BZI Ol = ((PreviewRankingSettingFragmentSheet) iDCListenerS49S0200000_5.l1).Ol("livesdk_turn_on_ranking_popup_click");
        Ol.LJIJJ("cancel", "button_click_type");
        Ol.LJJIIJZLJL();
    }

    public static final void onClick$14(IDCListenerS49S0200000_5 iDCListenerS49S0200000_5, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        ((BJT) iDCListenerS49S0200000_5.l0).onCancel();
        ((C28571BJf) iDCListenerS49S0200000_5.l1).getClass();
        BZI LJ = C28571BJf.LJ("livesdk_turn_on_ranking_popup_click");
        LJ.LJIJJ("cancel", "button_click_type");
        LJ.LJJIIJZLJL();
    }

    public static final void onClick$15(IDCListenerS49S0200000_5 iDCListenerS49S0200000_5, DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        dialog.dismiss();
        String value = LiveSdkAppealWebviewSetting.INSTANCE.getValue();
        if (TextUtils.isEmpty(value)) {
            if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isInMusicallyRegion()) {
                value = "sslocal://webcast_webview?url=https%3A%2F%2Fwebcast-va.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
            } else {
                value = "sslocal://webcast_webview?url=https%3A%2F%2Fwebcast.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
            }
        }
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle((Context) iDCListenerS49S0200000_5.l0, value);
        if (B83.LIZ().LIZIZ() != null) {
            HashMap hashMap = new HashMap();
            t1.LJ((C29374Bfu) B83.LIZ().LIZIZ(), hashMap, "user_id");
            BZI LIZ = C28787BRn.LIZ("livesdk_user_click_contact_us");
            LIZ.LJJIFFI(hashMap);
            LIZ.LJIILLIIL((DataChannel) iDCListenerS49S0200000_5.l1);
            LIZ.LJJIIJZLJL();
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("choose_type", "contact_us");
        C75017TcL.LJJI("guest_connection_underage_popup", "click", hashMap2);
    }

    public static final void onClick$16(IDCListenerS49S0200000_5 iDCListenerS49S0200000_5, DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        dialog.dismiss();
        ((C29212BdI) iDCListenerS49S0200000_5.l0).LIZLLL.invoke();
        C29210BdG c29210BdG = (C29210BdG) iDCListenerS49S0200000_5.l1;
        DataChannel dataChannel = ((C29212BdI) iDCListenerS49S0200000_5.l0).LIZIZ;
        c29210BdG.getClass();
        C29210BdG.LIZIZ(dataChannel, "cancel");
    }

    public static final void onClick$17(IDCListenerS49S0200000_5 iDCListenerS49S0200000_5, DialogInterface dialogInterface, int i) {
        C0N7.LJIJJ((DataChannel) iDCListenerS49S0200000_5.l0, "back");
        C0N7.LJIJI((DataChannel) iDCListenerS49S0200000_5.l0, "cancel");
        ActivityC45651qj LIZIZ = C29306Beo.LIZIZ((Context) iDCListenerS49S0200000_5.l1);
        if (LIZIZ != null) {
            LIZIZ.finish();
        }
        C29182Bco.LIZ().LIZLLL();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$18(Y.IDCListenerS49S0200000_5 r11, android.content.DialogInterface r12, int r13) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDCListenerS49S0200000_5.onClick$18(Y.IDCListenerS49S0200000_5, android.content.DialogInterface, int):void");
    }

    public static final void onClick$2(IDCListenerS49S0200000_5 iDCListenerS49S0200000_5, DialogInterface dialogInterface, int i) {
        long j;
        dialogInterface.dismiss();
        LiveStickerDonationListFragmentSheet liveStickerDonationListFragmentSheet = (LiveStickerDonationListFragmentSheet) iDCListenerS49S0200000_5.l0;
        OrganizationModel organizationModel = ((C28940BXk) iDCListenerS49S0200000_5.l1).LIZ;
        o.LJIIIIZZ(organizationModel, "selectStickerDonationEvent.organizationModel");
        liveStickerDonationListFragmentSheet.getClass();
        DonationSticker donationSticker = new DonationSticker();
        String str = organizationModel.donateLink;
        if (str == null || ujb.o.LJJJJJL(str)) {
            j = 6;
        } else {
            String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(organizationModel.donateLink), "campaignId");
            if (queryParameter == null) {
                queryParameter = "";
            }
            Long LJJIZ = C38350F3i.LJJIZ(queryParameter);
            if (LJJIZ != null) {
                j = LJJIZ.longValue();
            } else {
                j = 0;
            }
        }
        donationSticker.id = j;
        donationSticker.type = 3;
        donationSticker.content = organizationModel;
        C32044Chs.LJFF(liveStickerDonationListFragmentSheet.LJLZ.LJIIIIZZ);
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(liveStickerDonationListFragmentSheet);
        if (LJIILIIL != null) {
            LJIILIIL.rv0(SelectedDonationStickerChannel.class, donationSticker.LIZ());
        }
        DataChannel LJIILIIL2 = C51029K0z.LJIILIIL(liveStickerDonationListFragmentSheet);
        if (LJIILIIL2 != null) {
            LJIILIIL2.pv0(DismissSettingDialogEvent.class);
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_donation_sticker_setting_success");
        LIZ.LJIILLIIL(C51029K0z.LJIILIIL(liveStickerDonationListFragmentSheet));
        LIZ.LJIIJJI(liveStickerDonationListFragmentSheet.LLII);
        LIZ.LJIJJ(organizationModel.name, "NGO_name");
        LIZ.LJIJJ(C28949BXt.LIZIZ(), "powered_by");
        LIZ.LJJIIJZLJL();
    }

    public static final void onClick$3(IDCListenerS49S0200000_5 iDCListenerS49S0200000_5, DialogInterface dialogInterface, int i) {
        ((C72242sW) iDCListenerS49S0200000_5.l0).element = EnumC28583BJr.USER_LEVEL_SWITCH_STATUS_ON.getValue();
        ((C34K) iDCListenerS49S0200000_5.l1).element = true;
        dialogInterface.dismiss();
    }

    public static final void onClick$4(IDCListenerS49S0200000_5 iDCListenerS49S0200000_5, DialogInterface dialogInterface, int i) {
        IUserLevelService iUserLevelService = (IUserLevelService) CN1.LIZ(IUserLevelService.class);
        if (iUserLevelService != null) {
            iUserLevelService.bG(EnumC28583BJr.USER_LEVEL_SWITCH_STATUS_OFF.getValue());
        }
        ((C72242sW) iDCListenerS49S0200000_5.l0).element = EnumC28583BJr.USER_LEVEL_SWITCH_STATUS_OFF.getValue();
        ((C34K) iDCListenerS49S0200000_5.l1).element = true;
        dialogInterface.dismiss();
    }

    public static final void onClick$5(IDCListenerS49S0200000_5 iDCListenerS49S0200000_5, DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        ((InterfaceC88472Yns) iDCListenerS49S0200000_5.l0).invoke(C78857UxB.LJJIIJ(1476788483, "bpea-420"));
        BH7.LIZJ((DataChannel) iDCListenerS49S0200000_5.l1, "end_now");
        dialog.dismiss();
    }

    public static final void onClick$6(IDCListenerS49S0200000_5 iDCListenerS49S0200000_5, DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        ((InterfaceC88471Ynr) iDCListenerS49S0200000_5.l0).invoke(Boolean.FALSE, 0);
        BH7.LIZJ((DataChannel) iDCListenerS49S0200000_5.l1, "cancel");
        dialog.dismiss();
    }

    public static final void onClick$7(IDCListenerS49S0200000_5 iDCListenerS49S0200000_5, DialogInterface dialogInterface, int i) {
        String str;
        C28439BEd c28439BEd = (C28439BEd) iDCListenerS49S0200000_5.l0;
        Map map = (Map) iDCListenerS49S0200000_5.l1;
        if ("activity_banned_talk".equals(c28439BEd.LJLL)) {
            str = "livesdk_anchor_mute_cancel_toast_click";
        } else {
            str = "livesdk_anchor_blocklist_cancel_toast_click";
        }
        map.put("action_type", "no");
        BZI LIZ = C28787BRn.LIZ(str);
        LIZ.LJJIFFI(map);
        LIZ.LJJIIJZLJL();
        dialogInterface.dismiss();
    }

    public static final void onClick$9(IDCListenerS49S0200000_5 iDCListenerS49S0200000_5, DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        dialog.dismiss();
        ((C29215BdL) iDCListenerS49S0200000_5.l0).LIZLLL.invoke();
        C29213BdJ c29213BdJ = (C29213BdJ) iDCListenerS49S0200000_5.l1;
        DataChannel dataChannel = ((C29215BdL) iDCListenerS49S0200000_5.l0).LIZIZ;
        c29213BdJ.getClass();
        C29213BdJ.LIZIZ(dataChannel, "cancel");
    }

    public IDCListenerS49S0200000_5(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
