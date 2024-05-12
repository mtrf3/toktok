package com.bytedance.android.live_settings;

import X.C132805Jc;
import X.C76800UCe;
import X.ORZ;
import X.X1D;
import com.bytedance.android.live_settings.repo.PreciseExposureRepo;
import com.bytedance.android.live_settings.repo.SettingsRepo;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.p;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PreciseExposureManager {
    public static final PreciseExposureManager INSTANCE = new PreciseExposureManager();
    public static final ConcurrentHashMap<String, String> keyVidMap = new ConcurrentHashMap<>();
    public static final CopyOnWriteArraySet<String> deletedVids = new CopyOnWriteArraySet<>();
    public static final CopyOnWriteArraySet<String> exposedVids = new CopyOnWriteArraySet<>();
    public static final CopyOnWriteArraySet<String> exposedVidsByUid = new CopyOnWriteArraySet<>();

    public final synchronized void tryExposeLastExposedVids() {
        boolean z;
        exposedVidsByUid.clear();
        exposedVids.clear();
        if (keyVidMap.isEmpty()) {
            for (LiveSettingModel liveSettingModel : SettingsManager.INSTANCE.getModels()) {
                if (liveSettingModel.getPreciseExperiment()) {
                    String tryExposeLastExposedVids$lambda$9$lambda$8 = PreciseExposureRepo.Companion.getINATANCE().getStringValue(liveSettingModel.getSettingsKey(), "");
                    o.LJIIIIZZ(tryExposeLastExposedVids$lambda$9$lambda$8, "tryExposeLastExposedVids$lambda$9$lambda$8");
                    if (tryExposeLastExposedVids$lambda$9$lambda$8.length() > 0) {
                        keyVidMap.put(liveSettingModel.getSettingsKey(), tryExposeLastExposedVids$lambda$9$lambda$8);
                    }
                }
            }
        }
        SettingsDataProvider dataProvider = SettingsManager.INSTANCE.getDataProvider();
        if (dataProvider != null) {
            PreciseExposureRepo inatance = PreciseExposureRepo.Companion.getINATANCE();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("exposed_vids_for_current_user_");
            LIZ.append(dataProvider.getCurrentUid());
            String[] stringArrayValue = inatance.getStringArrayValue(X1D.LIZIZ(LIZ), new String[0]);
            o.LJIIIIZZ(stringArrayValue, "PreciseExposureRepo.INAT…d()}\", arrayOf<String>())");
            for (String str : stringArrayValue) {
                if (keyVidMap.values().contains(str)) {
                    exposedVidsByUid.add(str);
                } else {
                    deletedVids.add(str);
                }
            }
            String[] stringArrayValue2 = PreciseExposureRepo.Companion.getINATANCE().getStringArrayValue("exposed_vids", new String[0]);
            o.LJIIIIZZ(stringArrayValue2, "PreciseExposureRepo.INAT…_VIDS, arrayOf<String>())");
            for (String str2 : stringArrayValue2) {
                if (keyVidMap.values().contains(str2)) {
                    exposedVids.add(str2);
                } else {
                    deletedVids.add(str2);
                }
            }
            CopyOnWriteArraySet<String> copyOnWriteArraySet = deletedVids;
            String LLD = ORZ.LLD(copyOnWriteArraySet, ",", null, null, null, 62);
            if (LLD.length() <= 0 || !(!ujb.o.LJJJJJL(LLD))) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                dataProvider.deleteUselessExposedVids(LLD);
            }
            if (!copyOnWriteArraySet.isEmpty()) {
                CopyOnWriteArraySet<String> copyOnWriteArraySet2 = exposedVidsByUid;
                copyOnWriteArraySet2.removeAll(copyOnWriteArraySet);
                PreciseExposureRepo.Companion companion = PreciseExposureRepo.Companion;
                PreciseExposureRepo inatance2 = companion.getINATANCE();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("exposed_vids_for_current_user_");
                LIZ2.append(dataProvider.getCurrentUid());
                inatance2.storeStringArrayValue(X1D.LIZIZ(LIZ2), (String[]) copyOnWriteArraySet2.toArray(new String[0]));
                CopyOnWriteArraySet<String> copyOnWriteArraySet3 = exposedVids;
                copyOnWriteArraySet3.removeAll(copyOnWriteArraySet);
                companion.getINATANCE().storeStringArrayValue("exposed_vids", (String[]) copyOnWriteArraySet3.toArray(new String[0]));
            }
            String LLD2 = ORZ.LLD(exposedVidsByUid, ",", null, null, null, 62);
            if (LLD2.length() > 0 && (!ujb.o.LJJJJJL(LLD2))) {
                dataProvider.setExposedVidsByUid(LLD2);
            }
            String LLD3 = ORZ.LLD(exposedVids, ",", null, null, null, 62);
            if (LLD3.length() > 0 && (!ujb.o.LJJJJJL(LLD3))) {
                dataProvider.setExposedVids(LLD3);
            }
        }
    }

    private final void deleteUselessVid(String str) {
        PreciseExposureRepo inatance = PreciseExposureRepo.Companion.getINATANCE();
        String it = inatance.getStringValue(str, "");
        o.LJIIIIZZ(it, "it");
        if (it.length() > 0) {
            deletedVids.add(it);
        }
        inatance.erase(str);
    }

    public final boolean isPreciseExposure(LiveSettingModel model) {
        o.LJIIIZ(model, "model");
        return model.getPreciseExperiment();
    }

    public final boolean isRealPreciseExposure$live_settings_release(String settingKey) {
        o.LJIIIZ(settingKey, "settingKey");
        return keyVidMap.containsKey(settingKey);
    }

    private final void saveBooleanValue(m mVar, String str) {
        m mVar2;
        boolean z;
        try {
            j LJJIJ = mVar.LJJIJ(str);
            if ((LJJIJ instanceof m) && (mVar2 = (m) LJJIJ) != null) {
                p LJJIJL = mVar2.LJJIJL("val");
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
                if (C76800UCe.LIZ != null) {
                    return;
                }
            }
            SaveSettingsValue.saveBooleanValue(mVar, str);
        } catch (Throwable th) {
            Monitor monitor = SettingsManager.INSTANCE.getMonitor();
            StringBuilder LIZ = X1D.LIZ();
            C132805Jc.LJ(LIZ, "exception: ", th, ", key: ", str);
            monitor.reportException("PreciseExposureManager#saveBooleanValue", X1D.LIZIZ(LIZ));
        }
    }

    private final void saveCustomTypeValue(m mVar, String str) {
        m mVar2;
        try {
            j LJJIJ = mVar.LJJIJ(str);
            if ((LJJIJ instanceof m) && (mVar2 = (m) LJJIJ) != null) {
                j LJJIJ2 = mVar2.LJJIJ("val");
                if (LJJIJ2 != null) {
                    SettingsRepo.INSTANCE.storeStringValue(str, LJJIJ2.toString());
                } else {
                    SaveSettingsValue.saveCustomTypeValue(mVar, str);
                }
                if (C76800UCe.LIZ != null) {
                    return;
                }
            }
            SaveSettingsValue.saveCustomTypeValue(mVar, str);
        } catch (Throwable th) {
            Monitor monitor = SettingsManager.INSTANCE.getMonitor();
            StringBuilder LIZ = X1D.LIZ();
            C132805Jc.LJ(LIZ, "exception: ", th, ", key: ", str);
            monitor.reportException("PreciseExposureManager#saveCustomTypeValue", X1D.LIZIZ(LIZ));
        }
    }

    private final void saveDoubleValue(m mVar, String str) {
        m mVar2;
        try {
            j LJJIJ = mVar.LJJIJ(str);
            if ((LJJIJ instanceof m) && (mVar2 = (m) LJJIJ) != null) {
                j LJJIJ2 = mVar2.LJJIJ("val");
                if (LJJIJ2 != null) {
                    SettingsRepo.INSTANCE.storeDoubleValue(str, LJJIJ2.LJIIIZ());
                } else {
                    SettingsRepo.INSTANCE.erase(str);
                }
                if (C76800UCe.LIZ != null) {
                    return;
                }
            }
            SaveSettingsValue.saveDoubleValue(mVar, str);
        } catch (Throwable th) {
            Monitor monitor = SettingsManager.INSTANCE.getMonitor();
            StringBuilder LIZ = X1D.LIZ();
            C132805Jc.LJ(LIZ, "exception: ", th, ", key: ", str);
            monitor.reportException("PreciseExposureManager#saveDoubleValue", X1D.LIZIZ(LIZ));
        }
    }

    private final void saveFloatValue(m mVar, String str) {
        m mVar2;
        try {
            j LJJIJ = mVar.LJJIJ(str);
            if ((LJJIJ instanceof m) && (mVar2 = (m) LJJIJ) != null) {
                j LJJIJ2 = mVar2.LJJIJ("val");
                if (LJJIJ2 != null) {
                    SettingsRepo.INSTANCE.storeFloatValue(str, LJJIJ2.LJIIJ());
                } else {
                    SettingsRepo.INSTANCE.erase(str);
                }
                if (C76800UCe.LIZ != null) {
                    return;
                }
            }
            SaveSettingsValue.saveFloatValue(mVar, str);
        } catch (Throwable th) {
            Monitor monitor = SettingsManager.INSTANCE.getMonitor();
            StringBuilder LIZ = X1D.LIZ();
            C132805Jc.LJ(LIZ, "exception: ", th, ", key: ", str);
            monitor.reportException("PreciseExposureManager#saveFloatValue", X1D.LIZIZ(LIZ));
        }
    }

    private final void saveIntValue(m mVar, String str) {
        m mVar2;
        int i;
        try {
            j LJJIJ = mVar.LJJIJ(str);
            if ((LJJIJ instanceof m) && (mVar2 = (m) LJJIJ) != null) {
                p LJJIJL = mVar2.LJJIJL("val");
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
                if (C76800UCe.LIZ != null) {
                    return;
                }
            }
            SaveSettingsValue.saveIntValue(mVar, str);
        } catch (Throwable th) {
            Monitor monitor = SettingsManager.INSTANCE.getMonitor();
            StringBuilder LIZ = X1D.LIZ();
            C132805Jc.LJ(LIZ, "exception: ", th, ", key: ", str);
            monitor.reportException("PreciseExposureManager#saveIntValue", X1D.LIZIZ(LIZ));
        }
    }

    private final void saveKeyVid(m mVar, LiveSettingModel liveSettingModel) {
        m mVar2;
        String LJJIFFI;
        String settingsKey = liveSettingModel.getSettingsKey();
        try {
            j LJJIJ = mVar.LJJIJ(settingsKey);
            if ((LJJIJ instanceof m) && (mVar2 = (m) LJJIJ) != null) {
                p LJJIJL = mVar2.LJJIJL("vid");
                if (LJJIJL != null && (LJJIFFI = LJJIJL.LJJIFFI()) != null) {
                    PreciseExposureRepo.Companion.getINATANCE().storeStringValue(settingsKey, LJJIFFI);
                    keyVidMap.put(settingsKey, LJJIFFI);
                } else {
                    INSTANCE.deleteUselessVid(settingsKey);
                }
                if (C76800UCe.LIZ != null) {
                    return;
                }
            }
            deleteUselessVid(settingsKey);
        } catch (Throwable th) {
            Monitor monitor = SettingsManager.INSTANCE.getMonitor();
            StringBuilder LIZ = X1D.LIZ();
            C132805Jc.LJ(LIZ, "exception: ", th, ", key: ", settingsKey);
            monitor.reportException("PreciseExposureManager#saveKeyVid", X1D.LIZIZ(LIZ));
        }
    }

    private final void saveLongValue(m mVar, String str) {
        m mVar2;
        try {
            j LJJIJ = mVar.LJJIJ(str);
            if ((LJJIJ instanceof m) && (mVar2 = (m) LJJIJ) != null) {
                j LJJIJ2 = mVar2.LJJIJ("val");
                if (LJJIJ2 != null) {
                    SettingsRepo.INSTANCE.storeLongValue(str, LJJIJ2.LJIJJLI());
                } else {
                    SettingsRepo.INSTANCE.erase(str);
                }
                if (C76800UCe.LIZ != null) {
                    return;
                }
            }
            SaveSettingsValue.saveLongValue(mVar, str);
        } catch (Throwable th) {
            Monitor monitor = SettingsManager.INSTANCE.getMonitor();
            StringBuilder LIZ = X1D.LIZ();
            C132805Jc.LJ(LIZ, "exception: ", th, ", key: ", str);
            monitor.reportException("PreciseExposureManager#saveLongValue", X1D.LIZIZ(LIZ));
        }
    }

    private final void saveStringArrayValue(m mVar, String str) {
        m mVar2;
        try {
            j LJJIJ = mVar.LJJIJ(str);
            if ((LJJIJ instanceof m) && (mVar2 = (m) LJJIJ) != null) {
                j LJJIJ2 = mVar2.LJJIJ("val");
                if (LJJIJ2 != null) {
                    SettingsRepo settingsRepo = SettingsRepo.INSTANCE;
                    settingsRepo.storeStringArrayValue(str, (String[]) settingsRepo.getGson().LIZJ(LJJIJ2, String[].class));
                } else {
                    SaveSettingsValue.saveStringArrayValue(mVar, str);
                }
                if (C76800UCe.LIZ != null) {
                    return;
                }
            }
            SaveSettingsValue.saveStringArrayValue(mVar, str);
        } catch (Throwable th) {
            Monitor monitor = SettingsManager.INSTANCE.getMonitor();
            StringBuilder LIZ = X1D.LIZ();
            C132805Jc.LJ(LIZ, "exception: ", th, ", key: ", str);
            monitor.reportException("PreciseExposureManager#saveStringArrayValue", X1D.LIZIZ(LIZ));
        }
    }

    private final void saveStringValue(m mVar, String str) {
        m mVar2;
        try {
            j LJJIJ = mVar.LJJIJ(str);
            if ((LJJIJ instanceof m) && (mVar2 = (m) LJJIJ) != null) {
                j LJJIJ2 = mVar2.LJJIJ("val");
                if (LJJIJ2 != null) {
                    if (!(LJJIJ2 instanceof p)) {
                        SettingsRepo.INSTANCE.storeStringValue(str, LJJIJ2.toString());
                    } else {
                        SettingsRepo.INSTANCE.storeStringValue(str, LJJIJ2.LJJIFFI());
                    }
                } else if (mVar.LJJIJLIJ(str)) {
                    SettingsRepo.INSTANCE.storeStringValue(str, null);
                } else {
                    SettingsRepo.INSTANCE.erase(str);
                }
                if (C76800UCe.LIZ != null) {
                    return;
                }
            }
            SaveSettingsValue.saveStringValue(mVar, str);
        } catch (Throwable th) {
            Monitor monitor = SettingsManager.INSTANCE.getMonitor();
            StringBuilder LIZ = X1D.LIZ();
            C132805Jc.LJ(LIZ, "exception: ", th, ", key: ", str);
            monitor.reportException("PreciseExposureManager#saveStringValue", X1D.LIZIZ(LIZ));
        }
    }

    public final void appendExposedVid(String settingKey, boolean z) {
        SettingsDataProvider dataProvider;
        o.LJIIIZ(settingKey, "settingKey");
        String str = keyVidMap.get(settingKey);
        if (str == null) {
            return;
        }
        if (z) {
            CopyOnWriteArraySet<String> copyOnWriteArraySet = exposedVidsByUid;
            if (copyOnWriteArraySet.add(str) && (dataProvider = SettingsManager.INSTANCE.getDataProvider()) != null) {
                PreciseExposureRepo inatance = PreciseExposureRepo.Companion.getINATANCE();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("exposed_vids_for_current_user_");
                LIZ.append(dataProvider.getCurrentUid());
                inatance.storeStringArrayValue(X1D.LIZIZ(LIZ), (String[]) copyOnWriteArraySet.toArray(new String[0]));
                String LLD = ORZ.LLD(copyOnWriteArraySet, ",", null, null, null, 62);
                if (LLD.length() > 0 && (!ujb.o.LJJJJJL(LLD))) {
                    dataProvider.setExposedVidsByUid(LLD);
                    return;
                }
                return;
            }
            return;
        }
        CopyOnWriteArraySet<String> copyOnWriteArraySet2 = exposedVids;
        if (!copyOnWriteArraySet2.add(str)) {
            return;
        }
        PreciseExposureRepo.Companion.getINATANCE().storeStringArrayValue("exposed_vids", (String[]) copyOnWriteArraySet2.toArray(new String[0]));
        SettingsDataProvider dataProvider2 = SettingsManager.INSTANCE.getDataProvider();
        if (dataProvider2 == null) {
            return;
        }
        String LLD2 = ORZ.LLD(copyOnWriteArraySet2, ",", null, null, null, 62);
        if (LLD2.length() <= 0 || !(!ujb.o.LJJJJJL(LLD2))) {
            return;
        }
        dataProvider2.setExposedVids(LLD2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0015. Please report as an issue. */
    public final void saveValue(m jsonObject, LiveSettingModel model) {
        o.LJIIIZ(jsonObject, "jsonObject");
        o.LJIIIZ(model, "model");
        saveKeyVid(jsonObject, model);
        String fieldTypeName = model.getFieldTypeName();
        switch (fieldTypeName.hashCode()) {
            case -1325958191:
                if (fieldTypeName.equals("double")) {
                    saveDoubleValue(jsonObject, model.getSettingsKey());
                    return;
                }
                saveCustomTypeValue(jsonObject, model.getSettingsKey());
                return;
            case 104431:
                if (fieldTypeName.equals("int")) {
                    saveIntValue(jsonObject, model.getSettingsKey());
                    return;
                }
                saveCustomTypeValue(jsonObject, model.getSettingsKey());
                return;
            case 3327612:
                if (fieldTypeName.equals("long")) {
                    saveLongValue(jsonObject, model.getSettingsKey());
                    return;
                }
                saveCustomTypeValue(jsonObject, model.getSettingsKey());
                return;
            case 64711720:
                if (fieldTypeName.equals("boolean")) {
                    saveBooleanValue(jsonObject, model.getSettingsKey());
                    return;
                }
                saveCustomTypeValue(jsonObject, model.getSettingsKey());
                return;
            case 97526364:
                if (fieldTypeName.equals("float")) {
                    saveFloatValue(jsonObject, model.getSettingsKey());
                    return;
                }
                saveCustomTypeValue(jsonObject, model.getSettingsKey());
                return;
            case 1195259493:
                if (fieldTypeName.equals("java.lang.String")) {
                    saveStringValue(jsonObject, model.getSettingsKey());
                    return;
                }
                saveCustomTypeValue(jsonObject, model.getSettingsKey());
                return;
            case 1888107655:
                if (fieldTypeName.equals("java.lang.String[]")) {
                    saveStringArrayValue(jsonObject, model.getSettingsKey());
                    return;
                }
                saveCustomTypeValue(jsonObject, model.getSettingsKey());
                return;
            default:
                saveCustomTypeValue(jsonObject, model.getSettingsKey());
                return;
        }
    }
}
