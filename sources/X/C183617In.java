package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.7In, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C183617In implements InterfaceC87283bg {
    public final String LJLIL;
    public final String LJLILLLLZI;

    public C183617In() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C183617In)) {
            return false;
        }
        C183617In c183617In = (C183617In) obj;
        return o.LJ(this.LJLIL, c183617In.LJLIL) && o.LJ(this.LJLILLLLZI, c183617In.LJLILLLLZI);
    }

    public final int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LJLILLLLZI;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UpvoteBubbleParam(upvoteId=");
        LIZ.append(this.LJLIL);
        LIZ.append(", eventType=");
        return q.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public C183617In(String str, String str2) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
    }
}
