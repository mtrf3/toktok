package X;

import android.view.KeyEvent;

/* renamed from: X.Hq7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45295Hq7 implements C5HC {
    public final /* synthetic */ C45290Hq2 LJLIL;

    public C45295Hq7(C45290Hq2 c45290Hq2) {
        this.LJLIL = c45290Hq2;
    }

    @Override // X.C5HC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            this.LJLIL.r80();
            return true;
        }
        return false;
    }
}
