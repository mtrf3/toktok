package com.ss.android.ugc.aweme.detail.ui;

import X.ActivityC45651qj;
import X.C00F;
import X.C03880Dg;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C29S;
import X.C2K0;
import X.C3C5;
import X.C47261Igj;
import X.C51697KQr;
import X.C54081LKj;
import X.C54082LKk;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55359Lo3;
import X.C55457Lpd;
import X.C55723Ltv;
import X.C56319M8l;
import X.C5H3;
import X.C65300Pk0;
import X.C76800UCe;
import X.C90903hW;
import X.HG3;
import X.InterfaceC55643Lsd;
import X.InterfaceC56322M8o;
import X.KQ5;
import X.KQK;
import X.KR8;
import X.KRB;
import X.M89;
import X.ORZ;
import X.RBX;
import X.Z9N;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.detail.panel.AddVideoPreviewPanel;
import com.ss.android.ugc.aweme.detail.panel.AnalyticsDetailPanel;
import com.ss.android.ugc.aweme.detail.panel.CreativeHubPanel;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.detail.panel.DuetDiscoverPanel;
import com.ss.android.ugc.aweme.detail.panel.EffectDiscoverPanel;
import com.ss.android.ugc.aweme.detail.panel.LibraryFeedPanel;
import com.ss.android.ugc.aweme.detail.panel.MovieFeedPanel;
import com.ss.android.ugc.aweme.detail.panel.PaidContentVideoPanel;
import com.ss.android.ugc.aweme.detail.panel.PoiCollectPanel;
import com.ss.android.ugc.aweme.detail.panel.PublishVideoPreviewPanel;
import com.ss.android.ugc.aweme.detail.panel.QuestionFeedPanel;
import com.ss.android.ugc.aweme.detail.panel.ReplyMessagePanel;
import com.ss.android.ugc.aweme.detail.panel.StickerButtonPanel;
import com.ss.android.ugc.aweme.detail.panel.StickerFeedPanel;
import com.ss.android.ugc.aweme.detail.panel.StoryMixedFeedDetailPanel;
import com.ss.android.ugc.aweme.detail.panel.TTSVoiceButtonPanel;
import com.ss.android.ugc.aweme.detail.panel.UnifyMETStickerFeedPanel;
import com.ss.android.ugc.aweme.detail.panel.VoiceConversionButtonPanel;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.fragment.detail.DetailComponentFragment;
import com.ss.android.ugc.feed.platform.panel.RootPanelComponent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class DetailPageFragment extends DetailComponentFragment implements InterfaceC56322M8o {
    public DetailFragmentPanel LJLJI;
    public DetailPageComponent LJLJJLL;
    public Map<Integer, View> LJLJLJ = new LinkedHashMap();
    public M89 LJLJJI = new M89();
    public final C5H3 LJLJJL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 49));
    public final C5H3 LJLJL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 89));

    @Override // com.ss.android.ugc.feed.platform.fragment.detail.DetailComponentFragment, com.ss.android.ugc.aweme.base.ui.CommonPageFragment
    public void _$_clearFindViewByIdCache() {
        this.LJLJLJ.clear();
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.detail.DetailComponentFragment, com.ss.android.ugc.aweme.base.ui.CommonPageFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLJLJ;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC55643Lsd
    public String getSceneId() {
        return "detail_page";
    }

    @Override // X.InterfaceC56322M8o
    public boolean needConflictWithParent() {
        return true;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return Dl(this, layoutInflater, viewGroup, bundle);
    }

    private final DetailFragmentPanel Il() {
        if (this.LJLJI == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                initArguments(arguments);
            } else {
                this.LJLJJI.setEventType("");
            }
            this.LJLJI = Hl();
        }
        return this.LJLJI;
    }

    private final DetailPageComponent Ll() {
        return (DetailPageComponent) this.LJLJL.getValue();
    }

    private final DetailPageComponent Nl() {
        if (this.LJLJJLL == null) {
            if (!KQ5.LIZ()) {
                this.LJLJJLL = Ll();
            } else {
                DetailPageComponent detailPageComponent = null;
                C2K0 LIZ = C55096Ljo.LIZ(C55230Lly.LIZJ(this, null), IFeedFragmentAbility.class, null);
                if (!(LIZ instanceof IDetailPageAbility)) {
                    LIZ = null;
                }
                IDetailPageAbility iDetailPageAbility = (IDetailPageAbility) LIZ;
                if (iDetailPageAbility instanceof DetailPageComponent) {
                    detailPageComponent = (DetailPageComponent) iDetailPageAbility;
                }
                this.LJLJJLL = detailPageComponent;
            }
        }
        return this.LJLJJLL;
    }

    public DetailPageComponent Gl() {
        return new DetailPageComponent();
    }

    public DetailFragmentPanel Hl() {
        Object obj;
        Music music;
        boolean z;
        NewFaceStickerBean newFaceStickerBean;
        M89 param = this.LJLJJI;
        Bundle arguments = getArguments();
        o.LJIIIZ(param, "param");
        String eventType = param.getEventType();
        if (eventType == null) {
            eventType = "";
        }
        Serializable serializable = null;
        if (arguments != null) {
            obj = C16880lQ.LLJJIII(arguments, "feed_data_music");
        } else {
            obj = null;
        }
        if (obj instanceof Music) {
            music = (Music) obj;
        } else {
            music = null;
        }
        if (o.LJ(param.getFrom(), "from_publish_add_video")) {
            String aid = param.getAid();
            o.LJI(aid);
            String creditVideoAuthorUid = param.getCreditVideoAuthorUid();
            o.LJI(creditVideoAuthorUid);
            return new AddVideoPreviewPanel(aid, creditVideoAuthorUid);
        }
        if (param.isFromEffectDiscoverTab()) {
            return new EffectDiscoverPanel();
        }
        if (param.isFromEffectDiscoverPanel()) {
            return new EffectDiscoverPanel();
        }
        if (o.LJ(eventType, "sticker_profile_detail")) {
            return new StickerButtonPanel();
        }
        if (ujb.o.LJJJLIIL(eventType, "cvh_", false)) {
            return new CreativeHubPanel(param);
        }
        if (C55359Lo3.LIZ() && param.getShowAnswerQuestionButton() == 1) {
            return new QuestionFeedPanel(arguments);
        }
        if (C55359Lo3.LIZ() && o.LJ(eventType, "single_song") && !CommerceMediaServiceImpl.LIZJ().LJIILLIIL(music)) {
            return new DetailFragmentPanel(param);
        }
        if (C55359Lo3.LIZ() && (o.LJ(eventType, "mv_page") || o.LJ(eventType, "jianying_mv_page"))) {
            return new MovieFeedPanel(arguments);
        }
        if (C55359Lo3.LIZ() && o.LJ(eventType, "prop_page")) {
            if (C00F.LIZ(31744, 0, "unify_met_detail_page", true) == 1) {
                if (arguments != null) {
                    String string = arguments.getString("extra_sticker_from");
                    if (string == null || string.hashCode() != -1657748413 || !string.equals("from_sticker_master_profile")) {
                        serializable = arguments.getSerializable("feed_data_sticker_model");
                    }
                }
                List list = (List) serializable;
                if (list != null && (!list.isEmpty()) && (newFaceStickerBean = (NewFaceStickerBean) ListProtector.get(list, 0)) != null && newFaceStickerBean.mobileEffectTemplate != null) {
                    return new UnifyMETStickerFeedPanel(arguments);
                }
            }
            return new StickerFeedPanel(arguments);
        }
        if (C55359Lo3.LIZ() && o.LJ(eventType, "library_detail_page")) {
            return new LibraryFeedPanel(arguments);
        }
        if (ORZ.LJLJJI(param.getEventType(), C47261Igj.LJJIJIIJI("personal_homepage", "others_homepage")) && param.getVideoType() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (C55723Ltv.LIZIZ.LJIIJ() && (z || param.isStoryPage())) {
            return new StoryMixedFeedDetailPanel(param);
        }
        if (o.LJ(param.getFrom(), "from_chat") || o.LJ(param.getFrom(), "from_auto_message")) {
            return new ReplyMessagePanel(arguments, param);
        }
        if (o.LJ(param.getFrom(), "from_duet_mode") || o.LJ(param.getFrom(), "from_duet_mode_detail")) {
            return new DuetDiscoverPanel(param);
        }
        if (C55359Lo3.LIZ() && o.LJ(param.getFrom(), "from_tts_page")) {
            return new TTSVoiceButtonPanel(arguments);
        }
        if (C55359Lo3.LIZ() && o.LJ(param.getFrom(), "from_voice_conversion_page")) {
            return new VoiceConversionButtonPanel(arguments);
        }
        if (o.LJ(param.getFrom(), "POI_VIDEO_LIST_ENTRANCE") && (arguments == null || arguments.getBoolean("poi_collect_bottom_bar"))) {
            return new PoiCollectPanel(arguments, param);
        }
        if (o.LJ(param.getFrom(), "from_paid_collection") || o.LJ(param.getFrom(), "from_paid_content_detail_video_list_entrance")) {
            return new PaidContentVideoPanel(arguments, param);
        }
        if (o.LJ(param.getFrom(), "from_analytics_detail")) {
            return new AnalyticsDetailPanel(arguments, param);
        }
        if (o.LJ(param.getFrom(), "from_publishing_video")) {
            return new PublishVideoPreviewPanel(param);
        }
        return new DetailFragmentPanel(param);
    }

    public final View Jl() {
        return (View) this.LJLJJL.getValue();
    }

    public List<InterfaceC55643Lsd> Kl() {
        return new ArrayList();
    }

    public void Pl() {
        M89 m89;
        Music music;
        String str;
        String str2;
        String str3;
        Bundle arguments;
        if (o.LJ(this.LJLJJI.getFrom(), "from_publishing_video") && (arguments = getArguments()) != null) {
            arguments.putString("com.ss.android.ugc.aweme.intent.extra.FEED_PANEL_SCENE", "PUBLISH_PREVIEW");
        }
        Bundle arguments2 = getArguments();
        if (arguments2 == null) {
            return;
        }
        Serializable serializable = arguments2.getSerializable("feed_param");
        String str4 = null;
        if (serializable instanceof M89) {
            m89 = (M89) serializable;
        } else {
            m89 = null;
        }
        Object LLJJIII = C16880lQ.LLJJIII(arguments2, "feed_data_music");
        if (LLJJIII instanceof Music) {
            music = (Music) LLJJIII;
        } else {
            music = null;
        }
        if (!((RBX) HG3.LJIILL()).isLogin() || ((RBX) HG3.LJIILL()).getCurUser().getCommerceUserLevel() <= 0) {
            if (m89 != null) {
                str = m89.getEventType();
            } else {
                str = null;
            }
            if (o.LJ(str, "single_song") && !CommerceMediaServiceImpl.LIZJ().LJIILLIIL(music)) {
                arguments2.putString("com.ss.android.ugc.aweme.intent.extra.FEED_PANEL_SCENE", "DETAIL_MUSIC");
            }
        }
        Z9N z9n = Z9N.LIZIZ;
        if (m89 != null) {
            str2 = m89.getEventType();
        } else {
            str2 = null;
        }
        if (z9n.LJJIIZI(str2)) {
            arguments2.putString("com.ss.android.ugc.aweme.intent.extra.FEED_PANEL_SCENE", "DETAIL_SEARCH_FILTER");
        }
        if (m89 != null) {
            str3 = m89.getFrom();
        } else {
            str3 = null;
        }
        if (o.LJ(str3, "from_ecom_search")) {
            arguments2.putString("com.ss.android.ugc.aweme.intent.extra.FEED_PANEL_SCENE", "DETAIL_ECOM_SEARCH");
        }
        if (m89 != null) {
            str4 = m89.getEventType();
        }
        if (!o.LJ(str4, "offline_mode_page")) {
            return;
        }
        arguments2.putString("com.ss.android.ugc.aweme.intent.extra.FEED_PANEL_SCENE", "SCENE_DETAIL_OFFLINE_MODE");
    }

    public final IDetailPageAbility Ml() {
        return Nl();
    }

    public final KQK Ol() {
        DetailPageComponent lk;
        IDetailPageAbility Ml = Ml();
        if (Ml != null && (lk = Ml.lk()) != null) {
            return lk;
        }
        "Required value was null.".toString();
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC55643Lsd
    public C54082LKk getPopupContext() {
        Context context = getContext();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (context != null && mo49getActivity != null) {
            return C54081LKj.LIZ(context, mo49getActivity);
        }
        return null;
    }

    @Override // X.InterfaceC55643Lsd
    public boolean isSceneActive() {
        return getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        IDetailPageAbility Ml = Ml();
        if (Ml != null) {
            Ml.onDestroy();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.detail.DetailComponentFragment, com.ss.android.ugc.aweme.base.ui.CommonPageFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C55457Lpd.LIZ(this);
        IDetailPageAbility Ml = Ml();
        if (Ml != null) {
            Ml.onDestroyView();
        }
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        IDetailPageAbility Ml = Ml();
        if (Ml != null) {
            Ml.onPause();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        IDetailPageAbility Ml = Ml();
        if (Ml != null) {
            Ml.onResume();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment
    public SparseArray<KRB> registerComponents() {
        SparseArray<KRB> registerComponents = super.registerComponents();
        o.LJIIIIZZ(registerComponents, "super.registerComponents()");
        registerComponents.append(C51697KQr.LIZJ, Il());
        return registerComponents;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.CommonPageFragment
    public boolean vl() {
        IDetailPageAbility Ml = Ml();
        if (Ml != null) {
            return Ml.oZ(new AqS159S0100000_9(this, 90));
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.fragment.detail.DetailComponentFragment
    public Object wl() {
        return Ll();
    }

    public InterfaceC55643Lsd Ql() {
        return C56319M8l.LJLIL;
    }

    private final void initArguments(Bundle bundle) {
        M89 m89 = (M89) bundle.getSerializable("feed_param");
        if (m89 != null) {
            this.LJLJJI = m89;
        }
    }

    public static final /* synthetic */ boolean xl(DetailPageFragment detailPageFragment) {
        return super.vl();
    }

    public final void Rl(M89 m89) {
        o.LJIIIZ(m89, "<set-?>");
        this.LJLJJI = m89;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        o.LJIIIZ(activity, "activity");
        Pl();
        KR8.LJIIIIZZ(this);
        super.onAttach(activity);
        RootPanelComponent LIZIZ = KR8.LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.j(activity, this);
        }
        IDetailPageAbility Ml = Ml();
        if (Ml != null) {
            Ml.onAttach(activity);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RootPanelComponent LIZIZ = KR8.LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.N1(bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        IDetailPageAbility Ml;
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "2797971414482082388");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/detail/ui/DetailPageFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/detail/ui/DetailPageFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        Il();
        super.setUserVisibleHint(z);
        if ((!KQ5.LIZ() || isAdded()) && (Ml = Ml()) != null) {
            Ml.setUserVisibleHint(z);
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/detail/ui/DetailPageFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        RootPanelComponent LIZIZ = KR8.LIZIZ(this);
        if (LIZIZ != null) {
            LIZIZ.LJJJJI(view, bundle);
        }
        IDetailPageAbility Ml = Ml();
        if (Ml != null) {
            Ml.onViewCreated(view, bundle);
        }
    }

    public View Al(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        IDetailPageAbility Ml = Ml();
        if (Ml != null) {
            return Ml.onCreateView(inflater, viewGroup, bundle);
        }
        return null;
    }

    public static View Dl(DetailPageFragment detailPageFragment, LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View Al = detailPageFragment.Al(inflater, viewGroup, bundle);
        C29S c29s = null;
        if (!(Al instanceof View)) {
            Al = null;
        }
        if (Al != null) {
            try {
                ViewTreeLifecycleOwner.set(Al, detailPageFragment.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(Al, detailPageFragment);
                C10A.LIZIZ(Al, detailPageFragment);
                ActivityC45651qj mo49getActivity = detailPageFragment.mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return Al;
    }
}
