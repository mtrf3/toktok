package com.bytedance.android.live_settings;

import X.C132805Jc;
import X.X1D;
import com.bytedance.android.live_settings.repo.OtherRepo;
import com.bytedance.android.live_settings.repo.SettingsRepo;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.p;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public class SaveSettingsValue {
    public static long getLatestSettingsSavedTime() {
        return OtherRepo.INSTANCE.getLongValue("settings_saved_time", 0L);
    }

    public static void realSave(m mVar, ArrayList<LiveSettingModel> arrayList) {
        Iterator<LiveSettingModel> it = arrayList.iterator();
        while (it.hasNext()) {
            LiveSettingModel next = it.next();
            PreciseExposureManager preciseExposureManager = PreciseExposureManager.INSTANCE;
            if (preciseExposureManager.isPreciseExposure(next)) {
                preciseExposureManager.saveValue(mVar, next);
            } else {
                String fieldTypeName = next.getFieldTypeName();
                fieldTypeName.getClass();
                switch (fieldTypeName.hashCode()) {
                    case -1325958191:
                        if (!fieldTypeName.equals("double")) {
                            break;
                        } else {
                            saveDoubleValue(mVar, next.getSettingsKey());
                            break;
                        }
                    case 104431:
                        if (!fieldTypeName.equals("int")) {
                            break;
                        } else {
                            saveIntValue(mVar, next.getSettingsKey());
                            break;
                        }
                    case 3327612:
                        if (!fieldTypeName.equals("long")) {
                            break;
                        } else {
                            saveLongValue(mVar, next.getSettingsKey());
                            break;
                        }
                    case 64711720:
                        if (!fieldTypeName.equals("boolean")) {
                            break;
                        } else {
                            saveBooleanValue(mVar, next.getSettingsKey());
                            break;
                        }
                    case 97526364:
                        if (!fieldTypeName.equals("float")) {
                            break;
                        } else {
                            saveFloatValue(mVar, next.getSettingsKey());
                            break;
                        }
                    case 1195259493:
                        if (!fieldTypeName.equals("java.lang.String")) {
                            break;
                        } else {
                            saveStringValue(mVar, next.getSettingsKey());
                            break;
                        }
                    case 1888107655:
                        if (!fieldTypeName.equals("java.lang.String[]")) {
                            break;
                        } else {
                            saveStringArrayValue(mVar, next.getSettingsKey());
                            break;
                        }
                }
                saveCustomTypeValue(mVar, next.getSettingsKey());
            }
        }
    }

    public static void save(m mVar, ArrayList<LiveSettingModel> arrayList) {
        realSave(mVar, arrayList);
        OtherRepo.INSTANCE.storeLongValue("settings_saved_time", System.currentTimeMillis());
        PreciseExposureManager.INSTANCE.tryExposeLastExposedVids();
    }

    public static void saveBooleanValue(m mVar, String str) {
        boolean z;
        try {
            p LJJIJL = mVar.LJJIJL(str);
            if (LJJIJL != null) {
                if (LJJIJL.LJLIL instanceof Number) {
                    SettingsRepo settingsRepo = SettingsRepo.INSTANCE;
                    if (LJJIJL.LJIILJJIL() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    settingsRepo.storeBooleanValue(str, z);
                } else {
                    SettingsRepo.INSTANCE.storeBooleanValue(str, LJJIJL.LJFF());
                }
            } else {
                SettingsRepo.INSTANCE.erase(str);
            }
        } catch (Throwable th) {
            Monitor monitor = SettingsManager.INSTANCE.getMonitor();
            StringBuilder LIZ = X1D.LIZ();
            C132805Jc.LJ(LIZ, "exception: ", th, ", key: ", str);
            monitor.reportException("SaveSettingsValue#saveBooleanValue", X1D.LIZIZ(LIZ));
        }
    }

    public static void saveCustomTypeValue(m mVar, String str) {
        try {
            j LJJIJ = mVar.LJJIJ(str);
            if (LJJIJ != null) {
                SettingsRepo.INSTANCE.storeStringValue(str, LJJIJ.toString());
            } else if (mVar.LJJIJLIJ(str)) {
                SettingsRepo.INSTANCE.storeStringValue(str, null);
            } else {
                SettingsRepo.INSTANCE.erase(str);
            }
        } catch (Throwable th) {
            Monitor monitor = SettingsManager.INSTANCE.getMonitor();
            StringBuilder LIZ = X1D.LIZ();
            C132805Jc.LJ(LIZ, "exception: ", th, ", key: ", str);
            monitor.reportException("SaveSettingsValue#saveCustomTypeValue", X1D.LIZIZ(LIZ));
        }
    }

    public static void saveDoubleValue(m mVar, String str) {
        try {
            j LJJIJ = mVar.LJJIJ(str);
            if (LJJIJ != null) {
                SettingsRepo.INSTANCE.storeDoubleValue(str, LJJIJ.LJIIIZ());
            } else {
                SettingsRepo.INSTANCE.erase(str);
            }
        } catch (Throwable th) {
            Monitor monitor = SettingsManager.INSTANCE.getMonitor();
            StringBuilder LIZ = X1D.LIZ();
            C132805Jc.LJ(LIZ, "exception: ", th, ", key: ", str);
            monitor.reportException("SaveSettingsValue#saveDoubleValue", X1D.LIZIZ(LIZ));
        }
    }

    public static void saveFloatValue(m mVar, String str) {
        try {
            j LJJIJ = mVar.LJJIJ(str);
            if (LJJIJ != null) {
                SettingsRepo.INSTANCE.storeFloatValue(str, LJJIJ.LJIIJ());
            } else {
                SettingsRepo.INSTANCE.erase(str);
            }
        } catch (Throwable th) {
            Monitor monitor = SettingsManager.INSTANCE.getMonitor();
            StringBuilder LIZ = X1D.LIZ();
            C132805Jc.LJ(LIZ, "exception: ", th, ", key: ", str);
            monitor.reportException("SaveSettingsValue#saveFloatValue", X1D.LIZIZ(LIZ));
        }
    }

    public static void saveIntValue(m mVar, String str) {
        int i;
        try {
            p LJJIJL = mVar.LJJIJL(str);
            if (LJJIJL != null) {
                if (LJJIJL.LJLIL instanceof Boolean) {
                    SettingsRepo settingsRepo = SettingsRepo.INSTANCE;
                    if (LJJIJL.LJFF()) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    settingsRepo.storeIntValue(str, i);
                } else {
                    SettingsRepo.INSTANCE.storeIntValue(str, LJJIJL.LJIILJJIL());
                }
            } else {
                SettingsRepo.INSTANCE.erase(str);
            }
        } catch (Throwable th) {
            Monitor monitor = SettingsManager.INSTANCE.getMonitor();
            StringBuilder LIZ = X1D.LIZ();
            C132805Jc.LJ(LIZ, "exception: ", th, ", key: ", str);
            monitor.reportException("SaveSettingsValue#saveIntValue", X1D.LIZIZ(LIZ));
        }
    }

    public static void saveLongValue(m mVar, String str) {
        try {
            j LJJIJ = mVar.LJJIJ(str);
            if (LJJIJ != null) {
                SettingsRepo.INSTANCE.storeLongValue(str, LJJIJ.LJIJJLI());
            } else {
                SettingsRepo.INSTANCE.erase(str);
            }
        } catch (Throwable th) {
            Monitor monitor = SettingsManager.INSTANCE.getMonitor();
            StringBuilder LIZ = X1D.LIZ();
            C132805Jc.LJ(LIZ, "exception: ", th, ", key: ", str);
            monitor.reportException("SaveSettingsValue#saveLongValue", X1D.LIZIZ(LIZ));
        }
    }

    public static void saveStringArrayValue(m mVar, String str) {
        try {
            j LJJIJ = mVar.LJJIJ(str);
            if (LJJIJ != null) {
                SettingsRepo settingsRepo = SettingsRepo.INSTANCE;
                settingsRepo.storeStringArrayValue(str, (String[]) settingsRepo.getGson().LIZJ(LJJIJ, String[].class));
            } else if (mVar.LJJIJLIJ(str)) {
                SettingsRepo.INSTANCE.storeStringArrayValue(str, null);
            } else {
                SettingsRepo.INSTANCE.erase(str);
            }
        } catch (Throwable th) {
            Monitor monitor = SettingsManager.INSTANCE.getMonitor();
            StringBuilder LIZ = X1D.LIZ();
            C132805Jc.LJ(LIZ, "exception: ", th, ", key: ", str);
            monitor.reportException("SaveSettingsValue#saveStringArrayValue", X1D.LIZIZ(LIZ));
        }
    }

    public static void saveStringValue(m mVar, String str) {
        try {
            j LJJIJ = mVar.LJJIJ(str);
            if (LJJIJ != null) {
                if (!(LJJIJ instanceof p)) {
                    SettingsRepo.INSTANCE.storeStringValue(str, LJJIJ.toString());
                } else {
                    SettingsRepo.INSTANCE.storeStringValue(str, LJJIJ.LJJIFFI());
                }
            } else if (mVar.LJJIJLIJ(str)) {
                SettingsRepo.INSTANCE.storeStringValue(str, null);
            } else {
                SettingsRepo.INSTANCE.erase(str);
            }
        } catch (Throwable th) {
            Monitor monitor = SettingsManager.INSTANCE.getMonitor();
            StringBuilder LIZ = X1D.LIZ();
            C132805Jc.LJ(LIZ, "exception: ", th, ", key: ", str);
            monitor.reportException("SaveSettingsValue#saveStringValue", X1D.LIZIZ(LIZ));
        }
    }
}
