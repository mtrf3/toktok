package X;

import Y.ARunnableS38S0100000_2;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6di, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164986di extends PagerAdapter {
    public final WM7 LJLILLLLZI;
    public final C164926dc LJLJI;
    public final InterfaceC165006dk LJLJJI;
    public final InterfaceC153045zY LJLJJL;
    public final SparseArray<AbstractC170376mP> LJLJJLL;
    public AbstractC170376mP LJLJL;
    public final List<Effect> LJLJLJ;
    public List<EffectCategoryResponse> LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LJLJLLL.size();
    }

    public final List<EffectPointModel> LJJIII(int i) {
        AbstractC170376mP abstractC170376mP = this.LJLJJLL.get(i);
        if (abstractC170376mP == null) {
            return new ArrayList();
        }
        if (abstractC170376mP instanceof C170346mM) {
            C170346mM c170346mM = (C170346mM) abstractC170376mP;
            c170346mM.LJIIL();
            return c170346mM.LL;
        }
        if (abstractC170376mP instanceof C170336mL) {
            C170416mT c170416mT = ((C170336mL) abstractC170376mP).LJLLJ;
            if (c170416mT != null) {
                c170416mT.notifyDataSetChanged();
            } else {
                o.LJIJI("adapter");
                throw null;
            }
        }
        return new ArrayList();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJIILLIIL(int i, ViewGroup container) {
        AbstractC170376mP c170336mL;
        o.LJIIIZ(container, "container");
        String key = ((com.ss.ugc.effectplatform.model.EffectCategoryResponse) ListProtector.get(this.LJLJLLL, i)).getKey();
        if (this.LJLJJLL.get(i) == null) {
            if (!C164996dj.LIZJ(key)) {
                c170336mL = new C170346mM(this.LJLILLLLZI, container, (C84507XEp) this.LJLLI.getValue(), i, key, ORZ.LLJILJILJ(((EffectCategoryResponseTemplate) ListProtector.get(this.LJLJLLL, i)).getTotalEffects()), this.LJLJI, this.LJLJJI, (RecyclerView.RecycledViewPool) this.LJLL.getValue(), this.LJLJJL);
            } else {
                c170336mL = new C170336mL(this.LJLILLLLZI, container, key, this.LJLJI, this.LJLJJI, (RecyclerView.RecycledViewPool) this.LJLL.getValue());
            }
            this.LJLJJLL.put(i, c170336mL);
            View LJI = c170336mL.LJI();
            if (i == 0 && (c170336mL instanceof C170346mM)) {
                C170346mM c170346mM = (C170346mM) c170336mL;
                if (!C165016dl.LIZ().getBoolean("long_press_guide_shown", false)) {
                    C164926dc c164926dc = c170346mM.LJLLILLLL;
                    if (c164926dc.LIZJ && !c164926dc.LJJIIJ && !C164996dj.LIZLLL(c170346mM.LJLIL)) {
                        c170346mM.LJ().postDelayed(new ARunnableS38S0100000_2(c170346mM, 168), 300L);
                        return LJI;
                    }
                    return LJI;
                }
                return LJI;
            }
            return LJI;
        }
        View LJ = this.LJLJJLL.get(i).LJ();
        container.addView(LJ);
        return LJ;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJIIZILJ(View view, Object obj) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(obj, "obj");
        return o.LJ(view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup container, Object obj) {
        View view;
        o.LJIIIZ(container, "container");
        o.LJIIIZ(obj, "obj");
        if ((obj instanceof View) && (view = (View) obj) != null) {
            C16880lQ.LJLLL(view, container);
        }
        AbstractC170376mP abstractC170376mP = this.LJLJJLL.get(i);
        if (abstractC170376mP != null) {
            abstractC170376mP.LJIIIIZZ(false);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIL(int i, ViewGroup container, Object obj) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(obj, "obj");
        if (o.LJ(this.LJLJJLL.get(i), this.LJLJL)) {
            return;
        }
        AbstractC170376mP abstractC170376mP = this.LJLJL;
        if (abstractC170376mP != null) {
            abstractC170376mP.LJIIIIZZ(false);
        }
        AbstractC170376mP abstractC170376mP2 = this.LJLJJLL.get(i);
        this.LJLJL = abstractC170376mP2;
        if (abstractC170376mP2 != null) {
            abstractC170376mP2.LJIIIIZZ(true);
        }
    }

    public C164986di(WM7 scene, Context context, C164926dc config, InterfaceC165006dk interfaceC165006dk, InterfaceC153045zY interfaceC153045zY) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(config, "config");
        this.LJLILLLLZI = scene;
        this.LJLJI = config;
        this.LJLJJI = interfaceC165006dk;
        this.LJLJJL = interfaceC153045zY;
        this.LJLJJLL = new SparseArray<>();
        this.LJLJLJ = new ArrayList();
        this.LJLJLLL = new ArrayList();
        this.LJLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 884));
        this.LJLLI = C221108m2.LIZIZ(C170246mC.LJLIL);
    }
}
