package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class E97 extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public E97(X.InterfaceC40516FvE r3, android.net.Uri r4, java.lang.Throwable r5) {
        /*
            r2 = this;
            java.lang.String r0 = "instance"
            kotlin.jvm.internal.o.LJIIJ(r3, r0)
            java.lang.String r0 = "uri"
            kotlin.jvm.internal.o.LJIIJ(r4, r0)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = X.C16880lQ.LJLLJ(r0)
            r1.append(r0)
            java.lang.String r0 = " force rejected when processing: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.<init>(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E97.<init>(X.FvE, android.net.Uri, java.lang.Throwable):void");
    }

    public /* synthetic */ E97(InterfaceC40516FvE interfaceC40516FvE, android.net.Uri uri, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC40516FvE, uri, (i & 4) != 0 ? null : th);
    }
}
