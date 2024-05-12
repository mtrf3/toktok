package X;

import Y.IDComparatorS28S0000000;
import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.e1;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0B1, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0B1 implements Runnable {
    public static final ThreadLocal<C0B1> LJLJJL = new ThreadLocal<>();
    public static final IDComparatorS28S0000000 LJLJJLL = new IDComparatorS28S0000000(3);
    public long LJLILLLLZI;
    public long LJLJI;
    public final ArrayList<RecyclerView> LJLIL = new ArrayList<>();
    public final ArrayList<C03280Ay> LJLJJI = new ArrayList<>();

    public final void LIZIZ() {
        try {
            Trace.beginSection("RV Prefetch");
            if (this.LJLIL.isEmpty()) {
                return;
            }
            int size = this.LJLIL.size();
            long j = 0;
            for (int i = 0; i < size; i++) {
                RecyclerView recyclerView = this.LJLIL.get(i);
                if (recyclerView.getWindowVisibility() == 0) {
                    j = Math.max(recyclerView.getDrawingTime(), j);
                }
            }
            if (j == 0) {
                return;
            }
            LIZLLL(TimeUnit.MILLISECONDS.toNanos(j) + this.LJLJI);
        } finally {
            this.LJLILLLLZI = 0L;
            Trace.endSection();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public final void LIZLLL(long j) {
        C03280Ay c03280Ay;
        RecyclerView recyclerView;
        long j2;
        RecyclerView recyclerView2;
        C03280Ay c03280Ay2;
        boolean z;
        int size = this.LJLIL.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) ListProtector.get(this.LJLIL, i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.LLJI.LIZIZ(recyclerView3, false);
                i += recyclerView3.LLJI.LIZLLL;
            }
        }
        this.LJLJJI.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) ListProtector.get(this.LJLIL, i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                C1C0 c1c0 = recyclerView4.LLJI;
                int abs = Math.abs(c1c0.LIZIZ) + Math.abs(c1c0.LIZ);
                for (int i5 = 0; i5 < c1c0.LIZLLL * 2; i5 += 2) {
                    if (i3 >= this.LJLJJI.size()) {
                        c03280Ay2 = new C03280Ay();
                        this.LJLJJI.add(c03280Ay2);
                    } else {
                        c03280Ay2 = (C03280Ay) ListProtector.get(this.LJLJJI, i3);
                    }
                    int[] iArr = c1c0.LIZJ;
                    int i6 = iArr[i5 + 1];
                    if (i6 <= abs) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c03280Ay2.LIZ = z;
                    c03280Ay2.LIZIZ = abs;
                    c03280Ay2.LIZJ = i6;
                    c03280Ay2.LIZLLL = recyclerView4;
                    c03280Ay2.LJ = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.LJLJJI, LJLJJLL);
        for (int i7 = 0; i7 < this.LJLJJI.size() && (recyclerView = (c03280Ay = (C03280Ay) ListProtector.get(this.LJLJJI, i7)).LIZLLL) != null; i7++) {
            if (c03280Ay.LIZ) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j;
            }
            RecyclerView.ViewHolder LJ = LJ(recyclerView, c03280Ay.LJ, j2);
            if (LJ != null && LJ.mNestedRecyclerView != null && LJ.isBound() && !LJ.isInvalid() && (recyclerView2 = LJ.mNestedRecyclerView.get()) != null) {
                if (recyclerView2.LLII && recyclerView2.LJLJJL.LJII() != 0) {
                    recyclerView2.LJJLIIJ();
                }
                C1C0 c1c02 = recyclerView2.LLJI;
                c1c02.LIZIZ(recyclerView2, true);
                if (c1c02.LIZLLL != 0) {
                    try {
                        Trace.beginSection("RV Nested Prefetch");
                        C0AC c0ac = recyclerView2.LLJIJIL;
                        AbstractC029409q abstractC029409q = recyclerView2.LJLLILLLL;
                        c0ac.LIZLLL = 1;
                        c0ac.LJ = abstractC029409q.getItemCount();
                        c0ac.LJI = false;
                        c0ac.LJII = false;
                        c0ac.LJIIIIZZ = false;
                        for (int i8 = 0; i8 < c1c02.LIZLLL * 2; i8 += 2) {
                            LJ(recyclerView2, c1c02.LIZJ[i8], j);
                        }
                    } finally {
                        Trace.endSection();
                    }
                } else {
                    continue;
                }
            }
            c03280Ay.LIZ = false;
            c03280Ay.LIZIZ = 0;
            c03280Ay.LIZJ = 0;
            c03280Ay.LIZLLL = null;
            c03280Ay.LJ = 0;
        }
    }

    public static RecyclerView.ViewHolder LIZ(RecyclerView recyclerView, int i, long j) {
        int LJII = recyclerView.LJLJJL.LJII();
        for (int i2 = 0; i2 < LJII; i2++) {
            RecyclerView.ViewHolder LJJJJL = RecyclerView.LJJJJL(recyclerView.LJLJJL.LJI(i2));
            if (LJJJJL.mPosition == i && !LJJJJL.isInvalid()) {
                return null;
            }
        }
        C0A7 c0a7 = recyclerView.LJLILLLLZI;
        try {
            recyclerView.LJJLI();
            RecyclerView.ViewHolder LJIIJJI = c0a7.LJIIJJI(i, j);
            if (LJIIJJI != null) {
                if (LJIIJJI.isBound() && !LJIIJJI.isInvalid()) {
                    c0a7.LJIIIIZZ(LJIIJJI.itemView);
                } else {
                    c0a7.LIZ(LJIIJJI, false);
                }
            }
            return LJIIJJI;
        } finally {
            recyclerView.LJJLIIIIJ(false);
        }
    }

    public static RecyclerView.ViewHolder LJ(RecyclerView recyclerView, int i, long j) {
        try {
            return LIZ(recyclerView, i, j);
        } catch (IllegalArgumentException e) {
            if (!e1.LIZ(31744, "rv_gap_worker_illegal_argument_guard", true, false)) {
                throw e;
            }
            return null;
        } catch (IndexOutOfBoundsException e2) {
            PrintStream printStream = System.err;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("GapWorker Guard---->\n");
            LIZ.append(e2.toString());
            printStream.println(X1D.LIZIZ(LIZ));
            if (!e1.LIZ(31744, "recyclerview_gap_worker_guard", true, false)) {
                throw e2;
            }
            return null;
        }
    }

    public final void LIZJ(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.LJLILLLLZI == 0) {
            this.LJLILLLLZI = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C1C0 c1c0 = recyclerView.LLJI;
        c1c0.LIZ = i;
        c1c0.LIZIZ = i2;
    }
}
