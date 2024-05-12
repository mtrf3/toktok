package X;

import android.util.Pair;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Ork, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63232Ork implements InterfaceC63353Oth<java.util.Map<Long, C63148OqO>> {
    public final /* synthetic */ InterfaceC86963bA LJLIL;
    public final /* synthetic */ C109544Rq LJLILLLLZI;
    public final /* synthetic */ C63220OrY LJLJI;

    @Override // X.InterfaceC63353Oth
    public final void LIZLLL(java.util.Map<Long, C63148OqO> map) {
        java.util.Map<Long, C63148OqO> map2 = map;
        if (map2 == null || map2.isEmpty()) {
            InterfaceC86963bA interfaceC86963bA = this.LJLIL;
            if (interfaceC86963bA != null) {
                interfaceC86963bA.onSuccess(new Pair(Collections.emptyList(), Collections.emptyList()));
                return;
            }
            return;
        }
        Pair<List<Long>, List<Long>> LJ = this.LJLJI.LJ(this.LJLILLLLZI, map2);
        InterfaceC86963bA interfaceC86963bA2 = this.LJLIL;
        if (interfaceC86963bA2 == null) {
            return;
        }
        interfaceC86963bA2.onSuccess(LJ);
    }

    public C63232Ork(InterfaceC86963bA interfaceC86963bA, C109544Rq c109544Rq, C63220OrY c63220OrY) {
        this.LJLJI = c63220OrY;
        this.LJLIL = interfaceC86963bA;
        this.LJLILLLLZI = c109544Rq;
    }
}
