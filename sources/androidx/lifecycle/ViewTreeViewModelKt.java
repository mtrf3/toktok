package androidx.lifecycle;

import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class ViewTreeViewModelKt {
    public static final ViewModelStoreOwner findViewTreeViewModelStoreOwner(View view) {
        o.LJIIIZ(view, "<this>");
        return ViewTreeViewModelStoreOwner.get(view);
    }
}
