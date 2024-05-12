package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Izb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48431Izb extends Error {
    public final int LJLIL;
    public final CharSequence LJLILLLLZI;
    public final CharSequence LJLJI;

    public final CharSequence getDescription() {
        return this.LJLILLLLZI;
    }

    public final int getErrorCode() {
        return this.LJLIL;
    }

    public final CharSequence getFailingUrl() {
        return this.LJLJI;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C48431Izb(int r3, java.lang.CharSequence r4, java.lang.CharSequence r5) {
        /*
            r2 = this;
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "WebLoadError, errorCode: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", desc: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", failingUrl: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.<init>(r0)
            r2.LJLIL = r3
            r2.LJLILLLLZI = r4
            r2.LJLJI = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48431Izb.<init>(int, java.lang.CharSequence, java.lang.CharSequence):void");
    }

    public /* synthetic */ C48431Izb(int i, CharSequence charSequence, CharSequence charSequence2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : charSequence, (i2 & 4) != 0 ? null : charSequence2);
    }
}
