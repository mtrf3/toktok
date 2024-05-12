package com.lynx.fresco;

import X.AbstractC39537FfR;
import X.EnumC61029NxJ;
import X.O3M;
import X.VA4;
import X.VEZ;
import X.W5I;
import X.W5O;
import X.W92;
import com.lynx.react.bridge.ReadableMap;

/* loaded from: classes14.dex */
public class FrescoImagePrefetchHelper extends AbstractC39537FfR {
    public static void prefetchForestImage(String str) {
        O3M o3m = new O3M();
        o3m.LIZ = EnumC61029NxJ.LYNX_IMAGE;
        o3m.LJ = Boolean.FALSE;
        Boolean bool = Boolean.TRUE;
        o3m.LJII = bool;
        o3m.LJIILIIL = bool;
        ((VA4) VEZ.LIZIZ().LIZ(VA4.class)).preload(str, o3m);
    }

    private void prefetchImageToBitmapCache(String str, Object obj) {
        W5I.LIZ().LJIIL(W5O.LIZIZ(str), obj);
    }

    private void prefetchImageToDiskCache(String str, Object obj, String str2) {
        W92 w92;
        if (str2 != null) {
            if (str2.equals("high")) {
                w92 = W92.HIGH;
            } else if (str2.equals("medium")) {
                w92 = W92.MEDIUM;
            }
            W5I.LIZ().LJIILJJIL(W5O.LIZIZ(str), obj, w92);
        }
        w92 = W92.LOW;
        W5I.LIZ().LJIILJJIL(W5O.LIZIZ(str), obj, w92);
    }

    @Override // X.AbstractC39537FfR
    public void prefetchImage(String str, Object obj, ReadableMap readableMap) {
        String string;
        if (readableMap == null) {
            string = null;
        } else {
            string = readableMap.getString("priority", null);
            String string2 = readableMap.getString("cacheTarget", null);
            if (string2 != null && string2.equals("bitmap")) {
                prefetchImageToBitmapCache(str, obj);
                return;
            }
        }
        prefetchImageToDiskCache(str, obj, string);
    }
}
