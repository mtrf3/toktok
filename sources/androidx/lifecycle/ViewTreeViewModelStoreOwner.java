package androidx.lifecycle;

import android.view.View;
import com.zhiliaoapp.musically.R;

/* loaded from: classes.dex */
public class ViewTreeViewModelStoreOwner {
    public static ViewModelStoreOwner get(View view) {
        ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) view.getTag(R.id.ncm);
        if (viewModelStoreOwner != null) {
            return viewModelStoreOwner;
        }
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            viewModelStoreOwner = (ViewModelStoreOwner) view2.getTag(R.id.ncm);
            parent = view2.getParent();
            if (viewModelStoreOwner != null) {
                break;
            }
        }
        return viewModelStoreOwner;
    }

    public static void set(View view, ViewModelStoreOwner viewModelStoreOwner) {
        view.setTag(R.id.ncm, viewModelStoreOwner);
    }
}
