package X;

import Y.IDLListenerS200S0100000_15;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.zhiliaoapp.musically.R;

/* loaded from: classes16.dex */
public final class Y8Z {
    public final View LIZ;
    public final View LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public final FrameLayout.LayoutParams LJFF;
    public int LJI;
    public boolean LJII = true;

    public Y8Z(Fragment fragment) {
        View view = fragment.getView();
        if (view == null) {
            return;
        }
        this.LIZIZ = view.getRootView().findViewById(R.id.bs8);
        this.LIZ = view;
        view.getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS200S0100000_15(this, 2));
        this.LJFF = (FrameLayout.LayoutParams) view.getLayoutParams();
    }
}
