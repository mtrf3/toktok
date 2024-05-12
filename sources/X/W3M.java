package X;

import Y.ACListenerS48S0200000_14;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class W3M extends AbstractC56012Ht<W3V, WIS> {
    public LinearLayout LJLIL;
    public C80866VoU LJLILLLLZI;
    public ViewGroup LJLJJI;
    public List<C62Q> LJLJI = C61878OQg.INSTANCE;
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 115));

    public final void LJIJI() {
        LinearLayout linearLayout = this.LJLIL;
        if (linearLayout != null) {
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Context requireSceneContext = requireSceneContext();
            o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
            int LIZLLL = C6IB.LIZLLL(requireSceneContext) - ((int) C170576mj.LIZ(requireSceneContext(), 58.0f));
            int LJFF = C81184Vtc.LJFF(requireSceneContext());
            if (LIZLLL < LJFF) {
                LIZLLL = LJFF;
            }
            marginLayoutParams.topMargin = LIZLLL;
            LinearLayout linearLayout2 = this.LJLIL;
            if (linearLayout2 != null) {
                linearLayout2.setLayoutParams(marginLayoutParams);
                return;
            } else {
                o.LJIJI("toolbox");
                throw null;
            }
        }
        o.LJIJI("toolbox");
        throw null;
    }

    @Override // X.WM7
    public final void onStop() {
        super.onStop();
        ViewGroup viewGroup = this.LJLJJI;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
            ((ValueAnimator) this.LJLJJL.getValue()).cancel();
        } else {
            o.LJIJI("previewAnimContainer");
            throw null;
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        InterfaceC88472Yns<C62Q, C76800UCe> interfaceC88472Yns;
        super.onActivityCreated(bundle);
        View requireViewById = requireViewById(R.id.i1v);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.preview_anim_container)");
        this.LJLJJI = (ViewGroup) requireViewById;
        View requireViewById2 = requireViewById(R.id.lc1);
        o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.tool_box_container)");
        this.LJLIL = (LinearLayout) requireViewById2;
        View requireViewById3 = requireViewById(R.id.lc0);
        o.LJIIIIZZ(requireViewById3, "requireViewById(R.id.too…ar_new_item_promote_view)");
        this.LJLILLLLZI = (C80866VoU) requireViewById3;
        LinearLayout linearLayout = this.LJLIL;
        if (linearLayout != null) {
            int i = 1;
            linearLayout.setOrientation(1);
            LJIJI();
            AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.W3R
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((W3V) obj).LIZIZ;
                }
            }, null, new AqS168S0100000_2(this, 79), 2, null);
            AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.W3Q
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Boolean.valueOf(((W3V) obj).LIZLLL);
                }
            }, null, new AqS180S0100000_14(this, 115), 2, null);
            AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.W3S
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((W3V) obj).LJFF;
                }
            }, null, new AqS180S0100000_14(this, 116), 2, null);
            AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.W3T
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((W3V) obj).LJI;
                }
            }, null, new AqS180S0100000_14(this, 117), 2, null);
            AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.W3U
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((W3V) obj).LJII;
                }
            }, null, new AqS180S0100000_14(this, 113), 2, null);
            AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.W3O
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Boolean.valueOf(((W3V) obj).LIZJ);
                }
            }, null, new AqS168S0100000_2(this, 78), 2, null);
            AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.W3P
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Boolean.valueOf(((W3V) obj).LJ);
                }
            }, null, new AqS180S0100000_14(this, 114), 2, null);
            List LLIILII = ORZ.LLIILII(getUiStates().LJ.LIZ);
            ArrayList arrayList = new ArrayList(C32I.LJJL(LLIILII, 10));
            int i2 = 0;
            int i3 = -1;
            for (Object obj : LLIILII) {
                int i4 = i2 + 1;
                if (i2 >= 0) {
                    W3N w3n = (W3N) obj;
                    if (w3n.LJI) {
                        i3 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(48)) * ((getUiStates().LJ.LIZ.size() - i2) - i);
                    }
                    LinearLayout linearLayout2 = this.LJLIL;
                    if (linearLayout2 != null) {
                        Context sceneContext = getSceneContext();
                        if (sceneContext != null) {
                            C62Q c62q = new C62Q(sceneContext);
                            c62q.setType(w3n.LIZ);
                            if (w3n.LIZIZ == -1) {
                                c62q.setIcon(w3n.LIZJ);
                            } else {
                                ViewGroup.LayoutParams iconLayoutParams = c62q.getIconLayoutParams();
                                C2068389v c2068389v = new C2068389v();
                                c2068389v.LIZJ = iconLayoutParams.height;
                                c2068389v.LIZIZ = iconLayoutParams.width;
                                c2068389v.LIZ = w3n.LIZIZ;
                                c2068389v.LJ = Integer.valueOf(R.attr.dj);
                                c62q.setIcon(c2068389v.LIZ(sceneContext));
                            }
                            int i5 = w3n.LJ;
                            if (i5 > 0) {
                                c62q.setSelectIconView(i5);
                            }
                            c62q.LIZ(w3n.LIZLLL);
                            c62q.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS48S0200000_14(w3n, c62q, 3)));
                            if (HYC.LIZ && (interfaceC88472Yns = w3n.LJFF) != null) {
                                interfaceC88472Yns.invoke(c62q);
                            }
                            if (w3n.LIZ == 0) {
                                ViewGroup.LayoutParams iconLayoutParams2 = c62q.getIconLayoutParams();
                                C2068389v c2068389v2 = new C2068389v();
                                c2068389v2.LIZJ = iconLayoutParams2.height;
                                c2068389v2.LIZIZ = C47959Irz.LIZJ(2, iconLayoutParams2.width);
                                c2068389v2.LIZ = w3n.LIZIZ;
                                c2068389v2.LJ = Integer.valueOf(R.attr.dj);
                                Context context = linearLayout2.getContext();
                                o.LJIIIIZZ(context, "context");
                                c62q.setIcon(c2068389v2.LIZ(context));
                            }
                            linearLayout2.addView(c62q);
                            arrayList.add(c62q);
                            i = 1;
                            i2 = i4;
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    } else {
                        o.LJIJI("toolbox");
                        throw null;
                    }
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            this.LJLJI = arrayList;
            if (i3 != -1) {
                C80866VoU c80866VoU = this.LJLILLLLZI;
                if (c80866VoU != null) {
                    ViewGroup.LayoutParams layoutParams = c80866VoU.getLayoutParams();
                    o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, i3);
                    return;
                }
                o.LJIJI("newItemPromote");
                throw null;
            }
            return;
        }
        o.LJIJI("toolbox");
        throw null;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.kl, viewGroup, false, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
    }
}
