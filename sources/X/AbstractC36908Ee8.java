package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.n;
import com.google.gson.s;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: X.Ee8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC36908Ee8 {
    public static final Object sLock = new Object();
    public static final java.util.Map<Class<?>, List<Field>> sRequiredMap = Collections.synchronizedMap(new C1HQ());

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T checkValid() {
        Class<?> cls = getClass();
        initRequiredFieldMap(cls);
        List<Field> list = sRequiredMap.get(cls);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                Field field = (Field) ListProtector.get(list, i);
                if (field.get(this) == null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Unexpected null value in ");
                    LIZ.append(cls.getName());
                    LIZ.append(", required field: ");
                    LIZ.append(field.getName());
                    throw new s(X1D.LIZIZ(LIZ));
                }
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }
        return this;
    }

    public static RuntimeException getCompatibleException(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        if (cause instanceof C38333F2r) {
            return (RuntimeException) cause;
        }
        if (cause instanceof n) {
            return new C37067Egh(cause);
        }
        throw cause;
    }

    public static void initRequiredFieldMap(Class<?> cls) {
        if (sRequiredMap.get(cls) == null) {
            synchronized (sLock) {
                Field[] declaredFields = cls.getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    if (field.getAnnotation(InterfaceC195777mH.class) != null) {
                        field.setAccessible(true);
                        arrayList.add(field);
                    }
                }
                sRequiredMap.put(cls, Collections.unmodifiableList(arrayList));
            }
        }
    }
}
