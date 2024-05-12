package X;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Fgs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39626Fgs implements InterfaceC1039145z<Object> {
    public final /* synthetic */ InterfaceC1039145z<Object> LIZ;
    public final /* synthetic */ Comparator<Object> LIZIZ;

    @Override // X.InterfaceC1039145z
    public final Iterator<Object> iterator() {
        List LJJLIIIJ = OJ4.LJJLIIIJ(this.LIZ);
        C40675Fxn.LJJLIIIJ(LJJLIIIJ, this.LIZIZ);
        return LJJLIIIJ.iterator();
    }

    public C39626Fgs(C115534g9 c115534g9, Comparator comparator) {
        this.LIZ = c115534g9;
        this.LIZIZ = comparator;
    }
}
