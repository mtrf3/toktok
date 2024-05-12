package X;

import android.os.IBinder;
import java.lang.reflect.Field;

/* renamed from: X.Qov, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class BinderC68153Qov<T> extends AbstractBinderC68227Qq7 {
    public final T LJLIL;

    public BinderC68153Qov(T t) {
        this.LJLIL = t;
    }

    public static <T> T LLJJIII(InterfaceC68163Qp5 interfaceC68163Qp5) {
        if (interfaceC68163Qp5 instanceof BinderC68153Qov) {
            return ((BinderC68153Qov) interfaceC68163Qp5).LJLIL;
        }
        IBinder asBinder = interfaceC68163Qp5.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            QH7.LJIIIIZZ(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return (T) field.get(asBinder);
                } catch (IllegalAccessException e) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
                } catch (NullPointerException e2) {
                    throw new IllegalArgumentException("Binder object is null.", e2);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        int length = declaredFields.length;
        StringBuilder sb = new StringBuilder(64);
        sb.append("Unexpected number of IObjectWrapper declared fields: ");
        sb.append(length);
        throw new IllegalArgumentException(sb.toString());
    }
}
