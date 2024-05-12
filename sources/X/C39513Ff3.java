package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Ff3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39513Ff3 extends F9E {
    public final EnumC39525FfF LJLIL;
    public final String LJLILLLLZI;

    public C39513Ff3() {
        this((EnumC39525FfF) null, 3);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C39513Ff3(X.EnumC39525FfF r2, int r3) {
        /*
            r1 = this;
            r0 = r3 & 1
            if (r0 == 0) goto L6
            X.FfF r2 = X.EnumC39525FfF.VOID
        L6:
            r0 = r3 & 2
            if (r0 == 0) goto L10
            java.lang.String r0 = ""
        Lc:
            r1.<init>(r2, r0)
            return
        L10:
            r0 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39513Ff3.<init>(X.FfF, int):void");
    }

    public C39513Ff3(EnumC39525FfF type, String metaInfo) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(metaInfo, "metaInfo");
        this.LJLIL = type;
        this.LJLILLLLZI = metaInfo;
    }
}
