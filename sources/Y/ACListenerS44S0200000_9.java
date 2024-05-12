package Y;

import X.ASQ;
import X.ASX;
import X.AV1;
import X.AbstractC54715Ldf;
import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.AnonymousClass030;
import X.C10K;
import X.C113554cx;
import X.C15280iq;
import X.C188727au;
import X.C191537fR;
import X.C198517qh;
import X.C200007t6;
import X.C220858ld;
import X.C221018lt;
import X.C26074ALe;
import X.C26076ALg;
import X.C27740Aue;
import X.C31998Ch8;
import X.C38995FSd;
import X.C39061g6;
import X.C39398FdC;
import X.C40179Fpn;
import X.C45804HyK;
import X.C47261Igj;
import X.C4X1;
import X.C51029K0z;
import X.C51698KQs;
import X.C52926Kpu;
import X.C53471Kyh;
import X.C53592L1o;
import X.C53668L4m;
import X.C54713Ldd;
import X.C54740Le4;
import X.C54947LhP;
import X.C55492LqC;
import X.C55723Ltv;
import X.C55783Lut;
import X.C55789Luz;
import X.C55794Lv4;
import X.C55797Lv7;
import X.C56424MCm;
import X.C56809MRh;
import X.C56912MVg;
import X.C57364MfI;
import X.C57367MfL;
import X.C57571Mid;
import X.C57572Mie;
import X.C57581Min;
import X.C57586Mis;
import X.C57792MmC;
import X.C57802MmM;
import X.C57804MmO;
import X.C57826Mmk;
import X.C58084Mqu;
import X.C61200O0e;
import X.C61447O9r;
import X.C6ZT;
import X.C72486Scc;
import X.C73318Sq2;
import X.C73969T1h;
import X.C77266UUc;
import X.C77357UXp;
import X.C78856UxA;
import X.C78999UzT;
import X.C8SG;
import X.E2C;
import X.EnumC199997t5;
import X.EnumC48702J9m;
import X.EnumC57365MfJ;
import X.EnumC57366MfK;
import X.EnumC57597Mj3;
import X.EnumC57793MmD;
import X.EnumC58046MqI;
import X.EnumC58085Mqv;
import X.EnumC72483ScZ;
import X.FMX;
import X.GTF;
import X.HG3;
import X.InterfaceC110914Wx;
import X.InterfaceC191547fS;
import X.InterfaceC45930I0w;
import X.InterfaceC54013LHt;
import X.InterfaceC55798Lv8;
import X.InterfaceC56771MPv;
import X.InterfaceC57527Mhv;
import X.InterfaceC65784Pro;
import X.InterfaceC86003Zc;
import X.InterfaceC88473Ynt;
import X.J9P;
import X.KNV;
import X.LB6;
import X.LNP;
import X.MB3;
import X.MFV;
import X.MH8;
import X.MH9;
import X.MHE;
import X.MHF;
import X.MIL;
import X.MIV;
import X.MK0;
import X.MK7;
import X.MO3;
import X.MO5;
import X.MO7;
import X.MO8;
import X.MSE;
import X.ORZ;
import X.OSZ;
import X.RBX;
import X.RBY;
import X.SY4;
import X.T16;
import X.T3Q;
import X.UPC;
import X.ViewOnClickListenerC56819MRr;
import X.ViewOnClickListenerC57546MiE;
import X.W5D;
import X.X1D;
import X.XKX;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.detail.panel.StickerButtonPanel;
import com.ss.android.ugc.aweme.discover.model.BrandedContentToolSchema;
import com.ss.android.ugc.aweme.feed.guide.GalleryLayoutManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImage;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.following.ui.assem.RelationSearchCell;
import com.ss.android.ugc.aweme.following.ui.assem.SelfFollowRelationSearchCell;
import com.ss.android.ugc.aweme.friends.model.UserWithAweme;
import com.ss.android.ugc.aweme.homepage.ui.experiment.SpecialTopicEntry;
import com.ss.android.ugc.aweme.inbox.IInboxLiveService;
import com.ss.android.ugc.aweme.inbox.adapter.InboxLiveBaseCell;
import com.ss.android.ugc.aweme.inbox.response.InboxLiveNotice;
import com.ss.android.ugc.aweme.inbox.skylight.SkylightLiveMediaCell;
import com.ss.android.ugc.aweme.kids.discovery.model.Challenge;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notification.perf.NoticeVideoManager;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.effect.EffectProfileViewHolder;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.prop.fragment.DesignerStickerDetailAwemeListFragment;
import com.ss.android.ugc.aweme.prop.fragment.StickerPropDetailFragment;
import com.ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl;
import com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService;
import com.ss.android.ugc.aweme.recommend.users.IRecommendUsersServiceImpl;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeViewModel;
import com.ss.android.ugc.aweme.relation.fragment.muflist.FullScreenAuthFragment;
import com.ss.android.ugc.aweme.relation.fragment.muflist.MufSearchCell;
import com.ss.android.ugc.aweme.relation.fragment.muflist.MufUserCell;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import com.ss.android.ugc.aweme.relation.muflist.MufPageTrackInfo;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.BaseRectRecUserCell;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.LargeRectRecUserCell;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.MultiColSquareRecUserCell;
import com.ss.android.ugc.aweme.search.TrendingEventModel;
import com.ss.android.ugc.aweme.services.edit.IReplaceMusicService;
import com.ss.android.ugc.aweme.services.story.EnterStoryParam;
import com.ss.android.ugc.aweme.social.model.MAFIMUser;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.tools.detail.IPropReuseService;
import com.ss.android.ugc.aweme.trending.ui.detailpage.BottomBarAssem;
import com.ss.android.ugc.aweme.trending.viewmodel.TrendingDetailOperatorWrapper;
import com.ss.android.ugc.aweme.trending.viewmodel.TrendingDetailSharedVM;
import com.ss.android.ugc.aweme.ui.FriendsTabContainerFragment;
import com.ss.android.ugc.aweme.userservice.UserService;
import com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicServiceImpl;
import com.zhiliaoapp.musically.R;
import defpackage.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class ACListenerS44S0200000_9 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            case 4:
                onClick$4(this, view);
                return;
            case 5:
                onClick$5(this, view);
                return;
            case 6:
                onClick$6(this, view);
                return;
            case 7:
                onClick$7(this, view);
                return;
            case 8:
                onClick$8(this, view);
                return;
            case 9:
                onClick$9(this, view);
                return;
            case 10:
                onClick$10(this, view);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onClick$11(this, view);
                return;
            case 12:
                onClick$12(this, view);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onClick$13(this, view);
                return;
            case 14:
                onClick$14(this, view);
                return;
            case 15:
                onClick$15(this, view);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onClick$16(this, view);
                return;
            case 17:
                onClick$17(this, view);
                return;
            case 18:
                onClick$18(this, view);
                return;
            case 19:
                onClick$19(this, view);
                return;
            case 20:
                onClick$20(this, view);
                return;
            case 21:
                onClick$21(this, view);
                return;
            case 22:
                onClick$22(this, view);
                return;
            case 23:
                onClick$23(this, view);
                return;
            case 24:
                onClick$24(this, view);
                return;
            case 25:
                onClick$25(this, view);
                return;
            case 26:
                onClick$26(this, view);
                return;
            case 27:
                onClick$27(this, view);
                return;
            case 28:
                onClick$28(this, view);
                return;
            case 29:
                onClick$29(this, view);
                return;
            case 30:
                onClick$30(this, view);
                return;
            case 31:
                onClick$31(this, view);
                return;
            case 32:
                onClick$32(this, view);
                return;
            case 33:
                onClick$33(this, view);
                return;
            case 34:
                onClick$34(this, view);
                return;
            case 35:
                onClick$35(this, view);
                return;
            case 36:
                onClick$36(this, view);
                return;
            case 37:
                onClick$37(this, view);
                return;
            case 38:
                onClick$38(this, view);
                return;
            case 39:
                onClick$39(this, view);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                onClick$40(this, view);
                return;
            case 41:
                onClick$41(this, view);
                return;
            case 42:
                onClick$42(this, view);
                return;
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                onClick$43(this, view);
                return;
            case 44:
                onClick$44(this, view);
                return;
            case 45:
                onClick$45(this, view);
                return;
            case 46:
                onClick$46(this, view);
                return;
            case 47:
                onClick$47(this, view);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                onClick$48(this, view);
                return;
            case C61447O9r.LJIIJ:
                onClick$49(this, view);
                return;
            case 50:
                onClick$50(this, view);
                return;
            case 51:
                onClick$51(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        ((C54947LhP) aCListenerS44S0200000_9.l0).LJLJJLL = false;
        View view2 = (View) aCListenerS44S0200000_9.l1;
        o.LJIIIIZZ(view2, "view");
        ASQ.LIZLLL(view2, ASX.LIZ);
        C54947LhP c54947LhP = (C54947LhP) aCListenerS44S0200000_9.l0;
        c54947LhP.getClass();
        C10K.LIZJ(new ACallableS36S1100000_9(c54947LhP, "close", 0));
    }

    public static final void onClick$1(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        ((C54947LhP) aCListenerS44S0200000_9.l0).LJLJJLL = false;
        View view2 = (View) aCListenerS44S0200000_9.l1;
        o.LJIIIIZZ(view2, "view");
        ASQ.LIZLLL(view2, ASX.LIZ);
        C54947LhP c54947LhP = (C54947LhP) aCListenerS44S0200000_9.l0;
        c54947LhP.getClass();
        C10K.LIZJ(new ACallableS36S1100000_9(c54947LhP, "click_ok", 0));
    }

    public static final void onClick$10(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        Music music;
        int i;
        Video video;
        StickerButtonPanel stickerButtonPanel = (StickerButtonPanel) aCListenerS44S0200000_9.l0;
        NewFaceStickerBean newFaceStickerBean = (NewFaceStickerBean) aCListenerS44S0200000_9.l1;
        stickerButtonPanel.getClass();
        NewFaceStickerBean newFaceStickerBean2 = new NewFaceStickerBean();
        newFaceStickerBean2.id = newFaceStickerBean.effectId;
        IPropReuseService LJIIJ = PropReuseServiceImpl.LJIIJ();
        Activity activity = stickerButtonPanel.activity;
        o.LJIIIIZZ(activity, "activity");
        ArrayList<NewFaceStickerBean> LJII = C47261Igj.LJII(newFaceStickerBean2);
        Aweme LJJLJ = stickerButtonPanel.LJJLJ();
        String str = null;
        if (LJJLJ != null) {
            music = LJJLJ.getMusic();
        } else {
            music = null;
        }
        String previousPage = stickerButtonPanel.getPreviousPage();
        o.LJIIIIZZ(previousPage, "previousPage");
        String str2 = newFaceStickerBean.ownerId;
        Aweme LJJLJ2 = stickerButtonPanel.LJJLJ();
        if (LJJLJ2 != null) {
            str = LJJLJ2.getAid();
        }
        Aweme LJJLJ3 = stickerButtonPanel.LJJLJ();
        if (LJJLJ3 != null && (video = LJJLJ3.getVideo()) != null) {
            i = video.getVideoLength();
        } else {
            i = 0;
        }
        LJIIJ.LJIIIIZZ(activity, LJII, music, previousPage, str2, str, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$11(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        String str;
        String str2;
        RelationSearchCell relationSearchCell = (RelationSearchCell) aCListenerS44S0200000_9.l0;
        User user = (User) aCListenerS44S0200000_9.l1;
        relationSearchCell.getClass();
        Context context = relationSearchCell.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        InterfaceC110914Wx LIZ = new C4X1(context, relationSearchCell.getEnterFrom(), user.getUid(), user.getSecUid()).LIZ.LIZ(E2C.LIZJ("enter_method", "click_search_result"));
        if (user.getMatchedFriendStruct() != null) {
            String enterFrom = relationSearchCell.getEnterFrom();
            EnumC57366MfK enumC57366MfK = EnumC57366MfK.RELATION_LABEL;
            MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
            String str3 = null;
            if (matchedFriendStruct != null) {
                str = matchedFriendStruct.getRecType();
            } else {
                str = null;
            }
            C57364MfI.Companion.getClass();
            EnumC199997t5 LIZ2 = C200007t6.LIZ(user);
            String uid = user.getUid();
            String requestId = user.getRequestId();
            MatchedFriendStruct matchedFriendStruct2 = user.getMatchedFriendStruct();
            if (matchedFriendStruct2 != null) {
                str2 = matchedFriendStruct2.getRelationType();
            } else {
                str2 = null;
            }
            MatchedFriendStruct matchedFriendStruct3 = user.getMatchedFriendStruct();
            if (matchedFriendStruct3 != null) {
                str3 = matchedFriendStruct3.getSocialInfo();
            }
            boolean z = false;
            LIZ.LIZIZ(C51029K0z.LJJIIZI(new OSZ("recommend_enter_profile_params", new C57364MfI(enterFrom, null, enumC57366MfK, str, LIZ2, uid, 0 == true ? 1 : 0, 0 == true ? 1 : 0, requestId, 0 == true ? 1 : 0, str2, str3, user.getMatchedFriendStruct(), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, 0 == true ? 1 : 0, "search_result", 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, 0 == true ? 1 : 0, z, 16506880, 0 == true ? 1 : 0))));
        }
        LIZ.LIZJ();
        relationSearchCell.L(EnumC57365MfJ.ENTER_PROFILE, user);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$12(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        LiveOuterService.LJJJLL().LJJIZ().LJJJZ();
        C26074ALe.LIZLLL(new C26076ALg((User) aCListenerS44S0200000_9.l0, C27740Aue.LIZ(view.getContext()), ((SelfFollowRelationSearchCell) aCListenerS44S0200000_9.l1).getEnterFrom(), "others_homepage", null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, new C57804MmO((SelfFollowRelationSearchCell) aCListenerS44S0200000_9.l1, (User) aCListenerS44S0200000_9.l0), 1008));
    }

    public static final void onClick$13(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        String str;
        User user;
        if (!C6ZT.LIZ(view)) {
            Context context = view.getContext();
            o.LJIIIIZZ(context, "v.context");
            C31998Ch8.LIZ(context, ((AbstractC54715Ldf) aCListenerS44S0200000_9.l0).LIZ(), ((InboxLiveBaseCell) aCListenerS44S0200000_9.l1).getBindingAdapterPosition(), ((InboxLiveBaseCell) aCListenerS44S0200000_9.l1).N());
            InboxLiveBaseCell inboxLiveBaseCell = (InboxLiveBaseCell) aCListenerS44S0200000_9.l1;
            InboxLiveNotice LIZ = ((AbstractC54715Ldf) aCListenerS44S0200000_9.l0).LIZ();
            User user2 = null;
            if (LIZ != null && (user = LIZ.getUser()) != null) {
                str = user.getUid();
            } else {
                str = null;
            }
            InboxLiveNotice LIZ2 = ((AbstractC54715Ldf) aCListenerS44S0200000_9.l0).LIZ();
            if (LIZ2 != null) {
                user2 = LIZ2.getUser();
            }
            C77357UXp.LJJIJIIJI(inboxLiveBaseCell, "live", str, Integer.valueOf(C54740Le4.LIZIZ(user2)), null, null, 114);
        }
    }

    public static final void onClick$14(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        InterfaceC88473Ynt interfaceC88473Ynt = (InterfaceC88473Ynt) aCListenerS44S0200000_9.l0;
        ViewOnClickListenerC56819MRr viewOnClickListenerC56819MRr = (ViewOnClickListenerC56819MRr) aCListenerS44S0200000_9.l1;
        interfaceC88473Ynt.invoke(viewOnClickListenerC56819MRr, Integer.valueOf(viewOnClickListenerC56819MRr.LLFZ), ((ViewOnClickListenerC56819MRr) aCListenerS44S0200000_9.l1).LLFII);
    }

    public static final void onClick$15(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        IRecommendUsersService LJIIIZ = IRecommendUsersServiceImpl.LJIIIZ();
        Context context = ((C56809MRh) aCListenerS44S0200000_9.l0).mContext;
        o.LJIIIIZZ(context, "context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        o.LJI(LJJIFFI);
        LJIIIZ.LJFF(LJJIFFI, "notification_page", "");
        String iN = ((InterfaceC56771MPv) aCListenerS44S0200000_9.l1).iN();
        C188727au LIZLLL = KNV.LIZLLL(iN, "tabName");
        LIZLLL.LJIIIZ("enter_from", "notification_page");
        LIZLLL.LJIIIZ("tab_name", iN);
        FMX.LJIIL("click_suggested_account_information", LIZLLL.LIZ);
    }

    public static final void onClick$16(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        if (!Boolean.valueOf(((RBX) HG3.LJIILL()).isLogin()).booleanValue()) {
            J9P.LIZIZ(((StickerPropDetailFragment) ((AObserverS77S0100000_9) aCListenerS44S0200000_9.l1).l0).mo49getActivity(), "prop_page", "click", null, null);
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("prop_id", ((StickerPropDetailFragment) ((AObserverS77S0100000_9) aCListenerS44S0200000_9.l1).l0).LLILL.id);
        c188727au.LJIIIZ("enter_from", "prop_page");
        c188727au.LJIIIZ("to_user_id", ((InterfaceC45930I0w) aCListenerS44S0200000_9.l0).getUid());
        c188727au.LJIIIZ("user_id", ((StickerPropDetailFragment) ((AObserverS77S0100000_9) aCListenerS44S0200000_9.l1).l0).LLILL.ownerId);
        c188727au.LJIIIZ("sec_userid", ((StickerPropDetailFragment) ((AObserverS77S0100000_9) aCListenerS44S0200000_9.l1).l0).LLILL.mSecUid);
        c188727au.LIZLLL(1, "is_prop_page_profile_card");
        c188727au.LJIIIZ("follow", "follow");
        c188727au.LJIIIZ("previous_page", "prop_page");
        FMX.LJIIL("follow", c188727au.LIZ);
        ((StickerPropDetailFragment) ((AObserverS77S0100000_9) aCListenerS44S0200000_9.l1).l0).LLILII.setClickable(false);
        ((StickerPropDetailFragment) ((AObserverS77S0100000_9) aCListenerS44S0200000_9.l1).l0).LLILII.setButtonVariant(1);
        ((StickerPropDetailFragment) ((AObserverS77S0100000_9) aCListenerS44S0200000_9.l1).l0).LLILII.setText(R.string.gkk);
        try {
            StickerPropDetailFragment stickerPropDetailFragment = (StickerPropDetailFragment) ((AObserverS77S0100000_9) aCListenerS44S0200000_9.l1).l0;
            MIV miv = stickerPropDetailFragment.LJLJI;
            NewFaceStickerBean newFaceStickerBean = stickerPropDetailFragment.LLILL;
            final String str = newFaceStickerBean.ownerId;
            final String str2 = newFaceStickerBean.mSecUid;
            final String str3 = stickerPropDetailFragment.LLL;
            miv.getClass();
            AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.9U6
                public final /* synthetic */ int LJLJI = 1;
                public final /* synthetic */ int LJLJJI = -1;

                @Override // X.InterfaceC86003Zc
                public final void subscribe(InterfaceC73573Su9 interfaceC73573Su9) {
                    String str4 = str;
                    String str5 = str2;
                    interfaceC73573Su9.onNext(UserService.LIZ().LJIIIZ(this.LJLJI, -1, this.LJLJJI, -1, str4, str5, str3, " ", null, new HashMap()));
                    interfaceC73573Su9.onComplete();
                }
            }).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS308S0100000_9(miv, 1));
        } catch (Exception e) {
            C15280iq.LIZJ("ERROR", e.getMessage());
        }
    }

    public static final void onClick$17(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        SmartRoute buildRoute = SmartRouter.buildRoute(((SY4) aCListenerS44S0200000_9.l0).getContext(), "//friends/invite");
        buildRoute.withParam("enter_from", ((C57571Mid) aCListenerS44S0200000_9.l1).LJLIL);
        buildRoute.open();
    }

    public static final void onClick$18(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        FullScreenAuthFragment fullScreenAuthFragment = (FullScreenAuthFragment) aCListenerS44S0200000_9.l0;
        EnumC58046MqI enumC58046MqI = EnumC58046MqI.CONTACT;
        fullScreenAuthFragment.wl(enumC58046MqI);
        Context context = ((LinearLayout) aCListenerS44S0200000_9.l1).getContext();
        o.LJIIIIZZ(context, "context");
        C57572Mie.LIZ(enumC58046MqI, context, ((FullScreenAuthFragment) aCListenerS44S0200000_9.l0).vl(), new AqS140S0200000_9((LinearLayout) aCListenerS44S0200000_9.l1, (FullScreenAuthFragment) aCListenerS44S0200000_9.l0, 25));
    }

    public static final void onClick$19(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        FullScreenAuthFragment fullScreenAuthFragment = (FullScreenAuthFragment) aCListenerS44S0200000_9.l0;
        EnumC58046MqI enumC58046MqI = EnumC58046MqI.FACEBOOK;
        fullScreenAuthFragment.wl(enumC58046MqI);
        Context context = ((LinearLayout) aCListenerS44S0200000_9.l1).getContext();
        o.LJIIIIZZ(context, "context");
        C57572Mie.LIZ(enumC58046MqI, context, ((FullScreenAuthFragment) aCListenerS44S0200000_9.l0).vl(), new AqS140S0200000_9((LinearLayout) aCListenerS44S0200000_9.l1, (FullScreenAuthFragment) aCListenerS44S0200000_9.l0, 26));
    }

    public static final void onClick$2(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        User user;
        RBY LJFF;
        List list = (List) aCListenerS44S0200000_9.l0;
        Context ctx = (Context) aCListenerS44S0200000_9.l1;
        o.LJIIIIZZ(ctx, "ctx");
        IAccountService LJIJ = AccountService.LJIJ();
        String str = null;
        if (LJIJ != null && (LJFF = LJIJ.LJFF()) != null) {
            user = LJFF.getCurUser();
        } else {
            user = null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("aweme://user/qna/profile/");
        if (user != null) {
            str = user.getUid();
        }
        LIZ.append(str);
        SmartRoute buildRoute = SmartRouter.buildRoute(ctx, X1D.LIZIZ(LIZ));
        buildRoute.withParam("enter_from", "qa_trending_page");
        buildRoute.withParam("enter_method", "click_banner");
        buildRoute.withParam("qa_profile_mode", MIL.FYP_BANNER);
        buildRoute.withParam("question_ids", ORZ.LLJIJIL(list));
        buildRoute.open();
    }

    public static final void onClick$20(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        String str = ((BottomBarAssem) aCListenerS44S0200000_9.l0).v3().LJLILLLLZI;
        TrendingEventModel trendingEventModel = ((BottomBarAssem) aCListenerS44S0200000_9.l0).LJLJJLL;
        String str2 = null;
        if (trendingEventModel != null) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", MB3.LIZ);
            c188727au.LJIIIZ("enter_method", "click_bottom_topic_bar");
            MB3.LJ(c188727au, str, trendingEventModel, null);
            FMX.LJIIL("trending_inflow_topic_click", c188727au.LIZ);
        }
        if (C56424MCm.LIZ()) {
            if (((BottomBarAssem) aCListenerS44S0200000_9.l0).x3() instanceof TrendingDetailOperatorWrapper) {
                TrendingDetailSharedVM x3 = ((BottomBarAssem) aCListenerS44S0200000_9.l0).x3();
                o.LJII(x3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.trending.viewmodel.TrendingDetailOperatorWrapper");
                TrendingDetailOperatorWrapper trendingDetailOperatorWrapper = (TrendingDetailOperatorWrapper) x3;
                trendingDetailOperatorWrapper.LL = null;
                trendingDetailOperatorWrapper.LLFF = true;
            }
            TrendingDetailSharedVM x32 = ((BottomBarAssem) aCListenerS44S0200000_9.l0).x3();
            TrendingEventModel trendingEventModel2 = ((BottomBarAssem) aCListenerS44S0200000_9.l0).LJLJJLL;
            if (trendingEventModel2 != null) {
                str2 = trendingEventModel2.getEventId();
            }
            x32.kv0(1, str2);
            return;
        }
        BottomBarAssem bottomBarAssem = (BottomBarAssem) aCListenerS44S0200000_9.l0;
        View bottomListGroup = (View) aCListenerS44S0200000_9.l1;
        o.LJIIIIZZ(bottomListGroup, "bottomListGroup");
        bottomBarAssem.E3(bottomListGroup, "click_inflow_topic");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$21(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        String str;
        InterfaceC54013LHt interfaceC54013LHt;
        FriendsTabContainerFragment friendsTabContainerFragment = (FriendsTabContainerFragment) aCListenerS44S0200000_9.l0;
        if (!(view instanceof InterfaceC54013LHt) || (interfaceC54013LHt = (InterfaceC54013LHt) view) == null || (str = interfaceC54013LHt.tag()) == null) {
            str = "";
        }
        friendsTabContainerFragment.LJLJJLL = str;
        ((C78856UxA) aCListenerS44S0200000_9.l1).LIZIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$22(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        String str;
        InboxLiveNotice inboxLiveNotice;
        User user;
        if (!C6ZT.LIZ(view)) {
            IInboxLiveService iInboxLiveService = (IInboxLiveService) ((SkylightLiveMediaCell) aCListenerS44S0200000_9.l0).LJLJLJ.getValue();
            Context context = view.getContext();
            o.LJIIIIZZ(context, "v.context");
            InboxLiveNotice inboxLiveNotice2 = ((C54713Ldd) aCListenerS44S0200000_9.l1).LJLILLLLZI;
            int bindingAdapterPosition = ((SkylightLiveMediaCell) aCListenerS44S0200000_9.l0).getBindingAdapterPosition();
            C54713Ldd c54713Ldd = (C54713Ldd) ((SkylightLiveMediaCell) aCListenerS44S0200000_9.l0).getItem();
            if (c54713Ldd == null || (inboxLiveNotice = c54713Ldd.LJLILLLLZI) == null || (user = inboxLiveNotice.getUser()) == null || (str = user.getUid()) == null) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            iInboxLiveService.watchLive(context, inboxLiveNotice2, bindingAdapterPosition, str);
            ((SkylightLiveMediaCell) aCListenerS44S0200000_9.l0).a0(EnumC48702J9m.CLICK, null);
        }
    }

    public static final void onClick$23(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        ((C55783Lut) aCListenerS44S0200000_9.l0).LJII((Aweme) aCListenerS44S0200000_9.l1, "watch", false);
    }

    public static final void onClick$24(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        InterfaceC191547fS interfaceC191547fS = ((MK7) aCListenerS44S0200000_9.l0).mmLoadMoreListener;
        if (interfaceC191547fS != null) {
            interfaceC191547fS.LJIIJJI();
        }
        C191537fR c191537fR = ((MSE) aCListenerS44S0200000_9.l1).LJLIL;
        if (c191537fR != null) {
            c191537fR.LJLJI = false;
        }
    }

    public static final void onClick$25(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        String str;
        if (C6ZT.LIZ(view)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("itemID", ((Aweme) aCListenerS44S0200000_9.l0).getAid());
        bundle.putString("enter_from", "video_play");
        Context context = ((C55492LqC) aCListenerS44S0200000_9.l1).LIZIZ;
        BrandedContentToolSchema LIZ = GTF.LIZ();
        if (LIZ == null || (str = LIZ.baViewInsightsSchema) == null) {
            str = "";
        }
        SmartRouter.buildRoute(context, C40179Fpn.LIZ(bundle, str)).open();
    }

    public static final void onClick$26(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        MHF mhf = (MHF) aCListenerS44S0200000_9.l0;
        MH9 mh9 = mhf.LJLJLLL;
        if (mh9 != null) {
            mh9.LLLILZ((View) aCListenerS44S0200000_9.l1, mhf.LJLIL, mhf.LJLJLJ);
        }
    }

    public static final void onClick$27(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        String str;
        GeneralTemplateNotice templateNotice = ((C56912MVg) aCListenerS44S0200000_9.l0).getTemplateNotice();
        if (templateNotice != null && (str = templateNotice.schemaUrl) != null) {
            Activity LJIJJ = C45804HyK.LJIJJ((Context) aCListenerS44S0200000_9.l1);
            if (LJIJJ != null) {
                C61200O0e LIZLLL = C61200O0e.LIZLLL();
                C39061g6 c39061g6 = new C39061g6(str);
                NoticeVideoManager.LIZLLL(c39061g6, str);
                LIZLLL.LJI(LJIJJ, c39061g6.LIZJ());
                return;
            }
            C61200O0e LIZLLL2 = C61200O0e.LIZLLL();
            C39061g6 c39061g62 = new C39061g6(str);
            NoticeVideoManager.LIZLLL(c39061g62, str);
            LIZLLL2.LJII(c39061g62.LIZJ());
        }
    }

    public static final void onClick$28(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        MHE mhe = (MHE) aCListenerS44S0200000_9.l0;
        mhe.LLFII.yb((View) aCListenerS44S0200000_9.l1, mhe.LJLIL, "click_bar");
    }

    public static final void onClick$29(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        if (((MHE) aCListenerS44S0200000_9.l0).LJLIL.getFeatureVideo() == Aweme.VideoType.NO_FEATURE_VIDEO_SELECTED) {
            MHE mhe = (MHE) aCListenerS44S0200000_9.l0;
            mhe.LLFII.yb(mhe.itemView, (Aweme) aCListenerS44S0200000_9.l1, "click_bar");
        } else {
            MHE mhe2 = (MHE) aCListenerS44S0200000_9.l0;
            mhe2.LLFII.LLLILZ(mhe2.itemView, (Aweme) aCListenerS44S0200000_9.l1, mhe2.LJLJLLL);
        }
    }

    public static final void onClick$3(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        LNP lnp = (LNP) aCListenerS44S0200000_9.l0;
        SpecialTopicEntry specialTopicEntry = (SpecialTopicEntry) aCListenerS44S0200000_9.l1;
        SmartRouter.buildRoute(lnp.getActivity(), specialTopicEntry.getLandingRoute()).open();
        String LLLLLZ = lnp.LLLLLZ();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", LLLLLZ);
        c188727au.LJIIIZ("type", specialTopicEntry.getEventName());
        c188727au.LJIIIZ("url", specialTopicEntry.getLandingRoute());
        FMX.LJIIL("topic_entrance_click", c188727au.LIZ);
    }

    public static final void onClick$30(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        String str;
        if (C6ZT.LIZ(view)) {
            return;
        }
        ((MufUserCell) aCListenerS44S0200000_9.l0).N((C57792MmC) aCListenerS44S0200000_9.l1, EnumC57793MmD.OTHERS);
        Context context = ((MufUserCell) aCListenerS44S0200000_9.l0).itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        MufPageTrackInfo mufPageTrackInfo = ((C57792MmC) aCListenerS44S0200000_9.l1).LJLJI;
        if (mufPageTrackInfo != null) {
            str = mufPageTrackInfo.getEnterFrom();
        } else {
            str = null;
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        C4X1 c4x1 = new C4X1(context, str, ((C57792MmC) aCListenerS44S0200000_9.l1).LJLIL.getUid(), ((C57792MmC) aCListenerS44S0200000_9.l1).LJLIL.getSecUid());
        OSZ[] oszArr = new OSZ[2];
        oszArr[0] = new OSZ("enter_method", "click_head");
        String uid = ((C57792MmC) aCListenerS44S0200000_9.l1).LJLIL.getUid();
        if (uid != null) {
            str2 = uid;
        }
        oszArr[1] = new OSZ("to_user_id", str2);
        c4x1.LIZ(C113554cx.LJJL(oszArr)).LIZJ();
    }

    public static final void onClick$31(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        String str;
        Context context = ((MufUserCell) aCListenerS44S0200000_9.l0).itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        MufPageTrackInfo mufPageTrackInfo = ((C57792MmC) aCListenerS44S0200000_9.l1).LJLJI;
        if (mufPageTrackInfo != null) {
            str = mufPageTrackInfo.getEnterFrom();
        } else {
            str = null;
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        C4X1 c4x1 = new C4X1(context, str, ((C57792MmC) aCListenerS44S0200000_9.l1).LJLIL.getUid(), ((C57792MmC) aCListenerS44S0200000_9.l1).LJLIL.getSecUid());
        OSZ[] oszArr = new OSZ[2];
        oszArr[0] = new OSZ("enter_method", "click_head");
        String uid = ((C57792MmC) aCListenerS44S0200000_9.l1).LJLIL.getUid();
        if (uid != null) {
            str2 = uid;
        }
        oszArr[1] = new OSZ("to_user_id", str2);
        c4x1.LIZ(C113554cx.LJJL(oszArr)).LIZJ();
        ((MufUserCell) aCListenerS44S0200000_9.l0).N((C57792MmC) aCListenerS44S0200000_9.l1, EnumC57793MmD.NOW_HEAD);
    }

    public static final void onClick$32(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        String str;
        Context context = ((MufSearchCell) aCListenerS44S0200000_9.l0).itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        MufSearchCell mufSearchCell = (MufSearchCell) aCListenerS44S0200000_9.l0;
        EnumC72483ScZ enumC72483ScZ = ((C57802MmM) aCListenerS44S0200000_9.l1).LJLIL;
        mufSearchCell.getClass();
        int i = C72486Scc.LIZ[enumC72483ScZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                str = "mufSearchCell-<unknown>";
            } else {
                str = "relation_tab";
            }
        } else {
            str = "new_followers_page";
        }
        new C4X1(context, str, ((C57802MmM) aCListenerS44S0200000_9.l1).LJLILLLLZI.getUid(), ((C57802MmM) aCListenerS44S0200000_9.l1).LJLILLLLZI.getSecUid()).LIZ.LIZ(C113554cx.LJJL(new OSZ("enter_method", "click_head"), new OSZ("is_search_scene", 1))).LIZJ();
    }

    public static final void onClick$33(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        UserWithAweme userWithAweme = ((ViewOnClickListenerC57546MiE) aCListenerS44S0200000_9.l0).LJZL;
        o.LJI(userWithAweme);
        ViewOnClickListenerC57546MiE viewOnClickListenerC57546MiE = (ViewOnClickListenerC57546MiE) aCListenerS44S0200000_9.l0;
        View view2 = (View) aCListenerS44S0200000_9.l1;
        int adapterPosition = viewOnClickListenerC57546MiE.getAdapterPosition();
        GalleryLayoutManager galleryLayoutManager = viewOnClickListenerC57546MiE.LJLJJI;
        int i = galleryLayoutManager.LJZL;
        if (adapterPosition < i) {
            int i2 = i - 1;
            RecyclerView recyclerView = galleryLayoutManager.LLIIII;
            if (recyclerView != null && i2 >= 0) {
                galleryLayoutManager.LLIIII(recyclerView, null, i2);
                return;
            }
            return;
        }
        int adapterPosition2 = viewOnClickListenerC57546MiE.getAdapterPosition();
        GalleryLayoutManager galleryLayoutManager2 = viewOnClickListenerC57546MiE.LJLJJI;
        int i3 = galleryLayoutManager2.LJZL;
        if (adapterPosition2 > i3) {
            int i4 = i3 + 1;
            RecyclerView recyclerView2 = galleryLayoutManager2.LLIIII;
            if (recyclerView2 == null || i4 < 0) {
                return;
            }
            galleryLayoutManager2.LLIIII(recyclerView2, null, i4);
            return;
        }
        InterfaceC57527Mhv interfaceC57527Mhv = viewOnClickListenerC57546MiE.LJLJL;
        if (interfaceC57527Mhv != null) {
            User user = userWithAweme.getUser();
            viewOnClickListenerC57546MiE.getAdapterPosition();
            interfaceC57527Mhv.LIZ(user);
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(view2.getContext(), "aweme://user/profile/");
        buildRoute.withParam("uid", userWithAweme.getUser().getUid());
        buildRoute.withParam("sec_user_id", userWithAweme.getUser().getSecUid());
        buildRoute.withParam("enter_from", "homepage_follow");
        buildRoute.withParam("enter_from_request_id", userWithAweme.getUser().getRequestId());
        buildRoute.withParam("extra_previous_page_position", "card_head");
        buildRoute.withParam("need_track_compare_recommend_reason", 1);
        buildRoute.withParam("previous_recommend_reason", userWithAweme.getUser().getRecommendReason());
        buildRoute.withParam("recommend_from_type", "card");
        buildRoute.open();
    }

    public static final void onClick$34(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        ((BaseRectRecUserCell) aCListenerS44S0200000_9.l0).c0((C57826Mmk) aCListenerS44S0200000_9.l1);
    }

    public static final void onClick$35(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        ((BaseRectRecUserCell) aCListenerS44S0200000_9.l0).c0((C57826Mmk) aCListenerS44S0200000_9.l1);
    }

    public static final void onClick$36(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        ((LargeRectRecUserCell) aCListenerS44S0200000_9.l0).c0((C57826Mmk) aCListenerS44S0200000_9.l1);
    }

    public static final void onClick$37(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        ((LargeRectRecUserCell) aCListenerS44S0200000_9.l0).c0((C57826Mmk) aCListenerS44S0200000_9.l1);
    }

    public static final void onClick$38(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        ((MultiColSquareRecUserCell) aCListenerS44S0200000_9.l0).c0((C57826Mmk) aCListenerS44S0200000_9.l1);
    }

    public static final void onClick$39(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        ((MultiColSquareRecUserCell) aCListenerS44S0200000_9.l0).c0((C57826Mmk) aCListenerS44S0200000_9.l1);
    }

    public static final void onClick$4(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        View.OnClickListener onClickListener = (View.OnClickListener) aCListenerS44S0200000_9.l0;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        Iterator it = ((Set) ((C53668L4m) aCListenerS44S0200000_9.l1).LJIIJ.getValue()).iterator();
        while (it.hasNext()) {
            ((View.OnClickListener) it.next()).onClick(view);
        }
    }

    public static final void onClick$40(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        EffectProfileViewHolder effectProfileViewHolder = (EffectProfileViewHolder) aCListenerS44S0200000_9.l0;
        effectProfileViewHolder.withState((JediViewModel) effectProfileViewHolder.LJLJJI.getValue(), new AqS140S0200000_9((EffectProfileViewHolder) aCListenerS44S0200000_9.l0, (NewFaceStickerBean) aCListenerS44S0200000_9.l1, 91));
    }

    public static final void onClick$41(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        C53592L1o c53592L1o;
        EnterStoryParam enterStoryParam;
        ActivityC45651qj activityC45651qj;
        if (!C6ZT.LIZ(view) && (c53592L1o = ((C53471Kyh) aCListenerS44S0200000_9.l0).LIZJ) != null && (enterStoryParam = c53592L1o.LJIIL) != null) {
            Context context = (Context) aCListenerS44S0200000_9.l1;
            WeakReference<ActivityC45651qj> weakReference = c53592L1o.LJIILIIL;
            if (weakReference != null && (activityC45651qj = weakReference.get()) != null) {
                AVExternalServiceImpl.LIZ().storyService().startStoryPublish(activityC45651qj, enterStoryParam, enterStoryParam.getEnterFrom(), "click_head_plus", new TokenCert((String) AVExternalServiceImpl.LIZ().storyService().convertTIRAMISU("bpea-story_head_plus_request_read_storage_permission_target33", "bpea-story_head_plus_request_read_storage_permission")), new AqS156S0200000_9(context, enterStoryParam, 109));
            } else {
                C55723Ltv.LIZIZ.LIZLLL(context, enterStoryParam);
            }
        }
    }

    public static final void onClick$42(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        RecUser recUser;
        List<RecUser> data;
        Integer valueOf;
        if (!C6ZT.LIZIZ(view, 500L) && (recUser = (RecUser) aCListenerS44S0200000_9.l0) != null && (data = ((C57586Mis) aCListenerS44S0200000_9.l1).getData()) != null && (valueOf = Integer.valueOf(data.indexOf(recUser))) != null) {
            C57586Mis c57586Mis = (C57586Mis) aCListenerS44S0200000_9.l1;
            RecUser recUser2 = (RecUser) aCListenerS44S0200000_9.l0;
            int intValue = valueOf.intValue();
            RecSwipeViewModel recSwipeViewModel = c57586Mis.LJLIL;
            Context context = view.getContext();
            o.LJIIIIZZ(context, "it.context");
            recSwipeViewModel.getClass();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("card click for ");
            LIZ.append(recUser2);
            C221018lt.LIZ("RecSwipeViewModel", X1D.LIZIZ(LIZ));
            Aweme aweme = recSwipeViewModel.LJLIL;
            if (aweme != null) {
                aweme.setAuthor(recUser2);
            }
            recSwipeViewModel.sv0(EnumC57365MfJ.ENTER_PROFILE);
            recSwipeViewModel.gv0(EnumC57597Mj3.CLICK_CARD);
            recSwipeViewModel.LJLLLLLL = Integer.valueOf(intValue);
            recSwipeViewModel.LJLZ = recUser2;
            if (recUser2 != null) {
                C57581Min.LJ(recUser2, context, recSwipeViewModel.LJLJJLL, null, null, null, null, false, null, null, null, null, false, null, null, true, 32764);
            }
            Aweme aweme2 = recSwipeViewModel.LJLIL;
            if (aweme2 == null) {
                return;
            }
            aweme2.setAuthor(recSwipeViewModel.getState().LJLJI);
        }
    }

    public static final void onClick$43(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        ((DesignerStickerDetailAwemeListFragment) aCListenerS44S0200000_9.l0).Rl((Aweme) aCListenerS44S0200000_9.l1);
    }

    public static final void onClick$44(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        if (((MH8) aCListenerS44S0200000_9.l1).LJLIL.getStatus() != null && ((MH8) aCListenerS44S0200000_9.l1).LJLIL.getStatus().isDelete()) {
            AnonymousClass030.LJ(view, R.string.tme);
            return;
        }
        MH9 mh9 = (MH9) aCListenerS44S0200000_9.l0;
        if (mh9 != null) {
            MH8 mh8 = (MH8) aCListenerS44S0200000_9.l1;
            NewFaceStickerBean newFaceStickerBean = mh8.LLFZ;
            if (newFaceStickerBean != null) {
                Aweme aweme = mh8.LJLIL;
                aweme.isFriendVideoPresent = newFaceStickerBean.isFriendVideoPresent;
                aweme.isFollowerVideoPresent = newFaceStickerBean.isFollowerVideoPresent;
            }
            mh9.LLLILZ(view, mh8.LJLIL, mh8.LJLJLLL);
        }
    }

    public static final void onClick$45(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        String str;
        String str2;
        int i;
        String idStr;
        W5D w5d;
        int i2;
        MFV mfv = (MFV) aCListenerS44S0200000_9.l1;
        Aweme aweme = mfv.LJLIL;
        if (aweme == null) {
            return;
        }
        MH9 mh9 = (MH9) aCListenerS44S0200000_9.l0;
        if (mh9 != null) {
            if (C8SG.LIZIZ.LJJI(aweme) && (w5d = mfv.LJLILLLLZI.LJLILLLLZI) != null && w5d.LJI && mfv.LJLIL.getVideo() != null && mfv.LJLIL.getVideo().getAiDynamicCover() != null && mfv.LJLIL.getVideo().getAiDynamicCover().getWidth() > 0 && mfv.LJLIL.getVideo().getAiDynamicCover().getHeight() > 0 && ((i2 = mfv.LLIIIJ) == 0 || i2 == 1 || i2 == 4)) {
                if (mfv.LJLIL.getPhotoModeImageInfo().getPhotoModeImageList() != null && mfv.LJLIL.getPhotoModeImageInfo().getPhotoModeImageList().size() > 1) {
                    ListProtector.get(((PhotoModeImage) ListProtector.get(mfv.LJLIL.getPhotoModeImageInfo().getPhotoModeImageList(), 0)).urlModel.getUrlList(), 0);
                }
                C38995FSd.LIZLLL().execute(new ARunnableS20S0300000_9(mh9, view, mfv, 13));
            } else {
                mh9.LLLILZ(view, mfv.LJLIL, mfv.LJLJLLL);
            }
        }
        if (C220858ld.LJI(((MFV) aCListenerS44S0200000_9.l1).LJLIL)) {
            if (((MFV) aCListenerS44S0200000_9.l1).LJLIL.isPhotoMode()) {
                str = "photo_mode";
            } else {
                str = "video";
            }
            IReplaceMusicService LIZ = ReplaceMusicServiceImpl.LIZ();
            MFV mfv2 = (MFV) aCListenerS44S0200000_9.l1;
            if (mfv2.LLIIII) {
                str2 = "personal_homepage";
            } else {
                str2 = "others_homepage";
            }
            boolean LJI = C220858ld.LJI(mfv2.LJLIL);
            TuxIconView tuxIconView = ((MFV) aCListenerS44S0200000_9.l1).LJZ;
            if (tuxIconView == null || tuxIconView.getVisibility() != 0) {
                i = 0;
            } else {
                i = 1;
            }
            String aid = ((MFV) aCListenerS44S0200000_9.l1).LJLIL.getAid();
            if (((MFV) aCListenerS44S0200000_9.l1).LJLIL.getMusic() == null) {
                idStr = "";
            } else {
                idStr = ((MFV) aCListenerS44S0200000_9.l1).LJLIL.getMusic().getIdStr();
            }
            LIZ.mobProfileTabClientClick(str2, LJI ? 1 : 0, i, aid, idStr, str, "copyright");
        }
    }

    public static final void onClick$46(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        InterfaceC55798Lv8 interfaceC55798Lv8;
        if (!C6ZT.LIZ(((C55797Lv7) aCListenerS44S0200000_9.l0).LJLILLLLZI) && (interfaceC55798Lv8 = ((C55797Lv7) aCListenerS44S0200000_9.l0).LJLIL) != null) {
            interfaceC55798Lv8.LIZ((C55794Lv4) aCListenerS44S0200000_9.l1);
        }
    }

    public static final void onClick$47(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        InterfaceC55798Lv8 interfaceC55798Lv8;
        if (!C6ZT.LIZ(((C55797Lv7) aCListenerS44S0200000_9.l0).LJLILLLLZI) && (interfaceC55798Lv8 = ((C55797Lv7) aCListenerS44S0200000_9.l0).LJLIL) != null) {
            interfaceC55798Lv8.LIZIZ((C55794Lv4) aCListenerS44S0200000_9.l1);
        }
    }

    public static final void onClick$48(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        String str;
        List<String> urlList;
        C57367MfL c57367MfL;
        MAFIMUser mAFIMUser;
        int status = ((C57367MfL) aCListenerS44S0200000_9.l0).M().getStatus();
        if (status != 0) {
            if ((status != 1 && status != 2) || (mAFIMUser = (c57367MfL = (C57367MfL) aCListenerS44S0200000_9.l0).LJLILLLLZI) == null) {
                return;
            }
            c57367MfL.LJLJI.LIZ(mAFIMUser);
            return;
        }
        C57367MfL c57367MfL2 = (C57367MfL) aCListenerS44S0200000_9.l0;
        User user = (User) aCListenerS44S0200000_9.l1;
        c57367MfL2.M().setFollowStatus(4);
        C51698KQs c51698KQs = (C51698KQs) c57367MfL2.LJLLI.getValue();
        String uid = user.getUid();
        String secUid = user.getSecUid();
        int followStatus = user.getFollowStatus();
        int followerStatus = user.getFollowerStatus();
        boolean isAccuratePrivateAccount = user.isAccuratePrivateAccount();
        String accurateRecType = user.getAccurateRecType();
        UrlModel avatarThumb = user.getAvatarThumb();
        if (avatarThumb != null && (urlList = avatarThumb.getUrlList()) != null) {
            str = (String) ORZ.LJLLLL(urlList);
        } else {
            str = null;
        }
        c51698KQs.LIZJ(isAccuratePrivateAccount, uid, 1, secUid, accurateRecType, followStatus, followerStatus, str);
    }

    public static final void onClick$49(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        Class<? extends UPC> LJJIJIIJI;
        LifecycleCoroutineScope lifecycleScope;
        if (C6ZT.LIZ(view)) {
            return;
        }
        MO7 mo7 = ((MO3) aCListenerS44S0200000_9.l0).LJLIL;
        if (mo7 != null) {
            mo7.LLLLLLZZ((MO5) aCListenerS44S0200000_9.l1);
        }
        MO3 mo3 = (MO3) aCListenerS44S0200000_9.l0;
        MO5 mo5 = (MO5) aCListenerS44S0200000_9.l1;
        mo3.getClass();
        if (C52926Kpu.LIZ()) {
            Context context = mo3.getContext();
            o.LJIIIIZZ(context, "context");
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
            if (LJJIFFI != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(LJJIFFI)) != null) {
                XKX.LIZLLL(lifecycleScope, null, null, new MO8(context, mo3, mo5, null), 3);
            }
        } else {
            C73318Sq2 c73318Sq2 = mo3.LJLILLLLZI;
            if (c73318Sq2 != null) {
                if (mo5 == MO5.CONTACT) {
                    LJJIJIIJI = C77266UUc.LIZIZ.LJIIJJI();
                } else {
                    LJJIJIIJI = C77266UUc.LIZIZ.LJJIJIIJI();
                }
                Context context2 = mo3.getContext();
                o.LJIIIIZZ(context2, "context");
                C78999UzT.LJFF(T3Q.LIZIZ(context2, LJJIJIIJI, AV1.LIZIZ().getUid(), mo3.LJLJI, mo3.LJLJJLL, true, mo3.LJLJJI).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS58S0200000_9(mo3, mo5, 27), new AfS61S0100000_9(mo3, 96)), c73318Sq2);
            }
        }
        C58084Mqu.LIZIZ(EnumC58085Mqv.INBOX, 0);
    }

    public static final void onClick$5(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        Challenge challenge = (Challenge) aCListenerS44S0200000_9.l0;
        if (challenge.cid != null) {
            MK0 mk0 = (MK0) aCListenerS44S0200000_9.l1;
            mk0.getClass();
            C39398FdC c39398FdC = C39398FdC.LIZ;
            C198517qh c198517qh = new C198517qh();
            c198517qh.LIZ.put("enter_from", "discovery");
            c198517qh.LIZ.put("exit_method", "click_see_more");
            C39398FdC.LIZIZ("click_view_more_category", q.LIZJ(c198517qh.LIZ, "category_id", challenge.cid, c198517qh, c39398FdC));
            SmartRoute buildRoute = SmartRouter.buildRoute(mk0.itemView.getContext(), "//kids/discovery/gallery");
            buildRoute.withParam("title", challenge.challengeName);
            buildRoute.withParam("challenge_id", challenge.cid);
            buildRoute.withParam("feed_type", challenge.feedType);
            buildRoute.withParam("mob_enter_from", "click_see_more");
            buildRoute.open();
        }
    }

    public static final void onClick$50(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        MO7 mo7 = ((MO3) aCListenerS44S0200000_9.l0).LJLIL;
        if (mo7 != null) {
            mo7.LLLZIIL((MO5) aCListenerS44S0200000_9.l1);
        }
    }

    public static final void onClick$51(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        ((LB6) aCListenerS44S0200000_9.l0).LIZ.start();
        ((InterfaceC65784Pro) aCListenerS44S0200000_9.l1).invoke();
    }

    public static final void onClick$6(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        ((C55789Luz) aCListenerS44S0200000_9.l0).LJLIL.LLLILZ(view, (Aweme) aCListenerS44S0200000_9.l1, "just_watched_cover");
    }

    public static final void onClick$7(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        ((C55789Luz) aCListenerS44S0200000_9.l0).LJLIL.LLLILZ(view, (Aweme) aCListenerS44S0200000_9.l1, "normal_cover");
    }

    public static final void onClick$8(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        StickerButtonPanel stickerButtonPanel = (StickerButtonPanel) aCListenerS44S0200000_9.l0;
        Context context = view.getContext();
        o.LJIIIIZZ(context, "it.context");
        stickerButtonPanel.LLILIL(context, (NewFaceStickerBean) aCListenerS44S0200000_9.l1);
    }

    public static final void onClick$9(ACListenerS44S0200000_9 aCListenerS44S0200000_9, View view) {
        StickerButtonPanel stickerButtonPanel = (StickerButtonPanel) aCListenerS44S0200000_9.l0;
        Context context = view.getContext();
        o.LJIIIIZZ(context, "it.context");
        stickerButtonPanel.LLILIL(context, (NewFaceStickerBean) aCListenerS44S0200000_9.l1);
    }

    public ACListenerS44S0200000_9(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l0 = obj2;
    }
}
