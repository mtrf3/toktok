package X;

import android.view.KeyEvent;

/* loaded from: classes8.dex */
public final class IDL implements C5HC {
    public final /* synthetic */ C46245ICz LJLIL;

    public IDL(C46245ICz c46245ICz) {
        this.LJLIL = c46245ICz;
    }

    @Override // X.C5HC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        IDH idh;
        if (i != 4 || (idh = this.LJLIL.LJLJLJ) == null || !idh.isShowing()) {
            return false;
        }
        IDH idh2 = this.LJLIL.LJLJLJ;
        if (idh2 != null) {
            idh2.hide();
        }
        return true;
    }
}
