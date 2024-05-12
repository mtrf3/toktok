package com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C212428Vi;
import X.C221108m2;
import X.C26338AVi;
import X.C2K0;
import X.C32151Nz;
import X.C50240Jng;
import X.C50423Jqd;
import X.C50424Jqe;
import X.C50425Jqf;
import X.C51080K2y;
import X.C51763KTf;
import X.C55096Ljo;
import X.C62822Ol8;
import X.C78897Uxp;
import X.C79045V0n;
import X.C7MY;
import X.InterfaceC55102Lju;
import X.O6R;
import Y.ACListenerS43S0200000_8;
import Y.AObserverS72S0200000_8;
import Y.AObserverS76S0100000_8;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.search.pages.common.theme.ThemeViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class LayoutSwitcherAssem extends UISlotAssem implements ILayoutSwitcherAbility, InterfaceC55102Lju {
    public View LJLJLLL;
    public ViewGroup LJLL;
    public TuxIconView LJLLI;
    public View LJLLILLLL;
    public ThemeViewModel LJLLJ;
    public SearchGlobalViewModel LJLLL;
    public Integer LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public final C62822Ol8 LJZ;
    public final C62822Ol8 LJZI;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 1551652967) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.ci5;
    }

    public LayoutSwitcherAssem() {
        new LinkedHashMap();
        C221108m2.LIZIZ(C50425Jqf.LJLIL);
        this.LJLLLLLL = C221108m2.LIZIZ(C50423Jqd.LJLIL);
        this.LJLZ = C221108m2.LIZIZ(C50424Jqe.LJLIL);
        this.LJZ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 317));
        this.LJZI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 316));
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.ILayoutSwitcherAbility
    public final void a60() {
        ((AnimatorSet) this.LJZI.getValue()).cancel();
        ((AnimatorSet) this.LJZ.getValue()).cancel();
        ((AnimatorSet) this.LJZI.getValue()).start();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.ILayoutSwitcherAbility
    public final void yw() {
        ((AnimatorSet) this.LJZI.getValue()).cancel();
        ((AnimatorSet) this.LJZ.getValue()).cancel();
        ((AnimatorSet) this.LJZ.getValue()).start();
    }

    @Override // X.C8W0
    public final void onParentSet() {
        C55096Ljo.LIZJ(this);
    }

    public final Drawable H3(C50240Jng c50240Jng) {
        Integer num;
        int[] iArr;
        int i;
        GradientDrawable.Orientation orientation;
        int i2 = c50240Jng.LIZIZ;
        if (o.LJ(c50240Jng.LIZ, "dark")) {
            iArr = new int[]{0, i2};
        } else {
            Context context = getContext();
            if (context != null) {
                num = C79045V0n.LJI(R.attr.cl, context);
            } else {
                num = null;
            }
            iArr = new int[2];
            iArr[0] = 0;
            if (num != null) {
                i = num.intValue();
            } else {
                i = -1;
            }
            iArr[1] = i;
        }
        ViewGroup viewGroup = this.LJLL;
        if (viewGroup != null) {
            if (C26338AVi.LIZLLL(viewGroup)) {
                orientation = GradientDrawable.Orientation.RIGHT_LEFT;
            } else {
                orientation = GradientDrawable.Orientation.LEFT_RIGHT;
            }
            return C51763KTf.LIZJ(iArr, orientation, 0.0f);
        }
        o.LJIJI("tuxIconViewGroup");
        throw null;
    }

    public final void I3(C50240Jng c50240Jng) {
        int i;
        int i2 = c50240Jng.LIZIZ;
        boolean LJ = o.LJ(c50240Jng.LIZ, "dark");
        ViewGroup viewGroup = this.LJLL;
        if (viewGroup != null) {
            viewGroup.setBackgroundColor(i2);
            View view = this.LJLLILLLL;
            if (view != null) {
                view.setBackground(H3(c50240Jng));
                TuxIconView tuxIconView = this.LJLLI;
                if (tuxIconView != null) {
                    if (LJ) {
                        i = R.attr.dm;
                    } else {
                        i = R.attr.gv;
                    }
                    tuxIconView.setTintColorRes(i);
                    return;
                }
                o.LJIJI("tuxIconView");
                throw null;
            }
            o.LJIJI("tuxIconShadow");
            throw null;
        }
        o.LJIJI("tuxIconViewGroup");
        throw null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            view.setVisibility(8);
            this.LJLJLLL = view;
            View findViewById = view.findViewById(R.id.lfd);
            o.LJIIIIZZ(findViewById, "view.findViewById(R.id.t…layout_switch_icon_group)");
            this.LJLL = (ViewGroup) findViewById;
            View findViewById2 = view.findViewById(R.id.lfe);
            o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.top_layout_switch_shadow)");
            this.LJLLILLLL = findViewById2;
            View findViewById3 = view.findViewById(R.id.lfc);
            o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.top_layout_switch_icon)");
            TuxIconView tuxIconView = (TuxIconView) findViewById3;
            this.LJLLI = tuxIconView;
            tuxIconView.setTintColorRes(R.attr.gv);
            this.LJLLJ = (ThemeViewModel) ViewModelProviders.of(LIZ).get(ThemeViewModel.class);
            this.LJLLL = (SearchGlobalViewModel) ViewModelProviders.of(LIZ).get(SearchGlobalViewModel.class);
            View view2 = this.LJLLILLLL;
            if (view2 != null) {
                view2.setBackground(H3(new C50240Jng("light", -1, null, Boolean.FALSE)));
                SearchGlobalViewModel searchGlobalViewModel = this.LJLLL;
                if (searchGlobalViewModel != null) {
                    searchGlobalViewModel.LJZ.observe(LIZ, new AObserverS72S0200000_8(view, this, 0));
                    ThemeViewModel themeViewModel = this.LJLLJ;
                    if (themeViewModel != null) {
                        themeViewModel.hv0().observe(LIZ, new AObserverS76S0100000_8(this, 65));
                        ThemeViewModel themeViewModel2 = this.LJLLJ;
                        if (themeViewModel2 != null) {
                            themeViewModel2.gv0().observe(LIZ, new AObserverS76S0100000_8(this, 66));
                            SearchGlobalViewModel searchGlobalViewModel2 = this.LJLLL;
                            if (searchGlobalViewModel2 != null) {
                                searchGlobalViewModel2.LJLJJLL.observe(this, new AObserverS76S0100000_8(this, 67));
                                TuxIconView tuxIconView2 = this.LJLLI;
                                if (tuxIconView2 != null) {
                                    C16880lQ.LJJJ(tuxIconView2, new ACListenerS43S0200000_8(view, this, 3));
                                    if (((Number) C51080K2y.LIZ.getValue()).intValue() != 0) {
                                        ViewGroup viewGroup = this.LJLL;
                                        if (viewGroup != null) {
                                            viewGroup.setPaddingRelative(C7MY.LIZIZ(4), 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)), 0);
                                            ViewGroup viewGroup2 = this.LJLL;
                                            if (viewGroup2 != null) {
                                                viewGroup2.getLayoutParams().height = C7MY.LIZIZ(40);
                                                View view3 = this.LJLLILLLL;
                                                if (view3 != null) {
                                                    view3.getLayoutParams().width = C7MY.LIZIZ(30);
                                                    View view4 = this.LJLLILLLL;
                                                    if (view4 != null) {
                                                        view4.getLayoutParams().height = C7MY.LIZIZ(40);
                                                        View view5 = this.LJLJLLL;
                                                        if (view5 != null) {
                                                            view5.getLayoutParams().height = C7MY.LIZIZ(40);
                                                        } else {
                                                            o.LJIJI("rootView");
                                                            throw null;
                                                        }
                                                    } else {
                                                        o.LJIJI("tuxIconShadow");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("tuxIconShadow");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("tuxIconViewGroup");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("tuxIconViewGroup");
                                            throw null;
                                        }
                                    }
                                    TuxIconView tuxIconView3 = this.LJLLI;
                                    if (tuxIconView3 != null) {
                                        C78897Uxp.LJJJJLI(tuxIconView3, null);
                                        return;
                                    } else {
                                        o.LJIJI("tuxIconView");
                                        throw null;
                                    }
                                }
                                o.LJIJI("tuxIconView");
                                throw null;
                            }
                            o.LJIJI("globalVm");
                            throw null;
                        }
                        o.LJIJI("themeVm");
                        throw null;
                    }
                    o.LJIJI("themeVm");
                    throw null;
                }
                o.LJIJI("globalVm");
                throw null;
            }
            o.LJIJI("tuxIconShadow");
            throw null;
        }
        throw new IllegalStateException("LayoutSwitcherAssem not attached to any Activity");
    }
}
