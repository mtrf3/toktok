package X;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.aaY, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94038aaY implements InterfaceC06750Oh {
    public final ConstraintLayout LJLIL;
    public final FrameLayout LJLILLLLZI;
    public final RecyclerView LJLJI;

    @Override // X.InterfaceC06750Oh
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.LJLIL;
    }

    public C94038aaY(ConstraintLayout constraintLayout, FrameLayout frameLayout, RecyclerView recyclerView) {
        this.LJLIL = constraintLayout;
        this.LJLILLLLZI = frameLayout;
        this.LJLJI = recyclerView;
    }
}
