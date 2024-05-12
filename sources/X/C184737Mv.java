package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.7Mv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C184737Mv implements InterfaceC87283bg {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final boolean LJLJJI;
    public final boolean LJLJJL;
    public final String LJLJJLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C184737Mv)) {
            return false;
        }
        C184737Mv c184737Mv = (C184737Mv) obj;
        return o.LJ(this.LJLIL, c184737Mv.LJLIL) && o.LJ(this.LJLILLLLZI, c184737Mv.LJLILLLLZI) && o.LJ(this.LJLJI, c184737Mv.LJLJI) && this.LJLJJI == c184737Mv.LJLJJI && this.LJLJJL == c184737Mv.LJLJJL && o.LJ(this.LJLJJLL, c184737Mv.LJLJJLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31);
        String str = this.LJLJI;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        boolean z = this.LJLJJI;
        int i3 = 1;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        int i5 = (i2 + i4) * 31;
        if (!this.LJLJJL) {
            i3 = 0;
        }
        int i6 = (i5 + i3) * 31;
        String str2 = this.LJLJJLL;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i6 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowDetailParam(aid=");
        LIZ.append(this.LJLIL);
        LIZ.append(", uid=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", cid=");
        LIZ.append(this.LJLJI);
        LIZ.append(", needShowViews=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", isExpired=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", enterFrom=");
        return q.LIZIZ(LIZ, this.LJLJJLL, ')', LIZ);
    }

    public C184737Mv(String aid, String uid, boolean z, String str, boolean z2, String str2) {
        o.LJIIIZ(aid, "aid");
        o.LJIIIZ(uid, "uid");
        this.LJLIL = aid;
        this.LJLILLLLZI = uid;
        this.LJLJI = str;
        this.LJLJJI = z;
        this.LJLJJL = z2;
        this.LJLJJLL = str2;
    }
}
