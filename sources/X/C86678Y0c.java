package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.translation.service.ITranslationService;
import com.ss.android.ugc.aweme.translation.service.TranslationServiceImpl;

/* renamed from: X.Y0c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86678Y0c {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(Y1V.LJLIL);

    public static ITranslationService LIZIZ() {
        return (ITranslationService) LIZ.getValue();
    }

    public static final IQE LIZ(Aweme aweme) {
        if (aweme == null) {
            return IQE.INITIALIZED;
        }
        return TranslationServiceImpl.LJJIJ().LJIIZILJ(aweme);
    }

    public static final boolean LIZJ(Aweme aweme) {
        if (aweme == null || OUP.LJJIII(aweme)) {
            return false;
        }
        if (!Y04.LIZIZ(aweme) && !Y02.LJ(aweme) && !C2058886e.LIZ(aweme)) {
            return false;
        }
        return true;
    }
}
