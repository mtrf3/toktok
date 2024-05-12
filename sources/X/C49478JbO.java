package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.JbO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49478JbO implements InterfaceC49482JbS {
    public final int LIZ;
    public final View LIZIZ;

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CheckItemAbility(position=");
        LIZ.append(this.LIZ);
        LIZ.append(", view=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC49482JbS
    public final int getPosition() {
        return this.LIZ;
    }

    @Override // X.InterfaceC49482JbS
    public final View getView() {
        return this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49478JbO)) {
            return false;
        }
        C49478JbO c49478JbO = (C49478JbO) obj;
        if (this.LIZ == c49478JbO.LIZ && o.LJ(this.LIZIZ, c49478JbO.LIZIZ)) {
            return true;
        }
        return false;
    }

    public C49478JbO(int i, View view) {
        o.LJIIIZ(view, "view");
        this.LIZ = i;
        this.LIZIZ = view;
    }
}
