package X;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: X.PnQ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65512PnQ<T> {
    public final Type LIZ() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        C76917UGr.LIZLLL("%s isn't parameterized", genericSuperclass instanceof ParameterizedType, genericSuperclass);
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }
}
