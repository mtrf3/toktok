package Y;

import X.AbstractC73672Svk;
import X.B5I;
import X.B5J;
import X.B5N;
import X.BDV;
import X.BTJ;
import X.BZI;
import X.C011602u;
import X.C03880Dg;
import X.C05630Jz;
import X.C113554cx;
import X.C1A;
import X.C1EW;
import X.C23010vJ;
import X.C28254B7a;
import X.C28375BBr;
import X.C28725BPd;
import X.C28787BRn;
import X.C29232Bdc;
import X.C29306Beo;
import X.C30868C9o;
import X.C30929CBx;
import X.C31537CZh;
import X.C34K;
import X.C47071t1;
import X.C48459J0d;
import X.C51029K0z;
import X.C65300Pk0;
import X.C68322mC;
import X.C73411SrX;
import X.C76800UCe;
import X.C77437UaH;
import X.InterfaceC28722BPa;
import X.InterfaceC30442Bx8;
import X.InterfaceC88472Yns;
import X.OSZ;
import X.QZP;
import X.T16;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.bytedance.android.live.adminsetting.RoomSwitchApi;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.gift.IHotWordGiftService;
import com.bytedance.android.livesdk.adminsetting.LiveCommentSettingFragment;
import com.bytedance.android.livesdk.adminsetting.LiveCommentSettingFragmentSheet;
import com.bytedance.android.livesdk.adminsetting.LiveFilterCommentSettingFragment;
import com.bytedance.android.livesdk.adminsetting.LiveFilterCommentSettingFragmentSheet;
import com.bytedance.android.livesdk.broadcast.GiftFeatureChannel;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheet;
import com.bytedance.android.livesdk.comp.api.game.GameAutoCoverChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewSubOnlyMusicSwitchChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewSubOnlyTrialLiveSwitchChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubOnlyLiveSettingDialogNew;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubOnlyLiveSettingFragment;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubscriptionGiftSendDialog;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.setting.SubscriptionSettingFragmentNew;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.moderator.ModeratorPermissionEditFragment;
import com.bytedance.android.livesdk.moderator.ModeratorPermissionEditFragmentSheet;
import com.bytedance.android.livesdk.preview.widget.GameAutoCoverWidget;
import com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse;
import com.bytedance.android.livesdk.subscribe.model.SubSettingStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes6.dex */
public class IDCListenerS206S0100000_5 implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.$t) {
            case 0:
                onCheckedChanged$0(this, compoundButton, z);
                return;
            case 1:
                onCheckedChanged$1(this, compoundButton, z);
                return;
            case 2:
                onCheckedChanged$2(this, compoundButton, z);
                return;
            case 3:
                onCheckedChanged$3(this, compoundButton, z);
                return;
            case 4:
                onCheckedChanged$4(this, compoundButton, z);
                return;
            case 5:
                onCheckedChanged$5(this, compoundButton, z);
                return;
            case 6:
                onCheckedChanged$6(this, compoundButton, z);
                return;
            case 7:
                onCheckedChanged$7(this, compoundButton, z);
                return;
            case 8:
                onCheckedChanged$8(this, compoundButton, z);
                return;
            case 9:
                onCheckedChanged$9(this, compoundButton, z);
                return;
            case 10:
                onCheckedChanged$10(this, compoundButton, z);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onCheckedChanged$11(this, compoundButton, z);
                return;
            case 12:
                onCheckedChanged$12(this, compoundButton, z);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onCheckedChanged$13(this, compoundButton, z);
                return;
            case 14:
                onCheckedChanged$14(this, compoundButton, z);
                return;
            case 15:
                onCheckedChanged$15(this, compoundButton, z);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onCheckedChanged$16(this, compoundButton, z);
                return;
            case 17:
                onCheckedChanged$17(this, compoundButton, z);
                return;
            case 18:
                onCheckedChanged$18(this, compoundButton, z);
                return;
            case 19:
                onCheckedChanged$19(this, compoundButton, z);
                return;
            case 20:
                onCheckedChanged$20(this, compoundButton, z);
                return;
            case 21:
                onCheckedChanged$21(this, compoundButton, z);
                return;
            case 22:
                onCheckedChanged$22(this, compoundButton, z);
                return;
            case 23:
                onCheckedChanged$23(this, compoundButton, z);
                return;
            case 24:
                onCheckedChanged$24(this, compoundButton, z);
                return;
            case 25:
                onCheckedChanged$25(this, compoundButton, z);
                return;
            case 26:
                onCheckedChanged$26(this, compoundButton, z);
                return;
            case 27:
                onCheckedChanged$27(this, compoundButton, z);
                return;
            case 28:
                onCheckedChanged$28(this, compoundButton, z);
                return;
            case 29:
                onCheckedChanged$29(this, compoundButton, z);
                return;
            case 30:
                onCheckedChanged$30(this, compoundButton, z);
                return;
            case 31:
                onCheckedChanged$31(this, compoundButton, z);
                return;
            case 32:
                onCheckedChanged$32(this, compoundButton, z);
                return;
            case 33:
                onCheckedChanged$33(this, compoundButton, z);
                return;
            case 34:
                onCheckedChanged$34(this, compoundButton, z);
                return;
            case 35:
                onCheckedChanged$35(this, compoundButton, z);
                return;
            case 36:
                onCheckedChanged$36(this, compoundButton, z);
                return;
            default:
                return;
        }
    }

    public IDCListenerS206S0100000_5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCheckedChanged$0(IDCListenerS206S0100000_5 iDCListenerS206S0100000_5, CompoundButton compoundButton, boolean z) {
        ((IHotWordGiftService) iDCListenerS206S0100000_5.l0).setUserEnabled(z);
    }

    public static final void onCheckedChanged$1(IDCListenerS206S0100000_5 iDCListenerS206S0100000_5, CompoundButton compoundButton, boolean z) {
        InterfaceC28722BPa onCheckChangeListener = ((C28725BPd) iDCListenerS206S0100000_5.l0).getOnCheckChangeListener();
        if (onCheckChangeListener != null) {
            onCheckChangeListener.LIZ((C28725BPd) iDCListenerS206S0100000_5.l0, z);
        }
    }

    public static final void onCheckedChanged$10(IDCListenerS206S0100000_5 iDCListenerS206S0100000_5, CompoundButton compoundButton, boolean z) {
        int i;
        C28375BBr c28375BBr = ((LiveFilterCommentSettingFragmentSheet) iDCListenerS206S0100000_5.l0).LLF;
        if (c28375BBr != null) {
            c28375BBr.LJI(null, z);
        }
        LinearLayout linearLayout = ((LiveFilterCommentSettingFragmentSheet) iDCListenerS206S0100000_5.l0).LLFZ;
        if (linearLayout == null) {
            return;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        linearLayout.setVisibility(i);
    }

    public static final void onCheckedChanged$11(IDCListenerS206S0100000_5 iDCListenerS206S0100000_5, CompoundButton compoundButton, boolean z) {
        C28375BBr c28375BBr = ((LiveFilterCommentSettingFragmentSheet) iDCListenerS206S0100000_5.l0).LLF;
        if (c28375BBr != null) {
            c28375BBr.LJII(z);
        }
    }

    public static final void onCheckedChanged$12(IDCListenerS206S0100000_5 iDCListenerS206S0100000_5, CompoundButton p0, boolean z) {
        o.LJIIIZ(p0, "p0");
        ((ModeratorPermissionEditFragment) iDCListenerS206S0100000_5.l0).vl(p0, z);
    }

    public static final void onCheckedChanged$13(IDCListenerS206S0100000_5 iDCListenerS206S0100000_5, CompoundButton p0, boolean z) {
        o.LJIIIZ(p0, "p0");
        ((ModeratorPermissionEditFragmentSheet) iDCListenerS206S0100000_5.l0).Ml(p0, z);
    }

    public static final void onCheckedChanged$14(IDCListenerS206S0100000_5 iDCListenerS206S0100000_5, CompoundButton p0, boolean z) {
        o.LJIIIZ(p0, "p0");
        ((ModeratorPermissionEditFragment) iDCListenerS206S0100000_5.l0).Jl(p0, z);
    }

    public static final void onCheckedChanged$15(IDCListenerS206S0100000_5 iDCListenerS206S0100000_5, CompoundButton p0, boolean z) {
        o.LJIIIZ(p0, "p0");
        ((ModeratorPermissionEditFragment) iDCListenerS206S0100000_5.l0).Jl(p0, z);
    }

    public static final void onCheckedChanged$16(IDCListenerS206S0100000_5 iDCListenerS206S0100000_5, CompoundButton p0, boolean z) {
        o.LJIIIZ(p0, "p0");
        ((ModeratorPermissionEditFragmentSheet) iDCListenerS206S0100000_5.l0).Tl(p0, z);
    }

    public static final void onCheckedChanged$17(IDCListenerS206S0100000_5 iDCListenerS206S0100000_5, CompoundButton p0, boolean z) {
        o.LJIIIZ(p0, "p0");
        ((ModeratorPermissionEditFragmentSheet) iDCListenerS206S0100000_5.l0).Tl(p0, z);
    }

    public static final void onCheckedChanged$18(IDCListenerS206S0100000_5 iDCListenerS206S0100000_5, CompoundButton compoundButton, boolean z) {
        ((C34K) iDCListenerS206S0100000_5.l0).element = z;
    }

    public static final void onCheckedChanged$19(IDCListenerS206S0100000_5 iDCListenerS206S0100000_5, CompoundButton compoundButton, boolean z) {
        String str;
        GameAutoCoverWidget gameAutoCoverWidget = (GameAutoCoverWidget) iDCListenerS206S0100000_5.l0;
        C73411SrX c73411SrX = gameAutoCoverWidget.LJLJJL;
        if (c73411SrX != null && !c73411SrX.isDisposed()) {
            c73411SrX.dispose();
        }
        gameAutoCoverWidget.LJLJJL = (C73411SrX) C1EW.LIZ(AbstractC73672Svk.LJJLIIIJLLLLLLLZ(1L, TimeUnit.SECONDS, T16.LIZ()).LJJIII(new BDV(z), false)).LJJJLIIL(C28254B7a.LJLIL, B5N.LJLIL);
        DataChannel dataChannel = ((GameAutoCoverWidget) iDCListenerS206S0100000_5.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(GameAutoCoverChannel.class, Boolean.valueOf(z));
        }
        if (!z) {
            C30868C9o.LIZJ(R.string.kok);
        }
        ((GameAutoCoverWidget) iDCListenerS206S0100000_5.l0).LJLZ(z);
        BZI LIZ = C28787BRn.LIZ("livesdk_cover_modify_screenshot_click");
        LIZ.LJIJJ(((GameAutoCoverWidget) iDCListenerS206S0100000_5.l0).LJLJJI.getValue(), "anchor_id");
        LIZ.LJIJJ(((GameAutoCoverWidget) iDCListenerS206S0100000_5.l0).LJLIL, "live_type");
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        LIZ.LJIJJ(str, "screenshot_status");
        LIZ.LJJIIJZLJL();
    }

    public static final void onCheckedChanged$2(IDCListenerS206S0100000_5 iDCListenerS206S0100000_5, CompoundButton compoundButton, boolean z) {
        Object obj;
        BZI LIZ = C28787BRn.LIZ("livesdk_live_anchor_translation_click");
        LIZ.LJIILLIIL(C51029K0z.LJIILIIL((LiveCommentSettingFragment) iDCListenerS206S0100000_5.l0));
        LIZ.LJJIFFI(((LiveCommentSettingFragment) iDCListenerS206S0100000_5.l0).vl());
        LIZ.LJJIIJZLJL();
        ((LiveCommentSettingFragment) iDCListenerS206S0100000_5.l0).getClass();
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.x0;
        c48459J0d.LIZ(Boolean.valueOf(z));
        InterfaceC30442Bx8.y0.LIZ(Boolean.FALSE);
        InterfaceC30442Bx8.z0.LIZ(Boolean.TRUE);
        BZI LIZ2 = C28787BRn.LIZ("livesdk_live_anchor_translation_update");
        LIZ2.LJIILLIIL(C51029K0z.LJIILIIL((LiveCommentSettingFragment) iDCListenerS206S0100000_5.l0));
        Map vl = ((LiveCommentSettingFragment) iDCListenerS206S0100000_5.l0).vl();
        String str = "on";
        if (!c48459J0d.LIZJ().booleanValue()) {
            obj = "on";
        } else {
            obj = "off";
        }
        HashMap hashMap = (HashMap) vl;
        hashMap.put("from_status", obj);
        Boolean LIZJ = c48459J0d.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_PUBLICSCREEN_AUTO_TRANSLATE_ANCHOR.value");
        if (!LIZJ.booleanValue()) {
            str = "off";
        }
        hashMap.put("to_status", str);
        LIZ2.LJJIFFI(vl);
        LIZ2.LJJIIJZLJL();
    }

    public static final void onCheckedChanged$20(IDCListenerS206S0100000_5 iDCListenerS206S0100000_5, CompoundButton compoundButton, boolean z) {
        ((C34K) iDCListenerS206S0100000_5.l0).element = z;
    }

    public static final void onCheckedChanged$21(IDCListenerS206S0100000_5 iDCListenerS206S0100000_5, CompoundButton compoundButton, boolean z) {
        String str;
        InterfaceC30442Bx8.U2.LIZJ(Boolean.valueOf(z));
        BZI LIZ = C28787BRn.LIZ("livesdk_sub_only_live_longer_preview_allow_click");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(((SubOnlyLiveSettingDialogNew) iDCListenerS206S0100000_5.l0).LJLLLLLL, "click_position");
        if (z) {
            str = "open";
        } else {
            str = "close";
        }
        LIZ.LJIJJ(str, "click_type");
        LIZ.LJJIIJZLJL();
    }

    public static final void onCheckedChanged$22(IDCListenerS206S0100000_5 iDCListenerS206S0100000_5, CompoundButton compoundButton, boolean z) {
        String str;
        Boolean bool;
        DataChannelGlobal.LJLJJI.tv0(PreviewSubOnlyTrialLiveSwitchChannel.class, Boolean.valueOf(z));
        ((SubOnlyLiveSettingFragment) iDCListenerS206S0100000_5.l0).xl();
        SubOnlyLiveSettingFragment subOnlyLiveSettingFragment = (SubOnlyLiveSettingFragment) iDCListenerS206S0100000_5.l0;
        if (z) {
            str = "open";
        } else {
            str = "close";
        }
        subOnlyLiveSettingFragment.getClass();
        BZI LIZ = C28787BRn.LIZ("livesdk_sub_only_live_preview_allow_click");
        LIZ.LJIJJ(subOnlyLiveSettingFragment.LJLLJ, "show_entrance");
        LIZ.LJIJJ(subOnlyLiveSettingFragment.LJLLJ, "click_position");
        LIZ.LJIJJ(subOnlyLiveSettingFragment.vl(), "anchor_id");
        GetSubInfoResponse getSubInfoResponse = subOnlyLiveSettingFragment.LJLLL;
        if (getSubInfoResponse != null) {
            bool = Boolean.valueOf(getSubInfoResponse.initialized);
        } else {
            bool = null;
        }
        LIZ.LJIJJ(Integer.valueOf(!C29306Beo.LJIL(bool) ? 1 : 0), "is_opt_in");
        LIZ.LJIJJ(str, "click_type");
        LIZ.LJJIIJZLJL();
    }

    public static final void onCheckedChanged$23(IDCListenerS206S0100000_5 iDCListenerS206S0100000_5, CompoundButton compoundButton, boolean z) {
        Room room;
        String str;
        DataChannelGlobal.LJLJJI.tv0(PreviewSubOnlyMusicSwitchChannel.class, Boolean.valueOf(z));
        SubOnlyLiveSettingFragment subOnlyLiveSettingFragment = (SubOnlyLiveSettingFragment) iDCListenerS206S0100000_5.l0;
        subOnlyLiveSettingFragment.getClass();
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(subOnlyLiveSettingFragment);
        Long l = null;
        if (LJIILIIL != null) {
            room = (Room) LJIILIIL.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_sub_only_live_use_music_click");
        LIZ.LJIIZILJ();
        if (room != null) {
            l = Long.valueOf(room.getOwnerUserId());
        }
        LIZ.LJIJJ(l, "anchor_id");
        LIZ.LJIJJ("live_take_page", "click_position");
        if (z) {
            str = "turn_on";
        } else {
            str = "turn_off";
        }
        LIZ.LJIJJ(str, "click_type");
        LIZ.LJJIIJZLJL();
    }

    public static final void onCheckedChanged$24(IDCListenerS206S0100000_5 iDCListenerS206S0100000_5, CompoundButton compoundButton, boolean z) {
        String str;
        BZI LIZ = C28787BRn.LIZ("livesdk_sub_only_live_longer_preview_allow_click");
        LIZ.LJIJJ(((SubOnlyLiveSettingFragment) iDCListenerS206S0100000_5.l0).vl(), "anchor_id");
        LIZ.LJIJJ(((SubOnlyLiveSettingFragment) iDCListenerS206S0100000_5.l0).LJLLJ, "click_position");
        if (z) {
            str = "open";
        } else {
            str = "close";
        }
        LIZ.LJIJJ(str, "click_type");
        LIZ.LJJIIJZLJL();
        InterfaceC30442Bx8.U2.LIZJ(Boolean.valueOf(z));
    }

    public static final void onCheckedChanged$25(IDCListenerS206S0100000_5 iDCListenerS206S0100000_5, CompoundButton compoundButton, boolean z) {
        ((SubscriptionGiftSendDialog) iDCListenerS206S0100000_5.l0).LJLLJ = z;
    }

    public static final void onCheckedChanged$26(IDCListenerS206S0100000_5 iDCListenerS206S0100000_5, CompoundButton p0, boolean z) {
        o.LJIIIZ(p0, "p0");
        ((ModeratorPermissionEditFragment) iDCListenerS206S0100000_5.l0).Jl(p0, z);
    }

    public static final void onCheckedChanged$27(IDCListenerS206S0100000_5 iDCListenerS206S0100000_5, CompoundButton p0, boolean z) {
        o.LJIIIZ(p0, "p0");
        ((ModeratorPermissionEditFragment) iDCListenerS206S0100000_5.l0).vl(p0, z);
    }

    public static final void onCheckedChanged$28(IDCListenerS206S0100000_5 iDCListenerS206S0100000_5, CompoundButton p0, boolean z) {
        o.LJIIIZ(p0, "p0");
        ((ModeratorPermissionEditFragmentSheet) iDCListenerS206S0100000_5.l0).Tl(p0, z);
    }

    public static final void onCheckedChanged$29(IDCListenerS206S0100000_5 iDCListenerS206S0100000_5, CompoundButton p0, boolean z) {
        o.LJIIIZ(p0, "p0");
        ((ModeratorPermissionEditFragmentSheet) iDCListenerS206S0100000_5.l0).Ml(p0, z);
    }

    public static final void onCheckedChanged$3(IDCListenerS206S0100000_5 iDCListenerS206S0100000_5, CompoundButton compoundButton, boolean z) {
        long j;
        ((LiveCommentSettingFragment) iDCListenerS206S0100000_5.l0).Dl(z);
        LiveCommentSettingFragment liveCommentSettingFragment = (LiveCommentSettingFragment) iDCListenerS206S0100000_5.l0;
        if (o.LJ(liveCommentSettingFragment.LJLJJI, "from_page_preview")) {
            InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns = liveCommentSettingFragment.LJLJI;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(Boolean.valueOf(z));
                return;
            }
            return;
        }
        RoomSwitchApi roomSwitchApi = (RoomSwitchApi) C1A.LIZJ(RoomSwitchApi.class);
        Room xl = liveCommentSettingFragment.xl();
        if (xl != null) {
            j = xl.getId();
        } else {
            j = 0;
        }
        roomSwitchApi.updateSwitch(j, 3, z).LJII(BTJ.LIZJ(RoomSwitchApi.class)).LJJJLIIL(new AfS25S0110000_5(liveCommentSettingFragment, z, 9), B5I.LJLIL);
    }

    public static final void onCheckedChanged$30(IDCListenerS206S0100000_5 iDCListenerS206S0100000_5, CompoundButton compoundButton, boolean z) {
        ((C31537CZh) iDCListenerS206S0100000_5.l0).LIZ.invoke(Boolean.valueOf(z));
    }

    public static final void onCheckedChanged$31(IDCListenerS206S0100000_5 iDCListenerS206S0100000_5, CompoundButton compoundButton, boolean z) {
        Object obj;
        Integer num;
        Integer num2;
        boolean z2;
        SubSettingStatus subSettingStatus;
        SubSettingStatus subSettingStatus2;
        C29232Bdc.LJIJ(z);
        SubscriptionSettingFragmentNew subscriptionSettingFragmentNew = (SubscriptionSettingFragmentNew) iDCListenerS206S0100000_5.l0;
        subscriptionSettingFragmentNew.getClass();
        BZI LIZ = C28787BRn.LIZ("livesdk_sub_only_chat_button_click");
        subscriptionSettingFragmentNew.Tl(LIZ);
        LIZ.LJIJJ(subscriptionSettingFragmentNew.LJLIL, "click_position");
        LIZ.LJIJJ(subscriptionSettingFragmentNew.LJLIL, "show_entrance");
        String str = "open";
        if (z) {
            obj = "open";
        } else {
            obj = "close";
        }
        LIZ.LJIJJ(obj, "sub_only_chat_status");
        LIZ.LJJIIJZLJL();
        String str2 = subscriptionSettingFragmentNew.LJLIL;
        if (!z) {
            str = "close";
        }
        GetSubInfoResponse getSubInfoResponse = subscriptionSettingFragmentNew.LJLJJL;
        Boolean bool = null;
        if (getSubInfoResponse != null && (subSettingStatus2 = getSubInfoResponse.badgeInfo) != null) {
            num = Integer.valueOf(subSettingStatus2.currentStatus);
        } else {
            num = null;
        }
        String Dl = SubscriptionSettingFragmentNew.Dl(num);
        GetSubInfoResponse getSubInfoResponse2 = subscriptionSettingFragmentNew.LJLJJL;
        if (getSubInfoResponse2 != null && (subSettingStatus = getSubInfoResponse2.emotesInfo) != null) {
            num2 = Integer.valueOf(subSettingStatus.currentStatus);
        } else {
            num2 = null;
        }
        String Dl2 = SubscriptionSettingFragmentNew.Dl(num2);
        GetSubInfoResponse getSubInfoResponse3 = subscriptionSettingFragmentNew.LJLJJL;
        if (getSubInfoResponse3 != null) {
            bool = Boolean.valueOf(getSubInfoResponse3.initialized);
        }
        JSONObject jSONObject = new JSONObject();
        if (str2 == null) {
            str2 = "";
        }
        C05630Jz.LJI(jSONObject, "show_entrance", str2);
        C05630Jz.LJI(jSONObject, "sub_only_status", str);
        C05630Jz.LJI(jSONObject, "current_badge_status", Dl);
        C05630Jz.LJI(jSONObject, "current_emote_status", Dl2);
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            z2 = false;
        }
        C05630Jz.LJII(jSONObject, "initialized", z2);
        C30929CBx.LJIJ("subscription_settings_subonly_click", jSONObject);
    }

    public static final void onCheckedChanged$32(IDCListenerS206S0100000_5 iDCListenerS206S0100000_5, CompoundButton compoundButton, boolean z) {
        String str;
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.k1;
        Boolean LIZJ = c48459J0d.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_SHOW_CAPTION_ANCHOR_SWITCH.value");
        if (LIZJ.booleanValue()) {
            C48459J0d<Boolean> c48459J0d2 = InterfaceC30442Bx8.l1;
            if (!c48459J0d2.LIZJ().booleanValue()) {
                c48459J0d2.LIZ(Boolean.TRUE);
                BasePreviewSettingMainFragment basePreviewSettingMainFragment = (BasePreviewSettingMainFragment) iDCListenerS206S0100000_5.l0;
                basePreviewSettingMainFragment.getClass();
                C47071t1 c47071t1 = new C47071t1(basePreviewSettingMainFragment.getContext());
                c47071t1.LJIILLIIL(R.string.mfm);
                c47071t1.LJFF(R.string.mfl);
                c47071t1.LJIIL(R.string.mfj, new IDcS170S0100000_5(basePreviewSettingMainFragment, 38));
                c47071t1.LJIIIZ(R.string.mfk, new IDcS170S0100000_5(basePreviewSettingMainFragment, 39));
                LiveDialog LIZ = c47071t1.LIZ();
                if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "-2656638566760703452")).LIZ) {
                    LIZ.show();
                }
                BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_caption_off_popup");
                LIZ2.LJIIZILJ();
                LIZ2.LJJIFFI(basePreviewSettingMainFragment.vl());
                LIZ2.LIZJ("show");
                LIZ2.LJJIIJZLJL();
                return;
            }
        }
        if (!((BasePreviewSettingMainFragment) iDCListenerS206S0100000_5.l0).LJLJL) {
            c48459J0d.LIZ(Boolean.valueOf(!c48459J0d.LIZJ().booleanValue()));
            BZI LIZ3 = C28787BRn.LIZ("livesdk_anchor_caption_icon_change");
            LIZ3.LJIIZILJ();
            Map<String, String> vl = ((BasePreviewSettingMainFragment) iDCListenerS206S0100000_5.l0).vl();
            Boolean LIZJ2 = c48459J0d.LIZJ();
            o.LJIIIIZZ(LIZJ2, "LIVE_SHOW_CAPTION_ANCHOR_SWITCH.value");
            if (LIZJ2.booleanValue()) {
                str = "on";
            } else {
                str = "off";
            }
            ((HashMap) vl).put("to_status", str);
            LIZ3.LJJIFFI(vl);
            LIZ3.LIZJ("show");
            LIZ3.LJJIIJZLJL();
        }
        ((BasePreviewSettingMainFragment) iDCListenerS206S0100000_5.l0).LJLJL = false;
    }

    public static final void onCheckedChanged$33(IDCListenerS206S0100000_5 iDCListenerS206S0100000_5, CompoundButton compoundButton, boolean z) {
        String str;
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.k1;
        Boolean LIZJ = c48459J0d.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_SHOW_CAPTION_ANCHOR_SWITCH.value");
        if (LIZJ.booleanValue()) {
            C48459J0d<Boolean> c48459J0d2 = InterfaceC30442Bx8.l1;
            if (!c48459J0d2.LIZJ().booleanValue()) {
                c48459J0d2.LIZ(Boolean.TRUE);
                BasePreviewSettingMainFragmentSheet basePreviewSettingMainFragmentSheet = (BasePreviewSettingMainFragmentSheet) iDCListenerS206S0100000_5.l0;
                basePreviewSettingMainFragmentSheet.getClass();
                C47071t1 c47071t1 = new C47071t1(basePreviewSettingMainFragmentSheet.getContext());
                c47071t1.LJIILLIIL(R.string.mfm);
                c47071t1.LJFF(R.string.mfl);
                c47071t1.LJIIL(R.string.mfj, new IDcS170S0100000_5(basePreviewSettingMainFragmentSheet, 40));
                c47071t1.LJIIIZ(R.string.mfk, new IDcS170S0100000_5(basePreviewSettingMainFragmentSheet, 41));
                LiveDialog LIZ = c47071t1.LIZ();
                if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "2641494249615460763")).LIZ) {
                    LIZ.show();
                }
                BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_caption_off_popup");
                LIZ2.LJIIZILJ();
                LIZ2.LJJIFFI(basePreviewSettingMainFragmentSheet.Nl());
                LIZ2.LIZJ("show");
                LIZ2.LJJIIJZLJL();
                return;
            }
        }
        if (!((BasePreviewSettingMainFragmentSheet) iDCListenerS206S0100000_5.l0).LLFZ) {
            c48459J0d.LIZ(Boolean.valueOf(!c48459J0d.LIZJ().booleanValue()));
            BZI LIZ3 = C28787BRn.LIZ("livesdk_anchor_caption_icon_change");
            LIZ3.LJIIZILJ();
            Map<String, String> Nl = ((BasePreviewSettingMainFragmentSheet) iDCListenerS206S0100000_5.l0).Nl();
            Boolean LIZJ2 = c48459J0d.LIZJ();
            o.LJIIIIZZ(LIZJ2, "LIVE_SHOW_CAPTION_ANCHOR_SWITCH.value");
            if (LIZJ2.booleanValue()) {
                str = "on";
            } else {
                str = "off";
            }
            ((HashMap) Nl).put("to_status", str);
            LIZ3.LJJIFFI(Nl);
            LIZ3.LIZJ("show");
            LIZ3.LJJIIJZLJL();
        }
        ((BasePreviewSettingMainFragmentSheet) iDCListenerS206S0100000_5.l0).LLFZ = false;
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [T, X.UaI] */
    public static final void onCheckedChanged$34(IDCListenerS206S0100000_5 iDCListenerS206S0100000_5, CompoundButton compoundButton, boolean z) {
        if (z) {
            BasePreviewSettingMainFragment basePreviewSettingMainFragment = (BasePreviewSettingMainFragment) iDCListenerS206S0100000_5.l0;
            int i = basePreviewSettingMainFragment.LJLILLLLZI;
            if (i != 5) {
                if (i != 6) {
                    if (i != 8) {
                        basePreviewSettingMainFragment.LJLJJI = true;
                        basePreviewSettingMainFragment.Al(true, false);
                    } else {
                        ((C011602u) basePreviewSettingMainFragment._$_findCachedViewById(R.id.dsw)).setChecked(false);
                        BasePreviewSettingMainFragment basePreviewSettingMainFragment2 = (BasePreviewSettingMainFragment) iDCListenerS206S0100000_5.l0;
                        basePreviewSettingMainFragment2.Jl(basePreviewSettingMainFragment2.LJLILLLLZI);
                        ((BasePreviewSettingMainFragment) iDCListenerS206S0100000_5.l0).Al(false, false);
                    }
                } else {
                    ((C011602u) basePreviewSettingMainFragment._$_findCachedViewById(R.id.dsw)).setChecked(false);
                    BasePreviewSettingMainFragment basePreviewSettingMainFragment3 = (BasePreviewSettingMainFragment) iDCListenerS206S0100000_5.l0;
                    basePreviewSettingMainFragment3.getClass();
                    C68322mC c68322mC = new C68322mC();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    String string = basePreviewSettingMainFragment3.getString(R.string.k4h);
                    o.LJIIIIZZ(string, "getString(R.string.pm_accountban_gifts)");
                    int LJJLIIIJL = s.LJJLIIIJL(string, "[", 0, false, 6);
                    int LJJLIIIJL2 = s.LJJLIIIJL(string, "]", 0, false, 6) - 1;
                    String LIZIZ = QZP.LIZIZ("[\\[\\]]", string, "");
                    if (LJJLIIIJL < 0 || LJJLIIIJL > LJJLIIIJL2 || LJJLIIIJL2 > LIZIZ.length()) {
                        spannableStringBuilder.append((CharSequence) string);
                    } else {
                        spannableStringBuilder.append((CharSequence) LIZIZ);
                        if (!TextUtils.isEmpty(LIZIZ)) {
                            C23010vJ.LJFF(spannableStringBuilder, LJJLIIIJL, LJJLIIIJL2, 33, 600);
                            spannableStringBuilder.setSpan(new IDCSpanS3S0200000_5(basePreviewSettingMainFragment3, c68322mC, 2), LJJLIIIJL, LJJLIIIJL2, 33);
                        }
                    }
                    C77437UaH c77437UaH = new C77437UaH(basePreviewSettingMainFragment3.getContext());
                    c77437UaH.LJJII = true;
                    c77437UaH.LJJIJ = false;
                    c77437UaH.LJII = spannableStringBuilder;
                    c77437UaH.LIZJ = basePreviewSettingMainFragment3.getString(R.string.k4i);
                    c77437UaH.LJ(R.string.spm, new IDCListenerS159S0100000_5(basePreviewSettingMainFragment3, 26), false);
                    c77437UaH.LIZJ(R.string.spn, new IDCListenerS159S0100000_5(basePreviewSettingMainFragment3, 27), false);
                    ?? LIZ = c77437UaH.LIZ();
                    c68322mC.element = LIZ;
                    BasePreviewSettingMainFragment.xl(LIZ);
                    HashMap LJJJLZIJ = C113554cx.LJJJLZIJ(new OSZ("action_type", "show"));
                    BZI LIZ2 = C28787BRn.LIZ("gpppa_popup");
                    LIZ2.LJIIZILJ();
                    LIZ2.LJIIJJI("start_broadcast");
                    LIZ2.LJIIJ("start_broadcast");
                    LIZ2.LJIIIZ("live");
                    LIZ2.LJIIL("click");
                    LIZ2.LJJIFFI(LJJJLZIJ);
                    LIZ2.LJJIIJZLJL();
                    ((BasePreviewSettingMainFragment) iDCListenerS206S0100000_5.l0).Al(false, true);
                }
            } else {
                ((C011602u) basePreviewSettingMainFragment._$_findCachedViewById(R.id.dsw)).setChecked(false);
                BasePreviewSettingMainFragment basePreviewSettingMainFragment4 = (BasePreviewSettingMainFragment) iDCListenerS206S0100000_5.l0;
                basePreviewSettingMainFragment4.Jl(basePreviewSettingMainFragment4.LJLILLLLZI);
                ((BasePreviewSettingMainFragment) iDCListenerS206S0100000_5.l0).Al(false, false);
            }
        } else {
            BasePreviewSettingMainFragment basePreviewSettingMainFragment5 = (BasePreviewSettingMainFragment) iDCListenerS206S0100000_5.l0;
            basePreviewSettingMainFragment5.LJLJJI = false;
            basePreviewSettingMainFragment5.Al(false, false);
        }
        BasePreviewSettingMainFragment basePreviewSettingMainFragment6 = (BasePreviewSettingMainFragment) iDCListenerS206S0100000_5.l0;
        if (basePreviewSettingMainFragment6.LJLILLLLZI == 1) {
            if (basePreviewSettingMainFragment6.LJLJJI) {
                DataChannel LJIILIIL = C51029K0z.LJIILIIL(basePreviewSettingMainFragment6);
                if (LJIILIIL != null) {
                    LJIILIIL.rv0(GiftFeatureChannel.class, 1);
                    return;
                }
                return;
            }
            DataChannel LJIILIIL2 = C51029K0z.LJIILIIL(basePreviewSettingMainFragment6);
            if (LJIILIIL2 == null) {
                return;
            }
            LJIILIIL2.rv0(GiftFeatureChannel.class, 2);
            return;
        }
        DataChannel LJIILIIL3 = C51029K0z.LJIILIIL(basePreviewSettingMainFragment6);
        if (LJIILIIL3 == null) {
            return;
        }
        LJIILIIL3.rv0(GiftFeatureChannel.class, Integer.valueOf(((BasePreviewSettingMainFragment) iDCListenerS206S0100000_5.l0).LJLILLLLZI));
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [T, X.UaI] */
    public static final void onCheckedChanged$35(IDCListenerS206S0100000_5 iDCListenerS206S0100000_5, CompoundButton compoundButton, boolean z) {
        if (z) {
            BasePreviewSettingMainFragmentSheet basePreviewSettingMainFragmentSheet = (BasePreviewSettingMainFragmentSheet) iDCListenerS206S0100000_5.l0;
            int i = basePreviewSettingMainFragmentSheet.LLD;
            if (i != 5) {
                if (i != 6) {
                    if (i != 8) {
                        basePreviewSettingMainFragmentSheet.LLFF = true;
                        basePreviewSettingMainFragmentSheet.Sl(true, false);
                    } else {
                        ((C011602u) basePreviewSettingMainFragmentSheet._$_findCachedViewById(R.id.dsw)).setChecked(false);
                        BasePreviewSettingMainFragmentSheet basePreviewSettingMainFragmentSheet2 = (BasePreviewSettingMainFragmentSheet) iDCListenerS206S0100000_5.l0;
                        basePreviewSettingMainFragmentSheet2.Yl(basePreviewSettingMainFragmentSheet2.LLD);
                        ((BasePreviewSettingMainFragmentSheet) iDCListenerS206S0100000_5.l0).Sl(false, false);
                    }
                } else {
                    ((C011602u) basePreviewSettingMainFragmentSheet._$_findCachedViewById(R.id.dsw)).setChecked(false);
                    BasePreviewSettingMainFragmentSheet basePreviewSettingMainFragmentSheet3 = (BasePreviewSettingMainFragmentSheet) iDCListenerS206S0100000_5.l0;
                    basePreviewSettingMainFragmentSheet3.getClass();
                    C68322mC c68322mC = new C68322mC();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    String string = basePreviewSettingMainFragmentSheet3.getString(R.string.k4h);
                    o.LJIIIIZZ(string, "getString(R.string.pm_accountban_gifts)");
                    int LJJLIIIJL = s.LJJLIIIJL(string, "[", 0, false, 6);
                    int LJJLIIIJL2 = s.LJJLIIIJL(string, "]", 0, false, 6) - 1;
                    String LIZIZ = QZP.LIZIZ("[\\[\\]]", string, "");
                    if (LJJLIIIJL < 0 || LJJLIIIJL > LJJLIIIJL2 || LJJLIIIJL2 > LIZIZ.length()) {
                        spannableStringBuilder.append((CharSequence) string);
                    } else {
                        spannableStringBuilder.append((CharSequence) LIZIZ);
                        if (!TextUtils.isEmpty(LIZIZ)) {
                            C23010vJ.LJFF(spannableStringBuilder, LJJLIIIJL, LJJLIIIJL2, 33, 600);
                            spannableStringBuilder.setSpan(new IDCSpanS3S0200000_5(basePreviewSettingMainFragmentSheet3, c68322mC, 3), LJJLIIIJL, LJJLIIIJL2, 33);
                        }
                    }
                    C77437UaH c77437UaH = new C77437UaH(basePreviewSettingMainFragmentSheet3.getContext());
                    c77437UaH.LJJII = true;
                    c77437UaH.LJJIJ = false;
                    c77437UaH.LJII = spannableStringBuilder;
                    c77437UaH.LIZJ = basePreviewSettingMainFragmentSheet3.getString(R.string.k4i);
                    c77437UaH.LJ(R.string.spm, new IDCListenerS159S0100000_5(basePreviewSettingMainFragmentSheet3, 28), false);
                    c77437UaH.LIZJ(R.string.spn, new IDCListenerS159S0100000_5(basePreviewSettingMainFragmentSheet3, 29), false);
                    ?? LIZ = c77437UaH.LIZ();
                    c68322mC.element = LIZ;
                    BasePreviewSettingMainFragmentSheet.Ol(LIZ);
                    HashMap LJJJLZIJ = C113554cx.LJJJLZIJ(new OSZ("action_type", "show"));
                    BZI LIZ2 = C28787BRn.LIZ("gpppa_popup");
                    LIZ2.LJIIZILJ();
                    LIZ2.LJIIJJI("start_broadcast");
                    LIZ2.LJIIJ("start_broadcast");
                    LIZ2.LJIIIZ("live");
                    LIZ2.LJIIL("click");
                    LIZ2.LJJIFFI(LJJJLZIJ);
                    LIZ2.LJJIIJZLJL();
                    ((BasePreviewSettingMainFragmentSheet) iDCListenerS206S0100000_5.l0).Sl(false, true);
                }
            } else {
                ((C011602u) basePreviewSettingMainFragmentSheet._$_findCachedViewById(R.id.dsw)).setChecked(false);
                BasePreviewSettingMainFragmentSheet basePreviewSettingMainFragmentSheet4 = (BasePreviewSettingMainFragmentSheet) iDCListenerS206S0100000_5.l0;
                basePreviewSettingMainFragmentSheet4.Yl(basePreviewSettingMainFragmentSheet4.LLD);
                ((BasePreviewSettingMainFragmentSheet) iDCListenerS206S0100000_5.l0).Sl(false, false);
            }
        } else {
            BasePreviewSettingMainFragmentSheet basePreviewSettingMainFragmentSheet5 = (BasePreviewSettingMainFragmentSheet) iDCListenerS206S0100000_5.l0;
            basePreviewSettingMainFragmentSheet5.LLFF = false;
            basePreviewSettingMainFragmentSheet5.Sl(false, false);
        }
        BasePreviewSettingMainFragmentSheet basePreviewSettingMainFragmentSheet6 = (BasePreviewSettingMainFragmentSheet) iDCListenerS206S0100000_5.l0;
        if (basePreviewSettingMainFragmentSheet6.LLD == 1) {
            if (basePreviewSettingMainFragmentSheet6.LLFF) {
                DataChannel LJIILIIL = C51029K0z.LJIILIIL(basePreviewSettingMainFragmentSheet6);
                if (LJIILIIL != null) {
                    LJIILIIL.rv0(GiftFeatureChannel.class, 1);
                    return;
                }
                return;
            }
            DataChannel LJIILIIL2 = C51029K0z.LJIILIIL(basePreviewSettingMainFragmentSheet6);
            if (LJIILIIL2 == null) {
                return;
            }
            LJIILIIL2.rv0(GiftFeatureChannel.class, 2);
            return;
        }
        DataChannel LJIILIIL3 = C51029K0z.LJIILIIL(basePreviewSettingMainFragmentSheet6);
        if (LJIILIIL3 == null) {
            return;
        }
        LJIILIIL3.rv0(GiftFeatureChannel.class, Integer.valueOf(((BasePreviewSettingMainFragmentSheet) iDCListenerS206S0100000_5.l0).LLD));
    }

    public static final void onCheckedChanged$36(IDCListenerS206S0100000_5 iDCListenerS206S0100000_5, CompoundButton compoundButton, boolean z) {
        ((C34K) iDCListenerS206S0100000_5.l0).element = z;
    }

    public static final void onCheckedChanged$4(IDCListenerS206S0100000_5 iDCListenerS206S0100000_5, CompoundButton compoundButton, boolean z) {
        Object obj;
        BZI LIZ = C28787BRn.LIZ("livesdk_live_anchor_translation_click");
        LIZ.LJIILLIIL(C51029K0z.LJIILIIL((LiveCommentSettingFragmentSheet) iDCListenerS206S0100000_5.l0));
        LIZ.LJJIFFI(((LiveCommentSettingFragmentSheet) iDCListenerS206S0100000_5.l0).Ml());
        LIZ.LJJIIJZLJL();
        ((LiveCommentSettingFragmentSheet) iDCListenerS206S0100000_5.l0).getClass();
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.x0;
        c48459J0d.LIZ(Boolean.valueOf(z));
        InterfaceC30442Bx8.y0.LIZ(Boolean.FALSE);
        InterfaceC30442Bx8.z0.LIZ(Boolean.TRUE);
        BZI LIZ2 = C28787BRn.LIZ("livesdk_live_anchor_translation_update");
        LIZ2.LJIILLIIL(C51029K0z.LJIILIIL((LiveCommentSettingFragmentSheet) iDCListenerS206S0100000_5.l0));
        Map Ml = ((LiveCommentSettingFragmentSheet) iDCListenerS206S0100000_5.l0).Ml();
        String str = "on";
        if (!c48459J0d.LIZJ().booleanValue()) {
            obj = "on";
        } else {
            obj = "off";
        }
        HashMap hashMap = (HashMap) Ml;
        hashMap.put("from_status", obj);
        Boolean LIZJ = c48459J0d.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_PUBLICSCREEN_AUTO_TRANSLATE_ANCHOR.value");
        if (!LIZJ.booleanValue()) {
            str = "off";
        }
        hashMap.put("to_status", str);
        LIZ2.LJJIFFI(Ml);
        LIZ2.LJJIIJZLJL();
    }

    public static final void onCheckedChanged$5(IDCListenerS206S0100000_5 iDCListenerS206S0100000_5, CompoundButton compoundButton, boolean z) {
        long j;
        ((LiveCommentSettingFragmentSheet) iDCListenerS206S0100000_5.l0).Ql(z);
        LiveCommentSettingFragmentSheet liveCommentSettingFragmentSheet = (LiveCommentSettingFragmentSheet) iDCListenerS206S0100000_5.l0;
        if (o.LJ(liveCommentSettingFragmentSheet.LLFFF, "from_page_preview")) {
            InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns = liveCommentSettingFragmentSheet.LLFF;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(Boolean.valueOf(z));
                return;
            }
            return;
        }
        RoomSwitchApi roomSwitchApi = (RoomSwitchApi) C1A.LIZJ(RoomSwitchApi.class);
        Room Ol = liveCommentSettingFragmentSheet.Ol();
        if (Ol != null) {
            j = Ol.getId();
        } else {
            j = 0;
        }
        roomSwitchApi.updateSwitch(j, 3, z).LJII(BTJ.LIZJ(RoomSwitchApi.class)).LJJJLIIL(new AfS25S0110000_5(liveCommentSettingFragmentSheet, z, 10), B5J.LJLIL);
    }

    public static final void onCheckedChanged$6(IDCListenerS206S0100000_5 iDCListenerS206S0100000_5, CompoundButton compoundButton, boolean z) {
        C28375BBr c28375BBr = ((LiveFilterCommentSettingFragment) iDCListenerS206S0100000_5.l0).LJLILLLLZI;
        if (c28375BBr != null) {
            c28375BBr.LJIIIIZZ(z);
        }
    }

    public static final void onCheckedChanged$7(IDCListenerS206S0100000_5 iDCListenerS206S0100000_5, CompoundButton compoundButton, boolean z) {
        int i;
        C28375BBr c28375BBr = ((LiveFilterCommentSettingFragment) iDCListenerS206S0100000_5.l0).LJLILLLLZI;
        if (c28375BBr != null) {
            c28375BBr.LJI(null, z);
        }
        LinearLayout linearLayout = ((LiveFilterCommentSettingFragment) iDCListenerS206S0100000_5.l0).LJLJJLL;
        if (linearLayout == null) {
            return;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        linearLayout.setVisibility(i);
    }

    public static final void onCheckedChanged$8(IDCListenerS206S0100000_5 iDCListenerS206S0100000_5, CompoundButton compoundButton, boolean z) {
        C28375BBr c28375BBr = ((LiveFilterCommentSettingFragment) iDCListenerS206S0100000_5.l0).LJLILLLLZI;
        if (c28375BBr != null) {
            c28375BBr.LJII(z);
        }
    }

    public static final void onCheckedChanged$9(IDCListenerS206S0100000_5 iDCListenerS206S0100000_5, CompoundButton compoundButton, boolean z) {
        C28375BBr c28375BBr = ((LiveFilterCommentSettingFragmentSheet) iDCListenerS206S0100000_5.l0).LLF;
        if (c28375BBr != null) {
            c28375BBr.LJIIIIZZ(z);
        }
    }
}
