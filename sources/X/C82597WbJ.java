package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: X.WbJ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82597WbJ extends C30461Hm {
    public final /* synthetic */ C82584Wb6 LJLILLLLZI;

    @Override // X.C30461Hm, X.InterfaceC82947Wgx
    public final void LIZLLL() {
        View view = this.LJLILLLLZI.LJLILLLLZI;
        if (view != null) {
            view.setVisibility(0);
        }
        C82584Wb6 c82584Wb6 = this.LJLILLLLZI;
        LinearLayoutManager linearLayoutManager = c82584Wb6.LJLJLJ;
        if (linearLayoutManager != null) {
            linearLayoutManager.LJFF(c82584Wb6.LJLJLLL, c82584Wb6.LJLL);
        }
    }

    public C82597WbJ(C82584Wb6 c82584Wb6) {
        this.LJLILLLLZI = c82584Wb6;
    }
}
