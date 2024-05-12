package com.google.android.material.bottomappbar;

import X.C06F;
import X.C16330kX;
import X.C45621qg;
import X.C80463Vhz;
import X.C80470Vi6;
import X.C80473Vi9;
import X.C80474ViA;
import X.ViewOnLayoutChangeListenerC80465Vi1;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.lang.ref.WeakReference;

/* loaded from: classes15.dex */
public class BottomAppBar$Behavior extends HideBottomViewOnScrollBehavior<C80463Vhz> {
    public final Rect LIZLLL;
    public WeakReference<C80463Vhz> LJ;
    public final ViewOnLayoutChangeListenerC80465Vi1 LJFF;

    public BottomAppBar$Behavior() {
        this.LJFF = new ViewOnLayoutChangeListenerC80465Vi1(this);
        this.LIZLLL = new Rect();
    }

    public BottomAppBar$Behavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJFF = new ViewOnLayoutChangeListenerC80465Vi1(this);
        this.LIZLLL = new Rect();
    }

    @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, X.C06C
    public final boolean onLayoutChild(C45621qg c45621qg, View view, int i) {
        C80463Vhz c80463Vhz = (C80463Vhz) view;
        this.LJ = new WeakReference<>(c80463Vhz);
        View LJIJ = c80463Vhz.LJIJ();
        if (LJIJ != null && !C16330kX.LIZJ(LJIJ)) {
            ((C06F) LJIJ.getLayoutParams()).LIZLLL = 49;
            if (LJIJ instanceof C80474ViA) {
                C80474ViA c80474ViA = (C80474ViA) LJIJ;
                c80474ViA.addOnLayoutChangeListener(this.LJFF);
                c80474ViA.LIZIZ();
                c80474ViA.LIZJ(new C80470Vi6(c80463Vhz));
                c80474ViA.LIZLLL();
            }
            C80473Vi9 topEdgeTreatment = c80463Vhz.getTopEdgeTreatment();
            c80463Vhz.getFabTranslationX();
            topEdgeTreatment.getClass();
            c80463Vhz.LJIJ();
            if (c80463Vhz.LLILZIL) {
                View LJIJ2 = c80463Vhz.LJIJ();
                if (LJIJ2 instanceof C80474ViA) {
                    C80474ViA c80474ViA2 = (C80474ViA) LJIJ2;
                    if (c80474ViA2 != null) {
                        c80474ViA2.LJII();
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        c45621qg.LJIIJ(i, c80463Vhz);
        return super.onLayoutChild(c45621qg, c80463Vhz, i);
    }

    @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, X.C06C
    public final boolean onStartNestedScroll(C45621qg c45621qg, View view, View view2, View view3, int i, int i2) {
        C80463Vhz c80463Vhz = (C80463Vhz) view;
        if (c80463Vhz.getHideOnScroll() && super.onStartNestedScroll(c45621qg, c80463Vhz, view2, view3, i, i2)) {
            return true;
        }
        return false;
    }
}
