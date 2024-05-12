package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.8Q0, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8Q0 implements C33Q {
    public final C43I<Aweme> LJLIL;
    public final C43I<Boolean> LJLILLLLZI;

    public C8Q0() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8Q0)) {
            return false;
        }
        C8Q0 c8q0 = (C8Q0) obj;
        return o.LJ(this.LJLIL, c8q0.LJLIL) && o.LJ(this.LJLILLLLZI, c8q0.LJLILLLLZI);
    }

    public final int hashCode() {
        C43I<Aweme> c43i = this.LJLIL;
        int hashCode = (c43i == null ? 0 : c43i.hashCode()) * 31;
        C43I<Boolean> c43i2 = this.LJLILLLLZI;
        return hashCode + (c43i2 != null ? c43i2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SocialVideoTagState(bindTagEvent=");
        LIZ.append(this.LJLIL);
        LIZ.append(", showPublicFeedAnim=");
        return C61845OOz.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C8Q0(C43I<? extends Aweme> c43i, C43I<Boolean> c43i2) {
        this.LJLIL = c43i;
        this.LJLILLLLZI = c43i2;
    }

    public static C8Q0 LIZ(C8Q0 c8q0, C43I c43i, C43I c43i2, int i) {
        if ((i & 1) != 0) {
            c43i = c8q0.LJLIL;
        }
        if ((i & 2) != 0) {
            c43i2 = c8q0.LJLILLLLZI;
        }
        c8q0.getClass();
        return new C8Q0(c43i, c43i2);
    }
}
