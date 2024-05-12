package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* renamed from: X.0FJ, reason: invalid class name */
/* loaded from: classes.dex */
public class C0FJ extends Drawable.ConstantState {
    public C40681ii LIZ;
    public AnimatorSet LIZIZ;
    public ArrayList<Animator> LIZJ;
    public C1HQ<Animator, String> LIZLLL;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    public C0FJ(C0FI c0fi) {
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
