package com.bytedance.im.core.internal.utils;

import X.C63342OtW;
import X.C65385PlN;
import X.C65403Plf;
import X.C65421Plx;
import X.EnumC65386PlO;
import X.EnumC65420Plw;
import X.InterfaceC65349Pkn;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.u;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public class EnumTypeAdapterFactory implements u {
    @Override // com.google.gson.u
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        EnumC65420Plw enumC65420Plw;
        Object valueOf;
        Class<? super T> rawType = typeToken.getRawType();
        if (!rawType.isEnum()) {
            return null;
        }
        final HashMap hashMap = new HashMap();
        try {
            for (Object obj : rawType.getEnumConstants()) {
                if (obj != null) {
                    InterfaceC65349Pkn interfaceC65349Pkn = (InterfaceC65349Pkn) obj.getClass().getField(obj.toString()).getAnnotation(InterfaceC65349Pkn.class);
                    if (interfaceC65349Pkn != null) {
                        hashMap.put(obj, new C65421Plx(interfaceC65349Pkn.value(), EnumC65420Plw.STRING));
                    } else {
                        Field[] declaredFields = obj.getClass().getDeclaredFields();
                        if (declaredFields != null && declaredFields.length > 0) {
                            for (Field field : declaredFields) {
                                String name = field.getType().getName();
                                for (int i = 0; i < EnumC65420Plw.values().length; i++) {
                                    if (EnumC65420Plw.values()[i].LJLIL.equals(name)) {
                                        field.setAccessible(true);
                                        String name2 = field.getType().getName();
                                        int i2 = 0;
                                        while (true) {
                                            if (i2 < EnumC65420Plw.values().length) {
                                                enumC65420Plw = EnumC65420Plw.values()[i2];
                                                if (enumC65420Plw.LJLIL.equals(name2)) {
                                                    break;
                                                }
                                                i2++;
                                            } else {
                                                enumC65420Plw = null;
                                                break;
                                            }
                                        }
                                        int ordinal = enumC65420Plw.ordinal();
                                        if (ordinal == 0) {
                                            valueOf = Integer.valueOf(field.getInt(obj));
                                        } else if (ordinal != 1) {
                                            if (ordinal != 2) {
                                                if (ordinal != 3) {
                                                    if (ordinal == 4) {
                                                        valueOf = Boolean.valueOf(field.getBoolean(obj));
                                                    }
                                                } else {
                                                    valueOf = Double.valueOf(field.getDouble(obj));
                                                }
                                            } else {
                                                valueOf = Long.valueOf(field.getLong(obj));
                                            }
                                        } else {
                                            valueOf = field.get(obj);
                                        }
                                        if (valueOf != null) {
                                            hashMap.put(obj, new C65421Plx(valueOf, enumC65420Plw));
                                        }
                                    }
                                }
                            }
                        }
                        hashMap.put(obj, new C65421Plx(obj.toString(), EnumC65420Plw.STRING));
                    }
                }
            }
        } catch (Throwable th) {
            C63342OtW c63342OtW = C63342OtW.LIZIZ;
            if (c63342OtW == null) {
                c63342OtW = C63342OtW.LIZ;
            }
            c63342OtW.LIZ(th);
        }
        return new TypeAdapter<T>() { // from class: com.bytedance.im.core.internal.utils.EnumTypeAdapterFactory.1
            @Override // com.google.gson.TypeAdapter
            public final T read(C65385PlN c65385PlN) {
                if (c65385PlN.LJJIJIL() == EnumC65386PlO.NULL) {
                    c65385PlN.LJJIIJ();
                    return null;
                }
                String LJJIIZI = c65385PlN.LJJIIZI();
                for (Map.Entry entry : hashMap.entrySet()) {
                    if (entry.getValue() != null && ((C65421Plx) entry.getValue()).LIZ != null && ((C65421Plx) entry.getValue()).LIZ.toString().equals(LJJIIZI)) {
                        return (T) entry.getKey();
                    }
                }
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C65403Plf c65403Plf, T t) {
                if (t == null) {
                    c65403Plf.LJIIJJI();
                    return;
                }
                C65421Plx c65421Plx = (C65421Plx) hashMap.get(t);
                if (c65421Plx == null) {
                    return;
                }
                int ordinal2 = c65421Plx.LIZIZ.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                if (ordinal2 != 4) {
                                    return;
                                }
                                c65403Plf.LJIJI((Boolean) c65421Plx.LIZ);
                                return;
                            }
                            c65403Plf.LJIILL(((Double) c65421Plx.LIZ).doubleValue());
                            return;
                        }
                        c65403Plf.LJIJ(((Long) c65421Plx.LIZ).longValue());
                        return;
                    }
                    c65403Plf.LJJ((String) c65421Plx.LIZ);
                    return;
                }
                c65403Plf.LJIJ(((Integer) c65421Plx.LIZ).intValue());
            }
        };
    }
}
