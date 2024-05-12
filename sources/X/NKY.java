package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NKY extends C59175NKh<NKU> {
    @Override // X.C59175NKh, X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        super.LJJJJJ(view);
        View LIZJ = view.LIZJ();
        if (LIZJ == null) {
            return;
        }
        LIZJ.setLayoutParams(new FrameLayout.LayoutParams(C17N.LJIILL(270.0d), -2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NKY(NKU cardAdCache, Context context) {
        super(cardAdCache, context);
        o.LJIIIZ(cardAdCache, "cardAdCache");
    }
}
