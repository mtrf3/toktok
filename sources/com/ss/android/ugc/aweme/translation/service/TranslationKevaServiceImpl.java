package com.ss.android.ugc.aweme.translation.service;

import X.C41032G8m;
import X.C52263KfD;
import X.C58096Mr6;
import X.C86663Xzn;
import X.Y04;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes16.dex */
public final class TranslationKevaServiceImpl implements ITranslationKevaService {
    public static ITranslationKevaService LJIIL() {
        Object LIZ = C58096Mr6.LIZ(ITranslationKevaService.class, false);
        if (LIZ != null) {
            return (ITranslationKevaService) LIZ;
        }
        if (C58096Mr6.J7 == null) {
            synchronized (ITranslationKevaService.class) {
                if (C58096Mr6.J7 == null) {
                    C58096Mr6.J7 = new TranslationKevaServiceImpl();
                }
            }
        }
        return C58096Mr6.J7;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationKevaService
    public final boolean LIZ() {
        return C86663Xzn.LIZIZ.getBoolean("key_search_force_Translation_Video", true);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationKevaService
    public final void LIZIZ() {
        C86663Xzn.LIZIZ.storeBoolean("key_search_force_Translation_Video", false);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationKevaService
    public final boolean LJ() {
        return C86663Xzn.LIZIZ.getBoolean("key_one_click_translation_active", C86663Xzn.LIZ());
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationKevaService
    public final void LJII() {
        C86663Xzn.LIZIZ.storeBoolean("key_one_click_translation_toast_shown", true);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationKevaService
    public final boolean LJIIIIZZ() {
        return C86663Xzn.LIZIZ.getBoolean("key_one_click_translation_toast_shown", false);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationKevaService
    public final void LJIIIZ() {
        C86663Xzn.LIZIZ.erase("key_one_click_translation_active");
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationKevaService
    public final boolean LIZLLL() {
        return C86663Xzn.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationKevaService
    public final boolean LIZJ(Aweme aweme) {
        if (C52263KfD.LIZ()) {
            if (C41032G8m.LIZ()) {
                if (C86663Xzn.LIZ() && !Y04.LIZ(aweme)) {
                    return true;
                }
            } else {
                return C86663Xzn.LIZ();
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationKevaService
    public final void LJFF(boolean z) {
        if (C52263KfD.LIZ()) {
            C86663Xzn.LIZIZ.storeBoolean("enable_translation_one_click", z);
        } else {
            C86663Xzn.LIZIZ.storeBoolean("enable_translation", z);
        }
        C86663Xzn.LIZIZ.storeLong("app_enable_translation_time", System.currentTimeMillis());
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationKevaService
    public final boolean LJI(boolean z) {
        Keva keva = C86663Xzn.LIZIZ;
        if (keva.getLong("search_enable_translation_time", 0L) >= keva.getLong("app_enable_translation_time", 0L)) {
            return keva.getBoolean("search_enable_translation_state", z);
        }
        return C86663Xzn.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationKevaService
    public final void LJIIJ(boolean z) {
        Keva keva = C86663Xzn.LIZIZ;
        keva.storeLong("search_enable_translation_time", System.currentTimeMillis());
        keva.storeBoolean("search_enable_translation_state", z);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationKevaService
    public final void LJIIJJI(boolean z) {
        C86663Xzn.LIZIZ.storeBoolean("key_one_click_translation_active", z);
    }
}
