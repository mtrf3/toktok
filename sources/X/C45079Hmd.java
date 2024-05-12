package X;

import android.view.KeyEvent;

/* renamed from: X.Hmd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45079Hmd implements C5HC {
    public final /* synthetic */ C45054HmE LJLIL;

    public C45079Hmd(C45054HmE c45054HmE) {
        this.LJLIL = c45054HmE;
    }

    @Override // X.C5HC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            this.LJLIL.LLIFFJFJJ();
            return true;
        }
        return false;
    }
}
