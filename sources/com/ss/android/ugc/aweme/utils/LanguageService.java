package com.ss.android.ugc.aweme.utils;

import X.C58096Mr6;
import X.C85999Xp5;
import android.app.Activity;
import android.content.Context;

/* loaded from: classes7.dex */
public final class LanguageService implements LanguageProvider {
    public static LanguageProvider LIZJ() {
        Object LIZ = C58096Mr6.LIZ(LanguageProvider.class, false);
        if (LIZ != null) {
            return (LanguageProvider) LIZ;
        }
        if (C58096Mr6.V7 == null) {
            synchronized (LanguageProvider.class) {
                if (C58096Mr6.V7 == null) {
                    C58096Mr6.V7 = new LanguageService();
                }
            }
        }
        return C58096Mr6.V7;
    }

    @Override // com.ss.android.ugc.aweme.utils.LanguageProvider
    public final void LIZ(Context context) {
        C85999Xp5.LJFF(context);
    }

    @Override // com.ss.android.ugc.aweme.utils.LanguageProvider
    public final void LIZIZ(Activity activity) {
        C85999Xp5.LJFF(activity);
    }
}
