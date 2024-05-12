package X;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.b0;

/* renamed from: X.YCn, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87001YCn {
    public RecyclerView.ViewHolder LIZ;
    public RecyclerView.ViewHolder LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ChangeInfo{oldHolder=");
        LIZ.append(this.LIZ);
        LIZ.append(", newHolder=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", fromX=");
        LIZ.append(this.LIZJ);
        LIZ.append(", fromY=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", toX=");
        LIZ.append(this.LJ);
        LIZ.append(", toY=");
        return b0.LIZJ(LIZ, this.LJFF, '}', LIZ);
    }

    public C87001YCn(int i, int i2, int i3, int i4, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        this.LIZ = viewHolder;
        this.LIZIZ = viewHolder2;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = i3;
        this.LJFF = i4;
    }
}
