package X;

import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.TsF, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76003TsF extends C47261Igj {
    public final int LJLJJI;
    public final String LJLJJL;

    public final Object[] LJJL() {
        return new Object[]{Integer.valueOf(this.LJLJJI), this.LJLJJL};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C76003TsF) {
            return C78966Uyw.LJIIIZ(((C76003TsF) obj).LJJL(), LJJL());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LJJL());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("MultiHostError:%s,%s", LJJL());
    }

    public C76003TsF(int i, String errorMsg) {
        o.LJIIIZ(errorMsg, "errorMsg");
        this.LJLJJI = i;
        this.LJLJJL = errorMsg;
    }
}
