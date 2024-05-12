package X;

import android.view.View;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.dsp.playpage.base.BasePlayerFragment;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Zuq, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91452Zuq<T> implements Observer {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ BasePlayerFragment LJLILLLLZI;

    public C91452Zuq(View view, BasePlayerFragment basePlayerFragment) {
        this.LJLIL = view;
        this.LJLILLLLZI = basePlayerFragment;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        if (obj == null) {
            return;
        }
        View findViewById = this.LJLIL.findViewById(R.id.gsv);
        BasePlayerFragment basePlayerFragment = this.LJLILLLLZI;
        findViewById.getLayoutParams().height = basePlayerFragment.ZK();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("bottom space height ");
        LIZ.append(findViewById.getLayoutParams().height);
        X1D.LIZIZ(LIZ);
        findViewById.requestLayout();
    }
}
