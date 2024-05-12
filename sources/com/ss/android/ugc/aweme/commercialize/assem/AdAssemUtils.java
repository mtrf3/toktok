package com.ss.android.ugc.aweme.commercialize.assem;

import X.C58096Mr6;
import X.C65352Pkq;
import X.C65776Prg;
import com.ss.android.ugc.aweme.commercialize.feed.assem.IAdAssemUtils;

/* loaded from: classes11.dex */
public final class AdAssemUtils implements IAdAssemUtils {
    @Override // com.ss.android.ugc.aweme.commercialize.feed.assem.IAdAssemUtils
    public final C65776Prg LIZ() {
        return C65352Pkq.LIZ(AdLightWebPageAssem.class);
    }

    public static IAdAssemUtils LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(IAdAssemUtils.class, false);
        if (LIZ != null) {
            return (IAdAssemUtils) LIZ;
        }
        if (C58096Mr6.LLLILZ == null) {
            synchronized (IAdAssemUtils.class) {
                if (C58096Mr6.LLLILZ == null) {
                    C58096Mr6.LLLILZ = new AdAssemUtils();
                }
            }
        }
        return C58096Mr6.LLLILZ;
    }
}
