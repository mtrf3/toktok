package X;

import kotlin.jvm.internal.o;

/* renamed from: X.GcY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41906GcY extends AbstractC41925Gcr {
    public static final /* synthetic */ int LJIIL = 0;
    public final C42361Gjt LJIIIIZZ;
    public XKQ LJIIIZ;
    public final XLM LJIIJ;
    public int LJIIJJI;

    @Override // X.AbstractC41925Gcr
    public final String LJFF() {
        return "stream_edit";
    }

    @Override // X.AbstractC41925Gcr
    public final void LIZIZ() {
        super.LIZIZ();
        XKQ xkq = this.LJIIIZ;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
    }

    public C41906GcY(C42361Gjt param) {
        o.LJIIIZ(param, "param");
        this.LJIIIIZZ = param;
        this.LJIIJ = V8H.LIZ(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @Override // X.AbstractC41925Gcr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC67352kd r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C41905GcX
            if (r0 == 0) goto L73
            r8 = r10
            X.GcX r8 = (X.C41905GcX) r8
            int r2 = r8.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L73
            int r2 = r2 - r1
            r8.LJLJJL = r2
        L12:
            java.lang.Object r5 = r8.LJLJI
            X.NAu r7 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r8.LJLJJL
            r6 = 0
            r0 = 1
            if (r1 == 0) goto L39
            if (r1 != r0) goto L89
            long r3 = r8.LJLILLLLZI
            X.GcY r2 = r8.LJLIL
            X.C141335gf.LIZJ(r5)
        L25:
            java.util.List r5 = (java.util.List) r5
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r3
            int r0 = r2.LJIIJJI
            long r0 = (long) r0
            X.AbstractC41925Gcr.LJI(r7, r0)
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L79
            return r6
        L39:
            X.C141335gf.LIZJ(r5)
            long r3 = java.lang.System.currentTimeMillis()
            r8.LJLIL = r9
            r8.LJLILLLLZI = r3
            r8.LJLJJL = r0
            X.XKg r5 = new X.XKg
            X.2kd r0 = X.C78555UsJ.LJJII(r8)
            r5.<init>(r0)
            X.XKQ r0 = r9.LJIIIZ
            if (r0 == 0) goto L56
            r0.LIZIZ(r6)
        L56:
            X.MBA r0 = r5.getContext()
            X.2gm r2 = X.C48841JEv.LIZ(r0)
            X.GcU r1 = new X.GcU
            r1.<init>(r9, r5, r6)
            r0 = 3
            X.XKQ r0 = X.XKX.LIZLLL(r2, r6, r6, r1, r0)
            r9.LJIIIZ = r0
            java.lang.Object r5 = r5.LIZ()
            if (r5 != r7) goto L71
            return r7
        L71:
            r2 = r9
            goto L25
        L73:
            X.GcX r8 = new X.GcX
            r8.<init>(r9, r10)
            goto L12
        L79:
            boolean r0 = X.C1B8.LIZJ()
            if (r0 != 0) goto L80
            return r6
        L80:
            java.lang.String r0 = r2.LIZLLL()
            java.lang.String r0 = X.AbstractC41925Gcr.LJIIIIZZ(r0, r5)
            return r0
        L89:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41906GcY.LIZ(X.2kd):java.lang.Object");
    }
}
