package X;

import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.Sht, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72813Sht<VH> {
    public final InterfaceC88472Yns<ViewGroup, VH> LIZ;
    public final InterfaceC88472Yns<Integer, Boolean> LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C72813Sht)) {
            return false;
        }
        C72813Sht c72813Sht = (C72813Sht) obj;
        return o.LJ(this.LIZ, c72813Sht.LIZ) && o.LJ(this.LIZIZ, c72813Sht.LIZIZ) && this.LIZJ == c72813Sht.LIZJ;
    }

    public final int hashCode() {
        InterfaceC88472Yns<ViewGroup, VH> interfaceC88472Yns = this.LIZ;
        int hashCode = (interfaceC88472Yns != null ? interfaceC88472Yns.hashCode() : 0) * 31;
        InterfaceC88472Yns<Integer, Boolean> interfaceC88472Yns2 = this.LIZIZ;
        return ((hashCode + (interfaceC88472Yns2 != null ? interfaceC88472Yns2.hashCode() : 0)) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HolderCreator(factory=");
        LIZ.append(this.LIZ);
        LIZ.append(", typeMatcher=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", viewType=");
        return C08380Uo.LIZ(LIZ, this.LIZJ, ")", LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C72813Sht(InterfaceC88472Yns<? super ViewGroup, ? extends VH> factory, InterfaceC88472Yns<? super Integer, Boolean> typeMatcher, int i) {
        o.LJIIIZ(factory, "factory");
        o.LJIIIZ(typeMatcher, "typeMatcher");
        this.LIZ = factory;
        this.LIZIZ = typeMatcher;
        this.LIZJ = i;
    }
}
