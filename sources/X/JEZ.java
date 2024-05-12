package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SharedViewModelProvider;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JEZ {
    public static final /* synthetic */ int LIZ = 0;

    public static final <T extends ViewModel> T LIZ(Lifecycle lifecycle, Class<T> cls) {
        o.LJIIIZ(lifecycle, "lifecycle");
        return (T) new SharedViewModelProvider((ViewModelProvider.Factory) null, 1, (DefaultConstructorMarker) null).get(lifecycle, cls);
    }
}
