package X;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: X.Zhz, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90655Zhz implements InterfaceC67808QjM {
    public final CastDevice LJLIL;
    public final C90218Zaw LJLILLLLZI;
    public final Bundle LJLJI;
    public final String LJLJJI = UUID.randomUUID().toString();

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.LJLIL, this.LJLJI, 0, this.LJLJJI});
    }

    public /* synthetic */ C90655Zhz(C90217Zav c90217Zav) {
        this.LJLIL = c90217Zav.LIZ;
        this.LJLILLLLZI = c90217Zav.LIZIZ;
        this.LJLJI = c90217Zav.LIZJ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        if (r4 == r3) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r6 = 1
            if (r8 != r7) goto L4
            return r6
        L4:
            boolean r0 = r8 instanceof X.C90655Zhz
            r5 = 0
            if (r0 != 0) goto La
            return r5
        La:
            X.Zhz r8 = (X.C90655Zhz) r8
            com.google.android.gms.cast.CastDevice r1 = r7.LJLIL
            com.google.android.gms.cast.CastDevice r0 = r8.LJLIL
            boolean r0 = X.C64363PNv.LIZ(r1, r0)
            if (r0 == 0) goto L1e
            android.os.Bundle r4 = r7.LJLJI
            android.os.Bundle r3 = r8.LJLJI
            if (r4 == 0) goto L57
            if (r3 != 0) goto L1f
        L1e:
            return r5
        L1f:
            int r1 = r4.size()
            int r0 = r3.size()
            if (r1 == r0) goto L2a
            goto L1e
        L2a:
            java.util.Set r1 = r4.keySet()
            java.util.Set r0 = r3.keySet()
            boolean r0 = r1.containsAll(r0)
            if (r0 == 0) goto L1e
            java.util.Iterator r2 = r1.iterator()
        L3c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L59
            java.lang.Object r0 = r2.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = X.C16880lQ.LLJJIII(r4, r0)
            java.lang.Object r0 = X.C16880lQ.LLJJIII(r3, r0)
            boolean r0 = X.C64363PNv.LIZ(r1, r0)
            if (r0 != 0) goto L3c
            goto L1e
        L57:
            if (r4 != r3) goto L1e
        L59:
            java.lang.String r1 = r7.LJLJJI
            java.lang.String r0 = r8.LJLJJI
            boolean r0 = X.C64363PNv.LIZ(r1, r0)
            if (r0 == 0) goto L1e
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90655Zhz.equals(java.lang.Object):boolean");
    }
}
