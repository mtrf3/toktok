package X;

import androidx.recyclerview.widget.GridLayoutManager;

/* renamed from: X.SoJ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73211SoJ extends AbstractC028509h {
    public final /* synthetic */ C73210SoI LJ;
    public final /* synthetic */ GridLayoutManager LJFF;
    public final /* synthetic */ AbstractC028509h LJI;

    @Override // X.AbstractC028509h
    public final int LJFF(int i) {
        if (this.LJ.LL(this.LJ.getItemViewType(i))) {
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
        return abstractC028509h.LJFF(i - this.LJ.LJZL());
    }

    public C73211SoJ(C73210SoI c73210SoI, GridLayoutManager gridLayoutManager, AbstractC028509h abstractC028509h) {
        this.LJ = c73210SoI;
        this.LJFF = gridLayoutManager;
        this.LJI = abstractC028509h;
    }
}
