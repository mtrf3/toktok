package com.ss.android.ugc.aweme.story.feed.immersive;

import X.AKT;
import X.ActivityC45651qj;
import X.AnonymousClass901;
import X.C107794Kx;
import X.C1DF;
import X.C207668Da;
import X.C210108Mk;
import X.C213028Xq;
import X.C213118Xz;
import X.C214348b8;
import X.C221108m2;
import X.C221138m5;
import X.C222198nn;
import X.C222348o2;
import X.C222358o3;
import X.C222368o4;
import X.C222378o5;
import X.C222388o6;
import X.C222398o7;
import X.C222578oP;
import X.C222588oQ;
import X.C222668oY;
import X.C26045AKb;
import X.C26048AKe;
import X.C2K9;
import X.C2MA;
import X.C2R8;
import X.C50420Jqa;
import X.C54838Lfe;
import X.C54947LhP;
import X.C55096Ljo;
import X.C56992Ln;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70012ov;
import X.C78555UsJ;
import X.C78996UzQ;
import X.C7ZX;
import X.C80766Vms;
import X.C80S;
import X.C8F1;
import X.EnumC221088m0;
import X.IPG;
import X.IPH;
import X.IT4;
import X.IWF;
import X.InterfaceC222408o8;
import X.InterfaceC222698ob;
import X.InterfaceC222708oc;
import X.InterfaceC55100Ljs;
import X.InterfaceC55235Lm3;
import X.InterfaceC57312Mt;
import X.InterfaceC72642tA;
import X.KR8;
import X.M89;
import Y.IDLListenerS191S0100000_3;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.lifecycle.Observer;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.bottom.BottomToastVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.ability.StoryFeedUserViewPagerAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryCell;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.FeedCollectionPlayerViewAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.FeedCollectionViewPagerAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.StoryCollectionCellAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.StoryPlayEventDispatchAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.scope.FeedCollectionScope;
import com.ss.android.ugc.aweme.story.feed.immersive.ability.StoryProhibitedTipAbility;
import com.ss.android.ugc.feed.platform.cell.ability.CustomCellAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS0S0011000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS15S0000100_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS1S0000001_3;
import kotlin.jvm.internal.AqS28S0001000_3;
import kotlin.jvm.internal.AqS28S1000000_3;
import kotlin.jvm.internal.AqS8S0010000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryImmersiveCollectionVH extends BaseStoryCell<StoryImmersiveCollectionVH, VideoItemParams> implements Observer<C207668Da>, C2K9, InterfaceC222408o8, StoryCollectionCellAbility, StoryPlayEventDispatchAbility, CommonCellAbility, CustomCellAbility, IVideoCellAbility {
    public final C222588oQ LLFFF;
    public final C5H3 LLFII;
    public final C5H3 LLFZ;
    public final C221138m5 LLI;
    public final C221138m5 LLIFFJFJJ;
    public final C221138m5 LLII;
    public final C221138m5 LLIIII;
    public final C221138m5 LLIIIILZ;
    public final C62822Ol8 LLIIIJ;
    public final C62822Ol8 LLIIIL;
    public Aweme LLIIIZ;

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final View Lt() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.StoryPlayEventDispatchAbility
    public final InterfaceC222708oc OD() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final boolean S() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void da(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void f6() {
    }

    @Override // X.InterfaceC222598oR
    public final String gR() {
        return "cell_story_immersive_collection";
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryCell, com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        ArrayList arrayList = new ArrayList(super.getScopeDefine());
        arrayList.add(FeedCollectionScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final AnonymousClass901 j3() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.StoryCollectionCellAbility
    public final C2MA jX() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.CommonCellAbility
    public final InterfaceC55100Ljs mi0() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final Integer o4() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void o7(IDLListenerS191S0100000_3 iDLListenerS191S0100000_3) {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void pG() {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void r7(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void u6(HashMap<String, String> hashMap) {
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final int x20() {
        return 3;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.StoryCollectionCellAbility
    public final ViewGroup KM() {
        return (ViewGroup) this.LLFFF.LIZ.findViewById(R.id.dcn);
    }

    public final VideoPlayViewModel LJLIL() {
        return (VideoPlayViewModel) this.LLFZ.getValue();
    }

    public final VideoViewModel LJLJI() {
        return (VideoViewModel) this.LLFII.getValue();
    }

    public final FeedCollectionViewPagerAbility LJLJJL() {
        return (FeedCollectionViewPagerAbility) this.LLIFFJFJJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final InterfaceC222698ob LLJJIJIL() {
        FeedCollectionPlayerViewAbility feedCollectionPlayerViewAbility = (FeedCollectionPlayerViewAbility) this.LLI.getValue();
        if (feedCollectionPlayerViewAbility != null) {
            return feedCollectionPlayerViewAbility.LLJJIJIL();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final BaseFeedPageParams rp0() {
        return this.LLFFF.LJ;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final ImageView s7() {
        View findViewById = this.LLFFF.LIZ.findViewById(R.id.f8p);
        o.LJIIIIZZ(findViewById, "params.view.findViewById(R.id.iv_play)");
        return (ImageView) findViewById;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.InterfaceC222598oR, X.InterfaceC222708oc
    public final void F5() {
        LJLIL().iv0(true);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.InterfaceC222598oR, X.InterfaceC57312Mt
    public final void J3() {
        InterfaceC57312Mt LJIIIIZZ;
        C2MA Y6 = Y6();
        if (Y6 != null && (LJIIIIZZ = Y6.LJIIIIZZ()) != null) {
            LJIIIIZZ.J3();
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.InterfaceC222708oc
    public final boolean Jk0() {
        InterfaceC222698ob LLJJIJIL = LLJJIJIL();
        if (LLJJIJIL != null) {
            return LLJJIJIL.Jk0();
        }
        return false;
    }

    @Override // X.InterfaceC222408o8
    public final void LJJJJLL() {
        ViewGroup viewGroup;
        FeedCollectionViewPagerAbility LJLJJL = LJLJJL();
        View view = null;
        if (LJLJJL != null) {
            view = LJLJJL.getView();
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

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.InterfaceC222598oR, X.C2MA
    public final InterfaceC222708oc LLLJ() {
        if (C1DF.LJJIII(getCurrentAweme())) {
            return (C222668oY) this.LLIIIL.getValue();
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final void O7() {
        C2MA Y6 = Y6();
        if (Y6 != null) {
            Y6.O7();
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final C2MA Y6() {
        FeedCollectionViewPagerAbility LJLJJL = LJLJJL();
        if (LJLJJL != null) {
            return LJLJJL.getCurViewHolder();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final void Z7() {
        if (IWF.LJJLIIIIJ().isPlaying()) {
            LJLIL().jv0();
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA, X.InterfaceC54061LJp
    public final Aweme getCurrentAweme() {
        Aweme aweme;
        C2MA Y6 = Y6();
        if (Y6 == null || (aweme = Y6.getAweme()) == null) {
            Aweme aweme2 = this.LJZ;
            if (aweme2 == null) {
                return this.LLIIIZ;
            }
            return aweme2;
        }
        return aweme;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final void j8() {
        if (IWF.LJJLIIIIJ().isPlaying()) {
            LJLIL().iv0(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.InterfaceC222598oR, X.InterfaceC222708oc
    public final void n() {
        LJLIL().iv0(true);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.InterfaceC222598oR, X.InterfaceC57312Mt
    public final void o2() {
        InterfaceC57312Mt LJIIIIZZ;
        C2MA Y6 = Y6();
        if (Y6 != null && (LJIIIIZZ = Y6.LJIIIIZZ()) != null) {
            LJIIIIZZ.o2();
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.InterfaceC222598oR, X.C2MA
    public final void onDestroyView() {
        super.onDestroyView();
        InterfaceC55235Lm3 LJIJ = C55096Ljo.LJIJ(this);
        C55096Ljo.LJIILL(LJIJ, StoryCollectionCellAbility.class, null);
        C55096Ljo.LJIILL(LJIJ, StoryPlayEventDispatchAbility.class, null);
        C55096Ljo.LJIILL(LJIJ, CommonCellAbility.class, null);
        C55096Ljo.LJIILL(LJIJ, CustomCellAbility.class, null);
        C55096Ljo.LJIILL(LJIJ, IVideoCellAbility.class, null);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final boolean q7() {
        C2MA Y6 = Y6();
        if (Y6 != null) {
            return Y6.q7();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final boolean u7() {
        C2MA Y6 = Y6();
        if (Y6 != null) {
            return Y6.u7();
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final Aweme O1() {
        return this.LLIIIZ;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.StoryCollectionCellAbility
    public final Aweme ct0() {
        return this.LLIIIZ;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final Aweme getAweme() {
        return this.LLIIIZ;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final void C7(View.OnTouchListener onTouchListener) {
        C2MA Y6 = Y6();
        if (Y6 != null) {
            Y6.C7(onTouchListener);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.StoryCollectionCellAbility
    public final void GH(C56992Ln c56992Ln) {
        Aweme aweme = this.LJZ;
        if (aweme != null && aweme.isStoryFakeAweme()) {
            LIZLLL(c56992Ln.LJLIL);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final void LIZLLL(Aweme aweme) {
        String string;
        String string2;
        String videoDetailNotice;
        super.LIZLLL(aweme);
        if (C54838Lfe.LJJ(aweme)) {
            this.LLIIIZ = aweme;
        }
        if (aweme != null && !aweme.isSharedStoryVisible()) {
            if (!C78996UzQ.LJJIIZI(aweme) || (videoDetailNotice = aweme.getVideoDetailNotice()) == null || videoDetailNotice.length() == 0) {
                string2 = getContext().getString(R.string.r5v);
            } else {
                string2 = aweme.getVideoDetailNotice();
            }
            StoryProhibitedTipAbility storyProhibitedTipAbility = (StoryProhibitedTipAbility) this.LLII.getValue();
            if (storyProhibitedTipAbility != null) {
                storyProhibitedTipAbility.id0(string2);
                return;
            }
            return;
        }
        if (C78996UzQ.LJJIIZI(aweme) && aweme != null && aweme.isProhibited()) {
            String videoDetailNotice2 = aweme.getVideoDetailNotice();
            if (videoDetailNotice2 == null || videoDetailNotice2.length() == 0) {
                string = getContext().getString(R.string.tob);
            } else {
                string = aweme.getVideoDetailNotice();
            }
            StoryProhibitedTipAbility storyProhibitedTipAbility2 = (StoryProhibitedTipAbility) this.LLII.getValue();
            if (storyProhibitedTipAbility2 == null) {
                return;
            }
            storyProhibitedTipAbility2.id0(string);
            return;
        }
        StoryProhibitedTipAbility storyProhibitedTipAbility3 = (StoryProhibitedTipAbility) this.LLII.getValue();
        if (storyProhibitedTipAbility3 == null) {
            return;
        }
        storyProhibitedTipAbility3.id0(null);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final void LJJIII(int i) {
        super.LJJIII(i);
        if (i != 1 && i != 6) {
            if (i == 5) {
                LJLIL().jv0();
            } else {
                VideoPlayViewModel LJLIL = LJLIL();
                LJLIL.getClass();
                LJLIL.setState(new AqS28S0001000_3(1, 23));
            }
            LJLJI().setState(C222378o5.LJLIL);
            C2MA Y6 = Y6();
            if (Y6 != null) {
                Y6.LJJIII(i);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final void LJJIJIIJIL(int i) {
        super.LJJIJIIJIL(i);
        if (i != 1 && i != 2) {
            return;
        }
        LJLJI().setState(C213118Xz.LJLIL);
        C2MA Y6 = Y6();
        if (Y6 == null) {
            return;
        }
        Y6.LJJIJIIJIL(i);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder
    public final VideoItemParams LJLIIL(Aweme aweme) {
        VideoItemParams LJFF = C78555UsJ.LJFF(this.LLFFF);
        LJFF.setAweme(aweme);
        Object value = this.LLIIIILZ.getValue();
        o.LJIIIIZZ(value, "<get-dataCenter>(...)");
        LJFF.setDataCenter((DataCenter) value);
        return LJFF;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.InterfaceC222598oR, X.C2MA
    public final void c9(boolean z) {
        VideoViewModel LJLJI = LJLJI();
        LJLJI.getClass();
        LJLJI.setState(new AqS8S0010000_3(z, 47));
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.StoryCollectionCellAbility
    public final void eR(C70012ov c70012ov) {
        if (!C1DF.LJJ(c70012ov.LJLIL, c70012ov.LJLJL)) {
            LJLIL().jv0();
        }
        if (c70012ov.LJLILLLLZI == this.LJZI) {
            LIZLLL(c70012ov.LJLIL);
        }
        VideoViewModel LJLJI = LJLJI();
        LJLJI.getClass();
        LJLJI.setState(new AqS169S0100000_3(c70012ov, 902));
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final C2MA getViewHolderByAwemeId(String str) {
        C2MA c2ma;
        FeedCollectionViewPagerAbility LJLJJL = LJLJJL();
        C2MA c2ma2 = null;
        if (LJLJJL != null) {
            c2ma = LJLJJL.getViewHolderByAwemeId(str);
        } else {
            c2ma = null;
        }
        FeedCollectionViewPagerAbility LJLJJL2 = LJLJJL();
        if (LJLJJL2 != null) {
            c2ma2 = LJLJJL2.getCurViewHolder();
        }
        if (o.LJ(c2ma, c2ma2) && c2ma2 != null) {
            return this;
        }
        return c2ma;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.StoryCollectionCellAbility
    public final void hY(C70012ov c70012ov) {
        BottomToastVM bottomToastVM = (BottomToastVM) this.LLIIIJ.getValue();
        o.LJIIIZ(bottomToastVM, "bottomToastVM");
        AKT akt = bottomToastVM.LJLIL;
        if (akt != null) {
            akt.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.InterfaceC222598oR, X.C2MA
    public final void j5(C107794Kx c107794Kx) {
        ActivityC45651qj activityC45651qj;
        if (c107794Kx != null) {
            String str = c107794Kx.LJLJL;
            Aweme currentAweme = getCurrentAweme();
            String str2 = null;
            if (currentAweme != null) {
                str2 = currentAweme.getAid();
            }
            if (o.LJ(str, str2) && o.LJ(c107794Kx.LJLJJLL, "story_share_icon") && (activityC45651qj = this.LJLLJ) != null) {
                C26048AKe c26048AKe = new C26048AKe(activityC45651qj);
                c26048AKe.LJFF(R.string.a2b);
                c26048AKe.LJ(R.attr.e8);
                c26048AKe.LJII();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final void l8(int i) {
        Aweme item;
        super.l8(i);
        LJLJI().iv0(i, null);
        C2MA Y6 = Y6();
        if (Y6 != null) {
            Y6.l8(i);
        }
        FeedCollectionViewPagerAbility LJLJJL = LJLJJL();
        if (LJLJJL != null) {
            int LLILL = LJLJJL.LLILL();
            FeedCollectionViewPagerAbility LJLJJL2 = LJLJJL();
            if (LJLJJL2 == null || (item = LJLJJL2.getItem(LLILL)) == null) {
                return;
            }
            C222198nn.LIZ(item, new AqS169S0100000_3(this, 448));
            if (!C2R8.LIZ()) {
                return;
            }
            PopupManager.LJIIL(new C54947LhP(item, this.LLFFF.LJIIIZ, new AqS153S0100000_3(this, 957), new AqS153S0100000_3(this, 958)));
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.InterfaceC222598oR, X.C2MA
    public final void m6(Aweme aweme) {
        VideoViewModel LJLJI = LJLJI();
        LJLJI.getClass();
        LJLJI.setState(new AqS169S0100000_3(aweme, 900));
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
        OnUIPlayListener onUIPlayListener;
        C2MA Y6 = Y6();
        if ((Y6 instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) Y6) != null) {
            onUIPlayListener.onBuffering(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(C207668Da c207668Da) {
        boolean z;
        String str;
        User author;
        C207668Da c207668Da2 = c207668Da;
        if (c207668Da2 == null) {
            return;
        }
        String str2 = c207668Da2.LIZ;
        String str3 = null;
        Object obj = null;
        C50420Jqa c50420Jqa = null;
        str3 = null;
        switch (str2.hashCode()) {
            case -1618328215:
                if (!str2.equals("video_digg")) {
                    return;
                }
                InterfaceC72642tA<C50420Jqa> interfaceC72642tA = this.LLFFF.LIZIZ;
                Object obj2 = c207668Da2.LIZIZ;
                if (obj2 != null) {
                    obj = obj2;
                }
                o.LJIIIIZZ(obj, "kvData.getData()");
                interfaceC72642tA.onInternalEvent(new C50420Jqa(((Number) obj).intValue(), getCurrentAweme()));
                return;
            case -962685926:
                if (!str2.equals("on_render_ready")) {
                    return;
                }
                this.LLFFF.LIZIZ.onInternalEvent(new C50420Jqa(53, getCurrentAweme()));
                return;
            case -162745511:
                if (!str2.equals("feed_internal_event")) {
                    return;
                }
                InterfaceC72642tA<C50420Jqa> interfaceC72642tA2 = this.LLFFF.LIZIZ;
                Object obj3 = c207668Da2.LIZIZ;
                if (obj3 != null) {
                    c50420Jqa = obj3;
                }
                interfaceC72642tA2.onInternalEvent(c50420Jqa);
                return;
            case -144973899:
                if (!str2.equals("title_view_click")) {
                    return;
                }
                break;
            case 1181771620:
                if (!str2.equals("video_share_click")) {
                    return;
                }
                Aweme currentAweme = getCurrentAweme();
                if (!C80S.LJ(currentAweme) || !C80S.LJFF(currentAweme)) {
                    C50420Jqa c50420Jqa2 = new C50420Jqa(3, currentAweme);
                    c50420Jqa2.LJLLL = "story_share_icon";
                    this.LLFFF.LIZIZ.onInternalEvent(c50420Jqa2);
                    return;
                } else {
                    C26045AKb c26045AKb = new C26045AKb(this.LLFFF.LIZJ);
                    c26045AKb.LJIIIIZZ(R.string.txs);
                    c26045AKb.LJIIJ();
                    return;
                }
            case 1964086245:
                if (!str2.equals("to_profile")) {
                    return;
                }
                break;
            default:
                return;
        }
        Aweme currentAweme2 = getCurrentAweme();
        M89 m89 = this.LLFFF.LJ.param;
        boolean z2 = false;
        if (o.LJ(m89.getFrom(), "STORY_ENTRANCE_MINE") || o.LJ(m89.getFrom(), "STORY_ENTRANCE_OTHER")) {
            z = true;
        } else {
            z = false;
        }
        if (m89.getVideoType() == 14) {
            z2 = true;
        }
        if (C78996UzQ.LJJIIZI(currentAweme2) && z && !z2) {
            ActivityC45651qj activityC45651qj = this.LJLLJ;
            if (activityC45651qj == null) {
                return;
            }
            activityC45651qj.onBackPressed();
            return;
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(getContext(), "aweme://user/profile/");
        if (currentAweme2 != null) {
            str = currentAweme2.getAuthorUid();
        } else {
            str = null;
        }
        buildRoute.withParam("uid", str);
        if (currentAweme2 != null && (author = currentAweme2.getAuthor()) != null) {
            str3 = author.getSecUid();
        }
        buildRoute.withParam("sec_user_id", str3);
        buildRoute.withParam("enter_from", this.LLFFF.LJIIIZ);
        buildRoute.open();
        Context context = getContext();
        Aweme currentAweme3 = getCurrentAweme();
        BaseFeedPageParams baseFeedPageParams = this.LLFFF.LJ;
        C7ZX.LIZ(context, currentAweme3, baseFeedPageParams.pageType, baseFeedPageParams.eventType, baseFeedPageParams.param.getFrom(), "click_name", null);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        OnUIPlayListener onUIPlayListener;
        VideoPlayViewModel LJLIL = LJLIL();
        LJLIL.getClass();
        LJLIL.setState(new AqS28S0001000_3(2, 23));
        VideoPlayViewModel LJLIL2 = LJLIL();
        LJLIL2.getClass();
        LJLIL2.setState(new AqS28S1000000_3(str, 24));
        C2MA Y6 = Y6();
        if ((Y6 instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) Y6) != null) {
            onUIPlayListener.onPausePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        OnUIPlayListener onUIPlayListener;
        VideoPlayViewModel LJLIL = LJLIL();
        LJLIL.getClass();
        LJLIL.setState(new AqS28S1000000_3(str, 25));
        C2MA Y6 = Y6();
        if ((Y6 instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) Y6) != null) {
            onUIPlayListener.onPlayCompleted(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        OnUIPlayListener onUIPlayListener;
        LJLIL().setState(C222368o4.LJLIL);
        C2MA Y6 = Y6();
        if ((Y6 instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) Y6) != null) {
            onUIPlayListener.onPlayCompletedFirstTime(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(IPG ipg) {
        OnUIPlayListener onUIPlayListener;
        VideoPlayViewModel LJLIL = LJLIL();
        LJLIL.getClass();
        LJLIL.setState(new AqS28S0001000_3(3, 23));
        C2MA Y6 = Y6();
        if ((Y6 instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) Y6) != null) {
            onUIPlayListener.onPlayFailed(ipg);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
        int i;
        OnUIPlayListener onUIPlayListener;
        Video video;
        Aweme currentAweme = getCurrentAweme();
        if (currentAweme != null && (video = currentAweme.getVideo()) != null) {
            i = video.getVideoLength();
        } else {
            i = 0;
        }
        VideoPlayViewModel LJLIL = LJLIL();
        LJLIL.getClass();
        LJLIL.setState(new AqS1S0000001_3(f, 4));
        VideoPlayViewModel LJLIL2 = LJLIL();
        LJLIL2.getClass();
        LJLIL2.setState(new C222348o2(((f / 100) * i) / 1000));
        C2MA Y6 = Y6();
        if ((Y6 instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) Y6) != null) {
            onUIPlayListener.onPlayProgressChange(f);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        OnUIPlayListener onUIPlayListener;
        C2MA Y6 = Y6();
        if ((Y6 instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) Y6) != null) {
            onUIPlayListener.onPreparePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(IT4 it4) {
        OnUIPlayListener onUIPlayListener;
        VideoPlayViewModel LJLIL = LJLIL();
        String str = null;
        if (it4 != null) {
            str = it4.getId();
        }
        LJLIL.getClass();
        LJLIL.setState(new AqS28S1000000_3(str, 27));
        C2MA Y6 = Y6();
        if ((Y6 instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) Y6) != null) {
            onUIPlayListener.onRenderFirstFrame(it4);
        }
        StoryFeedUserViewPagerAbility storyFeedUserViewPagerAbility = (StoryFeedUserViewPagerAbility) this.LLIIII.getValue();
        if (storyFeedUserViewPagerAbility != null) {
            storyFeedUserViewPagerAbility.Nq();
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(IPH iph) {
        OnUIPlayListener onUIPlayListener;
        Object value = this.LLIIIILZ.getValue();
        o.LJIIIIZZ(value, "<get-dataCenter>(...)");
        ((DataCenter) value).jv0(null, "on_render_ready");
        C2MA Y6 = Y6();
        if ((Y6 instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) Y6) != null) {
            onUIPlayListener.onRenderReady(iph);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        OnUIPlayListener onUIPlayListener;
        VideoPlayViewModel LJLIL = LJLIL();
        LJLIL.getClass();
        LJLIL.setState(new AqS28S1000000_3(str, 28));
        C2MA Y6 = Y6();
        if ((Y6 instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) Y6) != null) {
            onUIPlayListener.onResumePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final void t7(boolean z) {
        String str;
        super.t7(z);
        VideoViewModel LJLJI = LJLJI();
        Aweme aweme = this.LJZ;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        LJLJI.jv0(str, z);
        C222578oP.LIZ = "slide";
        C2MA Y6 = Y6();
        if (Y6 != null) {
            Y6.t7(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.CommonCellAbility
    public final void t70(InterfaceC222698ob baseFeedPlayerView) {
        o.LJIIIZ(baseFeedPlayerView, "baseFeedPlayerView");
        baseFeedPlayerView.N7(this);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final void u0(ViewTreeObserver.OnGlobalLayoutListener l) {
        o.LJIIIZ(l, "l");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryImmersiveCollectionVH(C222588oQ params, C213028Xq c213028Xq) {
        super(params, c213028Xq);
        o.LJIIIZ(params, "params");
        this.LLFFF = params;
        C65776Prg LIZ = C65352Pkq.LIZ(VideoViewModel.class);
        C222388o6 c222388o6 = C222388o6.INSTANCE;
        EnumC221088m0 enumC221088m0 = EnumC221088m0.SYNCHRONIZED;
        this.LLFII = C214348b8.LIZJ(this, LIZ, c222388o6, enumC221088m0);
        this.LLFZ = C214348b8.LIZJ(this, C65352Pkq.LIZ(VideoPlayViewModel.class), C222398o7.INSTANCE, enumC221088m0);
        this.LLI = KR8.LJIIJJI(new AqS153S0100000_3(this, 1684));
        this.LLIFFJFJJ = KR8.LJIIJJI(new AqS153S0100000_3(this, 1687));
        this.LLII = KR8.LJIIJJI(new AqS153S0100000_3(this, 1685));
        this.LLIIII = KR8.LJIIJJI(new AqS153S0100000_3(this, 1686));
        C221138m5 LJIIJJI = KR8.LJIIJJI(new AqS153S0100000_3(this, 1682));
        this.LLIIIILZ = LJIIJJI;
        this.LLIIIJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1681));
        this.LLIIIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1683));
        Object value = LJIIJJI.getValue();
        o.LJIIIIZZ(value, "<get-dataCenter>(...)");
        DataCenter dataCenter = (DataCenter) value;
        dataCenter.iv0("feed_internal_event", this, false);
        dataCenter.iv0("video_share_click", this, false);
        dataCenter.iv0("on_render_ready", this, false);
        dataCenter.iv0("video_digg", this, false);
        dataCenter.iv0("title_view_click", this, false);
        dataCenter.iv0("to_profile", this, false);
        InterfaceC55235Lm3 LJIJ = C55096Ljo.LJIJ(this);
        C55096Ljo.LJIIJJI(LJIJ, this, StoryCollectionCellAbility.class, null);
        C55096Ljo.LJIIJJI(LJIJ, this, StoryPlayEventDispatchAbility.class, null);
        C55096Ljo.LJIIJJI(LJIJ, this, CommonCellAbility.class, null);
        C55096Ljo.LJIIJJI(LJIJ, this, CustomCellAbility.class, null);
        C55096Ljo.LJIIJJI(LJIJ, this, IVideoCellAbility.class, null);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final void L8(int i, String storyAid) {
        o.LJIIIZ(storyAid, "storyAid");
        FeedCollectionViewPagerAbility LJLJJL = LJLJJL();
        if (LJLJJL != null) {
            LJLJJL.E00(storyAid);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.InterfaceC47667InH
    public final void LJJL(int i, int i2) {
        LJLIL().setState(C222358o3.LJLIL);
        super.LJJL(i, i2);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.ability.CustomCellAbility
    public final void l6(int i, boolean z) {
        VideoPlayViewModel LJLIL = LJLIL();
        LJLIL.getClass();
        LJLIL.setState(new AqS0S0011000_3(z, i, 1));
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z) {
        OnUIPlayListener onUIPlayListener;
        if (z) {
            VideoPlayViewModel LJLIL = LJLIL();
            LJLIL.getClass();
            LJLIL.setState(new AqS28S1000000_3(str, 29));
        }
        C2MA Y6 = Y6();
        if ((Y6 instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) Y6) != null) {
            onUIPlayListener.onSeekEnd(str, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSpeedChanged(String str, float f) {
        OnUIPlayListener onUIPlayListener;
        VideoPlayViewModel LJLIL = LJLIL();
        LJLIL.getClass();
        LJLIL.setState(new C8F1(str, f));
        C2MA Y6 = Y6();
        if ((Y6 instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) Y6) != null) {
            onUIPlayListener.onSpeedChanged(str, f);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
        OnUIPlayListener onUIPlayListener;
        VideoPlayViewModel LJLIL = LJLIL();
        LJLIL.getClass();
        LJLIL.setState(new AqS15S0000100_3(j, 7));
        VideoPlayViewModel LJLIL2 = LJLIL();
        C210108Mk c210108Mk = new C210108Mk(str, j, j2);
        LJLIL2.getClass();
        LJLIL2.setState(new AqS169S0100000_3(c210108Mk, 903));
        C2MA Y6 = Y6();
        if ((Y6 instanceof OnUIPlayListener) && (onUIPlayListener = (OnUIPlayListener) Y6) != null) {
            onUIPlayListener.onPlayProgressChange(str, j, j2);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.BaseStoryViewHolder, X.C2MA
    public final void x7(float f, float f2, int i) {
        C2MA Y6 = Y6();
        if (Y6 != null) {
            Y6.x7(f, f2, i);
        }
    }
}
