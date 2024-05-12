package X;

import androidx.recyclerview.widget.GridLayoutManager;

/* renamed from: X.aal, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94051aal extends AbstractC028509h {
    public final /* synthetic */ C94052aam LJ;
    public final /* synthetic */ C0A2 LJFF;

    @Override // X.AbstractC028509h
    public final int LJFF(int i) {
        C94052aam c94052aam = this.LJ;
        GridLayoutManager gridLayoutManager = (GridLayoutManager) this.LJFF;
        if (c94052aam.getItemViewType(i) == Integer.MIN_VALUE) {
            return gridLayoutManager.LLIIIL;
        }
        return 1;
    }

    public C94051aal(C94052aam c94052aam, C0A2 c0a2) {
        this.LJ = c94052aam;
        this.LJFF = c0a2;
    }
}
