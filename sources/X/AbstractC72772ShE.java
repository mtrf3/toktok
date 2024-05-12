package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.a1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS191S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.ShE, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC72772ShE extends AbstractC72775ShH implements ValueAnimator.AnimatorUpdateListener {
    public final List<C72771ShD> LJLLILLLL;
    public boolean LJLLJ;

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        LIZLLL(new TBU(this) { // from class: X.ShF
            @Override // X.TBU, X.AbstractC74223TBb, X.InterfaceC74226TBe
            public final Object get() {
                return ((AbstractC72775ShH) this.receiver).getAnimator();
            }

            @Override // X.TBU, X.AbstractC74223TBb, X.InterfaceC74227TBf
            public final void set(Object obj) {
                ((AbstractC72775ShH) this.receiver).setAnimator((ValueAnimator) obj);
            }
        }, new AqS191S0100000_9(this, 78));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getAnimator().removeUpdateListener(this);
        this.LJLLJ = false;
    }

    public final List<C72771ShD> getPlaceholders() {
        return this.LJLLILLLL;
    }

    public final void LJ(int i) {
        while (((ArrayList) this.LJLLILLLL).size() > i) {
            ((Drawable) ListProtector.remove(this.LJLLILLLL, 0)).setCallback(null);
        }
        while (((ArrayList) this.LJLLILLLL).size() < i) {
            List<C72771ShD> list = this.LJLLILLLL;
            C72771ShD c72771ShD = new C72771ShD();
            c72771ShD.setCallback(this);
            ((ArrayList) list).add(c72771ShD);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        if (!LIZJ()) {
            super.dispatchDraw(canvas);
            return;
        }
        if (!this.LJLLJ) {
            this.LJLLJ = true;
            getAnimator().addUpdateListener(this);
            if (!getAnimator().isStarted()) {
                getAnimator().start();
            }
        }
        for (C72771ShD c72771ShD : this.LJLLILLLL) {
            c72771ShD.LIZ = getRadius();
            c72771ShD.LIZIZ.setColor(getPlaceholderColor());
            getPulsingColor();
            c72771ShD.draw(canvas);
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        o.LJIIIZ(drawable, "drawable");
        if (ORZ.LJLJJI(drawable, this.LJLLILLLL)) {
            invalidate();
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        o.LJIIIZ(animation, "animation");
        for (C72771ShD c72771ShD : this.LJLLILLLL) {
            Object animatedValue = animation.getAnimatedValue();
            o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            c72771ShD.LIZLLL.setColor(((Integer) animatedValue).intValue());
            invalidate();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC72772ShE(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC72772ShE(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJLLILLLL = new ArrayList();
    }
}
