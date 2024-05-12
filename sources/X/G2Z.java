package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.journey.step.interestselector.SelectInterestsComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G2Z extends C0A6 {
    public int LJLIL;
    public final /* synthetic */ SelectInterestsComponent LJLILLLLZI;

    public G2Z(SelectInterestsComponent selectInterestsComponent) {
        this.LJLILLLLZI = selectInterestsComponent;
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        this.LJLIL += i2;
        if (!this.LJLILLLLZI.isViewValid() || this.LJLILLLLZI._$_findCachedViewById(R.id.l_2).getHeight() <= 0) {
            return;
        }
        this.LJLILLLLZI._$_findCachedViewById(R.id.l_2).setAlpha((this.LJLIL * 1.0f) / this.LJLILLLLZI._$_findCachedViewById(R.id.l_2).getHeight());
    }
}
