package X;

import Y.AObserverS73S0100000_5;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public class BOD extends C31931Nd {
    public final ViewGroup LJLIL;
    public final CVT LJLILLLLZI;
    public final PagingViewModel LJLJI;

    @Override // X.C31931Nd
    public final void L() {
        this.LJLJI.LJLJJI.observeForever(new AObserverS73S0100000_5(this, 64));
    }

    public BOD(View view, PagingViewModel pagingViewModel) {
        super(view);
        this.LJLJI = pagingViewModel;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.g8a);
        this.LJLIL = viewGroup;
        CVT cvt = new CVT(view.getContext(), null);
        this.LJLILLLLZI = cvt;
        viewGroup.addView(cvt);
    }
}
