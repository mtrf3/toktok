package X;

import android.view.KeyEvent;

/* renamed from: X.Vxo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81444Vxo implements C5HC {
    public final /* synthetic */ C81443Vxn LJLIL;

    public C81444Vxo(C81443Vxn c81443Vxn) {
        this.LJLIL = c81443Vxn;
    }

    @Override // X.C5HC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            C81443Vxn c81443Vxn = this.LJLIL;
            if (c81443Vxn.LJLJJI) {
                c81443Vxn.hide();
                return true;
            }
            return false;
        }
        return false;
    }
}
