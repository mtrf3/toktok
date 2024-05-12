package kotlin.jvm.internal;

import X.A2F;
import X.A2G;
import X.A2H;
import X.A2V;
import X.ARI;
import X.ARN;
import X.ASQ;
import X.ASX;
import X.AbstractC175526ui;
import X.AbstractC193947jK;
import X.AbstractC194637kR;
import X.AbstractC200747uI;
import X.AbstractC211528Rw;
import X.AbstractC224038ql;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.AnonymousClass852;
import X.C00F;
import X.C020506f;
import X.C03660Ck;
import X.C174366sq;
import X.C175536uj;
import X.C175576un;
import X.C175646uu;
import X.C175886vI;
import X.C1794472m;
import X.C17N;
import X.C181627Aw;
import X.C181847Bs;
import X.C188217a5;
import X.C188497aX;
import X.C188727au;
import X.C190517dn;
import X.C190527do;
import X.C190907eQ;
import X.C190977eX;
import X.C191187es;
import X.C191207eu;
import X.C191327f6;
import X.C191337f7;
import X.C191537fR;
import X.C192027gE;
import X.C192037gF;
import X.C192217gX;
import X.C192347gk;
import X.C192697hJ;
import X.C192727hM;
import X.C192737hN;
import X.C192817hV;
import X.C192847hY;
import X.C194437k7;
import X.C196387nG;
import X.C196577nZ;
import X.C197617pF;
import X.C1A7;
import X.C1DH;
import X.C200087tE;
import X.C203127y8;
import X.C2045481a;
import X.C209918Lr;
import X.C210298Nd;
import X.C210308Ne;
import X.C210318Nf;
import X.C210518Nz;
import X.C211498Rt;
import X.C212518Vr;
import X.C214238ax;
import X.C214368bA;
import X.C217868go;
import X.C221018lt;
import X.C221968nQ;
import X.C222038nX;
import X.C222588oQ;
import X.C225208se;
import X.C225228sg;
import X.C225238sh;
import X.C225248si;
import X.C227768wm;
import X.C227898wz;
import X.C228108xK;
import X.C228228xW;
import X.C229348zK;
import X.C2MX;
import X.C32I;
import X.C38306F1q;
import X.C3C5;
import X.C3C8;
import X.C43I;
import X.C47261Igj;
import X.C48841JEv;
import X.C51556KLg;
import X.C52941Kq9;
import X.C55096Ljo;
import X.C55457Lpd;
import X.C56549MHh;
import X.C57778Mly;
import X.C58655N0h;
import X.C58704N2e;
import X.C65777Prh;
import X.C68322mC;
import X.C6DL;
import X.C72912tb;
import X.C74Z;
import X.C76732zl;
import X.C76800UCe;
import X.C77339UWx;
import X.C78613UtF;
import X.C78983UzD;
import X.C79043V0l;
import X.C7DO;
import X.C7ML;
import X.C7MT;
import X.C7MV;
import X.C7TY;
import X.C7UO;
import X.C7XD;
import X.C7ZV;
import X.C81Z;
import X.C84654XKg;
import X.C85M;
import X.C8DU;
import X.C8KP;
import X.C8KQ;
import X.C8KT;
import X.C8KU;
import X.C8M5;
import X.C8NH;
import X.C8O4;
import X.C8V4;
import X.C8VK;
import X.C8VL;
import X.C8VT;
import X.C8XE;
import X.C8XG;
import X.C8YE;
import X.EnumC181857Bt;
import X.EnumC188177a1;
import X.FMX;
import X.HG3;
import X.InterfaceC194547kI;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.InterfaceC67352kd;
import X.InterfaceC88472Yns;
import X.KUN;
import X.M89;
import X.NN1;
import X.ORY;
import X.ORZ;
import X.QCU;
import X.RBX;
import X.SU4;
import X.X1D;
import X.XKX;
import X.Y9G;
import X.Z8A;
import Y.AObjectS27S0000000_3;
import Y.AObjectS85S0300000_3;
import Y.ARunnableS39S0100000_3;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.AssemViewModelWithItem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.commentlist.managementv2.CommentManagementAssemVM;
import com.ss.android.ugc.aweme.comment.commentlist.managementv2.CommentManagementBottomBarAssem;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.BottomDefaultCommentAssem;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.BottomBarProtocol;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.ui.BottomBarFragment;
import com.ss.android.ugc.aweme.comment.gift.model.GiftStruct;
import com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.ss.android.ugc.aweme.comment.model.CommentRethinkPopup;
import com.ss.android.ugc.aweme.comment.widgets.CommentHeaderWidget;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.favorites.business.collection.AllFavoriteFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionListResponse;
import com.ss.android.ugc.aweme.favorites.business.collection.assem.CollectionContentAssem;
import com.ss.android.ugc.aweme.favorites.business.collection.assem.CollectionListChooseAssem;
import com.ss.android.ugc.aweme.favorites.business.collection.assem.CollectionListMainUIAssem;
import com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell;
import com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.mention.ui.cell.CommentMentionCell;
import com.ss.android.ugc.aweme.miniapp_api.model.MicroAppInfo;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.aweme.mix.api.response.MixVideosResponse;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel;
import com.ss.android.ugc.aweme.mix.model.MixStruct;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.nows.feed.ui.NowPostBaseCellAssem;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowPostCellViewModel;
import com.ss.android.ugc.aweme.nows.interaction.viewmodel.NowShareViewModel;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailContentHeaderBaseAssemV3;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.old.PoiDetailContentHeaderBaseAssem;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailPageContainerAssem;
import com.ss.android.ugc.aweme.poi.map.assem.LocationDetailInfoAssem;
import com.ss.android.ugc.aweme.poi.search.PoiSearchVM;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.prefab.ListAssem;
import com.ss.android.ugc.aweme.prefab.NetworkHelper;
import com.ss.android.ugc.aweme.prefab.ViewPagerAssem;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.mutuallabel.UserProfileRelationLabelAssem;
import com.ss.android.ugc.aweme.story.feed.immersive.config.StoryImmersiveCollectionConfig;
import com.ss.android.ugc.aweme.topic.review.list.TopicReviewCell;
import com.ss.android.ugc.aweme.topic.review.model.TopicReview;
import com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import com.ss.android.ugc.aweme.watch.history.core.WatchHistoryManagerAssem;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.relationlabel.ProfileHeaderRelationLabelComponent;
import com.zhiliaoapp.musically.R;
import defpackage.b0;
import defpackage.t1;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class AqS107S0300000_3 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            case 10:
                return invoke$10(this, obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj);
            case 12:
                return invoke$12(this, obj);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this, obj);
            case 17:
                return invoke$17(this, obj);
            case 18:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case 20:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            case 22:
                return invoke$22(this, obj);
            case 23:
                return invoke$23(this, obj);
            case 24:
                return invoke$24(this, obj);
            case 25:
                return invoke$25(this, obj);
            case 26:
                return invoke$26(this, obj);
            case 27:
                return invoke$27(this, obj);
            case 28:
                return invoke$28(this, obj);
            case 29:
                return invoke$29(this, obj);
            case 30:
                return invoke$30(this, obj);
            case 31:
                return invoke$31(this, obj);
            case 32:
                return invoke$32(this, obj);
            case 33:
                return invoke$33(this, obj);
            case 34:
                return invoke$34(this, obj);
            case 35:
                return invoke$35(this, obj);
            case 36:
                return invoke$36(this, obj);
            case 37:
                return invoke$37(this, obj);
            case 38:
                return invoke$38(this, obj);
            case 39:
                return invoke$39(this, obj);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                return invoke$40(this, obj);
            case 41:
                return invoke$41(this, obj);
            case 42:
                return invoke$42(this, obj);
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                return invoke$43(this, obj);
            case 44:
                return invoke$44(this, obj);
            case 45:
                return invoke$45(this, obj);
            case 46:
                return invoke$46(this, obj);
            case 47:
                return invoke$47(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS107S0300000_3 aqS107S0300000_3, Object obj) {
        C175886vI setState = (C175886vI) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C175886vI.LIZ(setState, null, null, null, null, new C43I(new C175576un(((C38306F1q) ((Throwable) aqS107S0300000_3.l0)).getErrorCode(), (Set) aqS107S0300000_3.l1, ((CommentManagementAssemVM) aqS107S0300000_3.l2).LJLIL, (Throwable) aqS107S0300000_3.l0)), false, 47);
    }

    public static final Object invoke$1(AqS107S0300000_3 aqS107S0300000_3, Object obj) {
        C175886vI setState = (C175886vI) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C175886vI.LIZ(setState, null, null, null, null, new C43I(new C175576un(20003, (Set) aqS107S0300000_3.l0, ((CommentManagementAssemVM) aqS107S0300000_3.l1).LJLIL, (Throwable) aqS107S0300000_3.l2)), false, 47);
    }

    public static final Object invoke$10(AqS107S0300000_3 aqS107S0300000_3, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        assemble.rv0((ReusedUIAssem) aqS107S0300000_3.l0, new AqS134S0200000_3((VideoBaseCell) aqS107S0300000_3.l1, (View) aqS107S0300000_3.l2, 76));
        assemble.rv0((ReusedUIAssem) aqS107S0300000_3.l0, new AqS169S0100000_3((VideoBaseCell) aqS107S0300000_3.l1, 178));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS107S0300000_3 aqS107S0300000_3, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJ(R.string.h0k, new AqS107S0300000_3((VideoItemParams) aqS107S0300000_3.l0, (TextExtraStruct) aqS107S0300000_3.l1, (Context) aqS107S0300000_3.l2, 12));
        actionGroup.LJIIIIZZ(R.string.p2, new AqS134S0200000_3((VideoItemParams) aqS107S0300000_3.l0, (TextExtraStruct) aqS107S0300000_3.l1, 82));
        actionGroup.LJI = true;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(AqS107S0300000_3 aqS107S0300000_3, Object obj) {
        C188727au LJ = C77339UWx.LJ((ARN) obj, "it");
        LJ.LJIIIZ("video_id", ((VideoItemParams) aqS107S0300000_3.l0).getAweme().getAid());
        LJ.LJIIIZ("challenge_id", ((TextExtraStruct) aqS107S0300000_3.l1).getCid());
        FMX.LJIIL("hashtag_removal_video_promp_detail_click", LJ.LIZ);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("https://www.tiktok.com/falcon/communitysafety/page/violation-appeal/index.html?object_id=");
        LIZ.append(((TextExtraStruct) aqS107S0300000_3.l1).getCid());
        LIZ.append("&video_id=");
        LIZ.append(((VideoItemParams) aqS107S0300000_3.l0).getAweme().getAid());
        LIZ.append("&object_type=8000&enter_from=video_caption_hashtag&hide_nav_bar=1&from_source=1&container_color_auto_dark=1&should_full_screen=1");
        String encode = URLEncoder.encode(X1D.LIZIZ(LIZ), "UTF-8");
        Context context = (Context) aqS107S0300000_3.l2;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("aweme://webview?url=");
        LIZ2.append(encode);
        SmartRouter.buildRoute(context, X1D.LIZIZ(LIZ2)).open();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(AqS107S0300000_3 aqS107S0300000_3, Object obj) {
        C8NH reusedUiSlotAssem = (C8NH) obj;
        o.LJIIIZ(reusedUiSlotAssem, "$this$reusedUiSlotAssem");
        Assembler assembler = (Assembler) aqS107S0300000_3.l0;
        FeedVideoAssem feedVideoAssem = (FeedVideoAssem) aqS107S0300000_3.l1;
        assembler.nv0(feedVideoAssem, new AqS169S0100000_3(feedVideoAssem, 202));
        reusedUiSlotAssem.LJ = C212518Vr.LIZLLL;
        reusedUiSlotAssem.LIZLLL = R.id.dhp;
        reusedUiSlotAssem.LJ((InterfaceC65350Pko) aqS107S0300000_3.l2);
        reusedUiSlotAssem.LIZLLL(C8VK.LAZY);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(AqS107S0300000_3 aqS107S0300000_3, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        User user = (User) aqS107S0300000_3.l0;
        actionGroup.LJI(R.string.q1d, new AqS113S0300000_9((FollowListAdapter.FollowItemViewHolder) aqS107S0300000_3.l2, (FollowListAdapter) aqS107S0300000_3.l1, user, 2));
        actionGroup.LJIIIIZZ(R.string.cg_, null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(AqS107S0300000_3 aqS107S0300000_3, Object obj) {
        String str;
        String str2;
        String str3;
        JSONObject sendEventTrackingAsync = (JSONObject) obj;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        sendEventTrackingAsync.put("search_position", "comments");
        sendEventTrackingAsync.put("new_sug_session_id", C7DO.LIZ);
        sendEventTrackingAsync.put("impr_id", ((Y9G) aqS107S0300000_3.l0).LJIJI.LJFF);
        sendEventTrackingAsync.put("raw_query", ((C217868go) aqS107S0300000_3.l1).LJLILLLLZI);
        sendEventTrackingAsync.put("sug_user_id", ((Y9G) aqS107S0300000_3.l0).LIZ);
        C1794472m c1794472m = ((C217868go) aqS107S0300000_3.l1).LJLJI;
        String str4 = null;
        if (c1794472m != null) {
            str = c1794472m.LIZ;
        } else {
            str = null;
        }
        sendEventTrackingAsync.put("enter_from", str);
        C1794472m c1794472m2 = ((C217868go) aqS107S0300000_3.l1).LJLJI;
        if (c1794472m2 != null) {
            str2 = c1794472m2.LIZIZ;
        } else {
            str2 = null;
        }
        sendEventTrackingAsync.put("now_type", str2);
        sendEventTrackingAsync.put("user_tag", ((Y9G) aqS107S0300000_3.l0).LJIJI.LJ);
        sendEventTrackingAsync.put("words_position", ((CommentMentionCell) aqS107S0300000_3.l2).getBindingAdapterPosition());
        Word word = ((Y9G) aqS107S0300000_3.l0).LJIJI.LIZLLL;
        if (word != null) {
            str3 = word.getWordSource();
        } else {
            str3 = null;
        }
        sendEventTrackingAsync.put("words_source", str3);
        Word word2 = ((Y9G) aqS107S0300000_3.l0).LJIJI.LIZLLL;
        if (word2 != null) {
            str4 = word2.getId();
        }
        sendEventTrackingAsync.put("group_id", str4);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(AqS107S0300000_3 aqS107S0300000_3, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        NowPostBaseCellAssem nowPostBaseCellAssem = (NowPostBaseCellAssem) aqS107S0300000_3.l0;
        View view = (View) aqS107S0300000_3.l1;
        C181847Bs c181847Bs = (C181847Bs) aqS107S0300000_3.l2;
        View findViewById = nowPostBaseCellAssem.Y3().findViewById(R.id.n0p);
        if (c181847Bs.LJLIL.LIZ()) {
            assemble.rv0(nowPostBaseCellAssem, new AqS169S0100000_3(findViewById, 959));
        } else {
            C1DH.LJJIJIIJI(new ARunnableS39S0100000_3(findViewById, 213));
        }
        assemble.sv0(nowPostBaseCellAssem, C8KP.LJLIL);
        assemble.sv0(nowPostBaseCellAssem, C8KQ.LJLIL);
        assemble.rv0(nowPostBaseCellAssem, new AqS169S0100000_3(view, 962));
        assemble.rv0(nowPostBaseCellAssem, new AqS169S0100000_3(view, 964));
        assemble.rv0(nowPostBaseCellAssem, new AqS169S0100000_3(view, 966));
        assemble.sv0(nowPostBaseCellAssem, C8KU.LJLIL);
        assemble.rv0(nowPostBaseCellAssem, new AqS169S0100000_3(view, 968));
        ((NowPostBaseCellAssem) aqS107S0300000_3.l0).m4(assemble);
        NowPostBaseCellAssem nowPostBaseCellAssem2 = (NowPostBaseCellAssem) aqS107S0300000_3.l0;
        View view2 = (View) aqS107S0300000_3.l1;
        nowPostBaseCellAssem2.getClass();
        assemble.rv0(nowPostBaseCellAssem2, new AqS169S0100000_3(view2, 976));
        assemble.rv0(nowPostBaseCellAssem2, new AqS169S0100000_3(view2, 977));
        assemble.rv0(nowPostBaseCellAssem2, new AqS169S0100000_3(view2, 978));
        assemble.rv0(nowPostBaseCellAssem2, new AqS169S0100000_3(view2, 958));
        NowPostBaseCellAssem nowPostBaseCellAssem3 = (NowPostBaseCellAssem) aqS107S0300000_3.l0;
        View view3 = (View) aqS107S0300000_3.l1;
        nowPostBaseCellAssem3.getClass();
        assemble.sv0(nowPostBaseCellAssem3, C8KT.LJLIL);
        assemble.rv0(nowPostBaseCellAssem3, new AqS169S0100000_3(view3, 975));
        NowPostBaseCellAssem nowPostBaseCellAssem4 = (NowPostBaseCellAssem) aqS107S0300000_3.l0;
        View view4 = (View) aqS107S0300000_3.l1;
        nowPostBaseCellAssem4.getClass();
        assemble.rv0(nowPostBaseCellAssem4, new AqS169S0100000_3(view4, 974));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$17(AqS107S0300000_3 aqS107S0300000_3, Object obj) {
        Aweme aweme;
        C7MT it = (C7MT) obj;
        o.LJIIIZ(it, "it");
        if (((EnumC181857Bt) aqS107S0300000_3.l0) != it.LJLIL) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("nowCellVM.selectSubscribe(nowShareBtnState): ");
            LIZ.append(((EnumC181857Bt) aqS107S0300000_3.l0).name());
            C7XD.LIZ("NowShareViewModel", X1D.LIZIZ(LIZ));
            if (it.LJLIL == EnumC181857Bt.NORMAL) {
                NowShareViewModel nowShareViewModel = (NowShareViewModel) aqS107S0300000_3.l1;
                InterfaceC194547kI interfaceC194547kI = (InterfaceC194547kI) aqS107S0300000_3.l2;
                if (!nowShareViewModel.LJLILLLLZI) {
                    nowShareViewModel.LJLILLLLZI = true;
                    C196387nG c196387nG = (C196387nG) C196387nG.LIZJ.getValue();
                    if (interfaceC194547kI != null) {
                        aweme = interfaceC194547kI.getAweme();
                    } else {
                        aweme = null;
                    }
                    String LIZIZ = C227768wm.LIZIZ(aweme);
                    o.LJIIIIZZ(LIZIZ, "getAid(item?.aweme)");
                    c196387nG.getClass();
                    if (!TextUtils.isEmpty(LIZIZ)) {
                        CopyOnWriteArrayList<String> copyOnWriteArrayList = c196387nG.LIZ;
                        o.LJI(copyOnWriteArrayList);
                        if (!copyOnWriteArrayList.contains(LIZIZ)) {
                            CopyOnWriteArrayList<String> copyOnWriteArrayList2 = c196387nG.LIZ;
                            o.LJI(copyOnWriteArrayList2);
                            if (copyOnWriteArrayList2.size() >= 20) {
                                CopyOnWriteArrayList<String> copyOnWriteArrayList3 = c196387nG.LIZ;
                                o.LJI(copyOnWriteArrayList3);
                                copyOnWriteArrayList3.remove(0);
                            }
                            CopyOnWriteArrayList<String> copyOnWriteArrayList4 = c196387nG.LIZ;
                            o.LJI(copyOnWriteArrayList4);
                            copyOnWriteArrayList4.add(LIZIZ);
                            try {
                                c196387nG.LIZIZ.edit().putString("cached_video_id_4_share_btn", JsonParseUtils.LIZLLL(c196387nG.LIZ)).apply();
                            } catch (NullPointerException unused) {
                            }
                        }
                    }
                    int LIZ2 = SU4.LIZ(System.currentTimeMillis());
                    KUN LJIILLIIL = C1A7.LJIILLIIL("now_share_sp");
                    if (LJIILLIIL.LIZ(-1, "now_share_guide_date_day") != LIZ2) {
                        LJIILLIIL.LJ("now_share_guide_date_day", LIZ2);
                        LJIILLIIL.LJ("now_share_guide_show_times", 0);
                    }
                    LJIILLIIL.LJ("now_share_guide_show_times", LJIILLIIL.LIZ(0, "now_share_guide_show_times") + 1);
                    nowShareViewModel.setState(new AqS169S0100000_3(nowShareViewModel, 655));
                }
            } else {
                NowShareViewModel nowShareViewModel2 = (NowShareViewModel) aqS107S0300000_3.l1;
                if (nowShareViewModel2.LJLILLLLZI) {
                    nowShareViewModel2.LJLILLLLZI = false;
                    nowShareViewModel2.setState(C7MV.LJLIL);
                }
            }
            ((NowShareViewModel) aqS107S0300000_3.l1).setState(new AqS169S0100000_3((EnumC181857Bt) aqS107S0300000_3.l0, 357));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$18(AqS107S0300000_3 aqS107S0300000_3, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        assemble.hv0((PoiDetailPageContainerAssem) aqS107S0300000_3.l0, (List) aqS107S0300000_3.l1);
        C79043V0l.LIZJ((PoiDetailPageContainerAssem) aqS107S0300000_3.l0, new AqS169S0100000_3((Map) aqS107S0300000_3.l2, (Map<String, C8VL>) 386));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$19(AqS107S0300000_3 aqS107S0300000_3, Object obj) {
        AssemSupervisor assemSupervisor;
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        Object tag = ((View) aqS107S0300000_3.l0).getTag();
        o.LJII(tag, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        if (assemble.lv0((LifecycleOwner) tag) == null) {
            AssemSupervisor lv0 = assemble.lv0((ViewPagerAssem) aqS107S0300000_3.l1);
            if (lv0 != null) {
                assemSupervisor = C8VT.LIZ(lv0.LJLJL, lv0.LJLJLJ, lv0.LIZJ(), lv0.LIZLLL());
                if (assemSupervisor != null) {
                    assemSupervisor.LJLLL = (View) aqS107S0300000_3.l0;
                }
            } else {
                assemSupervisor = null;
            }
            Object tag2 = ((View) aqS107S0300000_3.l0).getTag();
            o.LJII(tag2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
            assemble.vv0((LifecycleOwner) tag2, assemSupervisor);
        }
        Object tag3 = ((View) aqS107S0300000_3.l0).getTag();
        o.LJII(tag3, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        assemble.hv0((LifecycleOwner) tag3, C47261Igj.LJJIJ((C8VL) aqS107S0300000_3.l2));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS107S0300000_3 aqS107S0300000_3, Object obj) {
        UrlModel urlModel;
        UrlModel urlModel2;
        UrlModel urlModel3;
        String str;
        C194437k7 setState = (C194437k7) obj;
        o.LJIIIZ(setState, "$this$setState");
        NowPostInfo nowPostInfo = ((C7ML) aqS107S0300000_3.l0).getAweme().nowPostInfo;
        AbstractC193947jK gv0 = NowPostCellViewModel.gv0((NowPostCellViewModel) aqS107S0300000_3.l1, setState, (AbstractC194637kR) aqS107S0300000_3.l2, (C7ML) aqS107S0300000_3.l0, 9);
        C7ML c7ml = (C7ML) aqS107S0300000_3.l0;
        UrlModel urlModel4 = null;
        if (nowPostInfo != null) {
            urlModel = nowPostInfo.getFrontImage();
            urlModel2 = nowPostInfo.getBackImageThumbnail();
            urlModel3 = nowPostInfo.getBackImage();
            urlModel4 = nowPostInfo.getFrontImageThumbnail();
        } else {
            urlModel = null;
            urlModel2 = null;
            urlModel3 = null;
        }
        C196577nZ c196577nZ = new C196577nZ(urlModel, urlModel2, urlModel3, urlModel4);
        NowPostCellViewModel nowPostCellViewModel = (NowPostCellViewModel) aqS107S0300000_3.l1;
        C7ML c7ml2 = (C7ML) aqS107S0300000_3.l0;
        C57778Mly c57778Mly = setState.LJLJL;
        nowPostCellViewModel.getClass();
        boolean z = false;
        if (c7ml2 == null || !o.LJ(c7ml2.LLJJJ(), Boolean.TRUE)) {
            str = "H,3:4";
        } else {
            boolean LIZIZ = c57778Mly.LIZIZ();
            if (C00F.LIZ(31744, 1, "now_feed_explore_enable", true) == 1) {
                z = true;
            }
            if (LIZIZ && !z) {
                str = "h_ratio_full";
            } else {
                str = "h_ratio_half";
            }
        }
        return C194437k7.LIZ(setState, gv0, null, c7ml, null, c196577nZ, str, null, null, null, false, 1994);
    }

    public static final Object invoke$20(AqS107S0300000_3 aqS107S0300000_3, Object obj) {
        String str;
        M89 m89;
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        assemble.rv0((BaseCellContentComponent) aqS107S0300000_3.l0, C8M5.LJLIL);
        assemble.rv0((BaseCellContentComponent) aqS107S0300000_3.l0, C209918Lr.LJLIL);
        StoryImmersiveCollectionConfig storyImmersiveCollectionConfig = (StoryImmersiveCollectionConfig) aqS107S0300000_3.l1;
        C8O4 c8o4 = (C8O4) aqS107S0300000_3.l2;
        String[] strArr = storyImmersiveCollectionConfig.LJLIL;
        BaseFeedPageParams baseFeedPageParams = c8o4.LJ;
        if (baseFeedPageParams == null || (m89 = baseFeedPageParams.param) == null || (str = m89.getFrom()) == null) {
            str = "";
        }
        if (ORY.LJJJJIZL(str, strArr) != -1 && ((!C211498Rt.LJIIIIZZ.getValue().getBoolean("private_like_tip_shown", false)) || C210518Nz.LIZ())) {
            assemble.rv0((BaseCellContentComponent) aqS107S0300000_3.l0, C210298Nd.LJLIL);
        }
        assemble.sv0((BaseCellContentComponent) aqS107S0300000_3.l0, C210308Ne.LJLIL);
        assemble.rv0((BaseCellContentComponent) aqS107S0300000_3.l0, C210318Nf.LJLIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$21(AqS107S0300000_3 aqS107S0300000_3, Object it) {
        o.LJIIIZ(it, "it");
        ((TopicReviewCell) aqS107S0300000_3.l0).L().LJLJI.put("enter_method", "edit_review");
        C7UO.LIZ((FragmentManager) aqS107S0300000_3.l1, null, (TopicReview) aqS107S0300000_3.l2, true, null, 18);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$22(AqS107S0300000_3 aqS107S0300000_3, Object obj) {
        List<MutualUser> userList;
        MutualUser mutualUser;
        int intValue = ((Number) obj).intValue();
        UserProfileRelationLabelAssem userProfileRelationLabelAssem = (UserProfileRelationLabelAssem) aqS107S0300000_3.l0;
        MatchedFriendStruct matchedFriendStruct = (MatchedFriendStruct) aqS107S0300000_3.l1;
        userProfileRelationLabelAssem.getClass();
        MutualStruct mMutualStruct = matchedFriendStruct.getMMutualStruct();
        if (mMutualStruct != null && (userList = mMutualStruct.getUserList()) != null && (mutualUser = (MutualUser) ListProtector.get(userList, intValue)) != null) {
            C7ZV c7zv = new C7ZV();
            c7zv.LIZLLL = "others_homepage";
            c7zv.LJJLI = "click_mutual_connection_name";
            c7zv.LJJLIIIJJIZ = mutualUser.getUid();
            c7zv.LJIILIIL();
            C200087tE c200087tE = new C200087tE();
            c200087tE.LIZLLL = "others_homepage";
            c200087tE.LJIILJJIL = "click_name";
            String uid = mutualUser.getUid();
            o.LJIIIZ(uid, "uid");
            c200087tE.LJIILL = uid;
            c200087tE.LJIILIIL();
            SmartRoute buildRoute = SmartRouter.buildRoute((Context) aqS107S0300000_3.l2, "aweme://user/profile/");
            buildRoute.withParam("uid", mutualUser.getUid());
            buildRoute.withParam("sec_uid", mutualUser.getSecUid());
            buildRoute.withParam("enter_from", "others_homepage");
            buildRoute.withParam("enter_method", "click_mutual_connection_name");
            buildRoute.open();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$23(AqS107S0300000_3 aqS107S0300000_3, Object obj) {
        List assignSection = (List) obj;
        o.LJIIIZ(assignSection, "$this$assignSection");
        C222588oQ c222588oQ = (C222588oQ) aqS107S0300000_3.l0;
        if (c222588oQ != null && c222588oQ.LJIILJJIL == 13) {
            C222038nX c222038nX = (C222038nX) aqS107S0300000_3.l1;
            C221968nQ c221968nQ = new C221968nQ((ViewGroup) aqS107S0300000_3.l2);
            c222038nX.getClass();
            assignSection.add(c221968nQ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$24(AqS107S0300000_3 aqS107S0300000_3, Object obj) {
        List<MutualUser> userList;
        MutualUser mutualUser;
        int intValue = ((Number) obj).intValue();
        ProfileHeaderRelationLabelComponent profileHeaderRelationLabelComponent = (ProfileHeaderRelationLabelComponent) aqS107S0300000_3.l0;
        MatchedFriendStruct matchedFriendStruct = (MatchedFriendStruct) aqS107S0300000_3.l1;
        profileHeaderRelationLabelComponent.getClass();
        MutualStruct mMutualStruct = matchedFriendStruct.getMMutualStruct();
        if (mMutualStruct != null && (userList = mMutualStruct.getUserList()) != null && (mutualUser = (MutualUser) ListProtector.get(userList, intValue)) != null) {
            C7ZV c7zv = new C7ZV();
            c7zv.LIZLLL = "others_homepage";
            c7zv.LJJLI = "click_mutual_connection_name";
            c7zv.LJJLIIIJJIZ = mutualUser.getUid();
            c7zv.LJIILIIL();
            C200087tE c200087tE = new C200087tE();
            c200087tE.LIZLLL = "others_homepage";
            c200087tE.LJIILJJIL = "click_name";
            String uid = mutualUser.getUid();
            o.LJIIIZ(uid, "uid");
            c200087tE.LJIILL = uid;
            c200087tE.LJIILIIL();
            SmartRoute buildRoute = SmartRouter.buildRoute((Context) aqS107S0300000_3.l2, "aweme://user/profile/");
            buildRoute.withParam("uid", mutualUser.getUid());
            buildRoute.withParam("sec_uid", mutualUser.getSecUid());
            buildRoute.withParam("enter_from", "others_homepage");
            buildRoute.withParam("enter_method", "click_mutual_connection_name");
            buildRoute.open();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$25(AqS107S0300000_3 aqS107S0300000_3, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        String str = ((C188217a5) aqS107S0300000_3.l0).LJLJI;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        actionGroup.LJFF(str, new AqS134S0200000_3((WatchHistoryManagerAssem) aqS107S0300000_3.l1, (EnumC188177a1) aqS107S0300000_3.l2, 205));
        String str3 = ((C188217a5) aqS107S0300000_3.l0).LJLJJI;
        if (str3 != null) {
            str2 = str3;
        }
        actionGroup.LJIIIZ(str2, new AqS169S0100000_3((EnumC188177a1) aqS107S0300000_3.l2, 719));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$26(AqS107S0300000_3 aqS107S0300000_3, Object obj) {
        JSONObject sendEventTracking = (JSONObject) obj;
        o.LJIIIZ(sendEventTracking, "$this$sendEventTracking");
        sendEventTracking.put("group_id", ((Aweme) aqS107S0300000_3.l0).getAid());
        sendEventTracking.put("author_id", ((Aweme) aqS107S0300000_3.l0).getAuthorUid());
        sendEventTracking.put("enter_from", "add_yours_detail_page");
        sendEventTracking.put("aweme_type", ((Aweme) aqS107S0300000_3.l0).getAwemeType());
        String str = null;
        if (((Aweme) aqS107S0300000_3.l0).getFollowStatus() == 2) {
            sendEventTracking.put("label", "friends");
        }
        Aweme aweme = (Aweme) aqS107S0300000_3.l1;
        if (aweme != null) {
            sendEventTracking.put("from_group_id", aweme.getGroupId());
        }
        AddYoursTopic addYoursTopic = (AddYoursTopic) aqS107S0300000_3.l2;
        if (addYoursTopic != null) {
            sendEventTracking.put("is_invited", C48841JEv.LJIJ(addYoursTopic.getViewerInvited()));
            Aweme video = addYoursTopic.getVideo();
            if (video != null) {
                str = video.getAuthorUid();
            }
            sendEventTracking.put("add_yours_initiator_uid", str);
            sendEventTracking.put("add_yours_id", addYoursTopic.getTopicId());
            sendEventTracking.put("add_yours_title", addYoursTopic.getText());
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$27(AqS107S0300000_3 aqS107S0300000_3, Object setState) {
        long j;
        boolean z;
        o.LJIIIZ(setState, "$this$setState");
        C72912tb c72912tb = new C72912tb((List) aqS107S0300000_3.l0);
        Long l = ((CollectionListResponse) aqS107S0300000_3.l1).cursor;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        Boolean bool = ((CollectionListResponse) aqS107S0300000_3.l1).hasMore;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        Boolean hasCollectVideos = (Boolean) aqS107S0300000_3.l2;
        o.LJIIIIZZ(hasCollectVideos, "hasCollectVideos");
        return new C192847hY(c72912tb, hasCollectVideos.booleanValue(), j, z);
    }

    public static final Object invoke$28(AqS107S0300000_3 aqS107S0300000_3, Object it) {
        String schema;
        String str;
        Object obj;
        o.LJIIIZ(it, "it");
        ((CommentHeaderWidget) aqS107S0300000_3.l0).LJIILLIIL();
        ((CommentHeaderWidget) aqS107S0300000_3.l0).LJIILJJIL().getAid();
        C227898wz c227898wz = new C227898wz();
        IMiniAppService iMiniAppService = (IMiniAppService) aqS107S0300000_3.l1;
        Context context = ((CommentHeaderWidget) aqS107S0300000_3.l0).LJLIL;
        MicroAppInfo microAppInfo = (MicroAppInfo) aqS107S0300000_3.l2;
        if (microAppInfo == null) {
            schema = "";
        } else {
            schema = microAppInfo.getSchema();
        }
        if (iMiniAppService.openMiniApp(context, schema, c227898wz)) {
            ((CommentHeaderWidget) aqS107S0300000_3.l0).LJLL.invoke();
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", ((CommentHeaderWidget) aqS107S0300000_3.l0).LJIILLIIL());
        c188727au.LJIIIZ("position", "comment_top");
        c188727au.LJIIIZ("group_id", ((CommentHeaderWidget) aqS107S0300000_3.l0).LJIILJJIL().getAid());
        c188727au.LJIIIZ("author_id", ((CommentHeaderWidget) aqS107S0300000_3.l0).LJIILJJIL().getAuthorUid());
        if (((MicroAppInfo) aqS107S0300000_3.l2).isApp()) {
            str = "micro_app";
        } else {
            str = "micro_game";
        }
        c188727au.LJIIIZ("_param_for_special", str);
        c188727au.LJIIIZ("mp_id", ((MicroAppInfo) aqS107S0300000_3.l2).getAppId());
        FMX.LJIIL("mp_click", c188727au.LIZ);
        if (((CommentHeaderWidget) aqS107S0300000_3.l0).LJIILJJIL().isAd()) {
            CommentHeaderWidget commentHeaderWidget = (CommentHeaderWidget) aqS107S0300000_3.l0;
            Context context2 = commentHeaderWidget.LJLIL;
            Aweme LJIILJJIL = commentHeaderWidget.LJIILJJIL();
            String str2 = "comment_first_ad";
            if (TextUtils.equals(((CommentHeaderWidget) aqS107S0300000_3.l0).LJIILL(), "general_search")) {
                obj = "comment_first_ad";
            } else {
                obj = null;
            }
            JSONObject LJIIIZ = NN1.LJIIIZ(context2, LJIILJJIL);
            try {
                LJIIIZ.put("refer", obj);
            } catch (JSONException e) {
                C78983UzD.LJIIZILJ(e);
            }
            NN1.LJJJJIZL(context2, "comment_ad", "applet_click", LJIILJJIL, LJIIIZ);
            C58655N0h LIZLLL = C58704N2e.LIZLLL("comment_ad", "applet_click", ((CommentHeaderWidget) aqS107S0300000_3.l0).LJIILJJIL().getAwemeRawAd());
            if (!TextUtils.equals(((CommentHeaderWidget) aqS107S0300000_3.l0).LJIILL(), "general_search")) {
                str2 = null;
            }
            LIZLLL.LIZJ(str2, "refer");
            LIZLLL.LJII();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$29(AqS107S0300000_3 aqS107S0300000_3, Object obj) {
        long longValue = ((Number) obj).longValue();
        StringBuilder LIZ = X1D.LIZ();
        b0.LJ(LIZ, ((AbstractC211528Rw) aqS107S0300000_3.l0).LJLIL, " dismissed with latency: ", longValue);
        C221018lt.LJFF("StoryGestureEducation", X1D.LIZIZ(LIZ));
        C211498Rt c211498Rt = (C211498Rt) aqS107S0300000_3.l1;
        String str = ((AbstractC211528Rw) aqS107S0300000_3.l0).LJLIL;
        c211498Rt.getClass();
        FMX.LJIILJJIL("story_gesture_education", c211498Rt.LIZ(new AqS1S1000100_3(str, longValue, 2)));
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) aqS107S0300000_3.l2;
        C76800UCe c76800UCe = C76800UCe.LIZ;
        C3C5.m7constructorimpl(c76800UCe);
        interfaceC67352kd.resumeWith(c76800UCe);
        return c76800UCe;
    }

    public static final Object invoke$3(AqS107S0300000_3 aqS107S0300000_3, Object it) {
        String str;
        C174366sq c174366sq;
        ActivityC45651qj mo49getActivity;
        C174366sq c174366sq2;
        o.LJIIIZ(it, "it");
        Aweme aweme = null;
        if (((CommentManagementBottomBarAssem) aqS107S0300000_3.l0).H3() != null) {
            C175536uj H3 = ((CommentManagementBottomBarAssem) aqS107S0300000_3.l0).H3();
            int i = 0;
            if (H3 == null || H3.LJLJJI != 0) {
                Fragment LJIIIZ = C55096Ljo.LJIIIZ((UIAssem) aqS107S0300000_3.l1);
                if (LJIIIZ != null && (mo49getActivity = LJIIIZ.mo49getActivity()) != null) {
                    C175536uj H32 = ((CommentManagementBottomBarAssem) aqS107S0300000_3.l0).H3();
                    if (H32 != null && (c174366sq2 = H32.LJLIL) != null) {
                        aweme = c174366sq2.getAweme();
                    }
                    String join = TextUtils.join(",", ((C175646uu) ((AbstractC175526ui) aqS107S0300000_3.l2)).LIZ);
                    o.LJIIIIZZ(join, "join(\",\", batchReportResult.cids)");
                    String join2 = TextUtils.join(",", ((C175646uu) ((AbstractC175526ui) aqS107S0300000_3.l2)).LIZIZ);
                    o.LJIIIIZZ(join2, "join(\",\", batchReportResult.uids)");
                    C175536uj H33 = ((CommentManagementBottomBarAssem) aqS107S0300000_3.l0).H3();
                    if (H33 != null) {
                        i = H33.LJLJJI;
                    }
                    C7TY.LIZ(mo49getActivity, aweme, join, join2, i);
                }
                return C76800UCe.LIZ;
            }
        }
        C175646uu c175646uu = (C175646uu) ((AbstractC175526ui) aqS107S0300000_3.l2);
        int i2 = c175646uu.LIZLLL;
        int size = c175646uu.LIZJ.size();
        int i3 = ((C175646uu) ((AbstractC175526ui) aqS107S0300000_3.l2)).LJ;
        C175536uj H34 = ((CommentManagementBottomBarAssem) aqS107S0300000_3.l0).H3();
        if (H34 == null || (c174366sq = H34.LJLIL) == null || (str = c174366sq.getEnterFrom()) == null) {
            str = "";
        }
        C74Z.LJIILLIIL(i2, size, i3, str);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$30(AqS107S0300000_3 aqS107S0300000_3, Object obj) {
        FragmentManager fragmentManager;
        ARN actionEventArgs = (ARN) obj;
        o.LJIIIZ(actionEventArgs, "actionEventArgs");
        actionEventArgs.LIZJ = true;
        ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ((BottomDefaultCommentAssem) aqS107S0300000_3.l0);
        if (LJIIIIZZ != null) {
            fragmentManager = LJIIIIZZ.getSupportFragmentManager();
        } else {
            fragmentManager = null;
        }
        ActivityC45651qj LJIIIIZZ2 = C55096Ljo.LJIIIIZZ((BottomDefaultCommentAssem) aqS107S0300000_3.l0);
        if (LJIIIIZZ2 != null) {
            GiftStruct giftStruct = (GiftStruct) aqS107S0300000_3.l1;
            GiftViewModel giftViewModel = (GiftViewModel) aqS107S0300000_3.l2;
            if (fragmentManager != null) {
                C188497aX.LIZ(LJIIIIZZ2, giftStruct.getDiamondCount(), giftViewModel, fragmentManager, false);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$31(AqS107S0300000_3 aqS107S0300000_3, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJII(C03660Ck.LIZ((ActivityC45651qj) aqS107S0300000_3.l0, R.string.j7e, "activity.resources.getSt…failed_modal_cta_primary)"), new AqS134S0200000_3((ActivityC45651qj) aqS107S0300000_3.l0, (ActivityC45651qj) aqS107S0300000_3.l1, (InterfaceC65784Pro<C76800UCe>) 258));
        actionGroup.LJIIIZ(C03660Ck.LIZ((ActivityC45651qj) aqS107S0300000_3.l0, R.string.j7h, "activity.resources.getSt…d_failed_modal_secondary)"), new AqS169S0100000_3((InterfaceC65784Pro) aqS107S0300000_3.l2, (InterfaceC65784Pro<C76800UCe>) 853));
        actionGroup.LJI = true;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$32(AqS107S0300000_3 aqS107S0300000_3, Object obj) {
        Double d;
        View view = (View) obj;
        o.LJIIIZ(view, "view");
        ASQ.LIZLLL(view, ASX.LIZ);
        C51556KLg.LIZ.getClass();
        IPoiService LIZ = C51556KLg.LIZ();
        Context context = (Context) aqS107S0300000_3.l0;
        PoiListApi.PoiLocation poiLocation = ((PoiListApi.PoiDetailResponse) aqS107S0300000_3.l1).poiLocation;
        Double d2 = null;
        if (poiLocation != null) {
            d = Double.valueOf(poiLocation.getLat());
        } else {
            d = null;
        }
        PoiListApi.PoiLocation poiLocation2 = ((PoiListApi.PoiDetailResponse) aqS107S0300000_3.l1).poiLocation;
        if (poiLocation2 != null) {
            d2 = Double.valueOf(poiLocation2.getLng());
        }
        PoiListApi.PoiDetailResponse poiDetailResponse = (PoiListApi.PoiDetailResponse) aqS107S0300000_3.l1;
        LIZ.LJJJLZIJ(context, d, d2, poiDetailResponse.name, poiDetailResponse.address, ((C190977eX) ((AssemViewModel) ((LocationDetailInfoAssem) aqS107S0300000_3.l2).LJLILLLLZI.getValue()).getState()).LJLJJL);
        String str = ((C190907eQ) ((LocationDetailInfoAssem) aqS107S0300000_3.l2).LJLIL.getValue()).LJLIL;
        if (str == null) {
            str = "";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "poi_map");
        linkedHashMap.put("poi_id", str);
        FMX.LJIIL("open_in_google_maps", linkedHashMap);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$33(AqS107S0300000_3 aqS107S0300000_3, Object obj) {
        C8V4 uiContentAssem = (C8V4) obj;
        o.LJIIIZ(uiContentAssem, "$this$uiContentAssem");
        BottomBarFragment bottomBarFragment = (BottomBarFragment) aqS107S0300000_3.l0;
        View view = (View) aqS107S0300000_3.l1;
        bottomBarFragment.getClass();
        FrameLayout frameLayout = new FrameLayout(view.getContext());
        frameLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        frameLayout.setId(R.id.c8w);
        uiContentAssem.LJII = frameLayout;
        uiContentAssem.LJIIIIZZ = (UIContentAssem) ((BottomBarProtocol) aqS107S0300000_3.l2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$34(AqS107S0300000_3 aqS107S0300000_3, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        List<BottomBarProtocol> list = (List) aqS107S0300000_3.l0;
        if (list != null) {
            BottomBarFragment bottomBarFragment = (BottomBarFragment) aqS107S0300000_3.l1;
            View view = (View) aqS107S0300000_3.l2;
            for (BottomBarProtocol bottomBarProtocol : list) {
                if (bottomBarProtocol instanceof AbstractBottomPriorityComponent) {
                    if (((AbstractBottomPriorityComponent) bottomBarProtocol).v3(bottomBarFragment.qT())) {
                        assemble.wv0(bottomBarFragment, new AqS107S0300000_3(bottomBarFragment, view, bottomBarProtocol, 33));
                    }
                } else {
                    throw new IllegalStateException("The type implementing BottomBarProtocol is not supported!");
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$35(AqS107S0300000_3 aqS107S0300000_3, Object it) {
        o.LJIIIZ(it, "it");
        C191327f6 c191327f6 = (C191327f6) aqS107S0300000_3.l0;
        C191207eu LJJJI = ((C8DU) aqS107S0300000_3.l1).LJJJI();
        String enterFrom = ((C191337f7) aqS107S0300000_3.l2).getEnterFrom();
        String poiId = ((C191337f7) aqS107S0300000_3.l2).getPoiId();
        C191207eu c191207eu = c191327f6.LJLJI;
        if (c191207eu != null) {
            if (c191207eu.getBearing() == LJJJI.getBearing()) {
                if (c191207eu.getTilt() == LJJJI.getTilt()) {
                    if (c191207eu.getZoom() == LJJJI.getZoom()) {
                        if (!o.LJ(c191207eu.getLatLon(), LJJJI.getLatLon())) {
                            C225248si.LJIJI(enterFrom, poiId);
                        }
                    } else {
                        C225248si.LJIJI(enterFrom, poiId);
                    }
                } else {
                    C225248si.LJIJI(enterFrom, poiId);
                }
            } else {
                C225248si.LJIJI(enterFrom, poiId);
            }
            c191327f6.LJLJI = LJJJI;
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$36(AqS107S0300000_3 aqS107S0300000_3, Object obj) {
        Throwable throwable = (Throwable) obj;
        o.LJIIIZ(throwable, "throwable");
        BaseDetailShareVM baseDetailShareVM = null;
        ((NetworkHelper) aqS107S0300000_3.l0).LIZ(throwable, null);
        AssemListViewModel<?, ?, ?> P3 = ((ListAssem) aqS107S0300000_3.l1).P3();
        if (P3 instanceof BaseDetailShareVM) {
            baseDetailShareVM = (BaseDetailShareVM) P3;
        }
        if (baseDetailShareVM == null || baseDetailShareVM.hasMore()) {
            ((C191537fR) aqS107S0300000_3.l2).LJLJI = true;
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$37(AqS107S0300000_3 aqS107S0300000_3, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        assemble.nv0((PoiDetailContentHeaderBaseAssemV3) aqS107S0300000_3.l0, new AqS134S0200000_3((PoiListApi.PoiDetailResponse) aqS107S0300000_3.l1, (C191187es) aqS107S0300000_3.l2, 286));
        assemble.xv0((PoiDetailContentHeaderBaseAssemV3) aqS107S0300000_3.l0, C190517dn.LJLIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$38(AqS107S0300000_3 aqS107S0300000_3, Object obj) {
        C6DL actions = (C6DL) obj;
        o.LJIIIZ(actions, "$this$actions");
        ((C76732zl) aqS107S0300000_3.l0).element = ((AbstractC224038ql) aqS107S0300000_3.l1).LJIIZILJ(actions);
        C76732zl c76732zl = (C76732zl) aqS107S0300000_3.l2;
        c76732zl.element = C17N.LJIILL(((C76732zl) aqS107S0300000_3.l0).element * 42.0d) + c76732zl.element;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$39(AqS107S0300000_3 aqS107S0300000_3, Object it) {
        o.LJIIIZ(it, "it");
        PoiSearchVM poiSearchVM = (PoiSearchVM) aqS107S0300000_3.l0;
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) aqS107S0300000_3.l1;
        PoiData poiData = (PoiData) aqS107S0300000_3.l2;
        if (poiData == null) {
            poiSearchVM.getClass();
        } else {
            String str = poiSearchVM.LJLILLLLZI;
            if (str != null) {
                poiSearchVM.setState(C225228sg.LJLIL);
                XKX.LIZLLL(poiSearchVM.getAssemVMScope(), C78613UtF.LIZJ, null, new C225208se(str, poiData, poiSearchVM, activityC45651qj, null), 2);
            }
        }
        t1.LJFF("is_publish", "1", "confirm_location_popup_result");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS107S0300000_3 aqS107S0300000_3, Object obj) {
        ArrayList arrayList;
        C192027gE it = (C192027gE) obj;
        o.LJIIIZ(it, "it");
        List<C192217gX> LIZ = it.LJLILLLLZI.LIZ();
        if (LIZ != null) {
            arrayList = new ArrayList(C32I.LJJL(LIZ, 10));
            Iterator<C192217gX> it2 = LIZ.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LJLIL);
            }
        } else {
            arrayList = null;
        }
        boolean z = it.LJLJJI;
        long j = it.LJLJI;
        AbstractC200747uI<?, ?> provideAwemeModel = Z8A.LIZIZ.provideAwemeModel();
        provideAwemeModel.LJIIIZ(null, arrayList, j, z);
        C55457Lpd.LJLJJLL = provideAwemeModel;
        View view = (View) aqS107S0300000_3.l0;
        C020506f LIZ2 = C020506f.LIZ(view, view.getWidth(), ((View) aqS107S0300000_3.l0).getHeight());
        SmartRoute buildRoute = SmartRouter.buildRoute(((AllFavoriteFragment) aqS107S0300000_3.l1).mo49getActivity(), "aweme://aweme/detail/");
        Bundle bundle = new Bundle();
        bundle.putString("id", ((Aweme) aqS107S0300000_3.l2).getAid());
        bundle.putString("video_from", "from_profile_other");
        bundle.putString("userid", ((RBX) HG3.LJIILL()).getCurUserId());
        bundle.putString("sec_userid", ((RBX) HG3.LJIILL()).getCurSecUserId());
        bundle.putString("refer", "collection_video");
        bundle.putString("tab_name", "collection");
        bundle.putInt("video_type", 4);
        buildRoute.withParam(bundle);
        buildRoute.withBundleAnimation(LIZ2.LIZLLL());
        buildRoute.withParam("activity_has_activity_options", true);
        buildRoute.open();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$40(AqS107S0300000_3 aqS107S0300000_3, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        String string = ((ActivityC45651qj) aqS107S0300000_3.l0).getString(R.string.p19);
        o.LJIIIIZZ(string, "activity.getString(R.string.poiretag_btn_textone)");
        actionGroup.LJII(string, new AqS107S0300000_3((ActivityC45651qj) aqS107S0300000_3.l0, (PoiData) aqS107S0300000_3.l2, (PoiSearchVM) aqS107S0300000_3.l1, 39));
        String string2 = ((ActivityC45651qj) aqS107S0300000_3.l0).getString(R.string.p1a);
        o.LJIIIIZZ(string2, "activity.getString(R.string.poiretag_btn_texttwo)");
        actionGroup.LJIIIZ(string2, C225238sh.LJLIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$41(AqS107S0300000_3 aqS107S0300000_3, Object obj) {
        ReusedAssem reusedAssem;
        AssemViewModelWithItem assemViewModelWithItem;
        C8YE c8ye;
        LifecycleOwner it = (AssemViewModel) obj;
        o.LJIIIZ(it, "it");
        Object obj2 = ((C214238ax) aqS107S0300000_3.l0).LJII;
        if ((it instanceof C8YE) && (c8ye = (C8YE) it) != null) {
            obj2 = new IDqS428S0100000_3(c8ye, 17);
        }
        if ((it instanceof AssemViewModelWithItem) && (assemViewModelWithItem = (AssemViewModelWithItem) it) != null) {
            assemViewModelWithItem.LJLIL = (C8XE) aqS107S0300000_3.l1;
        }
        if (obj2 != null) {
            if (C214368bA.LJIJJ) {
                reusedAssem = (T) ((C68322mC) aqS107S0300000_3.l2).element;
            } else {
                reusedAssem = ((C214238ax) aqS107S0300000_3.l0).LIZIZ;
            }
            C8XG c8xg = reusedAssem.LJLJL;
            C65777Prh.LJ(3, obj2);
            c8xg.LIZ(it, obj2, (C8XE) aqS107S0300000_3.l1);
        }
        return it;
    }

    public static final Object invoke$42(AqS107S0300000_3 aqS107S0300000_3, Object obj) {
        C228228xW setState = (C228228xW) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C228228xW.LIZ(setState, (List) aqS107S0300000_3.l0, (ArrayList) aqS107S0300000_3.l1, (ArrayList) aqS107S0300000_3.l2, null, null, null, null, LiveTryModeCountDownThresholdSetting.DEFAULT);
    }

    public static final Object invoke$43(AqS107S0300000_3 aqS107S0300000_3, Object it) {
        o.LJIIIZ(it, "it");
        MixVideosResponse mixVideosResponse = (MixVideosResponse) aqS107S0300000_3.l0;
        List<? extends Aweme> list = mixVideosResponse.mixVideos;
        MixVideosManageViewModel mixVideosManageViewModel = (MixVideosManageViewModel) aqS107S0300000_3.l1;
        mixVideosManageViewModel.LJLJJL = mixVideosResponse.hasMore;
        if (list != null) {
            InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) aqS107S0300000_3.l2;
            mixVideosManageViewModel.setState(new AqS169S0100000_3(list, (List<AnonymousClass852<C85M>>) 994));
            if (mixVideosManageViewModel.LJLJJL) {
                A2F a2f = A2G.LIZ;
                Long valueOf = Long.valueOf(mixVideosResponse.maxCursor);
                ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
                Iterator<? extends Aweme> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new C228108xK(it2.next()));
                }
                A2V LJ = A2F.LJ(a2f, null, valueOf, arrayList, 1);
                C3C5.m7constructorimpl(LJ);
                interfaceC67352kd.resumeWith(LJ);
            } else {
                A2F a2f2 = A2G.LIZ;
                ArrayList arrayList2 = new ArrayList(C32I.LJJL(list, 10));
                Iterator<? extends Aweme> it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(new C228108xK(it3.next()));
                }
                a2f2.getClass();
                A2H LIZ = A2F.LIZ(arrayList2);
                C3C5.m7constructorimpl(LIZ);
                interfaceC67352kd.resumeWith(LIZ);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$44(AqS107S0300000_3 aqS107S0300000_3, Object it) {
        o.LJIIIZ(it, "it");
        MixStruct mixStruct = (MixStruct) aqS107S0300000_3.l0;
        if (mixStruct != null) {
            ((MixVideosViewModel) aqS107S0300000_3.l1).setState(new AqS169S0100000_3(mixStruct, 995));
        } else {
            ((MixVideosViewModel) aqS107S0300000_3.l1).setState(C229348zK.LJLIL);
        }
        if (((MixVideosViewModel) aqS107S0300000_3.l1).LJLLLLLL > 0 && ((Long) aqS107S0300000_3.l2) != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            MixVideosViewModel mixVideosViewModel = (MixVideosViewModel) aqS107S0300000_3.l1;
            C56549MHh.LIZ(mixVideosViewModel.LJLLLL, mixVideosViewModel.LJLJI, mixVideosViewModel.LJLLLLLL, ((Long) aqS107S0300000_3.l2).longValue(), elapsedRealtime, C52941Kq9.LIZ(), new QCU());
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$45(AqS107S0300000_3 aqS107S0300000_3, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        assemble.nv0((PoiDetailContentHeaderBaseAssem) aqS107S0300000_3.l0, new AqS134S0200000_3((PoiListApi.PoiDetailResponse) aqS107S0300000_3.l1, (C191187es) aqS107S0300000_3.l2, 294));
        assemble.xv0((PoiDetailContentHeaderBaseAssem) aqS107S0300000_3.l0, C190527do.LJLIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$46(AqS107S0300000_3 aqS107S0300000_3, Object obj) {
        boolean z;
        boolean z2;
        int i;
        C203127y8 state = (C203127y8) obj;
        o.LJIIIZ(state, "state");
        C81Z c81z = ((PhotoViewModelV2) aqS107S0300000_3.l0).LJLJLLL;
        int i2 = state.LJLIL;
        boolean LJ = o.LJ(state.LJLJJLL, Boolean.TRUE);
        Float f = (Float) aqS107S0300000_3.l1;
        Boolean bool = (Boolean) aqS107S0300000_3.l2;
        if (c81z.LIZJ > 0) {
            Aweme aweme = c81z.LJ;
            if (aweme != null) {
                C2045481a c2045481a = C2045481a.LIZ;
                String str = c81z.LIZLLL;
                long elapsedRealtime = SystemClock.elapsedRealtime() - c81z.LIZJ;
                if (c81z.LIZIZ && !LJ) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
                if (photoModeImageInfo != null && photoModeImageInfo.hasTitle()) {
                    i = 1;
                } else {
                    i = 0;
                }
                z = false;
                c2045481a.logPinchZoom(str, aweme, i2, elapsedRealtime, z2, Integer.valueOf(i), c81z.LIZ, f, Boolean.valueOf(!LJ), bool, Boolean.valueOf(C2MX.LIZ().LIZ(c81z.LIZLLL)));
            } else {
                z = false;
            }
            c81z.LIZJ = -1L;
            c81z.LIZIZ = z;
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$47(AqS107S0300000_3 aqS107S0300000_3, Object obj) {
        C181627Aw setState = (C181627Aw) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C181627Aw.LIZ(setState, null, (CommentRethinkPopup) aqS107S0300000_3.l0, null, (UpvoteStruct) aqS107S0300000_3.l1, null, (Boolean) aqS107S0300000_3.l2, 21);
    }

    public static final Object invoke$5(AqS107S0300000_3 aqS107S0300000_3, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.q05, new AObjectS85S0300000_3((Aweme) aqS107S0300000_3.l0, (AllFavoriteFragment) aqS107S0300000_3.l1, (ActivityC45651qj) aqS107S0300000_3.l2, 1));
        actionGroup.LJIIIIZZ(R.string.cg_, new AObjectS27S0000000_3(4));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS107S0300000_3 aqS107S0300000_3, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.q05, new AObjectS85S0300000_3((Aweme) aqS107S0300000_3.l0, (CollectionContentFragment) aqS107S0300000_3.l1, (ActivityC45651qj) aqS107S0300000_3.l2, 0));
        actionGroup.LJIIIIZZ(R.string.cg_, new AObjectS27S0000000_3(3));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS107S0300000_3 aqS107S0300000_3, Object obj) {
        int i;
        int i2;
        int i3;
        C192037gF v3;
        C192037gF v32;
        List it = (List) obj;
        o.LJIIIZ(it, "it");
        boolean z = true;
        char c = 1;
        if (!it.isEmpty() || (((v3 = ((CollectionContentAssem) aqS107S0300000_3.l0).v3()) != null && v3.LJLJI) || (v32 = ((CollectionContentAssem) aqS107S0300000_3.l0).v3()) == null || v32.LJLIL != 0)) {
            ((C192347gk) aqS107S0300000_3.l2).resetLoadMoreState();
            CollectionContentAssem collectionContentAssem = (CollectionContentAssem) aqS107S0300000_3.l0;
            collectionContentAssem.withState(collectionContentAssem.x3(), new AqS169S0100000_3((RecyclerView) aqS107S0300000_3.l1, 127));
            List<C192217gX> data = ((C192347gk) aqS107S0300000_3.l2).getData();
            if (data != null) {
                data.clear();
            }
            if (!it.isEmpty()) {
                Iterator it2 = it.iterator();
                while (it2.hasNext()) {
                    if (((C192217gX) it2.next()).LJLILLLLZI != 0) {
                        i = 1;
                        break;
                    }
                }
            }
            i = 0;
            C192347gk c192347gk = (C192347gk) aqS107S0300000_3.l2;
            List LLJILJILJ = ORZ.LLJILJILJ(it);
            C192037gF v33 = ((CollectionContentAssem) aqS107S0300000_3.l0).v3();
            if (v33 != null && v33.LJLIL == 0) {
                ListProtector.add(LLJILJILJ, 0, new C192217gX(i, c == true ? 1 : 0));
            }
            c192347gk.addData(LLJILJILJ);
            CollectionContentAssem collectionContentAssem2 = (CollectionContentAssem) aqS107S0300000_3.l0;
            if (it.isEmpty()) {
                i2 = 0;
            } else {
                Iterator it3 = it.iterator();
                i2 = 0;
                while (it3.hasNext()) {
                    if (((C192217gX) it3.next()).LJLILLLLZI == 2 && (i2 = i2 + 1) < 0) {
                        C47261Igj.LJJJJIZL();
                        throw null;
                    }
                }
            }
            C192037gF v34 = ((CollectionContentAssem) aqS107S0300000_3.l0).v3();
            if (v34 != null) {
                i3 = v34.LJLILLLLZI;
            } else {
                i3 = Integer.MAX_VALUE;
            }
            if (i2 >= i3) {
                z = false;
            }
            collectionContentAssem2.LJLJI = z;
        } else {
            ((RecyclerView) aqS107S0300000_3.l1).setVisibility(8);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS107S0300000_3 aqS107S0300000_3, Object obj) {
        List it = (List) obj;
        o.LJIIIZ(it, "it");
        ((C192737hN) aqS107S0300000_3.l0).resetLoadMoreState();
        ((RecyclerView) aqS107S0300000_3.l1).setVisibility(0);
        List<C192727hM> data = ((C192737hN) aqS107S0300000_3.l0).getData();
        if (data != null) {
            data.clear();
        }
        if (!((C192817hV) ((CollectionListChooseAssem) aqS107S0300000_3.l2).LJLJI.getValue()).LJLIL) {
            ((C192737hN) aqS107S0300000_3.l0).insertData(new C192727hM(new CollectionDetail(null, null, null, null, null, null, null, null, null, 511, null), 0), 0);
        }
        ((C192737hN) aqS107S0300000_3.l0).addData(it);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS107S0300000_3 aqS107S0300000_3, Object obj) {
        Collection it = (Collection) obj;
        o.LJIIIZ(it, "it");
        ((C192697hJ) aqS107S0300000_3.l0).resetLoadMoreState();
        ((RecyclerView) aqS107S0300000_3.l1).setVisibility(0);
        List<C192727hM> data = ((C192697hJ) aqS107S0300000_3.l0).getData();
        if (data != null) {
            data.clear();
        }
        List LLJILJILJ = ORZ.LLJILJILJ(it);
        if (((Boolean) ((CollectionListMainUIAssem) aqS107S0300000_3.l2).LJLJI.getValue()).booleanValue() && !((ArrayList) LLJILJILJ).isEmpty()) {
            ((C192697hJ) aqS107S0300000_3.l0).insertData(new C192727hM(new CollectionDetail(null, null, null, null, null, null, null, null, null, 511, null), 0), 0);
        }
        ((C192697hJ) aqS107S0300000_3.l0).addData(LLJILJILJ);
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS107S0300000_3(X.ActivityC45651qj r3, com.ss.android.ugc.aweme.poi.PoiData r4, com.ss.android.ugc.aweme.poi.search.PoiSearchVM r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 39: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r5
            r1.l2 = r4
            r0 = 1
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r3
            r1.l2 = r4
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS107S0300000_3.<init>(X.1qj, com.ss.android.ugc.aweme.poi.PoiData, com.ss.android.ugc.aweme.poi.search.PoiSearchVM, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS107S0300000_3(com.ss.android.ugc.aweme.comment.commentlist.managementv2.CommentManagementAssemVM r3, java.lang.Throwable r4, java.util.Set r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r3
            r1.l2 = r4
            r0 = 1
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r5
            r1.l2 = r3
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS107S0300000_3.<init>(com.ss.android.ugc.aweme.comment.commentlist.managementv2.CommentManagementAssemVM, java.lang.Throwable, java.util.Set, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS107S0300000_3(ActivityC45651qj activityC45651qj, C197617pF c197617pF, AqS153S0100000_3 aqS153S0100000_3, int i) {
        super(1);
        this.$t = i;
        this.l0 = activityC45651qj;
        this.l1 = c197617pF;
        this.l2 = aqS153S0100000_3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS107S0300000_3(C76732zl c76732zl, AbstractC224038ql abstractC224038ql, C76732zl c76732zl2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c76732zl;
        this.l1 = abstractC224038ql;
        this.l2 = c76732zl2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS107S0300000_3(EnumC181857Bt enumC181857Bt, NowShareViewModel nowShareViewModel, InterfaceC194547kI interfaceC194547kI, int i) {
        super(1);
        this.$t = i;
        this.l0 = enumC181857Bt;
        this.l1 = nowShareViewModel;
        this.l2 = interfaceC194547kI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS107S0300000_3(C7ML c7ml, NowPostCellViewModel nowPostCellViewModel, AbstractC194637kR abstractC194637kR, int i) {
        super(1);
        this.$t = i;
        this.l0 = c7ml;
        this.l1 = nowPostCellViewModel;
        this.l2 = abstractC194637kR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS107S0300000_3(C188217a5 c188217a5, WatchHistoryManagerAssem watchHistoryManagerAssem, EnumC188177a1 enumC188177a1, int i) {
        super(1);
        this.$t = i;
        this.l0 = c188217a5;
        this.l1 = watchHistoryManagerAssem;
        this.l2 = enumC188177a1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS107S0300000_3(C191327f6 c191327f6, C8DU c8du, C191337f7 c191337f7, int i) {
        super(1);
        this.$t = i;
        this.l0 = c191327f6;
        this.l1 = c8du;
        this.l2 = c191337f7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS107S0300000_3(C192697hJ c192697hJ, RecyclerView recyclerView, CollectionListMainUIAssem collectionListMainUIAssem, int i) {
        super(1);
        this.$t = i;
        this.l0 = c192697hJ;
        this.l1 = recyclerView;
        this.l2 = collectionListMainUIAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS107S0300000_3(C192737hN c192737hN, RecyclerView recyclerView, CollectionListChooseAssem collectionListChooseAssem, int i) {
        super(1);
        this.$t = i;
        this.l0 = c192737hN;
        this.l1 = recyclerView;
        this.l2 = collectionListChooseAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS107S0300000_3(AbstractC211528Rw abstractC211528Rw, C211498Rt c211498Rt, C84654XKg c84654XKg, int i) {
        super(1);
        this.$t = i;
        this.l0 = abstractC211528Rw;
        this.l1 = c211498Rt;
        this.l2 = c84654XKg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS107S0300000_3(C214238ax c214238ax, C214238ax<S, VM, T, ITEM> c214238ax2, C8XE c8xe, C68322mC<ReusedAssem<? extends C3C8>> c68322mC) {
        super(1);
        this.$t = c68322mC;
        this.l0 = c214238ax;
        this.l1 = c214238ax2;
        this.l2 = c8xe;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS107S0300000_3(C222588oQ c222588oQ, C222038nX c222038nX, ViewGroup viewGroup, int i) {
        super(1);
        this.$t = i;
        this.l0 = c222588oQ;
        this.l1 = c222038nX;
        this.l2 = viewGroup;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS107S0300000_3(Y9G y9g, C217868go c217868go, CommentMentionCell commentMentionCell, int i) {
        super(1);
        this.$t = i;
        this.l0 = y9g;
        this.l1 = c217868go;
        this.l2 = commentMentionCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS107S0300000_3(Context context, PoiListApi.PoiDetailResponse poiDetailResponse, LocationDetailInfoAssem locationDetailInfoAssem, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.l1 = poiDetailResponse;
        this.l2 = locationDetailInfoAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS107S0300000_3(View view, AllFavoriteFragment allFavoriteFragment, Aweme aweme, int i) {
        super(1);
        this.$t = i;
        this.l0 = view;
        this.l1 = allFavoriteFragment;
        this.l2 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS107S0300000_3(View view, ViewPagerAssem viewPagerAssem, C8VL c8vl, int i) {
        super(1);
        this.$t = i;
        this.l0 = view;
        this.l1 = viewPagerAssem;
        this.l2 = c8vl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS107S0300000_3(Assembler assembler, Assembler assembler2, FeedVideoAssem feedVideoAssem, InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> interfaceC65350Pko) {
        super(1);
        this.$t = interfaceC65350Pko;
        this.l0 = assembler;
        this.l1 = assembler2;
        this.l2 = feedVideoAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS107S0300000_3(ReusedUIAssem reusedUIAssem, ReusedUIAssem<?> reusedUIAssem2, VideoBaseCell videoBaseCell, View view) {
        super(1);
        this.$t = view;
        this.l0 = reusedUIAssem;
        this.l1 = reusedUIAssem2;
        this.l2 = videoBaseCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS107S0300000_3(CommentManagementBottomBarAssem commentManagementBottomBarAssem, UIAssem uIAssem, AbstractC175526ui abstractC175526ui, int i) {
        super(1);
        this.$t = i;
        this.l0 = commentManagementBottomBarAssem;
        this.l1 = uIAssem;
        this.l2 = abstractC175526ui;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS107S0300000_3(BottomDefaultCommentAssem bottomDefaultCommentAssem, GiftStruct giftStruct, GiftViewModel giftViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = bottomDefaultCommentAssem;
        this.l1 = giftStruct;
        this.l2 = giftViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS107S0300000_3(BottomBarFragment bottomBarFragment, View view, BottomBarProtocol bottomBarProtocol, int i) {
        super(1);
        this.$t = i;
        this.l0 = bottomBarFragment;
        this.l1 = view;
        this.l2 = bottomBarProtocol;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS107S0300000_3(CommentRethinkPopup commentRethinkPopup, UpvoteStruct upvoteStruct, Boolean bool, int i) {
        super(1);
        this.$t = i;
        this.l0 = commentRethinkPopup;
        this.l1 = upvoteStruct;
        this.l2 = bool;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS107S0300000_3(CommentHeaderWidget commentHeaderWidget, IMiniAppService iMiniAppService, MicroAppInfo microAppInfo, int i) {
        super(1);
        this.$t = i;
        this.l0 = commentHeaderWidget;
        this.l1 = iMiniAppService;
        this.l2 = microAppInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS107S0300000_3(CollectionContentAssem collectionContentAssem, RecyclerView recyclerView, C192347gk c192347gk, int i) {
        super(1);
        this.$t = i;
        this.l0 = collectionContentAssem;
        this.l1 = recyclerView;
        this.l2 = c192347gk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS107S0300000_3(Aweme aweme, AllFavoriteFragment allFavoriteFragment, ActivityC45651qj activityC45651qj, int i) {
        super(1);
        this.$t = i;
        this.l0 = aweme;
        this.l1 = allFavoriteFragment;
        this.l2 = activityC45651qj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS107S0300000_3(Aweme aweme, CollectionContentFragment collectionContentFragment, ActivityC45651qj activityC45651qj, int i) {
        super(1);
        this.$t = i;
        this.l0 = aweme;
        this.l1 = collectionContentFragment;
        this.l2 = activityC45651qj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS107S0300000_3(Aweme aweme, Aweme aweme2, AddYoursTopic addYoursTopic, int i) {
        super(1);
        this.$t = i;
        this.l0 = aweme;
        this.l1 = aweme2;
        this.l2 = addYoursTopic;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS107S0300000_3(VideoItemParams videoItemParams, TextExtraStruct textExtraStruct, Context context, int i) {
        super(1);
        this.$t = i;
        this.l0 = videoItemParams;
        this.l1 = textExtraStruct;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS107S0300000_3(FollowListAdapter.FollowItemViewHolder followItemViewHolder, FollowListAdapter followListAdapter, User user, int i) {
        super(1);
        this.$t = i;
        this.l0 = user;
        this.l1 = followListAdapter;
        this.l2 = followItemViewHolder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS107S0300000_3(MixVideosResponse mixVideosResponse, MixVideosResponse mixVideosResponse2, MixVideosManageViewModel mixVideosManageViewModel, InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        super(1);
        this.$t = interfaceC67352kd;
        this.l0 = mixVideosResponse;
        this.l1 = mixVideosResponse2;
        this.l2 = mixVideosManageViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS107S0300000_3(MixStruct mixStruct, MixVideosViewModel mixVideosViewModel, Long l, int i) {
        super(1);
        this.$t = i;
        this.l0 = mixStruct;
        this.l1 = mixVideosViewModel;
        this.l2 = l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS107S0300000_3(NowPostBaseCellAssem nowPostBaseCellAssem, NowPostBaseCellAssem<ASSEM, T> nowPostBaseCellAssem2, View view, C181847Bs c181847Bs) {
        super(1);
        this.$t = c181847Bs;
        this.l0 = nowPostBaseCellAssem;
        this.l1 = nowPostBaseCellAssem2;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS107S0300000_3(PoiDetailContentHeaderBaseAssemV3 poiDetailContentHeaderBaseAssemV3, PoiListApi.PoiDetailResponse poiDetailResponse, C191187es c191187es, int i) {
        super(1);
        this.$t = i;
        this.l0 = poiDetailContentHeaderBaseAssemV3;
        this.l1 = poiDetailResponse;
        this.l2 = c191187es;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS107S0300000_3(PoiDetailContentHeaderBaseAssem poiDetailContentHeaderBaseAssem, PoiListApi.PoiDetailResponse poiDetailResponse, C191187es c191187es, int i) {
        super(1);
        this.$t = i;
        this.l0 = poiDetailContentHeaderBaseAssem;
        this.l1 = poiDetailResponse;
        this.l2 = c191187es;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS107S0300000_3(PoiDetailPageContainerAssem poiDetailPageContainerAssem, PoiDetailPageContainerAssem poiDetailPageContainerAssem2, List<C8VL> list, Map<String, C8VL> map) {
        super(1);
        this.$t = map;
        this.l0 = poiDetailPageContainerAssem;
        this.l1 = poiDetailPageContainerAssem2;
        this.l2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS107S0300000_3(NetworkHelper networkHelper, ListAssem listAssem, C191537fR c191537fR, int i) {
        super(1);
        this.$t = i;
        this.l0 = networkHelper;
        this.l1 = listAssem;
        this.l2 = c191537fR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS107S0300000_3(UserProfileRelationLabelAssem userProfileRelationLabelAssem, MatchedFriendStruct matchedFriendStruct, Context context, int i) {
        super(1);
        this.$t = i;
        this.l0 = userProfileRelationLabelAssem;
        this.l1 = matchedFriendStruct;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS107S0300000_3(TopicReviewCell topicReviewCell, FragmentManager fragmentManager, TopicReview topicReview, int i) {
        super(1);
        this.$t = i;
        this.l0 = topicReviewCell;
        this.l1 = fragmentManager;
        this.l2 = topicReview;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS107S0300000_3(PhotoViewModelV2 photoViewModelV2, Float f, Boolean bool, int i) {
        super(1);
        this.$t = i;
        this.l0 = photoViewModelV2;
        this.l1 = f;
        this.l2 = bool;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS107S0300000_3(BaseCellContentComponent baseCellContentComponent, BaseCellContentComponent<? extends C3C8> baseCellContentComponent2, StoryImmersiveCollectionConfig storyImmersiveCollectionConfig, C8O4 c8o4) {
        super(1);
        this.$t = c8o4;
        this.l0 = baseCellContentComponent;
        this.l1 = baseCellContentComponent2;
        this.l2 = storyImmersiveCollectionConfig;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS107S0300000_3(ProfileHeaderRelationLabelComponent profileHeaderRelationLabelComponent, MatchedFriendStruct matchedFriendStruct, Context context, int i) {
        super(1);
        this.$t = i;
        this.l0 = profileHeaderRelationLabelComponent;
        this.l1 = matchedFriendStruct;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS107S0300000_3(List list, List<? extends BottomBarProtocol> list2, BottomBarFragment bottomBarFragment, View view) {
        super(1);
        this.$t = view;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = bottomBarFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS107S0300000_3(List list, List<C192727hM> list2, CollectionListResponse collectionListResponse, Boolean bool) {
        super(1);
        this.$t = bool;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = collectionListResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS107S0300000_3(List list, List<Aweme> list2, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        super(1);
        this.$t = arrayList2;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = arrayList;
    }
}
