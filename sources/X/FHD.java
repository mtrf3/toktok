package X;

import com.bytedance.ies.abmock.ConfigItem;
import com.bytedance.ies.abmock.SaveConfigType$ConfigType;
import com.bytedance.ies.abmock.settings.SettingsKey;
import com.bytedance.ies.ugc.statisticlogger.config.AppLogSendCallbackConfig;
import com.google.gson.j;
import com.google.gson.m;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public final class FHD {
    public static volatile FHD LIZ;
    public static final Float LIZIZ = Float.valueOf(0.74347335f);
    public static final Double LIZJ = Double.valueOf(0.7434733377752801d);
    public static final Integer LIZLLL = 2690237;
    public static final Long LJ = 992354881878L;
    public static final Boolean LJFF = Boolean.FALSE;

    public static FHD LIZLLL() {
        if (LIZ == null) {
            synchronized (FHD.class) {
                if (LIZ == null) {
                    LIZ = new FHD();
                }
            }
        }
        return LIZ;
    }

    public static String LJFF(Class cls) {
        FI7 fi7 = (FI7) cls.getAnnotation(FI7.class);
        if (fi7 != null) {
            return fi7.value();
        }
        PTA pta = (PTA) cls.getAnnotation(PTA.class);
        if (pta != null) {
            return pta.value();
        }
        SettingsKey settingsKey = (SettingsKey) cls.getAnnotation(SettingsKey.class);
        if (settingsKey != null) {
            return settingsKey.value();
        }
        StringBuilder LIZ2 = X1D.LIZ();
        throw new RuntimeException(AnonymousClass028.LIZLLL(LIZ2, "Can not find @ConfigKey or @ABKey or @SettingsKey in ", cls, LIZ2));
    }

    public static Object LJIIJ(String str, boolean z) {
        boolean z2;
        boolean z3;
        try {
            FH1 fh1 = FH1.LJI;
            ConcurrentHashMap<Object, Boolean> concurrentHashMap = FH1.LJ;
            fh1.getClass();
            concurrentHashMap.put(Integer.valueOf(C16880lQ.LLLLIIIILLL().hashCode()), Boolean.TRUE);
            java.util.Map<String, Object> map = C38873FNl.LIZ;
            if (map != null && !((HashMap) map).isEmpty()) {
                z2 = ((HashMap) map).containsKey(str);
            } else {
                z2 = false;
            }
            if (z2) {
                Object obj = ((HashMap) map).get(str);
                FH5 LIZIZ2 = FH5.LIZIZ();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("isClientExpValue, value = ");
                LIZ2.append(obj);
                X1D.LIZIZ(LIZ2);
                LIZIZ2.LJII();
                FH1.LIZIZ();
                return obj;
            }
            FH3 fh3 = FH3.LIZLLL;
            m LIZ3 = fh3.LIZ();
            if (LIZ3 != null) {
                z3 = LIZ3.LJJIJLIJ(str);
            } else {
                z3 = false;
            }
            if (z3) {
                j LIZIZ3 = fh3.LIZIZ(str);
                if (z) {
                    String LJIILL = C78983UzD.LJJL().LJIILL(LIZIZ3);
                    FH5 LIZIZ4 = FH5.LIZIZ();
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("UnregisteredConfigCenterRepo, returnStringForObject = true, value = ");
                    LIZ4.append(LJIILL);
                    X1D.LIZIZ(LIZ4);
                    LIZIZ4.LJII();
                    FH1.LIZIZ();
                    return LJIILL;
                }
                FH5 LIZIZ5 = FH5.LIZIZ();
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("UnregisteredConfigCenterRepo, returnStringForObject = false, value = ");
                LIZ5.append(LIZIZ3);
                X1D.LIZIZ(LIZ5);
                LIZIZ5.LJII();
                FH1.LIZIZ();
                return LIZIZ3;
            }
            java.util.Map<String, ConfigItem> map2 = KUZ.LIZ;
            if (map2 != null) {
                HashMap hashMap = (HashMap) map2;
                if (!hashMap.isEmpty()) {
                    FH5.LIZIZ().LJII();
                    ConfigItem configItem = (ConfigItem) hashMap.get(str);
                    if (configItem != null) {
                        try {
                            switch (FHX.LIZ[configItem.type.ordinal()]) {
                                case 1:
                                    int intValue = LIZLLL.intValue();
                                    Object obj2 = configItem.defaultValue;
                                    if (obj2 != null) {
                                        intValue = ((Integer) obj2).intValue();
                                    }
                                    LIZLLL().getClass();
                                    Integer valueOf = Integer.valueOf(LJ(intValue, 0, str, false));
                                    FH1.LIZIZ();
                                    return valueOf;
                                case 2:
                                    boolean booleanValue = LJFF.booleanValue();
                                    Object obj3 = configItem.defaultValue;
                                    if (obj3 != null) {
                                        booleanValue = ((Boolean) obj3).booleanValue();
                                    }
                                    LIZLLL().getClass();
                                    Boolean valueOf2 = Boolean.valueOf(LIZ(0, str, booleanValue, false));
                                    FH1.LIZIZ();
                                    return valueOf2;
                                case 3:
                                    long longValue = LJ.longValue();
                                    Object obj4 = configItem.defaultValue;
                                    if (obj4 != null) {
                                        longValue = ((Long) obj4).longValue();
                                    }
                                    LIZLLL().getClass();
                                    Long valueOf3 = Long.valueOf(LJI(longValue, str, false));
                                    FH1.LIZIZ();
                                    return valueOf3;
                                case 4:
                                    double doubleValue = LIZJ.doubleValue();
                                    Object obj5 = configItem.defaultValue;
                                    if (obj5 != null) {
                                        doubleValue = ((Double) obj5).doubleValue();
                                    }
                                    LIZLLL().getClass();
                                    Double valueOf4 = Double.valueOf(LIZIZ(str, doubleValue, false));
                                    FH1.LIZIZ();
                                    return valueOf4;
                                case 5:
                                    float floatValue = LIZIZ.floatValue();
                                    Object obj6 = configItem.defaultValue;
                                    if (obj6 != null) {
                                        floatValue = ((Float) obj6).floatValue();
                                    }
                                    LIZLLL().getClass();
                                    Float valueOf5 = Float.valueOf(LIZJ(str, false, floatValue));
                                    FH1.LIZIZ();
                                    return valueOf5;
                                case 6:
                                    FHD LIZLLL2 = LIZLLL();
                                    String str2 = (String) configItem.defaultValue;
                                    LIZLLL2.getClass();
                                    String LJII = LJII(0, str, str2, false);
                                    FH1.LIZIZ();
                                    return LJII;
                                case 7:
                                    LIZLLL().getClass();
                                    Object LJIIIIZZ = LJIIIIZZ(0, str, false);
                                    if (z) {
                                        String LJIILL2 = C78983UzD.LJJL().LJIILL(LJIIIIZZ);
                                        FH1.LIZIZ();
                                        return LJIILL2;
                                    }
                                    FH1.LIZIZ();
                                    return LJIIIIZZ;
                                case 8:
                                    LIZLLL().getClass();
                                    Object LJIIIZ = LJIIIZ(str, false, true, j.class, 0);
                                    if (z) {
                                        String LJIILL3 = C78983UzD.LJJL().LJIILL(LJIIIZ);
                                        FH1.LIZIZ();
                                        return LJIILL3;
                                    }
                                    FH1.LIZIZ();
                                    return LJIIIZ;
                            }
                        } catch (Throwable th) {
                            FH5 LIZIZ6 = FH5.LIZIZ();
                            StringBuilder LIZ6 = X1D.LIZ();
                            LIZ6.append("get registered key failed, e = ");
                            LIZ6.append(th.getMessage());
                            X1D.LIZIZ(LIZ6);
                            LIZIZ6.LJII();
                        }
                    }
                    FH5.LIZIZ().LJII();
                    return null;
                }
            }
            FH5.LIZIZ().LJII();
            FH1.LIZIZ();
            return null;
        } finally {
            FH1.LJI.getClass();
            FH1.LIZIZ();
        }
    }

    public static double LIZIZ(String str, double d, boolean z) {
        FHC LIZIZ2 = FHC.LIZIZ();
        LIZIZ2.getClass();
        if (C77117UOj.LJIJJ(0)) {
            return FHG.LIZLLL.LJFF(str, d);
        }
        Object LIZJ2 = LIZIZ2.LIZJ(str, SaveConfigType$ConfigType.DOUBLE, null);
        if (LIZJ2 != null) {
            return ((Double) LIZJ2).doubleValue();
        }
        Double valueOf = Double.valueOf(LIZIZ2.LJFF(0, str).LJFF(str, d));
        LIZIZ2.LJ(valueOf, str, z, false);
        return valueOf.doubleValue();
    }

    public static float LIZJ(String str, boolean z, float f) {
        FHC LIZIZ2 = FHC.LIZIZ();
        LIZIZ2.getClass();
        if (C77117UOj.LJIJJ(0)) {
            return FHG.LIZLLL.LJ(str, f);
        }
        Object LIZJ2 = LIZIZ2.LIZJ(str, SaveConfigType$ConfigType.FLOAT, null);
        if (LIZJ2 != null) {
            return ((Float) LIZJ2).floatValue();
        }
        Float valueOf = Float.valueOf(LIZIZ2.LJFF(0, str).LJ(str, f));
        LIZIZ2.LJ(valueOf, str, z, false);
        return valueOf.floatValue();
    }

    public static long LJI(long j, String str, boolean z) {
        FHC LIZIZ2 = FHC.LIZIZ();
        LIZIZ2.getClass();
        if (C77117UOj.LJIJJ(0)) {
            return FHG.LIZLLL.LIZJ(str, j);
        }
        Object LIZJ2 = LIZIZ2.LIZJ(str, SaveConfigType$ConfigType.LONG, null);
        if (LIZJ2 != null) {
            return ((Long) LIZJ2).longValue();
        }
        Long valueOf = Long.valueOf(LIZIZ2.LJFF(0, str).LIZJ(str, j));
        LIZIZ2.LJ(valueOf, str, z, false);
        return valueOf.longValue();
    }

    public static Object LJIIIIZZ(int i, String str, boolean z) {
        FHC LIZIZ2 = FHC.LIZIZ();
        LIZIZ2.getClass();
        if (C77117UOj.LJIJJ(i)) {
            return FHG.LIZLLL.LIZLLL(str);
        }
        Object LIZJ2 = LIZIZ2.LIZJ(str, SaveConfigType$ConfigType.STRING_ARRAY, String[].class);
        Object obj = FHC.LJIIIIZZ;
        if (LIZJ2 == obj) {
            if (LIZIZ2.LJI) {
                return null;
            }
            LIZIZ2.LIZLLL(str);
        } else if (LIZJ2 != null) {
            return LIZJ2;
        }
        String[] LIZLLL2 = LIZIZ2.LJFF(i, str).LIZLLL(str);
        if (LIZLLL2 == null && LIZIZ2.LJI) {
            LIZIZ2.LJ(obj, str, z, false);
            return LIZLLL2;
        }
        LIZIZ2.LJ(LIZLLL2, str, z, false);
        return LIZLLL2;
    }

    public static boolean LIZ(int i, String str, boolean z, boolean z2) {
        FHC LIZIZ2 = FHC.LIZIZ();
        LIZIZ2.getClass();
        if (C77117UOj.LJIJJ(i)) {
            return FHG.LIZLLL.LJII(str, z);
        }
        Object LIZJ2 = LIZIZ2.LIZJ(str, SaveConfigType$ConfigType.BOOLEAN, null);
        if (LIZJ2 != null) {
            return ((Boolean) LIZJ2).booleanValue();
        }
        Boolean valueOf = Boolean.valueOf(LIZIZ2.LJFF(i, str).LJII(str, z));
        LIZIZ2.LJ(valueOf, str, z2, false);
        return valueOf.booleanValue();
    }

    public static int LJ(int i, int i2, String str, boolean z) {
        FHC LIZIZ2 = FHC.LIZIZ();
        LIZIZ2.getClass();
        if (C77117UOj.LJIJJ(i2)) {
            return FHG.LIZLLL.LIZ(str, i);
        }
        Object LIZJ2 = LIZIZ2.LIZJ(str, SaveConfigType$ConfigType.INT, null);
        if (LIZJ2 != null) {
            return ((Integer) LIZJ2).intValue();
        }
        Integer valueOf = Integer.valueOf(LIZIZ2.LJFF(i2, str).LIZ(str, i));
        LIZIZ2.LJ(valueOf, str, z, false);
        return valueOf.intValue();
    }

    public static String LJII(int i, String str, String str2, boolean z) {
        FHC LIZIZ2 = FHC.LIZIZ();
        LIZIZ2.getClass();
        if (C77117UOj.LJIJJ(i)) {
            return FHG.LIZLLL.LJI(str, str2);
        }
        Object LIZJ2 = LIZIZ2.LIZJ(str, SaveConfigType$ConfigType.STRING, null);
        if (LIZJ2 != null) {
            return (String) LIZJ2;
        }
        String LJI = LIZIZ2.LJFF(i, str).LJI(str, str2);
        LIZIZ2.LJ(LJI, str, z, false);
        return LJI;
    }

    public static Object LJIIJJI(Class cls, AppLogSendCallbackConfig.Model model, String str, boolean z) {
        try {
            Object LJIIIZ = LJIIIZ(str, z, false, cls, 0);
            if (LJIIIZ == null) {
                FHC.LIZIZ().getClass();
                if (FHE.LIZLLL.LJIIIZ().LJFF(str)) {
                    return model;
                }
            }
            return LJIIIZ;
        } catch (Throwable unused) {
            return model;
        }
    }

    public static Object LJIIIZ(String str, boolean z, boolean z2, Class cls, int i) {
        FHC LIZIZ2 = FHC.LIZIZ();
        LIZIZ2.getClass();
        if (C77117UOj.LJIJJ(i)) {
            return FHG.LIZLLL.LIZIZ(str, cls);
        }
        Object LIZJ2 = LIZIZ2.LIZJ(str, SaveConfigType$ConfigType.OBJECT, cls);
        Object obj = FHC.LJIIIIZZ;
        if (LIZJ2 == obj) {
            if (LIZIZ2.LJI) {
                return null;
            }
            LIZIZ2.LIZLLL(str);
        } else if (LIZJ2 != null) {
            return LIZJ2;
        }
        Object LIZIZ3 = LIZIZ2.LJFF(i, str).LIZIZ(str, cls);
        if (LIZIZ3 == null && LIZIZ2.LJI) {
            LIZIZ2.LJ(obj, str, z, z2);
            return LIZIZ3;
        }
        LIZIZ2.LJ(LIZIZ3, str, z, z2);
        return LIZIZ3;
    }
}
