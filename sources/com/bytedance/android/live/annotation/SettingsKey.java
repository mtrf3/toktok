package com.bytedance.android.live.annotation;

/* loaded from: classes.dex */
public @interface SettingsKey {
    CacheLevel cacheLevel() default CacheLevel.DID;

    boolean preciseExperiment() default false;

    String value();
}
