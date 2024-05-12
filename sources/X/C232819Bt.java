package X;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.9Bt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C232819Bt<T> {
    public final WeakReference<T> LIZ;

    public final int hashCode() {
        T t = this.LIZ.get();
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public C232819Bt(C173656rh c173656rh) {
        this.LIZ = new WeakReference<>(c173656rh);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            cls = null;
        } else {
            cls = obj.getClass();
        }
        if (!o.LJ(C232819Bt.class, cls)) {
            return false;
        }
        if (obj != null) {
            if (o.LJ(this.LIZ.get(), ((C232819Bt) obj).LIZ.get())) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.cut_imageloader_fresco_dmt.WeakWrapper<*>");
    }
}
