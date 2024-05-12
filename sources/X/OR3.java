package X;

import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OR3 extends OR5 {
    public boolean LIZIZ;
    public File[] LIZJ;
    public int LIZLLL;
    public final /* synthetic */ OR0 LJ;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
    
        if (r0.length == 0) goto L26;
     */
    @Override // X.OR6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.File LIZ() {
        /*
            r8 = this;
            boolean r0 = r8.LIZIZ
            r4 = 0
            if (r0 != 0) goto L22
            X.OR0 r0 = r8.LJ
            X.OR4 r0 = r0.LJLJJI
            X.Yns<java.io.File, java.lang.Boolean> r2 = r0.LIZJ
            r1 = 1
            if (r2 == 0) goto L1d
            java.io.File r0 = r8.LIZ
            java.lang.Object r0 = r2.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L1d
            return r4
        L1d:
            r8.LIZIZ = r1
            java.io.File r0 = r8.LIZ
            return r0
        L22:
            java.io.File[] r0 = r8.LIZJ
            if (r0 == 0) goto L2e
            int r1 = r8.LIZLLL
            kotlin.jvm.internal.o.LJI(r0)
            int r0 = r0.length
            if (r1 >= r0) goto L7a
        L2e:
            java.io.File[] r0 = r8.LIZJ
            if (r0 != 0) goto L6c
            java.io.File r0 = r8.LIZ
            java.io.File[] r0 = r0.listFiles()
            r8.LIZJ = r0
            if (r0 != 0) goto L54
            X.OR0 r0 = r8.LJ
            X.OR4 r0 = r0.LJLJJI
            X.Ynr<java.io.File, java.io.IOException, X.UCe> r1 = r0.LJ
            if (r1 == 0) goto L54
            java.io.File r0 = r8.LIZ
            X.IvS r2 = new X.IvS
            java.io.File r3 = r8.LIZ
            java.lang.String r5 = "Cannot list files in a directory"
            r6 = 2
            r7 = r4
            r2.<init>(r3, r4, r5, r6, r7)
            r1.invoke(r0, r2)
        L54:
            java.io.File[] r0 = r8.LIZJ
            if (r0 == 0) goto L5e
            kotlin.jvm.internal.o.LJI(r0)
            int r0 = r0.length
            if (r0 != 0) goto L6c
        L5e:
            X.OR0 r0 = r8.LJ
            X.OR4 r0 = r0.LJLJJI
            X.Yns<java.io.File, X.UCe> r1 = r0.LIZLLL
            if (r1 == 0) goto L6b
            java.io.File r0 = r8.LIZ
            r1.invoke(r0)
        L6b:
            return r4
        L6c:
            java.io.File[] r2 = r8.LIZJ
            kotlin.jvm.internal.o.LJI(r2)
            int r1 = r8.LIZLLL
            int r0 = r1 + 1
            r8.LIZLLL = r0
            r0 = r2[r1]
            return r0
        L7a:
            X.OR0 r0 = r8.LJ
            X.OR4 r0 = r0.LJLJJI
            X.Yns<java.io.File, X.UCe> r1 = r0.LIZLLL
            if (r1 == 0) goto L87
            java.io.File r0 = r8.LIZ
            r1.invoke(r0)
        L87:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OR3.LIZ():java.io.File");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OR3(OR0 or0, File rootDir) {
        super(rootDir);
        o.LJIIIZ(rootDir, "rootDir");
        this.LJ = or0;
    }
}
