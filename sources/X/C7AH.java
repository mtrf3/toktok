package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.7AH, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7AH implements C33Q {
    public final AbstractC72932td<Integer> LJLIL;
    public final C43I<Boolean> LJLILLLLZI;
    public final C43I<Long> LJLJI;
    public final C43I<Boolean> LJLJJI;
    public final String LJLJJL;
    public final int LJLJJLL;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C7AH() {
        /*
            r2 = this;
            r1 = 0
            r0 = 63
            r2.<init>(r1, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7AH.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7AH)) {
            return false;
        }
        C7AH c7ah = (C7AH) obj;
        return o.LJ(this.LJLIL, c7ah.LJLIL) && o.LJ(this.LJLILLLLZI, c7ah.LJLILLLLZI) && o.LJ(this.LJLJI, c7ah.LJLJI) && o.LJ(this.LJLJJI, c7ah.LJLJJI) && o.LJ(this.LJLJJL, c7ah.LJLJJL) && this.LJLJJLL == c7ah.LJLJJLL;
    }

    public final int hashCode() {
        int hashCode;
        int LIZIZ = C40328FsC.LIZIZ(this.LJLJI, C40328FsC.LIZIZ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31), 31);
        C43I<Boolean> c43i = this.LJLJJI;
        int i = 0;
        if (c43i == null) {
            hashCode = 0;
        } else {
            hashCode = c43i.hashCode();
        }
        int i2 = (LIZIZ + hashCode) * 31;
        String str = this.LJLJJL;
        if (str != null) {
            i = str.hashCode();
        }
        return ((i2 + i) * 31) + this.LJLJJLL;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowLikeState(request=");
        LIZ.append(this.LJLIL);
        LIZ.append(", isLiked=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", likeCount=");
        LIZ.append(this.LJLJI);
        LIZ.append(", syncAction=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", enterFrom=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", nowFeedType=");
        return b0.LIZJ(LIZ, this.LJLJJLL, ')', LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C7AH(X.C43I r9, X.C43I r10, int r11) {
        /*
            r8 = this;
            r3 = r9
            r4 = r10
            r0 = r11 & 1
            if (r0 == 0) goto L2a
            X.33X r2 = X.C33X.LIZ
        L8:
            r0 = r11 & 2
            if (r0 == 0) goto L13
            X.43I r3 = new X.43I
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r3.<init>(r0)
        L13:
            r0 = r11 & 4
            if (r0 == 0) goto L22
            X.43I r4 = new X.43I
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.<init>(r0)
        L22:
            r5 = 0
            r7 = 0
            r1 = r8
            r6 = r5
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        L2a:
            r2 = 0
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7AH.<init>(X.43I, X.43I, int):void");
    }

    public C7AH(AbstractC72932td<Integer> request, C43I<Boolean> isLiked, C43I<Long> likeCount, C43I<Boolean> c43i, String str, int i) {
        o.LJIIIZ(request, "request");
        o.LJIIIZ(isLiked, "isLiked");
        o.LJIIIZ(likeCount, "likeCount");
        this.LJLIL = request;
        this.LJLILLLLZI = isLiked;
        this.LJLJI = likeCount;
        this.LJLJJI = c43i;
        this.LJLJJL = str;
        this.LJLJJLL = i;
    }

    public static C7AH LIZ(C7AH c7ah, AbstractC72932td abstractC72932td, C43I c43i, C43I c43i2, C43I c43i3, String str, int i, int i2) {
        int i3 = i;
        String str2 = str;
        C43I c43i4 = c43i3;
        C43I likeCount = c43i2;
        AbstractC72932td request = abstractC72932td;
        C43I isLiked = c43i;
        if ((i2 & 1) != 0) {
            request = c7ah.LJLIL;
        }
        if ((i2 & 2) != 0) {
            isLiked = c7ah.LJLILLLLZI;
        }
        if ((i2 & 4) != 0) {
            likeCount = c7ah.LJLJI;
        }
        if ((i2 & 8) != 0) {
            c43i4 = c7ah.LJLJJI;
        }
        if ((i2 & 16) != 0) {
            str2 = c7ah.LJLJJL;
        }
        if ((i2 & 32) != 0) {
            i3 = c7ah.LJLJJLL;
        }
        c7ah.getClass();
        o.LJIIIZ(request, "request");
        o.LJIIIZ(isLiked, "isLiked");
        o.LJIIIZ(likeCount, "likeCount");
        return new C7AH(request, isLiked, likeCount, c43i4, str2, i3);
    }
}
