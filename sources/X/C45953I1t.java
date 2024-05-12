package X;

import android.view.KeyEvent;

/* renamed from: X.I1t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45953I1t implements C5HC {
    public final /* synthetic */ C45946I1m LJLIL;

    public C45953I1t(C45946I1m c45946I1m) {
        this.LJLIL = c45946I1m;
    }

    @Override // X.C5HC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            this.LJLIL.LLF();
            return true;
        }
        return false;
    }
}
