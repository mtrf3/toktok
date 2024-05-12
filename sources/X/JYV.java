package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JYV<T> {
    public final T LIZ;
    public final int LIZIZ;
    public final Exception LIZJ;
    public final long LIZLLL;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ JYV(int r8, X.C49352JYm r9, int r10) {
        /*
            r7 = this;
            r3 = r9
            r1 = 0
            r0 = r10 & 4
            if (r0 == 0) goto L7
            r3 = r1
        L7:
            r4 = 0
            r0 = r10 & 16
            if (r0 == 0) goto L15
            java.lang.String r6 = ""
        Lf:
            r2 = r8
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r6)
            return
        L15:
            r6 = r1
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JYV.<init>(int, X.JYm, int):void");
    }

    public JYV(T t, int i, Exception exc, long j, String taskGroup) {
        o.LJIIIZ(taskGroup, "taskGroup");
        this.LIZ = t;
        this.LIZIZ = i;
        this.LIZJ = exc;
        this.LIZLLL = j;
    }
}
