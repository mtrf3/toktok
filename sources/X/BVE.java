package X;

import Y.ACListenerS25S0100000_5;
import android.view.View;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.android.livesdk.qa.QuestionEx;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class BVE extends AbstractC31901Na {
    public final PagingViewModel<?> LJLIL;

    @Override // X.AbstractC31901Na
    public final void L(boolean z) {
        C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 338), this.itemView.findViewById(R.id.izm));
    }

    public BVE(View view, PagingViewModel<QuestionEx> pagingViewModel) {
        super(view);
        this.LJLIL = pagingViewModel;
    }
}
