package com.ss.android.ugc.aweme.story.feed.common;

import X.AKT;
import X.AbstractC222628oU;
import X.AnonymousClass901;
import X.C0IF;
import X.C1DF;
import X.C207668Da;
import X.C210108Mk;
import X.C212748Wo;
import X.C221108m2;
import X.C222038nX;
import X.C222158nj;
import X.C222188nm;
import X.C222368o4;
import X.C222578oP;
import X.C222588oQ;
import X.C2MA;
import X.C2R8;
import X.C50420Jqa;
import X.C53578L1a;
import X.C54838Lfe;
import X.C54947LhP;
import X.C55096Ljo;
import X.C55723Ltv;
import X.C56992Ln;
import X.C62822Ol8;
import X.C70012ov;
import X.C76A;
import X.C78996UzQ;
import X.C92W;
import X.InterfaceC215228cY;
import X.InterfaceC222408o8;
import X.InterfaceC222698ob;
import X.InterfaceC222708oc;
import X.InterfaceC55100Ljs;
import X.InterfaceC57312Mt;
import X.InterfaceC72642tA;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.bottom.BottomToastVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.StoryPlayEventDispatchAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.scope.FeedCollectionScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryPlayerListViewHolder extends VideoViewCell implements CommonCellAbility, StoryPlayEventDispatchAbility {
    public Aweme LLZZ;
    public int LLZZJLIL;
    public boolean LLZZLLIL;
    public final C62822Ol8 LLZZZIL;
    public final C62822Ol8 LLZZZZ;
    public final C62822Ol8 a;

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final int LJLJJLL() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void LLJZIJLIL(String str) {
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.StoryPlayEventDispatchAbility
    public final InterfaceC222708oc OD() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final String gR() {
        return "cell_story";
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        ArrayList arrayList = new ArrayList(super.getScopeDefine());
        arrayList.add(FeedCollectionScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.CommonCellAbility
    public final InterfaceC55100Ljs mi0() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.InterfaceC55219Lln
    public final void ug(Video video) {
    }

    public final VideoPlayViewModel LLLLIIL() {
        return (VideoPlayViewModel) this.LLZZZZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.InterfaceC57312Mt
    public final void J3() {
        InterfaceC57312Mt LJIIIIZZ;
        super.J3();
        C2MA Y6 = Y6();
        if (Y6 != null && (LJIIIIZZ = Y6.LJIIIIZZ()) != null) {
            LJIIIIZZ.J3();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.InterfaceC222408o8
    public final void LJJJJLL() {
        C222038nX c222038nX;
        super.LJJJJLL();
        InterfaceC222698ob interfaceC222698ob = this.LLFF;
        if ((interfaceC222698ob instanceof C222038nX) && (c222038nX = (C222038nX) interfaceC222698ob) != null) {
            int childCount = c222038nX.LJIIJJI().getChildCount();
            for (int i = 0; i < childCount; i++) {
                Object tag = c222038nX.LJIIJJI().getChildAt(i).getTag(R.id.d87);
                if (tag instanceof InterfaceC222408o8) {
                    ((InterfaceC222408o8) tag).LJJJJLL();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void LL() {
        super.LL();
        this.LLLILZ.iv0("on_story_page_selected", this, false);
        this.LLLILZ.iv0("on_story_page_unselected", this, false);
        this.LLLILZ.iv0("on_should_scroll_to_next_user", this, false);
        this.LLLILZ.iv0("ON_STORY_DATA_CHANGED", this, false);
        this.LLLILZ.iv0("on_start_play_animation", this, false);
        this.LLLILZ.iv0("on_stop_play_animation", this, false);
        this.LLLILZ.iv0("on_story_play_progress_changed", this, false);
        this.LLLILZ.iv0("on_story_render_first_frame", this, false);
        this.LLLILZ.iv0("on_story_play_complete_first_time", this, false);
        this.LLLILZ.iv0("on_story_slide_play_complete_first_time", this, false);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.InterfaceC57312Mt
    public final void o2() {
        InterfaceC57312Mt LJIIIIZZ;
        super.o2();
        C2MA Y6 = Y6();
        if (Y6 != null && (LJIIIIZZ = Y6.LJIIIIZZ()) != null) {
            LJIIIIZZ.o2();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C2MA
    public final void onDestroyView() {
        super.onDestroyView();
        C55096Ljo.LJIILL(C55096Ljo.LJIJ(this), CommonCellAbility.class, null);
        C55096Ljo.LJIILL(C55096Ljo.LJIJ(this), StoryPlayEventDispatchAbility.class, null);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void unBind() {
        super.unBind();
        this.LLFF.unBind();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C2MA
    public final Aweme getAweme() {
        return this.LLZZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryPlayerListViewHolder(C222588oQ params) {
        super(params);
        o.LJIIIZ(params, "params");
        this.LLZZZIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 863));
        this.LLZZZZ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 866));
        this.a = C221108m2.LIZIZ(new AqS153S0100000_3(this, 867));
        C55096Ljo.LJIIJJI(C55096Ljo.LJIJ(this), this, CommonCellAbility.class, null);
        C55096Ljo.LJIIJJI(C55096Ljo.LJIJ(this), this, StoryPlayEventDispatchAbility.class, null);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void LIZLLL(Aweme aweme) {
        if (C54838Lfe.LJJ(aweme)) {
            this.LLZZ = aweme;
        }
        super.LIZLLL(aweme);
        C222188nm.LIZ(aweme, new AqS169S0100000_3(this, 420));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void LJLLLL(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        super.LJLLLL(aweme);
        if (C54838Lfe.LJJ(this.LJLLL)) {
            InterfaceC222698ob interfaceC222698ob = this.LLFF;
            Aweme aweme2 = this.LJLLL;
            o.LJI(aweme2);
            interfaceC222698ob.LLLZ(this.LJLLLL, aweme2);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final InterfaceC222698ob LLFFF(C222588oQ params) {
        o.LJIIIZ(params, "params");
        View view = params.LIZ;
        this.LLJILJIL = (ViewGroup) C0IF.LIZIZ(view, this.LLJILJIL, R.id.arz, R.id.nex);
        if (this.LLILZIL == null) {
            this.LLILZIL = (FrameLayout) view.findViewById(R.id.kls);
        }
        FrameLayout mPlayerView = this.LLIZLLLIL;
        o.LJIIIIZZ(mPlayerView, "mPlayerView");
        ViewGroup viewGroup = (ViewGroup) V8("story_progress_bar", false);
        o.LJIIIIZZ(viewGroup, "getStoryProgressBar(view)");
        ViewGroup viewGroup2 = (ViewGroup) V8("story_uploading_bar", false);
        o.LJIIIIZZ(viewGroup2, "getStoryUploadingBar(view)");
        FrameLayout mStroyBubbleListLayout = this.LLILZIL;
        o.LJIIIIZZ(mStroyBubbleListLayout, "mStroyBubbleListLayout");
        InterfaceC215228cY LJIILIIL = C55723Ltv.LIZIZ.LJIJ().LJIILIIL(mPlayerView, this, params, viewGroup, viewGroup2, mStroyBubbleListLayout, this, new AqS169S0100000_3(this, 421));
        o.LJII(LJIILIIL, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView");
        return (InterfaceC222698ob) LJIILIIL;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: LLJJ */
    public final void onChanged(C207668Da c207668Da) {
        String str;
        super.onChanged(c207668Da);
        Object obj = null;
        if (c207668Da == null || (str = c207668Da.LIZ) == null) {
            return;
        }
        switch (str.hashCode()) {
            case -1430777889:
                if (!str.equals("on_story_render_first_frame") || this.LLZZLLIL) {
                    return;
                }
                this.LLZZLLIL = true;
                Aweme aweme = this.LJLLL;
                int i = this.LJLLLL;
                String eventType = getEventType();
                o.LJIIIIZZ(eventType, "getEventType()");
                C212748Wo.LIZ(aweme, i, eventType, this.LJLLLLLL);
                return;
            case -1206738399:
                if (!str.equals("on_story_page_selected")) {
                    return;
                }
                w1();
                Object obj2 = c207668Da.LIZIZ;
                if (obj2 != null) {
                    obj = obj2;
                }
                C70012ov c70012ov = (C70012ov) obj;
                if (!C1DF.LJJ(c70012ov.LJLIL, c70012ov.LJLJL)) {
                    pG();
                }
                this.LLJI.setVisibility(0);
                if (c70012ov.LJLILLLLZI == this.LJLLLL) {
                    this.LLZZJLIL = c70012ov.LJLJI;
                    LIZLLL(c70012ov.LJLIL);
                    o2();
                }
                if (C54838Lfe.LJIILL(c70012ov.LJLIL)) {
                    this.LLJI.setVisibility(4);
                }
                AssemViewModel assemViewModel = (AssemViewModel) this.a.getValue();
                assemViewModel.getClass();
                assemViewModel.setState(new AqS169S0100000_3(c70012ov, 902));
                return;
            case -823113802:
                if (!str.equals("on_stop_play_animation")) {
                    return;
                }
                pG();
                return;
            case -219301751:
                if (!str.equals("ON_STORY_DATA_CHANGED")) {
                    return;
                }
                Object obj3 = c207668Da.LIZIZ;
                if (obj3 != null) {
                    obj = obj3;
                }
                C56992Ln c56992Ln = (C56992Ln) obj;
                Aweme aweme2 = this.LJLLL;
                if (aweme2 == null || !aweme2.isStoryFakeAweme()) {
                    return;
                }
                this.LLZZJLIL = c56992Ln.LJLILLLLZI;
                LIZLLL(c56992Ln.LJLIL);
                return;
            case 43859514:
                if (!str.equals("on_story_page_unselected")) {
                    return;
                }
                BottomToastVM bottomToastVM = (BottomToastVM) this.LLZZZIL.getValue();
                o.LJIIIZ(bottomToastVM, "bottomToastVM");
                AKT akt = bottomToastVM.LJLIL;
                if (akt == null) {
                    return;
                }
                akt.LIZ();
                return;
            case 82319855:
                if (!str.equals("on_story_slide_play_complete_first_time")) {
                    return;
                }
                LLLLIIL().setState(C222368o4.LJLIL);
                return;
            case 1351066273:
                if (!str.equals("on_story_play_complete_first_time")) {
                    return;
                }
                LLLLIIL().setState(C222158nj.LJLIL);
                return;
            case 1529916963:
                if (!str.equals("on_story_play_progress_changed")) {
                    return;
                }
                Object obj4 = c207668Da.LIZIZ;
                if (obj4 != null) {
                    obj = obj4;
                }
                C210108Mk c210108Mk = (C210108Mk) obj;
                if (c210108Mk == null) {
                    return;
                }
                VideoPlayViewModel LLLLIIL = LLLLIIL();
                LLLLIIL.getClass();
                LLLLIIL.setState(new AqS169S0100000_3(c210108Mk, 903));
                return;
            case 2125858838:
                if (!str.equals("on_start_play_animation")) {
                    return;
                }
                LLL();
                return;
            default:
                return;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void l8(int i) {
        boolean z;
        boolean z2;
        Aweme aweme;
        AbstractC222628oU abstractC222628oU;
        super.l8(i);
        InterfaceC222698ob interfaceC222698ob = this.LLFF;
        if ((interfaceC222698ob instanceof C222038nX) && (abstractC222628oU = (AbstractC222628oU) interfaceC222698ob) != null) {
            abstractC222628oU.LJLJJL = i;
        }
        String eventType = getEventType();
        o.LJIIIIZZ(eventType, "getEventType()");
        boolean LJ = o.LJ(this.LJLLILLLL.LJ.param.getFrom(), "STORY_ENTRANCE_AVATAR");
        boolean LJ2 = o.LJ("homepage_follow", eventType);
        boolean LJ3 = o.LJ("homepage_friends", eventType);
        boolean LJ4 = o.LJ("homepage_nearby", eventType);
        boolean LJ5 = o.LJ("homepage_hot", eventType);
        boolean LJJIIZI = C78996UzQ.LJJIIZI(this.LJLLL);
        C53578L1a.LIZ.getClass();
        boolean LIZ = C53578L1a.LIZ();
        if (o.LJ(this.LJLLILLLL.LJ.param.getFrom(), "STORY_ENTRANCE_FEED_TOP_LIST") || o.LJ(this.LJLLILLLL.LJ.param.getFrom(), "STORY_ENTRANCE_FOLLOWING_FEED_TOP_LIST")) {
            z = true;
        } else {
            z = false;
        }
        if (LJ || ((!LJ2 && !LJ3 && !LJ4 && !LJ5) || z)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((C54838Lfe.LJJI(this.LJLLL) || ((aweme = this.LJLLL) != null && aweme.isStoryFakeAweme())) && LJJIIZI && LIZ && z2 && C76A.LIZ()) {
            this.LLILL.setVisibility(4);
        } else {
            this.LLILL.setVisibility(0);
        }
        if (C2R8.LIZ()) {
            Aweme aweme2 = this.LJLLL;
            String eventType2 = getEventType();
            o.LJIIIIZZ(eventType2, "getEventType()");
            PopupManager.LJIIL(new C54947LhP(aweme2, eventType2, new AqS153S0100000_3(this, 864), new AqS153S0100000_3(this, 865)));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, androidx.lifecycle.Observer
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        onChanged((C207668Da) obj);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C2MA
    public final void t7(boolean z) {
        super.t7(z);
        this.LLFF.Zo(z);
        this.LLZZLLIL = false;
        C222578oP.LIZ = "slide";
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.CommonCellAbility
    public final void t70(InterfaceC222698ob baseFeedPlayerView) {
        o.LJIIIZ(baseFeedPlayerView, "baseFeedPlayerView");
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void L8(int i, String storyAid) {
        o.LJIIIZ(storyAid, "storyAid");
        this.LLFF.KJ(i, storyAid);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void LLLZ(int i, Aweme aweme) {
        super.LLLZ(i, aweme);
        this.LLJI.setVisibility(0);
        this.LLIIII.setVisibility(8);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void r5(int i, int i2) {
        super.r5(i, i2);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void LJLZ(Aweme aweme, int i, boolean z) {
        VideoItemParams videoItemParams = this.LJLLJ;
        if (videoItemParams != null) {
            videoItemParams.storyPosition = this.LLZZJLIL;
        }
        super.LJLZ(aweme, i, z);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final AnonymousClass901 LLFII(View view, InterfaceC72642tA<C50420Jqa> interfaceC72642tA, Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        return new C92W();
    }
}
