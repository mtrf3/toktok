package X;

import Y.IDCListenerS10S0101000;
import android.view.View;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public class BVK extends AbstractC31901Na {
    public final PagingViewModel LJLIL;

    @Override // X.AbstractC31901Na
    public final void L(boolean z) {
        C16880lQ.LJIIJ(new IDCListenerS10S0101000(1, this, 0), this.itemView.findViewById(R.id.izm));
    }

    public BVK(View view, PagingViewModel pagingViewModel) {
        super(view);
        this.LJLIL = pagingViewModel;
    }
}
