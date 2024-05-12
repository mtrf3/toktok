package X;

import defpackage.g0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.PrQ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65760PrQ<V> implements InterfaceC139745e6<List<V>>, Serializable {
    public final int LJLIL;

    @Override // X.InterfaceC139745e6
    public final Object get() {
        return new ArrayList(this.LJLIL);
    }

    public C65760PrQ(int i) {
        g0.LJIIIIZZ(i, "expectedValuesPerKey");
        this.LJLIL = i;
    }
}
