package X;

import com.ss.android.ugc.aweme.base.arch.JediBaseWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpFragment;
import com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.widget.UsPdpBottomNavBarWidget;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RZC extends RZG {
    @Override // X.RZG, X.RYY
    public final JediBaseWidget iw(PdpFragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        return new UsPdpBottomNavBarWidget(fragment);
    }
}
