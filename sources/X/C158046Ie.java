package X;

import Y.ARunnableS8S0201000_5;
import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;

/* renamed from: X.6Ie, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C158046Ie extends HorizontalScrollView {
    public static final /* synthetic */ int LJLIL = 0;

    public C158046Ie(Context context) {
        super(context, null);
        setOverScrollMode(2);
    }

    public final void LIZ(View view) {
        if (getWidth() == 0) {
            postDelayed(new ARunnableS8S0201000_5(3, this, view, 8), 100L);
        } else {
            smoothScrollTo(((view.getRight() + view.getLeft()) / 2) - (getWidth() / 2), 0);
        }
    }
}
