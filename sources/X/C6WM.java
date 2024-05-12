package X;

import Y.ACListenerS22S0100000_2;
import Y.IDAListenerS0S0110000_2;
import Y.IDTListenerS112S0100000_2;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.gamora.editor.recommendeffect.RecommendEffectLayoutManager;
import com.ss.android.ugc.gamora.editor.recommendeffect.net.RecommendEffectItem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6WM, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6WM extends AbstractC56012Ht<C6MT, C6MV> {
    public static final int LJLZ = C47959Irz.LIZJ(26, O6R.LJJIIZ(C32151Nz.LJIIZILJ(15)));
    public RecyclerView LJLIL;
    public View LJLILLLLZI;
    public View LJLJI;
    public ValueAnimator LJLJJI;
    public TuxIconView LJLJJL;
    public View LJLJJLL;
    public TuxTextView LJLJL;
    public View LJLJLJ;
    public int LJLJLLL;
    public ViewOnClickListenerC161696Wf LJLL;
    public boolean LJLLI;
    public long LJLLLL;
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 454));
    public final EnumC127014yf LJLLJ = EnumC127014yf.EDIT_PAGE;
    public final java.util.Map<Integer, Float> LJLLL = new LinkedHashMap();
    public boolean LJLLLLLL = true;

    public final C29701Eo LLJILJILJ() {
        return (C29701Eo) this.LJLLILLLL.getValue();
    }

    public final void LLJILJIL(final boolean z) {
        int i;
        final int i2;
        float f;
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams;
        C018905p c018905p;
        View view = this.LJLJI;
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        ViewGroup.LayoutParams layoutParams3 = null;
        if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams2 = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        int i3 = 0;
        if (marginLayoutParams2 != null) {
            i = marginLayoutParams2.topMargin;
        } else {
            i = 0;
        }
        float LIZJ = C47959Irz.LIZJ(9, i);
        C6M6.LLILL.getClass();
        int i4 = (int) (LIZJ - C6M6.LLILLJJLI);
        ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
        if (!(layoutParams4 instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams4 = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams4;
        if (marginLayoutParams3 != null) {
            i3 = marginLayoutParams3.topMargin;
        }
        final int LIZ = C47135Ieh.LIZ(26, C47959Irz.LIZJ(9, i3));
        if (z) {
            i2 = i4;
        } else {
            i2 = LIZ;
            LIZ = i4;
        }
        View view2 = this.LJLJLJ;
        if (view2 != null) {
            if (z) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            view2.setAlpha(f);
        }
        if (!z) {
            View view3 = this.LJLILLLLZI;
            if (view3 != null) {
                layoutParams = view3.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof C018905p) {
                c018905p = (C018905p) layoutParams;
                if (c018905p != null) {
                    c018905p.topToTop = R.id.j71;
                    c018905p.bottomToTop = -1;
                    ((ViewGroup.MarginLayoutParams) c018905p).topMargin = i4;
                }
            } else {
                c018905p = null;
            }
            View view4 = this.LJLILLLLZI;
            if (view4 != null) {
                view4.setLayoutParams(c018905p);
            }
        }
        ValueAnimator valueAnimator = this.LJLJJI;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(C55953Lxd.LJIIJ());
        ofFloat.setDuration(200L);
        View view5 = this.LJLILLLLZI;
        if (view5 != null) {
            layoutParams3 = view5.getLayoutParams();
        }
        if (!(layoutParams3 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) == null) {
            return;
        }
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.6WP
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it) {
                float animatedFraction;
                o.LJIIIZ(it, "it");
                marginLayoutParams.topMargin = (int) ((it.getAnimatedFraction() * (i2 - LIZ)) + LIZ);
                View view6 = this.LJLJLJ;
                if (view6 != null) {
                    if (z) {
                        animatedFraction = it.getAnimatedFraction();
                    } else {
                        animatedFraction = 1 - it.getAnimatedFraction();
                    }
                    view6.setAlpha(animatedFraction);
                }
                View view7 = this.LJLILLLLZI;
                if (view7 == null) {
                    return;
                }
                view7.setLayoutParams(marginLayoutParams);
            }
        });
        ofFloat.addListener(new IDAListenerS0S0110000_2(this, z, 0));
        this.LJLJJI = ofFloat;
        ofFloat.start();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.6WR
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C6MT) obj).LIZ);
            }
        }, null, new AqS168S0100000_2(this, 260), 2, null);
        getUiStates().LIZ(new TBT() { // from class: X.6WX
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C6MT) obj).LJIIJ;
            }
        }).LJIIIIZZ(this, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 261));
        getUiStates().LIZ(new TBT() { // from class: X.6WJ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C6MT) obj).LIZLLL;
            }
        }).LJIIIIZZ(this, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 262));
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.6WY
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C6MT) obj).LJ;
            }
        }, null, new AqS168S0100000_2(this, 263), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.6WK
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Float.valueOf(((C6MT) obj).LJFF);
            }
        }, null, new AqS168S0100000_2(this, 253), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.6WL
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C6MT) obj).LJI);
            }
        }, null, new AqS168S0100000_2(this, 254), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.6WT
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C6MT) obj).LIZIZ;
            }
        }, null, new AqS168S0100000_2(this, 255), 2, null);
        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.6WU
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C6MT) obj).LIZJ;
            }
        }, null, new AqS168S0100000_2(this, 256), 2, null);
        AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.6WS
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C6MT) obj).LJII);
            }
        }, null, new AqS168S0100000_2(this, 257), 2, null);
        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.6WV
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C6MT) obj).LJIIIIZZ;
            }
        }, null, new AqS168S0100000_2(this, 258), 2, null);
        AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.6WW
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C6MT) obj).LJIIIZ;
            }
        }, null, new AqS168S0100000_2(this, 259), 2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0143, code lost:
    
        if (r7 != null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJ(com.ss.android.ugc.gamora.editor.recommendeffect.net.RecommendEffectItem r7, int r8) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6WM.LLJJ(com.ss.android.ugc.gamora.editor.recommendeffect.net.RecommendEffectItem, int):void");
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        C0A2 c0a2;
        RecommendEffectLayoutManager recommendEffectLayoutManager;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = this.LJLIL;
        if (recyclerView != null) {
            c0a2 = recyclerView.getLayoutManager();
        } else {
            c0a2 = null;
        }
        if (c0a2 instanceof RecommendEffectLayoutManager) {
            recommendEffectLayoutManager = (RecommendEffectLayoutManager) c0a2;
        } else {
            recommendEffectLayoutManager = null;
        }
        if (recommendEffectLayoutManager != null) {
            int i = recommendEffectLayoutManager.LJZ;
            if (i != -1) {
                recommendEffectLayoutManager.LJLZ = i;
            }
            recommendEffectLayoutManager.LJLZ = Math.min(Math.max(0, recommendEffectLayoutManager.LJLZ), recommendEffectLayoutManager.LJJJJZ() - 1);
            recommendEffectLayoutManager.LJZ = -1;
            View view2 = recommendEffectLayoutManager.LL;
            if (view2 != null) {
                view2.setSelected(false);
                recommendEffectLayoutManager.LL = null;
            }
            RecyclerView recyclerView2 = recommendEffectLayoutManager.LLD;
            if (recyclerView2 != null) {
                recyclerView2.LJJLL(recommendEffectLayoutManager.LJZL);
            }
            recommendEffectLayoutManager.LJZI.LIZIZ(null);
        }
        RecyclerView recyclerView3 = this.LJLIL;
        if (recyclerView3 != null) {
            final float floatValue = getUiActions().LJIIIZ.invoke().floatValue();
            recyclerView3.LJII(new AbstractC030309z(floatValue) { // from class: X.4bi
                public final float LJLIL;

                {
                    this.LJLIL = floatValue;
                }

                @Override // X.AbstractC030309z
                public final void LJ(Rect rect, View view3, RecyclerView recyclerView4, C0AC c0ac) {
                    T28.LJ(rect, "outRect", view3, "view", recyclerView4, "parent", c0ac, "state");
                    float f = this.LJLIL;
                    float f2 = 2;
                    int i2 = (int) (f / f2);
                    rect.left = i2;
                    rect.right = (int) (f / f2);
                    if (r0 + i2 < f) {
                        rect.left = i2 + 1;
                    }
                }
            }, -1);
        }
        RecyclerView recyclerView4 = this.LJLIL;
        if (recyclerView4 != null) {
            RecommendEffectLayoutManager recommendEffectLayoutManager2 = new RecommendEffectLayoutManager();
            recommendEffectLayoutManager2.LLIFFJFJJ = new AqS152S0100000_2(this, 455);
            RecyclerView recyclerView5 = this.LJLIL;
            if (recyclerView5 != null) {
                recommendEffectLayoutManager2.LLD = recyclerView5;
                recommendEffectLayoutManager2.LJLZ = Math.max(0, -1);
                recyclerView5.setLayoutManager(recommendEffectLayoutManager2);
                recommendEffectLayoutManager2.LJZI.LIZIZ(recyclerView5);
                recyclerView5.LJIIJJI(recommendEffectLayoutManager2.LJZL);
                recommendEffectLayoutManager2.LLF = new C6WN(this);
                recommendEffectLayoutManager2.LLFF = new C6WZ(this);
                recyclerView4.setLayoutManager(recommendEffectLayoutManager2);
            } else {
                "The attach RecycleView must not null!!".toString();
                throw new IllegalArgumentException("The attach RecycleView must not null!!");
            }
        }
        RecyclerView recyclerView6 = this.LJLIL;
        if (recyclerView6 != null) {
            recyclerView6.setOnTouchListener(new IDTListenerS112S0100000_2(this, 11));
        }
        getUiActions().LJIILL.invoke(Boolean.FALSE, Boolean.TRUE);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup viewGroup2 = (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.im, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
        this.LJLJI = viewGroup2.findViewById(R.id.bux);
        this.LJLILLLLZI = viewGroup2.findViewById(R.id.iq6);
        TuxIconView tuxIconView = (TuxIconView) viewGroup2.findViewById(R.id.iq4);
        C16880lQ.LJJJ(tuxIconView, new ACListenerS22S0100000_2(this, 51));
        this.LJLJJL = tuxIconView;
        View findViewById = viewGroup2.findViewById(R.id.bg0);
        C16880lQ.LJIIJ(new ACListenerS22S0100000_2(this, 52), findViewById);
        this.LJLJJLL = findViewById;
        TuxTextView tuxTextView = (TuxTextView) viewGroup2.findViewById(R.id.iq_);
        this.LJLJL = tuxTextView;
        if (tuxTextView != null) {
            C16880lQ.LJJJJI(tuxTextView, new ACListenerS22S0100000_2(this, 53));
        }
        this.LJLIL = (RecyclerView) viewGroup2.findViewById(R.id.j_g);
        this.LJLJLJ = viewGroup2.findViewById(R.id.iq3);
        Integer valueOf = Integer.valueOf(C81184Vtc.LIZIZ(C60903NvH.LJ));
        if (valueOf.intValue() <= 667) {
            ViewGroup.LayoutParams layoutParams = null;
            if (1 != 0) {
                int intValue = valueOf.intValue();
                C29701Eo LLJILJILJ = LLJILJILJ();
                if (LLJILJILJ != null) {
                    layoutParams = LLJILJILJ.getLayoutParams();
                }
                if ((layoutParams instanceof C018905p) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams.topMargin = intValue / 4;
                }
            }
        }
        ViewOnClickListenerC161696Wf viewOnClickListenerC161696Wf = new ViewOnClickListenerC161696Wf(new AqS152S0100000_2(this, 445));
        viewOnClickListenerC161696Wf.LJLJI = new InterfaceC161676Wd() { // from class: X.6Mg
            @Override // X.InterfaceC161676Wd
            public final void onItemClick(int i) {
                RecyclerView recyclerView = C6WM.this.LJLIL;
                if (recyclerView != null) {
                    C0A2 layoutManager = recyclerView.getLayoutManager();
                    if ((layoutManager instanceof RecommendEffectLayoutManager) && layoutManager != null) {
                        layoutManager.LLIIII(recyclerView, null, i);
                    }
                }
                if (((RecommendEffectItem) ListProtector.get(C6WM.this.getUiStates().LJ.LIZLLL, i)).LIZIZ) {
                    C6WM.this.getUiActions().LJII.invoke(Boolean.FALSE, 3000L);
                } else {
                    C6WM.this.getUiActions().LJII.invoke(Boolean.TRUE, null);
                }
            }

            @Override // X.InterfaceC161676Wd
            public final void LIZ(int i, String str) {
                if (C6WM.this.getUiStates().LJ.LIZ) {
                    C6WM.this.getUiActions().LJIIL.invoke(Integer.valueOf(i), str);
                }
            }
        };
        this.LJLL = viewOnClickListenerC161696Wf;
        new C6WQ(this);
        RecyclerView recyclerView = this.LJLIL;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.LJLL);
        }
        return viewGroup2;
    }
}
