package X;

import android.content.Context;
import android.util.AttributeSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SH8 extends SJA implements InterfaceC71511S4t {
    public C71863SIh LJLJLJ;
    public float LJLJLLL;
    public final LinkedHashSet<InterfaceC71509S4r> LJLL;

    @Override // X.SJA
    public final SJ3 LIZ() {
        C71863SIh c71863SIh = new C71863SIh(new SJ5(), getContext());
        this.LJLJLJ = c71863SIh;
        return c71863SIh;
    }

    @Override // X.SJA
    public final SJ4 LIZIZ() {
        C71863SIh c71863SIh = this.LJLJLJ;
        if (c71863SIh != null) {
            return new C71862SIg(c71863SIh);
        }
        o.LJIJI("controllerImp");
        throw null;
    }

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    @Override // X.InterfaceC71511S4t
    public final void LIZJ(InterfaceC71509S4r transitionListener) {
        o.LJIIIZ(transitionListener, "transitionListener");
        this.LJLL.add(transitionListener);
    }

    @Override // X.InterfaceC71511S4t
    public final void LIZLLL(C70777Rq9 c70777Rq9) {
        this.LJLL.remove(c70777Rq9);
    }

    @Override // X.InterfaceC71511S4t
    public void setDragTransitionEnabled(boolean z) {
        C71863SIh c71863SIh = this.LJLJLJ;
        if (c71863SIh != null) {
            c71863SIh.LLIFFJFJJ = z;
        } else {
            o.LJIJI("controllerImp");
            throw null;
        }
    }

    @Override // X.InterfaceC71511S4t
    public void setMaxDragTransitionFactor(float f) {
        C71863SIh c71863SIh = this.LJLJLJ;
        if (c71863SIh != null) {
            c71863SIh.LLIIIL = f;
        } else {
            o.LJIJI("controllerImp");
            throw null;
        }
    }

    public final void setOnScaleChangeListener(SH9 sh9) {
        C71863SIh c71863SIh = this.LJLJLJ;
        if (c71863SIh != null) {
            c71863SIh.LLIIJI = sh9;
        } else {
            o.LJIJI("controllerImp");
            throw null;
        }
    }

    public SH8(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SH8(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new LinkedHashMap();
        this.LJLL = new LinkedHashSet<>();
        C71512S4u c71512S4u = new C71512S4u(this);
        C71863SIh c71863SIh = this.LJLJLJ;
        if (c71863SIh != null) {
            c71863SIh.LIZJ(c71512S4u);
        } else {
            o.LJIJI("controllerImp");
            throw null;
        }
    }
}
