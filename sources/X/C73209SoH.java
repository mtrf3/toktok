package X;

import androidx.recyclerview.widget.GridLayoutManager;

/* renamed from: X.SoH, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73209SoH extends AbstractC028509h {
    public final /* synthetic */ C73207SoF LJ;
    public final /* synthetic */ GridLayoutManager LJFF;
    public final /* synthetic */ AbstractC028509h LJI;

    @Override // X.AbstractC028509h
    public final int LJFF(int i) {
        if (this.LJ.LJLZ(this.LJ.getItemViewType(i))) {
            GridLayoutManager gridLayoutManager = this.LJFF;
            if (gridLayoutManager == null) {
                return 1;
            }
            return gridLayoutManager.LLIIIL;
        }
        AbstractC028509h abstractC028509h = this.LJI;
        if (abstractC028509h == null) {
            return 1;
        }
        return abstractC028509h.LJFF(i - this.LJ.LJLLLLLL());
    }

    public C73209SoH(C73207SoF c73207SoF, GridLayoutManager gridLayoutManager, AbstractC028509h abstractC028509h) {
        this.LJ = c73207SoF;
        this.LJFF = gridLayoutManager;
        this.LJI = abstractC028509h;
    }
}
