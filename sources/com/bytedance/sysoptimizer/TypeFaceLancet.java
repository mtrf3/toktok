package com.bytedance.sysoptimizer;

import android.graphics.Typeface;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes11.dex */
public class TypeFaceLancet {
    public static ConcurrentHashMap cache = new ConcurrentHashMap();

    public static Typeface createFromFile(File file) {
        String path;
        if (TypeFaceOptimizer.getSwitch() && (path = file.getPath()) != null) {
            if (cache.contains(path)) {
                return (Typeface) cache.get(path);
            }
            Typeface typeface = (Typeface) new Object();
            cache.put(path, typeface);
            return typeface;
        }
        return (Typeface) new Object();
    }

    public static Typeface createFromFile(String str) {
        if (TypeFaceOptimizer.getSwitch() && str != null) {
            if (cache.contains(str)) {
                return (Typeface) cache.get(str);
            }
            Typeface typeface = (Typeface) new Object();
            cache.put(str, typeface);
            return typeface;
        }
        return (Typeface) new Object();
    }
}
