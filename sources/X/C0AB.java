package X;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.0AB, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0AB {
    public RecyclerView LIZIZ;
    public C0A2 LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public View LJFF;
    public int LIZ = -1;
    public final C0A9 LJI = new C0A9();

    public abstract void LIZJ(int i, int i2, C0A9 c0a9);

    public abstract void LIZLLL();

    public abstract void LJ();

    public abstract void LJFF(View view, C0AC c0ac, C0A9 c0a9);

    public final void LJI() {
        if (!this.LJ) {
            return;
        }
        this.LJ = false;
        LJ();
        this.LIZIZ.LLJIJIL.LIZ = -1;
        this.LJFF = null;
        this.LIZ = -1;
        this.LIZLLL = false;
        C0A2 c0a2 = this.LIZJ;
        if (c0a2.LJLJJL == this) {
            c0a2.LJLJJL = null;
        }
        this.LIZJ = null;
        this.LIZIZ = null;
    }

    public PointF LIZ(int i) {
        Object obj = this.LIZJ;
        if (obj instanceof C0AA) {
            return ((C0AA) obj).LJII(i);
        }
        return null;
    }

    public final void LIZIZ(int i, int i2) {
        PointF LIZ;
        RecyclerView recyclerView = this.LIZIZ;
        if (this.LIZ == -1 || recyclerView == null) {
            LJI();
        }
        if (this.LIZLLL && this.LJFF == null && this.LIZJ != null && (LIZ = LIZ(this.LIZ)) != null) {
            float f = LIZ.x;
            if (f != 0.0f || LIZ.y != 0.0f) {
                recyclerView.LJL((int) Math.signum(f), (int) Math.signum(LIZ.y), null);
            }
        }
        boolean z = false;
        this.LIZLLL = false;
        View view = this.LJFF;
        if (view != null) {
            this.LIZIZ.getClass();
            if (RecyclerView.LJJJJJ(view) == this.LIZ) {
                LJFF(this.LJFF, recyclerView.LLJIJIL, this.LJI);
                this.LJI.LIZ(recyclerView);
                LJI();
            } else {
                this.LJFF = null;
            }
        }
        if (this.LJ) {
            LIZJ(i, i2, this.LJI);
            C0A9 c0a9 = this.LJI;
            if (c0a9.LIZLLL >= 0) {
                z = true;
            }
            c0a9.LIZ(recyclerView);
            if (z && this.LJ) {
                this.LIZLLL = true;
                recyclerView.LLIZLLLIL.LIZIZ();
            }
        }
    }
}
