package X;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.PmN, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65447PmN {
    public final Class<?> LIZ;
    public final ArrayList<Object> LIZIZ = new ArrayList<>();

    public final Object LIZ() {
        ArrayList<Object> arrayList = this.LIZIZ;
        Class<?> cls = this.LIZ;
        if (cls.isPrimitive()) {
            Object newInstance = Array.newInstance(cls, arrayList.size());
            Iterator<Object> it = arrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                Array.set(newInstance, i, it.next());
                i++;
            }
            return newInstance;
        }
        return arrayList.toArray((Object[]) Array.newInstance(cls, arrayList.size()));
    }

    public C65447PmN(Class<?> cls) {
        this.LIZ = cls;
    }
}
