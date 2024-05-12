package com.ss.android.ugc.aweme.adaptation;

import X.C157226Fa;
import X.C157236Fb;
import X.C6FB;
import X.C81184Vtc;
import X.OQN;
import Y.IDCListenerS252S0100000_2;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public abstract class BaseScreenAdaptScene extends AbsSceneAdaptationScene {
    public View LJLJLJ;
    public int LJLJLLL;
    public boolean LJLJJL = true;
    public boolean LJLJJLL = true;
    public boolean LJLJL = true;
    public IDCListenerS252S0100000_2 LJLL = new IDCListenerS252S0100000_2(this, 0);

    public abstract void LIZIZ(boolean z);

    public abstract void LIZJ(boolean z);

    public abstract void LJIJI();

    public boolean LLLF() {
        return true;
    }

    public void LLLFZ(int i, int i2) {
    }

    public final void LLLFFI() {
        LJIJI();
        if (LLLFF() instanceof C157236Fb) {
            switch (C157236Fb.LIZ.LJIIIZ()) {
                case 1:
                case 4:
                    LIZIZ(true);
                    LIZJ(true);
                    return;
                case 2:
                case 5:
                    LIZIZ(false);
                    LIZJ(true);
                    return;
                case 3:
                case 6:
                    LIZIZ(true);
                    LIZJ(false);
                    return;
                default:
                    LIZIZ(false);
                    LIZJ(false);
                    return;
            }
        }
        if (!(LLLFF() instanceof C157226Fa)) {
            return;
        }
        C6FB LLLFF = LLLFF();
        o.LJII(LLLFF, "null cannot be cast to non-null type com.ss.android.ugc.aweme.adaptation.NewAVScreenAdaptPresenter");
        LIZIZ(((C157226Fa) LLLFF).LJIIL());
        C6FB LLLFF2 = LLLFF();
        o.LJII(LLLFF2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.adaptation.NewAVScreenAdaptPresenter");
        LIZJ(((C157226Fa) LLLFF2).LJIILIIL());
    }

    @Override // X.AbstractC42651GoZ, X.AbstractC147255qD, X.WM7
    public void onDestroyView() {
        super.onDestroyView();
        View view = this.LJLJLJ;
        if (view != null) {
            view.removeOnLayoutChangeListener(this.LJLL);
            this.LJLL = null;
        }
    }

    @Override // X.AbstractC42651GoZ, X.WM7
    public void onResume() {
        super.onResume();
        if (this.LJLJJLL) {
            this.LJLJJLL = false;
            if (LLLFF() instanceof C157226Fa) {
                this.LJLJLLL = C157226Fa.LIZ.LIZLLL();
            } else {
                Activity activity = this.mActivity;
                if (activity != null) {
                    int LIZJ = C81184Vtc.LIZJ(activity);
                    this.LJLJLLL = LIZJ;
                    if (LIZJ != LLLFF().LIZLLL()) {
                        LLLFF().LIZJ(this.LJLJLLL);
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            LLLFFI();
            if (this.LJLJL) {
                View view = this.LJLJLJ;
                if (view != null) {
                    view.addOnLayoutChangeListener(this.LJLL);
                    return;
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            View view2 = this.LJLJLJ;
            if (view2 != null) {
                view2.removeOnLayoutChangeListener(this.LJLL);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
    }

    @Override // X.AbstractC42651GoZ, X.WM7
    public void onStart() {
        Window window;
        View decorView;
        Window window2;
        Window window3;
        super.onStart();
        if (this.LJLJJL) {
            this.LJLJJL = false;
            Activity activity = this.mActivity;
            if (activity != null && (window3 = activity.getWindow()) != null) {
                window3.clearFlags(1024);
            }
            Activity activity2 = this.mActivity;
            if (activity2 != null) {
                OQN.LJIILIIL(activity2);
                Activity activity3 = this.mActivity;
                if (activity3 != null && (window2 = activity3.getWindow()) != null) {
                    window2.setNavigationBarColor(-16777216);
                }
                Activity activity4 = this.mActivity;
                if (activity4 != null && (window = activity4.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                    decorView.setBackgroundColor(-16777216);
                }
                Activity activity5 = this.mActivity;
                if (activity5 != null) {
                    LLLFZ(C81184Vtc.LJFF(activity5), LLLFF().LJI());
                    this.LJLJLJ = requireView();
                    return;
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public C6FB LLLFF() {
        return C157236Fb.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene, X.AbstractC42651GoZ, X.WM7
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.LJLJL = true;
    }
}
