package com.ss.android.ugc.aweme.story.feed.common.newarch;

import X.AKT;
import X.AnonymousClass901;
import X.C0IF;
import X.C1DF;
import X.C210108Mk;
import X.C221108m2;
import X.C221138m5;
import X.C222198nn;
import X.C222358o3;
import X.C222578oP;
import X.C222588oQ;
import X.C222668oY;
import X.C222688oa;
import X.C2K9;
import X.C2MA;
import X.C2R8;
import X.C50420Jqa;
import X.C53578L1a;
import X.C54838Lfe;
import X.C54947LhP;
import X.C55096Ljo;
import X.C56992Ln;
import X.C62822Ol8;
import X.C70012ov;
import X.C76A;
import X.C78996UzQ;
import X.C80766Vms;
import X.C92W;
import X.IPG;
import X.IPH;
import X.IQE;
import X.IT4;
import X.InterfaceC222408o8;
import X.InterfaceC222698ob;
import X.InterfaceC222708oc;
import X.InterfaceC55100Ljs;
import X.InterfaceC55235Lm3;
import X.InterfaceC57312Mt;
import X.InterfaceC72642tA;
import X.KR8;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.bottom.BottomToastVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.FeedCollectionPlayerViewAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.FeedCollectionViewPagerAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.StoryCollectionCellAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.StoryPlayEventDispatchAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.scope.FeedCollectionScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryPlayerListViewHolderV2 extends VideoViewCell implements StoryCollectionCellAbility, StoryPlayEventDispatchAbility, CommonCellAbility, C2K9 {
    public final InterfaceC55235Lm3 LLZZ;
    public Aweme LLZZJLIL;
    public int LLZZLLIL;
    public final C221138m5 LLZZZIL;
    public final C62822Ol8 LLZZZZ;
    public final C62822Ol8 a;
    public final C62822Ol8 b;
    public final C62822Ol8 c;

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

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.StoryCollectionCellAbility
    public final C2MA jX() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.CommonCellAbility
    public final InterfaceC55100Ljs mi0() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.InterfaceC55219Lln
    public final void ug(Video video) {
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.StoryCollectionCellAbility
    public final ViewGroup KM() {
        FrameLayout mStroyBubbleListLayout = this.LLILZIL;
        o.LJIIIIZZ(mStroyBubbleListLayout, "mStroyBubbleListLayout");
        return mStroyBubbleListLayout;
    }

    public final FeedCollectionViewPagerAbility LLLLIIL() {
        return (FeedCollectionViewPagerAbility) this.LLZZZIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.InterfaceC222708oc
    public final void F5() {
        InterfaceC222708oc interfaceC222708oc;
        LLL();
        C2MA Y6 = Y6();
        if ((Y6 instanceof InterfaceC222708oc) && (interfaceC222708oc = (InterfaceC222708oc) Y6) != null) {
            interfaceC222708oc.F5();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final IQE I7() {
        IQE I7;
        C2MA Y6 = Y6();
        if (Y6 == null || (I7 = Y6.I7()) == null) {
            return IQE.INITIALIZED;
        }
        return I7;
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
        ViewGroup viewGroup;
        super.LJJJJLL();
        FeedCollectionViewPagerAbility LLLLIIL = LLLLIIL();
        View view = null;
        if (LLLLIIL != null) {
            view = LLLLIIL.getView();
        }
        if (!(view instanceof C80766Vms) || (viewGroup = (ViewGroup) view) == null) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Object tag = viewGroup.getChildAt(i).getTag(R.id.d87);
            if (tag instanceof InterfaceC222408o8) {
                ((InterfaceC222408o8) tag).LJJJJLL();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C2MA
    public final InterfaceC222708oc LLLJ() {
        if (C1DF.LJJIII(getCurrentAweme())) {
            return (C222668oY) this.c.getValue();
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void O7() {
        C2MA Y6 = Y6();
        if (Y6 != null) {
            Y6.O7();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final C2MA Y6() {
        FeedCollectionViewPagerAbility LLLLIIL = LLLLIIL();
        if (LLLLIIL != null) {
            return LLLLIIL.getCurViewHolder();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final boolean f9() {
        C2MA Y6 = Y6();
        if (Y6 != null) {
            return Y6.f9();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C2MA
    public final int getAwemeType() {
        C2MA Y6 = Y6();
        if (Y6 != null) {
            return Y6.getAwemeType();
        }
        Aweme aweme = this.LJLLL;
        if (aweme != null) {
            return aweme.getAwemeType();
        }
        return 40;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA, X.InterfaceC54061LJp
    public final Aweme getCurrentAweme() {
        Aweme aweme;
        C2MA Y6 = Y6();
        if (Y6 == null || (aweme = Y6.getAweme()) == null) {
            Aweme aweme2 = this.LJLLL;
            if (aweme2 == null) {
                return this.LLZZJLIL;
            }
            return aweme2;
        }
        return aweme;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.InterfaceC222708oc
    public final void n() {
        InterfaceC222708oc interfaceC222708oc;
        super.n();
        C2MA Y6 = Y6();
        if ((Y6 instanceof InterfaceC222708oc) && (interfaceC222708oc = (InterfaceC222708oc) Y6) != null) {
            interfaceC222708oc.n();
        }
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
        InterfaceC55235Lm3 interfaceC55235Lm3 = this.LLZZ;
        if (interfaceC55235Lm3 != null) {
            C55096Ljo.LJIILL(interfaceC55235Lm3, StoryCollectionCellAbility.class, null);
            C55096Ljo.LJIILL(interfaceC55235Lm3, StoryPlayEventDispatchAbility.class, null);
            C55096Ljo.LJIILL(interfaceC55235Lm3, CommonCellAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final boolean q7() {
        C2MA Y6 = Y6();
        if (Y6 != null) {
            return Y6.q7();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final boolean u7() {
        C2MA Y6 = Y6();
        if (Y6 != null) {
            return Y6.u7();
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C2MA
    public final void w1() {
        super.w1();
        C2MA Y6 = Y6();
        if (Y6 != null) {
            Y6.w1();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final Aweme O1() {
        return this.LLZZJLIL;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.StoryCollectionCellAbility
    public final Aweme ct0() {
        return this.LLZZJLIL;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C2MA
    public final Aweme getAweme() {
        return this.LLZZJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryPlayerListViewHolderV2(C222588oQ params) {
        super(params);
        o.LJIIIZ(params, "params");
        this.LLZZZIL = KR8.LJIIJJI(new AqS153S0100000_3(this, 879));
        this.LLZZZZ = C221108m2.LIZIZ(new AqS153S0100000_3(params, 873));
        this.a = C221108m2.LIZIZ(new AqS153S0100000_3(this, 878));
        this.b = C221108m2.LIZIZ(new AqS153S0100000_3(this, 877));
        this.c = C221108m2.LIZIZ(new AqS153S0100000_3(this, 874));
        InterfaceC55235Lm3 LJIJ = C55096Ljo.LJIJ(this);
        C55096Ljo.LJIIJJI(LJIJ, this, StoryCollectionCellAbility.class, null);
        C55096Ljo.LJIIJJI(LJIJ, this, StoryPlayEventDispatchAbility.class, null);
        C55096Ljo.LJIIJJI(LJIJ, this, CommonCellAbility.class, null);
        this.LLZZ = LJIJ;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void C7(View.OnTouchListener onTouchListener) {
        C2MA Y6 = Y6();
        if (Y6 != null) {
            Y6.C7(onTouchListener);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.InterfaceC222708oc
    public final void G60(int i) {
        InterfaceC222708oc interfaceC222708oc;
        C2MA Y6 = Y6();
        if ((Y6 instanceof InterfaceC222708oc) && (interfaceC222708oc = (InterfaceC222708oc) Y6) != null) {
            interfaceC222708oc.G60(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.StoryCollectionCellAbility
    public final void GH(C56992Ln c56992Ln) {
        Aweme aweme = this.LJLLL;
        if (aweme != null && aweme.isStoryFakeAweme()) {
            this.LLZZLLIL = c56992Ln.LJLILLLLZI;
            LIZLLL(c56992Ln.LJLIL);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void LIZLLL(Aweme aweme) {
        if (C54838Lfe.LJJ(aweme)) {
            this.LLZZJLIL = aweme;
        }
        super.LIZLLL(aweme);
        C222198nn.LIZ(aweme, new AqS169S0100000_3(this, 428));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C2MA
    public final void LJJIII(int i) {
        C2MA Y6;
        super.LJJIII(i);
        if (i != 1 && i != 6 && (Y6 = Y6()) != null) {
            Y6.LJJIII(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C2MA
    public final void LJJIJIIJIL(int i) {
        C2MA Y6;
        super.LJJIJIIJIL(i);
        if ((i != 1 && i != 2) || (Y6 = Y6()) == null) {
            return;
        }
        Y6.LJJIJIIJIL(i);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final InterfaceC222698ob LLFFF(C222588oQ params) {
        o.LJIIIZ(params, "params");
        View view = params.LIZ;
        this.LLJILJIL = (ViewGroup) C0IF.LIZIZ(view, this.LLJILJIL, R.id.arz, R.id.nex);
        if (this.LLILZIL == null) {
            this.LLILZIL = (FrameLayout) view.findViewById(R.id.kls);
        }
        FeedCollectionPlayerViewAbility feedCollectionPlayerViewAbility = (FeedCollectionPlayerViewAbility) C55096Ljo.LIZ(C55096Ljo.LJIJ(this), FeedCollectionPlayerViewAbility.class, null);
        if (feedCollectionPlayerViewAbility == null) {
            return null;
        }
        return feedCollectionPlayerViewAbility.LLJJIJIL();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final Aweme LLIIIILZ(int i) {
        if (C54838Lfe.LJJ(this.LJLLL)) {
            return getCurrentAweme();
        }
        return super.LLIIIILZ(i);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.InterfaceC222708oc
    public final void Y2(Aweme aweme) {
        InterfaceC222708oc interfaceC222708oc;
        super.Y2(aweme);
        C2MA Y6 = Y6();
        if ((Y6 instanceof InterfaceC222708oc) && (interfaceC222708oc = (InterfaceC222708oc) Y6) != null) {
            interfaceC222708oc.Y2(aweme);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.StoryCollectionCellAbility
    public final void eR(C70012ov c70012ov) {
        w1();
        if (!C1DF.LJJ(c70012ov.LJLIL, c70012ov.LJLJL)) {
            pG();
        }
        this.LLJI.setVisibility(0);
        if (c70012ov.LJLILLLLZI == this.LJLLLL) {
            this.LLZZLLIL = c70012ov.LJLJI;
            LIZLLL(c70012ov.LJLIL);
            o2();
        }
        if (C54838Lfe.LJIILL(c70012ov.LJLIL)) {
            this.LLJI.setVisibility(4);
        }
        AssemViewModel assemViewModel = (AssemViewModel) this.a.getValue();
        assemViewModel.getClass();
        assemViewModel.setState(new AqS169S0100000_3(c70012ov, 902));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final C2MA getViewHolderByAwemeId(String str) {
        C2MA c2ma;
        FeedCollectionViewPagerAbility LLLLIIL = LLLLIIL();
        C2MA c2ma2 = null;
        if (LLLLIIL != null) {
            c2ma = LLLLIIL.getViewHolderByAwemeId(str);
        } else {
            c2ma = null;
        }
        FeedCollectionViewPagerAbility LLLLIIL2 = LLLLIIL();
        if (LLLLIIL2 != null) {
            c2ma2 = LLLLIIL2.getCurViewHolder();
        }
        if (o.LJ(c2ma, c2ma2) && c2ma2 != null) {
            return this;
        }
        return c2ma;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.StoryCollectionCellAbility
    public final void hY(C70012ov c70012ov) {
        BottomToastVM bottomToastVM = (BottomToastVM) this.LLZZZZ.getValue();
        o.LJIIIZ(bottomToastVM, "bottomToastVM");
        AKT akt = bottomToastVM.LJLIL;
        if (akt != null) {
            akt.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void l8(int i) {
        boolean z;
        boolean z2;
        Aweme item;
        Aweme aweme;
        super.l8(i);
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
        C2MA Y6 = Y6();
        if (Y6 != null) {
            Y6.l8(i);
        }
        FeedCollectionViewPagerAbility LLLLIIL = LLLLIIL();
        if (LLLLIIL != null) {
            int LLILL = LLLLIIL.LLILL();
            FeedCollectionViewPagerAbility LLLLIIL2 = LLLLIIL();
            if (LLLLIIL2 == null || (item = LLLLIIL2.getItem(LLILL)) == null) {
                return;
            }
            C222198nn.LIZ(item, new AqS169S0100000_3(this, 429));
            if (!C2R8.LIZ()) {
                return;
            }
            String eventType2 = getEventType();
            o.LJIIIIZZ(eventType2, "getEventType()");
            PopupManager.LJIIL(new C54947LhP(item, eventType2, new AqS153S0100000_3(this, 875), new AqS153S0100000_3(this, 876)));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
        OnUIPlayListener onUIPlayListener;
        C2MA Y6 = Y6();
        if ((Y6 instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) Y6) != null) {
            onUIPlayListener.onBuffering(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        OnUIPlayListener onUIPlayListener;
        super.onPausePlay(str);
        C2MA Y6 = Y6();
        if ((Y6 instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) Y6) != null) {
            onUIPlayListener.onPausePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        OnUIPlayListener onUIPlayListener;
        super.onPlayCompleted(str);
        C2MA Y6 = Y6();
        if ((Y6 instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) Y6) != null) {
            onUIPlayListener.onPlayCompleted(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        OnUIPlayListener onUIPlayListener;
        super.onPlayCompletedFirstTime(str);
        C2MA Y6 = Y6();
        if ((Y6 instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) Y6) != null) {
            onUIPlayListener.onPlayCompletedFirstTime(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(IPG ipg) {
        OnUIPlayListener onUIPlayListener;
        LLJJJJ(3);
        C2MA Y6 = Y6();
        if ((Y6 instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) Y6) != null) {
            onUIPlayListener.onPlayFailed(ipg);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
        OnUIPlayListener onUIPlayListener;
        super.onPlayProgressChange(f);
        C2MA Y6 = Y6();
        if ((Y6 instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) Y6) != null) {
            onUIPlayListener.onPlayProgressChange(f);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        OnUIPlayListener onUIPlayListener;
        super.onPreparePlay(str);
        C2MA Y6 = Y6();
        if ((Y6 instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) Y6) != null) {
            onUIPlayListener.onPreparePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(IT4 it4) {
        OnUIPlayListener onUIPlayListener;
        super.onRenderFirstFrame(it4);
        C2MA Y6 = Y6();
        if ((Y6 instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) Y6) != null) {
            onUIPlayListener.onRenderFirstFrame(it4);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(IPH iph) {
        OnUIPlayListener onUIPlayListener;
        super.onRenderReady(iph);
        C2MA Y6 = Y6();
        if ((Y6 instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) Y6) != null) {
            onUIPlayListener.onRenderReady(iph);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        OnUIPlayListener onUIPlayListener;
        super.onResumePlay(str);
        C2MA Y6 = Y6();
        if ((Y6 instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) Y6) != null) {
            onUIPlayListener.onResumePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(IPG ipg) {
        OnUIPlayListener onUIPlayListener;
        C2MA Y6 = Y6();
        if ((Y6 instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) Y6) != null) {
            onUIPlayListener.onRetryOnError(ipg);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C2MA
    public final void t7(boolean z) {
        super.t7(z);
        C222578oP.LIZ = "slide";
        C2MA Y6 = Y6();
        if (Y6 != null) {
            Y6.t7(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.CommonCellAbility
    public final void t70(InterfaceC222698ob baseFeedPlayerView) {
        o.LJIIIZ(baseFeedPlayerView, "baseFeedPlayerView");
        if (this.LLFF == null) {
            this.LLFF = baseFeedPlayerView;
            LLFZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void L8(int i, String storyAid) {
        o.LJIIIZ(storyAid, "storyAid");
        FeedCollectionViewPagerAbility LLLLIIL = LLLLIIL();
        if (LLLLIIL != null) {
            LLLLIIL.E00(storyAid);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.InterfaceC47667InH
    public final void LJJL(int i, int i2) {
        ((AssemViewModel) this.b.getValue()).setState(C222358o3.LJLIL);
        this.LLJLLL = true;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void LLLZ(int i, Aweme aweme) {
        super.LLLZ(i, aweme);
        RelativeLayout relativeLayout = this.LLJI;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        View view = this.LLIIII;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.LLIFFJFJJ;
        if (view2 == null) {
            return;
        }
        view2.setVisibility(8);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z) {
        OnUIPlayListener onUIPlayListener;
        super.onSeekEnd(str, z);
        C2MA Y6 = Y6();
        if ((Y6 instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) Y6) != null) {
            onUIPlayListener.onSeekEnd(str, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSpeedChanged(String str, float f) {
        OnUIPlayListener onUIPlayListener;
        super.onSpeedChanged(str, f);
        C2MA Y6 = Y6();
        if ((Y6 instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) Y6) != null) {
            onUIPlayListener.onSpeedChanged(str, f);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void LJLZ(Aweme aweme, int i, boolean z) {
        VideoItemParams videoItemParams = this.LJLLJ;
        if (videoItemParams != null) {
            videoItemParams.storyPosition = this.LLZZLLIL;
        }
        super.LJLZ(aweme, i, z);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final AnonymousClass901 LLFII(View view, InterfaceC72642tA<C50420Jqa> interfaceC72642tA, Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        return new C92W();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
        OnUIPlayListener onUIPlayListener;
        super.onPlayProgressChange(str, j, j2);
        AssemViewModel assemViewModel = (AssemViewModel) this.b.getValue();
        C210108Mk c210108Mk = new C210108Mk(str, j, j2);
        assemViewModel.getClass();
        assemViewModel.setState(new AqS169S0100000_3(c210108Mk, 903));
        C2MA Y6 = Y6();
        if ((Y6 instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) Y6) != null) {
            onUIPlayListener.onPlayProgressChange(str, j, j2);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekStart(String str, int i, float f) {
        OnUIPlayListener onUIPlayListener;
        C222688oa.LJJJJJ(this, str, i, f);
        C2MA Y6 = Y6();
        if ((Y6 instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) Y6) != null) {
            onUIPlayListener.onSeekStart(str, i, f);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void x7(float f, float f2, int i) {
        C2MA Y6 = Y6();
        if (Y6 != null) {
            Y6.x7(f, f2, i);
        }
    }
}
