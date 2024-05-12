package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.5yV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152395yV {
    public final Keva LIZ;

    public final String LIZ() {
        String string = this.LIZ.getString("last_selected_language", "");
        o.LJIIIIZZ(string, "keva.getString(LAST_SELECTED_LANGUAGE, \"\")");
        return string;
    }

    public C152395yV() {
        Keva repo = Keva.getRepo("burned_caption");
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME)");
        this.LIZ = repo;
    }

    public final void LIZIZ(String lang) {
        o.LJIIIZ(lang, "lang");
        this.LIZ.storeString("last_selected_language", lang);
    }
}
