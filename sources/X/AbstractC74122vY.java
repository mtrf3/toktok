package X;

import android.os.SystemClock;

/* renamed from: X.2vY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC74122vY implements InterfaceC70422pa {
    public final /* synthetic */ C64962gm LJLIL = C48841JEv.LIZIZ();
    public InterfaceC74132vZ LJLILLLLZI;
    public XKQ LJLJI;
    public long LJLJJI;
    public long LJLJJL;
    public int LJLJJLL;

    @Override // X.InterfaceC70422pa
    public final MBA getCoroutineContext() {
        return this.LJLIL.LJLIL;
    }

    public final void LIZ(long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PopCardShowTask changeShowTime to ");
        LIZ.append(j);
        C36746EbW.LIZ(4, X1D.LIZIZ(LIZ));
        this.LJLJJI = j;
        XKQ xkq = this.LJLJI;
        if (xkq != null && xkq.isActive()) {
            xkq.LIZIZ(null);
            this.LJLJI = XKX.LIZLLL(this, null, null, new C68002lg(j, this, null), 3);
        }
    }

    public final void LIZIZ(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PopCardShowTask startDismiss , popCardState = ");
        C15890jp.LIZIZ(LIZ, this.LJLJJLL, " , popcardType = ", 1, ", endType = ");
        LIZ.append(i);
        C36746EbW.LIZ(4, X1D.LIZIZ(LIZ));
        if (1 != this.LJLJJLL) {
            C36746EbW.LIZ(6, "not showing");
            return;
        }
        InterfaceC74132vZ interfaceC74132vZ = this.LJLILLLLZI;
        if (interfaceC74132vZ != null) {
            interfaceC74132vZ.LIZ(SystemClock.uptimeMillis() - this.LJLJJL);
        }
    }
}
