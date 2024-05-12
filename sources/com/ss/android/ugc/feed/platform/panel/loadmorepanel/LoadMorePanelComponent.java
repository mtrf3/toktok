package com.ss.android.ugc.feed.platform.panel.loadmorepanel;

import X.AbstractC55113Lk5;
import X.C2K0;
import X.C2MH;
import X.C55064LjI;
import X.C55096Ljo;
import X.C55108Lk0;
import X.C56509MFt;
import X.C62819Ol5;
import X.C78996UzQ;
import X.InterfaceC55066LjK;
import X.InterfaceC55102Lju;
import X.InterfaceC55109Lk1;
import X.InterfaceC55110Lk2;
import X.InterfaceC55112Lk4;
import X.InterfaceC55235Lm3;
import X.JCR;
import X.KR0;
import X.KR6;
import X.KR8;
import X.KUR;
import X.M89;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LoadMorePanelComponent extends BasePanelUIComponent implements ILoadMoreAbility, KR6, InterfaceC55102Lju {
    public C55108Lk0 LJLJJI;
    public final List<InterfaceC55066LjK> LJLJJL;

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

    @Override // X.KR6
    public final void W1() {
    }

    @Override // X.KR6
    public final void d5() {
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 519754333) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void showLoadMoreError() {
        nc(null);
    }

    @Override // X.KR6
    public final void v() {
    }

    public LoadMorePanelComponent() {
        new LinkedHashMap();
        this.LJLJJL = new ArrayList();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void showLoadMoreEmpty() {
        Iterator<InterfaceC55066LjK> it = this.LJLJJL.iterator();
        while (it.hasNext()) {
            it.next().onEmpty();
        }
        C55108Lk0 v3 = v3();
        if (v3 != null) {
            v3.LJIIIIZZ();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void vR() {
        C55108Lk0 c55108Lk0 = this.LJLJJI;
        if (c55108Lk0 != null) {
            c55108Lk0.LJLLILLLL = 0;
            if (c55108Lk0.LJLLLLLL == -1) {
                c55108Lk0.LJLLLLLL = System.currentTimeMillis();
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final boolean aY() {
        C55108Lk0 c55108Lk0;
        KUR LIZJ;
        if (!isContainerViewAssigned() || (c55108Lk0 = this.LJLJJI) == null || (LIZJ = c55108Lk0.LIZJ(false)) == null || LIZJ.LJLILLLLZI != 0 || c55108Lk0.getViewPagerMarginTop() >= 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void fy() {
        C55108Lk0 v3 = v3();
        if (v3 != null) {
            int childCount = v3.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = v3.getChildAt(i);
                o.LJIIIIZZ(childAt, "getChildAt(i)");
                if (childAt instanceof KUR) {
                    ViewGroup viewGroup = (ViewGroup) childAt;
                    int childCount2 = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount2; i2++) {
                        View childAt2 = viewGroup.getChildAt(i2);
                        o.LJIIIIZZ(childAt2, "getChildAt(i)");
                        if (childAt2 instanceof TuxTextView) {
                            ((TextView) childAt2).setText("");
                        }
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final int getMeasuredHeight() {
        C55108Lk0 v3;
        if (!isContainerViewAssigned() || (v3 = v3()) == null) {
            return 0;
        }
        return v3.getMeasuredHeight();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void q1() {
        C55108Lk0 v3 = v3();
        if (v3 != null) {
            v3.LJII();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void resetLoadMoreState() {
        C55108Lk0 v3 = v3();
        if (v3 != null) {
            v3.LJI();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void ug0() {
        C55108Lk0 v3 = v3();
        if (v3 != null) {
            v3.LIZLLL();
        }
    }

    public final C55108Lk0 v3() {
        return this.LJLJJI;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void Ci0(KR0 kr0) {
        C55108Lk0 c55108Lk0 = this.LJLJJI;
        if (c55108Lk0 != null) {
            c55108Lk0.LLFII.add(kr0);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void DA(InterfaceC55112Lk4 interfaceC55112Lk4) {
        C55108Lk0 v3 = v3();
        if (v3 != null) {
            v3.setLoadMoreListener(interfaceC55112Lk4);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void Kv(String str) {
        C55108Lk0 c55108Lk0 = this.LJLJJI;
        if (c55108Lk0 != null) {
            c55108Lk0.setLabel("main_feed");
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void LJZI(View view) {
        C55108Lk0 c55108Lk0 = this.LJLJJI;
        if (c55108Lk0 != null) {
            c55108Lk0.addView(view);
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

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void NT(InterfaceC55110Lk2 interfaceC55110Lk2) {
        C55108Lk0 v3 = v3();
        if (v3 != null) {
            v3.setOnGestureTriggerExit(interfaceC55110Lk2);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void Rg0(String enterFromPage) {
        o.LJIIIZ(enterFromPage, "enterFromPage");
        C55108Lk0 v3 = v3();
        if (v3 != null) {
            v3.setEnterFromPage(enterFromPage);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void Up0(InterfaceC55109Lk1 interfaceC55109Lk1) {
        C55108Lk0 c55108Lk0 = this.LJLJJI;
        if (c55108Lk0 != null) {
            ((ArrayList) c55108Lk0.LL).add(interfaceC55109Lk1);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void ep0(JCR l) {
        o.LJIIIZ(l, "l");
        ((ArrayList) this.LJLJJL).add(l);
    }

    public final void nc(Exception exc) {
        Iterator it = ((ArrayList) this.LJLJJL).iterator();
        while (it.hasNext()) {
            ((InterfaceC55066LjK) it.next()).onFailed();
        }
        C55108Lk0 c55108Lk0 = this.LJLJJI;
        if (c55108Lk0 != null) {
            KUR LIZJ = c55108Lk0.LIZJ(true);
            if (LIZJ != null) {
                LIZJ.LJIIIIZZ();
            }
            c55108Lk0.LJLLILLLL = 2;
            c55108Lk0.LJI();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int i;
        View view2;
        AbstractC55113Lk5 abstractC55113Lk5;
        C55108Lk0 c55108Lk0;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View containerView = getContainerView();
        String str = null;
        if (!o.LJ(v3(), containerView)) {
            if (containerView instanceof C55108Lk0) {
                c55108Lk0 = (C55108Lk0) containerView;
            } else {
                c55108Lk0 = null;
            }
            this.LJLJJI = c55108Lk0;
        }
        Fragment fragment = getPanelContext().LJ;
        if (fragment != null && (view2 = fragment.getView()) != null && (abstractC55113Lk5 = (AbstractC55113Lk5) view2.findViewById(R.id.ncx)) != null) {
            qt0(abstractC55113Lk5);
        }
        resetLoadMoreState();
        if (C56509MFt.LJII(getPanelContext())) {
            M89 m89 = getPanelContext().LIZJ;
            if (m89 != null) {
                i = m89.getPageType();
            } else {
                i = 0;
            }
            M89 m892 = getPanelContext().LIZJ;
            if (m892 != null) {
                str = m892.getEventType();
            }
            String LJIILIIL = C62819Ol5.LJIILIIL(i, str, true);
            if (LJIILIIL != null) {
                Rg0(LJIILIIL);
            }
        }
        M89 m893 = getPanelContext().LIZJ;
        if (m893 != null && !m893.isSupportGestureExit()) {
            return;
        }
        NT(new C55064LjI(this));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void qW(boolean z) {
        C55108Lk0 v3 = v3();
        if (v3 != null) {
            v3.setSkipTouchEvent(z);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void qt0(AbstractC55113Lk5 abstractC55113Lk5) {
        InterfaceC55235Lm3 LJFF;
        C55108Lk0 v3 = v3();
        if (v3 != null) {
            Fragment fragment = getPanelContext().LJ;
            IRefreshAbility iRefreshAbility = null;
            if (fragment != null && (LJFF = KR8.LJFF(fragment)) != null) {
                iRefreshAbility = (IRefreshAbility) C55096Ljo.LIZ(LJFF, IRefreshAbility.class, null);
            }
            v3.LJLJI = abstractC55113Lk5;
            v3.LJLJJL = iRefreshAbility;
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void removeView(View view) {
        C55108Lk0 c55108Lk0;
        if (view != null && (c55108Lk0 = this.LJLJJI) != null) {
            if (C78996UzQ.LJJIIJZLJL(view)) {
                C78996UzQ.LJI();
            }
            c55108Lk0.removeView(view);
        }
    }

    @Override // X.KR6
    public final void LJJJJI(View view, Bundle bundle) {
        KeyEvent.Callback callback;
        C55108Lk0 c55108Lk0 = null;
        if (view != null) {
            callback = view.findViewById(R.id.g99);
        } else {
            callback = null;
        }
        if (!o.LJ(v3(), callback)) {
            if (callback instanceof C55108Lk0) {
                c55108Lk0 = (C55108Lk0) callback;
            }
            this.LJLJJI = c55108Lk0;
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        C55108Lk0 c55108Lk0;
        if (view != null && (c55108Lk0 = this.LJLJJI) != null) {
            c55108Lk0.addView(view, layoutParams);
        }
    }

    @Override // X.KR6
    public final void j(Activity activity, Fragment fragment) {
        C2MH.LIZ(activity, fragment);
    }
}
