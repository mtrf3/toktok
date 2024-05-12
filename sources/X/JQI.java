package X;

import android.content.Context;

/* loaded from: classes9.dex */
public final class JQI implements Runnable {
    public final /* synthetic */ JQJ LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ C49128JPw LJLJJI;
    public final /* synthetic */ Context LJLJJL;

    public JQI(JQJ jqj, String str, int i, C49128JPw c49128JPw, Context context) {
        this.LJLIL = jqj;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
        this.LJLJJI = c49128JPw;
        this.LJLJJL = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0074 A[EDGE_INSN: B:51:0x0074->B:26:0x0074 BREAK  A[LOOP:0: B:15:0x0030->B:48:0x0030], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r13 = this;
            X.JQJ r4 = r13.LJLIL
            java.lang.String r5 = r13.LJLILLLLZI
            int r9 = r13.LJLJI
            X.JPw r3 = r13.LJLJJI
            android.content.Context r7 = r13.LJLJJL
            androidx.recyclerview.widget.RecyclerView r11 = r4.LJLIL
            r8 = 0
            if (r11 == 0) goto Le8
            X.0A2 r1 = r11.getLayoutManager()
        L13:
            boolean r0 = r1 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L2a
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
            r0 = -1
            if (r1 == 0) goto L2a
            int r10 = r1.LLILL()
            int r6 = r1.LLILLJJLI()
            if (r10 == r0) goto L2a
            if (r6 == r0) goto L2a
            if (r6 >= r10) goto Lca
        L2a:
            X.OQg r2 = X.C61878OQg.INSTANCE
        L2c:
            java.util.Iterator r12 = r2.iterator()
        L30:
            boolean r0 = r12.hasNext()
            r6 = 0
            if (r0 == 0) goto L74
            java.lang.Object r11 = r12.next()
            r1 = r11
            X.JQX r1 = (X.JQX) r1
            X.JP7 r0 = r1.LLLLIIL()
            int r10 = r0.LLJJJ()
            X.JP7 r0 = r1.LLLLIIL()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getCurrentAweme()
            if (r0 == 0) goto Lc8
            java.lang.String r2 = r0.getAid()
        L54:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "findAndPlayVideoAt pos #"
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = ", aid "
            r1.append(r0)
            r1.append(r2)
            X.X1D.LIZIZ(r1)
            boolean r0 = kotlin.jvm.internal.o.LJ(r2, r5)
            if (r0 == 0) goto L30
            if (r10 != r9) goto L30
            r8 = r11
        L74:
            X.JQX r8 = (X.JQX) r8
            r4.LJLJI = r8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "findAndPlayVideoAt targetHolder: "
            r1.<init>(r0)
            X.JQX r0 = r4.LJLJI
            r1.append(r0)
            X.JQX r2 = r4.LJLJI
            if (r2 == 0) goto Lc7
            X.JP7 r0 = r2.LLLLIIL()
            int r1 = r0.LIZ()
            r0 = 2
            if (r1 != r0) goto Lb3
            boolean r0 = X.C50989Jzl.LJI(r7)
            if (r0 == 0) goto Lb3
            X.JP7 r1 = r2.LLLLIIL()
            if (r3 == 0) goto La7
            java.lang.Integer r0 = r3.LIZ
            if (r0 == 0) goto La7
            int r6 = r0.intValue()
        La7:
            if (r5 != 0) goto Lab
            java.lang.String r5 = ""
        Lab:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r1.LJLLILLLL(r6, r5)
            X.JGJ.LIZ(r0)
        Lb3:
            X.JU8 r0 = r4.LJLILLLLZI
            r0.LIZJ(r2)
            if (r3 == 0) goto Lc7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "scrollToInternalIndex  "
            r1.<init>(r0)
            r1.append(r3)
            r2.f(r3)
        Lc7:
            return
        Lc8:
            r2 = r8
            goto L54
        Lca:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            if (r10 > r6) goto L2c
        Ld1:
            if (r11 == 0) goto Le6
            androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = r11.LJJIZ(r10)
        Ld7:
            boolean r0 = r1 instanceof X.JQX
            if (r0 != 0) goto Le0
        Ldb:
            if (r10 == r6) goto L2c
            int r10 = r10 + 1
            goto Ld1
        Le0:
            if (r1 == 0) goto Ldb
            r2.add(r1)
            goto Ldb
        Le6:
            r1 = r8
            goto Ld7
        Le8:
            r1 = r8
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JQI.LIZ():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
