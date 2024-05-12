package com.ss.android.ugc.aweme.story.feed.immersive.component;

import X.AbstractC72276SYe;
import X.C0CJ;
import X.C0CK;
import X.C213688a4;
import X.C220188kY;
import X.C221108m2;
import X.C221138m5;
import X.C222588oQ;
import X.C222818on;
import X.C222868os;
import X.C54838Lfe;
import X.C55096Ljo;
import X.C55230Lly;
import X.C62822Ol8;
import X.C78996UzQ;
import X.InterfaceC213868aM;
import X.InterfaceC222828oo;
import X.InterfaceC222838op;
import X.InterfaceC51771KTn;
import X.InterfaceC57784Mm4;
import X.KOV;
import X.KR8;
import X.TBT;
import Y.ARunnableS7S0101000_3;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.feed.common.StoryFeedViewModel;
import com.ss.android.ugc.aweme.story.feed.guidecard.viewmodel.StoryGuideCardViewModel;
import com.ss.android.ugc.aweme.story.feed.immersive.ImmersiveGestureMonitor;
import com.ss.android.ugc.aweme.story.feed.immersive.ability.ISkylightDetailAbility;
import com.ss.android.ugc.aweme.story.feed.immersive.ability.UserFeedAbility;
import com.ss.android.ugc.aweme.story.feed.immersive.component.StoryImmersiveFeedItem;
import com.ss.android.ugc.aweme.story.feed.immersive.component.StoryImmersiveUserFeedComponent;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryImmersiveUserFeedComponent extends BaseCellContentComponent<StoryImmersiveUserFeedComponent> implements ISkylightDetailAbility {
    public C222588oQ LL;
    public final C62822Ol8 LLD;
    public final C62822Ol8 LLF;
    public final C62822Ol8 LLFF;
    public final C221138m5 LLFFF;
    public final C221138m5 LLFII;
    public final C221138m5 LLFZ;
    public final C221138m5 LLI;
    public final C62822Ol8 LLIFFJFJJ;
    public final StoryImmersiveUserFeedComponent$userViewPagerAbilityImpl$1 LLII;

    public StoryImmersiveUserFeedComponent() {
        new LinkedHashMap();
        this.LLD = C221108m2.LIZIZ(new AqS153S0100000_3(this, 967));
        this.LLF = C221108m2.LIZIZ(new AqS153S0100000_3(this, 963));
        this.LLFF = C221108m2.LIZIZ(new AqS153S0100000_3(this, 964));
        this.LLFFF = KR8.LJIIJJI(new AqS153S0100000_3(this, 966));
        this.LLFII = KR8.LJIIJJI(new AqS153S0100000_3(this, 961));
        this.LLFZ = KR8.LJIIJJI(new AqS153S0100000_3(this, 965));
        this.LLI = KR8.LJIIJJI(new AqS153S0100000_3(this, 962));
        this.LLIFFJFJJ = C221108m2.LIZIZ(C222818on.LJLIL);
        this.LLII = new StoryImmersiveUserFeedComponent$userViewPagerAbilityImpl$1(this);
    }

    public final C222588oQ b4() {
        C222588oQ c222588oQ = this.LL;
        if (c222588oQ != null) {
            return c222588oQ;
        }
        o.LJIJI("params");
        throw null;
    }

    public final KOV c4() {
        return (KOV) this.LLFFF.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onCreateView() {
        super.onCreateView();
        C55096Ljo.LJIIJJI(C55230Lly.LIZJ(b4().LIZJ, null), this, ISkylightDetailAbility.class, null);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void onDestroyView() {
        C55096Ljo.LJIILL(C55230Lly.LIZJ(b4().LIZJ, null), ISkylightDetailAbility.class, null);
    }

    public static StoryImmersiveFeedItem e4(InterfaceC222828oo interfaceC222828oo) {
        if (C78996UzQ.LJJIIZI(interfaceC222828oo.getStoryCollection())) {
            final Aweme storyCollection = interfaceC222828oo.getStoryCollection();
            return new StoryImmersiveFeedItem(storyCollection) { // from class: X.8oh
                public final Aweme LJLIL;

                public final int hashCode() {
                    return this.LJLIL.hashCode();
                }

                public final String toString() {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("MineStoryImmersiveFeedItem(storyCollection=");
                    return C770830u.LIZ(LIZ, this.LJLIL, ')', LIZ);
                }

                @Override // com.ss.android.ugc.aweme.story.feed.immersive.component.StoryImmersiveFeedItem, X.InterfaceC222828oo
                public final Aweme getStoryCollection() {
                    return this.LJLIL;
                }

                {
                    o.LJIIIZ(storyCollection, "storyCollection");
                    this.LJLIL = storyCollection;
                }

                @Override // com.ss.android.ugc.aweme.story.feed.immersive.component.StoryImmersiveFeedItem, X.InterfaceC57784Mm4
                public final boolean areContentsTheSame(InterfaceC57784Mm4 other) {
                    o.LJIIIZ(other, "other");
                    if (!(other instanceof StoryImmersiveFeedItem)) {
                        return false;
                    }
                    return o.LJ(getStoryCollection(), ((StoryImmersiveFeedItem) other).getStoryCollection());
                }

                @Override // com.ss.android.ugc.aweme.story.feed.immersive.component.StoryImmersiveFeedItem, X.InterfaceC57784Mm4
                public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
                    return C222778oj.LIZ(this, interfaceC57784Mm4);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if ((obj instanceof C222758oh) && o.LJ(this.LJLIL, ((C222758oh) obj).LJLIL)) {
                        return true;
                    }
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.story.feed.immersive.component.StoryImmersiveFeedItem, X.InterfaceC57784Mm4
                public final Object getChangePayload(InterfaceC57784Mm4 other) {
                    o.LJIIIZ(other, "other");
                    return null;
                }
            };
        }
        return new StoryImmersiveFeedItem(interfaceC222828oo.getStoryCollection()) { // from class: X.8oi
            public final Aweme LJLIL;

            public final int hashCode() {
                return this.LJLIL.hashCode();
            }

            public final String toString() {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("OtherStoryImmersiveFeedItem(storyCollection=");
                return C770830u.LIZ(LIZ, this.LJLIL, ')', LIZ);
            }

            @Override // com.ss.android.ugc.aweme.story.feed.immersive.component.StoryImmersiveFeedItem, X.InterfaceC222828oo
            public final Aweme getStoryCollection() {
                return this.LJLIL;
            }

            {
                o.LJIIIZ(storyCollection, "storyCollection");
                this.LJLIL = storyCollection;
            }

            @Override // com.ss.android.ugc.aweme.story.feed.immersive.component.StoryImmersiveFeedItem, X.InterfaceC57784Mm4
            public final boolean areContentsTheSame(InterfaceC57784Mm4 other) {
                o.LJIIIZ(other, "other");
                if (!(other instanceof StoryImmersiveFeedItem)) {
                    return false;
                }
                return o.LJ(getStoryCollection(), ((StoryImmersiveFeedItem) other).getStoryCollection());
            }

            @Override // com.ss.android.ugc.aweme.story.feed.immersive.component.StoryImmersiveFeedItem, X.InterfaceC57784Mm4
            public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
                return C222778oj.LIZ(this, interfaceC57784Mm4);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C222768oi) && o.LJ(this.LJLIL, ((C222768oi) obj).LJLIL)) {
                    return true;
                }
                return false;
            }

            @Override // com.ss.android.ugc.aweme.story.feed.immersive.component.StoryImmersiveFeedItem, X.InterfaceC57784Mm4
            public final Object getChangePayload(InterfaceC57784Mm4 other) {
                o.LJIIIZ(other, "other");
                return null;
            }
        };
    }

    @Override // X.C8XO
    public final void F0(VideoItemParams videoItemParams) {
        StoryGuideCardViewModel storyGuideCardViewModel;
        List<InterfaceC57784Mm4> listGetAll;
        StoryImmersiveFeedItem e4;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        if (!C54838Lfe.LJJ(item.getAweme())) {
            return;
        }
        Object value = this.LLD.getValue();
        Aweme aweme = item.getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        value.getClass();
        StoryFeedViewModel.pv0(aweme);
        AssemSingleListViewModel assemSingleListViewModel = (AssemSingleListViewModel) this.LLF.getValue();
        if (assemSingleListViewModel != null && (listGetAll = assemSingleListViewModel.listGetAll()) != null) {
            ArrayList arrayList = new ArrayList();
            for (InterfaceC57784Mm4 interfaceC57784Mm4 : listGetAll) {
                if (interfaceC57784Mm4 instanceof InterfaceC222828oo) {
                    InterfaceC222828oo interfaceC222828oo = (InterfaceC222828oo) interfaceC57784Mm4;
                    if (!C54838Lfe.LJIJI(interfaceC222828oo.getStoryCollection()) && (e4 = e4(interfaceC222828oo)) != null) {
                        arrayList.add(e4);
                    }
                }
            }
            Iterator it = arrayList.iterator();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (o.LJ(((StoryImmersiveFeedItem) it.next()).getStoryCollection().getAid(), b4().LJ.param.getAid())) {
                    if (i2 >= 0) {
                        i = i2;
                    }
                } else {
                    i2++;
                }
            }
            c4().getViewItemOperator().getState().LJ(arrayList);
            c4().post(new ARunnableS7S0101000_3(i, this, 15));
        }
        BaseDetailShareVM baseDetailShareVM = (BaseDetailShareVM) this.LLF.getValue();
        if (!(baseDetailShareVM instanceof StoryGuideCardViewModel) || (storyGuideCardViewModel = (StoryGuideCardViewModel) baseDetailShareVM) == null) {
            return;
        }
        AssemViewModel.asyncSubscribe$default(storyGuideCardViewModel, new TBT() { // from class: X.3cV
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C87783cU c87783cU = (C87783cU) obj;
                c87783cU.getClass();
                return C208708Ha.LIZLLL(c87783cU);
            }
        }, C213688a4.LIZLLL(), null, null, new AqS134S0200000_3(storyGuideCardViewModel, this, 289), 12, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.8ou] */
    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        c4().getViewItemOperator().LJFF(MineImmersiveStoryUserCell.class, OtherImmersiveStoryUserCell.class);
        c4().getViewItemOperator().LIZ(C55096Ljo.LJIIZILJ(this));
        ((C220188kY) this.LLIFFJFJJ.getValue()).LIZIZ = false;
        c4().getViewItemOperator().LIZLLL(new AbstractC72276SYe<Long>((C220188kY) this.LLIFFJFJJ.getValue()) { // from class: X.8ou
            @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
            public final void onRefresh(InterfaceC67352kd<? super A2G<Long>> continuation) {
                o.LJIIIZ(continuation, "continuation");
            }

            @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
            public final void onLoadMore(InterfaceC67352kd continuation, Object obj) {
                ((Number) obj).longValue();
                o.LJIIIZ(continuation, "continuation");
            }
        });
        if (((Number) C222868os.LIZ.getValue()).intValue() == 1) {
            c4().setPageTransformer(new C0CK() { // from class: X.8py
                @Override // X.C0CK
                public final void LIZ(View view2, float f) {
                    view2.setPivotY(view2.getHeight() / 2.0f);
                    if (f < -1.0f) {
                        view2.setPivotX(0.0f);
                        view2.setRotationY(90.0f);
                    } else if (f <= 0.0f) {
                        view2.setPivotX(view2.getWidth());
                        view2.setRotationY(-C223558pz.LIZ.getInterpolation(-f));
                    } else if (f <= 1.0f) {
                        view2.setPivotX(0.0f);
                        view2.setRotationY(C223558pz.LIZ.getInterpolation(f));
                    } else {
                        view2.setPivotX(0.0f);
                        view2.setRotationY(90.0f);
                    }
                }
            });
        }
        KOV c4 = c4();
        if (c4 != null) {
            c4.LJLJJL.LIZIZ(new C0CJ() { // from class: X.8og
                public int LJLIL = -1;

                @Override // X.C0CJ
                public final void LIZ(int i) {
                    InterfaceC222598oR lQ;
                    InterfaceC222598oR lQ2;
                    Aweme aweme = null;
                    if (i != 0) {
                        if (i != 1) {
                            return;
                        }
                        this.LJLIL = StoryImmersiveUserFeedComponent.this.c4().getCurrentItem();
                        IPlayerComponentAbility iPlayerComponentAbility = (IPlayerComponentAbility) StoryImmersiveUserFeedComponent.this.LLI.getValue();
                        if (iPlayerComponentAbility == null) {
                            return;
                        }
                        UserFeedAbility userFeedAbility = (UserFeedAbility) StoryImmersiveUserFeedComponent.this.LLFZ.getValue();
                        if (userFeedAbility != null && (lQ2 = userFeedAbility.lQ()) != null) {
                            aweme = lQ2.getCurrentAweme();
                        }
                        iPlayerComponentAbility.handlePlay(aweme, false, false);
                        return;
                    }
                    if (this.LJLIL == StoryImmersiveUserFeedComponent.this.c4().getCurrentItem()) {
                        IPlayerComponentAbility iPlayerComponentAbility2 = (IPlayerComponentAbility) StoryImmersiveUserFeedComponent.this.LLI.getValue();
                        if (iPlayerComponentAbility2 == null) {
                            return;
                        }
                        UserFeedAbility userFeedAbility2 = (UserFeedAbility) StoryImmersiveUserFeedComponent.this.LLFZ.getValue();
                        if (userFeedAbility2 != null && (lQ = userFeedAbility2.lQ()) != null) {
                            aweme = lQ.getCurrentAweme();
                        }
                        iPlayerComponentAbility2.handlePlay(aweme, false, false);
                        return;
                    }
                    C61995OUt c61995OUt = (C61995OUt) StoryImmersiveUserFeedComponent.this.LLFF.getValue();
                    if (c61995OUt == null) {
                        return;
                    }
                    c61995OUt.LIZ();
                }
            });
        }
        UserFeedAbility userFeedAbility = (UserFeedAbility) this.LLFZ.getValue();
        if (userFeedAbility != null) {
            userFeedAbility.At0(this.LLII);
        }
        ((ImmersiveGestureMonitor) this.LLFII.getValue()).setEventListener$story_release(new InterfaceC213868aM() { // from class: X.8om
            @Override // X.InterfaceC213868aM
            public final void L0() {
            }

            @Override // X.InterfaceC213868aM
            public final void LLLLIL() {
            }

            @Override // X.InterfaceC213868aM
            public final boolean LLL() {
                return !StoryImmersiveUserFeedComponent.this.LLII.Bq();
            }

            @Override // X.InterfaceC213868aM
            public final void Q() {
                StoryImmersiveUserFeedComponent.this.LLII.scrollToNext();
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.ability.ISkylightDetailAbility
    public final void Pk0(int i, Aweme aweme) {
        InterfaceC222838op interfaceC222838op;
        InterfaceC51771KTn interfaceC51771KTn = (BaseDetailShareVM) this.LLF.getValue();
        if ((interfaceC51771KTn instanceof InterfaceC222838op) && (interfaceC222838op = (InterfaceC222838op) interfaceC51771KTn) != null) {
            interfaceC222838op.qN(i, aweme);
        }
    }
}
