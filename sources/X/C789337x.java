package X;

import defpackage.q;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.37x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C789337x {
    public final String LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final Boolean LIZLLL;
    public final String LJ;
    public final String LJFF;

    public final C789337x LIZ() {
        if (((ArrayList) ORY.LJJIJLIJ(new Object[]{this.LIZJ, this.LIZLLL, this.LJ, this.LJFF})).isEmpty()) {
            return null;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C789337x)) {
            return false;
        }
        C789337x c789337x = (C789337x) obj;
        return o.LJ(this.LIZ, c789337x.LIZ) && this.LIZIZ == c789337x.LIZIZ && o.LJ(this.LIZJ, c789337x.LIZJ) && o.LJ(this.LIZLLL, c789337x.LIZLLL) && o.LJ(this.LJ, c789337x.LJ) && o.LJ(this.LJFF, c789337x.LJFF);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int LIZJ = JBR.LIZJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        String str = this.LIZJ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LIZJ + hashCode) * 31;
        Boolean bool = this.LIZLLL;
        if (bool == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.LJ;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str3 = this.LJFF;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i4 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserInfo(uid=");
        LIZ.append(this.LIZ);
        LIZ.append(", version=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", nickname=");
        LIZ.append(this.LIZJ);
        LIZ.append(", isPrivateAccount=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", avatar168=");
        LIZ.append(this.LJ);
        LIZ.append(", avatar300=");
        return q.LIZIZ(LIZ, this.LJFF, ')', LIZ);
    }

    public C789337x(String uid, long j, String str, Boolean bool, String str2, String str3) {
        o.LJIIIZ(uid, "uid");
        this.LIZ = uid;
        this.LIZIZ = j;
        this.LIZJ = str;
        this.LIZLLL = bool;
        this.LJ = str2;
        this.LJFF = str3;
    }
}
