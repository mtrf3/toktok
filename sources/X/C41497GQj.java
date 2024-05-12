package X;

import kotlin.jvm.internal.o;

/* renamed from: X.GQj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41497GQj extends F9E {
    public CharSequence LJLIL;
    public final int LJLILLLLZI;
    public final java.util.Map<String, String> LJLJI;

    public C41497GQj() {
        this((CharSequence) null, 0, 7);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), this.LJLJI};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C41497GQj(java.lang.CharSequence r2, int r3, int r4) {
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
        throw new UnsupportedOperationException("Method not decompiled: X.C41497GQj.<init>(java.lang.CharSequence, int, int):void");
    }

    public C41497GQj(CharSequence name, int i, java.util.Map<String, String> attributes) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(attributes, "attributes");
        this.LJLIL = name;
        this.LJLILLLLZI = i;
        this.LJLJI = attributes;
    }
}
