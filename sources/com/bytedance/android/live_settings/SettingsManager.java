package com.bytedance.android.live_settings;

import X.C221108m2;
import X.C5H3;
import X.InterfaceC88472Yns;
import X.X1D;
import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live_settings.repo.MockSettingsRepo;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class SettingsManager {
    public static ExecutorService backgroundExecutor;
    public static SettingsDataProvider dataProvider;
    public static boolean isLocalTest;
    public static volatile m updateJsonObject;
    public static final SettingsManager INSTANCE = new SettingsManager();
    public static final String[] STRING_ARRAY_DEFAULT = new String[0];
    public static Monitor monitor = new MonitorImpl(false);
    public static final List<LiveSettingModel> models = new ArrayList();
    public static final ConcurrentHashMap<String, LiveSettingModel> modelMap = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Object> mCacheValues = new ConcurrentHashMap<>();
    public static final C5H3 mCacheValueTypes$delegate = C221108m2.LIZIZ(SettingsManager$mCacheValueTypes$2.INSTANCE);
    public static AtomicBoolean hasInit = new AtomicBoolean(false);
    public static AtomicBoolean hasLoadAllSetting = new AtomicBoolean(false);
    public static volatile Map<String, Object> mAllValues = new HashMap();
    public static volatile int customTypeOptFlag = LiveLayoutPreloadThreadPriority.DEFAULT;
    public static int CUSTOM_TYPE_OPT_FLAG_V2 = 2;

    public final synchronized void loadAllSetting() {
        HashMap<String, LiveSettingModel> liveSettingMap;
        if (hasInit.get() && dataProvider != null && !hasLoadAllSetting.get()) {
            SettingsDataProvider settingsDataProvider = dataProvider;
            if (settingsDataProvider != null && (liveSettingMap = settingsDataProvider.getLiveSettingMap()) != null) {
                List<LiveSettingModel> list = models;
                list.clear();
                ConcurrentHashMap<String, LiveSettingModel> concurrentHashMap = modelMap;
                concurrentHashMap.clear();
                Collection<LiveSettingModel> values = liveSettingMap.values();
                o.LJIIIIZZ(values, "it.values");
                list.addAll(values);
                concurrentHashMap.putAll(liveSettingMap);
            }
            hasLoadAllSetting.compareAndSet(false, true);
        }
    }

    private final List<String> getMCacheValueTypes() {
        return (List) mCacheValueTypes$delegate.getValue();
    }

    public final boolean enableCustomTypeOpt() {
        if (customTypeOptFlag == Integer.MIN_VALUE) {
            customTypeOptFlag = DataCenter.getIntValue("setting_manager_custom_type_opt", 0);
        }
        if (customTypeOptFlag != CUSTOM_TYPE_OPT_FLAG_V2) {
            return false;
        }
        return true;
    }

    public final long getLatestSettingsSavedTime() {
        return SaveSettingsValue.getLatestSettingsSavedTime();
    }

    public final List<LiveSettingModel> getModels() {
        loadAllSetting();
        return models;
    }

    public final SettingsDataProvider getDataProvider() {
        return dataProvider;
    }

    public final Monitor getMonitor() {
        return monitor;
    }

    private final void appendExposedVidIfNecessary(final LiveSettingModel liveSettingModel) {
        boolean z;
        ExecutorService executorService = backgroundExecutor;
        if (executorService == null) {
            PreciseExposureManager preciseExposureManager = PreciseExposureManager.INSTANCE;
            String settingsKey = liveSettingModel.getSettingsKey();
            if (liveSettingModel.getCacheLevel() != CacheLevel.DID) {
                z = true;
            } else {
                z = false;
            }
            preciseExposureManager.appendExposedVid(settingsKey, z);
            return;
        }
        executorService.submit(new Runnable() { // from class: com.bytedance.android.live_settings.SettingsManager$appendExposedVidIfNecessary$1
            @Override // java.lang.Runnable
            public final void run() {
                com_bytedance_android_live_settings_SettingsManager$appendExposedVidIfNecessary$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public final void com_bytedance_android_live_settings_SettingsManager$appendExposedVidIfNecessary$1__run$___twin___() {
                boolean z2;
                PreciseExposureManager preciseExposureManager2 = PreciseExposureManager.INSTANCE;
                String settingsKey2 = LiveSettingModel.this.getSettingsKey();
                if (LiveSettingModel.this.getCacheLevel() != CacheLevel.DID) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                preciseExposureManager2.appendExposedVid(settingsKey2, z2);
            }

            public static void com_bytedance_android_live_settings_SettingsManager$appendExposedVidIfNecessary$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(SettingsManager$appendExposedVidIfNecessary$1 settingsManager$appendExposedVidIfNecessary$1) {
                boolean LIZ;
                try {
                    settingsManager$appendExposedVidIfNecessary$1.com_bytedance_android_live_settings_SettingsManager$appendExposedVidIfNecessary$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public static final boolean getBooleanValueInternal$getValue(Class<?> cls) {
        boolean booleanValue;
        String key = DataCenter.getKey(cls);
        Boolean bool = (Boolean) DataCenter.getDefaultValue(cls);
        if (bool == null) {
            booleanValue = false;
        } else {
            booleanValue = bool.booleanValue();
        }
        return DataCenter.getBooleanValue(key, booleanValue);
    }

    public static final double getDoubleValueInternal$getValue$8(Class<?> cls) {
        double doubleValue;
        String key = DataCenter.getKey(cls);
        Double d = (Double) DataCenter.getDefaultValue(cls);
        if (d == null) {
            doubleValue = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        } else {
            doubleValue = d.doubleValue();
        }
        return DataCenter.getDoubleValue(key, doubleValue);
    }

    public static final float getFloatValueInternal$getValue$6(Class<?> cls) {
        float floatValue;
        String key = DataCenter.getKey(cls);
        Float f = (Float) DataCenter.getDefaultValue(cls);
        if (f == null) {
            floatValue = 0.0f;
        } else {
            floatValue = f.floatValue();
        }
        return DataCenter.getFloatValue(key, floatValue);
    }

    public static final int getIntValueInternal$getValue$2(Class<?> cls) {
        int intValue;
        String key = DataCenter.getKey(cls);
        Integer num = (Integer) DataCenter.getDefaultValue(cls);
        if (num == null) {
            intValue = 0;
        } else {
            intValue = num.intValue();
        }
        return DataCenter.getIntValue(key, intValue);
    }

    public static final long getLongValueInternal$getValue$4(Class<?> cls) {
        long longValue;
        String key = DataCenter.getKey(cls);
        Long l = (Long) DataCenter.getDefaultValue(cls);
        if (l == null) {
            longValue = 0;
        } else {
            longValue = l.longValue();
        }
        return DataCenter.getLongValue(key, longValue);
    }

    public static final String getStringValueInternal$getValue$10(Class<?> cls) {
        String stringValue = DataCenter.getStringValue(DataCenter.getKey(cls), null);
        if (stringValue == null) {
            return (String) DataCenter.getDefaultValue(cls);
        }
        return stringValue;
    }

    public final void forceEnableCustomTypeOpt(boolean z) {
        if (z) {
            customTypeOptFlag = CUSTOM_TYPE_OPT_FLAG_V2;
        } else {
            customTypeOptFlag = 0;
        }
    }

    public final boolean getBooleanValue(Class<?> clazz) {
        o.LJIIIZ(clazz, "clazz");
        if (enableCustomTypeOpt()) {
            return ((Boolean) getBasicValueAndReport(new SettingsManager$getBooleanValue$1(this), clazz)).booleanValue();
        }
        Boolean bool = (Boolean) getValueAndReport(new SettingsManager$getBooleanValue$2(this), clazz);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean getBooleanValueInternal(Class<?> cls) {
        boolean z;
        LiveSettingModel liveSettingModel = modelMap.get(cls.getName());
        if (liveSettingModel != null) {
            try {
                String settingsKey = liveSettingModel.getSettingsKey();
                j defaultValue = liveSettingModel.getDefaultValue();
                if (defaultValue != null) {
                    z = defaultValue.LJFF();
                } else {
                    z = false;
                }
                return DataCenter.getBooleanValue(settingsKey, z);
            } catch (Exception e) {
                if (!isLocalTest) {
                    return getBooleanValueInternal$getValue(cls);
                }
                throw e;
            }
        }
        return getBooleanValueInternal$getValue(cls);
    }

    public final boolean getBooleanValueInternalV2(Class<?> cls) {
        LiveSettingModel liveSettingModel = modelMap.get(cls.getName());
        if (liveSettingModel == null) {
            Boolean bool = (Boolean) DataCenter.getDefaultValueV2(cls);
            if (bool == null) {
                bool = Boolean.FALSE;
            }
            return DataCenter.getBooleanValue(DataCenter.getKey(cls), bool.booleanValue());
        }
        return DataCenter.getBooleanValue(liveSettingModel.getSettingsKey(), liveSettingModel.getDefaultBoolean());
    }

    public final double getDoubleValue(Class<?> clazz) {
        o.LJIIIZ(clazz, "clazz");
        if (enableCustomTypeOpt()) {
            return ((Number) getBasicValueAndReport(new SettingsManager$getDoubleValue$1(this), clazz)).doubleValue();
        }
        Double d = (Double) getValueAndReport(new SettingsManager$getDoubleValue$2(this), clazz);
        if (d != null) {
            return d.doubleValue();
        }
        return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
    }

    public final double getDoubleValueInternal(Class<?> cls) {
        double d;
        LiveSettingModel liveSettingModel = modelMap.get(cls.getName());
        if (liveSettingModel != null) {
            try {
                String settingsKey = liveSettingModel.getSettingsKey();
                j defaultValue = liveSettingModel.getDefaultValue();
                if (defaultValue != null) {
                    d = defaultValue.LJIIIZ();
                } else {
                    d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                }
                return DataCenter.getDoubleValue(settingsKey, d);
            } catch (Exception e) {
                if (!isLocalTest) {
                    return getDoubleValueInternal$getValue$8(cls);
                }
                throw e;
            }
        }
        return getDoubleValueInternal$getValue$8(cls);
    }

    public final double getDoubleValueInternalV2(Class<?> cls) {
        LiveSettingModel liveSettingModel = modelMap.get(cls.getName());
        if (liveSettingModel == null) {
            Double d = (Double) DataCenter.getDefaultValueV2(cls);
            if (d == null) {
                d = Double.valueOf(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
            }
            return DataCenter.getDoubleValue(DataCenter.getKey(cls), d.doubleValue());
        }
        return DataCenter.getDoubleValue(liveSettingModel.getSettingsKey(), liveSettingModel.getDefaultDouble());
    }

    public final float getFloatValue(Class<?> clazz) {
        o.LJIIIZ(clazz, "clazz");
        if (enableCustomTypeOpt()) {
            return ((Number) getBasicValueAndReport(new SettingsManager$getFloatValue$1(this), clazz)).floatValue();
        }
        Float f = (Float) getValueAndReport(new SettingsManager$getFloatValue$2(this), clazz);
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public final float getFloatValueInternal(Class<?> cls) {
        float f;
        LiveSettingModel liveSettingModel = modelMap.get(cls.getName());
        if (liveSettingModel != null) {
            try {
                String settingsKey = liveSettingModel.getSettingsKey();
                j defaultValue = liveSettingModel.getDefaultValue();
                if (defaultValue != null) {
                    f = defaultValue.LJIIJ();
                } else {
                    f = 0.0f;
                }
                return DataCenter.getFloatValue(settingsKey, f);
            } catch (Exception e) {
                if (!isLocalTest) {
                    return getFloatValueInternal$getValue$6(cls);
                }
                throw e;
            }
        }
        return getFloatValueInternal$getValue$6(cls);
    }

    public final float getFloatValueInternalV2(Class<?> cls) {
        LiveSettingModel liveSettingModel = modelMap.get(cls.getName());
        if (liveSettingModel == null) {
            Float f = (Float) DataCenter.getDefaultValueV2(cls);
            if (f == null) {
                f = Float.valueOf(0.0f);
            }
            return DataCenter.getFloatValue(DataCenter.getKey(cls), f.floatValue());
        }
        return DataCenter.getFloatValue(liveSettingModel.getSettingsKey(), liveSettingModel.getDefaultFloat());
    }

    public final int getIntValue(Class<?> clazz) {
        o.LJIIIZ(clazz, "clazz");
        if (enableCustomTypeOpt()) {
            return ((Number) getBasicValueAndReport(new SettingsManager$getIntValue$1(this), clazz)).intValue();
        }
        Integer num = (Integer) getValueAndReport(new SettingsManager$getIntValue$2(this), clazz);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final int getIntValueInternal(Class<?> cls) {
        int i;
        LiveSettingModel liveSettingModel = modelMap.get(cls.getName());
        if (liveSettingModel != null) {
            try {
                String settingsKey = liveSettingModel.getSettingsKey();
                j defaultValue = liveSettingModel.getDefaultValue();
                if (defaultValue != null) {
                    i = defaultValue.LJIILJJIL();
                } else {
                    i = 0;
                }
                return DataCenter.getIntValue(settingsKey, i);
            } catch (Exception e) {
                if (!isLocalTest) {
                    return getIntValueInternal$getValue$2(cls);
                }
                throw e;
            }
        }
        return getIntValueInternal$getValue$2(cls);
    }

    public final int getIntValueInternalV2(Class<?> cls) {
        LiveSettingModel liveSettingModel = modelMap.get(cls.getName());
        if (liveSettingModel == null) {
            Integer num = (Integer) DataCenter.getDefaultValueV2(cls);
            if (num == null) {
                num = 0;
            }
            return DataCenter.getIntValue(DataCenter.getKey(cls), num.intValue());
        }
        return DataCenter.getIntValue(liveSettingModel.getSettingsKey(), liveSettingModel.getDefaultInt());
    }

    public final long getLongValue(Class<?> clazz) {
        o.LJIIIZ(clazz, "clazz");
        if (enableCustomTypeOpt()) {
            return ((Number) getBasicValueAndReport(new SettingsManager$getLongValue$1(this), clazz)).longValue();
        }
        Long l = (Long) getValueAndReport(new SettingsManager$getLongValue$2(this), clazz);
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final long getLongValueInternal(Class<?> cls) {
        long j;
        LiveSettingModel liveSettingModel = modelMap.get(cls.getName());
        if (liveSettingModel != null) {
            try {
                String settingsKey = liveSettingModel.getSettingsKey();
                j defaultValue = liveSettingModel.getDefaultValue();
                if (defaultValue != null) {
                    j = defaultValue.LJIJJLI();
                } else {
                    j = 0;
                }
                return DataCenter.getLongValue(settingsKey, j);
            } catch (Exception e) {
                if (!isLocalTest) {
                    return getLongValueInternal$getValue$4(cls);
                }
                throw e;
            }
        }
        return getLongValueInternal$getValue$4(cls);
    }

    public final long getLongValueInternalV2(Class<?> cls) {
        LiveSettingModel liveSettingModel = modelMap.get(cls.getName());
        if (liveSettingModel == null) {
            Long l = (Long) DataCenter.getDefaultValueV2(cls);
            if (l == null) {
                l = 0L;
            }
            return DataCenter.getLongValue(DataCenter.getKey(cls), l.longValue());
        }
        return DataCenter.getLongValue(liveSettingModel.getSettingsKey(), liveSettingModel.getDefaultLong());
    }

    public final Object getMockValueByKey(String settingKey) {
        o.LJIIIZ(settingKey, "settingKey");
        return mCacheValues.get(settingKey);
    }

    public final String[] getStringArrayValue(Class<?> clazz) {
        o.LJIIIZ(clazz, "clazz");
        if (enableCustomTypeOpt()) {
            return (String[]) getBasicValueAndReport(new SettingsManager$getStringArrayValue$1(this), clazz);
        }
        String[] strArr = (String[]) getValueAndReport(new SettingsManager$getStringArrayValue$2(this), clazz);
        if (strArr == null) {
            return STRING_ARRAY_DEFAULT;
        }
        return strArr;
    }

    public final String[] getStringArrayValueInternal(Class<?> cls) {
        LiveSettingModel liveSettingModel = modelMap.get(cls.getName());
        if (liveSettingModel != null) {
            return getStringArrayValueInternal$getValue$12(cls, liveSettingModel.getSettingsKey());
        }
        String key = DataCenter.getKey(cls);
        o.LJIIIIZZ(key, "getKey(clazz)");
        return getStringArrayValueInternal$getValue$12(cls, key);
    }

    public final String[] getStringArrayValueInternalV2(Class<?> cls) {
        LiveSettingModel liveSettingModel = modelMap.get(cls.getName());
        String[] strArr = (String[]) DataCenter.getDefaultValueV2(cls);
        if (strArr == null) {
            strArr = STRING_ARRAY_DEFAULT;
        }
        o.LJIIIIZZ(strArr, "DataCenter.getDefaultVal…) ?: STRING_ARRAY_DEFAULT");
        if (liveSettingModel == null) {
            String[] stringArrayValue = DataCenter.getStringArrayValue(DataCenter.getKey(cls), strArr);
            o.LJIIIIZZ(stringArrayValue, "getStringArrayValue(Data…Key(clazz), defaultValue)");
            return stringArrayValue;
        }
        String[] stringArrayValue2 = DataCenter.getStringArrayValue(liveSettingModel.getSettingsKey(), strArr);
        o.LJIIIIZZ(stringArrayValue2, "getStringArrayValue(mode…ettingsKey, defaultValue)");
        return stringArrayValue2;
    }

    public final String getStringValue(Class<?> clazz) {
        o.LJIIIZ(clazz, "clazz");
        if (enableCustomTypeOpt()) {
            return (String) getBasicValueAndReport(new SettingsManager$getStringValue$1(this), clazz);
        }
        String str = (String) getValueAndReport(new SettingsManager$getStringValue$2(this), clazz);
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getStringValueInternal(Class<?> cls) {
        String str;
        LiveSettingModel liveSettingModel = modelMap.get(cls.getName());
        if (liveSettingModel != null) {
            try {
                String settingsKey = liveSettingModel.getSettingsKey();
                j defaultValue = liveSettingModel.getDefaultValue();
                if (defaultValue != null) {
                    str = defaultValue.LJJIFFI();
                } else {
                    str = null;
                }
                return DataCenter.getStringValue(settingsKey, str);
            } catch (Exception e) {
                if (!isLocalTest) {
                    return getStringValueInternal$getValue$10(cls);
                }
                throw e;
            }
        }
        return getStringValueInternal$getValue$10(cls);
    }

    public final String getStringValueInternalV2(Class<?> cls) {
        LiveSettingModel liveSettingModel = modelMap.get(cls.getName());
        if (liveSettingModel == null) {
            String str = (String) DataCenter.getDefaultValueV2(cls);
            if (str == null) {
                str = "";
            }
            String stringValue = DataCenter.getStringValue(DataCenter.getKey(cls), str);
            o.LJIIIIZZ(stringValue, "getStringValue(DataCente…Key(clazz), defaultValue)");
            return stringValue;
        }
        String stringValue2 = DataCenter.getStringValue(liveSettingModel.getSettingsKey(), liveSettingModel.getDefaultString());
        o.LJIIIIZZ(stringValue2, "getStringValue(model.set…model.getDefaultString())");
        return stringValue2;
    }

    public final Object getValueByKey(String settingKey) {
        o.LJIIIZ(settingKey, "settingKey");
        ConcurrentHashMap<String, Object> concurrentHashMap = mCacheValues;
        Object obj = concurrentHashMap.get(settingKey);
        if (obj != null) {
            return obj;
        }
        if (!mAllValues.isEmpty()) {
            Object obj2 = mAllValues.get(settingKey);
            if (obj2 != null) {
                concurrentHashMap.put(settingKey, obj2);
            }
            return obj2;
        }
        Map<String, Object> map = DataCenter.getAllValues();
        o.LJIIIIZZ(map, "map");
        mAllValues = map;
        Object obj3 = map.get(settingKey);
        if (obj3 != null) {
            concurrentHashMap.put(settingKey, obj3);
        }
        return obj3;
    }

    public final <T> T getValueSafely(Class<?> clazz) {
        o.LJIIIZ(clazz, "clazz");
        if (enableCustomTypeOpt()) {
            return (T) getObjectValueAndReport(new SettingsManager$getValueSafely$1(this), clazz);
        }
        return (T) getValueAndReport(new SettingsManager$getValueSafely$2(this), clazz);
    }

    public final <T> T getValueSafelyInternal(Class<?> cls) {
        try {
            LiveSettingModel liveSettingModel = modelMap.get(cls.getName());
            if (liveSettingModel != null) {
                return (T) getValueSafelyInternal$getValue$15(cls, liveSettingModel.getSettingsKey());
            }
            String key = DataCenter.getKey(cls);
            o.LJIIIIZZ(key, "getKey(clazz)");
            return (T) getValueSafelyInternal$getValue$15(cls, key);
        } catch (Exception e) {
            if (!isLocalTest) {
                return (T) DataCenter.getDefaultValue(cls);
            }
            throw e;
        }
    }

    public final <T> T getValueSafelyInternalV2(Class<?> cls) {
        Class<?> configTypeV2;
        LiveSettingModel liveSettingModel = modelMap.get(cls.getName());
        if (liveSettingModel == null) {
            Object defaultValueV2 = DataCenter.getDefaultValueV2(cls);
            if (defaultValueV2 != null) {
                configTypeV2 = defaultValueV2.getClass();
            } else {
                configTypeV2 = DataCenter.getConfigTypeV2(cls);
            }
            return (T) DataCenter.getValueSafely(DataCenter.getKey(cls), configTypeV2, defaultValueV2);
        }
        if (liveSettingModel.getDefaultCustomClass() != null) {
            return (T) DataCenter.getValueSafely(liveSettingModel.getSettingsKey(), liveSettingModel.getDefaultCustomClass(), DataCenter.getDefaultValueV2(cls));
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("defaultCustomClass == null, setting_key: ");
        LIZ.append(liveSettingModel.getSettingsKey());
        LIZ.append(", class: ");
        LIZ.append(cls);
        throw new NullPointerException(X1D.LIZIZ(LIZ));
    }

    public final boolean isRealPreciseExposure(String settingKey) {
        o.LJIIIZ(settingKey, "settingKey");
        return PreciseExposureManager.INSTANCE.isRealPreciseExposure$live_settings_release(settingKey);
    }

    public final synchronized void saveSettingsValue(m mVar) {
        if (mVar == null) {
            return;
        }
        if (!hasLoadAllSetting.get()) {
            updateJsonObject = mVar;
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(models);
            SaveSettingsValue.save(mVar, arrayList);
            Map<String, Object> tmpValues = DataCenter.getAllValues();
            for (Map.Entry<String, LiveSettingModel> entry : modelMap.entrySet()) {
                if (!entry.getValue().getCacheNoUpdate()) {
                    if (INSTANCE.getMCacheValueTypes().contains(entry.getValue().getFieldTypeName())) {
                        if (isLocalTest) {
                            MockSettingsRepo mockSettingsRepo = MockSettingsRepo.INSTANCE;
                            if (mockSettingsRepo.contains(entry.getValue().getSettingsKey())) {
                                mCacheValues.put(entry.getKey(), mockSettingsRepo.getAll().get(entry.getValue().getSettingsKey()));
                            }
                        }
                        Object obj = tmpValues.get(entry.getValue().getSettingsKey());
                        if (obj != null) {
                            mCacheValues.put(entry.getKey(), obj);
                        }
                    } else {
                        mCacheValues.remove(entry.getKey());
                    }
                }
            }
            o.LJIIIIZZ(tmpValues, "tmpValues");
            mAllValues = tmpValues;
        }
    }

    public final void setDataProvider(SettingsDataProvider settingsDataProvider) {
        dataProvider = settingsDataProvider;
    }

    private final <T> T getBasicValueAndReport(InterfaceC88472Yns<? super Class<?>, ? extends T> interfaceC88472Yns, Class<?> cls) {
        String str;
        long nanoTime = System.nanoTime();
        String name = cls.getName();
        LiveSettingModel liveSettingModel = modelMap.get(name);
        if (liveSettingModel != null && liveSettingModel.getPreciseExperiment()) {
            appendExposedVidIfNecessary(liveSettingModel);
        }
        ConcurrentHashMap<String, Object> concurrentHashMap = mCacheValues;
        T t = (T) concurrentHashMap.get(name);
        if (t != null) {
            return t;
        }
        T invoke = interfaceC88472Yns.invoke(cls);
        concurrentHashMap.put(name, invoke);
        Monitor monitor2 = monitor;
        String str2 = null;
        if (liveSettingModel != null) {
            str = liveSettingModel.getSettingsKey();
        } else {
            str = null;
        }
        long nanoTime2 = System.nanoTime() - nanoTime;
        if (liveSettingModel != null) {
            str2 = liveSettingModel.getFieldTypeName();
        }
        monitor2.reportSettingReadPerformance(str, nanoTime2, str2, false);
        return invoke;
    }

    private final <T> T getObjectValueAndReport(InterfaceC88472Yns<? super Class<?>, ? extends T> interfaceC88472Yns, Class<?> cls) {
        String str;
        long nanoTime = System.nanoTime();
        String name = cls.getName();
        LiveSettingModel liveSettingModel = modelMap.get(name);
        if (liveSettingModel != null && liveSettingModel.getPreciseExperiment()) {
            appendExposedVidIfNecessary(liveSettingModel);
        }
        ConcurrentHashMap<String, Object> concurrentHashMap = mCacheValues;
        T t = (T) concurrentHashMap.get(name);
        if (t != null) {
            return t;
        }
        T invoke = interfaceC88472Yns.invoke(cls);
        concurrentHashMap.put(name, invoke);
        Monitor monitor2 = monitor;
        String str2 = null;
        if (liveSettingModel != null) {
            str = liveSettingModel.getSettingsKey();
        } else {
            str = null;
        }
        long nanoTime2 = System.nanoTime() - nanoTime;
        if (liveSettingModel != null) {
            str2 = liveSettingModel.getFieldTypeName();
        }
        monitor2.reportSettingReadPerformance(str, nanoTime2, str2, false);
        return invoke;
    }

    public static final String[] getStringArrayValueInternal$getValue$12(Class<?> cls, String str) {
        String[] stringArrayValue = DataCenter.getStringArrayValue(str, null);
        if (stringArrayValue == null) {
            return (String[]) DataCenter.getDefaultValue(cls);
        }
        return stringArrayValue;
    }

    private final <T> T getValueAndReport(InterfaceC88472Yns<? super Class<?>, ? extends T> interfaceC88472Yns, Class<?> cls) {
        String str;
        String str2;
        boolean z;
        long nanoTime = System.nanoTime();
        LiveSettingModel liveSettingModel = modelMap.get(cls.getName());
        String str3 = null;
        if (liveSettingModel != null && liveSettingModel.getPreciseExperiment()) {
            PreciseExposureManager preciseExposureManager = PreciseExposureManager.INSTANCE;
            String settingsKey = liveSettingModel.getSettingsKey();
            if (liveSettingModel.getCacheLevel() != CacheLevel.DID) {
                z = true;
            } else {
                z = false;
            }
            preciseExposureManager.appendExposedVid(settingsKey, z);
        }
        String name = cls.getName();
        ConcurrentHashMap<String, Object> concurrentHashMap = mCacheValues;
        T t = (T) concurrentHashMap.get(name);
        if (t == null) {
            T invoke = interfaceC88472Yns.invoke(cls);
            if (invoke == null) {
                return null;
            }
            concurrentHashMap.put(name, invoke);
            Monitor monitor2 = monitor;
            if (liveSettingModel != null) {
                str2 = liveSettingModel.getSettingsKey();
            } else {
                str2 = null;
            }
            long nanoTime2 = System.nanoTime() - nanoTime;
            if (liveSettingModel != null) {
                str3 = liveSettingModel.getFieldTypeName();
            }
            monitor2.reportSettingReadPerformance(str2, nanoTime2, str3, false);
            return invoke;
        }
        Monitor monitor3 = monitor;
        if (liveSettingModel != null) {
            str = liveSettingModel.getSettingsKey();
        } else {
            str = null;
        }
        long nanoTime3 = System.nanoTime() - nanoTime;
        if (liveSettingModel != null) {
            str3 = liveSettingModel.getFieldTypeName();
        }
        monitor3.reportSettingReadPerformance(str, nanoTime3, str3, true);
        return t;
    }

    public static final <T> T getValueSafelyInternal$getValue$15(Class<?> cls, String str) {
        T t = (T) DataCenter.getValueSafely(str, DataCenter.getConfigType(cls), null);
        if (t != null && (!o.LJ(t.toString(), "\"\""))) {
            return t;
        }
        return (T) DataCenter.getDefaultValue(cls);
    }

    public final boolean getBooleanValueWithoutCache(String key, boolean z) {
        o.LJIIIZ(key, "key");
        return DataCenter.getBooleanValue(key, z);
    }

    public final double getDoubleValueWithoutCache(String key, double d) {
        o.LJIIIZ(key, "key");
        return DataCenter.getDoubleValue(key, d);
    }

    public final float getFloatValueWithoutCache(String key, float f) {
        o.LJIIIZ(key, "key");
        return DataCenter.getFloatValue(key, f);
    }

    public final int getIntValueWithoutCache(String key, int i) {
        o.LJIIIZ(key, "key");
        return DataCenter.getIntValue(key, i);
    }

    public final long getLongValueWithoutCache(String key, long j) {
        o.LJIIIZ(key, "key");
        return DataCenter.getLongValue(key, j);
    }

    public final String getStringValueWithoutCache(String key, String str) {
        o.LJIIIZ(key, "key");
        return DataCenter.getStringValue(key, str);
    }

    public final void updateCacheValueForMock(String str, Object obj) {
        if (str == null) {
            return;
        }
        if (obj == null) {
            mCacheValues.remove(str);
        } else {
            mCacheValues.put(str, obj);
        }
    }

    public final synchronized void init(boolean z, SettingsDataProvider dataProvider2, Monitor monitor2, ExecutorService executorService) {
        o.LJIIIZ(dataProvider2, "dataProvider");
        if (hasInit.get()) {
            return;
        }
        isLocalTest = z;
        DataCenter.init(z);
        if (monitor2 == null) {
            monitor2 = new MonitorImpl(z);
        }
        monitor = monitor2;
        dataProvider = dataProvider2;
        backgroundExecutor = executorService;
        hasInit.compareAndSet(false, true);
        new PthreadThread(new Runnable() { // from class: com.bytedance.android.live_settings.SettingsManager$init$1
            @Override // java.lang.Runnable
            public final void run() {
                com_bytedance_android_live_settings_SettingsManager$init$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public final void com_bytedance_android_live_settings_SettingsManager$init$1__run$___twin___() {
                SettingsManager settingsManager = SettingsManager.INSTANCE;
                settingsManager.loadAllSetting();
                m mVar = SettingsManager.updateJsonObject;
                if (mVar != null) {
                    settingsManager.saveSettingsValue(mVar);
                } else {
                    PreciseExposureManager.INSTANCE.tryExposeLastExposedVids();
                }
                if (SettingsManager.customTypeOptFlag == 1 || SettingsManager.customTypeOptFlag == SettingsManager.CUSTOM_TYPE_OPT_FLAG_V2) {
                    SettingsManager.updateJsonObject = null;
                }
            }

            public static void com_bytedance_android_live_settings_SettingsManager$init$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(SettingsManager$init$1 settingsManager$init$1) {
                boolean LIZ;
                try {
                    settingsManager$init$1.com_bytedance_android_live_settings_SettingsManager$init$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        }, "SettingsManager").start();
    }

    public static /* synthetic */ void init$default(SettingsManager settingsManager, boolean z, SettingsDataProvider settingsDataProvider, Monitor monitor2, ExecutorService executorService, int i, Object obj) {
        if ((i & 8) != 0) {
            executorService = null;
        }
        settingsManager.init(z, settingsDataProvider, monitor2, executorService);
    }
}
