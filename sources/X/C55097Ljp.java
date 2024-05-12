package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.assem.scope.LinkMicScope;
import com.bytedance.android.live.liveinteract.multihost.biz.helper.InteractTitleScope;
import com.bytedance.android.live.liveinteract.multihost.biz.helper.MultiHostScope;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.MatchScope;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.scope.DetailPageBottomBarScope;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.CommentKeyboardScope;
import com.ss.android.ugc.aweme.detail.DetailFragmentScope;
import com.ss.android.ugc.aweme.dsp.arch.AudioCardScope;
import com.ss.android.ugc.aweme.dsp.arch.FragmentScope;
import com.ss.android.ugc.aweme.ecommerce.search.page.ECSearchPageScope;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.SearchVerticalScope;
import com.ss.android.ugc.aweme.ecomsearch.ui.EcSearchContainerFragmentScope;
import com.ss.android.ugc.aweme.feed.adapter.CellInteractAreaScope;
import com.ss.android.ugc.aweme.feed.adapter.FeedBottomButtonContainerScope;
import com.ss.android.ugc.aweme.feed.adapter.PanelScope;
import com.ss.android.ugc.aweme.feed.landscape.component.scope.LandscapeFeedScope;
import com.ss.android.ugc.aweme.friendstab.utils.FriendsFeedScope;
import com.ss.android.ugc.aweme.fullpagev3.scope.PostModeDetailFragmentScope;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.ChatRoomScope;
import com.ss.android.ugc.aweme.music.highlight.HighlightScope;
import com.ss.android.ugc.aweme.notification.creator.vscope.CreatorNoticeTabScope;
import com.ss.android.ugc.aweme.nows.ability.NowArchiveScope;
import com.ss.android.ugc.aweme.nows.ability.NowDetailScope;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailScope;
import com.ss.android.ugc.aweme.popularfeed.scope.FeedPopularFragmentScope;
import com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTAScope;
import com.ss.android.ugc.aweme.profile.widgets.header.ProfileScope;
import com.ss.android.ugc.aweme.roaming.NearbyRegionScope;
import com.ss.android.ugc.aweme.scope.FeedNearbyFragmentScope;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.scope.MainFragmentScope;
import com.ss.android.ugc.aweme.scope.MainPageFragmentScope;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardScope;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.scope.SearchPlayerScope;
import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchResultFragmentScope;
import com.ss.android.ugc.aweme.search.pages.core.ui.assem.SearchContainerFragmentScope;
import com.ss.android.ugc.aweme.search.pages.result.common.research.core.vability.SearchFragmentScope;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoScope;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.creationentrance.ability.SearchTopFragmentSource;
import com.ss.android.ugc.aweme.stemfeed.scope.StemFeedFragmentScope;
import com.ss.android.ugc.aweme.story.feed.common.newarch.config.StoryRootCellScope;
import com.ss.android.ugc.aweme.story.feed.common.newarch.scope.FeedCollectionProtocolScope;
import com.ss.android.ugc.aweme.story.feed.common.newarch.scope.FeedCollectionScope;
import com.ss.android.ugc.aweme.story.feed.common.newarch.scope.FeedSubViewHolderScope;
import com.ss.android.ugc.aweme.story.feed.immersive.scope.StoryBottomBarScope;
import com.ss.android.ugc.aweme.story.feed.immersive.scope.UserFeedScope;
import com.ss.android.ugc.aweme.topicfeed.scope.TopicFeedFragmentScope;
import com.ss.android.ugc.aweme.translation.ui.TranslationStatusScope;
import com.ss.android.ugc.feed.platform.cell.RootCellScope;
import com.ss.android.ugc.feed.platform.container.scope.BottomBarComponentScope;
import com.ss.android.ugc.feed.platform.container.scope.CommonVideoCellScope;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import com.ss.android.ugc.feed.platform.container.scope.VideoTagComponentScope;
import com.ss.android.ugc.feed.platform.panel.RootPanelScope;
import com.ss.android.ugc.now.interaction.CommentListFragmentScope;
import com.ss.android.ugc.now.interaction.InteractionFragmentScope;
import com.ss.android.ugc.profile.platform.business.navbar.base.NavbarScope;
import kotlin.jvm.internal.o;

/* renamed from: X.Ljp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55097Ljp {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C55099Ljr.INSTANCE);

    public static final InterfaceC55235Lm3 LIZ(Object owner) {
        o.LJIIIZ(owner, "owner");
        if (owner instanceof ActivityC45651qj) {
            return C55230Lly.LIZLLL((ActivityC45651qj) owner, null);
        }
        if (owner instanceof Fragment) {
            return C55230Lly.LIZJ((Fragment) owner, null);
        }
        if (owner instanceof C8W0) {
            return C55096Ljo.LJIIZILJ((C8W0) owner);
        }
        if (owner instanceof InterfaceC55100Ljs) {
            return C55096Ljo.LJIJ((InterfaceC55100Ljs) owner);
        }
        if (!(owner instanceof InterfaceC55235Lm3)) {
            return null;
        }
        return (InterfaceC55235Lm3) owner;
    }

    public static final Class<Object> LIZIZ(Class<?> cls) {
        if (C214368bA.LJIIL) {
            switch (C16880lQ.LJLLILLLL(cls).hashCode()) {
                case -2084430433:
                    return TranslationStatusScope.class;
                case -2042693600:
                    return ECSearchPageScope.class;
                case -2006464570:
                case -408720268:
                    return CellInteractAreaScope.class;
                case -1987814245:
                case 438909828:
                    return SearchVideoScope.class;
                case -1946182036:
                    return FeedPopularFragmentScope.class;
                case -1900613863:
                case 1702815292:
                case 1934982581:
                    return FeedCollectionScope.class;
                case -1771510138:
                case -611660258:
                case 205663415:
                case 1004048052:
                    return VideoCellScope.class;
                case -1745278508:
                    return NavbarScope.class;
                case -1658083618:
                    return MultiHostScope.class;
                case -1652755029:
                case -940699097:
                case 685268328:
                case 1186503363:
                case 2141273201:
                    return LinkMicScope.class;
                case -1639790714:
                case -162425148:
                    return CreatorNoticeTabScope.class;
                case -1602105596:
                case 502037929:
                    return CommentListFragmentScope.class;
                case -1319363609:
                    return UserFeedScope.class;
                case -1285970045:
                    return DetailPageBottomBarScope.class;
                case -1283383710:
                    return NowDetailScope.class;
                case -1188818706:
                    return ProfileCTAScope.class;
                case -1171373722:
                case 583049781:
                    return MatchScope.class;
                case -1156280389:
                case 1860296320:
                    return FeedSubViewHolderScope.class;
                case -1109711039:
                    return BottomBarComponentScope.class;
                case -1079669701:
                    return AudioCardScope.class;
                case -1049408778:
                case 67714502:
                    return CommentKeyboardScope.class;
                case -1034780811:
                case -126511029:
                case 775225114:
                    return SearchVerticalScope.class;
                case -1027908171:
                    return FeedBottomButtonContainerScope.class;
                case -926518651:
                    return FragmentScope.class;
                case -877450963:
                    return SearchFragmentScope.class;
                case -801461606:
                    return NearbyRegionScope.class;
                case -721834929:
                case -387493606:
                case 1918542045:
                    return SearchPlayerScope.class;
                case -552670043:
                    return VideoTagComponentScope.class;
                case -465135313:
                case 721741016:
                    return PanelScope.class;
                case -280139755:
                    return RootCellScope.class;
                case -237138791:
                    return HighlightScope.class;
                case -135213577:
                    return EcSearchContainerFragmentScope.class;
                case -14801594:
                    return FeedCollectionProtocolScope.class;
                case 3378297:
                    return InteractionFragmentScope.class;
                case 8464934:
                    return FriendsFeedScope.class;
                case 19141621:
                    return SearchTopFragmentSource.class;
                case 303194441:
                    return MainPageFragmentScope.class;
                case 333426333:
                    return StoryRootCellScope.class;
                case 348209159:
                case 1857838317:
                case 2059268199:
                    return RootPanelScope.class;
                case 352067607:
                case 683138905:
                    return MainActivityScope.class;
                case 438073930:
                    return LandscapeFeedScope.class;
                case 524344290:
                    return SearchContainerFragmentScope.class;
                case 528249891:
                    return FeedNearbyFragmentScope.class;
                case 545775856:
                    return PostModeDetailFragmentScope.class;
                case 556042200:
                    return InteractTitleScope.class;
                case 628057954:
                    return DetailFragmentScope.class;
                case 688836250:
                    return MainFragmentScope.class;
                case 719099940:
                case 841091241:
                    return PoiDetailScope.class;
                case 805390446:
                    return StemFeedFragmentScope.class;
                case 899397942:
                case 1383791980:
                    return ChatRoomScope.class;
                case 1004640020:
                    return SearchCardScope.class;
                case 1212734442:
                    return ProfileScope.class;
                case 1524153894:
                    return StoryBottomBarScope.class;
                case 1583284963:
                case 1696623725:
                    return CommonVideoCellScope.class;
                case 1728961211:
                    return NowArchiveScope.class;
                case 1886037827:
                    return TopicFeedFragmentScope.class;
                case 2054590914:
                    return SearchResultFragmentScope.class;
            }
        }
        switch (C16880lQ.LJLLILLLL(cls).hashCode()) {
            case -2084430433:
                return TranslationStatusScope.class;
            case -2042693600:
                return ECSearchPageScope.class;
            case -2006464570:
            case -408720268:
                return CellInteractAreaScope.class;
            case -1987814245:
            case 438909828:
                return SearchVideoScope.class;
            case -1946182036:
                return FeedPopularFragmentScope.class;
            case -1900613863:
            case 1702815292:
            case 1934982581:
                return FeedCollectionScope.class;
            case -1771510138:
            case -611660258:
            case 205663415:
            case 1004048052:
                return VideoCellScope.class;
            case -1745278508:
                return NavbarScope.class;
            case -1658083618:
                return MultiHostScope.class;
            case -1652755029:
            case -940699097:
            case 685268328:
            case 1186503363:
            case 2141273201:
                return LinkMicScope.class;
            case -1639790714:
            case -162425148:
                return CreatorNoticeTabScope.class;
            case -1602105596:
            case 502037929:
                return CommentListFragmentScope.class;
            case -1319363609:
                return UserFeedScope.class;
            case -1285970045:
                return DetailPageBottomBarScope.class;
            case -1283383710:
                return NowDetailScope.class;
            case -1188818706:
                return ProfileCTAScope.class;
            case -1171373722:
            case 583049781:
                return MatchScope.class;
            case -1156280389:
            case 1860296320:
                return FeedSubViewHolderScope.class;
            case -1109711039:
                return BottomBarComponentScope.class;
            case -1079669701:
                return AudioCardScope.class;
            case -1049408778:
            case 67714502:
                return CommentKeyboardScope.class;
            case -1034780811:
            case -126511029:
            case 775225114:
                return SearchVerticalScope.class;
            case -1027908171:
                return FeedBottomButtonContainerScope.class;
            case -926518651:
                return FragmentScope.class;
            case -877450963:
                return SearchFragmentScope.class;
            case -801461606:
                return NearbyRegionScope.class;
            case -721834929:
            case -387493606:
            case 1918542045:
                return SearchPlayerScope.class;
            case -552670043:
                return VideoTagComponentScope.class;
            case -465135313:
            case 721741016:
                return PanelScope.class;
            case -280139755:
                return RootCellScope.class;
            case -237138791:
                return HighlightScope.class;
            case -135213577:
                return EcSearchContainerFragmentScope.class;
            case -14801594:
                return FeedCollectionProtocolScope.class;
            case 3378297:
                return InteractionFragmentScope.class;
            case 8464934:
                return FriendsFeedScope.class;
            case 19141621:
                return SearchTopFragmentSource.class;
            case 303194441:
                return MainPageFragmentScope.class;
            case 333426333:
                return StoryRootCellScope.class;
            case 348209159:
            case 1857838317:
            case 2059268199:
                return RootPanelScope.class;
            case 352067607:
            case 683138905:
                return MainActivityScope.class;
            case 438073930:
                return LandscapeFeedScope.class;
            case 524344290:
                return SearchContainerFragmentScope.class;
            case 528249891:
                return FeedNearbyFragmentScope.class;
            case 545775856:
                return PostModeDetailFragmentScope.class;
            case 556042200:
                return InteractTitleScope.class;
            case 628057954:
                return DetailFragmentScope.class;
            case 688836250:
                return MainFragmentScope.class;
            case 719099940:
            case 841091241:
                return PoiDetailScope.class;
            case 805390446:
                return StemFeedFragmentScope.class;
            case 899397942:
            case 1383791980:
                return ChatRoomScope.class;
            case 1004640020:
                return SearchCardScope.class;
            case 1212734442:
                return ProfileScope.class;
            case 1524153894:
                return StoryBottomBarScope.class;
            case 1583284963:
            case 1696623725:
                return CommonVideoCellScope.class;
            case 1728961211:
                return NowArchiveScope.class;
            case 1886037827:
                return TopicFeedFragmentScope.class;
            case 2054590914:
                return SearchResultFragmentScope.class;
        }
        return null;
    }

    public static final Object LIZJ(Object obj) {
        if (obj instanceof ActivityC45651qj) {
            return null;
        }
        if (obj instanceof Fragment) {
            Fragment fragment = (Fragment) obj;
            if (fragment.getParentFragment() == null) {
                return fragment.mo49getActivity();
            }
            return fragment.getParentFragment();
        }
        if (obj instanceof C8W0) {
            return ((C8W0) obj).getParent();
        }
        if (obj instanceof InterfaceC55100Ljs) {
            InterfaceC55235Lm3 parentScope = ((InterfaceC55100Ljs) obj).getParentScope();
            if (parentScope == null) {
                return null;
            }
            return parentScope.getHost();
        }
        if (obj instanceof View) {
            View view = (View) obj;
            Fragment LJIIIZ = C79234V7u.LJIIIZ(view);
            if (LJIIIZ != null) {
                return LJIIIZ;
            }
            return view.getContext();
        }
        if (!(obj instanceof InterfaceC55235Lm3)) {
            return null;
        }
        return ((InterfaceC55235Lm3) obj).getTree().LIZJ;
    }
}
