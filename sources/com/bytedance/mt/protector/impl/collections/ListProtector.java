package com.bytedance.mt.protector.impl.collections;

import X.C65415Plr;
import X.C65855Psx;
import java.util.List;

/* loaded from: classes12.dex */
public class ListProtector extends C65855Psx {
    public static <T> T get(List<T> list, int i) {
        Integer num;
        try {
            return list.get(i);
        } catch (Throwable th) {
            if (C65415Plr.LIZIZ() && list.size() > 0 && (num = (Integer) C65855Psx.tryProtect(th, Integer.class)) != null) {
                return list.get(num.intValue());
            }
            throw th;
        }
    }

    public static <T> T remove(List<T> list, int i) {
        Integer num;
        try {
            return list.remove(i);
        } catch (Throwable th) {
            if (C65415Plr.LIZIZ() && list.size() > 0 && (num = (Integer) C65855Psx.tryProtect(th, Integer.class)) != null) {
                return list.remove(num.intValue());
            }
            throw th;
        }
    }

    public static <T> void add(List<T> list, int i, T t) {
        Integer num;
        try {
            list.add(i, t);
        } catch (Throwable th) {
            if (C65415Plr.LIZIZ() && (num = (Integer) C65855Psx.tryProtect(th, Integer.class)) != null) {
                list.add(num.intValue(), t);
                return;
            }
            throw th;
        }
    }

    public static <T> T set(List<T> list, int i, T t) {
        Integer num;
        try {
            return list.set(i, t);
        } catch (Throwable th) {
            if (C65415Plr.LIZIZ() && list.size() > 0 && (num = (Integer) C65855Psx.tryProtect(th, Integer.class)) != null) {
                return list.set(num.intValue(), t);
            }
            throw th;
        }
    }
}
