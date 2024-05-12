package com.ss.android.ugc.aweme.detail.ui;

import X.AV1;
import X.ActivityC45651qj;
import X.C03880Dg;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C2049682q;
import X.C224498rV;
import X.C224868s6;
import X.C227898wz;
import X.C26045AKb;
import X.C29S;
import X.C2K0;
import X.C2L4;
import X.C2LV;
import X.C2U8;
import X.C38499F9b;
import X.C39468FeK;
import X.C3C5;
import X.C3SZ;
import X.C49671JeV;
import X.C50419JqZ;
import X.C50420Jqa;
import X.C54206LPe;
import X.C54295LSp;
import X.C54297LSr;
import X.C54318LTm;
import X.C54319LTn;
import X.C54320LTo;
import X.C54435LXz;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55281Lmn;
import X.C55327LnX;
import X.C55403Lol;
import X.C55405Lon;
import X.C56209M4f;
import X.C57534Mi2;
import X.C5S1;
import X.C63081OpJ;
import X.C65300Pk0;
import X.C73340SqO;
import X.C76800UCe;
import X.C76965UIn;
import X.C77123UOp;
import X.C84193Sd;
import X.C90903hW;
import X.C9G7;
import X.HG3;
import X.IWF;
import X.InterfaceC229748zy;
import X.InterfaceC55102Lju;
import X.InterfaceC55235Lm3;
import X.InterfaceC55336Lng;
import X.InterfaceC55407Lop;
import X.JEZ;
import X.JHI;
import X.KQ1;
import X.LLM;
import X.LLO;
import X.LNH;
import X.M2T;
import X.M89;
import X.NO5;
import X.NOE;
import X.NT2;
import X.O5Y;
import X.QD3;
import X.QZP;
import X.V0N;
import X.V9W;
import X.Z9N;
import Y.AObserverS61S0101000_7;
import Y.AObserverS64S0101000_14;
import Y.AObserverS77S0100000_9;
import Y.IDiS271S0100000_9;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService;
import com.ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.ss.android.ugc.aweme.common.viewmodel.TrendingMixInFlowViewModel;
import com.ss.android.ugc.aweme.detail.DetailFlingGestureAbility;
import com.ss.android.ugc.aweme.detail.DetailFragmentScope;
import com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility;
import com.ss.android.ugc.aweme.detail.ui.DetailFragment;
import com.ss.android.ugc.aweme.detail.ui.story.StoryDetailPageFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.ss.android.ugc.aweme.services.IDLCallbackS16S0200000_7;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.story.service.StoryServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public class DetailFragment extends AmeBaseFragment implements DetailFlingGestureAbility, InterfaceC55102Lju, C2L4 {
    public static final C55327LnX LLFF = new C55327LnX();
    public C54206LPe LJLIL;
    public InterfaceC55336Lng LJLILLLLZI;
    public ScrollSwitchStateManager LJLJI;
    public HomePageDataViewModel LJLJJL;
    public C54297LSr LJLJJLL;
    public DataCenter LJLJLLL;
    public Aweme LJLL;
    public Aweme LJLLI;
    public AnalysisStayTimeFragmentComponent LJLLJ;
    public IAdSceneService LJLLL;
    public LLO LJZ;
    public LLM LJZI;
    public InterfaceC55235Lm3 LJZL;
    public final C54320LTo LJLJJI = new C54320LTo();
    public M89 LJLJL = new M89();
    public int LJLJLJ = -1;
    public boolean LJLLILLLL = false;
    public boolean LJLLLL = false;
    public String LJLLLLLL = "";
    public String LJLZ = "";
    public boolean LL = false;
    public String LLD = "";
    public final String LLF = "DetailFragment";

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -1809055789) {
            return null;
        }
        return this;
    }

    public final boolean Al() {
        if ((TextUtils.isEmpty(this.LJLJL.getFeedsAwemeId()) || (!TextUtils.equals(this.LJLJL.getPreviousPage(), "homepage_follow") && !TextUtils.equals(this.LJLJL.getPreviousPage(), "homepage_hot"))) && !LLFF.containsKey(this.LJLJL.getEventType()) && !TextUtils.equals(this.LJLJL.getEventType(), "playlist") && !TextUtils.equals(this.LJLJL.getFrom(), "STORY_ENTRANCE_INBOX_TOP_LIST") && !TextUtils.equals(this.LJLJL.getFrom(), "STORY_ENTRANCE_FOLLOWING_FEED_TOP_LIST") && !TextUtils.equals(this.LJLJL.getFrom(), "STORY_ENTRANCE_FEED_TOP_LIST") && !TextUtils.equals(this.LJLJL.getFrom(), "STORY_ENTRANCE_GUIDE_CARD")) {
            return false;
        }
        return true;
    }

    public C54295LSp Dl() {
        ITalentAdRevenueShareService LJIIJJI;
        ITalentAdRevenueShareService LJIIJJI2;
        C54295LSp c54295LSp = new C54295LSp();
        if (this.LJLJL.isFromDuetMode() || this.LJLJL.isFromEffectDiscover()) {
            c54295LSp.LIZIZ(Il(), "page_feed", 0, getArguments());
            return c54295LSp;
        }
        c54295LSp.LIZIZ(Il(), "page_feed", 0, getArguments());
        Bundle bundle = new Bundle();
        bundle.putString("related_gid", this.LJLJL.getRelatedId());
        bundle.putInt("from_recommend_card", this.LJLJL.getFromRecommendCard());
        if (this.LJLJL.isStoryPage()) {
            if (!TextUtils.equals(this.LJLJL.getEventType(), "personal_homepage") && (TextUtils.equals(this.LJLJL.getEventType(), "others_homepage") || !xl() || ((LJIIJJI2 = TalentAdRevenueShareServiceImpl.LJIIJJI()) != null && LJIIJJI2.LJI()))) {
                c54295LSp.LIZ(bundle, BusinessComponentServiceUtils.getProfilePageClass());
            }
        } else if (TextUtils.equals(this.LJLJL.getEventType(), "others_homepage") || !xl() || ((LJIIJJI = TalentAdRevenueShareServiceImpl.LJIIJJI()) != null && LJIIJJI.LJI())) {
            c54295LSp.LIZ(bundle, BusinessComponentServiceUtils.getProfilePageClass());
        }
        return c54295LSp;
    }

    public final IDetailPageAbility Hl() {
        ScrollSwitchStateManager scrollSwitchStateManager;
        if (this.LJLJJLL == null || (scrollSwitchStateManager = this.LJLJI) == null) {
            return null;
        }
        return KQ1.LIZ(scrollSwitchStateManager.iv0("page_feed"));
    }

    public Class<? extends CommonPageFragment> Il() {
        Z9N z9n = Z9N.LIZIZ;
        if (z9n.LJJIIZI(this.LJLJL.getEventType())) {
            return z9n.LLLII().LJ();
        }
        if (this.LJLJL.isFromDuetMode() || !this.LJLJL.isStoryPage()) {
            return DetailPageFragment.class;
        }
        String from = this.LJLJL.getFrom();
        if (C77123UOp.LJJIJIIJIL(from) || o.LJ(from, "STORY_ENTRANCE_MINE") || o.LJ(from, "STORY_ENTRANCE_OTHER") || o.LJ(from, "STORY_ENTRANCE_AVATAR") || o.LJ(from, "STORY_ENTRANCE_ARCHIVE") || o.LJ(from, "STORY_ENTRANCE_PREVIEW") || o.LJ(from, "STORY_ENTRANCE_DEFAULT") || o.LJ(from, "STORY_ENTRANCE_COMMON") || o.LJ(from, "STORY_ENTRANCE_WIDGET") || o.LJ(from, "STORY_ENTRANCE_GUIDE_CARD")) {
            return StoryDetailPageFragment.class;
        }
        return DetailPageFragment.class;
    }

    public final String Kl() {
        return this.LJLJL.getFrom();
    }

    @Override // com.ss.android.ugc.aweme.main.FlingGestureAbility
    public final void LF() {
        this.LJLIL.setFlingEnabled(true);
    }

    public final void LJI() {
        if (TextUtils.equals(this.LJLJL.getEventType(), "others_homepage")) {
            C2U8.LIZ(new C55281Lmn());
        }
        DataCenter dataCenter = this.LJLJLLL;
        if (dataCenter != null) {
            dataCenter.jv0(null, "onBack");
        }
    }

    public final boolean Ll() {
        Aweme aweme;
        if (this.LJLJL.getVideoType() == 14) {
            return false;
        }
        if ((!"from_profile_self".equals(Kl()) && !"from_profile_other".equals(Kl()) && !"STORY_ENTRANCE_OTHER".equals(Kl()) && !"STORY_ENTRANCE_MINE".equals(Kl()) && !"from_ad_new_fake_user".equals(Kl()) && !"from_video_sticker_profile_self".equals(Kl())) || (aweme = this.LJLL) == null || aweme.getAuthor() == null || !TextUtils.equals(this.LJLL.getAuthor().getUid(), this.LJLJL.getUid())) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.main.FlingGestureAbility
    public final void Xx() {
        this.LJLIL.setFlingEnabled(false);
    }

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(DetailFragmentScope.class);
    }

    public final boolean wl() {
        Aweme aweme;
        if ((("from_nearby".equals(Kl()) || "from_search_mix".equals(Kl()) || "from_search_live".equals(Kl()) || "trending_page".equals(Kl())) && (aweme = this.LJLL) != null && aweme.isLive()) || C224868s6.LIZLLL(this.LJLL)) {
            return true;
        }
        return Ll();
    }

    public static String Gl() {
        HG3.LJIIL();
        if (HG3.LJLJL.LJFF() != null) {
            HG3.LJIIL();
            HG3.LJLJL.LJFF().getCurUserId();
            HG3.LJIIL();
            return HG3.LJLJL.LJFF().getCurUserId();
        }
        return "";
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, X.InterfaceC45040Hm0
    public final Analysis getAnalysis() {
        if (Al()) {
            Analysis analysis = new Analysis();
            analysis.setLabelName("others_homepage");
            return analysis;
        }
        return super.getAnalysis();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (!TextUtils.isEmpty(this.LJLJL.getReactSessionId()) && this.LJLL != null) {
            C2U8.LIZ(new C49671JeV(2, this.LJLJL.getReactSessionId(), this.LJLL.getAid(), IWF.LJJLIIIIJ().getCurrentPosition()));
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LJLLILLLL) {
            V0N.LJLIL = "prop_reuse";
            new Intent();
            ArrayList<String> arrayList = new ArrayList<>();
            String[] strArr = new String[0];
            Aweme aweme = this.LJLL;
            if (aweme != null) {
                strArr = aweme.getStickerIDs().split(",");
            }
            for (String str : strArr) {
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
            RecordConfig.Builder builder = new RecordConfig.Builder();
            builder.creationId(UUID.randomUUID().toString());
            builder.stickers(arrayList);
            builder.autoUseSticker((String) ListProtector.get(arrayList, 0));
            builder.stickerMusic(this.LJLL.getMusic());
            builder.translationType(3);
            AVExternalServiceImpl.LIZ().asyncService("DetailFeed", new IDLCallbackS16S0200000_7(builder, this, 8));
            this.LJLLILLLL = false;
        }
    }

    public final boolean xl() {
        boolean z;
        AwemeCommerceStruct commerceVideoAuthInfo;
        if (AV1.LJIIJJI()) {
            return true;
        }
        int videoType = this.LJLJL.getVideoType();
        if (videoType == 0 || videoType == 15) {
            z = true;
        } else {
            z = false;
        }
        boolean equals = "from_profile_self".equals(Kl());
        boolean equals2 = "from_profile_other".equals(Kl());
        if ((equals || equals2) && z) {
            return true;
        }
        Aweme aweme = this.LJLL;
        if ((C63081OpJ.LJLL(aweme) && aweme != null && (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) != null && commerceVideoAuthInfo.isPersonalPageForbidden()) || TextUtils.equals("new_ad_fake_user", this.LJLJL.getEventType()) || "from_publish_add_video".equals(Kl()) || StoryServiceImpl.LJJI().LJIJ().LJIILJJIL(this.LJLJL.getFrom())) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
    }

    public static void vl(DetailFragment detailFragment) {
        AwemeCommerceStruct commerceVideoAuthInfo;
        Aweme aweme;
        Aweme aweme2;
        IAdSceneService iAdSceneService;
        ScrollSwitchStateManager scrollSwitchStateManager = detailFragment.LJLJI;
        if (scrollSwitchStateManager != null && TextUtils.equals("page_feed", scrollSwitchStateManager.hv0()) && detailFragment.Hl() != null && (aweme2 = detailFragment.LJLL) != null && aweme2.isAd() && (iAdSceneService = detailFragment.LJLLL) != null) {
            iAdSceneService.LIZJ();
            NT2.LJJJJI(detailFragment.getContext());
        }
        if (TextUtils.equals(detailFragment.LJLJL.getEventType(), "others_homepage") && (aweme = detailFragment.LJLL) != null && aweme.isAd() && detailFragment.LJLL.getAuthorUid() != null && !detailFragment.LJLL.getAuthorUid().equals(Gl())) {
            return;
        }
        Aweme aweme3 = detailFragment.LJLL;
        if ((!C63081OpJ.LJLL(aweme3) || aweme3 == null || (commerceVideoAuthInfo = aweme3.getCommerceVideoAuthInfo()) == null || !commerceVideoAuthInfo.isPersonalPageForbidden()) && (!detailFragment.LL || O5Y.LJJJZ(detailFragment.LJLL.getAwemeRawAd()))) {
            return;
        }
        C26045AKb c26045AKb = new C26045AKb(detailFragment);
        c26045AKb.LJIIIIZZ(R.string.b95);
        c26045AKb.LJIIJ();
    }

    public final void Ml(int i) {
        Aweme aweme;
        Aweme aweme2;
        long j;
        IDetailPageAbility Hl = Hl();
        String str = null;
        if (Hl != null) {
            aweme = Hl.O1();
        } else {
            aweme = null;
        }
        int Jl = Jl(i, aweme);
        IDetailPageAbility Hl2 = Hl();
        if (Hl2 != null) {
            aweme2 = Hl2.O1();
        } else {
            aweme2 = null;
        }
        String Kl = Kl();
        int videoType = this.LJLJL.getVideoType();
        String eventType = this.LJLJL.getEventType();
        IDetailPageAbility Hl3 = Hl();
        if (Hl3 != null) {
            j = Hl3.aG();
        } else {
            j = -1;
        }
        M89 m89 = this.LJLJL;
        if (aweme2 != null && aweme2.getIsSubAweme()) {
            aweme2 = AwemeService.LIZ().i6(Z9N.LIZIZ.LLLIIIIL(aweme2));
        }
        C50420Jqa c50420Jqa = new C50420Jqa(66, aweme2);
        c50420Jqa.LJLJJI = Kl;
        c50420Jqa.LJLJL = videoType;
        c50420Jqa.LJLJLLL = IWF.LJJLIIIIJ().getCurrentPosition();
        c50420Jqa.LJLL = IWF.LJJLIIIIJ().isPlaying();
        c50420Jqa.LJLJJL = eventType;
        c50420Jqa.LJLJJLL = j;
        IWF.LJJLIIIIJ().LJJIJIL().LIZJ().getWatchedDuration();
        c50420Jqa.LJLJLJ = Jl;
        Bundle bundle = new Bundle();
        if (m89 != null) {
            str = m89.getSearchType();
        }
        bundle.putString("key_search_type", str);
        c50420Jqa.LJLJI = bundle;
        C2U8.LIZ(c50420Jqa);
    }

    @QD3
    public void onScrollToProfileEvent(C224498rV c224498rV) {
        AwemeCommerceStruct commerceVideoAuthInfo;
        AwemeRawAd awemeRawAd;
        User author;
        AwemeRawAd awemeRawAd2;
        Aweme aweme;
        if (c224498rV == null || this.LJLILLLLZI == null || mo49getActivity() == null || c224498rV.LJLIL != mo49getActivity().hashCode() || this.LJLILLLLZI == null) {
            return;
        }
        Aweme aweme2 = this.LJLL;
        if (!C63081OpJ.LJLL(aweme2) || aweme2 == null || (commerceVideoAuthInfo = aweme2.getCommerceVideoAuthInfo()) == null || !commerceVideoAuthInfo.isPersonalPageForbidden()) {
            if (C63081OpJ.LJJLIIIJJI(this.LJLL) && !C63081OpJ.LJJJZ(this.LJLL) && C63081OpJ.LJLJJL(this.LJLL) && !TextUtils.equals("new_ad_fake_user", this.LJLJL.getEventType())) {
                C5S1 c5s1 = new C5S1(getContext());
                c5s1.LIZJ(R.string.b94);
                c5s1.LJ();
                return;
            }
            if (Ll()) {
                LJI();
                return;
            }
            if (mo49getActivity() instanceof InterfaceC229748zy) {
                if (TextUtils.equals(this.LJLL.getAuthor().getUid(), Gl())) {
                    SmartRoute buildRoute = SmartRouter.buildRoute(getContext(), "aweme://user/homepage");
                    buildRoute.withParam("uid", this.LJLL.getAuthorUid());
                    buildRoute.withParam("sec_userid", this.LJLL.getSecAuthorUid());
                    buildRoute.withParam("enter_from", Kl());
                    buildRoute.addFlags(67108864);
                    buildRoute.open();
                    return;
                }
                SmartRoute buildRoute2 = SmartRouter.buildRoute(getContext(), "aweme://user/profile/");
                buildRoute2.withParam("uid", this.LJLL.getAuthorUid());
                buildRoute2.withParam("sec_userid", this.LJLL.getSecAuthorUid());
                buildRoute2.withParam("enter_from", Kl());
                buildRoute2.open();
                return;
            }
            if ((mo49getActivity() instanceof DetailActivity) && "STORY_ENTRANCE_AVATAR".equals(Kl())) {
                SmartRoute buildRoute3 = SmartRouter.buildRoute(getContext(), "aweme://user/profile/");
                buildRoute3.withParam("uid", this.LJLL.getAuthorUid());
                buildRoute3.withParam("sec_userid", this.LJLL.getSecAuthorUid());
                buildRoute3.withParam("enter_from", Kl());
                buildRoute3.open();
                return;
            }
            if (C2049682q.LIZ(this.LJLL) && ((aweme = this.LJLL) == null || aweme.getAuthor() == null || TextUtils.isEmpty(this.LJLL.getAuthor().toString()))) {
                C5S1 c5s12 = new C5S1(getContext());
                c5s12.LIZJ(R.string.i4z);
                c5s12.LJ();
                return;
            }
            Aweme aweme3 = this.LJLL;
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null && aweme3 != null && aweme3.isAd() && (awemeRawAd = aweme3.getAwemeRawAd()) != null) {
                if (C63081OpJ.LLIIL(aweme3) && C63081OpJ.LJLJJL(aweme3) && !C63081OpJ.LJJ(aweme3) && !TextUtils.isEmpty(C63081OpJ.LJJIIZI(aweme3))) {
                    JHI.LIZ().LJIIIIZZ = 40;
                    C73340SqO.LJIJI().getClass();
                    NO5.LJJ(mo49getActivity, aweme3);
                    return;
                }
                if (C63081OpJ.LJLJJL(aweme3) && C63081OpJ.LLJJI(aweme3)) {
                    V9W LJIJI = C73340SqO.LJIJI();
                    String webUrl = aweme3.getAwemeRawAd().getWebUrl();
                    LJIJI.getClass();
                    NOE.LJJIII(mo49getActivity, webUrl);
                    return;
                }
                if (!C63081OpJ.LJJLIIIJLLLLLLLZ(aweme3) && TextUtils.isEmpty(awemeRawAd.getWebUrl()) && C63081OpJ.LJLJJL(aweme3)) {
                    C16880lQ.LLZILL(Toast.makeText(mo49getActivity, R.string.b94, 0));
                    return;
                }
                if (C63081OpJ.LJJLIIIJLLLLLLLZ(aweme3) && C63081OpJ.LJLJJL(aweme3) && !C63081OpJ.LJJ(aweme3) && !C63081OpJ.LJJLIIJ(aweme3)) {
                    if (C63081OpJ.LJJLIIIJLLLLLLLZ(aweme3)) {
                        C73340SqO.LJIJI().getClass();
                        if (NOE.LJJIIJZLJL(mo49getActivity, aweme3)) {
                            return;
                        }
                        C16880lQ.LLZILL(Toast.makeText(mo49getActivity, R.string.b94, 0));
                        return;
                    }
                    C16880lQ.LLZILL(Toast.makeText(mo49getActivity, R.string.b94, 0));
                    return;
                }
            }
            Aweme aweme4 = this.LJLL;
            if (aweme4 != null && aweme4.isAd() && (author = aweme4.getAuthor()) != null && author.isAdFake() && (C63081OpJ.LJI(aweme4) || ((awemeRawAd2 = aweme4.getAwemeRawAd()) != null && awemeRawAd2.isAllowDspAutoJump()))) {
                V9W LJIJI2 = C73340SqO.LJIJI();
                Context context = getContext();
                Aweme aweme5 = this.LJLL;
                LJIJI2.getClass();
                if (NO5.LJIIIZ(context, aweme5)) {
                    return;
                }
            }
            if (wl()) {
                return;
            }
            Aweme aweme6 = this.LJLL;
            if (aweme6 != null && aweme6.isAd()) {
                IMiniAppService LIZIZ = C38499F9b.LIZ.LIZIZ();
                String microAppUrl = this.LJLL.getAwemeRawAd().getMicroAppUrl();
                C227898wz c227898wz = new C227898wz();
                if (C56209M4f.LIZ(microAppUrl) && LIZIZ.openMiniApp(getContext(), microAppUrl, c227898wz)) {
                    return;
                }
            }
            if (C63081OpJ.LJJLIIIJLLLLLLLZ(this.LJLL) && C63081OpJ.LJLJJL(this.LJLL) && !C63081OpJ.LJJ(this.LJLL) && !C63081OpJ.LJJLIIJ(this.LJLL)) {
                V9W LJIJI3 = C73340SqO.LJIJI();
                Context context2 = getContext();
                Aweme aweme7 = this.LJLL;
                LJIJI3.getClass();
                if (NOE.LJJIIJZLJL(context2, aweme7)) {
                    return;
                }
            }
            this.LJLILLLLZI.J1(this.LJLL, c224498rV.LJLILLLLZI);
            return;
        }
        C5S1 c5s13 = new C5S1(getContext());
        c5s13.LIZJ(R.string.b95);
        c5s13.LJ();
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public void onTalentProfileAdEvent(C9G7 c9g7) {
        List<Aweme> list;
        IDetailPageAbility Hl;
        if (c9g7 != null && (list = c9g7.LJLIL) != null && (Hl = Hl()) != null) {
            Hl.wn(list);
        }
    }

    @QD3
    public void receiveJumpToRecord(C54435LXz c54435LXz) {
        this.LJLLILLLL = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "4853673207058105637");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/detail/ui/DetailFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/detail/ui/DetailFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        AnalysisStayTimeFragmentComponent analysisStayTimeFragmentComponent = this.LJLLJ;
        if (analysisStayTimeFragmentComponent != null) {
            analysisStayTimeFragmentComponent.LJLJI = z;
            if (z) {
                analysisStayTimeFragmentComponent.LJLIL = System.currentTimeMillis();
            } else {
                analysisStayTimeFragmentComponent.LIZIZ();
            }
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/detail/ui/DetailFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    public final int Jl(int i, Aweme aweme) {
        if (aweme == null || mo49getActivity() == null || mo49getActivity().isDestroyed()) {
            return i;
        }
        TrendingMixInFlowViewModel trendingMixInFlowViewModel = (TrendingMixInFlowViewModel) JEZ.LIZ(requireActivity().getLifecycle(), TrendingMixInFlowViewModel.class);
        if (!((List) trendingMixInFlowViewModel.LJLJJI.getValue()).contains(Integer.valueOf(i)) || !SearchServiceImpl.LLLZI().LLLIZZ() || trendingMixInFlowViewModel.LJLILLLLZI == null || o.LJ(aweme.getSearchFeedType(), "search_trending_native")) {
            return i;
        }
        List<Aweme> list = trendingMixInFlowViewModel.LJLILLLLZI;
        if (list != null) {
            int indexOf = list.indexOf(aweme);
            if (indexOf == -1) {
                return i;
            }
            if (indexOf < trendingMixInFlowViewModel.LJLIL) {
                return 71;
            }
            return 65280;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void Nl(int i, boolean z) {
        Aweme aweme;
        long j;
        IDetailPageAbility Hl = Hl();
        if (Hl != null) {
            aweme = Hl.O1();
        } else {
            aweme = null;
        }
        String Kl = Kl();
        int videoType = this.LJLJL.getVideoType();
        String eventType = this.LJLJL.getEventType();
        IDetailPageAbility Hl2 = Hl();
        if (Hl2 != null) {
            j = Hl2.Sb();
        } else {
            j = -1;
        }
        C50419JqZ.LIZJ(aweme, Kl, videoType, eventType, j, z, i, this.LJLJL);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        HomePageDataViewModel homePageDataViewModel;
        super.onViewCreated(view, bundle);
        this.LJLJLLL = DataCenter.gv0(ViewModelProviders.of(mo49getActivity()), this);
        this.LJLIL = (C54206LPe) view.findViewById(R.id.ncx);
        this.LJLLL = AdSceneServiceImpl.LJII();
        Bundle arguments = getArguments();
        this.LJLJL = (M89) arguments.getSerializable("feed_param");
        int i = 0;
        arguments.getBoolean("extra_challenge_is_hashtag", false);
        this.LJLJLJ = arguments.getInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", -1);
        this.LLD = arguments.getString("extra_hashtag_tagline", "");
        arguments.putString("com.ss.android.ugc.aweme.intent.extra.FEED_PANEL_SCENE", "DETAIL");
        if (TextUtils.equals("", this.LJLLLLLL) && this.LJLJL.getAid() != null) {
            this.LJLLLLLL = this.LJLJL.getAid();
        }
        String Kl = Kl();
        if (!o.LJ("from_profile_self", Kl) && !o.LJ("from_profile_other", Kl)) {
            o.LJ("from_roaming", Kl);
        }
        String string = arguments.getString("auto_route_schema", "");
        if (!TextUtils.isEmpty(string)) {
            String LJIIJ = M2T.LJIIJ(2, string);
            C39468FeK.LJII(null, true);
            SmartRouter.buildRoute(this, LJIIJ).open();
        }
        this.LJLJI = C84193Sd.LIZ(mo49getActivity());
        this.LJLJJL = C3SZ.LIZ(mo49getActivity());
        C54295LSp Dl = Dl();
        Dl.LIZIZ = new C54319LTn(this);
        if (this.LJLJL.isHotSpot() || MSAdaptionService.LJIIL().LIZIZ(getContext())) {
            this.LJLJJLL = Dl.LIZJ(getChildFragmentManager());
        } else {
            this.LJLJJLL = Dl.LIZJ(getFragmentManager());
        }
        C54206LPe c54206LPe = this.LJLIL;
        if (c54206LPe != null) {
            c54206LPe.setAdapter(this.LJLJJLL);
        }
        C54206LPe c54206LPe2 = this.LJLIL;
        if (c54206LPe2 != null) {
            c54206LPe2.LJFF(new IDiS271S0100000_9(this, 9));
        }
        ScrollSwitchStateManager scrollSwitchStateManager = this.LJLJI;
        if (scrollSwitchStateManager != null) {
            scrollSwitchStateManager.LJLIL.setBridge(new C55405Lon(this));
        }
        C54206LPe c54206LPe3 = this.LJLIL;
        if (c54206LPe3 != null) {
            c54206LPe3.setOnFlingEndListener(new C54318LTm(this));
        }
        ScrollSwitchStateManager scrollSwitchStateManager2 = this.LJLJI;
        if (scrollSwitchStateManager2 != null) {
            ActivityC45651qj owner = mo49getActivity();
            AObserverS77S0100000_9 aObserverS77S0100000_9 = new AObserverS77S0100000_9(this, 49);
            o.LJIIIZ(owner, "owner");
            scrollSwitchStateManager2.LJLLI.observe(owner, aObserverS77S0100000_9);
        }
        ScrollSwitchStateManager scrollSwitchStateManager3 = this.LJLJI;
        ActivityC45651qj owner2 = mo49getActivity();
        AObserverS64S0101000_14 aObserverS64S0101000_14 = new AObserverS64S0101000_14(1, this, 1);
        scrollSwitchStateManager3.getClass();
        o.LJIIIZ(owner2, "owner");
        scrollSwitchStateManager3.LJLJJI.observe(owner2, aObserverS64S0101000_14);
        ScrollSwitchStateManager scrollSwitchStateManager4 = this.LJLJI;
        ActivityC45651qj owner3 = mo49getActivity();
        AObserverS61S0101000_7 aObserverS61S0101000_7 = new AObserverS61S0101000_7(0, this, 2);
        scrollSwitchStateManager4.getClass();
        o.LJIIIZ(owner3, "owner");
        scrollSwitchStateManager4.LJLJJLL.observe(owner3, aObserverS61S0101000_7);
        this.LJLJI.rv0(this, new AObserverS64S0101000_14(0, this, 4));
        ScrollSwitchStateManager scrollSwitchStateManager5 = this.LJLJI;
        ActivityC45651qj owner4 = mo49getActivity();
        AObserverS64S0101000_14 aObserverS64S0101000_142 = new AObserverS64S0101000_14(0, this, 5);
        scrollSwitchStateManager5.getClass();
        o.LJIIIZ(owner4, "owner");
        scrollSwitchStateManager5.LJLLL.observe(owner4, aObserverS64S0101000_142);
        this.LJLILLLLZI = BusinessComponentServiceUtils.newScrollSwitchHelper(mo49getActivity(), this.LJLIL, this.LJLJJLL);
        this.LJZ = new LLO(mo49getActivity());
        this.LJZI = new LLM(mo49getActivity(), this.LJZ);
        this.LJLJJLL.notifyDataSetChanged();
        C3SZ.LIZ(mo49getActivity()).hv0(this.LJLJL.getEventType());
        this.LJLJI.E50("page_feed", false);
        if (this.LJLJL.isChain()) {
            this.LJLJJLL.LJLLI = new QZP();
        }
        LNH.LIZ(mo49getActivity(), this, new C55403Lol(this));
        this.LJLJI.uv0(this.LJZ);
        if (!C2LV.LIZ() && (homePageDataViewModel = this.LJLJJL) != null) {
            homePageDataViewModel.LJLJL.observe(mo49getActivity(), new C57534Mi2(i, this));
        }
        InterfaceC55235Lm3 LIZLLL = C55230Lly.LIZLLL(mo49getActivity(), null);
        this.LJZL = LIZLLL;
        C55096Ljo.LJIIJJI(LIZLLL, this, DetailFlingGestureAbility.class, null);
        if (Al()) {
            AnalysisStayTimeFragmentComponent analysisStayTimeFragmentComponent = new AnalysisStayTimeFragmentComponent(this, true);
            this.LJLLJ = analysisStayTimeFragmentComponent;
            analysisStayTimeFragmentComponent.LJLJJI = new InterfaceC55407Lop() { // from class: X.Lom
                @Override // X.InterfaceC55407Lop
                public final C55406Loo LIZ(C55406Loo c55406Loo) {
                    DetailFragment detailFragment = DetailFragment.this;
                    c55406Loo.LJJLIIIJILLIZJL = detailFragment.LJLJL.getPreviousPage();
                    c55406Loo.LJJLIIIJJI = detailFragment.LJLJL.getUid();
                    c55406Loo.LJJLIIIJ = detailFragment.LJLJL.getFeedsAwemeId();
                    String str = DetailFragment.LLFF.get(detailFragment.LJLJL.getEventType());
                    if (!TextUtils.isEmpty(str)) {
                        c55406Loo.LIZLLL = str;
                    }
                    if (TextUtils.equals(detailFragment.LJLJL.getEventType(), "playlist")) {
                        c55406Loo.LIZLLL = "playlist";
                        c55406Loo.LJJLIIIJLJLI = detailFragment.LJLJL.getPlayListId();
                        c55406Loo.LJJLIIIIJ = detailFragment.LJLJL.getEnterPlaylistGroupId();
                    }
                    return c55406Loo;
                }
            };
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.alf, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
