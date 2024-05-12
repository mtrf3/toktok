package X;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: X.2hm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65582hm<T> extends WeakReference<T> {
    public final int LIZ;

    public final int hashCode() {
        return this.LIZ;
    }

    public C65582hm(T t) {
        super(t);
        int hashCode;
        if (t == null) {
            hashCode = 0;
        } else {
            hashCode = t.hashCode();
        }
        this.LIZ = hashCode;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C65582hm)) {
            return false;
        }
        T t = get();
        Object obj2 = ((Reference) obj).get();
        if (t == null) {
            if (t != obj2) {
                return false;
            }
            return true;
        }
        return t.equals(obj2);
    }
}
