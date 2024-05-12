package X;

import java.util.List;

/* renamed from: X.Orc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63224Orc implements InterfaceC63353Oth<List<C109544Rq>> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ C107074Id LJLILLLLZI;
    public final /* synthetic */ C63220OrY LJLJI;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if (r7 != null) goto L10;
     */
    @Override // X.InterfaceC63353Oth
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.util.List<X.C109544Rq> r7) {
        /*
            r6 = this;
            java.util.List r7 = (java.util.List) r7
            X.OrY r4 = r6.LJLJI
            int r5 = r6.LJLIL
            X.4Id r3 = r6.LJLILLLLZI
            r4.getClass()
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "MessageModel onPerformGetMessage, result:"
            r1.append(r0)
            if (r7 == 0) goto L76
            int r0 = r7.size()
        L1b:
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C63322OtC.LJFF(r0)
            boolean r0 = r4.LJLLI
            if (r0 == 0) goto L73
            if (r7 == 0) goto L7f
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L5a
        L31:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L7f
            X.4gp r0 = r4.LJLILLLLZI
            r0.addList(r7)
            boolean r0 = r4.LJLJJL
            if (r0 == 0) goto L78
            java.util.List r0 = r4.LIZIZ()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r1 = r0.iterator()
        L4a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L7f
            java.lang.Object r0 = r1.next()
            X.Ore r0 = (X.InterfaceC63226Ore) r0
            r0.x6(r7, r5, r3)
            goto L4a
        L5a:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r7)
            Y.IDcS134S0200000_10 r2 = new Y.IDcS134S0200000_10
            r0 = 2
            r2.<init>(r4, r1, r0)
            Y.IDbS399S0100000_10 r1 = new Y.IDbS399S0100000_10
            r0 = 2
            r1.<init>(r4, r0)
            java.util.concurrent.Executor r0 = X.C63346Ota.LIZ()
            X.RunnableC63345OtZ.LIZLLL(r2, r1, r0)
            goto L31
        L73:
            if (r7 == 0) goto L7f
            goto L31
        L76:
            r0 = 0
            goto L1b
        L78:
            X.Ore r0 = r4.LJLJJI
            if (r0 == 0) goto L7f
            r0.x6(r7, r5, r3)
        L7f:
            X.Org r1 = r4.LJZI
            java.util.List r0 = r4.LIZJ()
            r1.getClass()
            r1.LIZLLL = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63224Orc.LIZLLL(java.lang.Object):void");
    }

    public C63224Orc(C63220OrY c63220OrY, int i, C107074Id c107074Id) {
        this.LJLJI = c63220OrY;
        this.LJLIL = i;
        this.LJLILLLLZI = c107074Id;
    }
}
