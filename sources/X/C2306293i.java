package X;

import com.ss.android.ugc.aweme.qna.fragment.BaseQnaTabFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.93i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2306293i implements C33Q {
    public final C43I<BaseQnaTabFragment> LJLIL;

    public C2306293i() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2306293i) && o.LJ(this.LJLIL, ((C2306293i) obj).LJLIL);
    }

    public final int hashCode() {
        C43I<BaseQnaTabFragment> c43i = this.LJLIL;
        if (c43i == null) {
            return 0;
        }
        return c43i.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("QnaSelectedPageState(event=");
        return C61845OOz.LIZIZ(LIZ, this.LJLIL, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2306293i(C43I<? extends BaseQnaTabFragment> c43i) {
        this.LJLIL = c43i;
    }
}
