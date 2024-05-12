package X;

import androidx.recyclerview.widget.GridLayoutManager;

/* renamed from: X.afy, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94374afy extends AbstractC028509h {
    public final /* synthetic */ AbstractC94375afz LJ;
    public final /* synthetic */ C0A2 LJFF;
    public final /* synthetic */ AbstractC028509h LJI;

    @Override // X.AbstractC028509h
    public final int LJFF(int i) {
        int itemViewType = this.LJ.getItemViewType(i);
        if (itemViewType == 268435729) {
            this.LJ.getClass();
        }
        if (itemViewType == 268436275) {
            this.LJ.getClass();
        }
        this.LJ.getClass();
        this.LJ.getClass();
        if (itemViewType == 268436821 || itemViewType == 268435729 || itemViewType == 268436275 || itemViewType == 268436002) {
            return ((GridLayoutManager) this.LJFF).LLIIIL;
        }
        return this.LJI.LJFF(i);
    }

    public C94374afy(AbstractC94375afz abstractC94375afz, C0A2 c0a2, AbstractC028509h abstractC028509h) {
        this.LJ = abstractC94375afz;
        this.LJFF = c0a2;
        this.LJI = abstractC028509h;
    }
}
