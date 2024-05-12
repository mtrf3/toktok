package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.7Ml, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C184637Ml implements InterfaceC87283bg {
    public final boolean LJLIL;
    public final String LJLILLLLZI;

    public C184637Ml() {
        this(false, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C184637Ml)) {
            return false;
        }
        C184637Ml c184637Ml = (C184637Ml) obj;
        return this.LJLIL == c184637Ml.LJLIL && o.LJ(this.LJLILLLLZI, c184637Ml.LJLILLLLZI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        boolean z = this.LJLIL;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.LJLILLLLZI;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowFeedPublishData(shouldBackToCurPageAfterPublish=");
        LIZ.append(this.LJLIL);
        LIZ.append(", toastWhenStartPublish=");
        return q.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public C184637Ml(boolean z, String str) {
        this.LJLIL = z;
        this.LJLILLLLZI = str;
    }
}
