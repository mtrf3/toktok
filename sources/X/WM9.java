package X;

import androidx.lifecycle.ViewModelStore;

/* loaded from: classes15.dex */
public class WM9 implements V8P {
    public final ViewModelStore LIZ;

    @Override // X.V8P
    public final void onUnRegister() {
        this.LIZ.clear();
    }

    public WM9(ViewModelStore viewModelStore) {
        this.LIZ = viewModelStore;
    }
}
