package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.53k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1287253k {
    public final InterfaceC65784Pro<View> LIZ;
    public final C57Q LIZIZ;

    public C1287253k() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1287253k)) {
            return false;
        }
        C1287253k c1287253k = (C1287253k) obj;
        return o.LJ(this.LIZ, c1287253k.LIZ) && o.LJ(this.LIZIZ, c1287253k.LIZIZ);
    }

    public final int hashCode() {
        InterfaceC65784Pro<View> interfaceC65784Pro = this.LIZ;
        int hashCode = (interfaceC65784Pro == null ? 0 : interfaceC65784Pro.hashCode()) * 31;
        C57Q c57q = this.LIZIZ;
        return hashCode + (c57q != null ? c57q.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CustomProgressViewConfig(createCustomCircleProgressView=");
        LIZ.append(this.LIZ);
        LIZ.append(", downloadStateListener=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1287253k(InterfaceC65784Pro<? extends View> interfaceC65784Pro, C57Q c57q) {
        this.LIZ = interfaceC65784Pro;
        this.LIZIZ = c57q;
    }
}
