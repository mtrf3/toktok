package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.bottom.BottomToastVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.service.EncourageLoginPopupManager;
import com.ss.android.ugc.aweme.service.IEncourageLogInService;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.base.experiment.ChannelUIConfig;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.core.ui.campaign.OperationPlatform;
import com.ss.android.ugc.aweme.share.core.ui.campaign.SharingOperationConfig;
import com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel;
import com.ss.android.ugc.aweme.share.improve.channel.FakeInviteFriendsChannel;
import com.ss.android.ugc.aweme.share.improve.channel.ImChannel;
import com.ss.android.ugc.aweme.share.improve.channel.QrCodeChannel;
import com.ss.android.ugc.aweme.share.improve.channel.RepostChannel;
import com.ss.android.ugc.aweme.share.improve.channel.ShareCampaignChannel;
import com.ss.android.ugc.aweme.share.improve.channel.ShareToStoryChannel;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.IDqS185S0200000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Oe5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62385Oe5 {
    public static final /* synthetic */ int LJJIII = 0;
    public final Activity LIZ;
    public final Fragment LIZIZ;
    public final Aweme LIZJ;
    public final InterfaceC72642tA<C50420Jqa> LIZLLL;
    public final Bundle LJ;
    public final boolean LJFF;
    public final int LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;
    public final String LJIILL;
    public final String LJIILLIIL;
    public final String LJIIZILJ;
    public final String LJIJ;
    public final String LJIJI;
    public final String LJIJJ;
    public final String LJIJJLI;
    public final String LJIL;
    public final boolean LJJ;
    public final String LJJI;
    public final String LJJIFFI;
    public final AbstractC65590Pog LJJII;

    static {
        new C62389Oe9();
    }

    public final void LJFF() {
        if (this.LIZIZ.mo49getActivity() == null || this.LIZIZ.isDetached()) {
            return;
        }
        ((BottomToastVM) ViewModelProviders.of(this.LIZIZ).get(BottomToastVM.class)).LJLJJI.postValue(Boolean.FALSE);
    }

    public static String LIZLLL(Aweme aweme) {
        LiveRoomStruct newLiveRoomData;
        if (aweme.isLive()) {
            RoomFeedCellStruct roomFeedCellStruct = aweme.getRoomFeedCellStruct();
            if (roomFeedCellStruct != null && (newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData()) != null) {
                return Long.valueOf(newLiveRoomData.getAnchorId()).toString();
            }
        } else if (aweme.getAuthor() != null && aweme.getAuthor().isLive()) {
            String uid = aweme.getAuthor().getUid();
            uid.toString();
            return uid;
        }
        return null;
    }

    public static String LJ(Aweme aweme) {
        LiveRoomStruct newLiveRoomData;
        if (aweme.isLive()) {
            RoomFeedCellStruct roomFeedCellStruct = aweme.getRoomFeedCellStruct();
            if (roomFeedCellStruct != null && (newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData()) != null) {
                return Long.valueOf(newLiveRoomData.id).toString();
            }
        } else if (aweme.getAuthor() != null && aweme.getAuthor().isLive()) {
            return String.valueOf(aweme.getAuthor().roomId);
        }
        return null;
    }

    public static void LJIIIZ(AwemeSharePackage awemeSharePackage) {
        if (!C54838Lfe.LJJI(awemeSharePackage.LJIILLIIL())) {
            return;
        }
        awemeSharePackage.extras.putInt("is_share_to_story", C222578oP.LJI(awemeSharePackage.LJIILLIIL()));
        awemeSharePackage.extras.putInt("is_story_to_normal", awemeSharePackage.LJIILLIIL().getIsStoryToNormal() ? 1 : 0);
        awemeSharePackage.extras.putString("story_music_with_mute", C78596Usy.LJJJLL(awemeSharePackage.LJIILLIIL()));
    }

    public final boolean LIZJ(Aweme aweme) {
        if (aweme.isProhibited() || aweme.isDelete()) {
            C5S1 c5s1 = new C5S1(this.LIZ);
            c5s1.LIZJ(R.string.tob);
            c5s1.LJ();
            return false;
        }
        if (aweme.getStatus() == null || aweme.getStatus().getPrivateStatus() != 1) {
            return true;
        }
        C5S1 c5s12 = new C5S1(this.LIZ);
        c5s12.LIZJ(R.string.tob);
        c5s12.LJ();
        return false;
    }

    public final void LJIIIIZZ(AwemeSharePackage awemeSharePackage, C62394OeE c62394OeE) {
        boolean z;
        int i;
        EnumC62492Ofo showStyle;
        boolean z2;
        if (!C54838Lfe.LJJI(this.LIZJ)) {
            LIZ(c62394OeE, awemeSharePackage, this.LIZ);
        } else {
            if (C54838Lfe.LJJI(this.LIZJ)) {
                LIZ(c62394OeE, awemeSharePackage, this.LIZ);
            }
            if (!o.LJ(this.LJII, "story_archive") && !C54838Lfe.LJIILL(this.LIZJ)) {
                z = true;
            } else {
                z = false;
            }
            c62394OeE.LJIJ = z;
            c62394OeE.LJIILIIL = R.string.r5i;
            c62394OeE.LJIILLIIL = R.string.cg_;
        }
        Aweme aweme = this.LIZJ;
        Activity activity = this.LIZ;
        Fragment fragment = this.LIZIZ;
        InterfaceC72642tA<C50420Jqa> interfaceC72642tA = this.LIZLLL;
        String enterMethod = this.LJIIIIZZ;
        o.LJIIIIZZ(enterMethod, "enterMethod");
        String eventType = this.LJII;
        o.LJIIIIZZ(eventType, "eventType");
        int i2 = this.LJI;
        String tagId = this.LJIIZILJ;
        o.LJIIIIZZ(tagId, "tagId");
        String parentTagId = this.LJIJ;
        o.LJIIIIZZ(parentTagId, "parentTagId");
        String categoryName = this.LJIJJLI;
        o.LJIIIIZZ(categoryName, "categoryName");
        String fromPage = this.LJIL;
        o.LJIIIIZZ(fromPage, "fromPage");
        C62433Oer c62433Oer = new C62433Oer(aweme, false, activity, fragment, c62394OeE, interfaceC72642tA, enterMethod, eventType, i2, "share_board", tagId, parentTagId, categoryName, fromPage, this.LJFF);
        c62433Oer.LJJII();
        c62394OeE.LJJ = new C62391OeB(this, c62433Oer);
        c62394OeE.LJJIIZ = false;
        if (Z8A.LIZIZ.isFromProfileLongPress(this.LJII, this.LJIIIIZZ) || c62394OeE.LJJIJIIJIL) {
            i = 1;
            c62394OeE.LJJIJ = true;
        } else {
            c62394OeE.LJJIJ = false;
            i = 1;
        }
        String panelSource = this.LJIIIZ;
        o.LJIIIIZZ(panelSource, "panelSource");
        ChannelUIConfig LIZ = C113994df.LIZ();
        if (o.LJ(panelSource, "long_press")) {
            if (LIZ.getCollapse() != i || C52434Khy.LIZ() == 2 || C52434Khy.LIZ() == 3) {
                showStyle = EnumC62492Ofo.EXPAND;
            } else {
                showStyle = EnumC62492Ofo.COLLAPSE;
            }
        } else {
            showStyle = EnumC62492Ofo.EXPAND;
        }
        o.LJIIIZ(showStyle, "showStyle");
        c62394OeE.LIZIZ = showStyle;
        if (!o.LJ(this.LJIIIIZZ, "long_press") || ((Number) C52627Kl5.LIZ.getValue()).intValue() == i) {
            z2 = false;
        } else {
            z2 = true;
        }
        c62394OeE.LJJIJIIJI = z2;
        c62394OeE.LJJIIJ = this.LJFF;
    }

    public final void LIZ(C62394OeE c62394OeE, AwemeSharePackage awemeSharePackage, Context context) {
        boolean z;
        String str;
        OperationPlatform operationPlatform;
        boolean z2;
        int i;
        boolean z3;
        String str2;
        AwemeStatus status;
        Bundle bundle;
        Aweme aweme;
        C107814Kz.LIZ.getClass();
        if (!C107814Kz.LIZ() || o.LJ(awemeSharePackage.extras.getString("enter_method"), "long_press") || ((aweme = this.LIZJ) != null && aweme.getAwemeType() == 13)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            ShareDependService.LIZ.getClass();
            ShareDependService LIZ = C44498HdG.LIZ();
            String eventType = this.LJII;
            o.LJIIIIZZ(eventType, "eventType");
            ImChannel LJJIJIIJI = LIZ.LJJIJIIJI(awemeSharePackage, eventType);
            if (LJJIJIIJI != null) {
                c62394OeE.LIZIZ(LJJIJIIJI);
            }
        }
        boolean z4 = this.LJFF;
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        Aweme aweme2 = this.LIZJ;
        if (aweme2 != null && !o.LJ(this.LJIIIIZZ, "long_press") && ((Boolean) L17.LIZJ.getValue()).booleanValue() && C7HV.LIZIZ.LIZLLL().LIZ(aweme2)) {
            boolean LJ = o.LJ(this.LJ.getString("enter_method"), "download");
            boolean z5 = this.LJ.getBoolean("is_video_from_discover");
            if (!LJ && !z5) {
                c62394OeE.LIZIZ(new RepostChannel(this.LIZ, this.LJ, aweme2));
            }
        }
        Aweme aweme3 = this.LIZJ;
        if (aweme3 != null && Q7K.LIZIZ("enable_teens_repost_btn", 0) == 1 && !o.LJ(this.LJ.getString("panel_source"), "long_press") && C7HV.LIZIZ.LIZLLL().LIZ(aweme3)) {
            c62394OeE.LIZIZ(new RepostChannel(this.LIZ, this.LJ, aweme3));
        }
        Aweme aweme4 = this.LIZJ;
        if (aweme4 != null && !o.LJ(this.LJIIIIZZ, "long_press") && ((Boolean) L1S.LIZLLL.getValue()).booleanValue() && C55723Ltv.LIZIZ.LJII().LJII(aweme4)) {
            c62394OeE.LIZIZ(new ShareToStoryChannel(this.LIZ, this.LJ, aweme4));
        }
        Aweme aweme5 = this.LIZJ;
        if (aweme5 != null) {
            boolean LJ2 = o.LJ(awemeSharePackage.extras.getString("panel_source"), "long_press");
            if (!o.LJ(this.LJIL, "graphic_detail") && (C53172Kts.LIZIZ() || (LJ2 && C53172Kts.LIZ()))) {
                OSZ LIZLLL = C62291OcZ.LIZLLL(aweme5);
                if (((Boolean) LIZLLL.getFirst()).booleanValue()) {
                    awemeSharePackage.extras.putString("share_display_tag_id", (String) LIZLLL.getSecond());
                    Bundle bundle2 = awemeSharePackage.extras;
                    SharingOperationConfig LIZ2 = C62285OcT.LIZ();
                    if (LIZ2 != null) {
                        str = LIZ2.operationId;
                    } else {
                        str = null;
                    }
                    bundle2.putString("share_campaign_id", str);
                    SharingOperationConfig LIZ3 = C62285OcT.LIZ();
                    if (LIZ3 != null && (operationPlatform = LIZ3.operationPlatform) != null) {
                        C62434Oes c62434Oes = AwemeSharePackage.Companion;
                        Aweme aweme6 = this.LIZJ;
                        Activity activity = this.LIZ;
                        int i2 = this.LJI;
                        String eventType2 = this.LJII;
                        o.LJIIIIZZ(eventType2, "eventType");
                        String enterMethod = this.LJIIIIZZ;
                        o.LJIIIIZZ(enterMethod, "enterMethod");
                        String panelSource = this.LJIIIZ;
                        o.LJIIIIZZ(panelSource, "panelSource");
                        boolean z6 = this.LJFF;
                        c62434Oes.getClass();
                        AwemeSharePackage LIZ4 = C62434Oes.LIZ(i2, activity, aweme6, eventType2, enterMethod, panelSource, z6);
                        boolean LJ3 = o.LJ(awemeSharePackage.extras.getString("panel_source"), "long_press");
                        LIZ4.extras.putAll(awemeSharePackage.extras);
                        if (C53172Kts.LIZIZ() || (LJ3 && C53172Kts.LIZ())) {
                            LIZ4.extras.putString("panel_source", "cover_select");
                        }
                        c62394OeE.LIZIZ(new ShareCampaignChannel(LIZ4, operationPlatform, this));
                    }
                }
            }
        }
        Aweme aweme7 = this.LIZJ;
        String eventType3 = this.LJII;
        o.LJIIIIZZ(eventType3, "eventType");
        String enterMethod2 = this.LJIIIIZZ;
        o.LJIIIIZZ(enterMethod2, "enterMethod");
        C62389Oe9.LIZIZ(aweme7, c62394OeE, LJIIIIZZ, eventType3, enterMethod2, z4, 64);
        if (C53282Kve.LIZ()) {
            C221018lt.LJFF("Relation_Sharer", "add fake invite friends channel");
            c62394OeE.LIZIZ(new FakeInviteFriendsChannel());
        }
        Aweme aweme8 = this.LIZJ;
        if (aweme8 != null && aweme8.getAuthor() != null && aweme8.getAwemeType() != 13 && ((aweme8.getStatus() == null || aweme8.getStatus().getPrivateStatus() != 1) && TextUtils.equals(((RBX) HG3.LJIILL()).getCurUserId(), aweme8.getAuthorUid()))) {
            c62394OeE.LIZIZ(new QrCodeChannel(aweme8, awemeSharePackage));
        }
        BaseSharePackage baseSharePackage = c62394OeE.LJIIZILJ;
        if (baseSharePackage != null && (bundle = baseSharePackage.extras) != null) {
            z2 = bundle.getBoolean("is_async_sort");
        } else {
            z2 = false;
        }
        c62394OeE.LJFF(new C62355Odb(awemeSharePackage.itemType, z2, 2));
        if (C85990Xow.LJIIJ() || C85990Xow.LJIIJJI()) {
            c62394OeE.LJIILIIL = R.string.r5m;
        }
        if (this.LIZJ.isScheduleVideo()) {
            c62394OeE.LJIILIIL = R.string.i7q;
        }
        if (C62280OcO.LIZIZ(this.LIZJ)) {
            i = 1;
            c62394OeE.LJFF = true;
        } else {
            i = 1;
        }
        Aweme aweme9 = this.LIZJ;
        if (o.LJ(this.LJIIIZ, "long_press") && (C52434Khy.LIZ() == i || C52434Khy.LIZ() == 2)) {
            List<InterfaceC62225ObV> list = c62394OeE.LIZ;
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            for (InterfaceC62225ObV channel : list) {
                o.LJIIIZ(aweme9, "aweme");
                o.LJIIIZ(channel, "channel");
                if (C62359Odf.LJFF(aweme9, channel) || C62359Odf.LJI(aweme9, channel) || !channel.LJIIIIZZ() || (channel instanceof QrCodeChannel)) {
                    c62394OeE.LIZLLL(channel.key());
                }
                arrayList.add(C76800UCe.LIZ);
            }
        }
        if (AV1.LJIIJJI() || this.LIZJ.isScheduleVideo() || ((this.LIZJ.isAd() && (status = this.LIZJ.getStatus()) != null && !status.isAllowShare()) || !this.LJFF)) {
            z3 = false;
        } else {
            z3 = true;
        }
        c62394OeE.LJIJ = z3;
        c62394OeE.LJIILIIL = R.string.r5i;
        c62394OeE.LJIILLIIL = R.string.cg_;
        boolean LJ4 = o.LJ(awemeSharePackage.extras.getString("panel_source"), "share_panel");
        if (C53172Kts.LIZ() && LJ4) {
            String LIZIZ = C39792FjY.LIZIZ();
            String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
            Keva LIZ5 = C39792FjY.LIZ();
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append("skip_campaign_times");
            LIZ6.append(curUserId);
            LIZ6.append(LIZIZ);
            if (LIZ5.getInt(X1D.LIZIZ(LIZ6), 0) >= 2) {
                return;
            }
            OSZ LIZLLL2 = C62291OcZ.LIZLLL(this.LIZJ);
            if (!((Boolean) LIZLLL2.getFirst()).booleanValue()) {
                return;
            }
            awemeSharePackage.extras.putString("share_display_tag_id", (String) LIZLLL2.getSecond());
            Bundle bundle3 = awemeSharePackage.extras;
            SharingOperationConfig LIZ7 = C62285OcT.LIZ();
            if (LIZ7 != null) {
                str2 = LIZ7.operationId;
            } else {
                str2 = null;
            }
            bundle3.putString("share_campaign_id", str2);
            awemeSharePackage.extras.putBoolean("is_match_campaign_condition", true);
            c62394OeE.LJJIJIIJIL = true;
            c62394OeE.LJJIJ = true;
            c62394OeE.LJJIJIL = new IDqS185S0200000_10(awemeSharePackage, context, 2);
        }
    }

    public final Object LIZIZ(Context context, BaseSharePackage baseSharePackage, InterfaceC62225ObV interfaceC62225ObV, InterfaceC67352kd interfaceC67352kd) {
        AwemeSharePackage awemeSharePackage;
        if (!(baseSharePackage instanceof AwemeSharePackage) || (awemeSharePackage = (AwemeSharePackage) baseSharePackage) == null) {
            return C76800UCe.LIZ;
        }
        if (interfaceC62225ObV.LJIIIIZZ()) {
            if (awemeSharePackage.extras.getBoolean("is_match_campaign_condition", false) && TextUtils.isEmpty(awemeSharePackage.extras.getString("share_campaign_id"))) {
                String LIZIZ = C39792FjY.LIZIZ();
                String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
                Keva LIZ = C39792FjY.LIZ();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("skip_campaign_times");
                LIZ2.append(curUserId);
                LIZ2.append(LIZIZ);
                C39792FjY.LIZ().storeInt(a1.LJ("skip_campaign_times", curUserId, LIZIZ), LIZ.getInt(X1D.LIZIZ(LIZ2), 0) + 1);
            }
            if (this.LIZJ.getAwemeType() != 40 && C62359Odf.LJ(awemeSharePackage.LJIILLIIL(), interfaceC62225ObV, false) && C53274KvW.LIZ()) {
                if (!o.LJ(interfaceC62225ObV.key(), "copy")) {
                    C53275KvX.LIZ();
                    Activity LJIJJ = C45804HyK.LJIJJ(context);
                    if (LJIJJ != null) {
                        C26045AKb c26045AKb = new C26045AKb(LJIJJ);
                        c26045AKb.LIZLLL(C52191Ke3.LIZ());
                        c26045AKb.LJIIIIZZ(R.string.em8);
                        c26045AKb.LJIIJ();
                    }
                    Object LIZJ = C1JD.LIZJ(C52191Ke3.LIZ(), interfaceC67352kd);
                    if (LIZJ == EnumC58928NAu.COROUTINE_SUSPENDED) {
                        return LIZJ;
                    }
                    return C76800UCe.LIZ;
                }
                IMService.createIIMServicebyMonsterPlugin(false).getAutoMessageTooltipHelper().LIZLLL();
            }
        }
        return C76800UCe.LIZ;
    }

    public final void LJIIJ(InterfaceC62225ObV channel, boolean z, BaseSharePackage baseSharePackage, Context context) {
        AwemeSharePackage awemeSharePackage;
        String str;
        String str2;
        AbstractC62226ObW abstractC62226ObW;
        String str3;
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        IEncourageLogInService LIZJ = EncourageLoginPopupManager.LIZJ();
        String str4 = null;
        if ((baseSharePackage instanceof AwemeSharePackage) && (awemeSharePackage = (AwemeSharePackage) baseSharePackage) != null && awemeSharePackage.aweme != null) {
            if (LIZJ != null) {
                Activity activity = this.LIZ;
                Bundle bundle = awemeSharePackage.extras;
                if (bundle == null || (str3 = bundle.getString("share_platform")) == null) {
                    str3 = "";
                }
                LIZJ.LIZ(activity, str3, "click_share");
            }
            Bundle bundle2 = this.LJ;
            Bundle bundle3 = awemeSharePackage.extras;
            if (bundle3 != null) {
                str = bundle3.getString("share_form");
            } else {
                str = null;
            }
            bundle2.putString("share_form", str);
            Bundle bundle4 = this.LJ;
            Bundle bundle5 = awemeSharePackage.extras;
            if (bundle5 != null) {
                str2 = bundle5.getString("share_url");
            } else {
                str2 = null;
            }
            bundle4.putString("share_url", str2);
            if (z || !awemeSharePackage.LJIILLIIL().isAd()) {
                LJI(channel.key(), z, awemeSharePackage, context, this.LIZJ, channel.LJIIZILJ(), channel.LJIIIIZZ());
            }
            String aid = awemeSharePackage.LJIILLIIL().getAid();
            if (aid == null) {
                aid = "";
            }
            C109254Qn.LIZ(aid, channel.key());
            C1A7.LJIILIIL().LJFF("last_share_way", "outside_channel");
            if (z) {
                if (o.LJ(channel.key(), "copy")) {
                    C2U8.LIZ(new C2IO(1));
                } else if (!o.LJ(channel.key(), "chat_merge")) {
                    C2U8.LIZ(new C2IO(2));
                }
                if (IMService.createIIMServicebyMonsterPlugin(false).getShareService().LJIJ()) {
                    String string = this.LJ.getString("panel_source", "");
                    if ((o.LJ(string, "share_panel") || o.LJ(string, "long_press")) && !o.LJ(channel.key(), "repost")) {
                        C50420Jqa c50420Jqa = new C50420Jqa(78);
                        Bundle bundle6 = new Bundle();
                        bundle6.putBoolean("show_tooltip_after_resume", !o.LJ(channel.key(), "copy"));
                        bundle6.putString("quick_share_aid", this.LIZJ.getAid());
                        c50420Jqa.LJLJI = bundle6;
                        C2U8.LIZ(c50420Jqa);
                    }
                }
            }
            if ((channel instanceof CopyLinkChannel) || (channel instanceof C62232Obc)) {
                Bundle bundle7 = new Bundle();
                bundle7.putString("enter_from", this.LJII);
                bundle7.putString("enter_method", "share");
                if ((channel instanceof C62232Obc) && (abstractC62226ObW = (AbstractC62226ObW) channel) != null) {
                    str4 = abstractC62226ObW.label();
                }
                if (o.LJ(str4, "Facebook")) {
                    bundle7.putInt("first_platform", 2);
                } else if (o.LJ(str4, "SMS")) {
                    bundle7.putInt("first_platform", 1);
                }
                InterfaceC72642tA<C50420Jqa> interfaceC72642tA = this.LIZLLL;
                if (interfaceC72642tA != null) {
                    C50420Jqa c50420Jqa2 = new C50420Jqa(62);
                    c50420Jqa2.LJLJI = bundle7;
                    interfaceC72642tA.onInternalEvent(c50420Jqa2);
                }
            }
        }
    }

    public C62385Oe5(Activity activity, Fragment fragment, Aweme aweme, InterfaceC72642tA interfaceC72642tA, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(aweme, "aweme");
        this.LIZ = activity;
        this.LIZIZ = fragment;
        this.LIZJ = aweme;
        this.LIZLLL = interfaceC72642tA;
        this.LJ = bundle;
        this.LJFF = bundle.getBoolean("is_portrait", true);
        this.LJI = bundle.getInt("page_type");
        this.LJII = bundle.getString("event_type", "");
        this.LJIIIIZZ = bundle.getString("enter_method", "normal_share");
        this.LJIIIZ = bundle.getString("panel_source", "share_panel");
        this.LJIIJ = bundle.getString("detail_tab_name", "");
        this.LJIIJJI = bundle.getString("play_list_id", "");
        this.LJIIL = bundle.getString("play_list_id_key", "");
        this.LJIILIIL = bundle.getString("play_list_type", "");
        this.LJIILJJIL = bundle.getString("tab_name", "");
        this.LJIILL = bundle.getString("from", "");
        this.LJIILLIIL = bundle.getString("creation_id", "");
        this.LJIIZILJ = bundle.getString("tag_id", "");
        this.LJIJ = bundle.getString("extra_parent_tag_id", "");
        this.LJIJI = bundle.getString("previousPage", "");
        this.LJIJJ = bundle.getString("previousPagePosition", "");
        this.LJIJJLI = bundle.getString("category_name", "");
        this.LJIL = bundle.getString("from_page", "");
        C221108m2.LIZIZ(new AqS160S0100000_10(this, 602));
        this.LJJ = C47261Igj.LJJIJIIJI(0, 51, 52).contains(Integer.valueOf(aweme.getAwemeType()));
        this.LJJI = bundle.getString("collection_id");
        this.LJJIFFI = bundle.getString("collection_name");
        AbstractC65590Pog of = AbstractC65590Pog.of("instagram", "instagram_story", "snapchat", "zalo", "whatsapp", "kakaotalk");
        o.LJIIIIZZ(of, "of(\n        ChannelConta…akaotalkChannel.KEY\n    )");
        this.LJJII = of;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x03bd, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r1, "search_result") == false) goto L128;
     */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0023 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(java.lang.String r19, boolean r20, com.ss.android.ugc.aweme.sharer.model.SharePackage r21, android.content.Context r22, com.ss.android.ugc.aweme.feed.model.Aweme r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 961
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62385Oe5.LJI(java.lang.String, boolean, com.ss.android.ugc.aweme.sharer.model.SharePackage, android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, boolean, boolean):void");
    }
}
