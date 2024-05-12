package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.DIx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33659DIx extends AbstractC65781Prl implements InterfaceC65784Pro<RecyclerView.RecycledViewPool> {
    public static final C33659DIx LJLIL = new C33659DIx();

    public C33659DIx() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final RecyclerView.RecycledViewPool invoke() {
        RecyclerView.RecycledViewPool recycledViewPool = new RecyclerView.RecycledViewPool();
        recycledViewPool.setMaxRecycledViews(1, 12);
        recycledViewPool.setMaxRecycledViews(9, 1);
        recycledViewPool.setMaxRecycledViews(10, 1);
        return recycledViewPool;
    }
}
