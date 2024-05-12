package X;

import Y.IDLListenerS197S0100000_10;
import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes11.dex */
public final class OM5 {
    public final View LIZ;
    public int LIZIZ;
    public final FrameLayout.LayoutParams LIZJ;
    public int LIZLLL;
    public boolean LJ = true;
    public final int LJFF;

    public OM5(Activity activity) {
        this.LJFF = C63081OpJ.LJJJJLI(activity);
        View childAt = ((ViewGroup) activity.findViewById(R.id.content)).getChildAt(0);
        this.LIZ = childAt;
        childAt.getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS197S0100000_10(this, 9));
        this.LIZJ = (FrameLayout.LayoutParams) childAt.getLayoutParams();
    }
}
