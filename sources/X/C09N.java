package X;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.loader.app.LoaderManagerImpl;

/* renamed from: X.09N, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C09N {
    public abstract void LIZ(int i);

    public abstract <D> C0ZP<D> LIZJ(int i, Bundle bundle, C09M<D> c09m);

    public static LoaderManagerImpl LIZIZ(LifecycleOwner lifecycleOwner) {
        return new LoaderManagerImpl(lifecycleOwner, ((ViewModelStoreOwner) lifecycleOwner).getViewModelStore());
    }
}
