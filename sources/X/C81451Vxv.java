package X;

import android.view.KeyEvent;

/* renamed from: X.Vxv, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81451Vxv implements C5HC {
    public final /* synthetic */ C81449Vxt LJLIL;

    public C81451Vxv(C81449Vxt c81449Vxt) {
        this.LJLIL = c81449Vxt;
    }

    @Override // X.C5HC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && this.LJLIL.isVisible()) {
            this.LJLIL.LLJJI().hidePanel();
            return true;
        }
        return false;
    }
}
