package X;

import android.app.Application;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

/* renamed from: X.1us, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48221us extends ViewModelProvider.AndroidViewModelFactory {
    public final ViewModelProvider.AndroidViewModelFactory LIZ;
    public final java.util.Map<String, C4G1<InterfaceC06740Og<? extends ViewModel>>> LIZIZ;

    @Override // androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory, androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> cls) {
        C4G1<InterfaceC06740Og<? extends ViewModel>> c4g1 = this.LIZIZ.get(cls.getName());
        if (c4g1 == null) {
            return (T) this.LIZ.create(cls);
        }
        return (T) c4g1.get().create();
    }

    public C48221us(Application application, ViewModelProvider.AndroidViewModelFactory androidViewModelFactory, C65574PoQ c65574PoQ) {
        super(application);
        this.LIZ = androidViewModelFactory;
        this.LIZIZ = c65574PoQ;
    }
}
