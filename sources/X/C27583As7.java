package X;

import android.os.SystemClock;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.As7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27583As7 {
    public long LIZIZ;
    public Integer LIZLLL;
    public List<String> LJ;
    public boolean LJFF;
    public C2047581v LJI;
    public long LJII;
    public boolean LJIIIIZZ;
    public String LJIIIZ;
    public int LJIIJ;
    public final long LIZ = SystemClock.uptimeMillis();
    public String LIZJ = "";

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if (r2 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ() {
        /*
            r7 = this;
            int r1 = r7.LJIIJ
            r0 = 3
            if (r1 < r0) goto Lae
            X.As9 r4 = new X.As9
            r4.<init>()
            java.lang.String r2 = r7.LIZJ
            java.lang.String r1 = "scene"
            kotlin.jvm.internal.o.LJIIIZ(r2, r1)
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r0 = r4.LIZIZ
            r0.put(r1, r2)
            java.lang.Integer r2 = r7.LIZLLL
            if (r2 == 0) goto L24
            r2.intValue()
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r1 = r4.LIZIZ
            java.lang.String r0 = "index"
            r1.put(r0, r2)
        L24:
            boolean r0 = r7.LJFF
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r2 = r4.LIZIZ
            r6 = 0
            if (r0 == 0) goto Lc6
            r0 = 2
        L2c:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "from_cache"
            r2.put(r0, r1)
            java.util.List<java.lang.String> r0 = r7.LJ
            r5 = 1
            if (r0 == 0) goto L53
            java.util.Iterator r1 = r0.iterator()
        L3e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L53
            java.lang.Object r2 = r1.next()
            r0 = r2
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L3e
            if (r2 != 0) goto L55
        L53:
            java.lang.String r2 = ""
        L55:
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r1 = r4.LIZIZ
            java.lang.String r0 = "url"
            r1.put(r0, r2)
            X.81v r0 = r7.LJI
            r3 = -1
            if (r0 == 0) goto Lc4
            int r0 = r0.LIZ
        L63:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r1 = r4.LIZIZ
            java.lang.String r0 = "width"
            r1.put(r0, r2)
            X.81v r0 = r7.LJI
            if (r0 == 0) goto L74
            int r3 = r0.LIZIZ
        L74:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r1 = r4.LIZIZ
            java.lang.String r0 = "height"
            r1.put(r0, r2)
            long r2 = r7.LIZIZ
            long r0 = r7.LIZ
            long r2 = r2 - r0
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r1 = r4.LIZIZ
            java.lang.String r0 = "duration"
            r1.put(r0, r2)
            long r0 = r7.LJII
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r1 = r4.LIZIZ
            java.lang.String r0 = "size"
            r1.put(r0, r2)
            boolean r0 = r7.LJIIIIZZ
            java.lang.String r3 = "success"
            if (r0 == 0) goto Laf
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r1 = r4.LIZIZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r1.put(r3, r0)
        Lab:
            r4.LIZIZ()
        Lae:
            return
        Laf:
            java.lang.String r2 = r7.LJIIIZ
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r1 = r4.LIZIZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r1.put(r3, r0)
            if (r2 == 0) goto Lab
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r1 = r4.LIZIZ
            java.lang.String r0 = "err_msg"
            r1.put(r0, r2)
            goto Lab
        Lc4:
            r0 = -1
            goto L63
        Lc6:
            r0 = 0
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27583As7.LJ():void");
    }

    public final void LIZ(int i) {
        this.LIZLLL = Integer.valueOf(i);
    }

    public final void LIZIZ(C62562cu c62562cu) {
        List<String> list;
        if (c62562cu != null) {
            list = c62562cu.LIZ;
        } else {
            list = null;
        }
        this.LJ = list;
        XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C27582As6(this, null), 2);
    }

    public final void LIZJ(C2047581v c2047581v) {
        this.LIZIZ = SystemClock.uptimeMillis();
        this.LJI = c2047581v;
        this.LJIIIIZZ = true;
        this.LJIIJ++;
        XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C27579As3(this, null), 2);
    }

    public final void LIZLLL(Throwable th) {
        String message;
        this.LIZIZ = SystemClock.uptimeMillis();
        this.LJIIIIZZ = false;
        if (th != null && (message = th.getMessage()) != null) {
            String substring = message.substring(0, Math.min(128, message.length()));
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            this.LJIIIZ = substring;
        }
        this.LJIIJ += 2;
        LJ();
    }
}
