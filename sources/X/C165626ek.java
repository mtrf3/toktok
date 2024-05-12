package X;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import com.bytedance.jedi.arch.JediViewModel;

/* renamed from: X.6ek, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C165626ek {
    public final ViewModelProvider LIZ;

    public final <T extends JediViewModel> T LIZ(Class<T> cls) {
        if (C16880lQ.LJLLILLLL(cls) != null) {
            return (T) this.LIZ.get(cls.getName(), cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public C165626ek(ViewModelStore viewModelStore, C72561Sdp c72561Sdp) {
        this.LIZ = new ViewModelProvider(viewModelStore, c72561Sdp);
    }
}
