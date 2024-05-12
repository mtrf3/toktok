package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.SjT, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72911SjT extends F9E {
    public final long LJLIL;
    public final List<Object> LJLILLLLZI;
    public final C72909SjR LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.LJLIL), this.LJLILLLLZI, this.LJLJI};
    }

    public C72911SjT(long j, List<? extends Object> listData, C72909SjR c72909SjR) {
        o.LJIIIZ(listData, "listData");
        this.LJLIL = j;
        this.LJLILLLLZI = listData;
        this.LJLJI = c72909SjR;
    }
}
