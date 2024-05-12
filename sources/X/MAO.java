package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.g;
import com.google.gson.m;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MAO {
    public static final MAO LIZ = new MAO();
    public static final g LIZIZ;

    static {
        g gVar = new g();
        m mVar = new m();
        mVar.LJJIIZ("route", "//main?tab=0&com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB=HOME");
        mVar.LJJIIZ("icon", "https://sf16-va.tiktokcdn.com/obj/eden-va2/aulpsj-ojyhlz/ljhwZthlaukjlkulzlp/widget/Android/app_widget_search_ic_follow.png");
        gVar.LJJII(mVar);
        m mVar2 = new m();
        mVar2.LJJIIZ("route", "aweme://openShoot");
        mVar2.LJJIIZ("icon", "https://sf16-va.tiktokcdn.com/obj/eden-va2/aulpsj-ojyhlz/ljhwZthlaukjlkulzlp/widget/Android/app_widget_search_ic_post.png");
        gVar.LJJII(mVar2);
        m mVar3 = new m();
        mVar3.LJJIIZ("route", "//main?com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB=NOTIFICATION");
        mVar3.LJJIIZ("icon", "https://sf16-va.tiktokcdn.com/obj/eden-va2/aulpsj-ojyhlz/ljhwZthlaukjlkulzlp/widget/Android/app_widget_search_ic_inbox.png");
        gVar.LJJII(mVar3);
        LIZIZ = gVar;
    }

    public static String LIZ(int i) {
        try {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            g gVar = LIZIZ;
            g gVar2 = (g) LIZLLL.LJIIIIZZ("search_widget_panel_config", g.class, gVar);
            if (gVar2 != null) {
                gVar = gVar2;
            }
            String LJJIFFI = gVar.LJJIIZ(i).LJIIZILJ().LJJIJ("icon").LJJIFFI();
            o.LJIIIIZZ(LJJIFFI, "{\n            value.get(…icon\").asString\n        }");
            return LJJIFFI;
        } catch (Exception unused) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return "";
                    }
                    return "https://sf16-va.tiktokcdn.com/obj/eden-va2/aulpsj-ojyhlz/ljhwZthlaukjlkulzlp/widget/Android/app_widget_search_ic_inbox.png";
                }
                return "https://sf16-va.tiktokcdn.com/obj/eden-va2/aulpsj-ojyhlz/ljhwZthlaukjlkulzlp/widget/Android/app_widget_search_ic_post.png";
            }
            return "https://sf16-va.tiktokcdn.com/obj/eden-va2/aulpsj-ojyhlz/ljhwZthlaukjlkulzlp/widget/Android/app_widget_search_ic_follow.png";
        }
    }

    public static String LIZIZ(int i) {
        try {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            g gVar = LIZIZ;
            g gVar2 = (g) LIZLLL.LJIIIIZZ("search_widget_panel_config", g.class, gVar);
            if (gVar2 != null) {
                gVar = gVar2;
            }
            return gVar.LJJIIZ(i).LJIIZILJ().LJJIJ("route").LJJIFFI();
        } catch (Exception unused) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return "//main?com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB=NOTIFICATION";
                    }
                } else {
                    return "aweme://openShoot";
                }
            }
            return "//main?tab=0&com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB=HOME";
        }
    }
}
