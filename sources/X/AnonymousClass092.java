package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* renamed from: X.092, reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass092 extends AnimationSet implements Runnable {
    public final ViewGroup LJLIL;
    public final View LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            if (!this.LJLJI && this.LJLJJL) {
                this.LJLJJL = false;
                this.LJLIL.post(this);
            } else {
                this.LJLIL.endViewTransition(this.LJLILLLLZI);
                this.LJLJJI = true;
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.LJLJJL = true;
        if (this.LJLJI) {
            return !this.LJLJJI;
        }
        if (!super.getTransformation(j, transformation)) {
            this.LJLJI = true;
            ViewTreeObserverOnPreDrawListenerC16840lM.LIZ(this.LJLIL, this);
        }
        return true;
    }

    public AnonymousClass092(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.LJLJJL = true;
        this.LJLIL = viewGroup;
        this.LJLILLLLZI = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.LJLJJL = true;
        if (this.LJLJI) {
            return !this.LJLJJI;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.LJLJI = true;
            ViewTreeObserverOnPreDrawListenerC16840lM.LIZ(this.LJLIL, this);
        }
        return true;
    }
}
