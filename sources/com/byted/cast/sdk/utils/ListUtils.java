package com.byted.cast.sdk.utils;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes29.dex */
public class ListUtils {

    /* loaded from: classes29.dex */
    public interface Filter<T> {
        boolean keepItem(T t);
    }

    public static <T> List<T> filter(List<T> list, Filter<T> filter) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!filter.keepItem(it.next())) {
                it.remove();
            }
        }
        return list;
    }
}
