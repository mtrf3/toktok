package X;

import android.content.Context;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.FdK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39406FdK {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZIZ(Locale locale) {
        o.LJIIIZ(locale, "locale");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("starling_patch_tiktok_strings_");
        String lowerCase = LJ(locale).toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        LIZ2.append(lowerCase);
        return X1D.LIZIZ(LIZ2);
    }

    public static String LIZJ(Locale locale) {
        o.LJIIIZ(locale, "locale");
        String channal = LIZIZ(locale);
        o.LJIIIZ(channal, "channal");
        String string = C39408FdM.LIZ.getString(channal, "");
        o.LJIIIIZZ(string, "keva.getString(channal, \"\" )");
        return string;
    }

    public static boolean LIZLLL(Locale curLocale) {
        o.LJIIIZ(curLocale, "curLocale");
        String string = C39408FdM.LIZ.getString(LJ(curLocale), "");
        o.LJIIIIZZ(string, "keva.getString(StringPat…localeString(locale), \"\")");
        return o.LJ(string, EF7.LJ());
    }

    public static String LJ(Locale locale) {
        String LIZIZ;
        o.LJIIIZ(locale, "locale");
        C39399FdD.LIZIZ.getClass();
        if (C39567Ffv.LIZIZ(locale).length() == 0) {
            LIZIZ = "";
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append('-');
            LIZ2.append(C39567Ffv.LIZIZ(locale));
            LIZIZ = X1D.LIZIZ(LIZ2);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(locale.getLanguage());
        LIZ3.append(LIZIZ);
        return X1D.LIZIZ(LIZ3);
    }

    public static void LIZ(Context context, Locale locale) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(locale, "locale");
        String accessKey = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getAccessKey();
        String LIZIZ = LIZIZ(locale);
        C39409FdN c39409FdN = new C39409FdN(context, new C39412FdQ(), LIZIZ, accessKey, locale);
        C61520OCm LIZ2 = O3E.LIZ(accessKey);
        if (LIZ2 != null) {
            LIZ2.LIZIZ("default", C113554cx.LJJLIIIIJ(new OSZ(accessKey, C113554cx.LJJLIIIIJ(new OSZ("release_build", EF7.LJ())))), C113554cx.LJJLIIIIJ(new OSZ(accessKey, C47261Igj.LJJIJIL(new CheckRequestBodyModel.TargetChannel(LIZIZ)))), c39409FdN);
        }
    }
}
