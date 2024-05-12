package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.EKf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36241EKf extends Throwable {
    public final int LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;

    public final String getCustomMsg() {
        return this.LJLJI;
    }

    public final int getErrorCode() {
        return this.LJLIL;
    }

    public final String getErrorMsg() {
        return this.LJLILLLLZI;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C36241EKf(int r3, java.lang.String r4, java.lang.String r5) {
        /*
            r2 = this;
            java.lang.String r0 = "errorMsg"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = "customMsg"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "errorCode="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", msg="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", customMsg="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.<init>(r0)
            r2.LJLIL = r3
            r2.LJLILLLLZI = r4
            r2.LJLJI = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36241EKf.<init>(int, java.lang.String, java.lang.String):void");
    }

    public /* synthetic */ C36241EKf(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? "" : str2);
    }
}
