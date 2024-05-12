package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.i18n.I18nDbManager;
import com.bytedance.android.livesdk.i18n.I18nUpdateManager;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: X.Y7x, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86881Y7x {
    public static C86881Y7x LJII;
    public long LIZIZ;
    public I18nUpdateManager LIZLLL;
    public I18nDbManager LJFF;
    public String LIZ = "";
    public java.util.Map<String, String> LIZJ = new HashMap();
    public final Y80 LJ = new Y80(this);
    public final Y81 LJI = new Y81(this);

    public static C86881Y7x LIZIZ() {
        if (LJII == null) {
            LJII = new C86881Y7x();
        }
        return LJII;
    }

    public final String LIZ(String str) {
        if (!this.LIZJ.containsKey(str)) {
            I18nUpdateManager i18nUpdateManager = this.LIZLLL;
            if (i18nUpdateManager != null) {
                i18nUpdateManager.LIZIZ(this.LIZIZ);
                return null;
            }
            return null;
        }
        return this.LIZJ.get(str);
    }

    public final void LIZJ(Locale locale) {
        C0NB.LIZIZ("i18n_translation", "wanna switch locale");
        if (locale == null) {
            C0NB.LJ("i18n_translation", "new locale is empty, return");
            return;
        }
        C39399FdD.LIZIZ.getClass();
        String lowerCase = C39567Ffv.LIZIZ(locale).toLowerCase();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(locale.getLanguage());
        LIZ.append("_");
        LIZ.append(lowerCase);
        String LIZIZ = X1D.LIZIZ(LIZ);
        C279017q.LJ("new locale is ", LIZIZ, "i18n_translation");
        if (TextUtils.equals(LIZIZ, this.LIZ)) {
            C0NB.LIZIZ("i18n_translation", "new locale is equals to current locale, return");
            return;
        }
        I18nUpdateManager i18nUpdateManager = this.LIZLLL;
        if (i18nUpdateManager != null) {
            C0NB.LIZIZ("i18n_translation", "I18nUpdateManager destroy");
            i18nUpdateManager.LIZIZ.removeCallbacksAndMessages(null);
            C73411SrX c73411SrX = i18nUpdateManager.LJII;
            if (c73411SrX != null && !c73411SrX.isDisposed()) {
                i18nUpdateManager.LJII.dispose();
            }
            i18nUpdateManager.LIZJ = null;
        }
        I18nDbManager i18nDbManager = this.LJFF;
        if (i18nDbManager != null) {
            i18nDbManager.destroy();
        }
        this.LIZJ.clear();
        this.LIZIZ = 0L;
        this.LJFF = new I18nDbManager(LIZIZ, this.LJI);
        this.LIZLLL = new I18nUpdateManager(LIZIZ, this.LJ);
        if (TextUtils.isEmpty(this.LIZ)) {
            C0NB.LIZIZ("i18n_translation", "switch locale when app start, first query db");
            this.LJFF.queryTranslations();
        } else {
            C0NB.LIZIZ("i18n_translation", "switch locale during app running, directly query api");
            this.LIZLLL.LIZIZ(this.LIZIZ);
        }
        this.LIZ = LIZIZ;
    }
}
