package androidx.lifecycle;

import X.C09K;
import X.C16880lQ;
import X.C47261Igj;
import X.ORY;
import X.X1D;
import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class SavedStateViewModelFactoryKt {
    public static final List<Class<?>> ANDROID_VIEWMODEL_SIGNATURE = C47261Igj.LJJIJIIJI(Application.class, SavedStateHandle.class);
    public static final List<Class<?>> VIEWMODEL_SIGNATURE = C47261Igj.LJJIJ(SavedStateHandle.class);

    public static final <T> Constructor<T> findMatchingConstructor(Class<T> modelClass, List<? extends Class<?>> signature) {
        o.LJIIIZ(modelClass, "modelClass");
        o.LJIIIZ(signature, "signature");
        Object[] constructors = modelClass.getConstructors();
        o.LJIIIIZZ(constructors, "modelClass.constructors");
        for (Object obj : constructors) {
            Constructor<T> constructor = (Constructor<T>) obj;
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            o.LJIIIIZZ(parameterTypes, "constructor.parameterTypes");
            List LJJZZIII = ORY.LJJZZIII(parameterTypes);
            if (o.LJ(signature, LJJZZIII)) {
                return constructor;
            }
            if (signature.size() == LJJZZIII.size() && LJJZZIII.containsAll(signature)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Class ");
                LIZ.append(C16880lQ.LJLLJ(modelClass));
                LIZ.append(" must have parameters in the proper order: ");
                LIZ.append(signature);
                throw new UnsupportedOperationException(X1D.LIZIZ(LIZ));
            }
        }
        return null;
    }

    public static final <T extends ViewModel> T newInstance(Class<T> modelClass, Constructor<T> constructor, Object... params) {
        o.LJIIIZ(modelClass, "modelClass");
        o.LJIIIZ(constructor, "constructor");
        o.LJIIIZ(params, "params");
        try {
            return constructor.newInstance(Arrays.copyOf(params, params.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(C09K.LIZIZ("Failed to access ", modelClass), e);
        } catch (InstantiationException e2) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("A ");
            LIZ.append(modelClass);
            LIZ.append(" cannot be instantiated.");
            throw new RuntimeException(X1D.LIZIZ(LIZ), e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(C09K.LIZIZ("An exception happened in constructor of ", modelClass), e3.getCause());
        }
    }
}
