package X;

import android.view.KeyEvent;

/* renamed from: X.Hws, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45714Hws implements C5HC {
    public final /* synthetic */ C45709Hwn LJLIL;

    public C45714Hws(C45709Hwn c45709Hwn) {
        this.LJLIL = c45709Hwn;
    }

    @Override // X.C5HC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        this.LJLIL.LLJJ(false, false);
        return true;
    }
}
