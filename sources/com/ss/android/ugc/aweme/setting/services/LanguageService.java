package com.ss.android.ugc.aweme.setting.services;

import X.C43286Gyo;
import X.C58096Mr6;
import X.C87093YGb;
import com.ss.android.ugc.aweme.main.service.ILanguageService;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class LanguageService implements ILanguageService {
    @Override // com.ss.android.ugc.aweme.main.service.ILanguageService
    public final String getAppLanguage() {
        C43286Gyo.LIZ.getClass();
        String LIZ = C87093YGb.LIZ();
        o.LJIIIIZZ(LIZ, "get().getAppLanguage()");
        return LIZ;
    }

    public static ILanguageService LIZ() {
        Object LIZ = C58096Mr6.LIZ(ILanguageService.class, false);
        if (LIZ != null) {
            return (ILanguageService) LIZ;
        }
        if (C58096Mr6.y6 == null) {
            synchronized (ILanguageService.class) {
                if (C58096Mr6.y6 == null) {
                    C58096Mr6.y6 = new LanguageService();
                }
            }
        }
        return C58096Mr6.y6;
    }
}
