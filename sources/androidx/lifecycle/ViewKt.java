package androidx.lifecycle;

import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class ViewKt {
    public static final LifecycleOwner findViewTreeLifecycleOwner(View view) {
        o.LJIIIZ(view, "<this>");
        return ViewTreeLifecycleOwner.get(view);
    }
}
