package X;

import Y.ARunnableS44S0100000_8;
import android.view.View;
import com.ss.android.ugc.aweme.pipfeed.vm.PipFeedWindowVM;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public abstract class JEC implements View.OnClickListener {
    public long LJLIL;
    public View LJLILLLLZI;
    public final ARunnableS44S0100000_8 LJLJI = new ARunnableS44S0100000_8(this, 150);

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        o.LJIIIZ(view, "view");
        this.LJLILLLLZI = view;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.LJLIL < 200) {
            view.removeCallbacks(this.LJLJI);
            this.LJLIL = 0L;
            PipFeedWindowVM pipFeedWindowVM = (PipFeedWindowVM) ((JEN) this).LJLJJI.LJLJJLL.getValue();
            JE0 value = pipFeedWindowVM.LJLILLLLZI.getValue();
            if (value == null) {
                return;
            }
            int i = C48818JDy.LIZ[value.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                pipFeedWindowVM.LJLILLLLZI.postValue(JE0.DEFAULT);
                return;
            }
            pipFeedWindowVM.LJLILLLLZI.postValue(JE0.SMALL);
            return;
        }
        View view2 = this.LJLILLLLZI;
        if (view2 != null) {
            view2.removeCallbacks(this.LJLJI);
        }
        View view3 = this.LJLILLLLZI;
        if (view3 != null) {
            view3.postDelayed(this.LJLJI, 200L);
        }
        this.LJLIL = currentTimeMillis;
    }
}
