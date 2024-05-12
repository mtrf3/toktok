package X;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.FxV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40657FxV<T> {
    public final Object LIZ;
    public final Field LIZIZ;
    public final Class<T> LIZJ;

    public C40657FxV(Class cls, Object obj, Field field) {
        this.LIZ = obj;
        this.LIZIZ = field;
        this.LIZJ = cls;
    }

    public final T LIZ() {
        try {
            return this.LIZJ.cast(this.LIZIZ.get(this.LIZ));
        } catch (Exception e) {
            throw new C40655FxT(C16880lQ.LLLZ("Failed to get value of field %s of type %s on object of type %s", new Object[]{this.LIZIZ.getName(), this.LIZ.getClass().getName(), this.LIZJ.getName()}), e);
        }
    }

    public final void LIZIZ(T t) {
        try {
            this.LIZIZ.set(this.LIZ, t);
        } catch (Exception e) {
            throw new C40655FxT(C16880lQ.LLLZ("Failed to set value of field %s of type %s on object of type %s", new Object[]{this.LIZIZ.getName(), this.LIZ.getClass().getName(), this.LIZJ.getName()}), e);
        }
    }

    public final void LIZJ(Collection collection) {
        int length;
        Object[] objArr = (Object[]) LIZ();
        if (objArr == null) {
            length = 0;
        } else {
            length = objArr.length;
        }
        Object[] objArr2 = (Object[]) Array.newInstance(this.LIZIZ.getType().getComponentType(), collection.size() + length);
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArr2[length] = it.next();
            length++;
        }
        LIZIZ(objArr2);
    }

    public final void LIZLLL(Collection collection) {
        int length;
        Object[] objArr = (Object[]) LIZ();
        int i = 0;
        if (objArr == null) {
            length = 0;
        } else {
            length = objArr.length;
        }
        Object[] objArr2 = (Object[]) Array.newInstance(this.LIZIZ.getType().getComponentType(), collection.size() + length);
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, collection.size(), objArr.length);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArr2[i] = it.next();
            i++;
        }
        LIZIZ(objArr2);
    }
}
