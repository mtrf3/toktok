package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WZI extends C0A6 {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public final /* synthetic */ WZJ LJLJI;

    public WZI(WZJ wzj) {
        this.LJLJI = wzj;
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        Object tag;
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0 && this.LJLIL) {
            this.LJLIL = false;
            WZJ wzj = this.LJLJI;
            wzj.getClass();
            this.LJLILLLLZI = false;
            AqS180S0100000_14 aqS180S0100000_14 = new AqS180S0100000_14(wzj, 251);
            View LJFF = this.LJLJI.LJLJI.LJFF(recyclerView.getLayoutManager());
            if (LJFF != null && (tag = LJFF.getTag()) != null && (tag instanceof AbstractC77373UYf) && (tag instanceof AbstractC77373UYf)) {
                aqS180S0100000_14.invoke(tag);
            }
            this.LJLJI.LLJJIJI();
            return;
        }
        if (2 == i) {
            this.LJLIL = true;
            this.LJLILLLLZI = true;
            this.LJLJI.LLJJIJIIJIL("STATE_PREVIEW_NONE");
        } else {
            if (i != 1) {
                return;
            }
            this.LJLILLLLZI = true;
            this.LJLJI.LLJJIJIIJIL("STATE_PREVIEW_NONE");
        }
    }
}
