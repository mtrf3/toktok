package X;

import android.view.KeyEvent;

/* renamed from: X.JId, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48927JId implements GHC {
    public final /* synthetic */ C48929JIf LJLIL;

    public C48927JId(C48929JIf c48929JIf) {
        this.LJLIL = c48929JIf;
    }

    @Override // X.GHC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.LJLIL.isPlaying() && JYH.LIZIZ.LJIIJ() && (i == 24 || i == 25)) {
            this.LJLIL.LJIIL("modifySoundStatus", C113554cx.LJJJLZIJ(new OSZ("isMute", 0)));
        }
        return false;
    }
}
