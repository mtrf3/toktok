package X;

import Y.ARunnableS33S0200000_14;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;

/* renamed from: X.WbK, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82598WbK implements InterfaceC169456kv {
    public final /* synthetic */ C82584Wb6 LIZ;

    @Override // X.InterfaceC169456kv
    public final void LIZIZ(int i, String str) {
    }

    @Override // X.InterfaceC169456kv
    public final void LIZJ() {
    }

    public C82598WbK(C82584Wb6 c82584Wb6) {
        this.LIZ = c82584Wb6;
    }

    @Override // X.InterfaceC169456kv
    public final void LIZ(CategoryPageModel categoryPageModel) {
        C82584Wb6 c82584Wb6 = this.LIZ;
        RecyclerView recyclerView = c82584Wb6.LJLJJI;
        if (recyclerView != null) {
            recyclerView.post(new ARunnableS33S0200000_14(categoryPageModel, c82584Wb6, 80));
        }
    }
}
