package X;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.IvO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48170IvO extends IOException {
    public final File LJLIL;
    public final File LJLILLLLZI;
    public final String LJLJI;

    public final File getFile() {
        return this.LJLIL;
    }

    public final File getOther() {
        return this.LJLILLLLZI;
    }

    public final String getReason() {
        return this.LJLJI;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C48170IvO(java.io.File r4, java.io.File r5, java.lang.String r6) {
        /*
            r3 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = r4.toString()
            r2.<init>(r0)
            if (r5 == 0) goto L23
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = " -> "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.append(r0)
        L23:
            if (r6 == 0) goto L38
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = ": "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.append(r0)
        L38:
            java.lang.String r1 = r2.toString()
            java.lang.String r0 = "sb.toString()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r3.<init>(r1)
            r3.LJLIL = r4
            r3.LJLILLLLZI = r5
            r3.LJLJI = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48170IvO.<init>(java.io.File, java.io.File, java.lang.String):void");
    }

    public /* synthetic */ C48170IvO(File file, File file2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i & 2) != 0 ? null : file2, (i & 4) != 0 ? null : str);
    }
}
