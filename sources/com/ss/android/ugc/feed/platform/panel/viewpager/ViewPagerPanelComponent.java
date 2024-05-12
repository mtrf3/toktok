package com.ss.android.ugc.feed.platform.panel.viewpager;

import X.AbstractC48820JEa;
import X.AbstractC55082Lja;
import X.C0C3;
import X.C16880lQ;
import X.C221108m2;
import X.C221138m5;
import X.C2K0;
import X.C2M0;
import X.C2M2;
import X.C2M3;
import X.C2MA;
import X.C2MG;
import X.C2MH;
import X.C2MJ;
import X.C2Q3;
import X.C37179EiV;
import X.C38354F3m;
import X.C51781KTx;
import X.C54838Lfe;
import X.C55723Ltv;
import X.C57202Mi;
import X.C59542Vi;
import X.C5H3;
import X.C62822Ol8;
import X.C72083SQt;
import X.C76A;
import X.C80796VnM;
import X.C80802VnS;
import X.C80815Vnf;
import X.C84763XOl;
import X.C86793Y4n;
import X.C8MM;
import X.EnumC221088m0;
import X.InterfaceC222068na;
import X.InterfaceC55102Lju;
import X.InterfaceC57182Mg;
import X.JAK;
import X.KR6;
import X.KU4;
import X.M89;
import Y.ARunnableS37S0100000_1;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryKt;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.ViewPagerPanelComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS3S0011000_1;
import kotlin.jvm.internal.AqS41S0001000_1;
import kotlin.jvm.internal.AqS58S0110000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ViewPagerPanelComponent extends BasePanelUIComponent implements KR6, IViewPagerComponentAbility, InterfaceC55102Lju {
    public static final String LJZ = C16880lQ.LJLLJ(ViewPagerPanelComponent.class);
    public static final int LJZI = R.id.d87;
    public static final int LJZL = -1;
    public final C5H3 LJLJJI;
    public C80796VnM LJLJJL;
    public boolean LJLJJLL;
    public int LJLJL;
    public Object LJLJLJ;
    public C2MA LJLJLLL;
    public int LJLL;
    public C2MA LJLLI;
    public int LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public int LJLLLL;
    public final CopyOnWriteArrayList<C2MJ> LJLLLLLL;
    public final C62822Ol8 LJLZ;

    @Override // X.KR6
    public final void LJLLILLLL() {
    }

    @Override // X.KR6
    public final void LLJILJIL() {
    }

    @Override // X.KR6
    public final void LLJLLL() {
    }

    @Override // X.KR6
    public final void LLLIL() {
    }

    @Override // X.KR6
    public final void LLLLLZ(Bundle bundle) {
    }

    @Override // X.KR6
    public final void LLLLZLLLI() {
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final void Qc0() {
        this.LJLLL = false;
    }

    @Override // X.KR6
    public final void W1() {
    }

    @Override // X.KR6
    public final void d5() {
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 1889187972) {
            return null;
        }
        return this;
    }

    @Override // X.KR6
    public final void v() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewPagerPanelComponent() {
        C62822Ol8 c62822Ol8;
        new LinkedHashMap();
        if (JAK.LIZ()) {
            C221138m5 c221138m5 = new C221138m5(EnumC221088m0.PUBLICATION, new AqS151S0100000_1((KU4) this, 757), null);
            C51781KTx.LIZJ(this, c221138m5);
            c62822Ol8 = c221138m5;
        } else {
            c62822Ol8 = C221108m2.LIZIZ(new AqS58S0110000_1(false, (KU4) this, 7));
        }
        this.LJLJJI = c62822Ol8;
        this.LJLL = LJZL;
        this.LJLLLL = -1;
        this.LJLLLLLL = new CopyOnWriteArrayList<>();
        this.LJLZ = C221108m2.LIZIZ(C2MG.LJLIL);
    }

    public final C2MA A3() {
        C2MA c2ma;
        C80796VnM c80796VnM = this.LJLJJL;
        if (c80796VnM == null) {
            return null;
        }
        int i = this.LJLL;
        if (i > 0 && C2M0.LIZ == 2 && i == c80796VnM.getCurrentItem()) {
            return this.LJLLI;
        }
        if (v3(c80796VnM.getCurrentItem(), this.LJLLI)) {
            this.LJLL = c80796VnM.getCurrentItem();
            return this.LJLLI;
        }
        for (int childCount = c80796VnM.getChildCount() - 1; -1 < childCount; childCount--) {
            Object TQ = TQ(childCount);
            if (TQ instanceof C2MA) {
                c2ma = (C2MA) TQ;
            } else {
                c2ma = null;
            }
            if (v3(c80796VnM.getCurrentItem(), c2ma)) {
                return c2ma;
            }
        }
        return null;
    }

    public final IFeedPanelPlatformAbility C3() {
        return (IFeedPanelPlatformAbility) this.LJLJJI.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final List<C2MA> getAllViewHolders() {
        ArrayList arrayList = new ArrayList();
        C80796VnM c80796VnM = this.LJLJJL;
        if (c80796VnM == null) {
            return arrayList;
        }
        for (int childCount = c80796VnM.getChildCount() - 1; -1 < childCount; childCount--) {
            Object TQ = TQ(childCount);
            if ((TQ instanceof C2MA) && TQ != null) {
                arrayList.add(TQ);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final C2MA getCurViewHolder() {
        if (((Boolean) C57202Mi.LIZIZ.getValue()).booleanValue()) {
            C2MA c2ma = this.LJLJLLL;
            if (c2ma != null) {
                return c2ma;
            }
            C2MA A3 = A3();
            this.LJLJLLL = A3;
            return A3;
        }
        return A3();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final C2MA getNextViewHolder() {
        C2MA c2ma;
        C80796VnM c80796VnM = this.LJLJJL;
        if (c80796VnM == null) {
            return null;
        }
        for (int childCount = c80796VnM.getChildCount() - 1; -1 < childCount; childCount--) {
            Object TQ = TQ(childCount);
            if (TQ instanceof C2MA) {
                c2ma = (C2MA) TQ;
            } else {
                c2ma = null;
            }
            if (v3(c80796VnM.getCurrentItem() + 1, c2ma)) {
                return c2ma;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final C2MA getPreViewHolder() {
        C2MA c2ma;
        C80796VnM c80796VnM = this.LJLJJL;
        if (c80796VnM == null || c80796VnM.getCurrentItem() < 1) {
            return null;
        }
        for (int childCount = c80796VnM.getChildCount() - 1; -1 < childCount; childCount--) {
            Object TQ = TQ(childCount);
            if (TQ instanceof C2MA) {
                c2ma = (C2MA) TQ;
            } else {
                c2ma = null;
            }
            if (v3(c80796VnM.getCurrentItem() - 1, c2ma)) {
                return c2ma;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final void scrollToNext() {
        int i;
        AbstractC55082Lja abstractFeedAdapter;
        C80796VnM c80796VnM = this.LJLJJL;
        if (c80796VnM == null) {
            return;
        }
        int currentItem = c80796VnM.getCurrentItem();
        int i2 = currentItem + 1;
        IFeedPanelPlatformAbility C3 = C3();
        if (C3 != null && (abstractFeedAdapter = C3.getAbstractFeedAdapter()) != null) {
            i = abstractFeedAdapter.getCount();
        } else {
            i = 0;
        }
        if (i2 < i) {
            c80796VnM.setCurrentItemWithDefaultVelocity(i2);
        }
        ((AbstractC48820JEa) this.LJLZ.getValue()).LJIIJ(new AqS41S0001000_1(currentItem, 3));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final boolean u20() {
        C2MA c2ma;
        C80796VnM c80796VnM = this.LJLJJL;
        boolean z = false;
        if (c80796VnM == null) {
            return false;
        }
        int childCount = c80796VnM.getChildCount();
        C2MA c2ma2 = null;
        for (int i = 0; i < childCount; i++) {
            Object TQ = TQ(i);
            if (TQ instanceof C2MA) {
                c2ma = (C2MA) TQ;
            } else {
                c2ma = null;
            }
            if (v3(c80796VnM.getCurrentItem(), c2ma)) {
                c2ma2 = c2ma;
            }
        }
        if (this.LJLLI != c2ma2) {
            z = true;
        }
        this.LJLLI = c2ma2;
        return z;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility
    public final int K40() {
        C80796VnM LJJIIJ = C86793Y4n.LJJIIJ(this);
        if (LJJIIJ != null) {
            return LJJIIJ.getExpectedAdapterCount();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility
    public final PagerAdapter LJJLIIIJJIZ() {
        C80796VnM LJJIIJ = C86793Y4n.LJJIIJ(this);
        if (LJJIIJ != null) {
            return LJJIIJ.getAdapter();
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility
    public final int LLILL() {
        C80796VnM LJJIIJ = C86793Y4n.LJJIIJ(this);
        if (LJJIIJ != null) {
            return LJJIIJ.getCurrentItem();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final Aweme fq0() {
        AbstractC55082Lja abstractC55082Lja;
        int currentIndex;
        IFeedPanelPlatformAbility C3 = C3();
        if (C3 != null) {
            abstractC55082Lja = C3.getAbstractFeedAdapter();
        } else {
            abstractC55082Lja = null;
        }
        C80796VnM c80796VnM = this.LJLJJL;
        if (c80796VnM != null) {
            currentIndex = c80796VnM.getCurrentItem();
        } else {
            IFeedPanelPlatformAbility C32 = C3();
            if (C32 != null) {
                currentIndex = C32.getCurrentIndex();
            }
            return null;
        }
        if (currentIndex > 0 && abstractC55082Lja != null) {
            return abstractC55082Lja.getItem(currentIndex - 1);
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final C2MA getCurFeedViewHolderExcludeLive() {
        C2MA curViewHolder = getCurViewHolder();
        if (curViewHolder == null || BaseListFragmentPanel.isLiveViewHolder(curViewHolder)) {
            return null;
        }
        return curViewHolder;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final Aweme getCurrentAweme() {
        return C72083SQt.LJJLIIIJJIZ(getCurViewHolder());
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final Aweme getCurrentPlayAweme() {
        AbstractC55082Lja abstractC55082Lja;
        IFeedPanelPlatformAbility C3 = C3();
        Aweme aweme = null;
        if (C3 != null) {
            abstractC55082Lja = C3.getAbstractFeedAdapter();
        } else {
            abstractC55082Lja = null;
        }
        C80796VnM c80796VnM = this.LJLJJL;
        if (c80796VnM == null) {
            return null;
        }
        if (abstractC55082Lja != null) {
            aweme = abstractC55082Lja.getItem(c80796VnM.getCurrentItem());
        }
        Aweme currentPlayAwemeInStoryCollectionAweme = getCurrentPlayAwemeInStoryCollectionAweme(aweme);
        if (currentPlayAwemeInStoryCollectionAweme == null) {
            return aweme;
        }
        return currentPlayAwemeInStoryCollectionAweme;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility
    public final int getHeight() {
        C80796VnM LJJIIJ = C86793Y4n.LJJIIJ(this);
        if (LJJIIJ != null) {
            return LJJIIJ.getHeight();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility
    public final C80796VnM mj0() {
        return C86793Y4n.LJJIIJ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        List<C0C3> list;
        super.onDestroy();
        C80796VnM c80796VnM = this.LJLJJL;
        if (c80796VnM != null && (list = c80796VnM.LLJILJIL) != null) {
            ((CopyOnWriteArrayList) list).clear();
        }
        this.LJLLLLLL.clear();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C37179EiV.LJFF.post(new ARunnableS37S0100000_1(this, 57));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility
    public final int v8() {
        C80796VnM LJJIIJ = C86793Y4n.LJJIIJ(this);
        if (LJJIIJ != null) {
            return LJJIIJ.getScrollState();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility
    public final C80796VnM zq0() {
        return C86793Y4n.LJJIIJ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final int FQ() {
        return this.LJLLILLLL;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final C2MA K80() {
        return this.LJLLI;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility
    public final View getView() {
        return this.LJLJJL;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final boolean isScrollDragging() {
        return this.LJLLJ;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final void Cp(C2MJ c2mj) {
        this.LJLLLLLL.remove(c2mj);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final Aweme DQ(Aweme aweme) {
        AbstractC55082Lja abstractFeedAdapter;
        int currentIndex;
        C2MA preViewHolder;
        IFeedPanelPlatformAbility C3 = C3();
        if (C3 != null && (abstractFeedAdapter = C3.getAbstractFeedAdapter()) != null) {
            C80796VnM c80796VnM = this.LJLJJL;
            if (c80796VnM != null) {
                currentIndex = c80796VnM.getCurrentItem();
            } else {
                IFeedPanelPlatformAbility C32 = C3();
                if (C32 != null) {
                    currentIndex = C32.getCurrentIndex();
                }
            }
            if (currentIndex > 0) {
                Aweme item = abstractFeedAdapter.getItem(currentIndex);
                if (item != aweme && getCurrentPlayAweme() != aweme) {
                    return item;
                }
                Aweme item2 = abstractFeedAdapter.getItem(currentIndex - 1);
                if (!C54838Lfe.LJJ(item2) || (preViewHolder = getPreViewHolder()) == null) {
                    return item2;
                }
                if (C59542Vi.LIZ()) {
                    return preViewHolder.getCurrentAweme();
                }
                if (preViewHolder.Y6() == null) {
                    return item2;
                }
                return preViewHolder.Y6().getAweme();
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final void De0(C2MJ c2mj) {
        if (this.LJLLLLLL.contains(c2mj)) {
            return;
        }
        if (C2M3.LIZ() == 2 && (c2mj instanceof C2M2)) {
            this.LJLLLLLL.add(0, c2mj);
        } else {
            this.LJLLLLLL.add(c2mj);
        }
    }

    public final void E3(View view) {
        if (!o.LJ(this.LJLJJL, view)) {
            o.LJII(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.common.widget.VerticalViewPager");
            C80796VnM c80796VnM = (C80796VnM) view;
            this.LJLJJL = c80796VnM;
            c80796VnM.setFixDispatchFirstSelected(true);
            C80796VnM c80796VnM2 = this.LJLJJL;
            if (c80796VnM2 != null) {
                c80796VnM2.LJI(new InterfaceC57182Mg() { // from class: X.2MI
                    @Override // X.C0C3
                    public final void onPageScrollStateChanged(int i) {
                        ViewPagerPanelComponent viewPagerPanelComponent = ViewPagerPanelComponent.this;
                        viewPagerPanelComponent.LJLJLLL = null;
                        viewPagerPanelComponent.LJLLILLLL = i;
                        boolean z = true;
                        if (i != 1) {
                            z = false;
                        }
                        viewPagerPanelComponent.LJLLJ = z;
                        Iterator<C2MJ> it = viewPagerPanelComponent.LJLLLLLL.iterator();
                        while (it.hasNext()) {
                            it.next().onPageScrollStateChanged(i);
                        }
                    }

                    @Override // X.C0C3
                    public final void onPageSelected(int i) {
                        C2NL.LIZ.LIZ(ILW.PAGE_SELECT_COMPONENT_TOTAL);
                        ViewPagerPanelComponent viewPagerPanelComponent = ViewPagerPanelComponent.this;
                        viewPagerPanelComponent.LJLJLLL = null;
                        viewPagerPanelComponent.LJLLJ = false;
                        ((AbstractC48820JEa) viewPagerPanelComponent.LJLZ.getValue()).LJIIJ(new AqS41S0001000_1(i, 6));
                        ViewPagerPanelComponent viewPagerPanelComponent2 = ViewPagerPanelComponent.this;
                        viewPagerPanelComponent2.LJLLLL = i;
                        boolean jl = viewPagerPanelComponent2.jl(i);
                        Iterator<C2MJ> it = ViewPagerPanelComponent.this.LJLLLLLL.iterator();
                        while (it.hasNext()) {
                            C2MJ next = it.next();
                            next.onPageSelected(i);
                            next.e(i, jl);
                        }
                        ILX ilx = C2NL.LIZ;
                        ilx.LJIJI = ViewPagerPanelComponent.this.LJLLLLLL.size();
                        ilx.LIZIZ(ILW.PAGE_SELECT_COMPONENT_TOTAL);
                    }

                    @Override // X.C0C3
                    public final void onPageScrolled(int i, float f, int i2) {
                        ViewPagerPanelComponent viewPagerPanelComponent = ViewPagerPanelComponent.this;
                        viewPagerPanelComponent.LJLJLLL = null;
                        if (viewPagerPanelComponent.C3() != null) {
                            C80796VnM c80796VnM3 = viewPagerPanelComponent.LJLJJL;
                            if (c80796VnM3 != null && c80796VnM3.getScrollState() == 1 && viewPagerPanelComponent.LJLJJLL) {
                                VL7.LIZIZ(new ARunnableS37S0100000_1(viewPagerPanelComponent, 113), C56509MFt.LJIIJ(viewPagerPanelComponent.getPanelContext()));
                            }
                            viewPagerPanelComponent.LJLL = ViewPagerPanelComponent.LJZL;
                        }
                        ViewPagerPanelComponent viewPagerPanelComponent2 = ViewPagerPanelComponent.this;
                        Iterator<C2MJ> it = viewPagerPanelComponent2.LJLLLLLL.iterator();
                        while (it.hasNext()) {
                            C2MJ next = it.next();
                            if (i == viewPagerPanelComponent2.LJLLLL && f < 1.0E-10f) {
                                next.J8(i);
                            }
                            next.onPageScrolled(i, f, i2);
                        }
                        ViewPagerPanelComponent viewPagerPanelComponent3 = ViewPagerPanelComponent.this;
                        if (i == viewPagerPanelComponent3.LJLLLL && f < 1.0E-10f) {
                            viewPagerPanelComponent3.LJLLLL = -1;
                        }
                    }
                });
            }
        }
    }

    @Override // X.KR6
    public final void LLIIIJ(Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
    }

    @Override // X.KR6
    public final void LLLII(Bundle outState) {
        o.LJIIIZ(outState, "outState");
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final Object TQ(int i) {
        return Fr0(i, LJZI);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final void at(C2MA selectedHolder) {
        o.LJIIIZ(selectedHolder, "selectedHolder");
        Iterator<C2MJ> it = this.LJLLLLLL.iterator();
        while (it.hasNext()) {
            it.next().Ye(selectedHolder);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, X.KUK
    public final void eventInit(C8MM c8mm) {
        c8mm.LIZ("event_on_render_first_frame", new AqS167S0100000_1(this, 205));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final Boolean fK(int i) {
        boolean z;
        C80796VnM c80796VnM = this.LJLJJL;
        if (c80796VnM != null) {
            z = c80796VnM.LJIILIIL(i);
        } else {
            z = false;
        }
        this.LJLLL = z;
        return Boolean.valueOf(z);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final Aweme getCurrentPlayAwemeInStoryCollectionAweme(Aweme aweme) {
        UserStory userStory;
        if (C54838Lfe.LJJ(aweme)) {
            C2MA curViewHolder = getCurViewHolder();
            if (curViewHolder != null) {
                if (!C59542Vi.LIZ()) {
                    C2MA Y6 = curViewHolder.Y6();
                    if (Y6 != null) {
                        return Y6.getAweme();
                    }
                } else if (C59542Vi.LIZ()) {
                    return curViewHolder.getCurrentAweme();
                }
            }
            if (aweme != null && (userStory = aweme.getUserStory()) != null) {
                if (UserStoryKt.currentStory(userStory) != null) {
                    return UserStoryKt.currentStory(userStory);
                }
                if (userStory.getStories().size() == 0) {
                    return null;
                }
                if (UserStoryKt.currentStory(userStory) == null) {
                    return (Aweme) ListProtector.get(userStory.getStories(), 0);
                }
                return UserStoryKt.currentStory(userStory);
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final C2MA getLastFeedViewHolder(boolean z) {
        C2MA c2ma;
        C80796VnM c80796VnM = this.LJLJJL;
        if (c80796VnM == null) {
            return null;
        }
        int childCount = c80796VnM.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Object TQ = TQ(i);
            if (TQ instanceof C2MA) {
                c2ma = (C2MA) TQ;
            } else {
                c2ma = null;
            }
            int currentItem = c80796VnM.getCurrentItem();
            int i2 = z ? currentItem - 1 : currentItem + 1;
            if (i2 < 0) {
                return null;
            }
            if (v3(i2, c2ma)) {
                return c2ma;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final Aweme getNextAweme(Aweme aweme) {
        AbstractC55082Lja abstractFeedAdapter;
        int i;
        C2MA nextViewHolder;
        IFeedPanelPlatformAbility C3 = C3();
        if (C3 == null || (abstractFeedAdapter = C3.getAbstractFeedAdapter()) == null) {
            return null;
        }
        C80796VnM c80796VnM = this.LJLJJL;
        if (c80796VnM != null) {
            i = c80796VnM.getCurrentItem();
        } else {
            IFeedPanelPlatformAbility C32 = C3();
            if (C32 != null) {
                i = C32.getCurrentIndex();
            } else {
                i = 0;
            }
        }
        Aweme item = abstractFeedAdapter.getItem(i);
        if (item == aweme || getCurrentPlayAweme() == aweme) {
            item = abstractFeedAdapter.getItem(i + 1);
            if (C54838Lfe.LJJ(item) && (nextViewHolder = getNextViewHolder()) != null) {
                if (C59542Vi.LIZ()) {
                    return nextViewHolder.getCurrentAweme();
                }
                if (nextViewHolder.Y6() != null) {
                    return nextViewHolder.Y6().getAweme();
                }
            }
        }
        return item;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final C2MA getOuterViewHolderByAwemeId(String str) {
        C2MA c2ma;
        C80796VnM c80796VnM = this.LJLJJL;
        if (c80796VnM == null) {
            return null;
        }
        int childCount = c80796VnM.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Object TQ = TQ(i);
            if ((TQ instanceof C2MA) && (c2ma = (C2MA) TQ) != null && c2ma.O1() != null && C38354F3m.LIZJ(c2ma.O1().getAid(), str)) {
                return c2ma;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final C2MA getViewHolderByAwemeId(String str) {
        C2MA c2ma;
        C2MA viewHolderByAwemeId;
        C80796VnM c80796VnM = this.LJLJJL;
        if (c80796VnM == null) {
            return null;
        }
        int childCount = c80796VnM.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Object TQ = TQ(i);
            if ((TQ instanceof C2MA) && (c2ma = (C2MA) TQ) != null && c2ma.O1() != null) {
                if (C38354F3m.LIZJ(c2ma.O1().getAid(), str) && !C54838Lfe.LJJ(c2ma.O1())) {
                    return c2ma;
                }
                if (C54838Lfe.LJJ(c2ma.O1()) && (viewHolderByAwemeId = c2ma.getViewHolderByAwemeId(str)) != null) {
                    return viewHolderByAwemeId;
                }
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final boolean jl(int i) {
        C80815Vnf c80815Vnf;
        C80796VnM c80796VnM = this.LJLJJL;
        if (c80796VnM == null) {
            return false;
        }
        C80802VnS c80802VnS = c80796VnM.LLJJIJI;
        c80802VnS.getClass();
        if (!C2Q3.LIZ || !c80802VnS.LIZIZ || (c80815Vnf = c80802VnS.LIZ) == null || c80815Vnf.LIZIZ != i) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility
    public final void lo0(boolean z) {
        C80796VnM LJJIIJ = C86793Y4n.LJJIIJ(this);
        if (LJJIIJ != null) {
            LJJIIJ.setIsTriggerByAutoPlay(z);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final boolean moveViewPagerToIndex(int i) {
        return ar0(i, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0119, code lost:
    
        if (r1.booleanValue() != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008c, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r1, "Friends") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a4, code lost:
    
        if (X.C222978p3.LIZ().suppressViewPagerPreload != false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ed  */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r7) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.panel.viewpager.ViewPagerPanelComponent.onViewCreated(android.view.View):void");
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final boolean w80(int i) {
        return this.LJLLL;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final Object Fr0(int i, int i2) {
        View childAt;
        C80796VnM c80796VnM = this.LJLJJL;
        if (c80796VnM != null && (childAt = c80796VnM.getChildAt(i)) != null) {
            return childAt.getTag(i2);
        }
        return null;
    }

    @Override // X.KR6
    public final void LJJJJI(View view, Bundle bundle) {
        View view2 = null;
        if (view != null) {
            view2 = view.findViewById(this.contentLayoutId);
        }
        if ((view2 instanceof C80796VnM) && view2 != null) {
            E3(view2);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final boolean ar0(int i, boolean z) {
        IFeedPanelPlatformAbility C3;
        AbstractC55082Lja abstractFeedAdapter;
        if (i < 0 || (C3 = C3()) == null || (abstractFeedAdapter = C3.getAbstractFeedAdapter()) == null || i > abstractFeedAdapter.getCount() - 1) {
            return false;
        }
        if (C84763XOl.LJIIJJI || !z) {
            C80796VnM c80796VnM = this.LJLJJL;
            if (c80796VnM != null) {
                c80796VnM.LJJJ(i, false);
            }
        } else {
            C80796VnM c80796VnM2 = this.LJLJJL;
            if (c80796VnM2 != null) {
                c80796VnM2.setCurrentItemWithDefaultVelocity(i);
            }
        }
        ((AbstractC48820JEa) this.LJLZ.getValue()).LJIIJ(new AqS3S0011000_1(i, z, 0));
        return true;
    }

    @Override // X.KR6
    public final void j(Activity activity, Fragment fragment) {
        C2MH.LIZ(activity, fragment);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility
    public final boolean postDelayed(Runnable runnable, long j) {
        C80796VnM LJJIIJ = C86793Y4n.LJJIIJ(this);
        if (LJJIIJ != null) {
            return LJJIIJ.postDelayed(runnable, j);
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility
    public final void setCurrentItem(int i, boolean z) {
        C80796VnM LJJIIJ = C86793Y4n.LJJIIJ(this);
        if (LJJIIJ != null) {
            LJJIIJ.LJJJ(i, z);
        }
    }

    public final boolean v3(int i, C2MA c2ma) {
        AbstractC55082Lja abstractFeedAdapter;
        String str;
        IFeedPanelPlatformAbility C3 = C3();
        if (C3 == null || (abstractFeedAdapter = C3.getAbstractFeedAdapter()) == null || c2ma == null) {
            return false;
        }
        Aweme LJJIZ = abstractFeedAdapter.LJJIZ(i);
        Aweme O1 = c2ma.O1();
        if (C54838Lfe.LJJ(LJJIZ)) {
            InterfaceC222068na LJIJ = C55723Ltv.LIZIZ.LJIJ();
            M89 m89 = getPanelContext().LIZJ;
            if (m89 != null) {
                str = m89.getFrom();
            } else {
                str = null;
            }
            if (LJIJ.LJIILJJIL(str) && i == 0) {
                return true;
            }
            if (LJJIZ != null && O1 != null) {
                return TextUtils.equals(LJJIZ.getAid(), O1.getAid());
            }
        } else if (LJJIZ != null && LJJIZ.isFriendsTabFakeAweme() && O1 == null) {
            return true;
        }
        M89 m892 = getPanelContext().LIZJ;
        if (m892 == null || !m892.isMyProfile() || ((m892.getPageType() != 1000 && m892.getPageType() != 1014) || !C76A.LIZ() || LJJIZ == null || O1 == null)) {
            if (LJJIZ != O1) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(LJJIZ.getAid(), O1.getAid());
    }

    public final void x3(Object obj, boolean z) {
        View view;
        C2MA c2ma;
        if (!(obj instanceof View) || (view = (View) obj) == null) {
            return;
        }
        Object tag = view.getTag(LJZI);
        if ((tag instanceof C2MA) && (c2ma = (C2MA) tag) != null) {
            c2ma.a7(z);
        }
    }
}
