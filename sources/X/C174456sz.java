package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import kotlin.jvm.internal.o;

/* renamed from: X.6sz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C174456sz {
    public final int LIZ;
    public final Comment LIZIZ;
    public final int LIZJ;
    public final AbstractC176686wa LIZLLL;
    public final int LJ;
    public final Comment LJFF;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C174456sz() {
        /*
            r8 = this;
            r1 = 0
            r2 = 0
            r7 = 63
            r0 = r8
            r3 = r1
            r4 = r2
            r5 = r1
            r6 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C174456sz.<init>():void");
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommentPostingStatus(status=");
        LIZ.append(this.LIZ);
        LIZ.append(", comment=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", position=");
        LIZ.append(this.LIZJ);
        LIZ.append(", params=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", requestType=");
        LIZ.append(this.LJ);
        LIZ.append(", replyComment=");
        LIZ.append(this.LJFF);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = this.LIZ * 31;
        Comment comment = this.LIZIZ;
        int i4 = 0;
        if (comment != null) {
            i = comment.hashCode();
        } else {
            i = 0;
        }
        int i5 = (((i3 + i) * 31) + this.LIZJ) * 31;
        AbstractC176686wa abstractC176686wa = this.LIZLLL;
        if (abstractC176686wa != null) {
            i2 = abstractC176686wa.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (((i5 + i2) * 31) + this.LJ) * 31;
        Comment comment2 = this.LJFF;
        if (comment2 != null) {
            i4 = comment2.hashCode();
        }
        return i6 + i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C174456sz)) {
            return false;
        }
        C174456sz c174456sz = (C174456sz) obj;
        if (this.LIZ == c174456sz.LIZ && o.LJ(this.LIZIZ, c174456sz.LIZIZ) && this.LIZJ == c174456sz.LIZJ && o.LJ(this.LIZLLL, c174456sz.LIZLLL) && this.LJ == c174456sz.LJ && o.LJ(this.LJFF, c174456sz.LJFF)) {
            return true;
        }
        return false;
    }

    public C174456sz(int i, Comment comment, int i2, AbstractC176686wa abstractC176686wa, int i3, Comment comment2) {
        this.LIZ = i;
        this.LIZIZ = comment;
        this.LIZJ = i2;
        this.LIZLLL = abstractC176686wa;
        this.LJ = i3;
        this.LJFF = comment2;
    }

    public /* synthetic */ C174456sz(int i, Comment comment, int i2, AbstractC176686wa abstractC176686wa, int i3, Comment comment2, int i4) {
        this((i4 & 1) != 0 ? -1 : i, (i4 & 2) != 0 ? null : comment, (i4 & 4) != 0 ? -1 : i2, (i4 & 8) != 0 ? null : abstractC176686wa, (i4 & 16) == 0 ? i3 : -1, (i4 & 32) == 0 ? comment2 : null);
    }

    public static C174456sz LIZ(C174456sz c174456sz, int i, Comment comment, int i2, AbstractC176686wa abstractC176686wa, int i3, Comment comment2, int i4) {
        Comment comment3 = comment2;
        int i5 = i3;
        AbstractC176686wa abstractC176686wa2 = abstractC176686wa;
        int i6 = i2;
        int i7 = i;
        Comment comment4 = comment;
        if ((i4 & 1) != 0) {
            i7 = c174456sz.LIZ;
        }
        if ((i4 & 2) != 0) {
            comment4 = c174456sz.LIZIZ;
        }
        if ((i4 & 4) != 0) {
            i6 = c174456sz.LIZJ;
        }
        if ((i4 & 8) != 0) {
            abstractC176686wa2 = c174456sz.LIZLLL;
        }
        if ((i4 & 16) != 0) {
            i5 = c174456sz.LJ;
        }
        if ((i4 & 32) != 0) {
            comment3 = c174456sz.LJFF;
        }
        return new C174456sz(i7, comment4, i6, abstractC176686wa2, i5, comment3);
    }
}
