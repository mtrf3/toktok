package Y;

import X.AKT;
import X.AM0;
import X.ASL;
import X.ASQ;
import X.ASX;
import X.AV1;
import X.AXU;
import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C176276vv;
import X.C176996x5;
import X.C1799074g;
import X.C1811278y;
import X.C181847Bs;
import X.C184817Nd;
import X.C185157Ol;
import X.C185167Om;
import X.C186927Vg;
import X.C188727au;
import X.C195627m2;
import X.C1PH;
import X.C200007t6;
import X.C2049682q;
import X.C2064588j;
import X.C2068389v;
import X.C208288Fk;
import X.C214788bq;
import X.C215008cC;
import X.C215498cz;
import X.C216678et;
import X.C220488l2;
import X.C222578oP;
import X.C223598q3;
import X.C224888s8;
import X.C225318sp;
import X.C227728wi;
import X.C227768wm;
import X.C234529Ii;
import X.C235119Kp;
import X.C26045AKb;
import X.C27740Aue;
import X.C2KM;
import X.C2NU;
import X.C2S6;
import X.C30746C4w;
import X.C38987FRv;
import X.C41424GNo;
import X.C45804HyK;
import X.C47261Igj;
import X.C50420Jqa;
import X.C50469JrN;
import X.C50650JuI;
import X.C50651JuJ;
import X.C50652JuK;
import X.C54838Lfe;
import X.C55096Ljo;
import X.C55723Ltv;
import X.C57127MbT;
import X.C57258Mda;
import X.C57362MfG;
import X.C57364MfI;
import X.C58096Mr6;
import X.C58655N0h;
import X.C58704N2e;
import X.C59411NTj;
import X.C59895Nf1;
import X.C5S1;
import X.C63081OpJ;
import X.C6DL;
import X.C6ZT;
import X.C73340SqO;
import X.C73969T1h;
import X.C78688UuS;
import X.C78841Uwv;
import X.C78866UxK;
import X.C79004UzY;
import X.C7BR;
import X.C7MK;
import X.C7SW;
import X.C7ZV;
import X.C88545Yp3;
import X.C8TN;
import X.C9KF;
import X.C9T4;
import X.EnumC2049482o;
import X.EnumC215748dO;
import X.EnumC57365MfJ;
import X.EnumC57366MfK;
import X.FMX;
import X.FT5;
import X.HG3;
import X.HT5;
import X.IWF;
import X.InterfaceC176256vt;
import X.InterfaceC1798974f;
import X.InterfaceC194547kI;
import X.InterfaceC199107re;
import X.InterfaceC215558d5;
import X.InterfaceC46330IGg;
import X.InterfaceC59418NTq;
import X.InterfaceC82683Wch;
import X.InterfaceC86003Zc;
import X.InterfaceC88472Yns;
import X.JHM;
import X.K02;
import X.LPX;
import X.LSC;
import X.NT2;
import X.OP1;
import X.OP4;
import X.RBX;
import X.SY4;
import X.T16;
import X.V0N;
import X.V9W;
import X.XI7;
import X.Z9N;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.DanmakuPresentAssem;
import com.ss.android.ugc.aweme.ad.feed.IAdLightWebPageOpen;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.commercialize.model.DisclaimerText;
import com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageOpenUtils;
import com.ss.android.ugc.aweme.core.DanmakuViewModel;
import com.ss.android.ugc.aweme.eventtrack.eventfiles.DeleteDanmakuEvent;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultAssem;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarLiveAssem;
import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationAssem;
import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.publish.PublishPreviewInfo;
import com.ss.android.ugc.aweme.feed.spi.CommonFeedServiceImpl;
import com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.nows.feed.caption.NowCollectionCellCaptionAssem;
import com.ss.android.ugc.aweme.nows.feed.ui.userrow.AbsNowPostUserRowAssem;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewListItemCell;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.v2.UserProfilePreloadHelper;
import com.ss.android.ugc.aweme.repo.DanmakuApi;
import com.ss.android.ugc.aweme.repo.DanmakuDeleteResponse;
import com.ss.android.ugc.aweme.sticker.data.VideoShareInfoStruct;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedSearchBottomBarAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS107S0300000_3;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.AqS57S1100000_3;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes4.dex */
public class ACListenerS29S0300000_3 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS29S0300000_3 aCListenerS29S0300000_3, View view) {
        ((C176996x5) aCListenerS29S0300000_3.l2).LJIILJJIL();
        ((InterfaceC176256vt) aCListenerS29S0300000_3.l0).LJIILIIL(CommentVideoModel.Type.COMMENT, (Comment) aCListenerS29S0300000_3.l1);
    }

    public static final void onClick$1(ACListenerS29S0300000_3 aCListenerS29S0300000_3, View view) {
        C2064588j c2064588j = (C2064588j) aCListenerS29S0300000_3.l0;
        Context context = ((SY4) aCListenerS29S0300000_3.l1).getContext();
        o.LJIIIIZZ(context, "context");
        c2064588j.getClass();
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "aweme://createPhoto");
        buildRoute.withParam("enter_from", "personal_homepage");
        buildRoute.withParam("shoot_way", "profile_notice");
        buildRoute.open();
        C2064588j.LIZ("upload");
        C2064588j c2064588j2 = (C2064588j) aCListenerS29S0300000_3.l0;
        ViewGroup viewGroup = (ViewGroup) aCListenerS29S0300000_3.l2;
        c2064588j2.getClass();
        viewGroup.setVisibility(8);
    }

    public static final void onClick$10(ACListenerS29S0300000_3 aCListenerS29S0300000_3, View view) {
        int i;
        String requestId;
        NT2 LIZJ;
        final Aweme aweme = ((VideoItemParams) aCListenerS29S0300000_3.l0).getAweme();
        if (aweme == null) {
            return;
        }
        if (C2049682q.LIZ(aweme) && (aweme.getAuthor() == null || TextUtils.isEmpty(aweme.getAuthorUid()))) {
            C5S1 c5s1 = new C5S1((Context) aCListenerS29S0300000_3.l1);
            c5s1.LIZJ(R.string.i4z);
            c5s1.LJ();
            return;
        }
        final DataCenter dataCenter = ((VideoItemParams) aCListenerS29S0300000_3.l0).dataCenter;
        if (AV1.LJIIJJI() || C63081OpJ.LJLJLLL(aweme)) {
            return;
        }
        if (!o.LJ(((VideoItemParams) aCListenerS29S0300000_3.l0).mEventType, "new_ad_fake_user") && C63081OpJ.LJLJJL(aweme) && !aweme.isAd()) {
            return;
        }
        if (!aweme.isCanPlay() || aweme.isDelete()) {
            C5S1 c5s12 = new C5S1((Context) aCListenerS29S0300000_3.l1);
            if (aweme.isImage()) {
                i = R.string.h_y;
            } else {
                i = R.string.tob;
            }
            c5s12.LIZJ(i);
            c5s12.LJ();
            return;
        }
        IAdSceneService LJII = AdSceneServiceImpl.LJII();
        if (LJII != null && (LIZJ = LJII.LIZJ()) != null) {
            LIZJ.LJJIJIIJI((Context) aCListenerS29S0300000_3.l1, aweme);
        }
        C57362MfG c57362MfG = new C57362MfG();
        c57362MfG.LJJIIZI("homepage_hot");
        c57362MfG.LJJLI = EnumC57366MfK.ITEM;
        c57362MfG.LJJJJI();
        c57362MfG.LJJLIIIIJ = EnumC57365MfJ.ENTER_PROFILE;
        c57362MfG.LJJIIZ(aweme);
        c57362MfG.LJJJJIZL(aweme.getAuthor());
        c57362MfG.LJJJJ(aweme.getAuthor().getRequestId());
        c57362MfG.LJJIZ();
        C38987FRv.LJI(LSC.PROFILE);
        JSONObject jSONObject = ((VideoItemParams) aCListenerS29S0300000_3.l0).mRequestId;
        if (jSONObject == null || (requestId = jSONObject.optString("request_id")) == null) {
            requestId = aweme.getRequestId();
        }
        aweme.setRequestId(requestId);
        if (dataCenter != null) {
            dataCenter.jv0(new C50420Jqa(19, aweme), "feed_internal_event");
        }
        if (C63081OpJ.LLIIIILZ(aweme)) {
            V9W LJIJI = C73340SqO.LJIJI();
            final Context context = (Context) aCListenerS29S0300000_3.l1;
            final VideoItemParams videoItemParams = (VideoItemParams) aCListenerS29S0300000_3.l0;
            InterfaceC59418NTq interfaceC59418NTq = new InterfaceC59418NTq() { // from class: X.82n
                @Override // X.InterfaceC59418NTq
                public final void LIZ() {
                    String str;
                    String str2;
                    String str3;
                    DataCenter dataCenter2 = DataCenter.this;
                    if (dataCenter2 != null) {
                        dataCenter2.jv0("", "to_profile");
                    }
                    C7ZV c7zv = new C7ZV();
                    c7zv.LJJIIZI(videoItemParams.mPageType, aweme);
                    String str4 = videoItemParams.mEventType;
                    if (str4 == null) {
                        str4 = "";
                    }
                    c7zv.LIZLLL = str4;
                    c7zv.LJJIIZ(context);
                    DataCenter dataCenter3 = DataCenter.this;
                    String str5 = null;
                    if (dataCenter3 != null) {
                        str = (String) dataCenter3.get("playlist_type", "");
                    } else {
                        str = null;
                    }
                    c7zv.LJJLIIIJLLLLLLLZ = str;
                    DataCenter dataCenter4 = DataCenter.this;
                    if (dataCenter4 != null) {
                        str2 = (String) dataCenter4.get("playlist_id", "");
                    } else {
                        str2 = null;
                    }
                    c7zv.LJJLIL = str2;
                    DataCenter dataCenter5 = DataCenter.this;
                    if (dataCenter5 != null) {
                        str3 = (String) dataCenter5.get("playlist_id_key", "");
                    } else {
                        str3 = null;
                    }
                    c7zv.LJJLIIJ = str3;
                    DataCenter dataCenter6 = DataCenter.this;
                    if (dataCenter6 != null) {
                        str5 = (String) dataCenter6.get("tab_name", "");
                    }
                    c7zv.LJIILL = str5;
                    c7zv.LJIILLIIL = C227768wm.LJIIL(videoItemParams.mPageType, aweme);
                    c7zv.LJJLI = "click_head";
                    c7zv.LJJIL = C2S6.LIZ(context).getSearchId();
                    c7zv.LJJIFFI = C2S6.LIZ(context).getSearchResultId();
                    C78841Uwv.LIZJ(c7zv, C227768wm.LIZIZ(aweme));
                    c7zv.LJIILIIL();
                }
            };
            LJIJI.getClass();
            AM0.LIZ(context, aweme, 43, interfaceC59418NTq);
            return;
        }
        String LIZIZ = RequestIdService.LJ().LIZIZ(((VideoItemParams) aCListenerS29S0300000_3.l0).mPageType, aweme);
        if (TextUtils.equals(((VideoItemParams) aCListenerS29S0300000_3.l0).mEventType, "homepage_hot")) {
            String uid = aweme.getAuthor().getUid();
            long j = aweme.getAuthor().roomId;
            String aid = aweme.getAid();
            JSONObject LJJIJIL = C78688UuS.LJJIJIL("homepage_hot", "video", LIZIZ);
            try {
                LJJIJIL.put("video_value", aid);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            C78688UuS.LJJJJLL(1, uid, j, LJJIJIL);
        } else if (TextUtils.equals(((VideoItemParams) aCListenerS29S0300000_3.l0).mEventType, "homepage_follow")) {
            String uid2 = aweme.getAuthor().getUid();
            long j2 = aweme.getAuthor().roomId;
            String aid2 = aweme.getAid();
            JSONObject LJJIJIL2 = C78688UuS.LJJIJIL("homepage_follow", "video", LIZIZ);
            try {
                LJJIJIL2.put("video_value", aid2);
            } catch (JSONException e2) {
                C16880lQ.LLLLIIL(e2);
            }
            C78688UuS.LJJJJLL(1, uid2, j2, LJJIJIL2);
        } else {
            String str = ((VideoItemParams) aCListenerS29S0300000_3.l0).mEventType;
            boolean z = ((VideoItemParams) aCListenerS29S0300000_3.l0).isMyProfile;
            if ("opus".equals(str)) {
                if (z) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
            } else if ("collection".equals(str)) {
                if (z) {
                    str = "personal_collection";
                } else {
                    str = "others_collection";
                }
            }
            C78688UuS.LJJJJLL(1, aweme.getAuthor().getUid(), aweme.getAuthor().roomId, C78688UuS.LJJIJIL(str, "head", LIZIZ));
        }
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        enterRoomConfig.mLogData.videoId = aweme.getAid();
        if (aweme.isAd() || C63081OpJ.LLF(aweme)) {
            C59411NTj.LIZIZ.LIZLLL(aweme, enterRoomConfig, 52);
        }
        enterRoomConfig.mRoomsData.enterFromMerge = ((VideoItemParams) aCListenerS29S0300000_3.l0).mEventType;
        enterRoomConfig.mRoomsData.enterMethod = "video_head";
        enterRoomConfig.mLogData.recContentId = aweme.getAid();
        enterRoomConfig.mLogData.recContentType = "video";
        if (C30746C4w.LIZ()) {
            C30746C4w.LIZJ(((FeedAvatarLiveAssem) aCListenerS29S0300000_3.l2).LLFZ, enterRoomConfig);
        }
        LiveOuterService.LJJJLL().LJIILL().LJIIZILJ((Context) aCListenerS29S0300000_3.l1, aweme.getAuthor(), enterRoomConfig);
        C59411NTj.LIZIZ.LJIIIIZZ();
    }

    public static final void onClick$11(ACListenerS29S0300000_3 aCListenerS29S0300000_3, View view) {
        String desc;
        Aweme aweme = ((NowCollectionCellCaptionAssem) aCListenerS29S0300000_3.l0).LLFF;
        if (aweme == null || (desc = aweme.getDesc()) == null || desc.length() == 0) {
            String LIZLLL = C7MK.LIZLLL(((C181847Bs) ((NowCollectionCellCaptionAssem) aCListenerS29S0300000_3.l0).LLD.getValue()).LJLILLLLZI, (C195627m2) aCListenerS29S0300000_3.l1);
            C7MK.LJI("click_add_caption", new AqS57S1100000_3(LIZLLL, (NowCollectionCellCaptionAssem) aCListenerS29S0300000_3.l0, 36));
            ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ((NowCollectionCellCaptionAssem) aCListenerS29S0300000_3.l0);
            if (LJIIIIZZ != null) {
                NowCollectionCellCaptionAssem nowCollectionCellCaptionAssem = (NowCollectionCellCaptionAssem) aCListenerS29S0300000_3.l0;
                NowCollectionCellCaptionAssem nowCollectionCellCaptionAssem2 = (NowCollectionCellCaptionAssem) aCListenerS29S0300000_3.l2;
                Aweme aweme2 = nowCollectionCellCaptionAssem.LLFF;
                if (aweme2 == null) {
                    return;
                }
                C185167Om.LIZ(LJIIIIZZ, new C185157Ol(aweme2, nowCollectionCellCaptionAssem2), LIZLLL);
            }
        }
    }

    public static final void onClick$12(ACListenerS29S0300000_3 aCListenerS29S0300000_3, View view) {
        String str;
        String str2;
        String authorUid;
        C188727au c188727au = new C188727au();
        C1811278y c1811278y = (C1811278y) aCListenerS29S0300000_3.l0;
        String str3 = null;
        if (c1811278y != null) {
            str = c1811278y.LIZIZ;
        } else {
            str = null;
        }
        c188727au.LJIIIZ("enter_from", str);
        Aweme aweme = (Aweme) aCListenerS29S0300000_3.l1;
        if (aweme != null) {
            str2 = aweme.getAid();
        } else {
            str2 = null;
        }
        String str4 = "";
        if (str2 == null) {
            str2 = "";
        }
        c188727au.LJIIIZ("group_id", str2);
        Aweme aweme2 = (Aweme) aCListenerS29S0300000_3.l1;
        if (aweme2 != null && (authorUid = aweme2.getAuthorUid()) != null) {
            str4 = authorUid;
        }
        c188727au.LJIIIZ("author_id", str4);
        c188727au.LJIIIZ("anchor_type", "low_interest");
        FMX.LJIIL("tag_anchor_click", c188727au.LIZ);
        if (((Aweme) aCListenerS29S0300000_3.l1) != null) {
            C186927Vg c186927Vg = C186927Vg.LIZIZ;
            Context context = ((C7BR) aCListenerS29S0300000_3.l2).getContext();
            o.LJIIIIZZ(context, "this.context");
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
            o.LJI(LJJIFFI);
            Aweme aweme3 = (Aweme) aCListenerS29S0300000_3.l1;
            C1811278y c1811278y2 = (C1811278y) aCListenerS29S0300000_3.l0;
            if (c1811278y2 != null) {
                str3 = c1811278y2.LIZIZ;
            }
            c186927Vg.LJ(LJJIFFI, aweme3, str3, "low_interest");
        }
    }

    public static final void onClick$13(ACListenerS29S0300000_3 aCListenerS29S0300000_3, View view) {
        InterfaceC199107re interfaceC199107re;
        if (((C208288Fk) aCListenerS29S0300000_3.l0).LJZL && (interfaceC199107re = ((PoiReviewListItemCell) aCListenerS29S0300000_3.l1).LJLIL) != null) {
            interfaceC199107re.dA((PoiReviewsApi.PoiReviewModel) aCListenerS29S0300000_3.l2);
        }
    }

    public static final void onClick$14(ACListenerS29S0300000_3 aCListenerS29S0300000_3, View view) {
        Context context;
        Z9N z9n = Z9N.LIZIZ;
        Aweme aweme = ((VideoItemParams) aCListenerS29S0300000_3.l0).getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        String str = ((VideoItemParams) aCListenerS29S0300000_3.l0).mEventType;
        o.LJIIIIZZ(str, "item.eventType");
        XI7 xi7 = (XI7) aCListenerS29S0300000_3.l1;
        z9n.LLILZLL(aweme, str, (String) xi7.LIZIZ, (String) xi7.LIZ, ((FeedSearchBottomBarAssem) aCListenerS29S0300000_3.l2).LLFZ);
        FeedSearchBottomBarAssem feedSearchBottomBarAssem = (FeedSearchBottomBarAssem) aCListenerS29S0300000_3.l2;
        VideoItemParams videoItemParams = (VideoItemParams) aCListenerS29S0300000_3.l0;
        XI7 xi72 = (XI7) aCListenerS29S0300000_3.l1;
        feedSearchBottomBarAssem.getClass();
        Bundle q4 = FeedSearchBottomBarAssem.q4(videoItemParams, xi72);
        ConstraintLayout constraintLayout = feedSearchBottomBarAssem.LLFII;
        if (constraintLayout != null) {
            context = constraintLayout.getContext();
        } else {
            context = null;
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//search");
        buildRoute.withParam(q4);
        buildRoute.open();
    }

    public static final void onClick$15(ACListenerS29S0300000_3 aCListenerS29S0300000_3, View view) {
        InterfaceC46330IGg LJJLIIIIJ = IWF.LJJLIIIIJ();
        float currentPosition = ((float) LJJLIIIIJ.getCurrentPosition()) / ((float) LJJLIIIIJ.getDuration());
        SmartRoute buildRoute = SmartRouter.buildRoute(((C6DL) aCListenerS29S0300000_3.l0).LIZ, "//aweme/detail");
        buildRoute.withParam("id", ((VideoShareInfoStruct) aCListenerS29S0300000_3.l1).getAwemeId());
        buildRoute.withParam("extra_seek_progress", currentPosition);
        buildRoute.withParam("extra_is_from_shared_story", true);
        buildRoute.withParam("extra_prev_panel_id", C55723Ltv.LIZIZ.LJII().LIZIZ());
        buildRoute.open();
        C223598q3 c223598q3 = (C223598q3) aCListenerS29S0300000_3.l2;
        c223598q3.LJLLJ.post(new ARunnableS39S0100000_3(c223598q3, 219));
        ((C223598q3) aCListenerS29S0300000_3.l2).LJJ("click", (VideoShareInfoStruct) aCListenerS29S0300000_3.l1);
    }

    public static final void onClick$16(ACListenerS29S0300000_3 aCListenerS29S0300000_3, View view) {
        Map<String, String> map;
        HT5.LIZ = true;
        C188727au c188727au = ((C184817Nd) aCListenerS29S0300000_3.l0).LJLJI;
        if (c188727au != null) {
            map = c188727au.LIZ;
        } else {
            map = null;
        }
        FMX.LJIIL("enter_topic_detail", map);
        C7SW.LIZIZ("movie_detail_page");
        SmartRoute buildRoute = SmartRouter.buildRoute(((View) aCListenerS29S0300000_3.l1).getContext(), "//topic/movie");
        buildRoute.withParam("movie_id", ((TopicRawInfo) aCListenerS29S0300000_3.l2).id);
        buildRoute.open();
    }

    public static final void onClick$17(ACListenerS29S0300000_3 aCListenerS29S0300000_3, View view) {
        ((AbsNowPostUserRowAssem) aCListenerS29S0300000_3.l0).k4((User) aCListenerS29S0300000_3.l1, "click_head", (InterfaceC194547kI) aCListenerS29S0300000_3.l2);
    }

    public static final void onClick$18(ACListenerS29S0300000_3 aCListenerS29S0300000_3, View view) {
        ((AbsNowPostUserRowAssem) aCListenerS29S0300000_3.l0).k4((User) aCListenerS29S0300000_3.l1, "click_name", (InterfaceC194547kI) aCListenerS29S0300000_3.l2);
    }

    public static final void onClick$2(ACListenerS29S0300000_3 aCListenerS29S0300000_3, View view) {
        Activity LIZ = FT5.LIZ((View) aCListenerS29S0300000_3.l0, "context");
        if (LIZ != null && (LIZ instanceof ActivityC45651qj)) {
            VideoAuthorInfoRelationAssem videoAuthorInfoRelationAssem = (VideoAuthorInfoRelationAssem) aCListenerS29S0300000_3.l1;
            Aweme aweme = (Aweme) aCListenerS29S0300000_3.l2;
            VideoAuthorInfoVM q4 = videoAuthorInfoRelationAssem.q4();
            String anchorType = videoAuthorInfoRelationAssem.LLIIIJ;
            q4.getClass();
            o.LJIIIZ(aweme, "aweme");
            o.LJIIIZ(anchorType, "anchorType");
            C186927Vg.LIZIZ.LJ((ActivityC45651qj) LIZ, aweme, q4.LJLJI, anchorType);
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", q4.LJLJI);
            String aid = aweme.getAid();
            String str = "";
            if (aid == null) {
                aid = "";
            }
            c188727au.LJIIIZ("group_id", aid);
            String authorUid = aweme.getAuthorUid();
            if (authorUid != null) {
                str = authorUid;
            }
            c188727au.LJIIIZ("author_id", str);
            c188727au.LJIIIZ("anchor_type", anchorType);
            FMX.LJIIL("tag_anchor_click", c188727au.LIZ);
        }
    }

    public static final void onClick$3(ACListenerS29S0300000_3 aCListenerS29S0300000_3, View view) {
        String str;
        if (C6ZT.LIZ(view)) {
            return;
        }
        if (view.getContext() != null) {
            UserProfilePreloadHelper.LJIIIIZZ().LIZJ((User) aCListenerS29S0300000_3.l0);
            int commerceUserLevel = ((User) aCListenerS29S0300000_3.l0).getCommerceUserLevel();
            SmartRoute buildRoute = SmartRouter.buildRoute(view.getContext(), "aweme://user/profile/");
            buildRoute.withParam("uid", ((User) aCListenerS29S0300000_3.l0).getUid());
            buildRoute.withParam("sec_user_id", ((User) aCListenerS29S0300000_3.l0).getSecUid());
            buildRoute.withParam("enter_from", ((FollowListAdapter) aCListenerS29S0300000_3.l1).LL());
            buildRoute.withParam("profile_enterprise_type", commerceUserLevel);
            MatchedFriendStruct matchedFriendStruct = ((User) aCListenerS29S0300000_3.l0).getMatchedFriendStruct();
            if (matchedFriendStruct != null) {
                FollowListAdapter followListAdapter = (FollowListAdapter) aCListenerS29S0300000_3.l1;
                User user = (User) aCListenerS29S0300000_3.l0;
                String LL = followListAdapter.LL();
                String LLD = followListAdapter.LLD();
                EnumC57366MfK enumC57366MfK = EnumC57366MfK.CARD;
                String recType = matchedFriendStruct.getRecType();
                C57364MfI.Companion.getClass();
                buildRoute.withParam("recommend_enter_profile_params", new C57364MfI(LL, LLD, enumC57366MfK, recType, C200007t6.LIZ(user), user.getUid(), null, null, user.getRequestId(), null, matchedFriendStruct.getRelationType(), matchedFriendStruct.getSocialInfo(), matchedFriendStruct, null, null, null, false, null, null, null, null, false, null, false, 16769024, null));
            }
            buildRoute.open();
        }
        FollowListAdapter followListAdapter2 = (FollowListAdapter) aCListenerS29S0300000_3.l1;
        User user2 = (User) aCListenerS29S0300000_3.l0;
        followListAdapter2.getClass();
        C7ZV c7zv = new C7ZV();
        c7zv.LJJLIIIJJIZ = user2.getUid();
        c7zv.LIZLLL = followListAdapter2.LL();
        c7zv.LJJLJLI = followListAdapter2.LLD();
        c7zv.LJJLJ = "1044";
        c7zv.LJJLIIIJLJLI = user2.getRequestId();
        C78866UxK.LJIIZILJ(c7zv, user2);
        MatchedFriendStruct matchedFriendStruct2 = user2.getMatchedFriendStruct();
        if (matchedFriendStruct2 == null || (str = matchedFriendStruct2.getRecType()) == null) {
            str = "";
        }
        c7zv.LJIJI = str;
        c7zv.LJLLLL = Boolean.valueOf(AXU.LIZIZ(user2));
        c7zv.LJIILIIL();
        if (user2.getMatchedFriendStruct() != null) {
            C57362MfG c57362MfG = new C57362MfG();
            c57362MfG.LJJIIZI(followListAdapter2.LL());
            c57362MfG.LJJJI(followListAdapter2.LLD());
            c57362MfG.LJJLI = EnumC57366MfK.CARD;
            c57362MfG.LJJJJI();
            c57362MfG.LJJLIIIIJ = EnumC57365MfJ.ENTER_PROFILE;
            c57362MfG.LJJJJIZL(user2);
            c57362MfG.LJIILIIL();
        }
        ((FollowListAdapter.FollowItemViewHolder) aCListenerS29S0300000_3.l2).N();
    }

    public static final void onClick$4(ACListenerS29S0300000_3 aCListenerS29S0300000_3, final View view) {
        Resources resources = ((FollowListAdapter.FollowItemViewHolder) aCListenerS29S0300000_3.l0).LJLJL.getResources();
        String string = resources.getString(R.string.q1f);
        o.LJIIIIZZ(string, "res.getString(R.string.r…ove_follower_alert_title)");
        String string2 = resources.getString(R.string.cg_);
        o.LJIIIIZZ(string2, "res.getString(R.string.cancel)");
        CharSequence[] charSequenceArr = {string, string2};
        C41424GNo c41424GNo = new C41424GNo(view.getContext());
        final User user = (User) aCListenerS29S0300000_3.l1;
        final FollowListAdapter followListAdapter = (FollowListAdapter) aCListenerS29S0300000_3.l2;
        final FollowListAdapter.FollowItemViewHolder followItemViewHolder = (FollowListAdapter.FollowItemViewHolder) aCListenerS29S0300000_3.l0;
        c41424GNo.LIZ(charSequenceArr, new DialogInterface.OnClickListener() { // from class: X.8Dd
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (i == 0) {
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("enter_from", "fans");
                    String uid = User.this.getUid();
                    if (uid == null) {
                        uid = "";
                    }
                    c188727au.LJIIIZ("to_user_id", uid);
                    FMX.LJIIL("click_remove_fans", c188727au.LIZ);
                    Context context = view.getContext();
                    o.LJIIIIZZ(context, "v.context");
                    C26227ARb c26227ARb = new C26227ARb(context);
                    c26227ARb.LJ(R.string.q1f);
                    String string3 = view.getResources().getString(R.string.q1e);
                    o.LJIIIIZZ(string3, "v.resources.getString(R.…emove_follower_alert_msg)");
                    String LLLZ = C16880lQ.LLLZ(string3, Arrays.copyOf(new Object[]{AV1.LIZLLL(User.this)}, 1));
                    o.LJIIIIZZ(LLLZ, "format(format, *args)");
                    c26227ARb.LIZIZ(LLLZ);
                    UC0.LIZJ(c26227ARb, new AqS107S0300000_3(followItemViewHolder, followListAdapter, User.this, 14));
                    c26227ARb.LJI().LIZLLL();
                }
            }
        });
        c41424GNo.LIZIZ();
    }

    public static final void onClick$5(ACListenerS29S0300000_3 aCListenerS29S0300000_3, View view) {
        ((InterfaceC88472Yns) aCListenerS29S0300000_3.l0).invoke(Integer.valueOf(((C8TN) aCListenerS29S0300000_3.l1).LIZ));
        View view2 = (View) aCListenerS29S0300000_3.l2;
        o.LJIIIIZZ(view2, "view");
        ASQ.LIZLLL(view2, ASX.LIZ);
    }

    public static final void onClick$6(ACListenerS29S0300000_3 aCListenerS29S0300000_3, View view) {
        IAdLightWebPageOpen iAdLightWebPageOpen;
        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "otherclick", ((Aweme) aCListenerS29S0300000_3.l0).getAwemeRawAd());
        LIZLLL.LIZJ("disclaimer", "refer");
        LIZLLL.LIZIZ(((DisclaimerText) aCListenerS29S0300000_3.l1).getId(), "disclaimer_id");
        LIZLLL.LJI();
        Object LIZ = C58096Mr6.LIZ(IAdLightWebPageOpen.class, false);
        if (LIZ != null) {
            iAdLightWebPageOpen = (IAdLightWebPageOpen) LIZ;
        } else {
            if (C58096Mr6.LLLLZLLLI == null) {
                synchronized (IAdLightWebPageOpen.class) {
                    if (C58096Mr6.LLLLZLLLI == null) {
                        C58096Mr6.LLLLZLLLI = new AdLightWebPageOpenUtils();
                    }
                }
            }
            iAdLightWebPageOpen = C58096Mr6.LLLLZLLLI;
        }
        iAdLightWebPageOpen.LIZ((Activity) aCListenerS29S0300000_3.l2, ((DisclaimerText) aCListenerS29S0300000_3.l1).getUrl());
    }

    public static final void onClick$7(ACListenerS29S0300000_3 aCListenerS29S0300000_3, View view) {
        Aweme aweme;
        EnumC215748dO enumC215748dO;
        AbstractC73672Svk LJJIJIL;
        try {
            if (C2NU.LIZ.LIZIZ()) {
                DanmakuPresentAssem danmakuPresentAssem = (DanmakuPresentAssem) aCListenerS29S0300000_3.l1;
                InterfaceC215558d5 data = (InterfaceC215558d5) aCListenerS29S0300000_3.l2;
                DanmakuViewModel r4 = danmakuPresentAssem.r4();
                r4.getClass();
                o.LJIIIZ(data, "data");
                VideoItemParams gv0 = r4.gv0();
                String str = null;
                if (gv0 != null) {
                    aweme = gv0.getAweme();
                } else {
                    aweme = null;
                }
                VideoItemParams gv02 = r4.gv0();
                if (gv02 != null) {
                    str = gv02.mEventType;
                }
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                String LIZJ = data.LIZJ();
                if (LIZJ != null) {
                    str2 = LIZJ;
                }
                C214788bq.LIZ(new DeleteDanmakuEvent(), C47261Igj.LJJIJ(new C215008cC(str2, o.LJ(data.LJI(), ((RBX) HG3.LJIILL()).getCurUserId()) ? 1 : 0)), aweme, str);
                C215498cz c215498cz = r4.LJLL;
                if (c215498cz != null) {
                    C1PH c1ph = new C1PH();
                    if (data.L7()) {
                        enumC215748dO = EnumC215748dO.DANMAKU_AUTHOR;
                    } else {
                        enumC215748dO = EnumC215748dO.VIDEO_AUTHOR;
                    }
                    String LIZJ2 = data.LIZJ();
                    if (LIZJ2 != null && LIZJ2.length() > 0 && !s.LJJJLZIJ(LIZJ2, "fake_", false)) {
                        DanmakuApi danmakuApi = c215498cz.LIZ;
                        int value = enumC215748dO.getValue();
                        danmakuApi.getClass();
                        LJJIJIL = DanmakuApi.LIZIZ.deleteDanmaku(LIZJ2, value);
                    } else if (((LinkedHashMap) c215498cz.LIZLLL).get(data) != null) {
                        ((ArrayList) c215498cz.LJ).add(data);
                        LJJIJIL = AbstractC73672Svk.LJIIJ((InterfaceC86003Zc) ((LinkedHashMap) c215498cz.LIZLLL).get(data)).LJJIII(new IDhS67S0200000_3(c215498cz, enumC215748dO, 0), false);
                    } else {
                        DanmakuDeleteResponse danmakuDeleteResponse = new DanmakuDeleteResponse();
                        danmakuDeleteResponse.status_code = 1;
                        LJJIJIL = AbstractC73672Svk.LJJIJIL(danmakuDeleteResponse);
                    }
                    c215498cz.LIZIZ(data);
                    c215498cz.LJIILIIL.LIZ(LJJIJIL.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS55S0100000_3(c1ph, 40)));
                }
                C216678et c216678et = danmakuPresentAssem.LLIIIILZ;
                if (c216678et != null) {
                    C216678et.LJ(c216678et, 1004, data.getData());
                }
                data.LIZ(false);
                danmakuPresentAssem.u4().invalidate();
                InterfaceC82683Wch interfaceC82683Wch = ((DanmakuPresentAssem) aCListenerS29S0300000_3.l1).LLIIIL;
                if (interfaceC82683Wch != null) {
                    interfaceC82683Wch.dismiss();
                    return;
                }
                return;
            }
        } catch (Exception unused) {
        }
        C26045AKb c26045AKb = new C26045AKb(((DanmakuPresentAssem) aCListenerS29S0300000_3.l1).getContainerView());
        c26045AKb.LJIIIIZZ(R.string.dtb);
        c26045AKb.LJIIJ();
    }

    public static final void onClick$8(ACListenerS29S0300000_3 aCListenerS29S0300000_3, View view) {
        ActivityC45651qj activityC45651qj;
        FragmentManager supportFragmentManager;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("group_id", ((Aweme) aCListenerS29S0300000_3.l0).getAid());
        c188727au.LJIIIZ("author_id", ((Aweme) aCListenerS29S0300000_3.l0).getAuthorUid());
        c188727au.LIZLLL(((Aweme) aCListenerS29S0300000_3.l0).getAuthor().getFollowStatus(), "follow_status");
        FMX.LJIIL("filter_hashtag_click_details", c188727au.LIZ);
        Activity context = (Activity) aCListenerS29S0300000_3.l1;
        Aweme aweme = (Aweme) aCListenerS29S0300000_3.l0;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        Activity LIZ = C27740Aue.LIZ(context);
        if ((LIZ instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) LIZ) != null && (supportFragmentManager = activityC45651qj.getSupportFragmentManager()) != null) {
            OP1 LIZJ = OP4.LIZJ(context, aweme, C227728wi.LJLIL, false);
            ASL asl = new ASL();
            C235119Kp c235119Kp = new C235119Kp();
            C9KF c9kf = new C9KF();
            String string = context.getString(R.string.hmd);
            o.LJIIIIZZ(string, "context.getString(R.stri…ltering_hastag_filtering)");
            c9kf.LIZJ = string;
            c235119Kp.LIZJ = c9kf;
            C234529Ii c234529Ii = new C234529Ii();
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_x_mark_small;
            c234529Ii.LIZ(c2068389v);
            c234529Ii.LIZIZ(new AqS150S0200000_3(aweme, LIZJ, 86));
            c235119Kp.LIZIZ(c234529Ii);
            TuxSheet tuxSheet = asl.LIZ;
            tuxSheet.LJLLL = c235119Kp;
            tuxSheet.LJLLI = LIZJ;
            asl.LJI(1);
            TuxSheet tuxSheet2 = asl.LIZ;
            tuxSheet2.LJZI = false;
            tuxSheet2.show(supportFragmentManager, "hashtag");
        }
        ((AKT) aCListenerS29S0300000_3.l2).LIZ();
    }

    public static final void onClick$9(ACListenerS29S0300000_3 aCListenerS29S0300000_3, View view) {
        int i;
        String requestId;
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String LJIILJJIL;
        C50469JrN searchVideoModel;
        NT2 LIZJ;
        Aweme aweme = ((VideoItemParams) aCListenerS29S0300000_3.l0).getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        PublishPreviewInfo previewData = aweme.getPreviewData();
        boolean z2 = false;
        if (previewData != null && previewData.getInPublishing()) {
            C5S1 c5s1 = new C5S1((Context) aCListenerS29S0300000_3.l1);
            c5s1.LIZJ(R.string.tfy);
            c5s1.LJ();
            return;
        }
        if (!C9T4.LIZIZ(aweme) && C2049682q.LIZ(aweme) && (aweme.getAuthor() == null || TextUtils.isEmpty(aweme.getAuthorUid()))) {
            C5S1 c5s12 = new C5S1((Context) aCListenerS29S0300000_3.l1);
            c5s12.LIZJ(R.string.i4z);
            c5s12.LJ();
            return;
        }
        LPX.LIZLLL(((FeedAvatarDefaultAssem) aCListenerS29S0300000_3.l2).getContainerView(), ((VideoItemParams) aCListenerS29S0300000_3.l0).mEventType, "avatar");
        DataCenter dataCenter = ((VideoItemParams) aCListenerS29S0300000_3.l0).dataCenter;
        if (AV1.LJIIJJI() || C63081OpJ.LJLJLLL(aweme)) {
            return;
        }
        if (!o.LJ(((VideoItemParams) aCListenerS29S0300000_3.l0).mEventType, "new_ad_fake_user") && C63081OpJ.LJLJJL(aweme) && !aweme.isAd()) {
            C57127MbT c57127MbT = ((FeedAvatarDefaultAssem) aCListenerS29S0300000_3.l2).LLF;
            if (c57127MbT != null) {
                C26045AKb c26045AKb = new C26045AKb(c57127MbT);
                c26045AKb.LJIIIIZZ(R.string.b95);
                c26045AKb.LJIIJ();
                return;
            }
            o.LJIJI("avatarView");
            throw null;
        }
        if (!aweme.isCanPlay() || aweme.isDelete()) {
            C5S1 c5s13 = new C5S1((Context) aCListenerS29S0300000_3.l1);
            if (aweme.isImage()) {
                i = R.string.h_y;
            } else {
                i = R.string.tob;
            }
            c5s13.LIZJ(i);
            c5s13.LJ();
            return;
        }
        IAdSceneService LJII = AdSceneServiceImpl.LJII();
        if (LJII != null && (LIZJ = LJII.LIZJ()) != null) {
            LIZJ.LJJIJIIJI((Context) aCListenerS29S0300000_3.l1, aweme);
        }
        C225318sp.LIZIZ(aweme, (Context) aCListenerS29S0300000_3.l1, ((VideoItemParams) aCListenerS29S0300000_3.l0).mEventType, EnumC2049482o.CLICK_HEAD);
        C38987FRv.LJI(LSC.PROFILE);
        JSONObject jSONObject = ((VideoItemParams) aCListenerS29S0300000_3.l0).mRequestId;
        if (jSONObject == null || (requestId = jSONObject.optString("request_id")) == null) {
            requestId = aweme.getRequestId();
        }
        aweme.setRequestId(requestId);
        if (dataCenter != null) {
            dataCenter.jv0(new C50420Jqa(19, aweme), "feed_internal_event");
        }
        if (MSAdaptionService.LJIIL().LIZIZ((Context) aCListenerS29S0300000_3.l1)) {
            C59895Nf1.LIZLLL((Context) aCListenerS29S0300000_3.l1, "//duo", "duo_type", "duo_profile");
            return;
        }
        if (dataCenter != null) {
            dataCenter.jv0("click_avatar", "to_profile");
        }
        String str7 = "";
        Map<String, String> LLJLLIL = Z9N.LIZIZ.LLJLLIL(((VideoItemParams) aCListenerS29S0300000_3.l0).mEventType, "");
        C220488l2 c220488l2 = C220488l2.LIZIZ;
        C7ZV c7zv = new C7ZV();
        c7zv.LJJIIZI(((VideoItemParams) aCListenerS29S0300000_3.l0).mPageType, aweme);
        String str8 = ((VideoItemParams) aCListenerS29S0300000_3.l0).mEventType;
        if (str8 == null) {
            str8 = "";
        }
        c7zv.LIZLLL = str8;
        c7zv.LJJIIZ((Context) aCListenerS29S0300000_3.l1);
        c7zv.LJJLJLI = C2S6.LIZ((Context) aCListenerS29S0300000_3.l1).getPreviousPage();
        c7zv.LJJLL = C2S6.LIZ((Context) aCListenerS29S0300000_3.l1).getPreviousPagePosition();
        if (aweme.getBottomBarModel() != null) {
            z = true;
        } else {
            z = false;
        }
        c7zv.LJJZ = z;
        if (dataCenter != null) {
            str = (String) dataCenter.get("playlist_type", "");
        } else {
            str = null;
        }
        c7zv.LJJLIIIJLLLLLLLZ = str;
        if (dataCenter != null) {
            str2 = (String) dataCenter.get("playlist_id", "");
        } else {
            str2 = null;
        }
        c7zv.LJJLIL = str2;
        if (dataCenter != null) {
            str3 = (String) dataCenter.get("playlist_id_key", "");
        } else {
            str3 = null;
        }
        c7zv.LJJLIIJ = str3;
        if (dataCenter != null) {
            str4 = (String) dataCenter.get("tab_name", "");
        } else {
            str4 = null;
        }
        c7zv.LJIILL = str4;
        c7zv.LJIILLIIL = C227768wm.LJIIL(((VideoItemParams) aCListenerS29S0300000_3.l0).mPageType, aweme);
        c7zv.LJJLI = "click_head";
        c7zv.LJJIL = C2S6.LIZ((Context) aCListenerS29S0300000_3.l1).getSearchId();
        String searchResultId = C2S6.LIZ((Context) aCListenerS29S0300000_3.l1).getSearchResultId();
        if (searchResultId == null || searchResultId.length() == 0) {
            searchResultId = aweme.getAid();
        }
        c7zv.LJJIFFI = searchResultId;
        c7zv.LJLJLLL = C2S6.LIZ((Context) aCListenerS29S0300000_3.l1).getCategoryName();
        c7zv.LJJJJZ = C222578oP.LJFF(aweme.getAuthor());
        if (C54838Lfe.LJJI(aweme)) {
            str5 = "story";
        } else {
            str5 = "post";
        }
        c7zv.LJJJJZI = str5;
        c7zv.LJJJLIIL = C54838Lfe.LJI(aweme);
        c7zv.LJJJLL = C222578oP.LJI(aweme);
        c7zv.LJIJJLI(C176276vv.LIZ(aweme, LLJLLIL));
        c7zv.LJLLILLLL = C79004UzY.LJJJIL((Context) aCListenerS29S0300000_3.l1, aweme);
        C50652JuK.Companion.getClass();
        C50650JuI LIZJ2 = C50651JuJ.LIZJ();
        if (LIZJ2 != null && (searchVideoModel = LIZJ2.getSearchVideoModel()) != null) {
            str6 = searchVideoModel.getGroupId();
        } else {
            str6 = null;
        }
        c7zv.LJLLI = str6;
        c7zv.LJJJZ = C2KM.LIZ(C2S6.LIZ((Context) aCListenerS29S0300000_3.l1).getPreviousPage(), C2S6.LIZ((Context) aCListenerS29S0300000_3.l1).getFromGroupId());
        String str9 = ((VideoItemParams) aCListenerS29S0300000_3.l0).mEventType;
        if (str9 == null) {
            str9 = "";
        }
        if (C224888s8.LJ(str9)) {
            c7zv.LJJJJIZL = C224888s8.LIZJ();
        }
        V0N.LJIIIZ(c7zv, aweme);
        C78841Uwv.LIZJ(c7zv, C227768wm.LIZIZ(aweme));
        Object LJII2 = c220488l2.LJII(aweme, c7zv);
        C222578oP.LIZJ(LJII2, aweme, null, null, 14);
        JHM jhm = (JHM) LJII2;
        C57258Mda.LIZJ(jhm, C2S6.LIZ((Context) aCListenerS29S0300000_3.l1).getInboxLogExtra());
        jhm.LIZ(K02.LIZIZ("enter_personal_detail", aweme, ((VideoItemParams) aCListenerS29S0300000_3.l0).mEventType));
        String LJII3 = C222578oP.LJII((Context) aCListenerS29S0300000_3.l1, ((VideoItemParams) aCListenerS29S0300000_3.l0).mEventType, ((VideoItemParams) aCListenerS29S0300000_3.l0).mFrom);
        C1799074g c1799074g = InterfaceC1798974f.LIZ;
        jhm.LJ("enter_position", LJII3, c1799074g);
        jhm.LIZJ(CommonFeedServiceImpl.LJJIJLIJ().LJIIZILJ((Context) aCListenerS29S0300000_3.l1, ((VideoItemParams) aCListenerS29S0300000_3.l0).getAweme()), "music_name");
        C88545Yp3 c88545Yp3 = C88545Yp3.LIZIZ;
        if (c88545Yp3 != null) {
            z2 = c88545Yp3.isConnected();
        }
        jhm.LJFF("is_casting", z2);
        if (c88545Yp3 != null && (LJIILJJIL = c88545Yp3.LJIILJJIL()) != null) {
            str7 = LJIILJJIL;
        }
        jhm.LJ("casting_session_id", str7, c1799074g);
        jhm.LJIILIIL();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ACListenerS29S0300000_3(com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter.FollowItemViewHolder r2, com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter r3, com.ss.android.ugc.aweme.profile.model.User r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            switch(r5) {
                case 3: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r4
            r0.l2 = r3
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.l0 = r4
            r0.l1 = r3
            r0.l2 = r2
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS29S0300000_3.<init>(com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$FollowItemViewHolder, com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter, com.ss.android.ugc.aweme.profile.model.User, int):void");
    }

    public ACListenerS29S0300000_3(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l2 = obj;
        this.l0 = obj2;
        this.l1 = obj3;
    }
}
