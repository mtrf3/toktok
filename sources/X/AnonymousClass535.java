package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.535, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass535 extends C53C {
    public final AnonymousClass523 LIZ;
    public final int LIZIZ;
    public final View LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass535)) {
            return false;
        }
        AnonymousClass535 anonymousClass535 = (AnonymousClass535) obj;
        return o.LJ(this.LIZ, anonymousClass535.LIZ) && this.LIZIZ == anonymousClass535.LIZIZ && o.LJ(this.LIZJ, anonymousClass535.LIZJ);
    }

    public final int hashCode() {
        int hashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31;
        View view = this.LIZJ;
        return hashCode + (view == null ? 0 : view.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FuncItemClickAction(funcItem=");
        LIZ.append(this.LIZ);
        LIZ.append(", position=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", itemView=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public AnonymousClass535(AnonymousClass523 funcItem, int i, View view) {
        o.LJIIIZ(funcItem, "funcItem");
        this.LIZ = funcItem;
        this.LIZIZ = i;
        this.LIZJ = view;
    }
}
