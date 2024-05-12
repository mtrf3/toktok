package com.bytedance.android.live_settings;

import com.bytedance.android.live_settings.repo.SettingsRepo;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class SettingsValueProvider {
    public static final SettingsValueProvider INSTANCE = new SettingsValueProvider();

    public final void clear() {
        SettingsRepo.INSTANCE.clear();
    }

    public final boolean getBooleanValue(String key, boolean z) {
        o.LJIIIZ(key, "key");
        return SettingsRepo.INSTANCE.getBooleanValue(key, z);
    }

    public final double getDoubleValue(String key, double d) {
        o.LJIIIZ(key, "key");
        return SettingsRepo.INSTANCE.getDoubleValue(key, d);
    }

    public final float getFloatValue(String key, float f) {
        o.LJIIIZ(key, "key");
        return SettingsRepo.INSTANCE.getFloatValue(key, f);
    }

    public final int getIntValue(String key, int i) {
        o.LJIIIZ(key, "key");
        return SettingsRepo.INSTANCE.getIntValue(key, i);
    }

    public final long getLongValue(String key, long j) {
        o.LJIIIZ(key, "key");
        return SettingsRepo.INSTANCE.getLongValue(key, j);
    }

    public final String[] getStringArrayValue(String key, String[] strArr) {
        o.LJIIIZ(key, "key");
        return SettingsRepo.INSTANCE.getStringArrayValue(key, strArr);
    }

    public final String getStringValue(String key, String str) {
        o.LJIIIZ(key, "key");
        return SettingsRepo.INSTANCE.getStringValue(key, str);
    }

    public final Object getValue(String key, Class<?> targetClass) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(targetClass, "targetClass");
        return SettingsRepo.INSTANCE.getValue(key, targetClass);
    }
}
