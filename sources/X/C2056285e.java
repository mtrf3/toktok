package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.85e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2056285e {
    public final CharSequence LIZ;
    public final int LIZIZ;
    public final java.util.Map<String, String> LIZJ;
    public int LIZLLL;
    public int LJ;

    public C2056285e() {
        this((CharSequence) null, 0, 7);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MarkupObject(name=");
        LIZ.append((Object) this.LIZ);
        LIZ.append(", type=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", attributes=");
        LIZ.append(this.LIZJ);
        LIZ.append(", startOfMarkup=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", endOfMarkup=");
        return b0.LIZJ(LIZ, this.LJ, ')', LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C2056285e(java.lang.CharSequence r2, int r3, int r4) {
        /*
            r1 = this;
            r0 = r4 & 1
            if (r0 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r0 = r4 & 2
            if (r0 == 0) goto Lb
            r3 = -1
        Lb:
            r0 = r4 & 4
            if (r0 == 0) goto L17
            X.3mF r0 = X.C113554cx.LJJJLIIL()
        L13:
            r1.<init>(r2, r3, r0)
            return
        L17:
            r0 = 0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2056285e.<init>(java.lang.CharSequence, int, int):void");
    }

    public C2056285e(CharSequence name, int i, java.util.Map<String, String> attributes) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(attributes, "attributes");
        this.LIZ = name;
        this.LIZIZ = i;
        this.LIZJ = attributes;
    }
}
