package androidx.lifecycle;

import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class UtilsKt {
    public static final void set(ViewModelStore set, String key, ViewModel viewModel) {
        o.LJIIIZ(set, "$this$set");
        o.LJIIIZ(key, "key");
        set.put(key, viewModel);
    }
}
