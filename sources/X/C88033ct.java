package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.3ct, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88033ct implements InterfaceC87283bg {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C88033ct)) {
            return false;
        }
        C88033ct c88033ct = (C88033ct) obj;
        return this.LJLIL == c88033ct.LJLIL && this.LJLILLLLZI == c88033ct.LJLILLLLZI && o.LJ(this.LJLJI, c88033ct.LJLJI) && o.LJ(this.LJLJJI, c88033ct.LJLJJI);
    }

    public final int hashCode() {
        int i = ((this.LJLIL * 31) + this.LJLILLLLZI) * 31;
        String str = this.LJLJI;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJLJJI;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StickerStoreContentConfig(filterType=");
        LIZ.append(this.LJLIL);
        LIZ.append(", contentType=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", profileUid=");
        LIZ.append(this.LJLJI);
        LIZ.append(", conversationId=");
        return q.LIZIZ(LIZ, this.LJLJJI, ')', LIZ);
    }

    public C88033ct(int i, int i2, String str, String str2) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = str;
        this.LJLJJI = str2;
    }
}
