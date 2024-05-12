package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3bP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87113bP extends F9E {
    public final long LJLIL;
    public final long LJLILLLLZI;
    public final boolean LJLJI;
    public final List<C87123bQ> LJLJJI;

    public C87113bP() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.LJLIL), Long.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI), this.LJLJJI};
    }

    public /* synthetic */ C87113bP(int i) {
        this(-1L, false, -1L, new ArrayList());
    }

    public C87113bP(long j, boolean z, long j2, List data) {
        o.LJIIIZ(data, "data");
        this.LJLIL = j;
        this.LJLILLLLZI = j2;
        this.LJLJI = z;
        this.LJLJJI = data;
    }
}
