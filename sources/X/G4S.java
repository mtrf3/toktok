package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStore;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G4S extends AbstractC65781Prl implements InterfaceC65784Pro<Field> {
    public static final G4S LJLIL = new G4S();

    public G4S() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Field invoke() {
        Type[] actualTypeArguments;
        AbstractC165596eh.LJLJL.getClass();
        Field[] declaredFields = ViewModelStore.class.getDeclaredFields();
        o.LJIIIIZZ(declaredFields, "ViewModelStore::class.ja…          .declaredFields");
        for (Field field : declaredFields) {
            o.LJIIIIZZ(field, "field");
            if (HashMap.class.isAssignableFrom(field.getType())) {
                Type genericType = field.getGenericType();
                if (!(genericType instanceof ParameterizedType)) {
                    genericType = null;
                }
                ParameterizedType parameterizedType = (ParameterizedType) genericType;
                if (parameterizedType != null && (actualTypeArguments = parameterizedType.getActualTypeArguments()) != null && actualTypeArguments.length != 0 && actualTypeArguments.length == 2) {
                    Type type = actualTypeArguments[0];
                    Type type2 = actualTypeArguments[1];
                    if (o.LJ(type, String.class) && o.LJ(type2, ViewModel.class)) {
                        field.setAccessible(true);
                        return field;
                    }
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
