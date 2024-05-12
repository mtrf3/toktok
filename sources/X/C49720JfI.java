package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.JfI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49720JfI implements IE6 {
    public final C49841JhF LJLIL;
    public final long LJLILLLLZI = System.currentTimeMillis();
    public final HashMap<String, C49757Jft> LJLJI = new HashMap<>();

    public C49720JfI(C49841JhF c49841JhF) {
        this.LJLIL = c49841JhF;
    }

    @Override // X.IE6
    public final void LJIIIIZZ(long j, String str) {
        if (str == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (j > 0) {
            HashMap<String, C49757Jft> hashMap = this.LJLJI;
            C49757Jft c49757Jft = hashMap.get(str);
            if (c49757Jft == null) {
                c49757Jft = new C49757Jft();
                hashMap.put(str, c49757Jft);
            }
            c49757Jft.LIZ = Long.valueOf(currentTimeMillis);
            return;
        }
        if (o.LJ(str, this.LJLIL.LJLILLLLZI) && !this.LJLJI.containsKey(str)) {
            HashMap<String, C49757Jft> hashMap2 = this.LJLJI;
            C49757Jft c49757Jft2 = hashMap2.get(str);
            if (c49757Jft2 == null) {
                c49757Jft2 = new C49757Jft();
                hashMap2.put(str, c49757Jft2);
            }
            C49757Jft c49757Jft3 = c49757Jft2;
            c49757Jft3.LIZ = Long.valueOf(this.LJLILLLLZI);
            c49757Jft3.LIZIZ = Long.valueOf(currentTimeMillis);
            return;
        }
        C49757Jft c49757Jft4 = this.LJLJI.get(str);
        if (c49757Jft4 == null) {
            return;
        }
        c49757Jft4.LIZIZ = Long.valueOf(currentTimeMillis);
    }
}
