package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XHM {
    public final XHX LIZ;
    public volatile boolean LIZIZ;
    public XKS LIZLLL;
    public final LinkedBlockingQueue<XHN> LIZJ = new LinkedBlockingQueue<>();
    public final C62822Ol8 LJ = C221108m2.LIZIZ(XHT.LJLIL);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof XHM) && o.LJ(this.LIZ, ((XHM) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PendingQueue(category=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public XHM(XHX xhx) {
        this.LIZ = xhx;
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZ), null, null, new XHL(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050 A[Catch: all -> 0x00c5, TryCatch #0 {all -> 0x00c5, blocks: (B:11:0x0047, B:13:0x0050, B:17:0x0053, B:19:0x0077, B:21:0x008e, B:23:0x0092, B:24:0x0095, B:25:0x0099, B:27:0x009f, B:29:0x00a7, B:31:0x00a9, B:32:0x00bc), top: B:10:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053 A[Catch: all -> 0x00c5, TryCatch #0 {all -> 0x00c5, blocks: (B:11:0x0047, B:13:0x0050, B:17:0x0053, B:19:0x0077, B:21:0x008e, B:23:0x0092, B:24:0x0095, B:25:0x0099, B:27:0x009f, B:29:0x00a7, B:31:0x00a9, B:32:0x00bc), top: B:10:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC67352kd<? super X.C76800UCe> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.XHO
            if (r0 == 0) goto L26
            r3 = r8
            X.XHO r3 = (X.XHO) r3
            int r2 = r3.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r3.LJLJJL = r2
        L12:
            java.lang.Object r6 = r3.LJLJI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r3.LJLJJL
            r0 = 1
            r5 = 0
            if (r1 == 0) goto L34
            if (r1 != r0) goto L2c
            X.XJO r4 = r3.LJLILLLLZI
            X.XHM r3 = r3.LJLIL
            X.C141335gf.LIZJ(r6)
            goto L47
        L26:
            X.XHO r3 = new X.XHO
            r3.<init>(r7, r8)
            goto L12
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C141335gf.LIZJ(r6)
            X.XJO r4 = X.XH5.LIZLLL
            r3.LJLIL = r7
            r3.LJLILLLLZI = r4
            r3.LJLJJL = r0
            java.lang.Object r0 = r4.LIZ(r5, r3)
            if (r0 != r2) goto L46
            return r2
        L46:
            r3 = r7
        L47:
            java.util.concurrent.LinkedBlockingQueue<X.XHN> r0 = r3.LIZJ     // Catch: java.lang.Throwable -> Lc5
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> Lc5
            r0 = 0
            if (r1 == 0) goto L53
            r3.LIZIZ = r0     // Catch: java.lang.Throwable -> Lc5
            goto Lbf
        L53:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc5
            r2.<init>()     // Catch: java.lang.Throwable -> Lc5
            java.util.concurrent.LinkedBlockingQueue<X.XHN> r0 = r3.LIZJ     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object r6 = r0.poll()     // Catch: java.lang.Throwable -> Lc5
            X.XHN r6 = (X.XHN) r6     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r0 = "item"
            kotlin.jvm.internal.o.LJIIIIZZ(r6, r0)     // Catch: java.lang.Throwable -> Lc5
            r2.add(r6)     // Catch: java.lang.Throwable -> Lc5
            X.XHX r0 = r3.LIZ     // Catch: java.lang.Throwable -> Lc5
            X.XHb r1 = r0.LIZIZ()     // Catch: java.lang.Throwable -> Lc5
            X.XHd r0 = X.C84573XHd.LIZIZ     // Catch: java.lang.Throwable -> Lc5
            int r1 = r1.LIZ     // Catch: java.lang.Throwable -> Lc5
            int r0 = r0.LIZ     // Catch: java.lang.Throwable -> Lc5
            r1 = r1 & r0
            if (r1 == 0) goto L95
            java.util.concurrent.LinkedBlockingQueue<X.XHN> r0 = r3.LIZJ     // Catch: java.lang.Throwable -> Lc5
            java.util.List r1 = X.ORZ.LLJI(r0)     // Catch: java.lang.Throwable -> Lc5
            r2.addAll(r1)     // Catch: java.lang.Throwable -> Lc5
            java.util.concurrent.LinkedBlockingQueue<X.XHN> r0 = r3.LIZJ     // Catch: java.lang.Throwable -> Lc5
            r0.clear()     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object r6 = X.ORZ.LLFII(r2)     // Catch: java.lang.Throwable -> Lc5
            r0 = r6
            X.XHN r0 = (X.XHN) r0     // Catch: java.lang.Throwable -> Lc5
            if (r0 == 0) goto L95
            java.util.List<X.XHN> r0 = r0.LJ     // Catch: java.lang.Throwable -> Lc5
            if (r0 == 0) goto L95
            r0.addAll(r1)     // Catch: java.lang.Throwable -> Lc5
        L95:
            java.util.Iterator r3 = r2.iterator()     // Catch: java.lang.Throwable -> Lc5
        L99:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> Lc5
            if (r0 == 0) goto Lbf
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> Lc5
            X.XHN r2 = (X.XHN) r2     // Catch: java.lang.Throwable -> Lc5
            if (r2 != r6) goto Lbc
            X.VLM r1 = X.VLM.Running     // Catch: java.lang.Throwable -> Lc5
        La9:
            r2.getClass()     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)     // Catch: java.lang.Throwable -> Lc5
            r2.LIZLLL = r1     // Catch: java.lang.Throwable -> Lc5
            X.XJL<X.XHN> r0 = r2.LIZIZ     // Catch: java.lang.Throwable -> Lc5
            X.C3C5.m7constructorimpl(r2)     // Catch: java.lang.Throwable -> Lc5
            r0.resumeWith(r2)     // Catch: java.lang.Throwable -> Lc5
            goto L99
        Lbc:
            X.VLM r1 = X.VLM.Merged     // Catch: java.lang.Throwable -> Lc5
            goto La9
        Lbf:
            r4.LIZIZ(r5)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        Lc5:
            r0 = move-exception
            r4.LIZIZ(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XHM.LIZIZ(X.2kd):java.lang.Object");
    }

    public static void LIZ(XGX xgx, XHN xhn) {
        List list = xgx.LIZ;
        if (list == null) {
            list = new ArrayList();
        }
        xgx.LIZ = list;
        List<XHN> list2 = xhn.LJ;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list2, 10));
        Iterator<XHN> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().LIZ);
        }
        list.addAll(arrayList);
    }
}
