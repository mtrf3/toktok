package X;

/* renamed from: X.Ueq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77720Ueq extends AbstractC028509h {
    public final /* synthetic */ C77596Ucq LJ;

    public C77720Ueq(C77596Ucq c77596Ucq) {
        this.LJ = c77596Ucq;
    }

    @Override // X.AbstractC028509h
    public final int LJFF(int i) {
        int itemViewType = this.LJ.getItemViewType(i);
        if (itemViewType == -3 || itemViewType == -2 || itemViewType == -1 || itemViewType == 3 || itemViewType == 4) {
            return 3;
        }
        return 1;
    }
}
