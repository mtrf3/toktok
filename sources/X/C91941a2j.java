package X;

import kotlin.jvm.internal.o;

/* renamed from: X.a2j, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91941a2j {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public C91941a2j() {
        this(null, false, 15);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C91941a2j(java.lang.String r5, boolean r6, int r7) {
        /*
            r4 = this;
            r0 = r7 & 1
            r3 = 0
            if (r0 == 0) goto L6
            r6 = 0
        L6:
            r0 = r7 & 4
            java.lang.String r2 = ""
            if (r0 == 0) goto L16
            r1 = r2
        Ld:
            r0 = r7 & 8
            if (r0 == 0) goto L12
            r5 = r2
        L12:
            r4.<init>(r6, r3, r1, r5)
            return
        L16:
            r1 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91941a2j.<init>(java.lang.String, boolean, int):void");
    }

    public C91941a2j(boolean z, boolean z2, String key, String errorMessage) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(errorMessage, "errorMessage");
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = key;
        this.LIZLLL = errorMessage;
    }
}
