package com.kakao.sdk.common.util;

/* loaded from: classes12.dex */
public interface PersistentKVStore {
    PersistentKVStore apply();

    PersistentKVStore commit();

    long getLong(String str, long j);

    String getString(String str, String str2);

    PersistentKVStore putLong(String str, long j);

    PersistentKVStore putString(String str, String str2);

    PersistentKVStore remove(String str);

    /* loaded from: classes12.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ long getLong$default(PersistentKVStore persistentKVStore, String str, long j, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    j = 0;
                }
                return persistentKVStore.getLong(str, j);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLong");
        }

        public static /* synthetic */ String getString$default(PersistentKVStore persistentKVStore, String str, String str2, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str2 = null;
                }
                return persistentKVStore.getString(str, str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
        }
    }
}
