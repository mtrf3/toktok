package com.kakao.sdk.common.util;

import android.content.SharedPreferences;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SharedPrefsWrapper implements PersistentKVStore {
    public final SharedPreferences appCache;
    public final SharedPreferences.Editor editor;

    @Override // com.kakao.sdk.common.util.PersistentKVStore
    public PersistentKVStore apply() {
        this.editor.apply();
        return this;
    }

    @Override // com.kakao.sdk.common.util.PersistentKVStore
    public PersistentKVStore commit() {
        this.editor.commit();
        return this;
    }

    public final SharedPreferences getAppCache() {
        return this.appCache;
    }

    public SharedPrefsWrapper(SharedPreferences appCache) {
        o.LJIIIZ(appCache, "appCache");
        this.appCache = appCache;
        SharedPreferences.Editor edit = appCache.edit();
        o.LJIIIIZZ(edit, "appCache.edit()");
        this.editor = edit;
    }

    @Override // com.kakao.sdk.common.util.PersistentKVStore
    public PersistentKVStore remove(String key) {
        o.LJIIIZ(key, "key");
        this.editor.remove(key);
        return this;
    }

    @Override // com.kakao.sdk.common.util.PersistentKVStore
    public long getLong(String key, long j) {
        o.LJIIIZ(key, "key");
        return this.appCache.getLong(key, j);
    }

    @Override // com.kakao.sdk.common.util.PersistentKVStore
    public String getString(String key, String str) {
        o.LJIIIZ(key, "key");
        return this.appCache.getString(key, str);
    }

    @Override // com.kakao.sdk.common.util.PersistentKVStore
    public PersistentKVStore putLong(String key, long j) {
        o.LJIIIZ(key, "key");
        this.editor.putLong(key, j);
        return this;
    }

    @Override // com.kakao.sdk.common.util.PersistentKVStore
    public PersistentKVStore putString(String key, String value) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(value, "value");
        this.editor.putString(key, value);
        return this;
    }
}
