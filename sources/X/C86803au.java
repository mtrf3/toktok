package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3au, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86803au extends F9E {
    public final long LJLIL;
    public final long LJLILLLLZI;
    public final boolean LJLJI;
    public final List<C72412sn> LJLJJI;

    public C86803au() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.LJLIL), Long.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI), this.LJLJJI};
    }

    public /* synthetic */ C86803au(int i) {
        this(-1L, false, -1L, new ArrayList());
    }

    public C86803au(long j, boolean z, long j2, List data) {
        o.LJIIIZ(data, "data");
        this.LJLIL = j;
        this.LJLILLLLZI = j2;
        this.LJLJI = z;
        this.LJLJJI = data;
    }
}
