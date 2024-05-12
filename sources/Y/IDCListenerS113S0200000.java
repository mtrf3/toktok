package Y;

import X.C04D;
import X.C36001bA;
import X.C68322mC;
import X.C78996UzQ;
import X.X1D;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class IDCListenerS113S0200000 implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewAttachedToWindow$0(this, view);
                return;
            case 1:
                o.LJIIIZ(view, "v");
                return;
            default:
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(view, "v");
                return;
            case 1:
                onViewDetachedFromWindow$1(this, view);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [kotlin.jvm.internal.IDqS176S0200000, T] */
    public static final void onViewAttachedToWindow$0(IDCListenerS113S0200000 iDCListenerS113S0200000, View v) {
        o.LJIIIZ(v, "v");
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get((C04D) iDCListenerS113S0200000.l0);
        C04D c04d = (C04D) iDCListenerS113S0200000.l0;
        if (lifecycleOwner != null) {
            C68322mC c68322mC = (C68322mC) iDCListenerS113S0200000.l1;
            Lifecycle lifecycle = lifecycleOwner.getLifecycle();
            o.LJIIIIZZ(lifecycle, "lco.lifecycle");
            c68322mC.element = C78996UzQ.LIZJ(c04d, lifecycle);
            ((C04D) iDCListenerS113S0200000.l0).removeOnAttachStateChangeListener(iDCListenerS113S0200000);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("View tree for ");
        LIZ.append(c04d);
        LIZ.append(" has no ViewTreeLifecycleOwner");
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalStateException(LIZIZ);
    }

    public static final void onViewDetachedFromWindow$1(IDCListenerS113S0200000 iDCListenerS113S0200000, View v) {
        o.LJIIIZ(v, "v");
        ((View) iDCListenerS113S0200000.l0).removeOnAttachStateChangeListener(iDCListenerS113S0200000);
        ((C36001bA) iDCListenerS113S0200000.l1).LJJI();
    }

    public IDCListenerS113S0200000(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
