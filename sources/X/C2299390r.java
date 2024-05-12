package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;

/* renamed from: X.90r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2299390r {
    public static final ContentLanguage[] LIZ;

    static {
        new C2299390r();
        ContentLanguage[] contentLanguageArr = (ContentLanguage[]) SettingsManager.LIZLLL().LJIIIIZZ("predicted_content_languages", ContentLanguage[].class, null);
        if (contentLanguageArr == null) {
            contentLanguageArr = new ContentLanguage[0];
        }
        LIZ = contentLanguageArr;
    }

    public static final ContentLanguage[] LIZ() {
        Object LIZ2;
        if (C2299490s.LIZ) {
            return LIZ;
        }
        Object obj = null;
        try {
            LIZ2 = (ContentLanguage[]) SettingsManager.LIZLLL().LJIIIIZZ("predicted_content_languages", ContentLanguage[].class, null);
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (!C3C5.m12isFailureimpl(LIZ2)) {
            obj = LIZ2;
        }
        ContentLanguage[] contentLanguageArr = (ContentLanguage[]) obj;
        if (contentLanguageArr != null) {
            return contentLanguageArr;
        }
        return new ContentLanguage[0];
    }
}
