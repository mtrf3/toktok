package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.journey.step.JourneyBaseFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.G2f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40869G2f extends C0A6 {
    public int LJLIL;
    public final /* synthetic */ JourneyBaseFragment LJLILLLLZI;

    public C40869G2f(JourneyBaseFragment journeyBaseFragment) {
        this.LJLILLLLZI = journeyBaseFragment;
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
