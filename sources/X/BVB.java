package X;

import Y.AObserverS73S0100000_5;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BVB extends C31931Nd {
    public final PagingViewModel<?> LJLIL;
    public final CVT LJLILLLLZI;

    @Override // X.C31931Nd
    public final void M() {
    }

    @Override // X.C31931Nd
    public final void L() {
        this.LJLIL.LJLJJI.observeForever(new AObserverS73S0100000_5(this, 44));
    }

    public BVB(View view, PagingViewModel<?> pagingViewModel) {
        super(view);
        this.LJLIL = pagingViewModel;
        View findViewById = view.findViewById(R.id.g8a);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.loading_container)");
        CVT cvt = new CVT(view.getContext(), null);
        this.LJLILLLLZI = cvt;
        ((ViewGroup) findViewById).addView(cvt);
    }
}
