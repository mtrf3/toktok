package X;

import Y.ACListenerS34S0100000_14;
import Y.ARunnableS50S0100000_14;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.IDqS456S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wpb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83483Wpb {
    public C44946HkU LIZ;
    public final RecyclerView LIZIZ;
    public final View LIZJ;
    public final View LIZLLL;
    public final View LJ;
    public final View LJFF;
    public final C83477WpV LJI;
    public final C5V2 LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public Effect LJIIJ;
    public final View LJIIJJI;
    public final View LJIIL;
    public final View LJIILIIL;
    public final boolean LJIILJJIL;
    public final boolean LJIILL;
    public final View LJIILLIIL;
    public final View LJIIZILJ;
    public final View LJIJ;
    public final View LJIJI;
    public final ViewGroup LJIJJ;
    public final InterfaceC65784Pro<Boolean> LJIJJLI;
    public final InterfaceC65784Pro<Boolean> LJIL;
    public final boolean LJJ;
    public final Activity LJJI;
    public final InterfaceC83485Wpd LJJIFFI;
    public final InterfaceC83481WpZ LJJII;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LJJIII;

    public final void LIZLLL() {
        View view;
        LJIIJ(false);
        if (this.LJIILJJIL) {
            LJ();
        } else {
            View view2 = this.LJIILIIL;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            InterfaceC65784Pro<Boolean> interfaceC65784Pro = this.LJIJJLI;
            if (interfaceC65784Pro != null && interfaceC65784Pro.invoke().booleanValue() && (view = this.LJIIL) != null) {
                view.setVisibility(0);
            }
        }
        InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns = this.LJJIII;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.FALSE);
        }
    }

    public final void LIZIZ() {
        C83477WpV c83477WpV = this.LJI;
        Iterator it = ((ArrayList) c83477WpV.LJLJJI).iterator();
        while (it.hasNext()) {
            ((C83489Wph) it.next()).LJIIIZ = -1;
        }
        ((ArrayList) c83477WpV.LJLJJI).clear();
        ((LinkedHashMap) c83477WpV.LJLJJL).clear();
        c83477WpV.LJLJI = null;
        c83477WpV.LJLIL = -1;
        this.LJI.notifyDataSetChanged();
    }

    public final View LIZJ() {
        if (this.LJIILJJIL) {
            if (this.LJJ) {
                return this.LJIILLIIL;
            }
            return this.LJIIZILJ;
        }
        return this.LJIILIIL;
    }

    public final void LJFF() {
        this.LJI.LJZ();
        if (this.LJIIIZ) {
            this.LIZIZ.post(new ARunnableS50S0100000_14(this, 230));
        }
    }

    public final void LJIILIIL() {
        C83477WpV c83477WpV = this.LJI;
        c83477WpV.LJLJI = null;
        int i = c83477WpV.LJLIL;
        if (i >= 0) {
            c83477WpV.notifyItemChanged(i);
        }
        c83477WpV.LJLIL = -1;
    }

    public final void LJ() {
        View view;
        ViewGroup.LayoutParams layoutParams;
        View LIZJ = LIZJ();
        if (LIZJ != null) {
            LIZJ.setVisibility(8);
        }
        if (this.LJJ) {
            view = this.LJIJ;
        } else {
            view = this.LJIJI;
        }
        if (view != null) {
            view.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams2 = null;
        if (!this.LJJ) {
            this.LJIIJJI.setBackgroundResource(R.drawable.vw);
            ViewGroup viewGroup = this.LJIJJ;
            if (viewGroup != null) {
                layoutParams = viewGroup.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                layoutParams2 = layoutParams;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            if (marginLayoutParams != null) {
                marginLayoutParams.rightMargin = 0;
            }
            ViewGroup viewGroup2 = this.LJIJJ;
            if (viewGroup2 != null) {
                viewGroup2.setLayoutParams(marginLayoutParams);
            }
        } else {
            RecyclerView recyclerView = this.LIZIZ;
            ViewGroup.LayoutParams layoutParams3 = recyclerView.getLayoutParams();
            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                layoutParams2 = layoutParams3;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.rightMargin = (int) C74275TDb.LIZIZ(this.LJJI, 16.0f);
            }
            recyclerView.setLayoutParams(marginLayoutParams2);
        }
        this.LJIIIZ = false;
    }

    public final void LJI() {
        View view;
        ViewGroup.LayoutParams layoutParams;
        View LIZJ = LIZJ();
        if (LIZJ != null) {
            LIZJ.setVisibility(0);
        }
        if (this.LJJ) {
            view = this.LJIJ;
        } else {
            view = this.LJIJI;
        }
        if (view != null) {
            view.setVisibility(0);
        }
        ViewGroup.LayoutParams layoutParams2 = null;
        if (!this.LJJ) {
            this.LJIIJJI.setBackgroundResource(R.drawable.vx);
            ViewGroup viewGroup = this.LJIJJ;
            if (viewGroup != null) {
                layoutParams = viewGroup.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                layoutParams2 = layoutParams;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            if (marginLayoutParams != null) {
                marginLayoutParams.rightMargin = (int) C74275TDb.LIZIZ(this.LJJI, 50.0f);
            }
            ViewGroup viewGroup2 = this.LJIJJ;
            if (viewGroup2 != null) {
                viewGroup2.setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        RecyclerView recyclerView = this.LIZIZ;
        ViewGroup.LayoutParams layoutParams3 = recyclerView.getLayoutParams();
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            layoutParams2 = layoutParams3;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.rightMargin = 0;
        }
        recyclerView.setLayoutParams(marginLayoutParams2);
    }

    public final void LIZ(C83489Wph data) {
        o.LJIIIZ(data, "data");
        C83477WpV c83477WpV = this.LJI;
        c83477WpV.getClass();
        ((ArrayList) c83477WpV.LJLJJI).add(data);
        c83477WpV.notifyItemInserted(c83477WpV.getItemCount() - 1);
    }

    public final void LJII(String str) {
        C83477WpV c83477WpV = this.LJI;
        c83477WpV.getClass();
        if (TextUtils.isEmpty(str) || ((ArrayList) c83477WpV.LJLJJI).isEmpty()) {
            return;
        }
        int size = ((ArrayList) c83477WpV.LJLJJI).size();
        for (int i = 0; i < size; i++) {
            if (ujb.o.LJJJJIZL(str, ((C83489Wph) ListProtector.get(c83477WpV.LJLJJI, i)).LIZIZ, false)) {
                c83477WpV.LJLJI = (C83489Wph) ListProtector.get(c83477WpV.LJLJJI, i);
                int i2 = c83477WpV.LJLIL;
                if (i2 >= 0) {
                    c83477WpV.notifyItemChanged(i2);
                }
                c83477WpV.notifyItemChanged(i);
                c83477WpV.LJLIL = i;
                return;
            }
        }
    }

    public final void LJIIIZ(List<C83489Wph> dataList) {
        o.LJIIIZ(dataList, "dataList");
        if (dataList.isEmpty()) {
            return;
        }
        C83477WpV c83477WpV = this.LJI;
        c83477WpV.getClass();
        ((ArrayList) c83477WpV.LJLJJI).clear();
        ((ArrayList) c83477WpV.LJLJJI).addAll(dataList);
        c83477WpV.LJZ();
        c83477WpV.notifyDataSetChanged();
    }

    public final void LJIIJ(boolean z) {
        int i;
        Object obj;
        if (!z && this.LJJ && this.LJIIJJI.getVisibility() == 0) {
            ViewGroup viewGroup = this.LJIJJ;
            if (viewGroup != null) {
                obj = viewGroup.getParent();
            } else {
                obj = null;
            }
            if (!(obj instanceof RelativeLayout)) {
                obj = null;
            }
            View view = (View) obj;
            if (view != null) {
                view.setBackground(null);
            }
        }
        View view2 = this.LJIIJJI;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view2.setVisibility(i);
    }

    public final void LJIIIIZZ(Effect effect, boolean z) {
        this.LJIIJ = effect;
        if (z) {
            View LIZJ = LIZJ();
            if (LIZJ != null) {
                C16880lQ.LJIIJ(null, LIZJ);
                return;
            }
            return;
        }
        View LIZJ2 = LIZJ();
        if (LIZJ2 != null) {
            C16880lQ.LJIIJ(new ViewOnClickListenerC83482Wpa(LIZJ2, this, effect), LIZJ2);
        }
    }

    public final void LJIIJJI(boolean z, C44946HkU c44946HkU, String str) {
        View view;
        Boolean bool;
        InterfaceC83485Wpd interfaceC83485Wpd;
        int i;
        float f;
        ViewParent viewParent;
        this.LIZ = c44946HkU;
        C83477WpV c83477WpV = this.LJI;
        c83477WpV.LJLILLLLZI = c44946HkU;
        c83477WpV.LJLL = this.LJIIJ;
        c83477WpV.LJLJL = this.LJJIFFI;
        boolean z2 = true;
        LJIIJ(true);
        InterfaceC65784Pro<Boolean> interfaceC65784Pro = this.LJIL;
        if (interfaceC65784Pro != null && interfaceC65784Pro.invoke().booleanValue()) {
            ViewGroup viewGroup = this.LJIJJ;
            Object obj = null;
            if (viewGroup != null) {
                viewParent = viewGroup.getParent();
            } else {
                viewParent = null;
            }
            if (viewParent instanceof RelativeLayout) {
                obj = viewParent;
            }
            View view2 = (View) obj;
            if (view2 != null) {
                T4D.LIZ(this.LJJI, view2);
            }
        }
        int i2 = 8;
        if (c44946HkU != null && c44946HkU.LJLJI) {
            if (this.LJIILJJIL) {
                if (this.LJIIIZ) {
                    LJI();
                    z2 = false;
                }
                this.LJIIIZ = z2;
            } else {
                View view3 = this.LJIILIIL;
                if (view3 != null) {
                    view3.setVisibility(0);
                }
                View view4 = this.LJIIL;
                if (view4 != null) {
                    view4.setVisibility(8);
                }
            }
            View LIZJ = LIZJ();
            if (LIZJ != null) {
                if (this.LJI.LJLJJL.size() >= c44946HkU.LJLJJI) {
                    f = 1.0f;
                } else {
                    f = 0.4f;
                }
                LIZJ.setAlpha(f);
            }
        } else if (this.LJIILJJIL) {
            LJ();
        } else {
            View view5 = this.LJIILIIL;
            if (view5 != null) {
                view5.setVisibility(8);
            }
            InterfaceC65784Pro<Boolean> interfaceC65784Pro2 = this.LJIJJLI;
            if (interfaceC65784Pro2 != null && interfaceC65784Pro2.invoke().booleanValue() && (view = this.LJIIL) != null) {
                view.setVisibility(0);
            }
        }
        boolean z3 = this.LJIILL;
        View view6 = this.LJFF;
        if (view6 != null) {
            if (z3) {
                i = 0;
            } else {
                i = 8;
            }
            view6.setVisibility(i);
        }
        if (c44946HkU != null && (bool = c44946HkU.LJLJJLL) != null) {
            boolean booleanValue = bool.booleanValue();
            if (z && (interfaceC83485Wpd = this.LJJIFFI) != null) {
                interfaceC83485Wpd.LJJII(str, booleanValue);
            }
            View view7 = this.LJ;
            if (booleanValue) {
                i2 = 0;
            }
            view7.setVisibility(i2);
        }
        InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns = this.LJJIII;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.TRUE);
        }
        InterfaceC83485Wpd interfaceC83485Wpd2 = this.LJJIFFI;
        if (interfaceC83485Wpd2 != null) {
            Effect effect = this.LJIIJ;
            if (effect != null) {
                effect.getEffect_id();
            }
            interfaceC83485Wpd2.LJJI();
        }
    }

    public static /* synthetic */ void LJIIL(C83483Wpb c83483Wpb, boolean z, C44946HkU c44946HkU, int i) {
        if ((i & 2) != 0) {
            c44946HkU = null;
        }
        c83483Wpb.LJIIJJI(z, c44946HkU, null);
    }

    public C83483Wpb(View view, View view2, View view3, boolean z, View view4, View view5, View view6, View view7, ViewGroup viewGroup, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, boolean z2, ActivityC45651qj activity, InterfaceC83485Wpd interfaceC83485Wpd, InterfaceC83481WpZ interfaceC83481WpZ, boolean z3, InterfaceC88472Yns interfaceC88472Yns, int i) {
        boolean z4 = z;
        View view8 = view3;
        InterfaceC88472Yns interfaceC88472Yns2 = interfaceC88472Yns;
        boolean z5 = z3;
        boolean z6 = z2;
        InterfaceC65784Pro interfaceC65784Pro3 = interfaceC65784Pro2;
        View view9 = view5;
        View view10 = view4;
        View view11 = view6;
        View view12 = view7;
        ViewGroup viewGroup2 = viewGroup;
        InterfaceC65784Pro interfaceC65784Pro4 = interfaceC65784Pro;
        View view13 = (i & 2) != 0 ? null : view2;
        view8 = (i & 4) != 0 ? null : view8;
        z4 = (i & 8) != 0 ? false : z4;
        view10 = (i & 32) != 0 ? null : view10;
        view9 = (i & 64) != 0 ? null : view9;
        view11 = (i & 128) != 0 ? null : view11;
        view12 = (i & 256) != 0 ? null : view12;
        viewGroup2 = (i & 512) != 0 ? null : viewGroup2;
        interfaceC65784Pro4 = (i & 1024) != 0 ? null : interfaceC65784Pro4;
        interfaceC65784Pro3 = (i & 2048) != 0 ? null : interfaceC65784Pro3;
        z6 = (i & 4096) != 0 ? false : z6;
        z5 = (65536 & i) != 0 ? false : z5;
        interfaceC88472Yns2 = (i & 131072) != 0 ? null : interfaceC88472Yns2;
        o.LJIIIZ(activity, "activity");
        this.LJIIJJI = view;
        this.LJIIL = view13;
        this.LJIILIIL = view8;
        this.LJIILJJIL = z4;
        this.LJIILL = false;
        this.LJIILLIIL = view10;
        this.LJIIZILJ = view9;
        this.LJIJ = view11;
        this.LJIJI = view12;
        this.LJIJJ = viewGroup2;
        this.LJIJJLI = interfaceC65784Pro4;
        this.LJIL = interfaceC65784Pro3;
        this.LJJ = z6;
        this.LJJI = activity;
        this.LJJIFFI = interfaceC83485Wpd;
        this.LJJII = interfaceC83481WpZ;
        this.LJJIII = interfaceC88472Yns2;
        View findViewById = view.findViewById(R.id.fl9);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.layout_rv_face_matting)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.LIZIZ = recyclerView;
        C83477WpV c83477WpV = new C83477WpV(activity, interfaceC83481WpZ, z5, z6, new IDqS456S0100000_14(this, 5));
        this.LJI = c83477WpV;
        this.LJII = new C5V2(activity);
        this.LJIIIIZZ = true;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setAdapter(c83477WpV);
        AbstractC030109x itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            ((AbstractC28931Bp) itemAnimator).LJI = false;
            recyclerView.LJII(new C208828Hm(true, 2.0f, false), -1);
            View findViewById2 = view.findViewById(R.id.fb_);
            o.LJIIIIZZ(findViewById2, "rootView.findViewById(R.id.iv_text)");
            this.LIZJ = findViewById2;
            o.LJIIIIZZ(view.findViewById(R.id.l4f), "rootView.findViewById(R.id.text_img)");
            C16880lQ.LJIIJ(new ACListenerS34S0100000_14(this, 115), findViewById2);
            View findViewById3 = view.findViewById(R.id.f_t);
            o.LJIIIIZZ(findViewById3, "rootView.findViewById(R.id.iv_select)");
            this.LIZLLL = findViewById3;
            C16880lQ.LJIIJ(new ACListenerS34S0100000_14(this, 116), findViewById3);
            View findViewById4 = view.findViewById(R.id.f3u);
            o.LJIIIIZZ(findViewById4, "rootView.findViewById(R.id.iv_giphy)");
            this.LJ = findViewById4;
            C16880lQ.LJIIJ(new ACListenerS34S0100000_14(this, 117), findViewById4);
            View findViewById5 = view.findViewById(R.id.f0d);
            this.LJFF = findViewById5;
            if (findViewById5 != null) {
                C16880lQ.LJIIJ(new ACListenerS34S0100000_14(this, 118), findViewById5);
            }
            LJIIJ(false);
            ((ImageView) view.findViewById(R.id.jla)).setColorFilter(-1);
            View LIZJ = LIZJ();
            if (LIZJ != null) {
                if (z4) {
                    LJ();
                }
                LIZJ.setVisibility(8);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
    }
}
