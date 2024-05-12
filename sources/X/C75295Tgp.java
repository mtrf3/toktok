package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Tgp, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75295Tgp {
    public final int LIZ;
    public final View LIZIZ;
    public double LIZJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("position:");
        LIZ.append(this.LIZ);
        LIZ.append(" percentage:");
        LIZ.append(this.LIZJ);
        return X1D.LIZIZ(LIZ);
    }

    public C75295Tgp(int i, View view) {
        o.LJIIIZ(view, "view");
        this.LIZ = i;
        this.LIZIZ = view;
    }
}
