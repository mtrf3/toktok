package com.ss.android.ugc.effectmanager.common.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class CollectionUtil {
    public static List<String> convertListObjToStr(List<?> list) {
        String str;
        if (isListEmpty(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            if (obj != null) {
                str = obj.toString();
            } else {
                str = "";
            }
            arrayList.add(str);
        }
        return arrayList;
    }

    public static List<?> convertObjectToList(Object obj) {
        ArrayList arrayList = new ArrayList();
        if (obj.getClass().isArray()) {
            return Arrays.asList((Object[]) obj);
        }
        if (!(obj instanceof Collection)) {
            return arrayList;
        }
        return new ArrayList((Collection) obj);
    }

    public static <T> boolean isArrayEmpty(T[] tArr) {
        if (tArr == null || tArr.length == 0) {
            return true;
        }
        return false;
    }

    public static boolean isCollection(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!obj.getClass().isArray() && !(obj instanceof Collection)) {
            return false;
        }
        return true;
    }

    public static <T> boolean isListEmpty(List<T> list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean isMapEmpty(Map map) {
        if (map == null || map.isEmpty()) {
            return true;
        }
        return false;
    }
}
