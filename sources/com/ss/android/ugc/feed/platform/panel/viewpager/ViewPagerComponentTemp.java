package com.ss.android.ugc.feed.platform.panel.viewpager;

import X.AbstractC48820JEa;
import X.AbstractC55082Lja;
import X.C221108m2;
import X.C2M0;
import X.C2M2;
import X.C2M3;
import X.C2M5;
import X.C2MA;
import X.C2MJ;
import X.C2Q3;
import X.C38354F3m;
import X.C54838Lfe;
import X.C55723Ltv;
import X.C57112Lz;
import X.C57202Mi;
import X.C59542Vi;
import X.C62822Ol8;
import X.C72083SQt;
import X.C76A;
import X.C80796VnM;
import X.C80802VnS;
import X.C80815Vnf;
import X.C84763XOl;
import X.C86793Y4n;
import X.InterfaceC55062LjG;
import android.text.TextUtils;
import android.view.View;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryKt;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS41S0001000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ViewPagerComponentTemp implements IViewPagerComponentAbility {
    public static final /* synthetic */ int LJLLLL = 0;
    public C80796VnM LJLIL;
    public BaseListFragmentPanel LJLILLLLZI;
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 756));
    public boolean LJLJJI;
    public boolean LJLJJL;
    public int LJLJJLL;
    public Object LJLJL;
    public C2MA LJLJLJ;
    public int LJLJLLL;
    public C2MA LJLL;
    public int LJLLI;
    public final CopyOnWriteArrayList<C2MJ> LJLLILLLL;
    public boolean LJLLJ;
    public final C62822Ol8 LJLLL;

    public final C2MA LIZJ() {
        C2MA c2ma;
        C80796VnM c80796VnM = this.LJLIL;
        if (c80796VnM == null) {
            return null;
        }
        int i = this.LJLJLLL;
        if (i > 0 && C2M0.LIZ == 2 && i == c80796VnM.getCurrentItem()) {
            return this.LJLL;
        }
        if (LIZ(c80796VnM.getCurrentItem(), this.LJLL)) {
            this.LJLJLLL = c80796VnM.getCurrentItem();
            return this.LJLL;
        }
        for (int childCount = c80796VnM.getChildCount() - 1; -1 < childCount; childCount--) {
            Object TQ = TQ(childCount);
            if (TQ instanceof C2MA) {
                c2ma = (C2MA) TQ;
            } else {
                c2ma = null;
            }
            if (LIZ(c80796VnM.getCurrentItem(), c2ma)) {
                return c2ma;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final List<C2MA> getAllViewHolders() {
        List<C2MA> allViewHolders;
        ArrayList arrayList = new ArrayList();
        if (!C2M5.LIZ()) {
            C80796VnM c80796VnM = this.LJLIL;
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
        IViewPagerComponentAbility viewPagerComponentAbility = getViewPagerComponentAbility();
        if (viewPagerComponentAbility == null || (allViewHolders = viewPagerComponentAbility.getAllViewHolders()) == null) {
            return arrayList;
        }
        return allViewHolders;
    }

    public final IViewPagerComponentAbility getViewPagerComponentAbility() {
        return (IViewPagerComponentAbility) this.LJLJI.getValue();
    }

    public ViewPagerComponentTemp() {
        C221108m2.LIZIZ(new AqS151S0100000_1(this, 755));
        this.LJLJLLL = ViewPagerPanelComponent.LJZL;
        this.LJLLILLLL = new CopyOnWriteArrayList<>();
        this.LJLLL = C221108m2.LIZIZ(C57112Lz.LJLIL);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final int FQ() {
        if (!C2M5.LIZ()) {
            return this.LJLLI;
        }
        IViewPagerComponentAbility viewPagerComponentAbility = getViewPagerComponentAbility();
        if (viewPagerComponentAbility != null) {
            return viewPagerComponentAbility.FQ();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility
    public final int K40() {
        C80796VnM LJJIIJ = C86793Y4n.LJJIIJ(this);
        if (LJJIIJ != null) {
            return LJJIIJ.getExpectedAdapterCount();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final C2MA K80() {
        if (!C2M5.LIZ()) {
            return this.LJLL;
        }
        IViewPagerComponentAbility viewPagerComponentAbility = getViewPagerComponentAbility();
        if (viewPagerComponentAbility != null) {
            return viewPagerComponentAbility.K80();
        }
        return null;
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
    public final void Qc0() {
        if (!C2M5.LIZ()) {
            this.LJLLJ = false;
            return;
        }
        IViewPagerComponentAbility viewPagerComponentAbility = getViewPagerComponentAbility();
        if (viewPagerComponentAbility == null) {
            return;
        }
        viewPagerComponentAbility.Qc0();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final Aweme fq0() {
        int i;
        InterfaceC55062LjG adapter;
        if (!C2M5.LIZ()) {
            BaseListFragmentPanel baseListFragmentPanel = this.LJLILLLLZI;
            if (baseListFragmentPanel == null) {
                return null;
            }
            C80796VnM c80796VnM = this.LJLIL;
            if (c80796VnM != null) {
                i = c80796VnM.getCurrentItem();
            } else {
                i = baseListFragmentPanel.mCurIndex;
            }
            if (i <= 0 || baseListFragmentPanel.getAdapter() == null || (adapter = baseListFragmentPanel.getAdapter()) == null) {
                return null;
            }
            return adapter.getItem(i - 1);
        }
        IViewPagerComponentAbility viewPagerComponentAbility = getViewPagerComponentAbility();
        if (viewPagerComponentAbility == null) {
            return null;
        }
        return viewPagerComponentAbility.fq0();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final C2MA getCurFeedViewHolderExcludeLive() {
        if (!C2M5.LIZ()) {
            C2MA curViewHolder = getCurViewHolder();
            if (curViewHolder == null || BaseListFragmentPanel.isLiveViewHolder(curViewHolder)) {
                return null;
            }
            return curViewHolder;
        }
        IViewPagerComponentAbility viewPagerComponentAbility = getViewPagerComponentAbility();
        if (viewPagerComponentAbility == null) {
            return null;
        }
        return viewPagerComponentAbility.getCurFeedViewHolderExcludeLive();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final C2MA getCurViewHolder() {
        if (!C2M5.LIZ()) {
            if (((Boolean) C57202Mi.LIZIZ.getValue()).booleanValue()) {
                C2MA c2ma = this.LJLJLJ;
                if (c2ma != null) {
                    return c2ma;
                }
                C2MA LIZJ = LIZJ();
                this.LJLJLJ = LIZJ;
                return LIZJ;
            }
            return LIZJ();
        }
        IViewPagerComponentAbility viewPagerComponentAbility = getViewPagerComponentAbility();
        if (viewPagerComponentAbility != null) {
            return viewPagerComponentAbility.getCurViewHolder();
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final Aweme getCurrentAweme() {
        if (!C2M5.LIZ()) {
            return C72083SQt.LJJLIIIJJIZ(getCurViewHolder());
        }
        IViewPagerComponentAbility viewPagerComponentAbility = getViewPagerComponentAbility();
        if (viewPagerComponentAbility != null) {
            return viewPagerComponentAbility.getCurrentAweme();
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final Aweme getCurrentPlayAweme() {
        C80796VnM c80796VnM;
        Aweme aweme = null;
        if (!C2M5.LIZ()) {
            BaseListFragmentPanel baseListFragmentPanel = this.LJLILLLLZI;
            if (baseListFragmentPanel == null || (c80796VnM = this.LJLIL) == null) {
                return null;
            }
            InterfaceC55062LjG adapter = baseListFragmentPanel.getAdapter();
            if (adapter != null) {
                aweme = adapter.getItem(c80796VnM.getCurrentItem());
            }
            Aweme currentPlayAwemeInStoryCollectionAweme = getCurrentPlayAwemeInStoryCollectionAweme(aweme);
            if (currentPlayAwemeInStoryCollectionAweme == null) {
                return aweme;
            }
            return currentPlayAwemeInStoryCollectionAweme;
        }
        IViewPagerComponentAbility viewPagerComponentAbility = getViewPagerComponentAbility();
        if (viewPagerComponentAbility == null) {
            return null;
        }
        return viewPagerComponentAbility.getCurrentPlayAweme();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility
    public final int getHeight() {
        C80796VnM LJJIIJ = C86793Y4n.LJJIIJ(this);
        if (LJJIIJ != null) {
            return LJJIIJ.getHeight();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final C2MA getNextViewHolder() {
        C2MA c2ma;
        if (!C2M5.LIZ()) {
            C80796VnM c80796VnM = this.LJLIL;
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
                if (LIZ(c80796VnM.getCurrentItem() + 1, c2ma)) {
                    return c2ma;
                }
            }
            return null;
        }
        IViewPagerComponentAbility viewPagerComponentAbility = getViewPagerComponentAbility();
        if (viewPagerComponentAbility == null) {
            return null;
        }
        return viewPagerComponentAbility.getNextViewHolder();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final C2MA getPreViewHolder() {
        C2MA c2ma;
        if (!C2M5.LIZ()) {
            C80796VnM c80796VnM = this.LJLIL;
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
                if (LIZ(c80796VnM.getCurrentItem() - 1, c2ma)) {
                    return c2ma;
                }
            }
            return null;
        }
        IViewPagerComponentAbility viewPagerComponentAbility = getViewPagerComponentAbility();
        if (viewPagerComponentAbility == null) {
            return null;
        }
        return viewPagerComponentAbility.getPreViewHolder();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final boolean isScrollDragging() {
        if (!C2M5.LIZ()) {
            return this.LJLJJL;
        }
        IViewPagerComponentAbility viewPagerComponentAbility = getViewPagerComponentAbility();
        if (viewPagerComponentAbility != null) {
            return viewPagerComponentAbility.isScrollDragging();
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility
    public final C80796VnM mj0() {
        return C86793Y4n.LJJIIJ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final void scrollToNext() {
        int i;
        InterfaceC55062LjG adapter;
        if (!C2M5.LIZ()) {
            C80796VnM c80796VnM = this.LJLIL;
            if (c80796VnM == null) {
                return;
            }
            int currentItem = c80796VnM.getCurrentItem();
            int i2 = currentItem + 1;
            BaseListFragmentPanel baseListFragmentPanel = this.LJLILLLLZI;
            if (baseListFragmentPanel != null && (adapter = baseListFragmentPanel.getAdapter()) != null) {
                i = adapter.getCount();
            } else {
                i = 0;
            }
            if (i2 < i) {
                c80796VnM.setCurrentItemWithDefaultVelocity(i2);
            }
            ((AbstractC48820JEa) this.LJLLL.getValue()).LJIIJ(new AqS41S0001000_1(currentItem, 2));
            return;
        }
        IViewPagerComponentAbility viewPagerComponentAbility = getViewPagerComponentAbility();
        if (viewPagerComponentAbility != null) {
            viewPagerComponentAbility.scrollToNext();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final boolean u20() {
        C2MA c2ma;
        boolean z = false;
        if (!C2M5.LIZ()) {
            C80796VnM c80796VnM = this.LJLIL;
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
                if (LIZ(c80796VnM.getCurrentItem(), c2ma)) {
                    c2ma2 = c2ma;
                }
            }
            if (this.LJLL != c2ma2) {
                z = true;
            }
            this.LJLL = c2ma2;
            return z;
        }
        IViewPagerComponentAbility viewPagerComponentAbility = getViewPagerComponentAbility();
        if (viewPagerComponentAbility == null) {
            return false;
        }
        return viewPagerComponentAbility.u20();
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

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility
    public final View getView() {
        return this.LJLIL;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final void Cp(C2MJ c2mj) {
        if (!C2M5.LIZ()) {
            this.LJLLILLLL.remove(c2mj);
            return;
        }
        IViewPagerComponentAbility viewPagerComponentAbility = getViewPagerComponentAbility();
        if (viewPagerComponentAbility == null) {
            return;
        }
        viewPagerComponentAbility.Cp(c2mj);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final Aweme DQ(Aweme aweme) {
        int i;
        Aweme aweme2;
        C2MA preViewHolder;
        Aweme aweme3 = null;
        if (!C2M5.LIZ()) {
            BaseListFragmentPanel baseListFragmentPanel = this.LJLILLLLZI;
            if (baseListFragmentPanel == null) {
                return null;
            }
            C80796VnM c80796VnM = this.LJLIL;
            if (c80796VnM != null) {
                i = c80796VnM.getCurrentItem();
            } else {
                i = baseListFragmentPanel.mCurIndex;
            }
            if (i <= 0 || baseListFragmentPanel.getAdapter() == null) {
                return null;
            }
            InterfaceC55062LjG adapter = baseListFragmentPanel.getAdapter();
            if (adapter != null) {
                aweme2 = adapter.getItem(i);
            } else {
                aweme2 = null;
            }
            if (aweme2 == aweme || getCurrentPlayAweme() == aweme) {
                InterfaceC55062LjG adapter2 = baseListFragmentPanel.getAdapter();
                if (adapter2 != null) {
                    aweme3 = adapter2.getItem(i - 1);
                }
                if (C54838Lfe.LJJ(aweme3) && (preViewHolder = getPreViewHolder()) != null) {
                    if (C59542Vi.LIZ()) {
                        return preViewHolder.getCurrentAweme();
                    }
                    if (preViewHolder.Y6() != null) {
                        return preViewHolder.Y6().getAweme();
                    }
                }
                return aweme3;
            }
            return aweme2;
        }
        IViewPagerComponentAbility viewPagerComponentAbility = getViewPagerComponentAbility();
        if (viewPagerComponentAbility == null) {
            return null;
        }
        return viewPagerComponentAbility.DQ(aweme);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final void De0(C2MJ c2mj) {
        if (!C2M5.LIZ()) {
            if (this.LJLLILLLL.contains(c2mj)) {
                return;
            }
            if (C2M3.LIZ() == 2 && (c2mj instanceof C2M2)) {
                this.LJLLILLLL.add(0, c2mj);
                return;
            } else {
                this.LJLLILLLL.add(c2mj);
                return;
            }
        }
        IViewPagerComponentAbility viewPagerComponentAbility = getViewPagerComponentAbility();
        if (viewPagerComponentAbility != null) {
            viewPagerComponentAbility.De0(c2mj);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final Object TQ(int i) {
        if (!C2M5.LIZ()) {
            return Fr0(i, ViewPagerPanelComponent.LJZI);
        }
        IViewPagerComponentAbility viewPagerComponentAbility = getViewPagerComponentAbility();
        if (viewPagerComponentAbility != null) {
            return viewPagerComponentAbility.TQ(i);
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final void at(C2MA selectedHolder) {
        o.LJIIIZ(selectedHolder, "selectedHolder");
        if (!C2M5.LIZ()) {
            Iterator<C2MJ> it = this.LJLLILLLL.iterator();
            while (it.hasNext()) {
                it.next().Ye(selectedHolder);
            }
        } else {
            IViewPagerComponentAbility viewPagerComponentAbility = getViewPagerComponentAbility();
            if (viewPagerComponentAbility != null) {
                viewPagerComponentAbility.at(selectedHolder);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final Boolean fK(int i) {
        boolean z;
        if (!C2M5.LIZ()) {
            C80796VnM c80796VnM = this.LJLIL;
            if (c80796VnM != null) {
                z = c80796VnM.LJIILIIL(i);
            } else {
                z = false;
            }
            this.LJLLJ = z;
            return Boolean.valueOf(z);
        }
        IViewPagerComponentAbility viewPagerComponentAbility = getViewPagerComponentAbility();
        if (viewPagerComponentAbility != null) {
            return viewPagerComponentAbility.fK(i);
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final Aweme getCurrentPlayAwemeInStoryCollectionAweme(Aweme aweme) {
        UserStory userStory;
        if (C2M5.LIZ()) {
            return null;
        }
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
            if (aweme == null || (userStory = aweme.getUserStory()) == null) {
                return null;
            }
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
        IViewPagerComponentAbility viewPagerComponentAbility = getViewPagerComponentAbility();
        if (viewPagerComponentAbility == null) {
            return null;
        }
        return viewPagerComponentAbility.getCurrentPlayAwemeInStoryCollectionAweme(aweme);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final C2MA getLastFeedViewHolder(boolean z) {
        C2MA c2ma;
        if (!C2M5.LIZ()) {
            C80796VnM c80796VnM = this.LJLIL;
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
                if (LIZ(i2, c2ma)) {
                    return c2ma;
                }
            }
            return null;
        }
        IViewPagerComponentAbility viewPagerComponentAbility = getViewPagerComponentAbility();
        if (viewPagerComponentAbility == null) {
            return null;
        }
        return viewPagerComponentAbility.getLastFeedViewHolder(z);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final Aweme getNextAweme(Aweme aweme) {
        int i;
        C2MA nextViewHolder;
        if (!C2M5.LIZ()) {
            BaseListFragmentPanel baseListFragmentPanel = this.LJLILLLLZI;
            if (baseListFragmentPanel == null || baseListFragmentPanel.getAdapter() == null) {
                return null;
            }
            C80796VnM c80796VnM = this.LJLIL;
            if (c80796VnM != null) {
                i = c80796VnM.getCurrentItem();
            } else {
                i = baseListFragmentPanel.mCurIndex;
            }
            Aweme item = baseListFragmentPanel.getAdapter().getItem(i);
            if (item == aweme || getCurrentPlayAweme() == aweme) {
                item = baseListFragmentPanel.getAdapter().getItem(i + 1);
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
        IViewPagerComponentAbility viewPagerComponentAbility = getViewPagerComponentAbility();
        if (viewPagerComponentAbility == null) {
            return null;
        }
        return viewPagerComponentAbility.getNextAweme(aweme);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final C2MA getOuterViewHolderByAwemeId(String str) {
        C2MA c2ma;
        if (!C2M5.LIZ()) {
            C80796VnM c80796VnM = this.LJLIL;
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
        IViewPagerComponentAbility viewPagerComponentAbility = getViewPagerComponentAbility();
        if (viewPagerComponentAbility == null) {
            return null;
        }
        return viewPagerComponentAbility.getOuterViewHolderByAwemeId(str);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final C2MA getViewHolderByAwemeId(String str) {
        C2MA c2ma;
        C2MA viewHolderByAwemeId;
        if (!C2M5.LIZ()) {
            C80796VnM c80796VnM = this.LJLIL;
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
        IViewPagerComponentAbility viewPagerComponentAbility = getViewPagerComponentAbility();
        if (viewPagerComponentAbility == null) {
            return null;
        }
        return viewPagerComponentAbility.getViewHolderByAwemeId(str);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final boolean jl(int i) {
        C80815Vnf c80815Vnf;
        if (!C2M5.LIZ()) {
            C80796VnM c80796VnM = this.LJLIL;
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
        IViewPagerComponentAbility viewPagerComponentAbility = getViewPagerComponentAbility();
        if (viewPagerComponentAbility == null) {
            return false;
        }
        return viewPagerComponentAbility.jl(i);
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

    public final void onPageScrollStateChanged(int i) {
        if (!C2M5.LIZ()) {
            this.LJLJLJ = null;
            this.LJLLI = i;
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            this.LJLJJL = z;
            Iterator<C2MJ> it = this.LJLLILLLL.iterator();
            while (it.hasNext()) {
                it.next().onPageScrollStateChanged(i);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final boolean w80(int i) {
        if (!C2M5.LIZ()) {
            return this.LJLLJ;
        }
        IViewPagerComponentAbility viewPagerComponentAbility = getViewPagerComponentAbility();
        if (viewPagerComponentAbility != null) {
            return viewPagerComponentAbility.w80(i);
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final Object Fr0(int i, int i2) {
        View childAt;
        if (!C2M5.LIZ()) {
            C80796VnM c80796VnM = this.LJLIL;
            if (c80796VnM == null || (childAt = c80796VnM.getChildAt(i)) == null) {
                return null;
            }
            return childAt.getTag(i2);
        }
        IViewPagerComponentAbility viewPagerComponentAbility = getViewPagerComponentAbility();
        if (viewPagerComponentAbility == null) {
            return null;
        }
        return viewPagerComponentAbility.Fr0(i, i2);
    }

    public final boolean LIZ(int i, C2MA c2ma) {
        Aweme aweme;
        BaseListFragmentPanel baseListFragmentPanel = this.LJLILLLLZI;
        if (baseListFragmentPanel == null || c2ma == null || baseListFragmentPanel.getAdapter() == null) {
            return false;
        }
        AbstractC55082Lja abstractFeedAdapter = baseListFragmentPanel.getAbstractFeedAdapter();
        if (abstractFeedAdapter != null) {
            aweme = abstractFeedAdapter.LJJIZ(i);
        } else {
            aweme = null;
        }
        Aweme O1 = c2ma.O1();
        if (C54838Lfe.LJJ(aweme)) {
            if (C55723Ltv.LIZIZ.LJIJ().LJIILJJIL(baseListFragmentPanel.getParam().getFrom()) && i == 0) {
                return true;
            }
            if (aweme != null && O1 != null) {
                return TextUtils.equals(aweme.getAid(), O1.getAid());
            }
        } else if (aweme != null && aweme.isFriendsTabFakeAweme() && O1 == null) {
            return true;
        }
        BaseListFragmentPanel baseListFragmentPanel2 = this.LJLILLLLZI;
        if (baseListFragmentPanel2 == null || !baseListFragmentPanel2.getParam().isMyProfile() || ((baseListFragmentPanel2.getParam().getPageType() != 1000 && baseListFragmentPanel2.getParam().getPageType() != 1014) || !C76A.LIZ() || aweme == null || O1 == null)) {
            if (aweme != O1) {
                return false;
            }
            return true;
        }
        return TextUtils.equals(aweme.getAid(), O1.getAid());
    }

    public final void LIZIZ(Object obj, boolean z) {
        View view;
        C2MA c2ma;
        if (!(obj instanceof View) || (view = (View) obj) == null) {
            return;
        }
        Object tag = view.getTag(ViewPagerPanelComponent.LJZI);
        if ((tag instanceof C2MA) && (c2ma = (C2MA) tag) != null) {
            c2ma.a7(z);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility
    public final boolean ar0(int i, boolean z) {
        BaseListFragmentPanel baseListFragmentPanel;
        InterfaceC55062LjG adapter;
        if (!C2M5.LIZ()) {
            if (i < 0 || (baseListFragmentPanel = this.LJLILLLLZI) == null || (adapter = baseListFragmentPanel.getAdapter()) == null || i > adapter.getCount() - 1) {
                return false;
            }
            if (C84763XOl.LJIIJJI || !z) {
                C80796VnM c80796VnM = this.LJLIL;
                if (c80796VnM != null) {
                    c80796VnM.LJJJ(i, false);
                }
            } else {
                C80796VnM c80796VnM2 = this.LJLIL;
                if (c80796VnM2 != null) {
                    c80796VnM2.setCurrentItemWithDefaultVelocity(i);
                }
            }
            ((AbstractC48820JEa) this.LJLLL.getValue()).LJIIJ(new AqS41S0001000_1(i, 1));
            return true;
        }
        IViewPagerComponentAbility viewPagerComponentAbility = getViewPagerComponentAbility();
        if (viewPagerComponentAbility == null) {
            return false;
        }
        return viewPagerComponentAbility.moveViewPagerToIndex(i);
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
}
