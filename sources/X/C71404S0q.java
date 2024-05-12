package X;

import androidx.recyclerview.widget.GridLayoutManager;

/* renamed from: X.S0q, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71404S0q extends AbstractC028509h {
    public final /* synthetic */ boolean LJ;
    public final /* synthetic */ GridLayoutManager LJFF;

    @Override // X.AbstractC028509h
    public final int LJFF(int i) {
        if (i == 0) {
            return 2;
        }
        if (this.LJ && i == this.LJFF.LJJJJZ() - 1) {
            return 2;
        }
        return 1;
    }

    public C71404S0q(boolean z, GridLayoutManager gridLayoutManager) {
        this.LJ = z;
        this.LJFF = gridLayoutManager;
    }
}
