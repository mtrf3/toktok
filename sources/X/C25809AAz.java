package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.trill.setting.TranslationLanguageSettingPage;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.AAz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25809AAz {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[], java.io.Serializable] */
    public static SmartRoute LIZ(Context context, PushSettings settings, String str, String enterMethod) {
        o.LJIIIZ(settings, "settings");
        o.LJIIIZ(enterMethod, "enterMethod");
        List<ContentLanguage> list = settings.translationLanguage;
        o.LJIIIIZZ(list, "settings.translationLanguage");
        String LIZ = SharePrefCache.inst().getSelectedTranslationLanguage().LIZ();
        TranslationLanguageSettingPage.LJLLLL = LIZ;
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//translation/language/setting");
        buildRoute.withParam("translation_language", (Serializable) list.toArray(new ContentLanguage[0]));
        buildRoute.withParam("selected_translation_language_code", LIZ);
        buildRoute.withParam("enter_method", enterMethod);
        buildRoute.withParam("enter_from", str);
        return buildRoute;
    }
}
