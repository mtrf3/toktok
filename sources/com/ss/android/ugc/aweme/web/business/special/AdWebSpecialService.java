package com.ss.android.ugc.aweme.web.business.special;

import X.C2YJ;
import X.C58096Mr6;
import X.C59222NMc;
import X.C59303NPf;
import X.NJX;
import com.ss.android.ugc.aweme.web.service.IAdWebSpecialService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdWebSpecialService implements IAdWebSpecialService {
    public static IAdWebSpecialService LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(IAdWebSpecialService.class, false);
        if (LIZ != null) {
            return (IAdWebSpecialService) LIZ;
        }
        if (C58096Mr6.g8 == null) {
            synchronized (IAdWebSpecialService.class) {
                if (C58096Mr6.g8 == null) {
                    C58096Mr6.g8 = new AdWebSpecialService();
                }
            }
        }
        return C58096Mr6.g8;
    }

    @Override // com.ss.android.ugc.aweme.web.service.IAdWebSpecialService
    public final Map<String, String> LIZ(String str, Map<String, String> map, C59222NMc c59222NMc) {
        boolean z;
        if (str == null || !C59303NPf.LIZIZ(c59222NMc, str) || c59222NMc == null) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        NJX.LIZ(str, linkedHashMap);
        try {
            Boolean enableReferer = C2YJ.LIZIZ.LIZ.getAdLandingPageConfig().getEnableReferer();
            o.LJIIIIZZ(enableReferer, "get().getAdLandingPageConfig().getEnableReferer()");
            z = enableReferer.booleanValue();
        } catch (Exception unused) {
            z = true;
        }
        if (!z) {
            if (linkedHashMap.isEmpty()) {
                return null;
            }
            if (map != null) {
                linkedHashMap.putAll(map);
            }
        } else {
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            linkedHashMap.put("referer", "https://www.tiktok.com");
            linkedHashMap.put("x-has-set-referer", "1");
        }
        return linkedHashMap;
    }
}
