package X;

import com.bytedance.android.livesdk.usercard.profilev3.LiveProfileHeaderCell;

/* loaded from: classes6.dex */
public final class CVW implements CVX {
    public final /* synthetic */ LiveProfileHeaderCell LIZ;

    @Override // X.CVX
    public final void LIZ() {
        C31499CXv c31499CXv = this.LIZ.LJLJLJ;
        if (c31499CXv == null) {
            return;
        }
        c31499CXv.setDrawMask(true);
    }

    @Override // X.CVX
    public final void LIZIZ() {
        C31499CXv c31499CXv = this.LIZ.LJLJLJ;
        if (c31499CXv == null) {
            return;
        }
        c31499CXv.setDrawMask(false);
    }

    public CVW(LiveProfileHeaderCell liveProfileHeaderCell) {
        this.LIZ = liveProfileHeaderCell;
    }
}
