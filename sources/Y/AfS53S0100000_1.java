package Y;

import X.A2F;
import X.A2G;
import X.A2I;
import X.AbstractC48820JEa;
import X.AbstractC84083Rs;
import X.ActivityC45651qj;
import X.AnonymousClass349;
import X.C0NB;
import X.C109544Rq;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C26045AKb;
import X.C2YK;
import X.C2YO;
import X.C31Q;
import X.C34B;
import X.C36922EeM;
import X.C37179EiV;
import X.C3B3;
import X.C3B7;
import X.C3C4;
import X.C3C5;
import X.C3EF;
import X.C3OH;
import X.C3QO;
import X.C3QP;
import X.C3SX;
import X.C3WT;
import X.C47261Igj;
import X.C48841JEv;
import X.C53700L5s;
import X.C56155M2d;
import X.C57391Mfj;
import X.C5S1;
import X.C61447O9r;
import X.C61878OQg;
import X.C64797Pbt;
import X.C68322mC;
import X.C68545QvF;
import X.C72582SeA;
import X.C73318Sq2;
import X.C75902yQ;
import X.C75912yR;
import X.C76800UCe;
import X.C77123UOp;
import X.C78688UuS;
import X.C89913fv;
import X.C8ID;
import X.C90013g5;
import X.C90253gT;
import X.C98453th;
import X.EF7;
import X.EnumC58006Mpe;
import X.EnumC72807Shn;
import X.EnumC87803cW;
import X.EnumC94693nd;
import X.FMX;
import X.H78;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.InterfaceC67352kd;
import X.InterfaceC73573Su9;
import X.InterfaceC84103Ru;
import X.InterfaceC88472Yns;
import X.InterfaceC92693kP;
import X.ORZ;
import X.OSZ;
import X.PO8;
import X.SY4;
import X.TC3;
import X.TLS;
import X.W5F;
import X.W5G;
import X.W5U;
import X.X1D;
import X.XJL;
import X.XKQ;
import X.XKX;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableInnerBeautyMaxValue;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.play.core.assetpacks.w0;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.commercialize.tcm.api.TcmBarStatus;
import com.ss.android.ugc.aweme.commercialize.tcm.api.TcmBarStatusResponse;
import com.ss.android.ugc.aweme.commercialize.tcm.view.TcmOrderStatusBottomBarAssem;
import com.ss.android.ugc.aweme.creatortools.videogift.Image;
import com.ss.android.ugc.aweme.creatortools.videogift.Requirement;
import com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftEligibilityActivity;
import com.ss.android.ugc.aweme.creatortools.videogift.VideoGiftEligibilityResponse;
import com.ss.android.ugc.aweme.detail.panel.AnalyticsDetailPanel;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindStatus;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindStatusCode;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindStatusResponseData;
import com.ss.android.ugc.aweme.emoji.systembigemoji.PreloadBigEmojiTask;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionNameCheckResponse;
import com.ss.android.ugc.aweme.friends.model.Friend;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import com.ss.android.ugc.aweme.friends.model.ShortenUrlModel;
import com.ss.android.ugc.aweme.homepage.landing.ForceBackFYPViewModel;
import com.ss.android.ugc.aweme.im.sdk.activitystatus.ActivityStatusViewModelImpl;
import com.ss.android.ugc.aweme.im.sdk.activitystatus.data.api.ActivityStatusAPI;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.GiphyViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.model.GiphyDataBean;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.FocusedSessionListWidget;
import com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragmentV2;
import com.ss.android.ugc.aweme.im.sdk.search.ui.IMSearchFragment;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.live.notification.repository.NudgeData;
import com.ss.android.ugc.aweme.live.notification.repository.NudgeInfo;
import com.ss.android.ugc.aweme.live.notification.repository.NudgeInfoResponse;
import com.ss.android.ugc.aweme.live.notification.ui.NotificationLiveBottomDialog;
import com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviDataModel;
import com.ss.android.ugc.aweme.model.api.response.ProfileNaviCreateResponse;
import com.ss.android.ugc.aweme.model.api.response.ProfileNaviListResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qna.vm.QnaCreationViewModel;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.story.model.StoryViewInfoResponse;
import com.ss.android.ugc.aweme.ug.guide.NotInterestedBottomSheetFragment;
import com.ss.android.ugc.aweme.user.password.QueryUserPasswordSetStatusData;
import com.ss.android.ugc.aweme.user.password.QueryUserPasswordSetStatusResponse;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityAbility;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class AfS53S0100000_1 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            case 5:
                accept$5(this, obj);
                return;
            case 6:
                accept$6(this, obj);
                return;
            case 7:
                accept$7(this, obj);
                return;
            case 8:
                accept$8(this, obj);
                return;
            case 9:
                accept$9(this, obj);
                return;
            case 10:
                accept$10(this, obj);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                accept$11(this, obj);
                return;
            case 12:
                accept$12(this, obj);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                accept$13(this, obj);
                return;
            case 14:
                accept$14(this, obj);
                return;
            case 15:
                accept$15(this, obj);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                accept$16(this, obj);
                return;
            case 17:
                accept$17(this, obj);
                return;
            case 18:
                accept$18(this, obj);
                return;
            case 19:
                accept$19(this, obj);
                return;
            case 20:
                accept$20(this, obj);
                return;
            case 21:
                accept$21(this, obj);
                return;
            case 22:
                accept$22(this, obj);
                return;
            case 23:
                accept$23(this, obj);
                return;
            case 24:
                accept$24(this, obj);
                return;
            case 25:
                accept$25(this, obj);
                return;
            case 26:
                accept$26(this, obj);
                return;
            case 27:
                accept$27(this, obj);
                return;
            case 28:
                accept$28(this, obj);
                return;
            case 29:
                accept$29(this, obj);
                return;
            case 30:
                accept$30(this, obj);
                return;
            case 31:
                accept$31(this, obj);
                return;
            case 32:
                accept$32(this, obj);
                return;
            case 33:
                accept$33(this, obj);
                return;
            case 34:
                accept$34(this, obj);
                return;
            case 35:
                accept$35(this, obj);
                return;
            case 36:
                accept$36(this, obj);
                return;
            case 37:
                accept$37(this, obj);
                return;
            case 38:
                accept$38(this, obj);
                return;
            case 39:
                accept$39(this, obj);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                accept$40(this, obj);
                return;
            case 41:
                accept$41(this, obj);
                return;
            case 42:
                accept$42(this, obj);
                return;
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                accept$43(this, obj);
                return;
            case 44:
                accept$44(this, obj);
                return;
            case 45:
                accept$45(this, obj);
                return;
            case 46:
                accept$46(this, obj);
                return;
            case 47:
                accept$47(this, obj);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                accept$48(this, obj);
                return;
            case C61447O9r.LJIIJ:
                accept$49(this, obj);
                return;
            case 50:
                accept$50(this, obj);
                return;
            case 51:
                accept$51(this, obj);
                return;
            case 52:
                accept$52(this, obj);
                return;
            case 53:
                accept$53(this, obj);
                return;
            case 54:
                accept$54(this, obj);
                return;
            case 55:
                accept$55(this, obj);
                return;
            case 56:
                accept$56(this, obj);
                return;
            case 57:
                accept$57(this, obj);
                return;
            case 58:
                accept$58(this, obj);
                return;
            case 59:
                accept$59(this, obj);
                return;
            case 60:
                accept$60(this, obj);
                return;
            case 61:
                accept$61(this, obj);
                return;
            case BaseNotice.CREATOR /* 62 */:
                accept$62(this, obj);
                return;
            case 63:
                accept$63(this, obj);
                return;
            case 64:
                accept$64(this, obj);
                return;
            case 65:
                accept$65(this, obj);
                return;
            case 66:
                accept$66(this, obj);
                return;
            case 67:
                accept$67(this, obj);
                return;
            case 68:
                accept$68(this, obj);
                return;
            case 69:
                accept$69(this, obj);
                return;
            case 70:
                accept$70(this, obj);
                return;
            case 71:
                accept$71(this, obj);
                return;
            case SubscriptionExpireRemindHourSetting.DEFAULT /* 72 */:
                accept$72(this, obj);
                return;
            case 73:
                accept$73(this, obj);
                return;
            case 74:
                accept$74(this, obj);
                return;
            case 75:
                accept$75(this, obj);
                return;
            case 76:
                accept$76(this, obj);
                return;
            case 77:
                accept$77(this, obj);
                return;
            case 78:
                accept$78(this, obj);
                return;
            case 79:
                accept$79(this, obj);
                return;
            case 80:
                accept$80(this, obj);
                return;
            case 81:
                accept$81(this, obj);
                return;
            case 82:
                accept$82(this, obj);
                return;
            case 83:
                accept$83(this, obj);
                return;
            case 84:
                accept$84(this, obj);
                return;
            case LiveAnchorEnableInnerBeautyMaxValue.DEFAULT /* 85 */:
                accept$85(this, obj);
                return;
            case 86:
                accept$86(this, obj);
                return;
            case 87:
                accept$87(this, obj);
                return;
            case 88:
                accept$88(this, obj);
                return;
            case 89:
                accept$89(this, obj);
                return;
            case 90:
                accept$90(this, obj);
                return;
            case 91:
                accept$91(this, obj);
                return;
            case 92:
                accept$92(this, obj);
                return;
            case 93:
                accept$93(this, obj);
                return;
            case 94:
                accept$94(this, obj);
                return;
            case 95:
                accept$95(this, obj);
                return;
            case 96:
                accept$96(this, obj);
                return;
            case 97:
                accept$97(this, obj);
                return;
            case 98:
                accept$98(this, obj);
                return;
            case 99:
                accept$99(this, obj);
                return;
            case 100:
                accept$100(this, obj);
                return;
            case 101:
                accept$101(this, obj);
                return;
            case 102:
                accept$102(this, obj);
                return;
            case 103:
                accept$103(this, obj);
                return;
            case 104:
                accept$104(this, obj);
                return;
            case 105:
                accept$105(this, obj);
                return;
            default:
                return;
        }
    }

    public AfS53S0100000_1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void accept$0(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        ((C56155M2d) afS53S0100000_1.l0).LJLL = ((StoryViewInfoResponse) obj).getPlayVideoViewers();
        ((TextView) ((C56155M2d) afS53S0100000_1.l0).LJLJJLL.findViewById(R.id.me4)).setText(C77123UOp.LJJIIJ(((C56155M2d) afS53S0100000_1.l0).LJLL));
    }

    public static final void accept$1(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        C26045AKb c26045AKb = new C26045AKb((View) afS53S0100000_1.l0);
        c26045AKb.LJIIIIZZ(R.string.c8n);
        c26045AKb.LJIIJ();
    }

    public static final void accept$10(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) afS53S0100000_1.l0;
        OSZ osz = new OSZ(null, ((Throwable) obj).getMessage());
        C3C5.m7constructorimpl(osz);
        interfaceC67352kd.resumeWith(osz);
    }

    public static final void accept$100(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        C26045AKb c26045AKb = new C26045AKb((Activity) afS53S0100000_1.l0);
        c26045AKb.LJIIIIZZ(R.string.rf3);
        c26045AKb.LJIIJ();
    }

    public static final void accept$101(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) afS53S0100000_1.l0;
        C3C5.m7constructorimpl(obj);
        interfaceC67352kd.resumeWith(obj);
    }

    public static final void accept$102(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        C31Q c31q = (C31Q) afS53S0100000_1.l0;
        c31q.LIZJ = false;
        C31Q.LJIIJ(c31q, C31Q.class.getName(), 0);
    }

    public static final void accept$103(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        Boolean isBack = (Boolean) obj;
        o.LJIIIIZZ(isBack, "isBack");
        if (isBack.booleanValue()) {
            C31Q c31q = (C31Q) afS53S0100000_1.l0;
            c31q.LIZJ = true;
            C31Q.LJIIJ(c31q, C31Q.class.getName(), 1);
            return;
        }
        C31Q c31q2 = (C31Q) afS53S0100000_1.l0;
        c31q2.LIZJ = false;
        C31Q.LJIIJ(c31q2, C31Q.class.getName(), 0);
        if (!C75912yR.LIZ()) {
            return;
        }
        List<C109544Rq> msgListCacheForBackground = c31q2.LJII;
        o.LJIIIIZZ(msgListCacheForBackground, "msgListCacheForBackground");
        if (!(true ^ msgListCacheForBackground.isEmpty())) {
            return;
        }
        XKX.LIZLLL(C48841JEv.LIZ(C31Q.LJIIIIZZ()), null, null, new C75902yQ(c31q2, null), 3);
    }

    public static final void accept$104(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        boolean LJII = ((ActivityStatusViewModelImpl) afS53S0100000_1.l0).LLD.LJII();
        C98453th c98453th = ((ActivityStatusViewModelImpl) afS53S0100000_1.l0).LJLILLLLZI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isSharingStatus changes, current value: ");
        LIZ.append(LJII);
        c98453th.LIZ(X1D.LIZIZ(LIZ));
        if (LJII) {
            ActivityStatusViewModelImpl activityStatusViewModelImpl = (ActivityStatusViewModelImpl) afS53S0100000_1.l0;
            activityStatusViewModelImpl.LJZL = true;
            C3B3.LIZJ(activityStatusViewModelImpl, "activity_status_setting_changed", 0L, 6);
            ((ActivityStatusViewModelImpl) afS53S0100000_1.l0).LJIILIIL(true);
            return;
        }
        ((ActivityStatusViewModelImpl) afS53S0100000_1.l0).LJ();
    }

    public static final void accept$105(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        Throwable it = (Throwable) obj;
        C98453th c98453th = ((ActivityStatusViewModelImpl) afS53S0100000_1.l0).LJLILLLLZI;
        o.LJIIIIZZ(it, "it");
        c98453th.LIZLLL(it);
    }

    public static final void accept$11(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) afS53S0100000_1.l0;
        OSZ osz = new OSZ(null, ((Throwable) obj).getMessage());
        C3C5.m7constructorimpl(osz);
        interfaceC67352kd.resumeWith(osz);
    }

    public static final void accept$12(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        C26045AKb c26045AKb = new C26045AKb((View) afS53S0100000_1.l0);
        c26045AKb.LJIIIIZZ(R.string.dyn);
        c26045AKb.LJIIJ();
    }

    public static final void accept$13(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        C26045AKb c26045AKb = new C26045AKb((View) afS53S0100000_1.l0);
        c26045AKb.LJIIIIZZ(R.string.dyn);
        c26045AKb.LJIIJ();
    }

    public static final void accept$14(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        C57391Mfj c57391Mfj = (C57391Mfj) obj;
        if (c57391Mfj.LIZIZ == EnumC58006Mpe.CHECKED && o.LJ(c57391Mfj.LJ, "chat_list")) {
            SessionListFragmentV2 sessionListFragmentV2 = (SessionListFragmentV2) afS53S0100000_1.l0;
            sessionListFragmentV2._$_findCachedViewById(R.id.l_2).postDelayed(new ARunnableS37S0100000_1(sessionListFragmentV2, 9), 0L);
        }
    }

    public static final void accept$15(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        List<User> list;
        List it = (List) obj;
        HashMap hashMap = new HashMap();
        o.LJIIIIZZ(it, "it");
        Iterator it2 = it.iterator();
        while (it2.hasNext()) {
            User user = (User) ((OSZ) it2.next()).getSecond();
            if (user != null) {
                String uid = user.getUid();
                o.LJIIIIZZ(uid, "user.uid");
                hashMap.put(uid, user);
            }
        }
        OSZ osz = (OSZ) ORZ.LJLLLL(((TC3) afS53S0100000_1.l0).LJLJI.LJIIIIZZ());
        if (osz == null || (list = (List) osz.getSecond()) == null) {
            list = C61878OQg.INSTANCE;
        }
        for (User user2 : list) {
            User user3 = (User) hashMap.get(user2.getUid());
            if (user3 != null) {
                user2.setFollowStatus(user3.getFollowStatus());
            }
        }
    }

    public static final void accept$16(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        String str = ((TC3) afS53S0100000_1.l0).LJLJJL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("subscribe failed ");
        LIZ.append(obj);
        C36922EeM.LIZLLL(2, str, X1D.LIZIZ(LIZ));
    }

    public static final void accept$17(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        ((InterfaceC65784Pro) afS53S0100000_1.l0).invoke();
    }

    public static final void accept$18(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        ((InterfaceC65784Pro) afS53S0100000_1.l0).invoke();
    }

    public static final void accept$19(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        String str;
        String uid = ((User) afS53S0100000_1.l0).getUid();
        o.LJIIIIZZ(uid, "user.uid");
        Long l = (Long) ((Map) obj).get(Long.valueOf(CastLongProtector.parseLong(uid)));
        if (l != null) {
            User user = (User) afS53S0100000_1.l0;
            long longValue = l.longValue();
            String valueOf = String.valueOf(longValue);
            String uid2 = user.getUid();
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("anchor_id", uid2);
            c188727au.LJIIIZ("room_id", valueOf);
            FMX.LJIIL("livesdk_push_click", c188727au.LIZ);
            String uid3 = user.getUid();
            if (longValue > 0) {
                str = "live_on";
            } else {
                str = "live_finish";
            }
            C78688UuS.LJJJJZI(longValue, uid3, str);
        }
    }

    public static final void accept$2(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        String str;
        ProfileNaviCreateResponse profileNaviCreateResponse = (ProfileNaviCreateResponse) obj;
        if (profileNaviCreateResponse != null) {
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS53S0100000_1.l0;
            if (profileNaviCreateResponse.error_code == 0 && (str = profileNaviCreateResponse.naviId) != null) {
                interfaceC88472Yns.invoke(str);
            }
        }
    }

    public static final void accept$20(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) afS53S0100000_1.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void accept$21(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        Activity activity = ((AnalyticsDetailPanel) afS53S0100000_1.l0).activity;
        o.LJIIIIZZ(activity, "activity");
        C26045AKb c26045AKb = new C26045AKb(activity);
        c26045AKb.LJIIIIZZ(R.string.rjy);
        c26045AKb.LJIIJ();
    }

    public static final void accept$22(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        C26045AKb c26045AKb = new C26045AKb((ActivityC45651qj) afS53S0100000_1.l0);
        c26045AKb.LJIIIIZZ(R.string.g5i);
        c26045AKb.LJIIJ();
    }

    public static final void accept$23(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        C26045AKb c26045AKb = new C26045AKb((ActivityC45651qj) afS53S0100000_1.l0);
        c26045AKb.LJIIIIZZ(R.string.g5i);
        c26045AKb.LJIIJ();
    }

    public static final void accept$24(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        ((InterfaceC88472Yns) afS53S0100000_1.l0).invoke(Boolean.valueOf(o.LJ(((CollectionNameCheckResponse) obj).isValid, Boolean.TRUE)));
    }

    public static final void accept$25(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        C26045AKb c26045AKb = new C26045AKb((ActivityC45651qj) afS53S0100000_1.l0);
        c26045AKb.LJIIIIZZ(R.string.g5i);
        c26045AKb.LJIIJ();
    }

    public static final void accept$26(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        C26045AKb c26045AKb = new C26045AKb((ActivityC45651qj) afS53S0100000_1.l0);
        c26045AKb.LJIIIIZZ(R.string.g5i);
        c26045AKb.LJIIJ();
    }

    public static final void accept$27(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        C26045AKb c26045AKb = new C26045AKb((ActivityC45651qj) afS53S0100000_1.l0);
        c26045AKb.LJIIIIZZ(R.string.g5i);
        c26045AKb.LJIIJ();
    }

    public static final void accept$28(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("postChatStrangeUnLimit error ");
        LIZ.append(obj);
        C34B.LIZJ("StrangerChatRiskHint", X1D.LIZIZ(LIZ));
        ((C3WT) afS53S0100000_1.l0).LJFF();
        ((C3WT) afS53S0100000_1.l0).LJLJJL = false;
    }

    public static final void accept$29(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        C3OH c3oh = (C3OH) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("data from focusedSessionListViewModel: ");
        LIZ.append(c3oh);
        C34B.LIZIZ("FocusedSessionListWidget", X1D.LIZIZ(LIZ));
        if (c3oh.LIZ.isEmpty() && ((FocusedSessionListWidget) afS53S0100000_1.l0).LLII) {
            FocusedSessionListWidget focusedSessionListWidget = (FocusedSessionListWidget) afS53S0100000_1.l0;
            String str = focusedSessionListWidget.LLFZ;
            String str2 = focusedSessionListWidget.LLI;
            Integer num = focusedSessionListWidget.LLIFFJFJJ;
            focusedSessionListWidget.LJLJL.Fd(str, str2);
            focusedSessionListWidget.LJLJL.Gr0(num, str, str2);
        }
        if ((C3SX.LIZ() & 64) != 0) {
            ((FocusedSessionListWidget) afS53S0100000_1.l0).LJIJJ(c3oh);
        }
    }

    public static final void accept$3(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        ((InterfaceC88472Yns) afS53S0100000_1.l0).invoke("");
    }

    public static final void accept$30(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        ((FocusedSessionListWidget) afS53S0100000_1.l0).LLF.postValue(EnumC94693nd.LOADING);
    }

    public static final void accept$31(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        if (((C3OH) obj).LIZ.isEmpty() && ((FocusedSessionListWidget) afS53S0100000_1.l0).LLII) {
            FocusedSessionListWidget focusedSessionListWidget = (FocusedSessionListWidget) afS53S0100000_1.l0;
            String str = focusedSessionListWidget.LLFZ;
            String str2 = focusedSessionListWidget.LLI;
            Integer num = focusedSessionListWidget.LLIFFJFJJ;
            focusedSessionListWidget.LJLJL.Fd(str, str2);
            focusedSessionListWidget.LJLJL.Gr0(num, str, str2);
        }
    }

    public static final void accept$32(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        w0 w0Var;
        Boolean it = (Boolean) obj;
        o.LJIIIIZZ(it, "it");
        if (it.booleanValue() && (w0Var = ((IMSearchFragment) afS53S0100000_1.l0).LJLJJI) != null) {
            w0Var.LIZIZ();
        }
    }

    public static final void accept$33(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) afS53S0100000_1.l0;
        A2F a2f = A2G.LIZ;
        Exception exc = new Exception(((Throwable) obj).getMessage());
        a2f.getClass();
        A2I LIZJ = A2F.LIZJ(exc);
        C3C5.m7constructorimpl(LIZJ);
        interfaceC67352kd.resumeWith(LIZJ);
    }

    public static final void accept$34(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) afS53S0100000_1.l0;
        A2F a2f = A2G.LIZ;
        Exception exc = new Exception(((Throwable) obj).getMessage());
        a2f.getClass();
        A2I LIZJ = A2F.LIZJ(exc);
        C3C5.m7constructorimpl(LIZJ);
        interfaceC67352kd.resumeWith(LIZJ);
    }

    public static final void accept$35(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) afS53S0100000_1.l0;
        A2F a2f = A2G.LIZ;
        Exception exc = new Exception(((Throwable) obj).getMessage());
        a2f.getClass();
        A2I LIZJ = A2F.LIZJ(exc);
        C3C5.m7constructorimpl(LIZJ);
        interfaceC67352kd.resumeWith(LIZJ);
    }

    public static final void accept$36(AfS53S0100000_1 afS53S0100000_1, Object it) {
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS53S0100000_1.l0;
        o.LJIIIIZZ(it, "it");
        interfaceC88472Yns.invoke(it);
    }

    public static final void accept$37(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        C26045AKb c26045AKb = new C26045AKb((View) afS53S0100000_1.l0);
        c26045AKb.LJIIIIZZ(R.string.c8n);
        c26045AKb.LJIIJ();
    }

    public static final void accept$38(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        W5G w5g = (W5G) afS53S0100000_1.l0;
        if (w5g != null) {
            w5g.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        W5G w5g2 = (W5G) afS53S0100000_1.l0;
        if (w5g2 != null) {
            w5g2.setImageBitmap(bitmap);
        }
    }

    public static final void accept$39(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        ValueAnimator valueAnimator;
        Float it = (Float) obj;
        C53700L5s c53700L5s = (C53700L5s) afS53S0100000_1.l0;
        o.LJIIIIZZ(it, "it");
        float floatValue = it.floatValue();
        if (floatValue == c53700L5s.LJLLL) {
            return;
        }
        ValueAnimator valueAnimator2 = c53700L5s.LJLLILLLL;
        if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = c53700L5s.LJLLILLLL) != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator3 = c53700L5s.LJLLILLLL;
        if (valueAnimator3 != null) {
            C16880lQ.LJLJL(valueAnimator3);
        }
        ValueAnimator valueAnimator4 = c53700L5s.LJLLILLLL;
        if (valueAnimator4 != null) {
            valueAnimator4.removeAllUpdateListeners();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(c53700L5s.LJLLL, floatValue);
        c53700L5s.LJLLILLLL = ofFloat;
        if (ofFloat != null) {
            ofFloat.addUpdateListener(new AUListenerS2S0100001_1(floatValue, c53700L5s, 0));
        }
        ValueAnimator valueAnimator5 = c53700L5s.LJLLILLLL;
        if (valueAnimator5 != null) {
            valueAnimator5.setDuration(Math.abs(floatValue - c53700L5s.LJLLL) * LiveNetAdaptiveHurryTimeSetting.DEFAULT);
        }
        ValueAnimator valueAnimator6 = c53700L5s.LJLLILLLL;
        if (valueAnimator6 != null) {
            valueAnimator6.setInterpolator(new LinearInterpolator());
        }
        ValueAnimator valueAnimator7 = c53700L5s.LJLLILLLL;
        if (valueAnimator7 == null) {
            return;
        }
        valueAnimator7.start();
    }

    public static final void accept$4(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        ActivityStatusAPI.Result it = (ActivityStatusAPI.Result) obj;
        C3B7 c3b7 = (C3B7) afS53S0100000_1.l0;
        o.LJIIIIZZ(it, "it");
        c3b7.LIZIZ(it);
    }

    public static final void accept$40(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        ((NotInterestedBottomSheetFragment) afS53S0100000_1.l0).vl("background");
    }

    public static final void accept$41(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        ((AbstractC48820JEa) ((C2YK) afS53S0100000_1.l0).LIZ.getValue()).LJIIJ(new AqS151S0100000_1((List) obj, (List<String>) 767));
    }

    public static final void accept$42(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        Throwable err = (Throwable) obj;
        AbstractC48820JEa abstractC48820JEa = (AbstractC48820JEa) ((C2YK) afS53S0100000_1.l0).LIZ.getValue();
        o.LJIIIIZZ(err, "err");
        abstractC48820JEa.LJFF("verify error", err);
    }

    public static final void accept$43(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        ((TLS) afS53S0100000_1.l0).LJIJI.onNext(new OSZ(obj, Boolean.TRUE));
    }

    public static final void accept$44(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        ((TLS) afS53S0100000_1.l0).LJIJI.onNext(new OSZ(obj, Boolean.FALSE));
    }

    public static final void accept$45(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        ((TLS) afS53S0100000_1.l0).LJIJI.onNext(new OSZ(obj, Boolean.TRUE));
    }

    public static final void accept$46(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        ((TLS) afS53S0100000_1.l0).LJIJI.onNext(new OSZ(obj, Boolean.FALSE));
    }

    public static final void accept$47(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        OSZ osz = (OSZ) obj;
        ((TLS) afS53S0100000_1.l0).LJIIZILJ.onNext(new OSZ(osz.getFirst(), Integer.valueOf(((Number) osz.getSecond()).intValue())));
    }

    public static final void accept$48(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        ((TLS) afS53S0100000_1.l0).getClass();
    }

    public static final void accept$49(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        ProfileNaviListResponse profileNaviListResponse = (ProfileNaviListResponse) obj;
        if (profileNaviListResponse != null && profileNaviListResponse.error_code == 0) {
            List<ProfileNaviDataModel> list = profileNaviListResponse.naviList;
            if (list == null || list.isEmpty()) {
                ((InterfaceC65784Pro) afS53S0100000_1.l0).invoke();
            }
        }
    }

    public static final void accept$5(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        String str;
        ActivityStatusAPI.Result result = (ActivityStatusAPI.Result) obj;
        PO8 po8 = ((C3B7) afS53S0100000_1.l0).LIZJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("reportStatus logid ");
        BaseResponse.ServerTimeExtra serverTimeExtra = result.extra;
        if (serverTimeExtra != null) {
            str = serverTimeExtra.logid;
        } else {
            str = null;
        }
        LIZ.append(str);
        po8.i(X1D.LIZIZ(LIZ));
        ((C3B7) afS53S0100000_1.l0).LIZIZ(result);
    }

    public static final void accept$50(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        if (obj instanceof C64797Pbt) {
            obj = ((C64797Pbt) obj).LIZIZ;
        }
        Object obj2 = null;
        if (Response.class.isAssignableFrom(Response.class) || !(obj instanceof Response)) {
            XJL xjl = (XJL) afS53S0100000_1.l0;
            if (!(obj instanceof Response)) {
                obj = null;
            }
            C3C5.m7constructorimpl(obj);
            xjl.resumeWith(obj);
            return;
        }
        Response response = (Response) obj;
        if (response.isCodeOK()) {
            Object obj3 = response.data;
            if (obj3 == null) {
                obj3 = Boolean.TRUE;
            }
            if (obj3 instanceof Response) {
                obj2 = obj3;
            }
        }
        XJL xjl2 = (XJL) afS53S0100000_1.l0;
        C3C5.m7constructorimpl(obj2);
        xjl2.resumeWith(obj2);
    }

    public static final void accept$51(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        XJL xjl = (XJL) afS53S0100000_1.l0;
        C3C5.m7constructorimpl(null);
        xjl.resumeWith(null);
    }

    public static final void accept$52(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        InterfaceC92693kP interfaceC92693kP = (InterfaceC92693kP) ((C68322mC) afS53S0100000_1.l0).element;
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
    }

    public static final void accept$53(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        InterfaceC92693kP interfaceC92693kP = (InterfaceC92693kP) ((C68322mC) afS53S0100000_1.l0).element;
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
    }

    public static final void accept$54(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        String str;
        QueryUserPasswordSetStatusData queryUserPasswordSetStatusData;
        boolean z;
        QueryUserPasswordSetStatusData queryUserPasswordSetStatusData2;
        Boolean bool;
        QueryUserPasswordSetStatusResponse queryUserPasswordSetStatusResponse = (QueryUserPasswordSetStatusResponse) obj;
        String str2 = null;
        if (queryUserPasswordSetStatusResponse != null) {
            str = queryUserPasswordSetStatusResponse.message;
        } else {
            str = null;
        }
        if (TextUtils.equals(str, "success")) {
            if (queryUserPasswordSetStatusResponse != null && (queryUserPasswordSetStatusData2 = queryUserPasswordSetStatusResponse.data) != null && (bool = queryUserPasswordSetStatusData2.hasSet) != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            C68545QvF.LIZ(z);
            C2YO c2yo = (C2YO) afS53S0100000_1.l0;
            if (c2yo != null) {
                c2yo.onUpdateSuccess(z);
                return;
            }
            return;
        }
        C2YO c2yo2 = (C2YO) afS53S0100000_1.l0;
        if (c2yo2 == null) {
            return;
        }
        if (queryUserPasswordSetStatusResponse != null && (queryUserPasswordSetStatusData = queryUserPasswordSetStatusResponse.data) != null) {
            str2 = queryUserPasswordSetStatusData.description;
        }
        c2yo2.onUpdateFailed(str2);
    }

    public static final void accept$55(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        C2YO c2yo = (C2YO) afS53S0100000_1.l0;
        if (c2yo != null) {
            c2yo.onUpdateFailed(EF7.LIZIZ().getString(R.string.im9));
        }
    }

    public static final void accept$56(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        String str;
        ProfileNaviCreateResponse profileNaviCreateResponse = (ProfileNaviCreateResponse) obj;
        if (profileNaviCreateResponse != null) {
            C72582SeA c72582SeA = (C72582SeA) afS53S0100000_1.l0;
            if (profileNaviCreateResponse.error_code == 0 && (str = profileNaviCreateResponse.naviId) != null) {
                c72582SeA.LIZ = str;
            }
        }
    }

    public static final void accept$57(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        Boolean isInBackground = (Boolean) obj;
        XKQ xkq = ((ForceBackFYPViewModel) afS53S0100000_1.l0).LJLJJLL;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        o.LJIIIIZZ(isInBackground, "isInBackground");
        if (isInBackground.booleanValue()) {
            List list = (List) ((ForceBackFYPViewModel) afS53S0100000_1.l0).LJLJL.getValue();
            ForceBackFYPViewModel forceBackFYPViewModel = (ForceBackFYPViewModel) afS53S0100000_1.l0;
            if ((list instanceof Collection) && list.isEmpty()) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (forceBackFYPViewModel.LJLILLLLZI.vv0((String) it.next())) {
                    ForceBackFYPViewModel forceBackFYPViewModel2 = (ForceBackFYPViewModel) afS53S0100000_1.l0;
                    forceBackFYPViewModel2.LJLJJLL = XKX.LIZLLL(ViewModelKt.getViewModelScope(forceBackFYPViewModel2), forceBackFYPViewModel2.LJLJI, null, new C3EF(forceBackFYPViewModel2.LJLJJI, forceBackFYPViewModel2, null), 2);
                    return;
                }
            }
        }
    }

    public static final void accept$58(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        C5S1 c5s1 = new C5S1((Context) afS53S0100000_1.l0);
        c5s1.LIZJ(R.string.seq);
        c5s1.LJ();
    }

    public static final void accept$59(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        C5S1 c5s1 = new C5S1((Context) afS53S0100000_1.l0);
        c5s1.LIZJ(R.string.sep);
        c5s1.LJ();
    }

    public static final void accept$6(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) afS53S0100000_1.l0;
        A2F a2f = A2G.LIZ;
        Exception exc = new Exception(((Throwable) obj).getMessage());
        a2f.getClass();
        A2I LIZJ = A2F.LIZJ(exc);
        C3C5.m7constructorimpl(LIZJ);
        interfaceC67352kd.resumeWith(LIZJ);
    }

    public static final void accept$60(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        Throwable it = (Throwable) obj;
        InterfaceC84103Ru interfaceC84103Ru = ((AbstractC84083Rs) afS53S0100000_1.l0).LJLLILLLL;
        if (interfaceC84103Ru != null) {
            o.LJIIIIZZ(it, "it");
            interfaceC84103Ru.F70(it);
        }
    }

    public static final void accept$61(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        ((C90253gT) afS53S0100000_1.l0).getAllContactsObserver().invoke(obj);
    }

    public static final void accept$62(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        ((C90253gT) afS53S0100000_1.l0).getInviteUsersObserver().invoke(obj);
    }

    public static final void accept$63(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        ((C90253gT) afS53S0100000_1.l0).getSearchObserver().invoke(obj);
    }

    public static final void accept$64(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        ((InterfaceC73573Su9) afS53S0100000_1.l0).onNext(obj);
    }

    public static final void accept$65(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        ((InterfaceC73573Su9) afS53S0100000_1.l0).onNext(C61878OQg.INSTANCE);
        ((Throwable) obj).getMessage();
    }

    public static final void accept$66(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        ((InterfaceC88472Yns) afS53S0100000_1.l0).invoke(Long.valueOf(System.currentTimeMillis()));
    }

    public static final void accept$67(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("preloadWhenBackground=");
        LIZ.append(booleanValue);
        C34B.LJI("PreloadBigEmojiTask", X1D.LIZIZ(LIZ));
        if (booleanValue) {
            C37179EiV.LJFF.postDelayed(((PreloadBigEmojiTask) afS53S0100000_1.l0).LJLJI, 3000L);
            ((PreloadBigEmojiTask) afS53S0100000_1.l0).LJLILLLLZI = false;
        } else {
            PreloadBigEmojiTask preloadBigEmojiTask = (PreloadBigEmojiTask) afS53S0100000_1.l0;
            if (preloadBigEmojiTask.LJLILLLLZI) {
                return;
            }
            C37179EiV.LJFF.removeCallbacks(preloadBigEmojiTask.LJLJI);
        }
    }

    public static final void accept$68(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        XJL xjl = (XJL) afS53S0100000_1.l0;
        C3C5.m7constructorimpl(obj);
        xjl.resumeWith(obj);
    }

    public static final void accept$69(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        Throwable it = (Throwable) obj;
        XJL xjl = (XJL) afS53S0100000_1.l0;
        o.LJIIIIZZ(it, "it");
        C3C4 LIZ = C141335gf.LIZ(it);
        C3C5.m7constructorimpl(LIZ);
        xjl.resumeWith(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$7(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        BindStatusCode bindStatusCode;
        Map<String, BindStatus> bindStatusMap;
        BindStatus bindStatus;
        Response response = (Response) obj;
        if (response.isCodeOK()) {
            BindStatusResponseData bindStatusResponseData = (BindStatusResponseData) response.data;
            if (bindStatusResponseData != null && (bindStatusMap = bindStatusResponseData.getBindStatusMap()) != null && (bindStatus = bindStatusMap.get(((C3QO) afS53S0100000_1.l0).LIZ)) != null) {
                bindStatusCode = bindStatus.bindStatus;
            } else {
                bindStatusCode = null;
            }
            if (bindStatusCode == BindStatusCode.BINDING) {
                C3QO c3qo = (C3QO) afS53S0100000_1.l0;
                if (!c3qo.LIZJ) {
                    c3qo.LIZLLL.sendEmptyMessage(1);
                    return;
                }
                return;
            }
            if (bindStatusCode == BindStatusCode.SUCCESS) {
                C3QP c3qp = ((C3QO) afS53S0100000_1.l0).LIZIZ;
                if (c3qp != null) {
                    c3qp.LIZ();
                }
            } else {
                C3QP c3qp2 = ((C3QO) afS53S0100000_1.l0).LIZIZ;
                if (c3qp2 != null) {
                    c3qp2.LIZIZ();
                }
            }
            C3QO c3qo2 = (C3QO) afS53S0100000_1.l0;
            c3qo2.LIZLLL.removeCallbacksAndMessages(null);
            c3qo2.LIZJ = true;
            return;
        }
        C3QP c3qp3 = ((C3QO) afS53S0100000_1.l0).LIZIZ;
        if (c3qp3 == null) {
            return;
        }
        c3qp3.LIZIZ();
    }

    public static final void accept$70(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        XJL xjl = (XJL) afS53S0100000_1.l0;
        C3C5.m7constructorimpl(obj);
        xjl.resumeWith(obj);
    }

    public static final void accept$71(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        Throwable it = (Throwable) obj;
        XJL xjl = (XJL) afS53S0100000_1.l0;
        o.LJIIIIZZ(it, "it");
        C3C4 LIZ = C141335gf.LIZ(it);
        C3C5.m7constructorimpl(LIZ);
        xjl.resumeWith(LIZ);
    }

    public static final void accept$72(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        Throwable it = (Throwable) obj;
        QnaCreationViewModel qnaCreationViewModel = (QnaCreationViewModel) afS53S0100000_1.l0;
        o.LJIIIIZZ(it, "it");
        qnaCreationViewModel.getClass();
        qnaCreationViewModel.setState(new AqS167S0100000_1(it, 352));
    }

    public static final void accept$73(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        Throwable th = (Throwable) obj;
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) afS53S0100000_1.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("failed to fetch topics!  error: ");
        LIZ.append(th.getMessage());
        C0NB.LJ("GameTopicLogic", X1D.LIZIZ(LIZ));
    }

    public static final void accept$74(AfS53S0100000_1 afS53S0100000_1, Object it) {
        InterfaceC88472Yns<List<? extends IMUser>, C76800UCe> invitedUsersObserver = ((C90013g5) afS53S0100000_1.l0).getInvitedUsersObserver();
        o.LJIIIIZZ(it, "it");
        invitedUsersObserver.invoke(it);
    }

    public static final void accept$75(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        C89913fv c89913fv = (C89913fv) afS53S0100000_1.l0;
        c89913fv.getClass();
        C26045AKb c26045AKb = new C26045AKb(c89913fv.LJLIL);
        c26045AKb.LJIIIIZZ(R.string.rf3);
        c26045AKb.LIZLLL(3000L);
        c26045AKb.LJIIJ();
    }

    public static final void accept$76(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        List<GiphyDataBean> value = ((GiphyViewModel) afS53S0100000_1.l0).LJLJLLL.getValue();
        if (value == null || value.isEmpty()) {
            ((GiphyViewModel) afS53S0100000_1.l0).LJLJJL.postValue(Boolean.TRUE);
        }
    }

    public static final void accept$77(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        ((TcmOrderStatusBottomBarAssem) afS53S0100000_1.l0).LLIFFJFJJ = ((TcmBarStatus) GsonProtectorUtils.fromJson(new Gson(), ((TcmBarStatusResponse) obj).data, new TypeToken<TcmBarStatus>() { // from class: X.2nx
        }.getType())).barStatus;
        TcmOrderStatusBottomBarAssem tcmOrderStatusBottomBarAssem = (TcmOrderStatusBottomBarAssem) afS53S0100000_1.l0;
        switch (tcmOrderStatusBottomBarAssem.LLIFFJFJJ) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                BottomBarPriorityAbility q4 = tcmOrderStatusBottomBarAssem.q4();
                if (q4 == null) {
                    return;
                }
                q4.yZ((TcmOrderStatusBottomBarAssem) afS53S0100000_1.l0, true);
                return;
            default:
                BottomBarPriorityAbility q42 = tcmOrderStatusBottomBarAssem.q4();
                if (q42 != null) {
                    q42.yZ((TcmOrderStatusBottomBarAssem) afS53S0100000_1.l0, false);
                    return;
                }
                return;
        }
    }

    public static final void accept$78(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        BottomBarPriorityAbility q4 = ((TcmOrderStatusBottomBarAssem) afS53S0100000_1.l0).q4();
        if (q4 != null) {
            q4.yZ((TcmOrderStatusBottomBarAssem) afS53S0100000_1.l0, false);
        }
    }

    public static final void accept$79(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("successfully un-favorite ");
        LIZ.append(((Effect) afS53S0100000_1.l0).getEffectId());
        H78.LIZIZ("DiyProp", X1D.LIZIZ(LIZ));
    }

    public static final void accept$8(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        C3QP c3qp = ((C3QO) afS53S0100000_1.l0).LIZIZ;
        if (c3qp != null) {
            c3qp.LIZIZ();
        }
    }

    public static final void accept$80(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        Integer num;
        BaseResponse baseResponse = (BaseResponse) obj;
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS53S0100000_1.l0;
        if (baseResponse != null) {
            num = Integer.valueOf(baseResponse.status_code);
        } else {
            num = null;
        }
        interfaceC88472Yns.invoke(num);
    }

    public static final void accept$81(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        AVMusic aVMusic = (AVMusic) obj;
        String musicId = aVMusic.getMusicId();
        if (musicId == null || ujb.o.LJJJJJL(musicId)) {
            return;
        }
        ((VideoPublishEditModel) afS53S0100000_1.l0).mFirstStickerMusicIdsJson = GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZIZ(), C47261Igj.LJJIJ(aVMusic.getMusicId()));
    }

    public static final void accept$82(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) afS53S0100000_1.l0;
        Boolean bool = Boolean.FALSE;
        C3C5.m7constructorimpl(bool);
        interfaceC67352kd.resumeWith(bool);
    }

    public static final void accept$83(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        ((MixCreateViewModel) afS53S0100000_1.l0).setState(new AqS167S0100000_1((Throwable) obj, 416));
    }

    public static final void accept$84(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        ((MixCreateViewModel) afS53S0100000_1.l0).setState(new AqS167S0100000_1((Throwable) obj, 417));
    }

    public static final void accept$85(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        AnonymousClass349 anonymousClass349 = (AnonymousClass349) obj;
        RecommendList recommendList = anonymousClass349.LIZ;
        if (recommendList != null) {
            ((AnonymousClass349) afS53S0100000_1.l0).LIZ = recommendList;
        }
        List<Friend> list = anonymousClass349.LIZIZ;
        if (list == null || list.isEmpty()) {
            return;
        }
        ((AnonymousClass349) afS53S0100000_1.l0).LIZIZ = anonymousClass349.LIZIZ;
    }

    public static final void accept$86(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        if (obj instanceof C64797Pbt) {
            obj = ((C64797Pbt) obj).LIZIZ;
        }
        Object obj2 = null;
        if (Response.class.isAssignableFrom(Response.class) || !(obj instanceof Response)) {
            XJL xjl = (XJL) afS53S0100000_1.l0;
            if (!(obj instanceof Response)) {
                obj = null;
            }
            C3C5.m7constructorimpl(obj);
            xjl.resumeWith(obj);
            return;
        }
        Response response = (Response) obj;
        if (response.isCodeOK()) {
            Object obj3 = response.data;
            if (obj3 == null) {
                obj3 = Boolean.TRUE;
            }
            if (obj3 instanceof Response) {
                obj2 = obj3;
            }
        }
        XJL xjl2 = (XJL) afS53S0100000_1.l0;
        C3C5.m7constructorimpl(obj2);
        xjl2.resumeWith(obj2);
    }

    public static final void accept$87(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        XJL xjl = (XJL) afS53S0100000_1.l0;
        C3C5.m7constructorimpl(null);
        xjl.resumeWith(null);
    }

    public static final void accept$88(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        Throwable it = (Throwable) obj;
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) afS53S0100000_1.l0;
        o.LJIIIIZZ(it, "it");
        C3C4 LIZ = C141335gf.LIZ(it);
        C3C5.m7constructorimpl(LIZ);
        interfaceC67352kd.resumeWith(LIZ);
    }

    public static final void accept$89(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS53S0100000_1.l0;
        String url = ((ShortenUrlModel) obj).getUrl();
        o.LJI(url);
        interfaceC88472Yns.invoke(url);
    }

    public static final void accept$9(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        Throwable it = (Throwable) obj;
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) afS53S0100000_1.l0;
        o.LJIIIIZZ(it, "it");
        C3C4 LIZ = C141335gf.LIZ(it);
        C3C5.m7constructorimpl(LIZ);
        interfaceC67352kd.resumeWith(LIZ);
    }

    public static final void accept$90(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        ((C73318Sq2) afS53S0100000_1.l0).LIZLLL();
    }

    public static final void accept$91(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        ((C73318Sq2) afS53S0100000_1.l0).LIZLLL();
    }

    public static final void accept$92(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        List<String> list;
        String str;
        VideoGiftEligibilityResponse giftEligibilityResponse = (VideoGiftEligibilityResponse) obj;
        o.LJIIIZ(giftEligibilityResponse, "giftEligibilityResponse");
        VideoGiftEligibilityActivity videoGiftEligibilityActivity = (VideoGiftEligibilityActivity) afS53S0100000_1.l0;
        if (videoGiftEligibilityActivity.isDestroyed() || videoGiftEligibilityActivity.isFinishing() || videoGiftEligibilityActivity._$_findCachedViewById(R.id.gca) == null) {
            return;
        }
        ((C8ID) videoGiftEligibilityActivity._$_findCachedViewById(R.id.dsr)).setVisibility(8);
        videoGiftEligibilityActivity._$_findCachedViewById(R.id.ct2).setVisibility(0);
        Image image = giftEligibilityResponse.image;
        if (image != null && (list = image.urlList) != null && (str = (String) ORZ.LJLLLL(list)) != null) {
            W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
            LJIIIIZZ.LJJIIJ = (SmartImageView) videoGiftEligibilityActivity._$_findCachedViewById(R.id.icl);
            LJIIIIZZ.LJIJJ = EnumC72807Shn.CENTER_INSIDE;
            C16880lQ.LLJJJ(LJIIIIZZ);
        }
        List<Requirement> list2 = giftEligibilityResponse.requirements;
        boolean z = true;
        if (list2 == null) {
            return;
        }
        for (Requirement requirement : list2) {
            View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(videoGiftEligibilityActivity), R.layout.ckx, (ViewGroup) videoGiftEligibilityActivity._$_findCachedViewById(R.id.gca), false);
            Integer num = requirement.status;
            int value = EnumC87803cW.STATUS_PASS.getValue();
            if (num == null || num.intValue() != value) {
                ((ImageView) LLLLIILL.findViewById(R.id.ixy)).setImageResource(R.drawable.c40);
                z = false;
            }
            ((TextView) LLLLIILL.findViewById(R.id.ixz)).setText(requirement.description);
            ((ViewGroup) videoGiftEligibilityActivity._$_findCachedViewById(R.id.gca)).addView(LLLLIILL);
        }
        if (z) {
            return;
        }
        ((SY4) videoGiftEligibilityActivity._$_findCachedViewById(R.id.ltx)).setEnabled(false);
    }

    public static final void accept$93(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        NudgeInfo nudgeInfo;
        NotificationLiveBottomDialog notificationLiveBottomDialog = (NotificationLiveBottomDialog) afS53S0100000_1.l0;
        NudgeData nudgeData = ((NudgeInfoResponse) obj).data;
        if (nudgeData != null) {
            nudgeInfo = nudgeData.nudgeInfo;
        } else {
            nudgeInfo = null;
        }
        notificationLiveBottomDialog.LJLLL = nudgeInfo;
        notificationLiveBottomDialog.Il();
    }

    public static final void accept$94(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        ((InterfaceC88472Yns) afS53S0100000_1.l0).invoke(Boolean.FALSE);
    }

    public static final void accept$95(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) afS53S0100000_1.l0;
        A2F a2f = A2G.LIZ;
        Exception exc = new Exception(((Throwable) obj).getMessage());
        a2f.getClass();
        A2I LIZJ = A2F.LIZJ(exc);
        C3C5.m7constructorimpl(LIZJ);
        interfaceC67352kd.resumeWith(LIZJ);
    }

    public static final void accept$96(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) afS53S0100000_1.l0;
        A2F a2f = A2G.LIZ;
        Exception exc = new Exception(((Throwable) obj).getMessage());
        a2f.getClass();
        A2I LIZJ = A2F.LIZJ(exc);
        C3C5.m7constructorimpl(LIZJ);
        interfaceC67352kd.resumeWith(LIZJ);
    }

    public static final void accept$97(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        Throwable th = (Throwable) obj;
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) afS53S0100000_1.l0;
        A2F a2f = A2G.LIZ;
        o.LJII(th, "null cannot be cast to non-null type java.lang.Exception{ kotlin.TypeAliasesKt.Exception }");
        a2f.getClass();
        A2I LIZJ = A2F.LIZJ((Exception) th);
        C3C5.m7constructorimpl(LIZJ);
        interfaceC67352kd.resumeWith(LIZJ);
    }

    public static final void accept$98(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) afS53S0100000_1.l0;
        A2F a2f = A2G.LIZ;
        Exception exc = new Exception(((Throwable) obj).getMessage());
        a2f.getClass();
        A2I LIZJ = A2F.LIZJ(exc);
        C3C5.m7constructorimpl(LIZJ);
        interfaceC67352kd.resumeWith(LIZJ);
    }

    public static final void accept$99(AfS53S0100000_1 afS53S0100000_1, Object obj) {
        Throwable th = (Throwable) obj;
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) afS53S0100000_1.l0;
        A2F a2f = A2G.LIZ;
        o.LJII(th, "null cannot be cast to non-null type java.lang.Exception{ kotlin.TypeAliasesKt.Exception }");
        a2f.getClass();
        A2I LIZJ = A2F.LIZJ((Exception) th);
        C3C5.m7constructorimpl(LIZJ);
        interfaceC67352kd.resumeWith(LIZJ);
    }
}
