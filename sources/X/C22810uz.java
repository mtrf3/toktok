package X;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;

/* renamed from: X.0uz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22810uz {
    public final String LIZ;
    public final C22820v0 LIZIZ;
    public final InterfaceC22840v2 LIZJ;
    public final int LIZLLL;
    public final C35201Zs LJ;
    public final AtomicInteger LJFF;

    public C22810uz(String businessName, C22820v0 inputData, InterfaceC22840v2 callback, int i, C35201Zs config) {
        o.LJIIIZ(businessName, "businessName");
        o.LJIIIZ(inputData, "inputData");
        o.LJIIIZ(callback, "callback");
        o.LJIIIZ(config, "config");
        this.LIZ = businessName;
        this.LIZIZ = inputData;
        this.LIZJ = callback;
        this.LIZLLL = i;
        this.LJ = config;
        this.LJFF = new AtomicInteger(0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C22810uz(java.lang.String r15, X.C22820v0 r16, X.InterfaceC22840v2 r17, X.C35201Zs r18, int r19) {
        /*
            r14 = this;
            r1 = r18
            r0 = r19 & 8
            if (r0 == 0) goto L24
            r12 = 1
        L7:
            r0 = r19 & 16
            if (r0 == 0) goto L19
            X.1Zs r1 = new X.1Zs
            r2 = 0
            r5 = 0
            r11 = 63
            r3 = r2
            r4 = r2
            r7 = r5
            r9 = r5
            r1.<init>(r2, r3, r4, r5, r7, r9, r11)
        L19:
            r9 = r15
            r8 = r14
            r10 = r16
            r11 = r17
            r13 = r1
            r8.<init>(r9, r10, r11, r12, r13)
            return
        L24:
            r12 = 0
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22810uz.<init>(java.lang.String, X.0v0, X.0v2, X.1Zs, int):void");
    }
}
