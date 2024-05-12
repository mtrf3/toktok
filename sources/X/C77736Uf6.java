package X;

import android.os.SystemClock;

/* renamed from: X.Uf6, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77736Uf6<T> implements InterfaceC64592gB {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ InterfaceC77737Uf7 LJLJJI;

    public C77736Uf6(long j, String str, String str2, InterfaceC77737Uf7 interfaceC77737Uf7) {
        this.LJLIL = j;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = interfaceC77737Uf7;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        Exception exc;
        Throwable th = (Throwable) obj;
        C78609UtB.LJJJLIIL(41, -1, "ttlive_wallet_check_order", "check order fail");
        C77624UdI.LJI(SystemClock.uptimeMillis() - this.LJLIL, this.LJLILLLLZI, false, this.LJLJI, th.toString());
        C77731Uf1 c77731Uf1 = C77731Uf1.LIZ;
        InterfaceC77737Uf7 interfaceC77737Uf7 = this.LJLJJI;
        if (!(th instanceof Exception) || (exc = (Exception) th) == null) {
            exc = new Exception(th);
        }
        C77731Uf1.LJIIJJI(c77731Uf1, interfaceC77737Uf7, 3, 41, -1, "ttlive_wallet_check_order", exc, this.LJLILLLLZI, this.LJLJI, 0, 256);
    }
}
