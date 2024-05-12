package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.o;

/* renamed from: X.KOo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51642KOo implements ViewModelProvider.Factory {
    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        if (AssemViewModel.class.isAssignableFrom(modelClass)) {
            try {
                T newInstance = modelClass.newInstance();
                o.LJIIIIZZ(newInstance, "{\n                modelC…wInstance()\n            }");
                return newInstance;
            } catch (IllegalAccessException e) {
                throw new RuntimeException(C09K.LIZIZ("Cannot create an instance of ", modelClass), e);
            } catch (InstantiationException e2) {
                throw new RuntimeException(C09K.LIZIZ("Cannot create an instance of ", modelClass), e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException(C09K.LIZIZ("Cannot create an instance of ", modelClass), e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException(C09K.LIZIZ("Cannot create an instance of ", modelClass), e4);
            }
        }
        throw new IllegalArgumentException("Custom ViewModel must be a subclass of LifeAwareViewModel.");
    }
}
