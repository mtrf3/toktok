package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.7Ri, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C185907Ri extends C185927Rk {
    public final Aweme LJLILLLLZI;

    @Override // X.C185927Rk
    public final int hashCode() {
        return this.LJLILLLLZI.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DetailVideoItem(aweme=");
        return C770830u.LIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    @Override // X.C185927Rk
    public final Aweme getAweme() {
        return this.LJLILLLLZI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C185907Ri(Aweme aweme) {
        super(aweme);
        o.LJIIIZ(aweme, "aweme");
        this.LJLILLLLZI = aweme;
    }

    @Override // X.C185927Rk
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C185907Ri) && o.LJ(this.LJLILLLLZI, ((C185907Ri) obj).LJLILLLLZI)) {
            return true;
        }
        return false;
    }
}
