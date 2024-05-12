package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3Jq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81983Jq {
    public final String LIZ;
    public final EnumC82443Lk LIZIZ;
    public final EnumC82403Lg LIZJ;
    public final InterfaceC88472Yns<C3L4, Boolean> LIZLLL;
    public final InterfaceC88472Yns<Object, Boolean> LJ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZIZ);
        LIZ.append('_');
        LIZ.append(this.LIZJ);
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C81983Jq) && o.LJ(((C81983Jq) obj).LIZ, this.LIZ)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C81983Jq(X.EnumC82443Lk r7, X.EnumC82403Lg r8, X.InterfaceC88472Yns<? super X.C3L4, java.lang.Boolean> r9, X.InterfaceC88472Yns<java.lang.Object, java.lang.Boolean> r10) {
        /*
            r6 = this;
            java.lang.String r0 = "sessionCategory"
            r2 = r7
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            java.lang.String r0 = "sessionFilter"
            r3 = r8
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = r2.name()
            r1.append(r0)
            r0 = 47
            r1.append(r0)
            java.lang.String r0 = r3.name()
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            r0 = r6
            r5 = r10
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81983Jq.<init>(X.3Lk, X.3Lg, X.Yns, X.Yns):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C81983Jq(String seqId, EnumC82443Lk sessionCategory, EnumC82403Lg sessionFilter, InterfaceC88472Yns<? super C3L4, Boolean> isSessionInPage, InterfaceC88472Yns<Object, Boolean> isConversationInPage) {
        o.LJIIIZ(seqId, "seqId");
        o.LJIIIZ(sessionCategory, "sessionCategory");
        o.LJIIIZ(sessionFilter, "sessionFilter");
        o.LJIIIZ(isSessionInPage, "isSessionInPage");
        o.LJIIIZ(isConversationInPage, "isConversationInPage");
        this.LIZ = seqId;
        this.LIZIZ = sessionCategory;
        this.LIZJ = sessionFilter;
        this.LIZLLL = isSessionInPage;
        this.LJ = isConversationInPage;
    }
}
