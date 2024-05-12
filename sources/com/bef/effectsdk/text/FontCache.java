package com.bef.effectsdk.text;

import X.C16880lQ;
import X.X1D;
import android.graphics.Typeface;
import java.io.File;
import java.util.Hashtable;
import java.util.LinkedList;

/* loaded from: classes.dex */
public class FontCache {
    public static Hashtable<String, Typeface> fontCache = new Hashtable<>();
    public static LinkedList<String> lruQueue = new LinkedList<>();

    public static synchronized Typeface getFromFile(String str, String str2) {
        Typeface typeface;
        synchronized (FontCache.class) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("FILE_");
            LIZ.append(str);
            LIZ.append("_");
            LIZ.append(str2);
            String LIZIZ = X1D.LIZIZ(LIZ);
            typeface = fontCache.get(LIZIZ);
            if (typeface == null) {
                try {
                    typeface = C16880lQ.LJJLIIIJLJLI(new File(str, str2));
                    if (lruQueue.size() >= 32) {
                        fontCache.remove(lruQueue.removeLast());
                        System.gc();
                    }
                    fontCache.put(LIZIZ, typeface);
                    lruQueue.addFirst(LIZIZ);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                lruQueue.remove(LIZIZ);
                lruQueue.addFirst(LIZIZ);
            }
        }
        return typeface;
    }

    public static synchronized Typeface getFromSystem(String str, int i) {
        Typeface typeface;
        synchronized (FontCache.class) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SYSTEM_");
            LIZ.append(str);
            LIZ.append("_");
            LIZ.append(i);
            String LIZIZ = X1D.LIZIZ(LIZ);
            typeface = fontCache.get(LIZIZ);
            if (typeface == null) {
                try {
                    typeface = Typeface.create(str, i);
                    if (lruQueue.size() >= 32) {
                        fontCache.remove(lruQueue.removeLast());
                        System.gc();
                    }
                    fontCache.put(LIZIZ, typeface);
                    lruQueue.addFirst(LIZIZ);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                lruQueue.remove(LIZIZ);
                lruQueue.addFirst(LIZIZ);
            }
        }
        return typeface;
    }
}
