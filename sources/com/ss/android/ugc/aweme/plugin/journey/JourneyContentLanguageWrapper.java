package com.ss.android.ugc.aweme.plugin.journey;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class JourneyContentLanguageWrapper {

    @InterfaceC65349Pkn("content_lang_dialog")
    public final JourneyContentLanguageExtra content_lang_dialog;

    @InterfaceC65349Pkn("content_languages")
    public final List<JourneyContentLanguage> content_languages;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JourneyContentLanguageWrapper)) {
            return false;
        }
        JourneyContentLanguageWrapper journeyContentLanguageWrapper = (JourneyContentLanguageWrapper) obj;
        return o.LJ(this.content_languages, journeyContentLanguageWrapper.content_languages) && o.LJ(this.content_lang_dialog, journeyContentLanguageWrapper.content_lang_dialog);
    }

    public final int hashCode() {
        List<JourneyContentLanguage> list = this.content_languages;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        JourneyContentLanguageExtra journeyContentLanguageExtra = this.content_lang_dialog;
        return hashCode + (journeyContentLanguageExtra != null ? journeyContentLanguageExtra.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("JourneyContentLanguageWrapper(content_languages=");
        LIZ.append(this.content_languages);
        LIZ.append(", content_lang_dialog=");
        LIZ.append(this.content_lang_dialog);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public JourneyContentLanguageWrapper(List<JourneyContentLanguage> list, JourneyContentLanguageExtra journeyContentLanguageExtra) {
        this.content_languages = list;
        this.content_lang_dialog = journeyContentLanguageExtra;
    }
}
