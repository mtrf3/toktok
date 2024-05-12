package X;

import java.util.Collection;
import java.util.Map;

/* renamed from: X.Ppb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65647Ppb extends AbstractC65674Pq2<Object> {
    public final /* synthetic */ Map.Entry LJLIL;

    @Override // X.InterfaceC65712Pqe
    public final Object LIZLLL() {
        return this.LJLIL.getKey();
    }

    @Override // X.InterfaceC65712Pqe
    public final int getCount() {
        return ((Collection) this.LJLIL.getValue()).size();
    }

    public C65647Ppb(Map.Entry entry) {
        this.LJLIL = entry;
    }
}
