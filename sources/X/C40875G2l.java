package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.ss.android.ugc.aweme.journey.step.lynx.LynxExperienceBridge;
import com.ss.android.ugc.aweme.plugin.journey.JourneyContentLanguage;
import com.ss.android.ugc.aweme.plugin.journey.JourneyContentLanguageExtra;
import com.ss.android.ugc.aweme.plugin.journey.JourneyContentLanguageWrapper;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.G2l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40875G2l implements InterfaceC40880G2q {
    public int LIZ = -1;

    @Override // X.InterfaceC40880G2q
    public final String getName() {
        return "onboarding.getLanguages";
    }

    @Override // X.InterfaceC40880G2q
    public final void LIZ(ReadableMap params, Callback callback) {
        String str;
        String str2;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(callback, "callback");
        try {
            Object LJII = new Gson().LJII(LynxExperienceBridge.keva.getString("content_languages", null), new C40876G2m().getType());
            o.LJIIIIZZ(LJII, "Gson().fromJson(contentLang, itemType)");
            JourneyContentLanguageWrapper journeyContentLanguageWrapper = (JourneyContentLanguageWrapper) LJII;
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            List<JourneyContentLanguage> list = journeyContentLanguageWrapper.content_languages;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
                    javaOnlyMap.put("localizedDisplayName", ((JourneyContentLanguage) ListProtector.get(list, i)).local_name);
                    javaOnlyMap.put("displayName", ((JourneyContentLanguage) ListProtector.get(list, i)).en_name);
                    javaOnlyMap.put("languageCode", ((JourneyContentLanguage) ListProtector.get(list, i)).code);
                    javaOnlyMap.put("selected", Boolean.FALSE);
                    javaOnlyArray.add(javaOnlyMap);
                }
                this.LIZ = javaOnlyArray.size();
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", "new_user_journey");
                c188727au.LIZLLL(0, "selected_languages_count");
                c188727au.LIZLLL(this.LIZ, "content_languages_count");
                FMX.LJIIL("lynx_get_languages", c188727au.LIZ);
                JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
                javaOnlyMap2.put("contentLanguages", javaOnlyArray);
                JourneyContentLanguageExtra journeyContentLanguageExtra = journeyContentLanguageWrapper.content_lang_dialog;
                String str3 = "";
                if (journeyContentLanguageExtra == null || (str = journeyContentLanguageExtra.title) == null) {
                    str = "";
                }
                javaOnlyMap2.put("contentLangDialogTitle", str);
                JourneyContentLanguageExtra journeyContentLanguageExtra2 = journeyContentLanguageWrapper.content_lang_dialog;
                if (journeyContentLanguageExtra2 != null && (str2 = journeyContentLanguageExtra2.text) != null) {
                    str3 = str2;
                }
                javaOnlyMap2.put("contentLangDialogText", str3);
                JavaOnlyMap javaOnlyMap3 = new JavaOnlyMap();
                javaOnlyMap3.put("code", 1);
                javaOnlyMap3.put("data", javaOnlyMap2);
                callback.invoke(javaOnlyMap3);
            }
        } catch (Exception unused) {
            C188727au c188727au2 = new C188727au();
            c188727au2.LJIIIZ("enter_from", "new_user_journey");
            c188727au2.LJIIIZ("params", params.toString());
            FMX.LJIIL("lynx_content_language_parsing_exception", c188727au2.LIZ);
        }
    }
}
