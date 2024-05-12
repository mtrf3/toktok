package com.bytedance.hmp;

import X.C16880lQ;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes34.dex */
public class EnumUtil {
    public static Object fromValue(Class cls, Object obj) {
        Object[] enumConstants = cls.getEnumConstants();
        int length = enumConstants.length;
        int i = 0;
        while (true) {
            Method method = null;
            if (i >= length) {
                return null;
            }
            Object obj2 = enumConstants[i];
            try {
                method = obj2.getClass().getMethod("getValue", new Class[0]);
            } catch (NoSuchMethodException e) {
                C16880lQ.LLLLIIL(e);
            }
            try {
            } catch (IllegalAccessException e2) {
                C16880lQ.LLLLIIL(e2);
            } catch (InvocationTargetException e3) {
                C16880lQ.LLLLIIL(e3);
            }
            if (!method.invoke(obj2, new Object[0]).equals(obj)) {
                i++;
            } else {
                return obj2;
            }
        }
    }
}
