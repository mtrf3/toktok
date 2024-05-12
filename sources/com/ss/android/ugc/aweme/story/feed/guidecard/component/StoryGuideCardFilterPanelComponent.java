package com.ss.android.ugc.aweme.story.feed.guidecard.component;

import X.ActivityC45651qj;
import X.C141335gf;
import X.C212418Vh;
import X.C212428Vi;
import X.C213178Yf;
import X.C213198Yh;
import X.C213688a4;
import X.C214298b3;
import X.C215218cX;
import X.C215358cl;
import X.C215368cm;
import X.C2K0;
import X.C33Q;
import X.C3C5;
import X.C3C8;
import X.C47261Igj;
import X.C56412MCa;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78926UyI;
import X.C78983UzD;
import X.C7MY;
import X.C8YN;
import X.C8YZ;
import X.C9BD;
import X.InterfaceC212848Wy;
import X.InterfaceC215378cn;
import X.InterfaceC222288nw;
import X.InterfaceC36571c5;
import X.InterfaceC55102Lju;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.ORZ;
import X.OSK;
import X.OSL;
import X.OSM;
import X.TBV;
import X.TBW;
import X.X1D;
import android.util.Log;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.story.feed.guidecard.filter.GuideCardFilterVM;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryGuideCardFilterPanelComponent extends BasePanelComponent implements KPL, InterfaceC55102Lju {
    public final C214298b3 LJLIL;

    public StoryGuideCardFilterPanelComponent() {
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(GuideCardFilterVM.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9bd, new AqS153S0100000_3(LIZ, 953), C215358cl.INSTANCE, null);
    }

    @Override // X.KPL, X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public final C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.C8W0
    public final void onCreate() {
        super.onCreate();
        C8YN.LJII(this, (AssemViewModel) this.LJLIL.getValue(), new TBV() { // from class: X.8cb
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return ((C215238cZ) obj).LJLIL;
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((C215238cZ) obj).LJLIL = (String) obj2;
            }
        }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 79), 4);
        C8YN.LJII(this, (AssemViewModel) this.LJLIL.getValue(), new TBV() { // from class: X.8cc
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return ((C215238cZ) obj).LJLILLLLZI;
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((C215238cZ) obj).LJLILLLLZI = (String) obj2;
            }
        }, C213688a4.LIZLLL(), C215218cX.LJLIL, 4);
        C8YN.LJII(this, (AssemViewModel) this.LJLIL.getValue(), new TBV() { // from class: X.8ca
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return ((C215238cZ) obj).LJLJI;
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                C215238cZ c215238cZ = (C215238cZ) obj;
                OSZ<Boolean, String> osz = (OSZ) obj2;
                c215238cZ.getClass();
                o.LJIIIZ(osz, "<set-?>");
                c215238cZ.LJLJI = osz;
            }
        }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 80), 4);
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        str.getClass();
        return null;
    }

    public final void v3() {
        InterfaceC36571c5 interfaceC36571c5;
        FullFeedFragmentPanel fullFeedFragmentPanel;
        String str;
        Object LIZ;
        String str2;
        boolean z;
        Object LIZ2;
        List<Aweme> stories;
        Aweme aweme;
        ActivityC45651qj LIZ3 = C212428Vi.LIZ(this);
        if (LIZ3 == null || (interfaceC36571c5 = (FeedFragment) Hox.LJLLI.LIZ(LIZ3).Ja("For You")) == null || !(interfaceC36571c5 instanceof InterfaceC215378cn)) {
            return;
        }
        BaseListFragmentPanel cl = ((InterfaceC215378cn) interfaceC36571c5).cl();
        if (!(cl instanceof FullFeedFragmentPanel) || (fullFeedFragmentPanel = (FullFeedFragmentPanel) cl) == null) {
            return;
        }
        HashSet<String> gv0 = ((GuideCardFilterVM) this.LJLIL.getValue()).gv0();
        int i = fullFeedFragmentPanel.mCurIndex;
        List<Aweme> Q8 = fullFeedFragmentPanel.getAdapter().Q8();
        StringBuilder LJ = C7MY.LJ("tryToFilterUnReadCard curIndex:", i, " readRecord: ");
        if (gv0 != null) {
            str = ORZ.LLD(gv0, null, null, null, C215368cm.LJLIL, 31);
        } else {
            str = null;
        }
        LJ.append(str);
        X1D.LIZIZ(LJ);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Aweme aweme2 : Q8) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                Aweme aweme3 = aweme2;
                if (i2 > i && i2 < fullFeedFragmentPanel.getAdapter().Q8().size()) {
                    UserStory userStory = aweme3.getUserStory();
                    if (userStory == null || (stories = userStory.getStories()) == null || (aweme = (Aweme) ORZ.LJLLLL(stories)) == null || (str2 = aweme.getAid()) == null) {
                        str2 = "";
                    }
                    UserStory userStory2 = aweme3.getUserStory();
                    if (userStory2 != null) {
                        z = userStory2.isStoryGuideCard();
                    } else {
                        z = false;
                    }
                    if (gv0 != null && gv0.contains(str2) && z) {
                        try {
                            LIZ2 = Boolean.valueOf(arrayList.add(aweme3));
                            C3C5.m7constructorimpl(LIZ2);
                        } catch (Throwable th) {
                            LIZ2 = C141335gf.LIZ(th);
                            C3C5.m7constructorimpl(LIZ2);
                        }
                        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ2);
                        if (m10exceptionOrNullimpl != null) {
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("deleteAwemeByPos error ");
                            LIZ4.append(m10exceptionOrNullimpl);
                            C78983UzD.LJIILL(X1D.LIZIZ(LIZ4));
                        }
                    }
                }
                i2 = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Aweme aweme4 = (Aweme) it.next();
            try {
                int indexByAweme = fullFeedFragmentPanel.getIndexByAweme(aweme4);
                fullFeedFragmentPanel.LJJJJZI(indexByAweme, aweme4);
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("deleteAwemeByPos ");
                LIZ5.append(indexByAweme);
                LIZ5.append(' ');
                LIZ5.append(aweme4.getAid());
                LIZ = Integer.valueOf(Log.d("CardFilter", X1D.LIZIZ(LIZ5)));
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th2) {
                LIZ = C141335gf.LIZ(th2);
                C3C5.m7constructorimpl(LIZ);
            }
            Throwable m10exceptionOrNullimpl2 = C3C5.m10exceptionOrNullimpl(LIZ);
            if (m10exceptionOrNullimpl2 != null) {
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("deleteAwemeByPos error ");
                LIZ6.append(m10exceptionOrNullimpl2);
                C78983UzD.LJIILL(X1D.LIZIZ(LIZ6));
            }
        }
    }

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}
