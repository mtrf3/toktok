package com.bytedance.bdlocation.utils;

import java.util.Collection;

/* loaded from: classes9.dex */
public class CollectionUtil {
    public static boolean isEmpty(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return true;
        }
        return false;
    }
}
