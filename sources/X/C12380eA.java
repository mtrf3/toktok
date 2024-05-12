package X;

import Y.IDComparatorS28S0000000;
import android.os.Build;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.m;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.0eA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12380eA {
    public static String LIZIZ(Field field) {
        InterfaceC65349Pkn interfaceC65349Pkn = (InterfaceC65349Pkn) field.getAnnotation(InterfaceC65349Pkn.class);
        if (interfaceC65349Pkn != null) {
            return interfaceC65349Pkn.value();
        }
        return field.getName();
    }

    public static m LIZ(Object obj, TreeTypeAdapter.a aVar) {
        boolean z;
        m mVar = new m();
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls = obj.getClass(); cls != null && cls != Object.class; cls = cls.getSuperclass()) {
            arrayList.addAll(Arrays.asList(cls.getDeclaredFields()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Field field = (Field) it.next();
            if (field.getAnnotation(O1A.class) != null) {
                z = true;
            } else {
                z = false;
            }
            boolean isTransient = Modifier.isTransient(field.getModifiers());
            if (!z && !isTransient) {
                arrayList2.add(field);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            arrayList2.sort(new IDComparatorS28S0000000(11));
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Field field2 = (Field) it2.next();
            try {
                mVar.LJJII(LIZIZ(field2), TreeTypeAdapter.this.LIZJ.LJIJJLI(field2.get(obj)));
            } catch (IllegalAccessException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return mVar;
    }
}
