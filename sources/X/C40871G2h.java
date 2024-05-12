package X;

import com.ss.android.ugc.aweme.plugin.journey.JourneyContentLanguage;
import com.ss.android.ugc.aweme.plugin.journey.JourneyContentLanguageExtra;
import com.ss.android.ugc.aweme.plugin.journey.JourneyContentLanguageWrapper;
import java.util.List;

/* renamed from: X.G2h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40871G2h {
    public static C40870G2g LIZ(JourneyContentLanguageWrapper journeyContentLanguageWrapper) {
        List<JourneyContentLanguage> list = journeyContentLanguageWrapper.content_languages;
        JourneyContentLanguageExtra journeyContentLanguageExtra = journeyContentLanguageWrapper.content_lang_dialog;
        if (list == null || journeyContentLanguageExtra == null) {
            return null;
        }
        return new C40870G2g(list, journeyContentLanguageExtra);
    }
}
