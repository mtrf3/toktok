package X;

import androidx.recyclerview.widget.GridLayoutManager;

/* renamed from: X.Snu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73186Snu extends AbstractC028509h {
    public final /* synthetic */ C73184Sns LJ;
    public final /* synthetic */ C0A2 LJFF;
    public final /* synthetic */ AbstractC028509h LJI;

    @Override // X.AbstractC028509h
    public final int LJFF(int i) {
        if (C73184Sns.LJZI(this.LJ.getItemViewType(i))) {
            return ((GridLayoutManager) this.LJFF).LLIIIL;
        }
        AbstractC028509h abstractC028509h = this.LJI;
        if (abstractC028509h != null) {
            return abstractC028509h.LJFF(i - this.LJ.LJLZ());
        }
        return 1;
    }

    public C73186Snu(C73184Sns c73184Sns, C0A2 c0a2, AbstractC028509h abstractC028509h) {
        this.LJ = c73184Sns;
        this.LJFF = c0a2;
        this.LJI = abstractC028509h;
    }
}
