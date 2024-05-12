package X;

import android.content.Context;
import android.widget.HorizontalScrollView;

/* loaded from: classes9.dex */
public final class KUX extends HorizontalScrollView {
    public static final /* synthetic */ int LJLIL = 0;

    public KUX(Context context) {
        super(context, null);
        setOverScrollMode(2);
    }

    public final void LIZ(KUW kuw) {
        if (getWidth() == 0) {
            postDelayed(new RunnableC45421Hs9(5, this, kuw), 100L);
        } else {
            smoothScrollTo(((kuw.getRight() + kuw.getLeft()) / 2) - (getWidth() / 2), 0);
        }
    }
}
