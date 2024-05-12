package X;

import android.view.View;
import android.view.WindowInsets;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.search.ecommerce.middle.AbstractSearchIntermediateFragmentNew;
import kotlin.jvm.internal.o;

/* renamed from: X.K4b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnApplyWindowInsetsListenerC51109K4b implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ AbstractSearchIntermediateFragmentNew LIZ;

    public ViewOnApplyWindowInsetsListenerC51109K4b(AbstractSearchIntermediateFragmentNew abstractSearchIntermediateFragmentNew) {
        this.LIZ = abstractSearchIntermediateFragmentNew;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets insets) {
        o.LJIIIZ(view, "<anonymous parameter 0>");
        o.LJIIIZ(insets, "insets");
        XKQ xkq = this.LIZ.LL;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        AbstractSearchIntermediateFragmentNew abstractSearchIntermediateFragmentNew = this.LIZ;
        abstractSearchIntermediateFragmentNew.LL = XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(abstractSearchIntermediateFragmentNew), null, null, new K4Z(this.LIZ, null), 3);
        return insets;
    }
}
