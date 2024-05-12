package X;

import androidx.recyclerview.widget.GridLayoutManager;

/* renamed from: X.S0p, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71403S0p extends AbstractC028509h {
    public final /* synthetic */ boolean LJ;
    public final /* synthetic */ GridLayoutManager LJFF;

    @Override // X.AbstractC028509h
    public final int LJFF(int i) {
        if (!this.LJ || i != this.LJFF.LJJJJZ() - 1) {
            return 1;
        }
        return 2;
    }

    public C71403S0p(boolean z, GridLayoutManager gridLayoutManager) {
        this.LJ = z;
        this.LJFF = gridLayoutManager;
    }
}
