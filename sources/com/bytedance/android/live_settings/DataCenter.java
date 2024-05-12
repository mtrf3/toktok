package com.bytedance.android.live_settings;

import X.AnonymousClass028;
import X.C16880lQ;
import X.X1D;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.repo.MockSettingsRepo;
import com.bytedance.android.live_settings.repo.PreciseExposureRepo;
import com.bytedance.android.live_settings.repo.SettingsRepo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class DataCenter {
    public static boolean mIsDebug;

    public static void clear() {
        SettingsValueProvider.INSTANCE.clear();
    }

    public static Map<String, Object> getAllValues() {
        return new HashMap(SettingsRepo.INSTANCE.getAll());
    }

    public static Class getConfigType(Class cls) {
        return getTargetField(cls).getType();
    }

    public static Class getConfigTypeV2(Class cls) {
        Field declaredField = cls.getDeclaredField("DEFAULT");
        declaredField.setAccessible(true);
        return declaredField.getType();
    }

    public static <T> T getDefaultValue(Class cls) {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            if (declaredFields != null) {
                ArrayList arrayList = new ArrayList();
                boolean z = false;
                Field field = null;
                for (Field field2 : declaredFields) {
                    com.bytedance.android.live.annotation.Group group = (com.bytedance.android.live.annotation.Group) field2.getAnnotation(com.bytedance.android.live.annotation.Group.class);
                    if (group != null) {
                        arrayList.add(field2);
                        if (group.isDefault()) {
                            field = field2;
                        }
                    }
                }
                if (field == null && arrayList.size() == 1) {
                    field = (Field) ListProtector.get(arrayList, 0);
                }
                if (field != null) {
                    field.setAccessible(true);
                    if ((field.getModifiers() & 8) == 8) {
                        z = true;
                    }
                    if (z) {
                        return (T) field.get(null);
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            Monitor monitor = SettingsManager.INSTANCE.getMonitor();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("exception: ");
            LIZ.append(th.getMessage());
            LIZ.append(" ,class name: ");
            LIZ.append(C16880lQ.LJLLJ(cls));
            monitor.reportException("DataCenter#getDefaultValue", X1D.LIZIZ(LIZ));
            return null;
        }
    }

    public static <T> T getDefaultValueV2(Class cls) {
        try {
            Field declaredField = cls.getDeclaredField("DEFAULT");
            boolean z = true;
            declaredField.setAccessible(true);
            if ((declaredField.getModifiers() & 8) != 8) {
                z = false;
            }
            if (z) {
                return (T) declaredField.get(null);
            }
        } catch (NoSuchFieldException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        } catch (Throwable unused) {
        }
        return null;
    }

    public static String getKey(Class cls) {
        try {
            SettingsKey settingsKey = (SettingsKey) cls.getAnnotation(SettingsKey.class);
            if (settingsKey != null) {
                return settingsKey.value();
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public static Field getTargetField(Class cls) {
        Field[] declaredFields = cls.getDeclaredFields();
        int length = declaredFields.length;
        Field field = null;
        int i = 0;
        while (true) {
            if (i < length) {
                Field field2 = declaredFields[i];
                com.bytedance.android.live.annotation.Group group = (com.bytedance.android.live.annotation.Group) field2.getAnnotation(com.bytedance.android.live.annotation.Group.class);
                if (group != null) {
                    if (group.isDefault()) {
                        field = field2;
                        break;
                    }
                    field = field2;
                }
                i++;
            } else if (field == null) {
                StringBuilder LIZ = X1D.LIZ();
                throw new RuntimeException(AnonymousClass028.LIZLLL(LIZ, "Can not find @Group in ", cls, LIZ));
            }
        }
        field.setAccessible(true);
        return field;
    }

    public static void init(boolean z) {
        mIsDebug = z;
        SettingsRepo.INSTANCE.load();
        PreciseExposureRepo.Companion.getINATANCE().load();
        if (mIsDebug) {
            MockSettingsRepo.INSTANCE.load();
        }
    }

    public static boolean getBooleanValue(String str, boolean z) {
        if (str == null || str.length() == 0) {
            return z;
        }
        if (mIsDebug) {
            MockSettingsRepo mockSettingsRepo = MockSettingsRepo.INSTANCE;
            if (mockSettingsRepo.contains(str)) {
                return mockSettingsRepo.getBooleanValue(str, z);
            }
        }
        return SettingsValueProvider.INSTANCE.getBooleanValue(str, z);
    }

    public static double getDoubleValue(String str, double d) {
        if (str == null || str.length() == 0) {
            return d;
        }
        if (mIsDebug) {
            MockSettingsRepo mockSettingsRepo = MockSettingsRepo.INSTANCE;
            if (mockSettingsRepo.contains(str)) {
                return mockSettingsRepo.getDoubleValue(str, d);
            }
        }
        return SettingsValueProvider.INSTANCE.getDoubleValue(str, d);
    }

    public static float getFloatValue(String str, float f) {
        if (str == null || str.length() == 0) {
            return f;
        }
        if (mIsDebug) {
            MockSettingsRepo mockSettingsRepo = MockSettingsRepo.INSTANCE;
            if (mockSettingsRepo.contains(str)) {
                return mockSettingsRepo.getFloatValue(str, f);
            }
        }
        return SettingsValueProvider.INSTANCE.getFloatValue(str, f);
    }

    public static int getIntValue(String str, int i) {
        if (str == null || str.length() == 0) {
            return i;
        }
        if (mIsDebug) {
            MockSettingsRepo mockSettingsRepo = MockSettingsRepo.INSTANCE;
            if (mockSettingsRepo.contains(str)) {
                return mockSettingsRepo.getIntValue(str, i);
            }
        }
        return SettingsValueProvider.INSTANCE.getIntValue(str, i);
    }

    public static long getLongValue(String str, long j) {
        if (str == null || str.length() == 0) {
            return j;
        }
        if (mIsDebug) {
            MockSettingsRepo mockSettingsRepo = MockSettingsRepo.INSTANCE;
            if (mockSettingsRepo.contains(str)) {
                return mockSettingsRepo.getLongValue(str, j);
            }
        }
        return SettingsValueProvider.INSTANCE.getLongValue(str, j);
    }

    public static String[] getStringArrayValue(String str, String[] strArr) {
        if (str == null || str.length() == 0) {
            return strArr;
        }
        if (mIsDebug) {
            MockSettingsRepo mockSettingsRepo = MockSettingsRepo.INSTANCE;
            if (mockSettingsRepo.contains(str)) {
                return mockSettingsRepo.getStringArrayValue(str, strArr);
            }
        }
        return SettingsValueProvider.INSTANCE.getStringArrayValue(str, strArr);
    }

    public static String getStringValue(String str, String str2) {
        if (str == null || str.length() == 0) {
            return str2;
        }
        if (mIsDebug) {
            MockSettingsRepo mockSettingsRepo = MockSettingsRepo.INSTANCE;
            if (mockSettingsRepo.contains(str)) {
                return mockSettingsRepo.getStringValue(str, str2);
            }
        }
        return SettingsValueProvider.INSTANCE.getStringValue(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T getValueSafely(String str, Class cls, Object obj) {
        if (str == null || str.length() == 0) {
            return obj;
        }
        if (mIsDebug) {
            MockSettingsRepo mockSettingsRepo = MockSettingsRepo.INSTANCE;
            if (mockSettingsRepo.contains(str)) {
                return (T) mockSettingsRepo.getValue(str, cls);
            }
        }
        T t = (T) SettingsValueProvider.INSTANCE.getValue(str, cls);
        if (t == null) {
            return obj;
        }
        return t;
    }
}
