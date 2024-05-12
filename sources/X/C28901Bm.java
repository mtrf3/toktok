package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;

/* renamed from: X.1Bm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C28901Bm implements C0AH {
    public final /* synthetic */ RecyclerView LIZ;

    public C28901Bm(RecyclerView recyclerView) {
        this.LIZ = recyclerView;
    }

    public final void LIZ(C0AI c0ai) {
        int i = c0ai.LIZ;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 8) {
                        return;
                    }
                    this.LIZ.LJLLJ.LJLIIL(c0ai.LIZIZ, c0ai.LIZLLL);
                    return;
                } else {
                    RecyclerView recyclerView = this.LIZ;
                    recyclerView.LJLLJ.LJLJI(recyclerView, c0ai.LIZIZ, c0ai.LIZLLL);
                    return;
                }
            }
            RecyclerView recyclerView2 = this.LIZ;
            recyclerView2.LJLLJ.LJLIL(recyclerView2, c0ai.LIZIZ, c0ai.LIZLLL);
            return;
        }
        this.LIZ.LJLLJ.LJLI(c0ai.LIZIZ, c0ai.LIZLLL);
    }

    public final void LIZJ(int i, int i2) {
        RecyclerView recyclerView = this.LIZ;
        int LJII = recyclerView.LJLJJL.LJII();
        for (int i3 = 0; i3 < LJII; i3++) {
            RecyclerView.ViewHolder LJJJJL = RecyclerView.LJJJJL(recyclerView.LJLJJL.LJI(i3));
            if (LJJJJL != null && !LJJJJL.shouldIgnore() && LJJJJL.mPosition >= i) {
                LJJJJL.offsetPosition(i2, false);
                recyclerView.LLJIJIL.LJFF = true;
            }
        }
        C0A7 c0a7 = recyclerView.LJLILLLLZI;
        int size = c0a7.LIZJ.size();
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) ListProtector.get(c0a7.LIZJ, i4);
            if (viewHolder != null && viewHolder.mPosition >= i) {
                viewHolder.offsetPosition(i2, false);
            }
        }
        recyclerView.requestLayout();
        this.LIZ.LLJILLL = true;
    }

    public final void LIZLLL(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.LIZ;
        int LJII = recyclerView.LJLJJL.LJII();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < LJII; i11++) {
            RecyclerView.ViewHolder LJJJJL = RecyclerView.LJJJJL(recyclerView.LJLJJL.LJI(i11));
            if (LJJJJL != null && (i9 = LJJJJL.mPosition) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    LJJJJL.offsetPosition(i2 - i, false);
                } else {
                    LJJJJL.offsetPosition(i5, false);
                }
                recyclerView.LLJIJIL.LJFF = true;
            }
        }
        C0A7 c0a7 = recyclerView.LJLILLLLZI;
        c0a7.getClass();
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = c0a7.LIZJ.size();
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) ListProtector.get(c0a7.LIZJ, i12);
            if (viewHolder != null && (i8 = viewHolder.mPosition) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    viewHolder.offsetPosition(i2 - i, false);
                } else {
                    viewHolder.offsetPosition(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        this.LIZ.LLJILLL = true;
    }

    public final void LIZIZ(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.LIZ;
        int LJII = recyclerView.LJLJJL.LJII();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < LJII; i6++) {
            View LJI = recyclerView.LJLJJL.LJI(i6);
            RecyclerView.ViewHolder LJJJJL = RecyclerView.LJJJJL(LJI);
            if (LJJJJL != null && !LJJJJL.shouldIgnore() && (i4 = LJJJJL.mPosition) >= i && i4 < i5) {
                LJJJJL.addFlags(2);
                LJJJJL.addChangePayload(obj);
                ((RecyclerView.LayoutParams) LJI.getLayoutParams()).mInsetsDirty = true;
            }
        }
        C0A7 c0a7 = recyclerView.LJLILLLLZI;
        int size = c0a7.LIZJ.size();
        while (true) {
            size--;
            if (size >= 0) {
                RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) ListProtector.get(c0a7.LIZJ, size);
                if (viewHolder != null && (i3 = viewHolder.mPosition) >= i && i3 < i5) {
                    viewHolder.addFlags(2);
                    c0a7.LJII(size);
                }
            } else {
                this.LIZ.LLJJ = true;
                return;
            }
        }
    }
}
