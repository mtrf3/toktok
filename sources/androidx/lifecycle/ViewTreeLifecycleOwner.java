package androidx.lifecycle;

import android.view.View;
import com.zhiliaoapp.musically.R;

/* loaded from: classes.dex */
public class ViewTreeLifecycleOwner {
    public static LifecycleOwner get(View view) {
        LifecycleOwner lifecycleOwner = (LifecycleOwner) view.getTag(R.id.ncj);
        if (lifecycleOwner != null) {
            return lifecycleOwner;
        }
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            lifecycleOwner = (LifecycleOwner) view2.getTag(R.id.ncj);
            parent = view2.getParent();
            if (lifecycleOwner != null) {
                break;
            }
        }
        return lifecycleOwner;
    }

    public static void set(View view, LifecycleOwner lifecycleOwner) {
        view.setTag(R.id.ncj, lifecycleOwner);
    }
}
