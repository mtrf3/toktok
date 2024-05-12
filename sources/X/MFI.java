package X;

import androidx.recyclerview.widget.GridLayoutManager;

/* loaded from: classes10.dex */
public final class MFI extends AbstractC028509h {
    public final /* synthetic */ MK7 LJ;
    public final /* synthetic */ C0A2 LJFF;

    @Override // X.AbstractC028509h
    public final int LJFF(int i) {
        int itemViewType = this.LJ.getItemViewType(i);
        if (itemViewType == Integer.MIN_VALUE) {
            return ((GridLayoutManager) this.LJFF).LLIIIL;
        }
        MK7 mk7 = this.LJ;
        MFH mfh = mk7.spanSizeLookup2;
        if (mfh != null) {
            MFA mfa = (MFA) mfh;
            if (itemViewType == 5 || itemViewType == 8 || itemViewType == 9 || itemViewType == 10 || itemViewType == 13) {
                return mfa.LJ.LJZI.LLIIIL;
            }
        } else {
            AbstractC028509h abstractC028509h = mk7.spanSizeLookup;
            if (abstractC028509h != null) {
                return abstractC028509h.LJFF(i);
            }
        }
        return 1;
    }

    public MFI(MK7 mk7, C0A2 c0a2) {
        this.LJ = mk7;
        this.LJFF = c0a2;
    }
}
