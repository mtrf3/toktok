package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.Shs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72812Shs<VH> {
    public final InterfaceC88472Yns<ViewGroup, VH> LIZ;
    public final InterfaceC88472Yns<Integer, Boolean> LIZIZ;
    public final int LIZJ;
    public final InterfaceC88471Ynr<Integer, RecyclerView, C76800UCe> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C72812Shs)) {
            return false;
        }
        C72812Shs c72812Shs = (C72812Shs) obj;
        return o.LJ(this.LIZ, c72812Shs.LIZ) && o.LJ(this.LIZIZ, c72812Shs.LIZIZ) && this.LIZJ == c72812Shs.LIZJ && o.LJ(this.LIZLLL, c72812Shs.LIZLLL);
    }

    public final int hashCode() {
        InterfaceC88472Yns<ViewGroup, VH> interfaceC88472Yns = this.LIZ;
        int hashCode = (interfaceC88472Yns != null ? interfaceC88472Yns.hashCode() : 0) * 31;
        InterfaceC88472Yns<Integer, Boolean> interfaceC88472Yns2 = this.LIZIZ;
        int hashCode2 = (((hashCode + (interfaceC88472Yns2 != null ? interfaceC88472Yns2.hashCode() : 0)) * 31) + this.LIZJ) * 31;
        InterfaceC88471Ynr<Integer, RecyclerView, C76800UCe> interfaceC88471Ynr = this.LIZLLL;
        return hashCode2 + (interfaceC88471Ynr != null ? interfaceC88471Ynr.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HolderCreator(factory=");
        LIZ.append(this.LIZ);
        LIZ.append(", typeMatcher=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", viewType=");
        LIZ.append(this.LIZJ);
        LIZ.append(", onAttachedToRecyclerView=");
        LIZ.append(this.LIZLLL);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C72812Shs(InterfaceC88472Yns<? super ViewGroup, ? extends VH> factory, InterfaceC88472Yns<? super Integer, Boolean> typeMatcher, int i, InterfaceC88471Ynr<? super Integer, ? super RecyclerView, C76800UCe> interfaceC88471Ynr) {
        o.LJIIJ(factory, "factory");
        o.LJIIJ(typeMatcher, "typeMatcher");
        this.LIZ = factory;
        this.LIZIZ = typeMatcher;
        this.LIZJ = i;
        this.LIZLLL = interfaceC88471Ynr;
    }
}
