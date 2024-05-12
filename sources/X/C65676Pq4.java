package X;

/* JADX INFO: Add missing generic type declarations: [K] */
/* renamed from: X.Pq4, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65676Pq4<K> extends AbstractC65674Pq2<K> {
    public final K LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C65656Ppk LJLJI;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (X.C78886Uxe.LJIIIIZZ(r5.LJLIL, r2.LIZ[r4]) != false) goto L9;
     */
    @Override // X.InterfaceC65712Pqe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getCount() {
        /*
            r5 = this;
            int r4 = r5.LJLILLLLZI
            r3 = -1
            if (r4 == r3) goto L17
            X.Ppk r2 = r5.LJLJI
            int r0 = r2.LIZJ
            if (r4 >= r0) goto L17
            K r1 = r5.LJLIL
            java.lang.Object[] r0 = r2.LIZ
            r0 = r0[r4]
            boolean r0 = X.C78886Uxe.LJIIIIZZ(r1, r0)
            if (r0 != 0) goto L21
        L17:
            X.Ppk r1 = r5.LJLJI
            K r0 = r5.LJLIL
            int r0 = r1.LIZIZ(r0)
            r5.LJLILLLLZI = r0
        L21:
            int r1 = r5.LJLILLLLZI
            if (r1 != r3) goto L27
            r0 = 0
        L26:
            return r0
        L27:
            X.Ppk r0 = r5.LJLJI
            int[] r0 = r0.LIZIZ
            r0 = r0[r1]
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65676Pq4.getCount():int");
    }

    @Override // X.InterfaceC65712Pqe
    public final K LIZLLL() {
        return this.LJLIL;
    }

    public C65676Pq4(C65656Ppk c65656Ppk, int i) {
        this.LJLJI = c65656Ppk;
        this.LJLIL = (K) c65656Ppk.LIZ[i];
        this.LJLILLLLZI = i;
    }
}
