package Y;

import X.B5H;
import X.B83;
import X.BCE;
import X.BCN;
import X.BJ9;
import X.BKY;
import X.BPP;
import X.BZI;
import X.C0N7;
import X.C0NB;
import X.C10K;
import X.C1A;
import X.C1EW;
import X.C279117r;
import X.C28245B6r;
import X.C28455BEt;
import X.C28461BEz;
import X.C28720BOy;
import X.C28787BRn;
import X.C28871BUt;
import X.C29155BcN;
import X.C29162BcU;
import X.C29182Bco;
import X.C29374Bfu;
import X.C30882CAc;
import X.C31268COy;
import X.C32537Cpp;
import X.C38354F3m;
import X.C44878HjO;
import X.C45;
import X.C68322mC;
import X.C73943T0h;
import X.C78688UuS;
import X.C78857UxB;
import X.C79004UzY;
import X.C7N;
import X.CKO;
import X.CLB;
import X.CN1;
import X.DialogC28454BEs;
import X.InterfaceC30442Bx8;
import X.InterfaceC65784Pro;
import X.UFE;
import X.ViewOnClickListenerC28501BGn;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.adminsetting.RoomSwitchApi;
import com.bytedance.android.livesdk.broadcast.LiveCoverControllerChannel;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheet;
import com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment;
import com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastFragment;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget;
import com.bytedance.android.livesdk.dataChannel.PreviewStartLiveContinueMsgChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamEnableUrlListSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.GpppaGiftBanContractUsUrlSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveSdkAppealWebviewSetting;
import com.bytedance.android.livesdk.qa.TurnQuestionDialog;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class IDCListenerS159S0100000_5 implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l0;

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
            case 19:
                onClick$19(this, dialogInterface, i);
                return;
            case 20:
                onClick$20(this, dialogInterface, i);
                return;
            case 21:
                onClick$21(this, dialogInterface, i);
                return;
            case 22:
                onClick$22(this, dialogInterface, i);
                return;
            case 23:
                onClick$23(this, dialogInterface, i);
                return;
            case 24:
                onClick$24(this, dialogInterface, i);
                return;
            case 25:
                onClick$25(this, dialogInterface, i);
                return;
            case 26:
                onClick$26(this, dialogInterface, i);
                return;
            case 27:
                onClick$27(this, dialogInterface, i);
                return;
            case 28:
                onClick$28(this, dialogInterface, i);
                return;
            case 29:
                onClick$29(this, dialogInterface, i);
                return;
            case 30:
                onClick$30(this, dialogInterface, i);
                return;
            case 31:
                onClick$31(this, dialogInterface, i);
                return;
            case 32:
                onClick$32(this, dialogInterface, i);
                return;
            default:
                return;
        }
    }

    public IDCListenerS159S0100000_5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(IDCListenerS159S0100000_5 iDCListenerS159S0100000_5, DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        dialog.dismiss();
        String value = LiveSdkAppealWebviewSetting.INSTANCE.getValue();
        if (value == null || value.length() <= 0) {
            if (C7N.LJIIL().isInMusicallyRegion()) {
                value = "sslocal://webcast_webview?url=https%3A%2F%2Finapp-va.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
            } else {
                value = "sslocal://webcast_webview?url=https%3A%2F%2Finapp.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
            }
        }
        try {
            Uri.Builder buildUpon = UriProtector.parse(value).buildUpon();
            buildUpon.appendQueryParameter("enter_from", "gift_appeal");
            String uri = buildUpon.build().toString();
            o.LJIIIIZZ(uri, "builder.build().toString()");
            value = uri;
        } catch (Exception unused) {
        }
        C7N.LIZ().handle(((BasePreviewSettingMainFragment) iDCListenerS159S0100000_5.l0).getContext(), value);
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_click_contact_us");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "user_id");
        LIZ.LJJIIJZLJL();
    }

    public static final void onClick$1(IDCListenerS159S0100000_5 iDCListenerS159S0100000_5, DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        dialog.dismiss();
        String value = LiveSdkAppealWebviewSetting.INSTANCE.getValue();
        if (value == null || value.length() <= 0) {
            if (C7N.LJIIL().isInMusicallyRegion()) {
                value = "sslocal://webcast_webview?url=https%3A%2F%2Finapp-va.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
            } else {
                value = "sslocal://webcast_webview?url=https%3A%2F%2Finapp.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
            }
        }
        try {
            Uri.Builder buildUpon = UriProtector.parse(value).buildUpon();
            buildUpon.appendQueryParameter("enter_from", "gift_appeal");
            String uri = buildUpon.build().toString();
            o.LJIIIIZZ(uri, "builder.build().toString()");
            value = uri;
        } catch (Exception unused) {
        }
        C7N.LIZ().handle(((BasePreviewSettingMainFragmentSheet) iDCListenerS159S0100000_5.l0).getContext(), value);
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_click_contact_us");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "user_id");
        LIZ.LJJIIJZLJL();
    }

    public static final void onClick$10(IDCListenerS159S0100000_5 iDCListenerS159S0100000_5, DialogInterface dialogInterface, int i) {
        ((Runnable) iDCListenerS159S0100000_5.l0).run();
    }

    public static final void onClick$11(IDCListenerS159S0100000_5 iDCListenerS159S0100000_5, DialogInterface dialogInterface, int i) {
        ((Runnable) iDCListenerS159S0100000_5.l0).run();
    }

    public static final void onClick$12(IDCListenerS159S0100000_5 iDCListenerS159S0100000_5, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        BCE bce = (BCE) iDCListenerS159S0100000_5.l0;
        DataChannel dataChannel = bce.LJLILLLLZI;
        if (dataChannel != null) {
            Long l = (Long) dataChannel.kv0(BCN.class);
            if (l != null) {
                C1EW.LIZ(((RoomSwitchApi) C1A.LIZJ(RoomSwitchApi.class)).updateSwitch(l.longValue(), 3, true)).LJJJLIIL(new AfS57S0100000_5(bce, 221), B5H.LJLIL);
                return;
            }
            return;
        }
        o.LJIJI("dataChannel");
        throw null;
    }

    public static final void onClick$13(IDCListenerS159S0100000_5 iDCListenerS159S0100000_5, DialogInterface dialogInterface, int i) {
        CommentWidget commentWidget = (CommentWidget) iDCListenerS159S0100000_5.l0;
        commentWidget.getClass();
        dialogInterface.dismiss();
        if (commentWidget.LJLLL == null) {
            return;
        }
        C1EW.LIZ(((RoomSwitchApi) C1A.LIZJ(RoomSwitchApi.class)).updateSwitch(commentWidget.LJLLL.getId(), 3, true)).LJJJLIIL(new AfS36S0101000_5(1, commentWidget, 55), new AfS37S0000000_5(10));
    }

    public static final void onClick$14(IDCListenerS159S0100000_5 iDCListenerS159S0100000_5, DialogInterface dialogInterface, int i) {
        CommentWidget commentWidget = (CommentWidget) iDCListenerS159S0100000_5.l0;
        commentWidget.LLIIJI = null;
        BKY.LIZIZ().LJ();
        BZI LIZ = C28787BRn.LIZ("livesdk_tns_ags_float_comment_ban");
        LIZ.LJIJJ(Long.valueOf(((C29374Bfu) C279117r.LIZJ(LIZ, commentWidget.dataChannel)).getCurrentUserId()), "user_id");
        LIZ.LJIJJ("click_ok", "action_type");
        LIZ.LJJIIJZLJL();
    }

    public static final void onClick$15(IDCListenerS159S0100000_5 iDCListenerS159S0100000_5, DialogInterface dialogInterface, int i) {
        CommentWidget commentWidget = (CommentWidget) iDCListenerS159S0100000_5.l0;
        commentWidget.getClass();
        IHostAction iHostAction = (IHostAction) CN1.LIZ(IHostAction.class);
        if (iHostAction != null) {
            iHostAction.jumpToAgsStatusPage(commentWidget.getContext(), "popup_live_comment_ban");
        }
        commentWidget.LLIIJI = null;
        BKY.LIZIZ().LJ();
        BZI LIZ = C28787BRn.LIZ("livesdk_tns_ags_float_comment_ban");
        LIZ.LJIJJ(Long.valueOf(((C29374Bfu) C279117r.LIZJ(LIZ, commentWidget.dataChannel)).getCurrentUserId()), "user_id");
        LIZ.LJIJJ("click_details", "action_type");
        LIZ.LJJIIJZLJL();
    }

    public static final void onClick$16(IDCListenerS159S0100000_5 iDCListenerS159S0100000_5, DialogInterface dialogInterface, int i) {
        String str;
        if (TextUtils.equals(((EnterRoomConfig) iDCListenerS159S0100000_5.l0).mRoomsData.enterFromMerge, "push")) {
            if (C38354F3m.LJ(((EnterRoomConfig) iDCListenerS159S0100000_5.l0).mLogData.anchorId)) {
                str = "";
            } else {
                str = ((EnterRoomConfig) iDCListenerS159S0100000_5.l0).mLogData.anchorId;
            }
            C78688UuS.LJJJJZI(((EnterRoomConfig) iDCListenerS159S0100000_5.l0).mRoomsData.roomId, str, "no_wifi_dialog_cancel");
        }
        dialogInterface.dismiss();
    }

    public static final void onClick$17(IDCListenerS159S0100000_5 iDCListenerS159S0100000_5, DialogInterface dialogInterface, int i) {
        C28720BOy c28720BOy = (C28720BOy) iDCListenerS159S0100000_5.l0;
        c28720BOy.getClass();
        dialogInterface.dismiss();
        c28720BOy.LIZLLL.LJII();
        c28720BOy.LIZLLL.LJI();
        BZI LIZ = C28787BRn.LIZ("livesdk_change_cover_window_click");
        LIZ.LJIJJ("confirm", "result");
        LIZ.LJJIFFI(c28720BOy.LIZJ());
        LIZ.LJJIIJZLJL();
    }

    public static final void onClick$18(IDCListenerS159S0100000_5 iDCListenerS159S0100000_5, DialogInterface dialogInterface, int i) {
        C28720BOy c28720BOy = (C28720BOy) iDCListenerS159S0100000_5.l0;
        c28720BOy.getClass();
        dialogInterface.dismiss();
        BZI LIZ = C28787BRn.LIZ("livesdk_change_cover_window_click");
        LIZ.LJIJJ("live", "result");
        LIZ.LJJIFFI(c28720BOy.LIZJ());
        LIZ.LJJIIJZLJL();
    }

    public static final void onClick$19(IDCListenerS159S0100000_5 iDCListenerS159S0100000_5, DialogInterface dialogInterface, int i) {
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDCListenerS159S0100000_5.l0;
        dialogInterface.dismiss();
        interfaceC65784Pro.invoke();
    }

    public static final void onClick$2(IDCListenerS159S0100000_5 iDCListenerS159S0100000_5, DialogInterface dialogInterface, int i) {
        if (LiveStreamEnableUrlListSetting.INSTANCE.enable()) {
            LiveBroadcastFragment liveBroadcastFragment = (LiveBroadcastFragment) iDCListenerS159S0100000_5.l0;
            CKO cko = liveBroadcastFragment.LLIIIL;
            if (cko != null) {
                cko.start(liveBroadcastFragment.xl().getStreamUrl().pushUrlList);
                return;
            }
            return;
        }
        LiveBroadcastFragment liveBroadcastFragment2 = (LiveBroadcastFragment) iDCListenerS159S0100000_5.l0;
        CKO cko2 = liveBroadcastFragment2.LLIIIL;
        if (cko2 == null) {
            return;
        }
        cko2.start(liveBroadcastFragment2.xl().getStreamUrl().LIZIZ);
    }

    public static final void onClick$20(IDCListenerS159S0100000_5 iDCListenerS159S0100000_5, DialogInterface dialogInterface, int i) {
        LiveWallPaperBean liveWallPaperBean = ((LiveWallPaperPreviewActivity) ((IDCListenerS51S0200000_9) iDCListenerS159S0100000_5.l0).l1).LJLJI;
        if (liveWallPaperBean != null) {
            C31268COy c31268COy = C31268COy.LJI;
            String id = liveWallPaperBean.getId();
            if (!C79004UzY.LJJIFFI(c31268COy.LIZ) && !TextUtils.isEmpty(id)) {
                Iterator<LiveWallPaperBean> it = c31268COy.LIZ.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    LiveWallPaperBean next = it.next();
                    if (id.equals(next.getId())) {
                        C10K.LIZJ(new ACallableS108S0100000_5(next, 2));
                        it.remove();
                        c31268COy.LJ();
                        break;
                    }
                }
            }
        }
        ((LiveWallPaperPreviewActivity) ((IDCListenerS51S0200000_9) iDCListenerS159S0100000_5.l0).l1).finish();
    }

    public static final void onClick$21(IDCListenerS159S0100000_5 iDCListenerS159S0100000_5, DialogInterface dialogInterface, int i) {
        if (LiveStreamEnableUrlListSetting.INSTANCE.enable()) {
            VoiceChatBroadcastFragment voiceChatBroadcastFragment = (VoiceChatBroadcastFragment) iDCListenerS159S0100000_5.l0;
            CKO cko = voiceChatBroadcastFragment.LJLLLL;
            if (cko != null) {
                cko.start(voiceChatBroadcastFragment.xl().getStreamUrl().pushUrlList);
                return;
            }
            return;
        }
        VoiceChatBroadcastFragment voiceChatBroadcastFragment2 = (VoiceChatBroadcastFragment) iDCListenerS159S0100000_5.l0;
        CKO cko2 = voiceChatBroadcastFragment2.LJLLLL;
        if (cko2 == null) {
            return;
        }
        cko2.start(voiceChatBroadcastFragment2.xl().getStreamUrl().LIZIZ);
    }

    public static final void onClick$22(IDCListenerS159S0100000_5 iDCListenerS159S0100000_5, DialogInterface dialogInterface, int i) {
        VoiceChatBroadcastFragment voiceChatBroadcastFragment = (VoiceChatBroadcastFragment) iDCListenerS159S0100000_5.l0;
        PrivacyCert.Builder LIZ = C44878HjO.LIZ(PrivacyCert.Builder.Companion, "bpea-voice-error-stop", "", "stop video/audio capture when error occurs");
        LIZ.policies(PrivacyPolicyStore.getAudioPrivacyPolicy());
        voiceChatBroadcastFragment.om(LIZ.build());
        BZI LIZ2 = C28787BRn.LIZ("livesdk_push_stream_failed_click");
        LIZ2.LJIJJ("end_live", "click_icon");
        UFE.LIZIZ(((VoiceChatBroadcastFragment) iDCListenerS159S0100000_5.l0).LJZ ? 1 : 0, LIZ2, "is_first_fail");
    }

    public static final void onClick$23(IDCListenerS159S0100000_5 iDCListenerS159S0100000_5, DialogInterface dialogInterface, int i) {
        ((VoiceChatBroadcastFragment) iDCListenerS159S0100000_5.l0).om(TokenCert.Companion.with("bpea-voice-ttlive_close_capture"));
        BZI LIZ = C28787BRn.LIZ("livesdk_push_stream_failed_click");
        LIZ.LJIJJ("end_live", "click_icon");
        UFE.LIZIZ(((VoiceChatBroadcastFragment) iDCListenerS159S0100000_5.l0).LJZ ? 1 : 0, LIZ, "is_first_fail");
    }

    public static final void onClick$24(IDCListenerS159S0100000_5 iDCListenerS159S0100000_5, DialogInterface dialogInterface, int i) {
        if (!((C45) iDCListenerS159S0100000_5.l0).LIZ()) {
            ((C45) iDCListenerS159S0100000_5.l0).LIZJ();
        }
        C45 c45 = (C45) iDCListenerS159S0100000_5.l0;
        c45.getClass();
        BZI LIZ = C28787BRn.LIZ("livesdk_live_anchor_pause_confirm_click");
        LIZ.LJIJJ(c45.LIZIZ(), "live_type");
        LIZ.LJIJJ(1, "in_app");
        LIZ.LJIILLIIL(c45.LJLIL);
        LIZ.LJJIIJZLJL();
        dialogInterface.dismiss();
    }

    public static final void onClick$25(IDCListenerS159S0100000_5 iDCListenerS159S0100000_5, DialogInterface dialogInterface, int i) {
        InterfaceC30442Bx8.LLIILZL.LIZ(((C68322mC) iDCListenerS159S0100000_5.l0).element);
    }

    public static final void onClick$26(IDCListenerS159S0100000_5 iDCListenerS159S0100000_5, DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        dialog.dismiss();
        String value = GpppaGiftBanContractUsUrlSetting.INSTANCE.getValue();
        if (!TextUtils.isEmpty(value)) {
            try {
                Uri.Builder buildUpon = UriProtector.parse(value).buildUpon();
                buildUpon.appendQueryParameter("enter_from", "gift_appeal");
                String uri = buildUpon.build().toString();
                o.LJIIIIZZ(uri, "builder.build().toString()");
                value = uri;
            } catch (Exception e) {
                BPP.LIZJ(((BasePreviewSettingMainFragment) iDCListenerS159S0100000_5.l0).getContext(), e);
            }
            C7N.LIZ().handle(((BasePreviewSettingMainFragment) iDCListenerS159S0100000_5.l0).getContext(), value);
        }
        ((BasePreviewSettingMainFragment) iDCListenerS159S0100000_5.l0).Dl("contact_us");
    }

    public static final void onClick$27(IDCListenerS159S0100000_5 iDCListenerS159S0100000_5, DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        dialog.dismiss();
        ((BasePreviewSettingMainFragment) iDCListenerS159S0100000_5.l0).Dl("cancel");
    }

    public static final void onClick$28(IDCListenerS159S0100000_5 iDCListenerS159S0100000_5, DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        dialog.dismiss();
        String value = GpppaGiftBanContractUsUrlSetting.INSTANCE.getValue();
        if (!TextUtils.isEmpty(value)) {
            try {
                Uri.Builder buildUpon = UriProtector.parse(value).buildUpon();
                buildUpon.appendQueryParameter("enter_from", "gift_appeal");
                String uri = buildUpon.build().toString();
                o.LJIIIIZZ(uri, "builder.build().toString()");
                value = uri;
            } catch (Exception e) {
                BPP.LIZJ(((BasePreviewSettingMainFragmentSheet) iDCListenerS159S0100000_5.l0).getContext(), e);
            }
            C7N.LIZ().handle(((BasePreviewSettingMainFragmentSheet) iDCListenerS159S0100000_5.l0).getContext(), value);
        }
        ((BasePreviewSettingMainFragmentSheet) iDCListenerS159S0100000_5.l0).Tl("contact_us");
    }

    public static final void onClick$29(IDCListenerS159S0100000_5 iDCListenerS159S0100000_5, DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        dialog.dismiss();
        ((BasePreviewSettingMainFragmentSheet) iDCListenerS159S0100000_5.l0).Tl("cancel");
    }

    public static final void onClick$3(IDCListenerS159S0100000_5 iDCListenerS159S0100000_5, DialogInterface dialogInterface, int i) {
        ((LiveBroadcastFragment) iDCListenerS159S0100000_5.l0).Am(C78857UxB.LJJIIJ(1476788485, "bpea-427"));
        BZI LIZ = C28787BRn.LIZ("livesdk_push_stream_failed_click");
        LIZ.LJIJJ("end_live", "click_icon");
        UFE.LIZIZ(((LiveBroadcastFragment) iDCListenerS159S0100000_5.l0).LLF ? 1 : 0, LIZ, "is_first_fail");
    }

    public static final void onClick$30(IDCListenerS159S0100000_5 iDCListenerS159S0100000_5, DialogInterface dialogInterface, int i) {
        Context context = (Context) iDCListenerS159S0100000_5.l0;
        C7N.LJFF().Lu();
        C30882CAc.LJII(context, new C28871BUt("https://www.tiktok.com/aweme/in_app/suicide/help/?is_live=1&enter_from=livestream_keyword_popup&title=" + context.getString(R.string.t05)));
    }

    public static final void onClick$31(IDCListenerS159S0100000_5 iDCListenerS159S0100000_5, DialogInterface dialog, int i) {
        ViewOnClickListenerC28501BGn viewOnClickListenerC28501BGn;
        o.LJIIIZ(dialog, "dialog");
        dialog.dismiss();
        DataChannel dataChannel = (DataChannel) iDCListenerS159S0100000_5.l0;
        if (dataChannel != null && (viewOnClickListenerC28501BGn = (ViewOnClickListenerC28501BGn) dataChannel.kv0(LiveCoverControllerChannel.class)) != null && viewOnClickListenerC28501BGn.LJLJJL == null) {
            viewOnClickListenerC28501BGn.LJLJJI.LJI();
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Boolean, O] */
    public static final void onClick$32(IDCListenerS159S0100000_5 iDCListenerS159S0100000_5, DialogInterface dialogInterface, int i) {
        C0N7.LJIJJ((DataChannel) iDCListenerS159S0100000_5.l0, "end_live");
        C0N7.LJIJI((DataChannel) iDCListenerS159S0100000_5.l0, "end_now");
        C29162BcU.LIZIZ(3, null);
        DataChannel dataChannel = (DataChannel) iDCListenerS159S0100000_5.l0;
        if (dataChannel != null) {
            ((C32537Cpp) dataChannel.gv0(C29155BcN.class)).LIZ = Boolean.TRUE;
        }
        C29182Bco.LIZ().LIZLLL();
        C0NB.LIZIZ("PreviewStartLiveExceptionHelper", "end now clicked");
        DataChannel dataChannel2 = (DataChannel) iDCListenerS159S0100000_5.l0;
        if (dataChannel2 != null) {
            dataChannel2.rv0(PreviewStartLiveContinueMsgChannel.class, Boolean.TRUE);
        }
    }

    public static final void onClick$4(IDCListenerS159S0100000_5 iDCListenerS159S0100000_5, DialogInterface dialogInterface, int i) {
        ((LiveBroadcastFragment) iDCListenerS159S0100000_5.l0).Am(C78857UxB.LJJIIJ(1476788484, "bpea-ttlive_close_capture"));
        BZI LIZ = C28787BRn.LIZ("livesdk_push_stream_failed_click");
        LIZ.LJIJJ("end_live", "click_icon");
        UFE.LIZIZ(((LiveBroadcastFragment) iDCListenerS159S0100000_5.l0).LLF ? 1 : 0, LIZ, "is_first_fail");
    }

    public static final void onClick$5(IDCListenerS159S0100000_5 iDCListenerS159S0100000_5, DialogInterface dialogInterface, int i) {
        C28245B6r c28245B6r = (C28245B6r) iDCListenerS159S0100000_5.l0;
        C28461BEz c28461BEz = c28245B6r.LIZIZ.LLIIIILZ;
        if (c28461BEz != null) {
            C29162BcU.LIZIZ(2, c28461BEz.LJLJJI);
        }
        LivePlayFragment livePlayFragment = c28245B6r.LIZIZ;
        if (livePlayFragment.LLIIII != null) {
            BJ9.LJII(livePlayFragment.LLLIIL, "end_live");
        }
    }

    public static final void onClick$6(IDCListenerS159S0100000_5 iDCListenerS159S0100000_5, DialogInterface dialogInterface, int i) {
        ((TurnQuestionDialog) iDCListenerS159S0100000_5.l0).vl();
        dialogInterface.dismiss();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$7(Y.IDCListenerS159S0100000_5 r6, android.content.DialogInterface r7, int r8) {
        /*
            java.lang.Object r2 = r6.l0
            X.BEs r2 = (X.DialogC28454BEs) r2
            r2.getClass()
            X.Ivu r0 = X.C2NU.LIZ     // Catch: java.lang.Exception -> L23
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> L23
            if (r0 != 0) goto L10
            goto L23
        L10:
            java.lang.Class<com.bytedance.android.live.usermanage.IUserManageService> r0 = com.bytedance.android.live.usermanage.IUserManageService.class
            X.0Mx r1 = X.CN1.LIZ(r0)
            com.bytedance.android.live.usermanage.IUserManageService r1 = (com.bytedance.android.live.usermanage.IUserManageService) r1
            r3 = 1
            long r4 = r2.LLJIJIL
            long r6 = r2.LLJILJILJ
            java.lang.String r8 = "KickOutDialog"
            r1.cW(r2, r3, r4, r6, r8)
            goto L2b
        L23:
            android.content.Context r1 = r2.LLJILLL
            r0 = 2131839500(0x7f114a0c, float:1.9312253E38)
            X.C30868C9o.LIZLLL(r0, r1)
        L2b:
            X.BEr r0 = r2.LLJJ
            if (r0 == 0) goto L32
            r0.LIZ()
        L32:
            java.lang.String r0 = "blocked_list_toast_click"
            X.BZI r1 = X.C28787BRn.LIZ(r0)
            java.util.Map r0 = r2.LJJIIZ()
            r1.LJJIFFI(r0)
            java.lang.String r0 = "relation"
            r1.LJIIIZ(r0)
            java.lang.String r0 = "live_detail"
            r1.LJIIJJI(r0)
            java.lang.String r0 = "click"
            r1.LJIIL(r0)
            java.lang.String r0 = "yes"
            r1.LIZJ(r0)
            r1.LJJIIJZLJL()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDCListenerS159S0100000_5.onClick$7(Y.IDCListenerS159S0100000_5, android.content.DialogInterface, int):void");
    }

    public static final void onClick$8(IDCListenerS159S0100000_5 iDCListenerS159S0100000_5, DialogInterface dialogInterface, int i) {
        DialogC28454BEs dialogC28454BEs = (DialogC28454BEs) iDCListenerS159S0100000_5.l0;
        dialogC28454BEs.getClass();
        BZI LIZ = C28787BRn.LIZ("blocked_list_toast_click");
        LIZ.LJJIFFI(dialogC28454BEs.LJJIIZ());
        LIZ.LJIIIZ("relation");
        LIZ.LJIIJJI("live_detail");
        LIZ.LJIIL("click");
        LIZ.LIZJ("no");
        LIZ.LJJIIJZLJL();
        if (dialogC28454BEs.isShowing()) {
            dialogC28454BEs.dismiss();
        }
        C73943T0h.LIZ().LIZIZ(new C28455BEt(1));
    }

    public static final void onClick$9(IDCListenerS159S0100000_5 iDCListenerS159S0100000_5, DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        ((CLB) iDCListenerS159S0100000_5.l0).getClass();
        CLB.LIZIZ(1);
        dialog.dismiss();
    }
}
