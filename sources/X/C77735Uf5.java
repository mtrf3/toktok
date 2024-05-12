package X;

import android.os.SystemClock;
import java.util.HashMap;

/* renamed from: X.Uf5, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77735Uf5<T> implements InterfaceC64592gB {
    public final /* synthetic */ HashMap<String, Object> LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ InterfaceC77737Uf7 LJLJJI;
    public final /* synthetic */ C76732zl LJLJJL;

    public C77735Uf5(HashMap hashMap, long j, String str, InterfaceC77737Uf7 interfaceC77737Uf7, C76732zl c76732zl) {
        this.LJLIL = hashMap;
        this.LJLILLLLZI = j;
        this.LJLJI = str;
        this.LJLJJI = interfaceC77737Uf7;
        this.LJLJJL = c76732zl;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        Exception exc;
        Throwable th = (Throwable) obj;
        C78609UtB.LJJJLL(41, -1, "ttlive_check_subscription", "check order fail", this.LJLIL);
        C77624UdI.LJI(SystemClock.uptimeMillis() - this.LJLILLLLZI, "", true, this.LJLJI, th.toString());
        C77731Uf1 c77731Uf1 = C77731Uf1.LIZ;
        InterfaceC77737Uf7 interfaceC77737Uf7 = this.LJLJJI;
        if (!(th instanceof Exception) || (exc = (Exception) th) == null) {
            exc = new Exception(th);
        }
        C77731Uf1.LJIIJJI(c77731Uf1, interfaceC77737Uf7, 6, 41, -1, "ttlive_check_subscription", exc, null, null, this.LJLJJL.element, 192);
    }
}
