package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior;

/* renamed from: X.Vcu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80148Vcu {
    public static View LIZ(View view) {
        while (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof C06F) && (((C06F) layoutParams).LIZ instanceof ViewPagerBottomSheetBehavior)) {
                return view;
            }
            Object parent = view.getParent();
            if (parent == null || !(parent instanceof View)) {
                view = null;
            } else {
                view = (View) parent;
            }
        }
        return null;
    }
}
