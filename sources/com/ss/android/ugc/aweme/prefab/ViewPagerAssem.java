package com.ss.android.ugc.aweme.prefab;

import X.AnonymousClass391;
import X.C212428Vi;
import X.C26338AVi;
import X.C2K0;
import X.C32151Nz;
import X.C55096Ljo;
import X.C55230Lly;
import X.C74053T4n;
import X.C77275UUl;
import X.C79045V0n;
import X.C7S6;
import X.C80672VlM;
import X.C80675VlP;
import X.C8V1;
import X.C8W0;
import X.EV9;
import X.InterfaceC55235Lm3;
import X.InterfaceC80680VlU;
import X.O6R;
import X.OQY;
import X.VW3;
import Y.IDiS165S0200000_3;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.prefab.ViewPagerAssem;
import com.ss.android.ugc.aweme.prefab.ability.ViewPagerControlAbility;
import com.ss.android.ugc.aweme.prefab.ability.ViewPagerPageSelectedSubscriber;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AqS107S0300000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class ViewPagerAssem extends LinearLayoutAssem implements ViewPagerControlAbility {
    public HorizontalScrollView LJLL;
    public VW3 LJLLI;

    public ViewPagerAssem() {
        new LinkedHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.prefab.LinearLayoutAssem, com.bytedance.assem.arch.dynamic.DynamicAssem
    public final void H3() {
        ViewGroup viewGroup;
        Integer num;
        C74053T4n c74053T4n;
        Set LJII;
        Integer num2;
        if (getConfig().LJIIIZ.size() <= 1) {
            super.H3();
            return;
        }
        View x3 = x3();
        Integer num3 = null;
        if (!(x3 instanceof ViewGroup) || (viewGroup = (ViewGroup) x3) == null) {
            return;
        }
        Context context = viewGroup.getContext();
        VW3 vw3 = new VW3(context);
        vw3.setAdapter(new PagerAdapter() { // from class: X.7TA
            public final List<View> LJLILLLLZI = new ArrayList();

            @Override // androidx.viewpager.widget.PagerAdapter
            public final int getCount() {
                return ViewPagerAssem.this.getConfig().LJIIIZ.size();
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public final CharSequence LJIILIIL(int i) {
                return String.valueOf(((C8V1) ListProtector.get(ORZ.LLJI(ViewPagerAssem.this.getConfig().LJIIIZ.values()), i)).LJ.get("page_title"));
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public final Object LJIILLIIL(int i, ViewGroup container) {
                ViewGroup viewGroup2;
                o.LJIIIZ(container, "container");
                C8VL c8vl = (C8VL) ListProtector.get(ORZ.LLJI(ViewPagerAssem.this.getConfig().LJIIIZ.values()), i);
                View view = (View) ORS.LJJZ(this.LJLILLLLZI);
                if (view == null) {
                    view = new RelativeLayout(container.getContext());
                    final ViewPagerAssem viewPagerAssem = ViewPagerAssem.this;
                    c8vl.LJI = R.id.bs8;
                    view.setId(R.id.bs8);
                    view.setTag(new LifecycleOwner() { // from class: X.7TB
                        @Override // androidx.lifecycle.LifecycleOwner
                        public final Lifecycle getLifecycle() {
                            return ViewPagerAssem.this.getLifecycle();
                        }
                    });
                }
                ViewPagerAssem viewPagerAssem2 = ViewPagerAssem.this;
                C8VV.LIZJ(viewPagerAssem2, new AqS107S0300000_3(view, viewPagerAssem2, c8vl, 19));
                ViewParent parent = view.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                    C16880lQ.LJLLL(view, viewGroup2);
                }
                container.addView(view);
                return view;
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public final boolean LJIIZILJ(View view, Object obj) {
                o.LJIIIZ(view, "view");
                o.LJIIIZ(obj, "obj");
                return o.LJ(view, obj);
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public final void LJIIIZ(int i, ViewGroup container, Object obj) {
                o.LJIIIZ(container, "container");
                o.LJIIIZ(obj, "obj");
                View view = (View) obj;
                C16880lQ.LJLLL(view, container);
                ((ArrayList) this.LJLILLLLZI).add(view);
            }
        });
        this.LJLLI = vw3;
        Object obj = getConfig().LJ.get("viewpager_version");
        if (obj instanceof Integer) {
            num = (Integer) obj;
        } else {
            num = null;
        }
        if (num == null || num.intValue() != 1) {
            C80675VlP c80675VlP = new C80675VlP(context, null);
            c80675VlP.setTabMode(0);
            c80675VlP.setTabMinWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
            c80675VlP.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            c80675VlP.setCustomTabViewResId(R.layout.c2n);
            c80675VlP.setTabPaddingStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
            c80675VlP.setTabPaddingEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
            C26338AVi.LJIIIZ(c80675VlP, 0, AnonymousClass391.LIZJ(-4), 0, 0, 16);
            c80675VlP.LJIIZILJ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
            c80675VlP.LIZIZ(new InterfaceC80680VlU() { // from class: X.7TN
                @Override // X.InterfaceC80680VlU
                public final void LIZIZ(C80674VlO c80674VlO) {
                }

                @Override // X.InterfaceC80680VlU
                public final void LIZ(C80674VlO c80674VlO) {
                    TuxTextView tuxTextView;
                    View view = c80674VlO.LJFF;
                    if ((view instanceof TuxTextView) && (tuxTextView = (TuxTextView) view) != null) {
                        tuxTextView.setTuxFont(42);
                    }
                }

                @Override // X.InterfaceC80680VlU
                public final void LIZJ(C80674VlO c80674VlO) {
                    TuxTextView tuxTextView;
                    View view = null;
                    if (c80674VlO != null) {
                        view = c80674VlO.LJFF;
                    }
                    if ((view instanceof TuxTextView) && (tuxTextView = (TuxTextView) view) != null) {
                        tuxTextView.setTuxFont(43);
                    }
                }
            });
            c80675VlP.setupWithViewPager(this.LJLLI);
            M3(c80675VlP);
            c74053T4n = c80675VlP;
        } else {
            o.LJIIIIZZ(context, "context");
            C74053T4n c74053T4n2 = new C74053T4n(context, null, 6);
            c74053T4n2.LJLJLLL = true;
            c74053T4n2.LJLIL.invalidate();
            c74053T4n2.setTabVariant(0);
            C74053T4n.LJIILJJIL(c74053T4n2, this.LJLLI);
            c74053T4n = c74053T4n2;
        }
        this.LJLL = c74053T4n;
        Object obj2 = getConfig().LJ.get("default_page");
        if ((obj2 instanceof Integer) && (num2 = (Integer) obj2) != null) {
            int intValue = num2.intValue();
            VW3 vw32 = this.LJLLI;
            if (vw32 != null) {
                vw32.setCurrentItem(intValue);
            }
        }
        VW3 vw33 = this.LJLLI;
        if (vw33 != null) {
            int currentItem = vw33.getCurrentItem();
            Fragment LIZLLL = C212428Vi.LIZLLL(this);
            if (LIZLLL != null) {
                C2K0 LIZ = C55096Ljo.LIZ(C55230Lly.LIZJ(LIZLLL, null), ViewPagerPageSelectedSubscriber.class, null);
                if (LIZ == null) {
                    LJII = OQY.INSTANCE;
                } else {
                    try {
                        InvocationHandler invocationHandler = Proxy.getInvocationHandler(LIZ);
                        if (invocationHandler instanceof EV9) {
                            LJII = ((EV9) invocationHandler).LIZ;
                        } else {
                            throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                        }
                    } catch (IllegalArgumentException unused) {
                        LJII = C77275UUl.LJII(LIZ);
                    }
                }
                if (LJII != null) {
                    Iterator it = LJII.iterator();
                    while (it.hasNext()) {
                        ((ViewPagerPageSelectedSubscriber) it.next()).cR(currentItem, C7S6.INITIAL);
                    }
                }
            }
        }
        VW3 vw34 = this.LJLLI;
        if (vw34 != null) {
            vw34.addOnPageChangeListener(new IDiS165S0200000_3(this, 0));
        }
        viewGroup.addView(this.LJLL);
        Object obj3 = getConfig().LJ.get("viewpager_version");
        if (obj3 instanceof Integer) {
            num3 = (Integer) obj3;
        }
        if (num3 != null && num3.intValue() == 2) {
            View view = new View(context);
            o.LJIIIIZZ(context, "context");
            Integer LJI = C79045V0n.LJI(R.attr.dz, context);
            if (LJI != null) {
                view.setBackgroundColor(LJI.intValue());
            }
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, AnonymousClass391.LIZ(0.5d)));
            viewGroup.addView(view);
        }
        viewGroup.addView(this.LJLLI, new LinearLayout.LayoutParams(-1, -1));
    }

    public final void M3(HorizontalScrollView horizontalScrollView) {
        C80675VlP c80675VlP;
        TextView textView;
        int i;
        int i2;
        int i3;
        Integer LJI;
        Integer LJI2;
        Integer LJI3;
        C80672VlM c80672VlM;
        if (!(horizontalScrollView instanceof C80675VlP) || (c80675VlP = (C80675VlP) horizontalScrollView) == null) {
            return;
        }
        int tabCount = c80675VlP.getTabCount();
        for (int i4 = 0; i4 < tabCount; i4++) {
            View childAt = c80675VlP.LJLJI.getChildAt(i4);
            if ((childAt instanceof C80672VlM) && (c80672VlM = (C80672VlM) childAt) != null) {
                textView = c80672VlM.getCustomTextView();
            } else {
                textView = null;
            }
            if ((textView instanceof TuxTextView) && textView != null) {
                int[][] iArr = {new int[]{android.R.attr.state_selected}, new int[]{android.R.attr.state_pressed}, new int[0]};
                int[] iArr2 = new int[3];
                Context context = getContext();
                if (context != null && (LJI3 = C79045V0n.LJI(R.attr.go, context)) != null) {
                    i = LJI3.intValue();
                } else {
                    i = 0;
                }
                iArr2[0] = i;
                Context context2 = getContext();
                if (context2 != null && (LJI2 = C79045V0n.LJI(R.attr.cg, context2)) != null) {
                    i2 = LJI2.intValue();
                } else {
                    i2 = 0;
                }
                iArr2[1] = i2;
                Context context3 = getContext();
                if (context3 != null && (LJI = C79045V0n.LJI(R.attr.gv, context3)) != null) {
                    i3 = LJI.intValue();
                } else {
                    i3 = 0;
                }
                iArr2[2] = i3;
                textView.setTextColor(new ColorStateList(iArr, iArr2));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.prefab.ability.ViewPagerControlAbility
    public final void Oz(int i) {
        VW3 vw3 = this.LJLLI;
        if (vw3 != null) {
            vw3.setCurrentItem(i, true);
        }
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void didUpdateConfig(C8V1<? extends C8W0> oldConfig) {
        Integer num;
        PagerAdapter adapter;
        o.LJIIIZ(oldConfig, "oldConfig");
        if (getConfig().LJIIIZ.size() <= 1) {
            super.didUpdateConfig(oldConfig);
            return;
        }
        VW3 vw3 = this.LJLLI;
        if (vw3 != null && (adapter = vw3.getAdapter()) != null) {
            adapter.notifyDataSetChanged();
        }
        Object obj = getConfig().LJ.get("viewpager_version");
        if (!(obj instanceof Integer) || (num = (Integer) obj) == null || num.intValue() != 2) {
            return;
        }
        M3(this.LJLL);
    }

    @Override // com.ss.android.ugc.aweme.prefab.LinearLayoutAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(LIZLLL, null);
            C2K0 LIZ = C55096Ljo.LIZ(LIZJ, ViewPagerControlAbility.class, null);
            if (LIZ == null) {
                C55096Ljo.LJIIJJI(LIZJ, this, ViewPagerControlAbility.class, null);
                return;
            }
            try {
                InvocationHandler invocationHandler = Proxy.getInvocationHandler(LIZ);
                if (invocationHandler instanceof EV9) {
                    ((EV9) invocationHandler).LIZ.add(this);
                    return;
                }
                throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
            } catch (IllegalArgumentException unused) {
                EV9 ev9 = new EV9();
                ev9.LIZ.add(this);
                ev9.LIZ.add(LIZ);
                Object newProxyInstance = Proxy.newProxyInstance(ViewPagerControlAbility.class.getClassLoader(), new Class[]{ViewPagerControlAbility.class}, ev9);
                if (newProxyInstance != null) {
                    C55096Ljo.LJIIJJI(LIZJ, (C2K0) newProxyInstance, ViewPagerControlAbility.class, null);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.prefab.ability.ViewPagerControlAbility");
            }
        }
    }
}
