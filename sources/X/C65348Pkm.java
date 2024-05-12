package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.c;
import com.google.gson.internal.m;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Pkm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65348Pkm {
    public static final c LIZ = c.IDENTITY;

    public static Field[] LIZ(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            arrayList.addAll(new ArrayList(Arrays.asList(cls.getDeclaredFields())));
        }
        Field[] fieldArr = new Field[arrayList.size()];
        arrayList.toArray(fieldArr);
        return fieldArr;
    }

    public static List<String> LIZIZ(Field field) {
        InterfaceC65349Pkn interfaceC65349Pkn = (InterfaceC65349Pkn) field.getAnnotation(InterfaceC65349Pkn.class);
        if (interfaceC65349Pkn == null) {
            return Collections.singletonList(LIZ.translateName(field));
        }
        String value = interfaceC65349Pkn.value();
        String[] alternate = interfaceC65349Pkn.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String str : alternate) {
            arrayList.add(str);
        }
        return arrayList;
    }

    public static boolean LIZJ(Object obj, Field field, Object obj2) {
        if (field.get(obj) instanceof Long) {
            field.setLong(obj, ((Double) obj2).longValue());
            return true;
        }
        if (field.get(obj) instanceof Integer) {
            field.setInt(obj, ((Double) obj2).intValue());
            return true;
        }
        return false;
    }

    public static boolean LIZLLL(Object obj, Field field, Object obj2) {
        if (obj2 instanceof m) {
            field.set(obj, GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), obj2), (Class) field.getType()));
            return true;
        }
        if ((obj2 instanceof List) && Collection.class.isAssignableFrom(field.getType())) {
            Type genericType = field.getGenericType();
            if (genericType == null) {
                return false;
            }
            if (genericType instanceof ParameterizedType) {
                Class cls = (Class) ((ParameterizedType) genericType).getActualTypeArguments()[0];
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : (List) obj2) {
                    if (obj3 instanceof m) {
                        arrayList.add(GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), obj3), cls));
                    } else {
                        arrayList.add(obj3);
                    }
                }
                field.set(obj, arrayList);
                return true;
            }
        }
        field.set(obj, obj2);
        return true;
    }
}
