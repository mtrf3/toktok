package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;

/* renamed from: X.0RS, reason: invalid class name */
/* loaded from: classes.dex */
public class C0RS<T extends ViewGroup.LayoutParams> {
    public T LIZ;
    public int LIZIZ;
    public int LIZJ;

    public Class<? extends ViewGroup.LayoutParams> LIZJ() {
        return ViewGroup.LayoutParams.class;
    }

    public C0RS(T t) {
        LIZIZ(t);
    }

    public void LIZIZ(T t) {
        this.LIZIZ = ((ViewGroup.LayoutParams) t).height;
        this.LIZJ = ((ViewGroup.LayoutParams) t).width;
        this.LIZ = t;
    }

    public boolean LIZ(View view, ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null || this.LIZ != layoutParams || layoutParams.width != this.LIZJ || layoutParams.height != this.LIZIZ) {
            return false;
        }
        return true;
    }
}
