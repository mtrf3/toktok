package X;

import android.content.Intent;
import defpackage.b1;
import kotlin.jvm.internal.o;

/* renamed from: X.Qu8, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68476Qu8 extends F9E {
    public static final C68472Qu4 LJLLILLLL = new C68472Qu4();
    public final String LJLIL;
    public final long LJLILLLLZI;
    public final int LJLJI;
    public final long LJLJJI;
    public final int LJLJJL;
    public long LJLJJLL;
    public long LJLJL;
    public final long LJLJLJ;
    public final boolean LJLJLLL;
    public boolean LJLL;
    public final String LJLLI;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C68476Qu8() {
        /*
            r11 = this;
            r1 = 0
            r2 = 0
            r3 = 0
            r10 = 2047(0x7ff, float:2.868E-42)
            r0 = r11
            r5 = r2
            r6 = r3
            r8 = r3
            r0.<init>(r1, r2, r3, r5, r6, r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68476Qu8.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Long.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), Long.valueOf(this.LJLJJI), Integer.valueOf(this.LJLJJL), Long.valueOf(this.LJLJJLL), Long.valueOf(this.LJLJL), Long.valueOf(this.LJLJLJ), Boolean.valueOf(this.LJLJLLL), Boolean.valueOf(this.LJLL), this.LJLLI};
    }

    public final void L(String str) {
        new Intent();
        StringBuilder LIZJ = b1.LIZJ(str, " Task(");
        LIZJ.append(this.LJLIL);
        LIZJ.append("): ");
        LIZJ.append(C67257QaT.LIZLLL(this.LJLJL));
        String message = X1D.LIZIZ(LIZJ);
        o.LJIIIZ(message, "message");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C68476Qu8(java.lang.String r19, int r20, long r21, int r23, long r24, long r26, int r28) {
        /*
            r18 = this;
            r2 = r19
            r5 = r20
            r6 = r21
            r8 = r23
            r9 = r24
            r1 = r28
            r11 = r26
            r0 = r1 & 1
            if (r0 == 0) goto L14
            java.lang.String r2 = "0"
        L14:
            r3 = 0
            r0 = r1 & 4
            if (r0 == 0) goto L1b
            r5 = 2
        L1b:
            r0 = r1 & 8
            if (r0 == 0) goto L21
            r6 = 0
        L21:
            r0 = r1 & 16
            if (r0 == 0) goto L26
            r8 = 2
        L26:
            r0 = r1 & 32
            if (r0 == 0) goto L2c
            r9 = 0
        L2c:
            r0 = r1 & 64
            if (r0 == 0) goto L32
            r11 = 0
        L32:
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L42
            java.lang.String r17 = ""
        L38:
            r15 = 0
            r1 = r18
            r13 = r3
            r16 = r15
            r1.<init>(r2, r3, r5, r6, r8, r9, r11, r13, r15, r16, r17)
            return
        L42:
            r17 = 0
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68476Qu8.<init>(java.lang.String, int, long, int, long, long, int):void");
    }

    public C68476Qu8(String id, long j, int i, long j2, int i2, long j3, long j4, long j5, boolean z, boolean z2, String extra) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(extra, "extra");
        this.LJLIL = id;
        this.LJLILLLLZI = j;
        this.LJLJI = i;
        this.LJLJJI = j2;
        this.LJLJJL = i2;
        this.LJLJJLL = j3;
        this.LJLJL = j4;
        this.LJLJLJ = j5;
        this.LJLJLLL = z;
        this.LJLL = z2;
        this.LJLLI = extra;
    }
}
