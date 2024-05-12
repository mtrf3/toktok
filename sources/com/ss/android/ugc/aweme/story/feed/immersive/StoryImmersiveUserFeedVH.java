package com.ss.android.ugc.aweme.story.feed.immersive;

import X.C107794Kx;
import X.C213038Xr;
import X.C222588oQ;
import X.C222658oX;
import X.C222688oa;
import X.C2K9;
import X.C2MA;
import X.C54838Lfe;
import X.C55096Ljo;
import X.C55230Lly;
import X.C78555UsJ;
import X.IPG;
import X.IPH;
import X.IT4;
import X.InterfaceC222408o8;
import X.InterfaceC222598oR;
import X.InterfaceC222698ob;
import X.InterfaceC222708oc;
import X.InterfaceC55100Ljs;
import android.R;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.ability.StoryFeedUserViewPagerAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryCell;
import com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.story.feed.immersive.ability.UserFeedAbility;
import com.ss.android.ugc.aweme.story.feed.immersive.component.StoryImmersiveUserFeedComponent$userViewPagerAbilityImpl$1;
import com.ss.android.ugc.aweme.story.feed.immersive.scope.UserFeedScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryImmersiveUserFeedVH extends BaseStoryCell<StoryImmersiveUserFeedVH, VideoItemParams> implements InterfaceC222408o8, C2K9, CommonCellAbility, UserFeedAbility, StoryFeedUserViewPagerAbility {
    public final C222588oQ LLFFF;
    public InterfaceC222598oR LLFII;
    public StoryFeedUserViewPagerAbility LLFZ;
    public final C222658oX LLI;
    public final ImageView LLIFFJFJJ;

    @Override // X.InterfaceC222598oR
    public final String gR() {
        return "cell_story_immersive_feed";
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryCell, com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        ArrayList arrayList = new ArrayList(super.getScopeDefine());
        arrayList.add(UserFeedScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.CommonCellAbility
    public final InterfaceC55100Ljs mi0() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.story.ability.StoryFeedUserViewPagerAbility
    public final boolean Bq() {
        StoryFeedUserViewPagerAbility storyFeedUserViewPagerAbility = this.LLFZ;
        if (storyFeedUserViewPagerAbility != null) {
            return storyFeedUserViewPagerAbility.Bq();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.InterfaceC222598oR, X.InterfaceC222708oc
    public final void F5() {
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR != null) {
            interfaceC222598oR.F5();
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.InterfaceC222598oR, X.InterfaceC57312Mt
    public final void J3() {
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR != null) {
            interfaceC222598oR.J3();
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.InterfaceC222708oc
    public final boolean Jk0() {
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR != null) {
            return interfaceC222598oR.Jk0();
        }
        return super.Jk0();
    }

    @Override // com.ss.android.ugc.aweme.story.ability.StoryFeedUserViewPagerAbility
    public final boolean KA() {
        StoryFeedUserViewPagerAbility storyFeedUserViewPagerAbility = this.LLFZ;
        if (storyFeedUserViewPagerAbility != null) {
            return storyFeedUserViewPagerAbility.KA();
        }
        return false;
    }

    @Override // X.InterfaceC222408o8
    public final void LJJJJLL() {
        InterfaceC222408o8 interfaceC222408o8;
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if ((interfaceC222598oR instanceof InterfaceC222408o8) && (interfaceC222408o8 = (InterfaceC222408o8) interfaceC222598oR) != null) {
            interfaceC222408o8.LJJJJLL();
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final InterfaceC222698ob LLJJIJIL() {
        InterfaceC222698ob LLJJIJIL;
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR == null || (LLJJIJIL = interfaceC222598oR.LLJJIJIL()) == null) {
            return this.LLI;
        }
        return LLJJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.InterfaceC222598oR, X.C2MA
    public final InterfaceC222708oc LLLJ() {
        InterfaceC222708oc LLLJ;
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR == null || (LLLJ = interfaceC222598oR.LLLJ()) == null) {
            return this;
        }
        return LLLJ;
    }

    @Override // com.ss.android.ugc.aweme.story.ability.StoryFeedUserViewPagerAbility
    public final void Nq() {
        StoryFeedUserViewPagerAbility storyFeedUserViewPagerAbility = this.LLFZ;
        if (storyFeedUserViewPagerAbility != null) {
            storyFeedUserViewPagerAbility.Nq();
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final Aweme O1() {
        Aweme O1;
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR == null || (O1 = interfaceC222598oR.O1()) == null) {
            return getAweme();
        }
        return O1;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final void O7() {
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR != null) {
            interfaceC222598oR.O7();
        }
        super.O7();
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.InterfaceC222708oc
    public final int UU() {
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR != null) {
            return interfaceC222598oR.UU();
        }
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final C2MA Y6() {
        C2MA Y6;
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR == null || (Y6 = interfaceC222598oR.Y6()) == null) {
            return null;
        }
        return Y6;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final void Z7() {
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR != null) {
            interfaceC222598oR.Z7();
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final Aweme getAweme() {
        Aweme aweme;
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR == null || (aweme = interfaceC222598oR.getAweme()) == null) {
            return this.LJZ;
        }
        return aweme;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA, X.InterfaceC54061LJp
    public final Aweme getCurrentAweme() {
        Aweme currentAweme;
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR == null || (currentAweme = interfaceC222598oR.getCurrentAweme()) == null) {
            return getAweme();
        }
        return currentAweme;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final void j8() {
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR != null) {
            interfaceC222598oR.j8();
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.InterfaceC222598oR, X.InterfaceC222708oc
    public final void n() {
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR != null) {
            interfaceC222598oR.n();
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.InterfaceC222598oR, X.InterfaceC57312Mt
    public final void o2() {
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR != null) {
            interfaceC222598oR.o2();
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.InterfaceC222598oR, X.C2MA
    public final void onDestroyView() {
        C55096Ljo.LJIILL(C55230Lly.LIZJ(this.LLFFF.LIZJ, null), UserFeedAbility.class, null);
        C55096Ljo.LJIILL(C55230Lly.LIZJ(this.LLFFF.LIZJ, null), StoryFeedUserViewPagerAbility.class, null);
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR != null) {
            interfaceC222598oR.onDestroyView();
        }
        super.onDestroyView();
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final boolean q7() {
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR != null) {
            return interfaceC222598oR.q7();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final ImageView s7() {
        ImageView s7;
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR == null || (s7 = interfaceC222598oR.s7()) == null) {
            return this.LLIFFJFJJ;
        }
        return s7;
    }

    @Override // com.ss.android.ugc.aweme.story.ability.StoryFeedUserViewPagerAbility
    public final boolean scrollToNext() {
        StoryFeedUserViewPagerAbility storyFeedUserViewPagerAbility = this.LLFZ;
        if (storyFeedUserViewPagerAbility != null) {
            return storyFeedUserViewPagerAbility.scrollToNext();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final boolean u7() {
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR != null) {
            return interfaceC222598oR.u7();
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final void unBind() {
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR != null) {
            interfaceC222598oR.unBind();
        }
        super.unBind();
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.ability.UserFeedAbility
    public final InterfaceC222598oR lQ() {
        return this.LLFII;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.ability.UserFeedAbility
    public final void At0(StoryImmersiveUserFeedComponent$userViewPagerAbilityImpl$1 proxy) {
        o.LJIIIZ(proxy, "proxy");
        this.LLFZ = proxy;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.ability.UserFeedAbility
    public final C222588oQ Bm(View view) {
        o.LJIIIZ(view, "view");
        C222588oQ c222588oQ = this.LLFFF;
        return new C222588oQ(view, c222588oQ.LIZIZ, c222588oQ.LIZJ, c222588oQ.LIZLLL, c222588oQ.LJ, c222588oQ.LJFF, c222588oQ.LJI, c222588oQ.LJII, c222588oQ.LJIIIIZZ, c222588oQ.LJIIIZ, c222588oQ.LJIIJ, c222588oQ.LJIIJJI, c222588oQ.LJIIL, c222588oQ.LJIILIIL, c222588oQ.LJIILJJIL, c222588oQ.LJIILL, c222588oQ.LJIILLIIL, c222588oQ.LJIIZILJ);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final void C7(View.OnTouchListener onTouchListener) {
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR != null) {
            interfaceC222598oR.C7(onTouchListener);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final void LIZLLL(Aweme aweme) {
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR != null) {
            interfaceC222598oR.LIZLLL(aweme);
        }
        C54838Lfe.LJJ(aweme);
        super.LIZLLL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final void LJJIII(int i) {
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR != null) {
            interfaceC222598oR.LJJIII(i);
        }
        super.LJJIII(i);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final void LJJIJIIJIL(int i) {
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR != null) {
            interfaceC222598oR.LJJIJIIJIL(i);
        }
        super.LJJIJIIJIL(i);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder
    public final VideoItemParams LJLIIL(Aweme aweme) {
        BaseStoryViewHolder baseStoryViewHolder;
        VideoItemParams LJLIIL;
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (!(interfaceC222598oR instanceof BaseStoryViewHolder) || (baseStoryViewHolder = (BaseStoryViewHolder) interfaceC222598oR) == null || (LJLIIL = baseStoryViewHolder.LJLIIL(aweme)) == null) {
            VideoItemParams LJFF = C78555UsJ.LJFF(this.LLFFF);
            LJFF.setAweme(aweme);
            return LJFF;
        }
        return LJLIIL;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.ability.UserFeedAbility
    public final void Ox(StoryImmersiveCollectionVH storyImmersiveCollectionVH) {
        if (o.LJ(this.LLFII, storyImmersiveCollectionVH)) {
            this.LLFII = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final void c8(Aweme aweme) {
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR != null) {
            interfaceC222598oR.c8(aweme);
        }
        super.c8(aweme);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.InterfaceC222598oR, X.C2MA
    public final void c9(boolean z) {
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR != null) {
            interfaceC222598oR.c9(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final C2MA getViewHolderByAwemeId(String str) {
        C2MA viewHolderByAwemeId;
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR == null || (viewHolderByAwemeId = interfaceC222598oR.getViewHolderByAwemeId(str)) == null) {
            return this;
        }
        return viewHolderByAwemeId;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.InterfaceC222598oR, X.C2MA
    public final void j5(C107794Kx c107794Kx) {
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR != null) {
            interfaceC222598oR.j5(c107794Kx);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final void k7(View view) {
        super.k7(view);
        C55096Ljo.LJIIJJI(C55230Lly.LIZJ(this.LLFFF.LIZJ, null), this, UserFeedAbility.class, null);
        C55096Ljo.LJIIJJI(C55230Lly.LIZJ(this.LLFFF.LIZJ, null), this, StoryFeedUserViewPagerAbility.class, null);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final void l8(int i) {
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR != null) {
            interfaceC222598oR.l8(i);
        }
        super.l8(i);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.InterfaceC222598oR, X.C2MA
    public final void m6(Aweme aweme) {
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR != null) {
            interfaceC222598oR.m6(aweme);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR != null) {
            interfaceC222598oR.onPausePlay(str);
        }
        C222688oa.LJIIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR != null) {
            interfaceC222598oR.onPlayCompleted(str);
        }
        C222688oa.LJIILJJIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR != null) {
            interfaceC222598oR.onPlayCompletedFirstTime(str);
        }
        C222688oa.LJIILLIIL(this, str);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(IPH iph) {
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR != null) {
            interfaceC222598oR.onRenderReady(iph);
        }
        C222688oa.LJJJ(this, iph);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR != null) {
            interfaceC222598oR.onResumePlay(str);
        }
        C222688oa.LJJJI(this, str);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final void t7(boolean z) {
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR != null) {
            interfaceC222598oR.t7(z);
        }
        super.t7(z);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.CommonCellAbility
    public final void t70(InterfaceC222698ob baseFeedPlayerView) {
        o.LJIIIZ(baseFeedPlayerView, "baseFeedPlayerView");
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.ability.UserFeedAbility
    public final void vk0(StoryImmersiveCollectionVH storyImmersiveCollectionVH) {
        this.LLFII = storyImmersiveCollectionVH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryImmersiveUserFeedVH(C222588oQ params, C213038Xr c213038Xr) {
        super(params, c213038Xr);
        o.LJIIIZ(params, "params");
        this.LLFFF = params;
        Context context = params.LIZJ.getContext();
        if (context != null) {
            this.LLI = new C222658oX(context);
            Context context2 = params.LIZJ.getContext();
            if (context2 != null) {
                ImageView imageView = new ImageView(context2);
                imageView.setBackgroundColor(imageView.getResources().getColor(R.color.holo_green_light));
                this.LLIFFJFJJ = imageView;
                return;
            }
            throw new NullPointerException("context is null!!");
        }
        throw new NullPointerException("context is null!!");
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final void E8(int i, Aweme aweme) {
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR != null) {
            interfaceC222598oR.E8(i, aweme);
        }
        super.E8(i, aweme);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final void L8(int i, String str) {
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR != null) {
            interfaceC222598oR.L8(i, str);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.InterfaceC47667InH
    public final void LJJL(int i, int i2) {
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR != null) {
            interfaceC222598oR.LJJL(i, i2);
        }
        super.LJJL(i, i2);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(String str, boolean z) {
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR != null) {
            interfaceC222598oR.onBuffering(str, z);
        }
        C222688oa.LIZLLL(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, IPG ipg) {
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR != null) {
            interfaceC222598oR.onPlayFailed(str, ipg);
        }
        C222688oa.LJIJ(this, str, ipg);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str, IPH iph) {
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR != null) {
            interfaceC222598oR.onPreparePlay(str, iph);
        }
        C222688oa.LJJIJL(this, str, iph);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, IT4 it4) {
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR != null) {
            interfaceC222598oR.onRenderFirstFrame(str, it4);
        }
        C222688oa.LJJIJLIJ(this, str, it4);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z) {
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR != null) {
            interfaceC222598oR.onSeekEnd(str, z);
        }
        C222688oa.LJJJJIZL(this, str, z);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSpeedChanged(String str, float f) {
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR != null) {
            interfaceC222598oR.onSpeedChanged(str, f);
        }
        C222688oa.LJJJJJL(this, str, f);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final void x7(float f, float f2, int i) {
        InterfaceC222598oR interfaceC222598oR = this.LLFII;
        if (interfaceC222598oR != null) {
            interfaceC222598oR.x7(f, f2, i);
        }
    }
}
