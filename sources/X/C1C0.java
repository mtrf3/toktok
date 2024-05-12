package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: X.1C0, reason: invalid class name */
/* loaded from: classes.dex */
public class C1C0 implements C0A0 {
    public int LIZ;
    public int LIZIZ;
    public int[] LIZJ;
    public int LIZLLL;

    public final void LIZ(int i, int i2) {
        if (i >= 0) {
            if (i2 >= 0) {
                int i3 = this.LIZLLL * 2;
                int[] iArr = this.LIZJ;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.LIZJ = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[i3 * 2];
                    this.LIZJ = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.LIZJ;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.LIZLLL++;
                return;
            }
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        throw new IllegalArgumentException("Layout positions must be non-negative");
    }

    public final void LIZIZ(RecyclerView recyclerView, boolean z) {
        this.LIZLLL = 0;
        int[] iArr = this.LIZJ;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        C0A2 c0a2 = recyclerView.LJLLJ;
        if (recyclerView.LJLLILLLL != null && c0a2 != null && c0a2.LJLL) {
            if (z) {
                if (!recyclerView.LJLJJI.LJI()) {
                    c0a2.LJJIII(recyclerView.LJLLILLLL.getItemCount(), this);
                }
            } else if (recyclerView.LL && !recyclerView.LLII && !recyclerView.LJLJJI.LJI()) {
                c0a2.LJJII(this.LIZ, this.LIZIZ, recyclerView.LLJIJIL, this);
            }
            int i = this.LIZLLL;
            if (i > c0a2.LJLLI) {
                c0a2.LJLLI = i;
                c0a2.LJLLILLLL = z;
                recyclerView.LJLILLLLZI.LJIILIIL();
            }
        }
    }
}
