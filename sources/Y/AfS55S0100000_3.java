package Y;

import X.A2F;
import X.A2G;
import X.A2I;
import X.AbstractC36908Ee8;
import X.AbstractC72932td;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C07290Qj;
import X.C0MT;
import X.C111144Xu;
import X.C116414hZ;
import X.C15380j0;
import X.C175206uC;
import X.C176206vo;
import X.C178206z2;
import X.C178216z3;
import X.C1812179h;
import X.C183077Gl;
import X.C188727au;
import X.C192017gD;
import X.C192987hm;
import X.C193007ho;
import X.C193027hq;
import X.C193167i4;
import X.C193277iF;
import X.C194767ke;
import X.C199127rg;
import X.C199947t0;
import X.C2050482y;
import X.C208668Gw;
import X.C212428Vi;
import X.C213178Yf;
import X.C215298cf;
import X.C219568jY;
import X.C220938ll;
import X.C221018lt;
import X.C224348rG;
import X.C229708zu;
import X.C26045AKb;
import X.C32151Nz;
import X.C32I;
import X.C36922EeM;
import X.C38306F1q;
import X.C38333F2r;
import X.C3C1;
import X.C3C5;
import X.C47261Igj;
import X.C51029K0z;
import X.C53887LCx;
import X.C54794Lew;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55480Lq0;
import X.C61447O9r;
import X.C71Y;
import X.C72085SQv;
import X.C72440Sbs;
import X.C73666Sve;
import X.C74Z;
import X.C78847Ux1;
import X.C78886Uxe;
import X.C78897Uxp;
import X.C79045V0n;
import X.C79V;
import X.C7MY;
import X.C7XD;
import X.C8B4;
import X.C8BT;
import X.C8H0;
import X.C8RH;
import X.C8YN;
import X.C9Z2;
import X.EnumC191017eb;
import X.FMX;
import X.HG3;
import X.HandlerC56918MVm;
import X.InterfaceC194547kI;
import X.InterfaceC215758dP;
import X.InterfaceC224518rX;
import X.InterfaceC55317LnN;
import X.InterfaceC57784Mm4;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.InterfaceC67352kd;
import X.InterfaceC88472Yns;
import X.M8L;
import X.MS5;
import X.O6R;
import X.ORZ;
import X.OSZ;
import X.SY4;
import X.T16;
import X.W5G;
import X.X1D;
import X.YAX;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Message;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableInnerBeautyMaxValue;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.s;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.gift.model.GiftPage;
import com.ss.android.ugc.aweme.comment.gift.model.GiftResponse;
import com.ss.android.ugc.aweme.comment.gift.model.GiftResult;
import com.ss.android.ugc.aweme.comment.gift.model.GiftStruct;
import com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.NowKeyboardVM;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentResponse;
import com.ss.android.ugc.aweme.compliance.api.phl.model.PrivacyHighlightsForTeens;
import com.ss.android.ugc.aweme.compliance.api.phl.vm.PhlViewModel;
import com.ss.android.ugc.aweme.detail.panel.StoryMixedFeedDetailPanel;
import com.ss.android.ugc.aweme.detail.prefab.SearchBarAssem;
import com.ss.android.ugc.aweme.detail.prefab.ShootAssem;
import com.ss.android.ugc.aweme.detail.prefab.ability.SearchAbility;
import com.ss.android.ugc.aweme.explore.ui.ExploreFeedComponent;
import com.ss.android.ugc.aweme.favorites.business.collection.AddVideosFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.AllFavoriteFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.ChooseCollectionSheetFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionAllFavoritesResponse;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetailResponse;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionListResponse;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionManageRequest;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionNameCheckResponse;
import com.ss.android.ugc.aweme.favorites.business.collection.InputNameSheetFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel;
import com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionListViewModel;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarAssemWrap;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarLiveAssem;
import com.ss.android.ugc.aweme.feed.assem.story.QuickDMEntranceTrigger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.mix.api.response.CheckPlayResponse;
import com.ss.android.ugc.aweme.mix.api.response.ManageResponse;
import com.ss.android.ugc.aweme.mix.api.response.MixVideosResponse;
import com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel;
import com.ss.android.ugc.aweme.mix.editname.EditPlayListNameEditTextVM;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel;
import com.ss.android.ugc.aweme.models.NowMultiUserPostResponse;
import com.ss.android.ugc.aweme.music.assem.list.cell.assem.MusicCellAssem;
import com.ss.android.ugc.aweme.music.vm.MusicHighlightBackgroundViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.now.UserNowPost;
import com.ss.android.ugc.aweme.nows.feed.ui.NowPostBaseCellAssem;
import com.ss.android.ugc.aweme.nows.feed.ui.guide.NowWeakVersionShareCell;
import com.ss.android.ugc.aweme.nows.feed.ui.other.collection.NowOtherCollectionAbility;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.poi.collect.PoiCollectStatusViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.reviews.PoiDetailReviewsViewModel;
import com.ss.android.ugc.aweme.poi.map.PoiMapViewModel;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewListViewModel;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.viewer.viewmodel.ProfileViewerViewModel;
import com.ss.android.ugc.aweme.story.feed.common.newarch.component.StoryFakePlayerComponent;
import com.ss.android.ugc.aweme.story.feed.guidecard.component.StoryGuideCardFilterPanelComponent;
import com.ss.android.ugc.aweme.story.feed.immersive.dm.StoryQuickDMBottomBarAssem;
import com.ss.android.ugc.aweme.story.model.UserStoriesResponse;
import com.ss.android.ugc.aweme.translation.model.MultiTranslationResult;
import com.ss.android.ugc.aweme.translation.model.TranslationResult;
import com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.watch.history.api.WatchHistoryCopyResponse;
import com.ss.android.ugc.aweme.watch.history.core.WatchHistoryListViewModel;
import com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import com.ss.android.ugc.tiktok.addyours.hub.assem.AddYoursHubItemCellAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS4S0002000_3;
import kotlin.jvm.internal.AqS54S0201000_3;
import kotlin.jvm.internal.AqS8S0010000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class AfS55S0100000_3 implements InterfaceC64592gB {
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
            default:
                return;
        }
    }

    public AfS55S0100000_3(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void accept$0(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        Drawable drawable = (Drawable) obj;
        o.LJIIIZ(drawable, "drawable");
        ((W5G) afS55S0100000_3.l0).setImageDrawable(drawable);
    }

    public static final void accept$1(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        C79V c79v = (C79V) afS55S0100000_3.l0;
        if (c79v.LLLIIII) {
            c79v.LJLLLLLL();
        }
        C79V c79v2 = (C79V) afS55S0100000_3.l0;
        if (c79v2.LLLIIIIL) {
            c79v2.LJLLLL();
        }
        C79V c79v3 = (C79V) afS55S0100000_3.l0;
        if (!c79v3.LLLIZZ) {
            c79v3.LJLIIIL(0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(6)));
        }
    }

    public static final void accept$10(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        String it = (String) obj;
        Fragment LIZLLL = C212428Vi.LIZLLL((SearchBarAssem) afS55S0100000_3.l0);
        if (LIZLLL == null) {
            return;
        }
        SearchAbility searchAbility = (SearchAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(LIZLLL, null), SearchAbility.class, null);
        if (searchAbility != null) {
            o.LJIIIIZZ(it, "it");
            searchAbility.LLIIIL(it);
        }
        ((SearchBarAssem) afS55S0100000_3.l0).LJLLI = true;
    }

    public static final void accept$11(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        Integer it = (Integer) obj;
        o.LJIIIIZZ(it, "it");
        if (it.intValue() > C7MY.LIZIZ(40)) {
            YAX yax = ((ShootAssem) afS55S0100000_3.l0).LJLL;
            if (yax != null) {
                yax.LIZIZ();
                return;
            }
            return;
        }
        YAX yax2 = ((ShootAssem) afS55S0100000_3.l0).LJLL;
        if (yax2 == null) {
            return;
        }
        yax2.LIZLLL();
    }

    public static final void accept$12(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        C2050482y c2050482y;
        Aweme aweme;
        UrlModel originCover;
        List<String> urlList;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        do {
            List<InterfaceC57784Mm4> listItems = ((ExploreFeedComponent) afS55S0100000_3.l0).v3().getListItems();
            o.LJIIIIZZ(listItems, "list.listItems");
            Object LJLLLLLL = ORZ.LJLLLLLL(i, listItems);
            String str = null;
            if ((LJLLLLLL instanceof C2050482y) && (c2050482y = (C2050482y) LJLLLLLL) != null && (aweme = c2050482y.LJLIL) != null) {
                arrayList.add(Integer.valueOf(aweme.getAwemeType()));
                Video video = aweme.getVideo();
                if (video != null && (originCover = video.getOriginCover()) != null && (urlList = originCover.getUrlList()) != null) {
                    str = (String) ORZ.LJLLLL(urlList);
                }
            }
            if (C72440Sbs.LIZIZ(str)) {
                i2++;
            }
            i++;
        } while (i < 4);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "homepage_explore");
        c188727au.LIZLLL(i2, "video_num");
        c188727au.LIZLLL(4 - i2, "empty_num");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('{');
        LIZ.append(ORZ.LLD(arrayList, ",", null, null, null, 62));
        LIZ.append('}');
        c188727au.LJIIIZ("aweme_type", X1D.LIZIZ(LIZ));
        FMX.LJIIL("video_show_cnt", c188727au.LIZ);
    }

    public static final void accept$13(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        Long l;
        CollectionDetail.Statistic statistic;
        AllFavoriteFragment allFavoriteFragment = (AllFavoriteFragment) afS55S0100000_3.l0;
        CollectionDetail collectionDetail = ((CollectionAllFavoritesResponse) obj).detail;
        if (collectionDetail != null && (statistic = collectionDetail.statistic) != null) {
            l = statistic.total;
        } else {
            l = null;
        }
        allFavoriteFragment.LJLJJI = l;
        allFavoriteFragment.Il();
    }

    public static final void accept$14(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        C26045AKb c26045AKb = new C26045AKb((ActivityC45651qj) afS55S0100000_3.l0);
        c26045AKb.LJIIIIZZ(R.string.g5i);
        c26045AKb.LJIIJ();
    }

    public static final void accept$15(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        C26045AKb c26045AKb = new C26045AKb((ActivityC45651qj) afS55S0100000_3.l0);
        c26045AKb.LJIIIIZZ(R.string.g5i);
        c26045AKb.LJIIJ();
    }

    public static final void accept$16(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        C26045AKb c26045AKb = new C26045AKb((ActivityC45651qj) afS55S0100000_3.l0);
        c26045AKb.LJIIIIZZ(R.string.g5i);
        c26045AKb.LJIIJ();
    }

    public static final void accept$17(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        CollectionListResponse collectionListResponse = (CollectionListResponse) obj;
        M8L.LIZ("popup favorite collections dialog");
        List<CollectionDetail> list = collectionListResponse.items;
        if (list == null || list.isEmpty()) {
            C193027hq c193027hq = (C193027hq) afS55S0100000_3.l0;
            c193027hq.LIZJ(c193027hq.LJLIL);
            return;
        }
        C193027hq c193027hq2 = (C193027hq) afS55S0100000_3.l0;
        int size = collectionListResponse.items.size();
        c193027hq2.getClass();
        C193167i4 c193167i4 = ChooseCollectionSheetFragment.LJLJJI;
        ActivityC45651qj activityC45651qj = c193027hq2.LJLIL;
        String str = c193027hq2.LJLJI;
        C193007ho c193007ho = new C193007ho(c193027hq2);
        c193167i4.getClass();
        C193167i4.LIZ(activityC45651qj, false, null, str, size, c193007ho, true);
    }

    public static final void accept$18(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        ActivityC45651qj requireActivity = ((AddVideosFragment) afS55S0100000_3.l0).requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        C26045AKb c26045AKb = new C26045AKb(requireActivity);
        c26045AKb.LJIIIIZZ(R.string.g5i);
        c26045AKb.LJIIJ();
    }

    public static final void accept$19(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        C26045AKb c26045AKb = new C26045AKb((ActivityC45651qj) afS55S0100000_3.l0);
        c26045AKb.LJIIIIZZ(R.string.g5i);
        c26045AKb.LJIIJ();
    }

    public static final void accept$2(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        C1812179h c1812179h = (C1812179h) afS55S0100000_3.l0;
        if (c1812179h.LLLIIIIL && c1812179h.getStopFlag()) {
            C73666Sve c73666Sve = ((C1812179h) afS55S0100000_3.l0).LLLFF;
            if (c73666Sve != null) {
                c73666Sve.dispose();
            }
            ((C1812179h) afS55S0100000_3.l0).setStopFlag(false);
        }
        C71Y.LIZ("InteractionBubbleList", "startAnim");
        ((C1812179h) afS55S0100000_3.l0).LJLLJ();
        if (((C1812179h) afS55S0100000_3.l0).getCaptionFlag() + ((C1812179h) afS55S0100000_3.l0).getState().LJIIIIZZ() <= 1) {
            C78886Uxe.LJJLIIIJ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(104)), ((C1812179h) afS55S0100000_3.l0).LLLFFI);
            ((C1812179h) afS55S0100000_3.l0).setReachEnd(false);
            ((C1812179h) afS55S0100000_3.l0).setNewTurn(true);
            ((C1812179h) afS55S0100000_3.l0).LJLI(0);
        }
    }

    public static final void accept$20(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        C26045AKb c26045AKb = new C26045AKb(((C193027hq) afS55S0100000_3.l0).LJLIL);
        c26045AKb.LJIIIIZZ(R.string.g5i);
        c26045AKb.LJIIJ();
    }

    public static final void accept$21(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        CollectionNameCheckResponse collectionNameCheckResponse = (CollectionNameCheckResponse) obj;
        SY4 sy4 = ((InputNameSheetFragment) afS55S0100000_3.l0).LJLJJL;
        if (sy4 != null) {
            Boolean bool = collectionNameCheckResponse.isValid;
            Boolean bool2 = Boolean.TRUE;
            sy4.setEnabled(o.LJ(bool, bool2));
            ImageView imageView = ((InputNameSheetFragment) afS55S0100000_3.l0).LJLJI;
            if (imageView != null) {
                int i = 0;
                imageView.setVisibility(0);
                TextView textView = ((InputNameSheetFragment) afS55S0100000_3.l0).LJLJJI;
                if (textView != null) {
                    if (o.LJ(collectionNameCheckResponse.isValid, bool2)) {
                        i = 8;
                    }
                    textView.setVisibility(i);
                    InputNameSheetFragment inputNameSheetFragment = (InputNameSheetFragment) afS55S0100000_3.l0;
                    TextView textView2 = inputNameSheetFragment.LJLJJI;
                    if (textView2 != null) {
                        textView2.setText(inputNameSheetFragment.getText(R.string.gb9));
                        C116414hZ c116414hZ = ((InputNameSheetFragment) afS55S0100000_3.l0).LJLIL;
                        if (c116414hZ != null) {
                            c116414hZ.setVisibility(8);
                            return;
                        } else {
                            o.LJIJI("loading");
                            throw null;
                        }
                    }
                    o.LJIJI("tvEditHint");
                    throw null;
                }
                o.LJIJI("tvEditHint");
                throw null;
            }
            o.LJIJI("ivClearAll");
            throw null;
        }
        o.LJIJI("submit");
        throw null;
    }

    public static final void accept$22(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        C26045AKb c26045AKb = new C26045AKb((InputNameSheetFragment) afS55S0100000_3.l0);
        c26045AKb.LJIIIIZZ(R.string.rf3);
        c26045AKb.LJIIJ();
    }

    public static final void accept$23(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        ((AbstractC36908Ee8) obj).checkValid();
        C192987hm.LIZ((C193277iF) afS55S0100000_3.l0, false).LJJL(T16.LIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.7hy
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj2) {
            }
        }, new InterfaceC64592gB() { // from class: X.7hz
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj2) {
            }
        });
    }

    public static final void accept$24(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("/tiktok/collection/item_archive/manage/v1 operation is ");
        LIZ.append(((CollectionManageRequest) afS55S0100000_3.l0).operation);
        M8L.LIZJ(X1D.LIZIZ(LIZ), "net", (BaseResponse) obj);
    }

    public static final void accept$25(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        ((VideoCollectionContentViewModel) afS55S0100000_3.l0).setState(new AqS169S0100000_3((Throwable) obj, 142));
    }

    public static final void accept$26(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("/tiktok/collection/item_archive/manage/v1 operation is ");
        LIZ.append(((CollectionManageRequest) afS55S0100000_3.l0).operation);
        M8L.LIZIZ(X1D.LIZIZ(LIZ), (Throwable) obj);
    }

    public static final void accept$27(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        Aweme aweme;
        C220938ll c220938ll = (C220938ll) obj;
        if (c220938ll == null || (aweme = ((VideoItemParams) C51029K0z.LJIILLIIL((FeedAvatarLiveAssem) afS55S0100000_3.l0)).getAweme()) == null || !o.LJ(String.valueOf(c220938ll.LIZ), aweme.getAuthorUid())) {
            return;
        }
        aweme.getAuthor().roomId = c220938ll.LIZIZ;
        FeedAvatarAssemWrap.LLII.getClass();
        if (C9Z2.LIZ(aweme)) {
            return;
        }
        C53887LCx c53887LCx = ((FeedAvatarLiveAssem) afS55S0100000_3.l0).LLF;
        if (c53887LCx != null) {
            c53887LCx.LIZLLL();
        } else {
            o.LJIJI("avatarBorderViewController");
            throw null;
        }
    }

    public static final void accept$28(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        C111144Xu c111144Xu = (C111144Xu) obj;
        PriorityAbility priorityAbility = (PriorityAbility) ((QuickDMEntranceTrigger) afS55S0100000_3.l0).LLF.getValue();
        if (priorityAbility != null) {
            priorityAbility.yZ((QuickDMEntranceTrigger) afS55S0100000_3.l0, c111144Xu.LIZIZ);
        }
        FeedBottomButtonAbility feedBottomButtonAbility = (FeedBottomButtonAbility) ((QuickDMEntranceTrigger) afS55S0100000_3.l0).LLFF.getValue();
        if (feedBottomButtonAbility != null) {
            feedBottomButtonAbility.th0(c111144Xu.LIZIZ);
        }
    }

    public static final void accept$29(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        PriorityAbility priorityAbility = (PriorityAbility) ((QuickDMEntranceTrigger) afS55S0100000_3.l0).LLF.getValue();
        if (priorityAbility != null) {
            priorityAbility.yZ((QuickDMEntranceTrigger) afS55S0100000_3.l0, false);
        }
        FeedBottomButtonAbility feedBottomButtonAbility = (FeedBottomButtonAbility) ((QuickDMEntranceTrigger) afS55S0100000_3.l0).LLFF.getValue();
        if (feedBottomButtonAbility != null) {
            feedBottomButtonAbility.th0(false);
        }
    }

    public static final void accept$3(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        Integer valueOf;
        CommentResponse commentResponse = (CommentResponse) obj;
        if (commentResponse == null || (valueOf = Integer.valueOf(commentResponse.status_code)) == null || valueOf.intValue() != 0) {
            ((NowKeyboardVM) afS55S0100000_3.l0).setState(new AqS169S0100000_3(commentResponse, 73));
            C175206uC.LIZJ(0);
        } else {
            Comment comment = commentResponse.comment;
            if (comment != null) {
                ((NowKeyboardVM) afS55S0100000_3.l0).setState(new AqS169S0100000_3(comment, 72));
            }
            C175206uC.LIZJ(1);
        }
    }

    public static final void accept$30(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        MixVideosViewModel mixVideosViewModel = (MixVideosViewModel) afS55S0100000_3.l0;
        mixVideosViewModel.withState(new AqS54S0201000_3(3, (MixVideosResponse) obj, mixVideosViewModel, 5));
    }

    public static final void accept$31(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        if (((BaseResponse) obj).status_code == 0) {
            MixVideosViewModel mixVideosViewModel = (MixVideosViewModel) afS55S0100000_3.l0;
            mixVideosViewModel.getClass();
            mixVideosViewModel.setState(new AqS8S0010000_3(true, 58));
        }
    }

    public static final void accept$32(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        MixVideosViewModel mixVideosViewModel = (MixVideosViewModel) afS55S0100000_3.l0;
        mixVideosViewModel.getClass();
        mixVideosViewModel.setState(new AqS8S0010000_3(false, 58));
    }

    public static final void accept$33(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        List result = (List) obj;
        StringBuilder sb = new StringBuilder("requestData onNext:");
        o.LJIIIIZZ(result, "result");
        ArrayList arrayList = new ArrayList(C32I.LJJL(result, 10));
        Iterator it = result.iterator();
        while (it.hasNext()) {
            arrayList.add(((Aweme) it.next()).getAid());
        }
        sb.append(arrayList);
        C221018lt.LJFF("NoticeVideoManager", sb.toString());
        HandlerC56918MVm handlerC56918MVm = (HandlerC56918MVm) afS55S0100000_3.l0;
        handlerC56918MVm.getClass();
        MS5.LJI(new AqS156S0200000_9(handlerC56918MVm, result, 29));
        HandlerC56918MVm handlerC56918MVm2 = (HandlerC56918MVm) afS55S0100000_3.l0;
        handlerC56918MVm2.getClass();
        MS5.LJI(new AqS150S0200000_3(handlerC56918MVm2, result, 38));
    }

    public static final void accept$34(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        PoiDetailReviewsViewModel poiDetailReviewsViewModel = (PoiDetailReviewsViewModel) afS55S0100000_3.l0;
        poiDetailReviewsViewModel.getClass();
        poiDetailReviewsViewModel.withState(new AqS169S0100000_3(poiDetailReviewsViewModel, 683));
    }

    public static final void accept$35(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        Throwable it = (Throwable) obj;
        ProfileViewerViewModel profileViewerViewModel = (ProfileViewerViewModel) afS55S0100000_3.l0;
        o.LJIIIIZZ(it, "it");
        profileViewerViewModel.iv0(it);
    }

    public static final void accept$36(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        String str;
        Long it = (Long) obj;
        StoryFakePlayerComponent storyFakePlayerComponent = (StoryFakePlayerComponent) afS55S0100000_3.l0;
        o.LJIIIIZZ(it, "it");
        storyFakePlayerComponent.LLFZ = it.longValue();
        OnUIPlayListener onUIPlayListener = (OnUIPlayListener) ((StoryFakePlayerComponent) afS55S0100000_3.l0).LLFF.getValue();
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayProgressChange((((float) (it.longValue() * 300)) * 1.0f) / ((float) 10000));
        }
        OnUIPlayListener onUIPlayListener2 = (OnUIPlayListener) ((StoryFakePlayerComponent) afS55S0100000_3.l0).LLFF.getValue();
        if (onUIPlayListener2 != null) {
            Aweme aweme = ((StoryFakePlayerComponent) afS55S0100000_3.l0).LLFII;
            if (aweme == null || (str = aweme.getAid()) == null) {
                str = "";
            }
            onUIPlayListener2.onPlayProgressChange(str, it.longValue() * 300, 10000L);
        }
    }

    public static final void accept$37(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        ((StoryFakePlayerComponent) afS55S0100000_3.l0).LLFZ = 0L;
    }

    public static final void accept$38(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        ((UpvotePublishVM) afS55S0100000_3.l0).setState(C183077Gl.LJLIL);
    }

    public static final void accept$39(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        ((WatchHistoryListViewModel) afS55S0100000_3.l0).gv0();
    }

    public static final void accept$4(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        BaseResponse baseResponse;
        Throwable th = (Throwable) obj;
        ((NowKeyboardVM) afS55S0100000_3.l0).getClass();
        if (th instanceof C38333F2r) {
            Object rawResponse = ((C38333F2r) th).getRawResponse();
            if (rawResponse instanceof BaseResponse) {
                baseResponse = (BaseResponse) rawResponse;
                ((NowKeyboardVM) afS55S0100000_3.l0).setState(new AqS169S0100000_3(baseResponse, 74));
                C175206uC.LIZJ(0);
            }
        }
        baseResponse = null;
        ((NowKeyboardVM) afS55S0100000_3.l0).setState(new AqS169S0100000_3(baseResponse, 74));
        C175206uC.LIZJ(0);
    }

    public static final void accept$40(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && baseResponse.status_code == 0) {
            InterfaceC215758dP interfaceC215758dP = (InterfaceC215758dP) afS55S0100000_3.l0;
            if (interfaceC215758dP != null) {
                interfaceC215758dP.onSuccess();
                return;
            }
            return;
        }
        InterfaceC215758dP interfaceC215758dP2 = (InterfaceC215758dP) afS55S0100000_3.l0;
        if (interfaceC215758dP2 == null) {
            return;
        }
        interfaceC215758dP2.onFail();
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0099, code lost:
    
        if (r2 != false) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$41(Y.AfS55S0100000_3 r10, java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS55S0100000_3.accept$41(Y.AfS55S0100000_3, java.lang.Object):void");
    }

    public static final void accept$42(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        ((WatchHistoryListViewModel) afS55S0100000_3.l0).gv0();
    }

    public static final void accept$43(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        WatchHistoryCopyResponse watchHistoryCopyResponse = (WatchHistoryCopyResponse) obj;
        WatchHistoryListViewModel watchHistoryListViewModel = (WatchHistoryListViewModel) afS55S0100000_3.l0;
        watchHistoryListViewModel.LJLJL = watchHistoryCopyResponse;
        watchHistoryListViewModel.setState(new AqS169S0100000_3(watchHistoryCopyResponse, 721));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$44(Y.AfS55S0100000_3 r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS55S0100000_3.accept$44(Y.AfS55S0100000_3, java.lang.Object):void");
    }

    public static final void accept$45(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        float f;
        float f2;
        int i;
        Integer LJI;
        Integer it = (Integer) obj;
        float[] fArr = new float[3];
        o.LJIIIIZZ(it, "it");
        Color.colorToHSV(it.intValue(), fArr);
        int i2 = (int) fArr[0];
        float f3 = (i2 + 375) % 360;
        float f4 = (i2 + 345) % 360;
        Context context = ((MusicCellAssem) afS55S0100000_3.l0).getContext();
        if (context != null && AnonymousClass636.LJIILJJIL(context)) {
            f = 0.75f;
            f2 = 0.8f;
        } else {
            f = 0.45f;
            f2 = 0.9f;
        }
        int HSVToColor = ColorProtector.HSVToColor(51, new float[]{f3, f, f2});
        int HSVToColor2 = ColorProtector.HSVToColor(38, new float[]{f4, f, f2});
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{HSVToColor, HSVToColor2});
        gradientDrawable.setShape(0);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        gradientDrawable.setGradientType(0);
        gradientDrawable.setCornerRadius(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        MusicCellAssem musicCellAssem = (MusicCellAssem) afS55S0100000_3.l0;
        int[] iArr = new int[2];
        iArr[0] = 0;
        Context context2 = musicCellAssem.getContext();
        if (context2 != null && (LJI = C79045V0n.LJI(R.attr.dm, context2)) != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        iArr[1] = i;
        gradientDrawable2.setColors(iArr);
        gradientDrawable2.setShape(0);
        gradientDrawable2.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        gradientDrawable2.setGradientType(0);
        gradientDrawable2.setCornerRadius(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
        ((MusicCellAssem) afS55S0100000_3.l0).getContainerView().findViewById(R.id.e5e).setBackground(new LayerDrawable(new GradientDrawable[]{gradientDrawable, gradientDrawable2}));
    }

    public static final void accept$46(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        Object value = ((C219568jY) afS55S0100000_3.l0).LJLLL.getValue();
        o.LJIIIIZZ(value, "<get-avatarList>(...)");
        ((ImageView) value).setImageBitmap((Bitmap) obj);
        C221018lt.LIZ("AbsAwemeViewHolder", "assembling finished");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r3 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$47(Y.AfS55S0100000_3 r5, java.lang.Object r6) {
        /*
            com.ss.android.ugc.aweme.explore.data.ExploreRelatedAwemeList r6 = (com.ss.android.ugc.aweme.explore.data.ExploreRelatedAwemeList) r6
            if (r6 == 0) goto L2b
            java.util.List<? extends com.ss.android.ugc.aweme.music.model.RelatedAweme> r0 = r6.relatedAwemes
            if (r0 == 0) goto L2b
            java.lang.Object r4 = r5.l0
            X.8B4 r4 = (X.C8B4) r4
            java.util.Iterator r2 = r0.iterator()
        L10:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L5a
            java.lang.Object r3 = r2.next()
            r0 = r3
            com.ss.android.ugc.aweme.music.model.RelatedAweme r0 = (com.ss.android.ugc.aweme.music.model.RelatedAweme) r0
            java.lang.String r1 = r0.relatedAid
            java.lang.String r0 = r4.LJLIL
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L10
        L27:
            com.ss.android.ugc.aweme.music.model.RelatedAweme r3 = (com.ss.android.ugc.aweme.music.model.RelatedAweme) r3
            if (r3 != 0) goto L3f
        L2b:
            com.ss.android.ugc.aweme.music.model.RelatedAweme r3 = new com.ss.android.ugc.aweme.music.model.RelatedAweme
            r3.<init>()
            java.lang.Object r1 = r5.l0
            X.8B4 r1 = (X.C8B4) r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.setItems(r0)
            r0 = 1
            r3.hasMore = r0
        L3f:
            com.ss.android.ugc.aweme.explore.data.ExploreAwemeList r2 = new com.ss.android.ugc.aweme.explore.data.ExploreAwemeList
            r2.<init>()
            int r0 = r3.hasMore
            r2.hasMore = r0
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r3.awemeList
            r2.items = r0
            android.os.Message r1 = android.os.Message.obtain()
            r1.obj = r2
            java.lang.Object r0 = r5.l0
            X.8B4 r0 = (X.C8B4) r0
            r0.handleMsg(r1)
            return
        L5a:
            r3 = 0
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS55S0100000_3.accept$47(Y.AfS55S0100000_3, java.lang.Object):void");
    }

    public static final void accept$48(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        Message obtain = Message.obtain();
        obtain.obj = obj;
        ((C8B4) afS55S0100000_3.l0).handleMsg(obtain);
    }

    public static final void accept$49(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        ((AppCompatImageView) ((AddYoursHubItemCellAssem) afS55S0100000_3.l0)._$_findCachedViewById(R.id.esr)).setImageBitmap((Bitmap) obj);
    }

    public static final void accept$5(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) afS55S0100000_3.l0;
        A2F a2f = A2G.LIZ;
        Exception exc = new Exception((Throwable) obj);
        a2f.getClass();
        A2I LIZJ = A2F.LIZJ(exc);
        C3C5.m7constructorimpl(LIZJ);
        interfaceC67352kd.resumeWith(LIZJ);
    }

    public static final void accept$50(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        ((VideoCollectionListViewModel) afS55S0100000_3.l0).setState(new AqS169S0100000_3((Throwable) obj, 784));
    }

    public static final void accept$51(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        ((VideoCollectionContentViewModel) afS55S0100000_3.l0).setState(new AqS169S0100000_3((Throwable) obj, 785));
    }

    public static final void accept$52(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        ((VideoCollectionContentViewModel) afS55S0100000_3.l0).setState(new AqS169S0100000_3((Throwable) obj, 786));
    }

    public static final void accept$53(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        CollectionDetailResponse collectionDetailResponse = (CollectionDetailResponse) obj;
        if (collectionDetailResponse.collectionDetail == null) {
            ((VideoCollectionContentViewModel) afS55S0100000_3.l0).setState(C192017gD.LJLIL);
        } else {
            ((VideoCollectionContentViewModel) afS55S0100000_3.l0).setState(new AqS169S0100000_3(collectionDetailResponse, 787));
        }
    }

    public static final void accept$54(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        ((VideoCollectionContentViewModel) afS55S0100000_3.l0).setState(new AqS169S0100000_3((Throwable) obj, 788));
    }

    public static final void accept$55(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        LogPbBean logPbBean;
        List<Aweme> nowPosts;
        Aweme aweme;
        NowMultiUserPostResponse nowMultiUserPostResponse = (NowMultiUserPostResponse) obj;
        ((Set) C194767ke.LIZIZ.getValue()).removeAll((List) afS55S0100000_3.l0);
        List<Aweme> userNowPosts = nowMultiUserPostResponse.getUserNowPosts();
        if (userNowPosts != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<Aweme> it = userNowPosts.iterator();
            while (true) {
                logPbBean = null;
                if (!it.hasNext()) {
                    break;
                }
                UserNowPost userNowPost = it.next().userNowPost;
                if (userNowPost != null && (nowPosts = userNowPost.getNowPosts()) != null && (aweme = (Aweme) ORZ.LJLLLL(nowPosts)) != null) {
                    aweme.setLogPbBean(nowMultiUserPostResponse.getLogPbBean());
                    aweme.userNowPost = null;
                    arrayList.add(aweme);
                }
            }
            List list = (List) afS55S0100000_3.l0;
            C194767ke.LIZ(arrayList);
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((Aweme) it2.next()).getAuthorUid());
            }
            Set LLJJ = ORZ.LLJJ(arrayList2);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (!LLJJ.contains(obj2)) {
                    arrayList3.add(obj2);
                }
            }
            if (arrayList3.isEmpty()) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("correctUserNowStatus: not ret uids: ");
            LIZ.append(arrayList3);
            LIZ.append(", query logPB: ");
            Aweme aweme2 = (Aweme) ORZ.LJLLLL(arrayList);
            if (aweme2 != null) {
                logPbBean = aweme2.getLogPbBean();
            }
            LIZ.append(logPbBean);
            X1D.LIZIZ(LIZ);
            ArrayList arrayList4 = new ArrayList(C32I.LJJL(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(new OSZ(it3.next(), 0));
            }
            C72085SQv.LJ(new AqS151S0100000_1(arrayList4, (List<String>) 946));
        }
    }

    public static final void accept$56(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        Throwable t = (Throwable) obj;
        ((Set) C194767ke.LIZIZ.getValue()).removeAll((List) afS55S0100000_3.l0);
        o.LJIIIIZZ(t, "t");
        C7XD.LIZJ("NowAwemeRepo", "preloadIfNoValidCache", t);
    }

    public static final void accept$57(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        Integer it = (Integer) obj;
        float[] fArr = new float[3];
        o.LJIIIIZZ(it, "it");
        Color.colorToHSV(it.intValue(), fArr);
        float f = fArr[0];
        int HSVToColor = Color.HSVToColor(new float[]{f, 0.6f, 0.4f});
        int HSVToColor2 = Color.HSVToColor(new float[]{f, 0.6f, 0.6f});
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{HSVToColor, HSVToColor2});
        gradientDrawable.setShape(0);
        gradientDrawable.setGradientType(0);
        ((C208668Gw) afS55S0100000_3.l0).LJLJLJ.setBackground(gradientDrawable);
        int HSVToColor3 = Color.HSVToColor(new float[]{f, 0.35f, 1.0f});
        TuxTextView tuxTextView = ((C208668Gw) afS55S0100000_3.l0).LJLLI;
        if (tuxTextView != null) {
            tuxTextView.setTextColor(HSVToColor3);
        }
        int LJIIL = C07290Qj.LJIIL(Color.HSVToColor(new float[]{f, 0.85f, 0.35f}), 127);
        C8H0 c8h0 = new C8H0();
        c8h0.LIZIZ = C32151Nz.LJIIZILJ(6);
        c8h0.invalidateSelf();
        ((Paint) c8h0.LIZ.getValue()).setShadowLayer(C32151Nz.LJIIZILJ(6), 0.0f, C32151Nz.LJIIZILJ(4), LJIIL);
        c8h0.invalidateSelf();
        FrameLayout frameLayout = ((C208668Gw) afS55S0100000_3.l0).LJLLLL;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setBackground(c8h0);
    }

    public static final void accept$58(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        C215298cf.LIZLLL.storeLong("key_dislike_time_stamp", System.currentTimeMillis());
        ((StoryGuideCardFilterPanelComponent) afS55S0100000_3.l0).v3();
    }

    public static final void accept$59(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        PoiMapViewModel poiMapViewModel = (PoiMapViewModel) afS55S0100000_3.l0;
        C3C1 c3c1 = new C3C1(new Exception("network error"));
        poiMapViewModel.getClass();
        poiMapViewModel.setState(new AqS169S0100000_3(c3c1, (AbstractC72932td<C229708zu>) 858));
        ((PoiMapViewModel) afS55S0100000_3.l0).gv0(EnumC191017eb.STATUS_POI_DETAIL_FAIL);
    }

    public static final void accept$6(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) afS55S0100000_3.l0;
        A2F a2f = A2G.LIZ;
        Exception exc = new Exception((Throwable) obj);
        a2f.getClass();
        A2I LIZJ = A2F.LIZJ(exc);
        C3C5.m7constructorimpl(LIZJ);
        interfaceC67352kd.resumeWith(LIZJ);
    }

    public static final void accept$60(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        ((MixCreateViewModel) afS55S0100000_3.l0).setState(new AqS169S0100000_3((ManageResponse) obj, 873));
    }

    public static final void accept$61(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        ((EditPlayListNameEditTextVM) afS55S0100000_3.l0).setState(new AqS169S0100000_3((Throwable) obj, 898));
    }

    public static final void accept$62(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        ((EditPlayListNameEditTextVM) afS55S0100000_3.l0).setState(new AqS169S0100000_3((CheckPlayResponse) obj, 888));
    }

    public static final void accept$63(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        ((EditPlayListNameEditTextVM) afS55S0100000_3.l0).setState(new AqS169S0100000_3((Throwable) obj, 890));
    }

    public static final void accept$64(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        ((EditPlayListNameEditTextVM) afS55S0100000_3.l0).setState(new AqS169S0100000_3((ManageResponse) obj, 897));
    }

    public static final void accept$65(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        ((C199947t0) afS55S0100000_3.l0).getIvAvatar().setImageBitmap((Bitmap) obj);
    }

    public static final void accept$66(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        PoiListApi.PoiDetailResponse poiDetailResponse = (PoiListApi.PoiDetailResponse) obj;
        if (poiDetailResponse == null || poiDetailResponse.status_code != 0) {
            return;
        }
        ((PoiCollectStatusViewModel) afS55S0100000_3.l0).setState(new AqS169S0100000_3(poiDetailResponse, 905));
    }

    public static final void accept$67(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        PoiReviewsApi.PoiReviewEligibleResponse poiReviewEligibleResponse = (PoiReviewsApi.PoiReviewEligibleResponse) obj;
        if (poiReviewEligibleResponse != null && poiReviewEligibleResponse.status_code == 0) {
            PoiReviewListViewModel poiReviewListViewModel = (PoiReviewListViewModel) afS55S0100000_3.l0;
            if (poiReviewListViewModel.LJLJJL == null) {
                poiReviewListViewModel.LJLJJL = poiReviewEligibleResponse.collectInfo;
            }
            poiReviewListViewModel.setState(new AqS134S0200000_3(poiReviewListViewModel, poiReviewEligibleResponse, 276));
        }
    }

    public static final void accept$68(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(C15380j0.LIZIZ(R.color.aa4)), Integer.valueOf(C15380j0.LIZIZ(R.color.aau)));
        View view = (View) afS55S0100000_3.l0;
        ofObject.setDuration(1700L);
        ofObject.setRepeatCount(0);
        ofObject.addUpdateListener(new AUListenerS92S0100000_3(view, 36));
        ofObject.start();
    }

    public static final void accept$69(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        float f;
        float f2;
        Integer it = (Integer) obj;
        float[] fArr = new float[3];
        o.LJIIIIZZ(it, "it");
        Color.colorToHSV(it.intValue(), fArr);
        int i = (int) fArr[0];
        float f3 = (i + 375) % 360;
        float f4 = (i + 345) % 360;
        Activity topActivity = ActivityStack.getTopActivity();
        o.LJIIIIZZ(topActivity, "getTopActivity()");
        if (AnonymousClass636.LJIILJJIL(topActivity)) {
            f = 0.75f;
            f2 = 0.8f;
        } else {
            f = 0.45f;
            f2 = 0.9f;
        }
        ((MusicHighlightBackgroundViewModel) afS55S0100000_3.l0).setState(new AqS4S0002000_3(ColorProtector.HSVToColor(51, new float[]{f3, f, f2}), ColorProtector.HSVToColor(38, new float[]{f4, f, f2}), 4));
    }

    public static final void accept$7(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        PrivacyHighlightsForTeens privacyHighlightsForTeens = (PrivacyHighlightsForTeens) obj;
        ((PhlViewModel) afS55S0100000_3.l0).LJLJJLL.setValue(Boolean.TRUE);
        ((PhlViewModel) afS55S0100000_3.l0).LJLILLLLZI.setValue(privacyHighlightsForTeens.pageTitle);
        ((PhlViewModel) afS55S0100000_3.l0).LJLJI.setValue(privacyHighlightsForTeens.pageDesc);
        ((PhlViewModel) afS55S0100000_3.l0).LJLJJI.setValue(privacyHighlightsForTeens.videoList);
        ((PhlViewModel) afS55S0100000_3.l0).LJLJJL.setValue(privacyHighlightsForTeens.pageButton);
        ((PhlViewModel) afS55S0100000_3.l0).LJLJL.setValue(privacyHighlightsForTeens.approveInfo);
    }

    public static final void accept$70(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        Aweme aweme;
        UserStoriesResponse userStoriesResponse = (UserStoriesResponse) obj;
        C55480Lq0 c55480Lq0 = C55480Lq0.LIZIZ;
        c55480Lq0.LIZLLL(249372176, 5);
        c55480Lq0.LIZJ(249372176, "is_request", 1);
        ((ArrayList) ((C224348rG) afS55S0100000_3.l0).LJLJI).clear();
        List<Aweme> awemes = userStoriesResponse.getAwemes();
        if (awemes != null && (aweme = (Aweme) ORZ.LJLLLL(awemes)) != null) {
            if (!aweme.isStoryPacked()) {
                C78847Ux1.LJJJLL(aweme, userStoriesResponse.extra.logid, true);
            }
            ((ArrayList) ((C224348rG) afS55S0100000_3.l0).LJLJI).add(aweme);
            C54794Lew.LIZ.LIZJ(aweme, aweme.getRequestId(), true);
        }
        List<C8BT> mNotifyListeners = ((C224348rG) afS55S0100000_3.l0).mNotifyListeners;
        o.LJIIIIZZ(mNotifyListeners, "mNotifyListeners");
        Iterator<C8BT> it = mNotifyListeners.iterator();
        while (it.hasNext()) {
            it.next().onSuccess();
        }
    }

    public static final void accept$71(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        Exception exc;
        Throwable th = (Throwable) obj;
        List<C8BT> mNotifyListeners = ((C224348rG) afS55S0100000_3.l0).mNotifyListeners;
        o.LJIIIIZZ(mNotifyListeners, "mNotifyListeners");
        for (C8BT c8bt : mNotifyListeners) {
            if (th instanceof Exception) {
                exc = (Exception) th;
            } else {
                exc = null;
            }
            c8bt.onFailed(exc);
        }
    }

    public static final void accept$72(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        NowPostBaseCellAssem nowPostBaseCellAssem = (NowPostBaseCellAssem) afS55S0100000_3.l0;
        nowPostBaseCellAssem.getClass();
        NowOtherCollectionAbility LJJ = C78897Uxp.LJJ(nowPostBaseCellAssem);
        if (LJJ != null && LJJ.Ck((InterfaceC194547kI) C51029K0z.LJIILLIIL((NowPostBaseCellAssem) afS55S0100000_3.l0))) {
            C8YN.LJIJI(((NowPostBaseCellAssem) afS55S0100000_3.l0).n4(), new AqS169S0100000_3((NowPostBaseCellAssem) afS55S0100000_3.l0, 972));
        }
    }

    public static final void accept$73(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        ((InterfaceC88472Yns) afS55S0100000_3.l0).invoke(((C213178Yf) obj).LIZ);
    }

    public static final void accept$74(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        ((C8RH) afS55S0100000_3.l0).LJLILLLLZI = 2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fetchEligible - ");
        LIZ.append(obj);
        C199127rg.LIZ(X1D.LIZIZ(LIZ));
    }

    public static final void accept$75(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        ((AppCompatImageView) ((NowWeakVersionShareCell) afS55S0100000_3.l0).itemView.findViewById(R.id.eaq)).setImageBitmap((Bitmap) obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x018c, code lost:
    
        if (r15 != false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$76(Y.AfS55S0100000_3 r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS55S0100000_3.accept$76(Y.AfS55S0100000_3, java.lang.Object):void");
    }

    public static final void accept$77(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        MixVideosViewModel mixVideosViewModel = (MixVideosViewModel) afS55S0100000_3.l0;
        mixVideosViewModel.withState(new AqS54S0201000_3(2, (MixVideosResponse) obj, mixVideosViewModel, 11));
    }

    public static final void accept$78(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) afS55S0100000_3.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fetchEligible - ");
        LIZ.append(obj);
        C199127rg.LIZ(X1D.LIZIZ(LIZ));
    }

    public static final void accept$79(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        ((InterfaceC65784Pro) afS55S0100000_3.l0).invoke();
    }

    public static final void accept$8(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        ((PhlViewModel) afS55S0100000_3.l0).LJLJJLL.setValue(Boolean.FALSE);
    }

    public static final void accept$80(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        GiftResult giftPageList;
        List<GiftPage> giftPageList2;
        List<GiftPage> giftPageList3;
        GiftResponse giftResponse = (GiftResponse) obj;
        int i = 0;
        int i2 = 0;
        if (giftResponse != null) {
            ((GiftViewModel) afS55S0100000_3.l0).lv0().setValue(giftResponse);
            ((GiftViewModel) afS55S0100000_3.l0).getClass();
            User curUser = HG3.LJIILL().getCurUser();
            o.LJII(curUser, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
            GiftResult giftPageList4 = giftResponse.getGiftPageList();
            if (giftPageList4 != null && (giftPageList3 = giftPageList4.getGiftPageList()) != null) {
                Iterator<GiftPage> it = giftPageList3.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().getGiftPageType() == 3) {
                            curUser.setGiftBagStatus(1);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            GiftViewModel giftViewModel = (GiftViewModel) afS55S0100000_3.l0;
            if (giftViewModel.LJLLJ == null) {
                giftViewModel.LJLLL.setValue(0);
            } else {
                GiftResponse value = giftViewModel.lv0().getValue();
                if (value != null && (giftPageList = value.getGiftPageList()) != null && (giftPageList2 = giftPageList.getGiftPageList()) != null) {
                    for (GiftPage giftPage : giftPageList2) {
                        int i3 = i + 1;
                        if (i >= 0) {
                            List<GiftStruct> giftList = giftPage.getGiftList();
                            if (giftList != null) {
                                for (GiftStruct giftStruct : giftList) {
                                    long id = giftStruct.getId();
                                    Long l = giftViewModel.LJLLJ;
                                    if (l != null && id == l.longValue()) {
                                        giftViewModel.LJLLJ = null;
                                        giftViewModel.LJLLL.setValue(Integer.valueOf(i));
                                        giftViewModel.jv0().setValue(giftStruct);
                                        giftViewModel.gv0(giftStruct.getId(), giftStruct.getEffectAsset());
                                    }
                                }
                            }
                            i = i3;
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                }
            }
        } else {
            ((GiftViewModel) afS55S0100000_3.l0).lv0().setValue(null);
        }
        GiftViewModel giftViewModel2 = (GiftViewModel) afS55S0100000_3.l0;
        if (giftResponse != null) {
            i2 = 1;
        }
        giftViewModel2.LJLL = i2;
    }

    public static final void accept$81(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        Throwable error = (Throwable) obj;
        o.LJIIIZ(error, "error");
        ((GiftViewModel) afS55S0100000_3.l0).lv0().setValue(null);
        error.getMessage();
        ((GiftViewModel) afS55S0100000_3.l0).LJLLI = error.getMessage();
        ((GiftViewModel) afS55S0100000_3.l0).nv0();
    }

    public static final void accept$82(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        List<TranslationResult> translatedComment = ((MultiTranslationResult) obj).results;
        List list = (List) afS55S0100000_3.l0;
        o.LJIIIIZZ(translatedComment, "translatedComment");
        list.addAll(translatedComment);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("startTranslate success size:");
        LIZ.append(Integer.valueOf(translatedComment.size()));
        LIZ.append(' ');
        LIZ.append(translatedComment);
        C71Y.LIZLLL("MultiCommentTranslationTask", X1D.LIZIZ(LIZ));
    }

    public static final void accept$83(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        Throwable it = (Throwable) obj;
        C178206z2 c178206z2 = (C178206z2) afS55S0100000_3.l0;
        List<? extends Comment> list = c178206z2.LIZ;
        o.LJIIIIZZ(it, "it");
        C74Z.LJJIJIIJI(false, c178206z2.LIZIZ);
        for (Comment comment : list) {
            o.LJIIIZ(comment, "comment");
            C178216z3.LJFF(comment, false);
            C176206vo c176206vo = new C176206vo(comment, false);
            if (it instanceof Exception) {
                c176206vo.LIZJ = (Exception) it;
            }
            C178216z3.LIZIZ(comment.getCid()).setValue(c176206vo);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MultiCommentTranslationTask startTranslate onError ");
        LIZ.append(it.getMessage());
        LIZ.append('}');
        C36922EeM.LJ(X1D.LIZIZ(LIZ));
    }

    public static final void accept$84(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        Integer num;
        Throwable th = (Throwable) obj;
        if (th instanceof C38333F2r) {
            num = Integer.valueOf(((C38306F1q) th).getErrorCode());
        } else {
            num = null;
        }
        ((PoiDetailInfoViewModel) afS55S0100000_3.l0).getClass();
        ((PoiDetailInfoViewModel) afS55S0100000_3.l0).gv0(null, num);
        FMX.LJIILL("poi_video_list_error", new OSZ(Boolean.valueOf(th instanceof s), "json_error"));
    }

    public static final void accept$85(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        ((StoryQuickDMBottomBarAssem) afS55S0100000_3.l0).Y3().setVisibility(8);
    }

    public static final void accept$9(AfS55S0100000_3 afS55S0100000_3, Object obj) {
        String str;
        String str2;
        boolean z;
        User author;
        C111144Xu c111144Xu = (C111144Xu) obj;
        Aweme aweme = c111144Xu.LIZ;
        String str3 = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        Aweme currentPlayAweme = ((StoryMixedFeedDetailPanel) afS55S0100000_3.l0).getCurrentPlayAweme();
        if (currentPlayAweme != null) {
            str2 = currentPlayAweme.getAid();
        } else {
            str2 = null;
        }
        if (o.LJ(str, str2) && c111144Xu.LIZIZ) {
            StringBuilder LIZ = X1D.LIZ();
            Aweme currentPlayAweme2 = ((StoryMixedFeedDetailPanel) afS55S0100000_3.l0).getCurrentPlayAweme();
            if (currentPlayAweme2 != null && (author = currentPlayAweme2.getAuthor()) != null) {
                str3 = author.getNickname();
            }
            C0MT.LJ(LIZ, str3, " quick_dm: display quick dm", LIZ);
            View view = ((StoryMixedFeedDetailPanel) afS55S0100000_3.l0).LLJJJJLIIL;
            if (view != null && view.getVisibility() != 8) {
                view.setVisibility(8);
            }
            InterfaceC55317LnN interfaceC55317LnN = ((StoryMixedFeedDetailPanel) afS55S0100000_3.l0).LLII;
            if (interfaceC55317LnN != null) {
                interfaceC55317LnN.h(false);
            }
            StoryMixedFeedDetailPanel storyMixedFeedDetailPanel = (StoryMixedFeedDetailPanel) afS55S0100000_3.l0;
            if (storyMixedFeedDetailPanel.LLJLILLLLZIIL == null) {
                storyMixedFeedDetailPanel.LLJLILLLLZIIL = storyMixedFeedDetailPanel.LLIIL();
            }
            StoryMixedFeedDetailPanel storyMixedFeedDetailPanel2 = (StoryMixedFeedDetailPanel) afS55S0100000_3.l0;
            InterfaceC224518rX interfaceC224518rX = storyMixedFeedDetailPanel2.LLJLILLLLZIIL;
            if (interfaceC224518rX != null) {
                interfaceC224518rX.pj(storyMixedFeedDetailPanel2.getFragment().getView(), ((StoryMixedFeedDetailPanel) afS55S0100000_3.l0).getCurrentPlayAweme(), ((StoryMixedFeedDetailPanel) afS55S0100000_3.l0).LLJLLIL);
            }
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("quick_dm: display common bottom bar, mDetailInputFragment is null?: ");
            if (((StoryMixedFeedDetailPanel) afS55S0100000_3.l0).LLII == null) {
                z = true;
            } else {
                z = false;
            }
            LIZ2.append(z);
            X1D.LIZIZ(LIZ2);
            View view2 = ((StoryMixedFeedDetailPanel) afS55S0100000_3.l0).LLJJJJLIIL;
            if (view2 != null && view2.getVisibility() != 8) {
                view2.setVisibility(8);
            }
            StoryMixedFeedDetailPanel storyMixedFeedDetailPanel3 = (StoryMixedFeedDetailPanel) afS55S0100000_3.l0;
            InterfaceC224518rX interfaceC224518rX2 = storyMixedFeedDetailPanel3.LLJLILLLLZIIL;
            if (interfaceC224518rX2 != null) {
                interfaceC224518rX2.A0(storyMixedFeedDetailPanel3.getFragment().getView());
            }
            InterfaceC55317LnN interfaceC55317LnN2 = ((StoryMixedFeedDetailPanel) afS55S0100000_3.l0).LLII;
            if (interfaceC55317LnN2 != null) {
                interfaceC55317LnN2.h(true);
            }
            InterfaceC55317LnN interfaceC55317LnN3 = ((StoryMixedFeedDetailPanel) afS55S0100000_3.l0).LLII;
            if (interfaceC55317LnN3 != null) {
                interfaceC55317LnN3.X5();
            }
            InterfaceC55317LnN interfaceC55317LnN4 = ((StoryMixedFeedDetailPanel) afS55S0100000_3.l0).LLII;
            if (interfaceC55317LnN4 != null) {
                interfaceC55317LnN4.d3();
            }
        }
        ((StoryMixedFeedDetailPanel) afS55S0100000_3.l0).getClass();
    }
}
