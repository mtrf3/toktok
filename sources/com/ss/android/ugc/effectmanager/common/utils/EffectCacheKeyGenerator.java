package com.ss.android.ugc.effectmanager.common.utils;

import X.C025908h;
import X.C1EU;
import X.JBR;
import X.X1D;
import defpackage.a1;
import java.io.File;

/* loaded from: classes16.dex */
public final class EffectCacheKeyGenerator {
    public static String generateHotStickerKey() {
        return "effectgalleryhot";
    }

    public static String generateCategoryCachePattern(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        return C025908h.LIZIZ(LIZ, File.separator, "effectchannel", "(.*)", LIZ);
    }

    public static String generateCategoryVersionPattern(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        return C025908h.LIZIZ(LIZ, File.separator, "category_version", "(.*)", LIZ);
    }

    public static String generatePanelInfoVersionKey(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        return JBR.LJFF(LIZ, File.separator, "effect_version", LIZ);
    }

    public static String generatePanelInfoVersionPattern(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        return C025908h.LIZIZ(LIZ, File.separator, "effect_version", "(.*)", LIZ);
    }

    public static String generatePanelPattern(String str) {
        return a1.LJ("effectchannel", str, "(.*)");
    }

    public static String generateCategoryVersionKey(String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        return C025908h.LIZIZ(LIZ, File.separator, "category_version", str2, LIZ);
    }

    public static String generatePanelInfoKey(String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str2);
        return C025908h.LIZIZ(LIZ, File.separator, "effectchannel", str, LIZ);
    }

    public static String generatePanelKey(String str, String str2) {
        return a1.LJ("effectchannel", str2, str);
    }

    public static String generateCategoryEffectKey(String str, String str2, int i, int i2, int i3) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(File.separator);
        LIZ.append("effectchannel");
        LIZ.append(str2);
        LIZ.append(i);
        C1EU.LIZJ(LIZ, "_", i2, "_", i3);
        return X1D.LIZIZ(LIZ);
    }
}
