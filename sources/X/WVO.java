package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WVO extends AbstractC56012Ht<WVI, C53602L1y> implements WVW {
    public WVP LJLIL;
    public FrameLayout LJLILLLLZI;

    @Override // X.WVW
    public final void LJJIJIIJIL() {
        WVP wvp = this.LJLIL;
        if (wvp != null) {
            wvp.setCurrentScaleMode(0);
            getUiActions().LJLJJL.invoke();
        } else {
            o.LJIJI("recordLayout");
            throw null;
        }
    }

    public final void LLJILJIL() {
        FrameLayout frameLayout = this.LJLILLLLZI;
        if (frameLayout != null) {
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            Context requireSceneContext = requireSceneContext();
            o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
            layoutParams2.bottomMargin = C6IB.LIZJ(requireSceneContext) - ((int) C74275TDb.LIZ(114.0f));
            FrameLayout frameLayout2 = this.LJLILLLLZI;
            if (frameLayout2 != null) {
                frameLayout2.setLayoutParams(layoutParams2);
                return;
            } else {
                o.LJIJI("layoutContainer");
                throw null;
            }
        }
        o.LJIJI("layoutContainer");
        throw null;
    }

    public WVO() {
        int i;
        if (C44363Hb5.LIZ()) {
            i = 25;
        } else {
            i = 40;
        }
        O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(i)));
    }

    @Override // X.WVW
    public final void LJJJJI() {
        getUiActions().LJLILLLLZI.invoke();
    }

    @Override // X.WVW
    public final void LJJJJIZL() {
        getUiActions().LJLIL.invoke();
    }

    @Override // X.WVW
    public final void LLJJJJJIL() {
        getUiActions().LJLJI.invoke();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View requireViewById = requireViewById(R.id.ire);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.record_layout)");
        this.LJLIL = (WVP) requireViewById;
        View requireViewById2 = requireViewById(R.id.h6d);
        o.LJIIIIZZ(requireViewById2, "requireViewById(R.id.now_button_layout_container)");
        this.LJLILLLLZI = (FrameLayout) requireViewById2;
        LLJILJIL();
        WVP wvp = this.LJLIL;
        if (wvp != null) {
            wvp.setNowStoryCombine(true);
            WVP wvp2 = this.LJLIL;
            if (wvp2 != null) {
                wvp2.setListener(this);
                AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.WVN
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((WVI) obj).LIZ;
                    }
                }, null, new AqS180S0100000_14(this, 102), 2, null);
                AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.WVT
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((WVI) obj).LIZIZ;
                    }
                }, null, new AqS180S0100000_14(this, 103), 2, null);
                AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.WVJ
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((WVI) obj).LIZLLL;
                    }
                }, null, new AqS180S0100000_14(this, 104), 2, null);
                AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.WVU
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((WVI) obj).LIZJ;
                    }
                }, null, new AqS180S0100000_14(this, 105), 2, null);
                AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.WVV
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((WVI) obj).LJ;
                    }
                }, null, new AqS180S0100000_14(this, 96), 2, null);
                AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.WVS
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((WVI) obj).LJFF;
                    }
                }, null, new AqS180S0100000_14(this, 97), 2, null);
                AbstractC56012Ht.observe$default(this, getUiStates(), new TBT() { // from class: X.WVK
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return Boolean.valueOf(((WVI) obj).LJIIIZ);
                    }
                }, null, new AqS180S0100000_14(this, 98), 2, null);
                AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.WVL
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((WVI) obj).LJII;
                    }
                }, null, new AqS180S0100000_14(this, 99), 2, null);
                AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.WVM
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((WVI) obj).LJIIIIZZ;
                    }
                }, null, new AqS180S0100000_14(this, 100), 2, null);
                AbstractC56012Ht.observeEvent$default(this, getUiStates(), new TBT() { // from class: X.WV8
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((WVI) obj).LJI;
                    }
                }, null, new AqS180S0100000_14(this, 101), 2, null);
                return;
            }
            o.LJIJI("recordLayout");
            throw null;
        }
        o.LJIJI("recordLayout");
        throw null;
    }

    @Override // X.WVW
    public final void LLJJJJLIIL(float f, float f2) {
        WVP wvp = this.LJLIL;
        if (wvp != null) {
            wvp.setHasBeenMoveScaled(true);
            getUiActions().LJLJJI.invoke(Float.valueOf(f), Float.valueOf(f2));
        } else {
            o.LJIJI("recordLayout");
            throw null;
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cdu, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
    }
}
