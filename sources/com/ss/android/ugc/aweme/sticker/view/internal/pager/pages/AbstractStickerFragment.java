package com.ss.android.ugc.aweme.sticker.view.internal.pager.pages;

import X.AbstractC030309z;
import X.AbstractC73295Spf;
import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C03880Dg;
import X.C0A3;
import X.C0A6;
import X.C10A;
import X.C113554cx;
import X.C141335gf;
import X.C16880lQ;
import X.C208828Hm;
import X.C247129mu;
import X.C29S;
import X.C3C5;
import X.C65300Pk0;
import X.C73893SzJ;
import X.C74266TCs;
import X.C76800UCe;
import X.C82894Wg6;
import X.C90903hW;
import X.IA2;
import X.InterfaceC46204IBk;
import X.InterfaceC74377TGz;
import X.OSZ;
import X.T47;
import X.TEF;
import X.TEI;
import X.TEJ;
import X.TEN;
import X.TEW;
import X.TEZ;
import X.TF5;
import X.TKR;
import X.TLG;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public abstract class AbstractStickerFragment<ADAPTER extends AbstractC73295Spf<Effect>> extends Fragment implements InterfaceC74377TGz<Fragment> {
    public RecyclerView LJLIL;
    public LinearLayoutManager LJLILLLLZI;
    public TLG<TEN> LJLJI;
    public C74266TCs LJLJJI;
    public int LJLJJL;
    public RecyclerView.RecycledViewPool LJLJJLL;
    public TEZ LJLJL;
    public TEJ LJLJLJ;
    public TF5 LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public final C73893SzJ<Integer> LJLLILLLL = new C73893SzJ<>();

    public void Hl() {
    }

    public abstract void Il();

    @Override // X.InterfaceC74377TGz
    public final Fragment N7() {
        return this;
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final TEZ Al() {
        TEZ tez = this.LJLJL;
        if (tez != null) {
            return tez;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final TEF Dl() {
        TF5 tf5 = this.LJLJLLL;
        if (tf5 != null) {
            return tf5.LJ;
        }
        o.LJIJI("requiredDependency");
        throw null;
    }

    public final boolean Gl() {
        if (this.LJLJL != null) {
            return true;
        }
        return false;
    }

    public final InterfaceC46204IBk vl() {
        TF5 tf5 = this.LJLJLLL;
        if (tf5 != null) {
            return tf5.LIZIZ;
        }
        o.LJIJI("requiredDependency");
        throw null;
    }

    public final RecyclerView w6() {
        RecyclerView recyclerView = this.LJLIL;
        if (recyclerView != null) {
            return recyclerView;
        }
        o.LJIJI("recyclerView");
        throw null;
    }

    public final TEJ wl() {
        TEJ tej = this.LJLJLJ;
        if (tej != null) {
            return tej;
        }
        o.LJIJI("optionalDependency");
        throw null;
    }

    public final TF5 xl() {
        TF5 tf5 = this.LJLJLLL;
        if (tf5 != null) {
            return tf5;
        }
        o.LJIJI("requiredDependency");
        throw null;
    }

    @Override // X.TGQ
    public final AbstractC73672Svk<Integer> yg() {
        C73893SzJ<Integer> c73893SzJ = this.LJLLILLLL;
        return IA2.LIZ(c73893SzJ, c73893SzJ);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        if (!Gl()) {
            _$_clearFindViewByIdCache();
            return;
        }
        RecyclerView recyclerView = this.LJLIL;
        if (recyclerView != null) {
            List<C0A6> list = recyclerView.LLJILJILJ;
            if (list != null) {
                ((ArrayList) list).clear();
            }
            RecyclerView recyclerView2 = this.LJLIL;
            if (recyclerView2 != null) {
                List<C0A3> list2 = recyclerView2.LLIFFJFJJ;
                if (list2 != null) {
                    ((ArrayList) list2).clear();
                }
                _$_clearFindViewByIdCache();
                return;
            }
            o.LJIJI("recyclerView");
            throw null;
        }
        o.LJIJI("recyclerView");
        throw null;
    }

    public LinearLayoutManager Jl(View root) {
        int i;
        o.LJIIIZ(root, "root");
        if (!Gl()) {
            i = 5;
        } else {
            TF5 tf5 = this.LJLJLLL;
            if (tf5 != null) {
                i = tf5.LJFF.LJLIL;
            } else {
                o.LJIJI("requiredDependency");
                throw null;
            }
        }
        root.getContext();
        return new GridLayoutManager(i, 1, false);
    }

    public TLG<TEN> Kl(View root) {
        o.LJIIIZ(root, "root");
        Map LJJL = C113554cx.LJJL(new OSZ(TEN.LOADING, new AqS178S0100000_12((AbstractStickerFragment) this, 293)), new OSZ(TEN.EMPTY, new AqS178S0100000_12((AbstractStickerFragment) this, 294)), new OSZ(TEN.ERROR, new AqS178S0100000_12((AbstractStickerFragment) this, 295)));
        Context context = root.getContext();
        o.LJIIIIZZ(context, "root.context");
        TEW tew = new TEW(context, LJJL, TEN.NONE);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        tew.setLayoutParams(layoutParams);
        View view = getView();
        if (view != null) {
            ((ViewGroup) view).addView(tew);
            return tew;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "3005370924670948403");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/sticker/view/internal/pager/pages/AbstractStickerFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/sticker/view/internal/pager/pages/AbstractStickerFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        this.LJLL = z;
        if (this.LJLLI) {
            Hl();
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/sticker/view/internal/pager/pages/AbstractStickerFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        int i;
        TKR tkr;
        float f;
        AbstractC030309z c208828Hm;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLILLLLZI = Jl(view);
        View findViewById = view.findViewById(R.id.kie);
        RecyclerView recyclerView = (RecyclerView) findViewById;
        if (!Gl()) {
            i = 5;
        } else {
            TF5 tf5 = this.LJLJLLL;
            if (tf5 != null) {
                i = tf5.LJFF.LJLILLLLZI;
            } else {
                o.LJIJI("requiredDependency");
                throw null;
            }
        }
        recyclerView.setItemViewCacheSize(i);
        recyclerView.setRecycledViewPool(this.LJLJJLL);
        recyclerView.setHasFixedSize(C82894Wg6.LIZIZ.LJIIIIZZ());
        o.LJIIIIZZ(findViewById, "root.findViewById<Recycl…ectPanelScroll)\n        }");
        RecyclerView recyclerView2 = (RecyclerView) findViewById;
        TF5 tf52 = this.LJLJLLL;
        if (tf52 != null) {
            tkr = tf52.LJFF.LJLJLJ;
        } else {
            tkr = null;
        }
        LinearLayoutManager linearLayoutManager = this.LJLILLLLZI;
        if (linearLayoutManager != null) {
            recyclerView2.setLayoutManager(linearLayoutManager);
            recyclerView2.LJIIJJI(new TEI(tkr, recyclerView2, this));
            if (tkr != null) {
                if (tkr.LLIIIL) {
                    TF5 tf53 = this.LJLJLLL;
                    if (tf53 != null) {
                        if (tf53.LJFF.LJLIL == 4 && recyclerView2.getItemDecorationCount() == 0) {
                            recyclerView2.LJII(new AbstractC030309z() { // from class: X.4ak
                                @Override // X.AbstractC030309z
                                public final void LJ(Rect rect, View view2, RecyclerView recyclerView3, C0AC c0ac) {
                                    Integer num;
                                    Integer num2;
                                    int i2;
                                    float f2;
                                    int i3;
                                    AbstractC028509h abstractC028509h;
                                    int LIZJ = C1JX.LIZJ(rect, "outRect", view2, "view", recyclerView3, "parent", c0ac, "state", view2);
                                    C0A2 layoutManager = recyclerView3.getLayoutManager();
                                    Integer num3 = null;
                                    if (!(layoutManager instanceof GridLayoutManager)) {
                                        layoutManager = null;
                                    }
                                    GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                    if (!(layoutParams instanceof C1BU)) {
                                        layoutParams = null;
                                    }
                                    C1BU c1bu = (C1BU) layoutParams;
                                    if (c1bu != null) {
                                        num = Integer.valueOf(c1bu.LJLIL);
                                    } else {
                                        num = null;
                                    }
                                    if (gridLayoutManager != null) {
                                        num2 = Integer.valueOf(gridLayoutManager.LLIIIL);
                                    } else {
                                        num2 = null;
                                    }
                                    AbstractC029409q adapter = recyclerView3.getAdapter();
                                    int i4 = 0;
                                    if (adapter != null) {
                                        i2 = adapter.getItemCount();
                                    } else {
                                        i2 = 0;
                                    }
                                    if (LIZJ < i2 && gridLayoutManager != null && (abstractC028509h = gridLayoutManager.LLIILII) != null) {
                                        i4 = abstractC028509h.LJFF(LIZJ);
                                    }
                                    if (recyclerView3.getAdapter() != null && LIZJ == r0.getItemCount() - 1) {
                                        f2 = 32.0f;
                                    } else {
                                        f2 = 16.0f;
                                    }
                                    int LIZ = (int) C74275TDb.LIZ(9.0f);
                                    if (num == null || num.intValue() != 0) {
                                        i3 = LIZ / 2;
                                    } else {
                                        i3 = LIZ;
                                    }
                                    rect.left = i3;
                                    if (num != null) {
                                        num3 = C77339UWx.LIZIZ(num, i4);
                                    }
                                    if (!o.LJ(num3, num2)) {
                                        LIZ /= 2;
                                    }
                                    rect.right = LIZ;
                                    rect.bottom = (int) C74275TDb.LIZ(f2);
                                }
                            }, -1);
                            recyclerView2.setVerticalFadingEdgeEnabled(true);
                            recyclerView2.setFadingEdgeLength((int) 20.0f);
                        }
                    } else {
                        o.LJIJI("requiredDependency");
                        throw null;
                    }
                }
                if (tkr.LLIIIJ && recyclerView2.getItemDecorationCount() == 0) {
                    if (tkr.LLIIJI) {
                        c208828Hm = new T47(tkr);
                    } else {
                        c208828Hm = new C208828Hm(false, tkr.LJLLILLLL, false);
                    }
                    recyclerView2.LJII(c208828Hm, -1);
                }
            }
            this.LJLIL = recyclerView2;
            if (!(recyclerView2 instanceof C247129mu)) {
                recyclerView2 = null;
            }
            C247129mu c247129mu = (C247129mu) recyclerView2;
            if (c247129mu != null) {
                if (!Gl()) {
                    f = 1.0f;
                } else {
                    TF5 tf54 = this.LJLJLLL;
                    if (tf54 != null) {
                        f = tf54.LJFF.LJLJI;
                    } else {
                        o.LJIJI("requiredDependency");
                        throw null;
                    }
                }
                c247129mu.setFlingYRatio(f);
            }
            this.LJLJI = Kl(view);
            this.LJLLI = true;
            if (this.LJLL) {
                Hl();
                return;
            }
            return;
        }
        o.LJIJI("layoutManager");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.bcb, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }

    public final void Ll(int i, TF5 requiredDependency, TEJ optionalDependency, RecyclerView.RecycledViewPool recycledViewPool) {
        o.LJIIIZ(requiredDependency, "requiredDependency");
        o.LJIIIZ(optionalDependency, "optionalDependency");
        this.LJLJJL = i;
        this.LJLJL = requiredDependency.LIZ;
        this.LJLJLLL = requiredDependency;
        this.LJLJLJ = optionalDependency;
        this.LJLJJLL = recycledViewPool;
    }
}
