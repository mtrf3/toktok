package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.AAn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25797AAn {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.bytedance.router.SmartRoute] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    public static SmartRoute LIZ(Context context, PushSettings settings, String enterFrom) {
        ?? selectedDoNotTranslateLanguages;
        o.LJIIIZ(settings, "settings");
        o.LJIIIZ(enterFrom, "enterFrom");
        List allDoNotTranslateLanguages = settings.allDoNotTranslate;
        if (allDoNotTranslateLanguages == null) {
            allDoNotTranslateLanguages = C61878OQg.INSTANCE;
        }
        String[] LJIIIIZZ = C25792AAi.LIZ().LJIIIIZZ();
        if (LJIIIIZZ == null || (selectedDoNotTranslateLanguages = ORY.LJJZZIII(LJIIIIZZ)) == 0) {
            List<ContentLanguage> list = settings.selectedDoNotTranslate;
            if (list != null) {
                selectedDoNotTranslateLanguages = new ArrayList(C32I.LJJL(list, 10));
                Iterator<ContentLanguage> it = list.iterator();
                while (it.hasNext()) {
                    selectedDoNotTranslateLanguages.add(it.next().getLanguageCode());
                }
            } else {
                selectedDoNotTranslateLanguages = C61878OQg.INSTANCE;
            }
        }
        o.LJIIIZ(allDoNotTranslateLanguages, "allDoNotTranslateLanguages");
        o.LJIIIZ(selectedDoNotTranslateLanguages, "selectedDoNotTranslateLanguages");
        ?? buildRoute = SmartRouter.buildRoute(context, "//do_not_translate/language/setting");
        buildRoute.withParam("selected_do_not_translate_codes", (String[]) selectedDoNotTranslateLanguages.toArray(new String[0]));
        buildRoute.withParam("all_do_not_translate", allDoNotTranslateLanguages.toArray(new ContentLanguage[0]));
        buildRoute.withParam("enter_from", enterFrom);
        return buildRoute;
    }
}
