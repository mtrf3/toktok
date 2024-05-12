package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.VhS, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80430VhS extends AbstractC80431VhT {
    public final /* synthetic */ List LIZIZ;
    public final /* synthetic */ Matrix LIZJ;

    public C80430VhS(List list, Matrix matrix) {
        this.LIZIZ = list;
        this.LIZJ = matrix;
    }

    @Override // X.AbstractC80431VhT
    public final void LIZ(Matrix matrix, C80426VhO c80426VhO, int i, Canvas canvas) {
        Iterator it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            ((AbstractC80431VhT) it.next()).LIZ(this.LIZJ, c80426VhO, i, canvas);
        }
    }
}
