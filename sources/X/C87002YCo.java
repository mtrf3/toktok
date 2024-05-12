package X;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.b0;

/* renamed from: X.YCo, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87002YCo {
    public final RecyclerView.ViewHolder LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MoveInfo{holder=");
        LIZ.append(this.LIZ);
        LIZ.append(", fromX=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", fromY=");
        LIZ.append(this.LIZJ);
        LIZ.append(", toX=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", toY=");
        return b0.LIZJ(LIZ, this.LJ, '}', LIZ);
    }

    public C87002YCo(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        this.LIZ = viewHolder;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = i4;
    }
}
