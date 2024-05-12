package com.ss.android.ugc.aweme.homepage.ui.view.tab.top;

import X.ActivityC45651qj;
import X.C10K;
import X.C113554cx;
import X.C116694i1;
import X.C15890jp;
import X.C16880lQ;
import X.C1UB;
import X.C221108m2;
import X.C35183DrP;
import X.C36093EEn;
import X.C38995FSd;
import X.C40471FuV;
import X.C45804HyK;
import X.C47261Igj;
import X.C52307Kfv;
import X.C52309Kfx;
import X.C53302Kvy;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55274Lmg;
import X.C62822Ol8;
import X.C68322mC;
import X.C78996UzQ;
import X.C7MY;
import X.C85233Wd;
import X.C8RO;
import X.FCO;
import X.FMX;
import X.InterfaceC225058sP;
import X.InterfaceC54080LKi;
import X.InterfaceC54159LNj;
import X.InterfaceC54196LOu;
import X.LB9;
import X.LEB;
import X.LEC;
import X.LI8;
import X.LJK;
import X.LO3;
import X.LO5;
import X.LO6;
import X.LO7;
import X.LO8;
import X.LO9;
import X.LOC;
import X.LOF;
import X.LOP;
import X.LOR;
import X.LOS;
import X.LOU;
import X.LOX;
import X.OSZ;
import X.QD3;
import X.X1D;
import Y.ARunnableS20S0300000_9;
import Y.ARunnableS45S0100000_9;
import Y.AUListenerS97S0100000_9;
import Y.IDCListenerS246S0100000_9;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.follow.spi.FollowTabAbility;
import com.ss.android.ugc.aweme.homepage.ui.inflate.X2CFragmentMainPageIcon;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.xtab.XTabPanelController;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MainTabStrip implements ITabStrip {
    public static boolean LL;
    public static final C8RO LLD = new C8RO("XTabPanelController");
    public static final HashMap<String, String> LLF;
    public static final HashMap<String, String> LLFF;
    public static final HashMap<String, String> LLFFF;
    public final LOS LJLIL;
    public final FrameLayout LJLILLLLZI;
    public final LOR LJLJI;
    public LOF LJLJJI;
    public InterfaceC225058sP LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public int LJLJLJ;
    public final ActivityC45651qj LJLJLLL;
    public final XTabPanelController LJLL;
    public LO6 LJLLI;
    public LO5 LJLLILLLL;
    public LOP LJLLJ;
    public String LJLLL;
    public String LJLLLL;
    public String LJLLLLLL;
    public int LJLZ;
    public final HashMap<String, InterfaceC54080LKi> LJZ;
    public final C62822Ol8 LJZI;
    public final C62822Ol8 LJZL;

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip
    public final void onDestroy() {
        C55096Ljo.LJIILL(C55230Lly.LIZLLL(this.LJLJLLL, null), IXTabPanelAbility.class, null);
    }

    static {
        HashMap<String, String> LJJJLZIJ = C113554cx.LJJJLZIJ(new OSZ("Following", "homepage_follow"), new OSZ("For You", "homepage_hot"), new OSZ("Popular", "homepage_popular"), new OSZ("FRIENDS_FEED", "homepage_friends"), new OSZ("Nearby", "homepage_nearby"), new OSZ("MUSIC_DSP_XTAB", "homepage_music"), new OSZ("Shop", "homepage_shop_mall"), new OSZ("Stem", "homepage_topic_stem"), new OSZ("homepage_explore", "homepage_explore"), new OSZ("Live", "homepage_live"));
        LO7 lo7 = LO7.LIZIZ;
        lo7.LIZ.I1(LJJJLZIJ);
        LLF = LJJJLZIJ;
        HashMap<String, String> LJJJLZIJ2 = C113554cx.LJJJLZIJ(new OSZ("Following", "homepage_hot"), new OSZ("For You", "homepage_follow"), new OSZ("Popular", "homepage_popular"), new OSZ("Nearby", "homepage_follow"), new OSZ("Friends", "homepage_friends"), new OSZ("Stem", "homepage_topic_stem"));
        lo7.LIZ.I1(LJJJLZIJ2);
        LLFF = LJJJLZIJ2;
        HashMap<String, String> LJJJLZIJ3 = C113554cx.LJJJLZIJ(new OSZ("Following", "enter_homepage_follow"), new OSZ("For You", "enter_homepage_hot"), new OSZ("Popular", "enter_homepage_popular"), new OSZ("Nearby", "enter_homepage_nearby"), new OSZ("MUSIC_DSP_XTAB", "enter_homepage_music"), new OSZ("FRIENDS_FEED", "enter_homepage_friends"), new OSZ("Stem", "enter_topic_tab"), new OSZ("Live", "enter_homepage_live"), new OSZ("homepage_explore", "enter_homepage_explore"));
        lo7.LIZ.K1(LJJJLZIJ3);
        LLFFF = LJJJLZIJ3;
        C113554cx.LJJJLZIJ(new OSZ("Following", "click_follow_tab"), new OSZ("For You", "click_hot_tab"), new OSZ("Popular", "click_popular_tab"), new OSZ("Nearby", "click_nearby_tab"));
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip
    public final void E9() {
        LOS los = this.LJLIL;
        if (los.isAttachedToWindow()) {
            los.post(new ARunnableS45S0100000_9((Object) los, 255));
        }
    }

    public final HomeTabViewModel LIZIZ() {
        return HomeTabViewModel.LJLJLLL.LIZ(this.LJLJLLL);
    }

    public final ActivityC45651qj LIZJ() {
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(this.LJLJLLL);
        o.LJI(LJJIFFI);
        return LJJIFFI;
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip
    public final int W70() {
        if (this.LJLZ < 0) {
            List<TopTabProtocol> topTabProtocolList = this.LJLIL.getTopTabProtocolList();
            if (topTabProtocolList == null) {
                return this.LJLZ;
            }
            int i = 0;
            for (TopTabProtocol topTabProtocol : topTabProtocolList) {
                int i2 = i + 1;
                if (i >= 0) {
                    if (o.LJ(topTabProtocol.getTag(), "For You")) {
                        this.LJLZ = i;
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        return this.LJLZ;
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip
    public final String a9() {
        String str = this.LJLLL;
        if (str == null) {
            return "For You";
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip
    public final void bU() {
        LOS los = this.LJLIL;
        for (int childCount = los.LJLJI.getChildCount() - 1; -1 < childCount; childCount--) {
            View childAt = los.LJLJI.getChildAt(childCount);
            o.LJII(childAt, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.ui.view.tab.top.BorderTabLayout.TabView");
            LOX lox = (LOX) childAt;
            LOU lou = los.LJLJI;
            try {
                if (C78996UzQ.LJJIIJZLJL(lou.getChildAt(childCount))) {
                    C78996UzQ.LJI();
                }
            } catch (Throwable unused) {
            }
            lou.removeViewAt(childCount);
            lox.setTab(null);
            lox.setSelected(false);
            C1UB c1ub = los.LJZL;
            o.LJI(c1ub);
            c1ub.LIZ(lox);
            los.requestLayout();
        }
        Iterator<LOP> it = los.LJLIL.iterator();
        o.LJIIIIZZ(it, "mTabs.iterator()");
        while (it.hasNext()) {
            LOP next = it.next();
            o.LJIIIIZZ(next, "i.next()");
            LOP lop = next;
            it.remove();
            lop.LIZJ = null;
            lop.LIZLLL = null;
            lop.LIZ = -1;
            lop.LIZIZ = null;
            lop.LJ = null;
            LOS.LLILIL.LIZ(lop);
        }
        los.LJLILLLLZI = null;
        this.LJLIL.LJIILL();
        this.LJLZ = -1;
        LIZ();
        LLD.LIZLLL("reloadTab:, remove all tabs, add new tabs");
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip
    public final boolean gN() {
        int i;
        Object obj;
        LOF lof = this.LJLJJI;
        if (lof != null) {
            i = lof.getCurrentItemCompat();
        } else {
            i = -1;
        }
        LOP LJIIJ = this.LJLIL.LJIIJ(i);
        if (LJIIJ != null) {
            obj = LJIIJ.LJ;
        } else {
            obj = null;
        }
        if (o.LJ(obj, "For You")) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip
    public final InterfaceC54159LNj lq() {
        XTabPanelController xTabPanelController = this.LJLL;
        if (xTabPanelController != null) {
            return new LO8(xTabPanelController);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0271, code lost:
    
        if (r6 != false) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instructions count: 838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.MainTabStrip.LIZ():void");
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip
    public final void bf0() {
        ViewGroup.LayoutParams layoutParams;
        int LIZJ = LEB.LIZJ();
        int LIZLLL = LEB.LIZLLL();
        FrameLayout frameLayout = this.LJLILLLLZI;
        if (frameLayout != null) {
            layoutParams = frameLayout.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            if (C40471FuV.LIZ()) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(LIZJ);
                marginLayoutParams.setMarginEnd(LIZLLL);
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams2.setMarginStart(0);
                marginLayoutParams2.setMarginEnd(0);
            }
        }
        FrameLayout frameLayout2 = this.LJLILLLLZI;
        if (frameLayout2 != null) {
            frameLayout2.setLayoutParams(layoutParams);
        }
        this.LJLIL.setTextSize(LEC.LIZIZ(LIZIZ(), this.LJLJLLL));
        this.LJLIL.LJ();
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip
    public final void cu() {
        this.LJLIL.setTextSize(LEC.LIZIZ(LIZIZ(), this.LJLJLLL));
        this.LJLIL.LJ();
        this.LJLIL.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip
    public final LOS sj0() {
        return this.LJLIL;
    }

    public MainTabStrip(FrameLayout viewGroup) {
        LOS los;
        FrameLayout.LayoutParams layoutParams;
        o.LJIIIZ(viewGroup, "viewGroup");
        this.LJLJLJ = -1;
        this.LJLZ = -1;
        this.LJZ = new HashMap<>();
        this.LJZI = C221108m2.LIZIZ(LI8.LJLIL);
        this.LJZL = C221108m2.LIZIZ(LOC.LJLIL);
        if (C35183DrP.LIZIZ()) {
            C36093EEn c36093EEn = C36093EEn.LIZ;
            X2CFragmentMainPageIcon x2CFragmentMainPageIcon = new X2CFragmentMainPageIcon();
            c36093EEn.getClass();
            X2CFragmentMainPageIcon x2CFragmentMainPageIcon2 = (X2CFragmentMainPageIcon) C36093EEn.LJFF(x2CFragmentMainPageIcon);
            LOS los2 = x2CFragmentMainPageIcon2.LJLJI;
            if (los2 != null) {
                if (los2.getParent() != null) {
                    ViewParent parent = los2.getParent();
                    o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    C16880lQ.LJLLL(los2, (ViewGroup) parent);
                }
                los = x2CFragmentMainPageIcon2.LJLJI;
                x2CFragmentMainPageIcon2.LJLJI = null;
                if (los != null) {
                    this.LJLJL = true;
                }
            }
            Context context = viewGroup.getContext();
            o.LJIIIIZZ(context, "viewGroup.context");
            los = new LOS(context);
        } else {
            Context context2 = viewGroup.getContext();
            o.LJIIIIZZ(context2, "viewGroup.context");
            los = new LOS(context2);
        }
        this.LJLIL = los;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        los.setLayoutParams(layoutParams2);
        los.setBackgroundColor(viewGroup.getContext().getResources().getColor(R.color.cz));
        los.addOnAttachStateChangeListener(new IDCListenerS246S0100000_9(this, 1));
        if (C52309Kfx.LIZ() || C52307Kfv.LIZ() || C40471FuV.LIZ()) {
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            this.LJLILLLLZI = frameLayout;
            if (C40471FuV.LIZ()) {
                layoutParams = new FrameLayout.LayoutParams(-1, -2);
            } else {
                layoutParams = new FrameLayout.LayoutParams(-2, -2);
            }
            layoutParams.gravity = 17;
            if (C40471FuV.LIZ()) {
                layoutParams.gravity = 16;
            }
            frameLayout.setLayoutParams(layoutParams);
            layoutParams2.gravity = 17;
            los.setLayoutParams(layoutParams2);
            frameLayout.addView(los);
            viewGroup.addView(frameLayout, 0);
        } else {
            los.setLayoutParams(layoutParams2);
            viewGroup.addView(los, 0);
        }
        Context context3 = los.getContext();
        o.LJIIIIZZ(context3, "host.context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context3);
        o.LJI(LJJIFFI);
        this.LJLJLLL = LJJIFFI;
        los.setVisibility(0);
        if (los.LJLLLL == null) {
            los.LJLLLL = new LOR(los);
        }
        LOR lor = los.LJLLLL;
        o.LJI(lor);
        this.LJLJI = lor;
        if (C52309Kfx.LIZ()) {
            XTabPanelController xTabPanelController = new XTabPanelController(LJJIFFI, los);
            C55096Ljo.LJIIJJI(C55230Lly.LIZLLL(LJJIFFI, null), xTabPanelController, IXTabPanelAbility.class, null);
            C55096Ljo.LJIIJJI(C55230Lly.LIZLLL(LJJIFFI, null), xTabPanelController, SelectedTabBackToOriginAbility.class, null);
            xTabPanelController.LJLLJ = new AqS175S0100000_9(this, 96);
            this.LJLL = xTabPanelController;
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip
    public final void Ce0(AbsFragment absFragment) {
        XTabPanelController xTabPanelController = this.LJLL;
        if (xTabPanelController != null) {
            C116694i1.LIZ(xTabPanelController.LJLIL).qv0(xTabPanelController);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.util.ArrayList] */
    public final void LIZLLL(LOS los) {
        int i;
        Object obj;
        Object obj2;
        int width = los.getWidth();
        if (LL || width <= 0) {
            return;
        }
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = new ArrayList();
        C68322mC c68322mC2 = new C68322mC();
        c68322mC2.element = new ArrayList();
        if (C53302Kvy.LIZ()) {
            ArrayList arrayList = (ArrayList) c68322mC.element;
            ArrayList arrayList2 = (ArrayList) c68322mC2.element;
            int tabLayoutScrollRange = this.LJLIL.getTabLayoutScrollRange();
            int scrollX = this.LJLIL.getScrollX();
            int width2 = this.LJLIL.getWidth();
            for (int tabCount = this.LJLIL.getTabCount() - 1; -1 < tabCount; tabCount--) {
                HashMap<String, String> hashMap = LLF;
                LOP LJIIJ = this.LJLIL.LJIIJ(tabCount);
                if (LJIIJ != null) {
                    obj2 = LJIIJ.LJ;
                } else {
                    obj2 = null;
                }
                if (!(obj2 instanceof String)) {
                    obj2 = null;
                }
                String str = hashMap.get(obj2);
                if (str != null) {
                    if (tabLayoutScrollRange <= 0) {
                        arrayList.add(str);
                        arrayList2.add(str);
                    } else {
                        View LJIIJJI = this.LJLIL.LJIIJJI(tabCount);
                        if (LJIIJJI != null) {
                            LJIIJJI.getWidth();
                            int left = LJIIJJI.getLeft() - scrollX;
                            int right = LJIIJJI.getRight() - scrollX;
                            if (left <= width2 && right <= width2 && left >= 0) {
                                arrayList.add(str);
                            }
                            arrayList2.add(str);
                        }
                    }
                }
            }
        } else {
            int tabCount2 = los.getTabCount() - 1;
            int i2 = 0;
            while (true) {
                if (-1 >= tabCount2) {
                    break;
                }
                View LJIIJJI2 = los.LJIIJJI(tabCount2);
                if (LJIIJJI2 != null) {
                    i = LJIIJJI2.getWidth();
                } else {
                    i = 0;
                }
                LOP LJIIJ2 = los.LJIIJ(tabCount2);
                if (LJIIJ2 != null) {
                    obj = LJIIJ2.LJ;
                } else {
                    obj = null;
                }
                if ((obj instanceof String) && obj != null) {
                    String str2 = LLF.get(obj);
                    if (str2 != null) {
                        obj = str2;
                    }
                    int LIZIZ = C7MY.LIZIZ(8);
                    int i3 = i2 + i;
                    if (i3 > width && i2 + LIZIZ < width) {
                        ((ArrayList) c68322mC2.element).addAll((Collection) c68322mC.element);
                        ((ArrayList) c68322mC2.element).add(obj);
                    } else if ((i2 - LIZIZ) + i <= width && tabCount2 > 0) {
                        ((ArrayList) c68322mC.element).add(obj);
                    } else {
                        if (i3 <= width && tabCount2 == 0) {
                            ((ArrayList) c68322mC.element).add(obj);
                            break;
                        }
                        ((ArrayList) c68322mC2.element).add(obj);
                    }
                    i2 = i3;
                }
                tabCount2--;
            }
            if (((ArrayList) c68322mC2.element).isEmpty()) {
                ((ArrayList) c68322mC2.element).addAll((Collection) c68322mC.element);
            }
        }
        LL = true;
        ARunnableS20S0300000_9 aRunnableS20S0300000_9 = new ARunnableS20S0300000_9(this, c68322mC, c68322mC2, 2);
        if (FCO.LJ) {
            C38995FSd.LIZLLL().submit(aRunnableS20S0300000_9);
        } else {
            aRunnableS20S0300000_9.run();
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip
    public final void Mm0(ActivityC45651qj activityC45651qj) {
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip
    public final String n7(int i) {
        String str;
        LOP LJIIJ = this.LJLIL.LJIIJ(i);
        Object obj = null;
        if (LJIIJ != null) {
            obj = LJIIJ.LJ;
        }
        if (!(obj instanceof String) || (str = (String) obj) == null) {
            return "";
        }
        return str;
    }

    @QD3
    public final void onDislikeAwemeEvent(C55274Lmg event) {
        int i;
        o.LJIIIZ(event, "event");
        if (event.LJLILLLLZI == 1) {
            LOS los = this.LJLIL;
            boolean z = event.LJLIL;
            LOU lou = los.LJLJI;
            lou.getClass();
            int i2 = 255;
            if (!z) {
                i = 255;
                i2 = 0;
            } else {
                i = 0;
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(i2, i);
            ofInt.setDuration(200L);
            ofInt.addUpdateListener(new AUListenerS97S0100000_9(lou, 72));
            ofInt.start();
        }
    }

    @QD3
    public final void onFeedRefreshEvent(LJK ljk) {
        LO9 lo9;
        LO9 lo92;
        XTabPanelController xTabPanelController = this.LJLL;
        if (xTabPanelController != null) {
            if (ljk != null && ljk.LJLIL == 1 && (lo9 = xTabPanelController.LJLJJLL) != null && !lo9.getHasMoveDown() && (lo92 = xTabPanelController.LJLJJLL) != null) {
                lo92.LIZIZ();
            }
            xTabPanelController.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip
    public final void onPageScrollStateChanged(int i) {
        this.LJLJI.onPageScrollStateChanged(i);
        XTabPanelController xTabPanelController = this.LJLL;
        if (xTabPanelController != null) {
            xTabPanelController.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip
    public final void onPageSelected(int i) {
        Object obj;
        String str;
        List<TopTabProtocol> topTabProtocolList;
        HomeTabAbility homeTabAbility;
        List<TopTabProtocol> L2;
        List<TopTabProtocol> topTabProtocolList2;
        Boolean bool;
        InterfaceC54080LKi H70;
        Object obj2;
        String str2;
        InterfaceC54080LKi H702;
        LOP LJIIJ = this.LJLIL.LJIIJ(i);
        if (LJIIJ != null) {
            obj = LJIIJ.LJ;
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        int i2 = this.LJLJLJ;
        if (i2 != -1 && i2 != i) {
            LOP LJIIJ2 = this.LJLIL.LJIIJ(i2);
            if (LJIIJ2 != null) {
                obj2 = LJIIJ2.LJ;
            } else {
                obj2 = null;
            }
            if ((obj2 instanceof String) && (str2 = (String) obj2) != null && (H702 = LIZIZ().H70(str2)) != null) {
                H702.LJ(str);
            }
        }
        this.LJLJI.onPageSelected(i);
        if (str != null && (H70 = LIZIZ().H70(str)) != null) {
            H70.LIZJ(this.LJLLLLLL, this.LJLLLL);
        }
        this.LJLLL = str;
        XTabPanelController xTabPanelController = this.LJLL;
        if (xTabPanelController != null && (topTabProtocolList2 = xTabPanelController.LJLILLLLZI.getTopTabProtocolList()) != null && i < topTabProtocolList2.size() && i >= 0) {
            TopTabProtocol topTabProtocol = (TopTabProtocol) ListProtector.get(topTabProtocolList2, i);
            xTabPanelController.LJLJI = topTabProtocol.getTag();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onTopTabPageSelected: pro.tag: ");
            LIZ.append(topTabProtocol.getTag());
            LIZ.append(", pos: ");
            LIZ.append(i);
            LIZ.append(", ");
            LIZ.append(xTabPanelController.LJLJI);
            LIZ.append(", ");
            LIZ.append(xTabPanelController.LJLJLLL);
            LIZ.append(", ");
            LO9 lo9 = xTabPanelController.LJLJJLL;
            if (lo9 != null) {
                bool = Boolean.valueOf(lo9.getHasMoveDown());
            } else {
                bool = null;
            }
            LIZ.append(bool);
            X1D.LIZIZ(LIZ);
            xTabPanelController.LJLJJI = i;
            LO9 lo92 = xTabPanelController.LJLJJLL;
            if (lo92 != null && lo92.getTopTabPos() != xTabPanelController.LJLJJI && !lo92.getHasMoveDown() && lo92.LIZLLL()) {
                lo92.LIZIZ();
                LB9 lb9 = xTabPanelController.LJZI;
                if (lb9 != null) {
                    lb9.LIZ(xTabPanelController.LJLLILLLL, false);
                }
            }
        }
        LO6 lo6 = this.LJLLI;
        if (lo6 != null) {
            Context context = lo6.LIZ;
            if ((context instanceof ActivityC45651qj) && (homeTabAbility = (HomeTabAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL((ActivityC45651qj) context, null), HomeTabAbility.class, null)) != null && (L2 = homeTabAbility.L2()) != null && i < L2.size() && i >= 0) {
                ((TopTabProtocol) ListProtector.get(L2, i)).getTag();
            }
        }
        LO5 lo5 = this.LJLLILLLL;
        if (lo5 != null && (lo5.LIZ instanceof ActivityC45651qj) && (topTabProtocolList = lo5.LIZIZ.getTopTabProtocolList()) != null && i < topTabProtocolList.size() && i >= 0) {
            ((TopTabProtocol) ListProtector.get(topTabProtocolList, i)).getTag();
        }
        if (!LL) {
            if (C53302Kvy.LIZ()) {
                this.LJLIL.postDelayed(new ARunnableS45S0100000_9(this, 53), 600L);
            } else {
                this.LJLIL.post(new ARunnableS45S0100000_9(this, 54));
            }
        }
        C8RO c8ro = LLD;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onPageSelected, lastPos:");
        C15890jp.LIZIZ(LIZ2, this.LJLJLJ, ", curPos:", i, ", curtag:");
        LIZ2.append(str);
        c8ro.LIZLLL(X1D.LIZIZ(LIZ2));
        this.LJLJLJ = i;
    }

    @QD3
    public final void onScrollToFeedFollowGuideEvent(C85233Wd event) {
        o.LJIIIZ(event, "event");
        int selectedTabPosition = this.LJLIL.getSelectedTabPosition();
        LOS los = this.LJLIL;
        if (selectedTabPosition >= 0) {
            if (selectedTabPosition > los.LJLJI.getChildCount() - 1) {
                return;
            }
            LOU lou = los.LJLJI;
            lou.LLIFFJFJJ.setRepeatAnim(false);
            if (lou.LLFII.isRunning()) {
                lou.LLFII.cancel();
            }
            LOP LJIIJ = lou.LLIFFJFJJ.LJIIJ(selectedTabPosition);
            if (LJIIJ == null) {
                return;
            }
            LJIIJ.LIZ();
            return;
        }
        los.getClass();
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip
    public final void QN(LOF lof, boolean z) {
        this.LJLJJI = lof;
        this.LJLJJL = (InterfaceC225058sP) lof;
        this.LJLJJLL = z;
        LIZ();
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip
    public final void Y5(int i, int i2) {
        Object obj;
        String str;
        Object obj2;
        String str2;
        String Eo0;
        Object obj3;
        LOP LJIIJ = this.LJLIL.LJIIJ(i);
        if (LJIIJ != null) {
            obj = LJIIJ.LJ;
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = "";
        }
        String str4 = LLFFF.get(str);
        HashMap<String, String> hashMap = LLF;
        LOP lop = this.LJLLJ;
        Object obj4 = "For You";
        if (lop == null || (obj2 = lop.LJ) == null) {
            obj2 = "For You";
        }
        String str5 = hashMap.get(obj2);
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        str2 = "click_follow_tab";
                    } else {
                        str2 = "click_return_icon";
                    }
                } else {
                    str2 = "goback_icon";
                }
            } else {
                str5 = LLFF.get(str);
                if (C52309Kfx.LIZ() || C52307Kfv.LIZ()) {
                    LOP lop2 = this.LJLLJ;
                    if (lop2 != null && (obj3 = lop2.LJ) != null) {
                        obj4 = obj3;
                    }
                    str5 = hashMap.get(obj4);
                }
                str2 = "slide";
            }
        } else {
            str2 = "click_top_icon";
        }
        this.LJLLLL = str2;
        this.LJLLLLLL = str5;
        if ((o.LJ(str5, "homepage_hot") && o.LJ(str4, "enter_homepage_hot")) || o.LJ(str4, "enter_homepage_friends")) {
            return;
        }
        if (o.LJ(str4, "enter_homepage_explore") && i2 != 1 && i2 != 2) {
            return;
        }
        FollowTabAbility followTabAbility = (FollowTabAbility) C55096Ljo.LIZ(C55230Lly.LJ(this.LJLIL), FollowTabAbility.class, null);
        if (followTabAbility != null && (Eo0 = followTabAbility.Eo0()) != null) {
            str3 = Eo0;
        }
        C10K.LIZIZ(new LO3(str4, str2, str5, str3, this, ((InterfaceC54196LOu) this.LJZI.getValue()).LIZLLL(), str), FMX.LIZIZ(), null);
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip
    public final void onPageScrolled(int i, float f, int i2) {
        this.LJLJI.onPageScrolled(i, f, i2);
    }
}
