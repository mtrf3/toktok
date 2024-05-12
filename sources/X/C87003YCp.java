package X;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.b0;

/* renamed from: X.YCp, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87003YCp {
    public final RecyclerView.ViewHolder LIZ;
    public final int LIZIZ;
    public final int LIZJ = 0;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddInfo{holder=");
        LIZ.append(this.LIZ);
        LIZ.append(", translationY=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", translationX=");
        return b0.LIZJ(LIZ, this.LIZJ, '}', LIZ);
    }

    public C87003YCp(RecyclerView.ViewHolder viewHolder, int i) {
        this.LIZ = viewHolder;
        this.LIZIZ = i;
    }
}
