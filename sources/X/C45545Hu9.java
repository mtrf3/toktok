package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Hu9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45545Hu9 extends AbstractC65781Prl implements InterfaceC65784Pro<RecyclerView.RecycledViewPool> {
    public static final C45545Hu9 LJLIL = new C45545Hu9();

    public C45545Hu9() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final RecyclerView.RecycledViewPool invoke() {
        RecyclerView.RecycledViewPool recycledViewPool = new RecyclerView.RecycledViewPool();
        recycledViewPool.setMaxRecycledViews(0, 30);
        return recycledViewPool;
    }
}
