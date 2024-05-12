package X;

import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LFO extends C195927mW {
    public final /* synthetic */ LFM LJLIL;

    public LFO(LFM lfm) {
        this.LJLIL = lfm;
    }

    @Override // X.LLY
    public final void s0(AbstractC225698tR tabStyle, boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        o.LJIIIZ(tabStyle, "tabStyle");
        LFM lfm = this.LJLIL;
        ViewGroup.LayoutParams layoutParams = lfm.LJLIL.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            return;
        }
        marginLayoutParams.bottomMargin = lfm.LJJIFFI(lfm.LJLILLLLZI);
        lfm.LJLIL.setLayoutParams(marginLayoutParams);
    }
}
