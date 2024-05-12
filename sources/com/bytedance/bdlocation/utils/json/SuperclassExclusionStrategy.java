package com.bytedance.bdlocation.utils.json;

import com.google.gson.a;
import com.google.gson.b;
import java.lang.reflect.Field;

/* loaded from: classes12.dex */
public class SuperclassExclusionStrategy implements a {
    @Override // com.google.gson.a
    public boolean shouldSkipClass(Class<?> cls) {
        return false;
    }

    @Override // com.google.gson.a
    public boolean shouldSkipField(b bVar) {
        return isFieldInSuperclass(bVar.LIZ.getDeclaringClass(), bVar.LIZ.getName());
    }

    private Field getField(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean isFieldInSuperclass(Class<?> cls, String str) {
        for (Class<? super Object> superclass = cls.getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
            if (getField(superclass, str) != null) {
                return true;
            }
        }
        return false;
    }
}
