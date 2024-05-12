package X;

import androidx.databinding.ViewDataBinding;
import java.lang.ref.WeakReference;

/* renamed from: X.07p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C024107p<T> extends WeakReference<ViewDataBinding> {
    public final InterfaceC024007o<T> LIZ;
    public final int LIZIZ;
    public T LIZJ;

    public final boolean LIZ() {
        boolean z;
        T t = this.LIZJ;
        if (t != null) {
            this.LIZ.LIZIZ(t);
            z = true;
        } else {
            z = false;
        }
        this.LIZJ = null;
        return z;
    }

    public C024107p(ViewDataBinding viewDataBinding, int i, InterfaceC024007o<T> interfaceC024007o) {
        super(viewDataBinding, ViewDataBinding.LJZI);
        this.LIZIZ = i;
        this.LIZ = interfaceC024007o;
    }
}
