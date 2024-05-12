package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.GJs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41324GJs extends AbstractC65781Prl implements InterfaceC65784Pro<RecyclerView.RecycledViewPool> {
    public static final C41324GJs LJLIL = new C41324GJs();

    public C41324GJs() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final RecyclerView.RecycledViewPool invoke() {
        RecyclerView.RecycledViewPool recycledViewPool = new RecyclerView.RecycledViewPool();
        recycledViewPool.setMaxRecycledViews(0, 18);
        return recycledViewPool;
    }
}
