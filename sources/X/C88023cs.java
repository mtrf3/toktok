package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.3cs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88023cs implements InterfaceC87283bg {
    public final long LJLIL;
    public final int LJLILLLLZI;
    public final String LJLJI;
    public final boolean LJLJJI;
    public final String LJLJJL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C88023cs)) {
            return false;
        }
        C88023cs c88023cs = (C88023cs) obj;
        return this.LJLIL == c88023cs.LJLIL && this.LJLILLLLZI == c88023cs.LJLILLLLZI && o.LJ(this.LJLJI, c88023cs.LJLJI) && this.LJLJJI == c88023cs.LJLJJI && o.LJ(this.LJLJJL, c88023cs.LJLJJL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LLJIJIL = ((C16880lQ.LLJIJIL(this.LJLIL) * 31) + this.LJLILLLLZI) * 31;
        String str = this.LJLJI;
        int hashCode = (LLJIJIL + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.LJLJJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        String str2 = this.LJLJJL;
        return i2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StickerSetDetailConfig(setId=");
        LIZ.append(this.LJLIL);
        LIZ.append(", contentType=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", profileUid=");
        LIZ.append(this.LJLJI);
        LIZ.append(", isFromMessage=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", conversationId=");
        return q.LIZIZ(LIZ, this.LJLJJL, ')', LIZ);
    }

    public C88023cs(int i, String str, String str2, boolean z, long j) {
        this.LJLIL = j;
        this.LJLILLLLZI = i;
        this.LJLJI = str;
        this.LJLJJI = z;
        this.LJLJJL = str2;
    }
}
