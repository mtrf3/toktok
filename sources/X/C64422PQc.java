package X;

import Y.ARunnableS8S0201000_5;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.PQc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64422PQc implements PQL, PH7, PH6 {
    public final String LJLIL;
    public final PH4 LJLILLLLZI;
    public final AtomicBoolean LJLJI;
    public final Deque<C64423PQd> LJLJJI;

    public final void LIZIZ() {
        C64424PQe c64424PQe;
        synchronized (this.LJLJJI) {
            C64423PQd peekFirst = this.LJLJJI.peekFirst();
            if (peekFirst != null && (c64424PQe = peekFirst.LJFF()) != null) {
                this.LJLJJI.poll();
            } else {
                c64424PQe = null;
            }
        }
        if (c64424PQe == null) {
            return;
        }
        PQB.LIZJ.execute(new ARunnableS8S0201000_5(1, c64424PQe.LJFF, new PQZ(this.LJLIL, c64424PQe.LIZ, c64424PQe.LIZIZ, c64424PQe.LIZJ, c64424PQe.LIZLLL, c64424PQe.LJ), 5));
    }

    @Override // X.PQL
    public final boolean start() {
        if (!this.LJLJI.compareAndSet(false, true)) {
            return false;
        }
        synchronized (this.LJLJJI) {
            C64423PQd c64423PQd = new C64423PQd();
            c64423PQd.LJ(System.currentTimeMillis());
            ((LinkedList) this.LJLJJI).offerLast(c64423PQd);
        }
        this.LJLILLLLZI.LIZLLL();
        return true;
    }

    @Override // X.PQL
    public final boolean stop() {
        if (!this.LJLJI.compareAndSet(true, false)) {
            return false;
        }
        synchronized (this.LJLJJI) {
            C64423PQd c64423PQd = (C64423PQd) ((LinkedList) this.LJLJJI).peekLast();
            if (c64423PQd != null) {
                c64423PQd.LIZJ(System.currentTimeMillis());
            }
        }
        this.LJLILLLLZI.LJ();
        return true;
    }

    public C64422PQc(String scene) {
        o.LJIIIZ(scene, "scene");
        this.LJLIL = scene;
        PH4 ph4 = new PH4(scene, true);
        this.LJLILLLLZI = ph4;
        this.LJLJI = new AtomicBoolean(false);
        this.LJLJJI = new LinkedList();
        ph4.LIZJ(this);
        PH3 ph3 = ph4.LJ;
        if (ph3 != null) {
            ph3.LJ = this;
        }
        ph4.LIZLLL = this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.PQd] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    @Override // X.PH6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(org.json.JSONObject r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L41
            java.util.Iterator r1 = r5.keys()
            java.lang.String r0 = "keys()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            X.45z r2 = X.OJ6.LJJIJLIJ(r1)
            kotlin.jvm.internal.AqS142S0200000_11 r1 = new kotlin.jvm.internal.AqS142S0200000_11
            r0 = 2
            r1.<init>(r5, r5, r0)
            X.4Vp r0 = X.OJ4.LJJJJLL(r2, r1)
            java.util.List r0 = X.OJ4.LJJLIIIJ(r0)
            java.util.List r0 = X.C47261Igj.LJJIJLIJ(r0)
            if (r0 == 0) goto L41
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L2c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L43
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.PQb r0 = (X.C64421PQb) r0
            int r0 = r0.LJLILLLLZI
            if (r0 <= 0) goto L2c
            r3.add(r1)
            goto L2c
        L41:
            X.OQg r3 = X.C61878OQg.INSTANCE
        L43:
            java.util.Deque<X.PQd> r1 = r4.LJLJJI
            monitor-enter(r1)
            java.util.Deque<X.PQd> r0 = r4.LJLJJI     // Catch: java.lang.Throwable -> L64
            java.util.LinkedList r0 = (java.util.LinkedList) r0     // Catch: java.lang.Throwable -> L64
            java.lang.Object r0 = r0.peekFirst()     // Catch: java.lang.Throwable -> L64
            X.PQd r0 = (X.C64423PQd) r0     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L5f
            boolean r0 = r0.LIZIZ(r3)     // Catch: java.lang.Throwable -> L64
            if (r0 != 0) goto L5f
            java.util.Deque<X.PQd> r0 = r4.LJLJJI     // Catch: java.lang.Throwable -> L64
            java.util.LinkedList r0 = (java.util.LinkedList) r0     // Catch: java.lang.Throwable -> L64
            r0.pollFirst()     // Catch: java.lang.Throwable -> L64
        L5f:
            monitor-exit(r1)
            r4.LIZIZ()
            return
        L64:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64422PQc.LIZJ(org.json.JSONObject):void");
    }

    @Override // X.PH7
    public final void LIZLLL(double d) {
        synchronized (this.LJLJJI) {
            C64423PQd peekFirst = this.LJLJJI.peekFirst();
            if (peekFirst != null && !peekFirst.LIZLLL(d)) {
                this.LJLJJI.pollFirst();
            }
        }
        LIZIZ();
    }

    @Override // X.PQL
    public final void LIZ(String str, String value) {
        o.LJIIIZ(value, "value");
        synchronized (this.LJLJJI) {
            C64423PQd c64423PQd = (C64423PQd) ((LinkedList) this.LJLJJI).peekLast();
            if (c64423PQd != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(str, value);
                c64423PQd.LIZ(linkedHashMap);
            }
        }
    }
}
