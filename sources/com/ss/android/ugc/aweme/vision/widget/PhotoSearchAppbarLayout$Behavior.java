package com.ss.android.ugc.aweme.vision.widget;

import X.C45621qg;
import X.C63512eR;
import X.C63572eX;
import X.C80217Ve1;
import X.InterfaceC65784Pro;
import X.VWU;
import X.VWV;
import X.VWW;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import kotlin.jvm.internal.AqS74S0400000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class PhotoSearchAppbarLayout$Behavior extends AppBarLayout$Behavior {
    public boolean LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public float LIZLLL;
    public float LJ;

    public PhotoSearchAppbarLayout$Behavior() {
        this.LIZIZ = -1;
        setDragCallback(new VWU());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotoSearchAppbarLayout$Behavior(Context context, AttributeSet attrs) {
        super(context, attrs);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(attrs, "attrs");
        this.LIZIZ = -1;
        setDragCallback(new VWU());
    }

    @Override // com.google.android.material.appbar.HeaderBehavior, X.C06C
    public final boolean onInterceptTouchEvent(C45621qg parent, View view, MotionEvent ev) {
        C80217Ve1 child = (C80217Ve1) view;
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(child, "child");
        o.LJIIIZ(ev, "ev");
        if (ev.getActionMasked() == 0 && (child instanceof VWV)) {
            boolean z = false;
            this.LIZJ = false;
            this.LIZLLL = ev.getRawX();
            this.LJ = ev.getRawY();
            VWV vwv = (VWV) child;
            InterfaceC65784Pro<Boolean> interfaceC65784Pro = vwv.LJZI;
            if (interfaceC65784Pro != null && interfaceC65784Pro.invoke().booleanValue()) {
                z = true;
            }
            this.LIZ = z;
            this.LIZIZ = -1;
            if (z) {
                VWW vww = vwv.LJZ;
                vww.getClass();
                vww.LIZLLL = ev.getRawX();
                vww.LJ = ev.getRawY();
                vww.LJI = -1;
            }
        }
        return super.onInterceptTouchEvent(parent, child, ev);
    }

    @Override // com.google.android.material.appbar.HeaderBehavior, X.C06C
    public final boolean onTouchEvent(C45621qg parent, View view, MotionEvent ev) {
        int i;
        C80217Ve1 child = (C80217Ve1) view;
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(child, "child");
        o.LJIIIZ(ev, "ev");
        if (child instanceof VWV) {
            AqS74S0400000_14 aqS74S0400000_14 = new AqS74S0400000_14(ev, parent, child, this, 1);
            if (this.LIZIZ == -1) {
                float abs = Math.abs(ev.getRawX() - this.LIZLLL);
                float abs2 = Math.abs(ev.getRawY() - this.LJ);
                float f = (abs2 * abs2) + (abs * abs);
                VWV vwv = (VWV) child;
                int scaledTouchSlop = ViewConfiguration.get(vwv.getContext()).getScaledTouchSlop();
                if (f > scaledTouchSlop * scaledTouchSlop) {
                    if (abs2 > abs) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    this.LIZIZ = i;
                }
                if (this.LIZIZ == 0 && this.LIZ) {
                    vwv.LJZ.LJII.LJIIIIZZ(0);
                }
            }
            if (!this.LIZ && this.LIZIZ != 0) {
                VWV vwv2 = (VWV) child;
                boolean LJII = vwv2.LJII();
                boolean z = this.LIZJ;
                this.LIZJ = LJII;
                if (z != LJII && LJII) {
                    VWW vww = vwv2.LJZ;
                    vww.getClass();
                    vww.LIZLLL = ev.getRawX();
                    vww.LJ = ev.getRawY();
                    vww.LJI = -1;
                }
                if (this.LIZJ) {
                    this.LIZ = vwv2.LJIIIZ(ev, C63512eR.LJLIL);
                }
            }
            if (this.LIZ && this.LIZIZ == 1) {
                return ((VWV) child).LJIIIZ(ev, C63572eX.LJLIL);
            }
            return ((Boolean) aqS74S0400000_14.invoke()).booleanValue();
        }
        return super.onTouchEvent(parent, child, ev);
    }

    public static final /* synthetic */ boolean LIZ(MotionEvent motionEvent, C45621qg c45621qg, C80217Ve1 c80217Ve1, PhotoSearchAppbarLayout$Behavior photoSearchAppbarLayout$Behavior) {
        return super.onTouchEvent(c45621qg, c80217Ve1, motionEvent);
    }
}
