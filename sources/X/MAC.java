package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.core.model.SearchWidgetModel;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MAC {
    public static final /* synthetic */ int LIZ = 0;

    public static void LJI(String str) {
        C93833mF LJJJLIIL = C113554cx.LJJJLIIL();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("widget_type", str);
        c188727au.LJIIIZ("add_widget_type", MA8.LIZ(str));
        c188727au.LJIIIZ("event_type", "search_widget_delete");
        LIZ(c188727au, LJJJLIIL);
        FMX.LJIIL("search_widget", c188727au.LIZ);
        C188727au c188727au2 = new C188727au();
        c188727au2.LJIIIZ("widget_type", str);
        c188727au2.LJIIIZ("action_type", "deleted");
        LIZ(c188727au2, LJJJLIIL);
        FMX.LJIIL("widget_action", c188727au2.LIZ);
    }

    public static void LIZ(C188727au c188727au, java.util.Map map) {
        if (!map.isEmpty()) {
            c188727au.LJIIIIZZ(map);
        }
    }

    public static void LIZJ(java.util.Map extraData, boolean z) {
        int i;
        o.LJIIIZ(extraData, "extraData");
        C188727au c188727au = new C188727au();
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        c188727au.LIZLLL(i, "has_widget");
        LIZ(c188727au, extraData);
        FMX.LJIIL("launch_widget_info", c188727au.LIZ);
    }

    public static void LIZLLL(int i, java.util.Map extraData) {
        o.LJIIIZ(extraData, "extraData");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("widget_kind", "search");
        c188727au.LIZLLL(i, "widget_size");
        LIZ(c188727au, extraData);
        FMX.LJIIL("launch_widget_subinfo", c188727au.LIZ);
    }

    public static void LJ(String str, java.util.Map extraData) {
        String str2;
        o.LJIIIZ(extraData, "extraData");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("widget_type", str);
        c188727au.LJIIIZ("add_widget_type", MA8.LIZ(str));
        c188727au.LJIIIZ("event_type", "search_widget_create");
        LIZ(c188727au, extraData);
        FMX.LJIIL("search_widget", c188727au.LIZ);
        C188727au c188727au2 = new C188727au();
        c188727au2.LJIIIZ("widget_kind", "search");
        c188727au2.LJIIIZ("widget_type", str);
        c188727au2.LJIIIZ("add_widget_type", MA8.LIZ(str));
        if (o.LJ(str, "recom_word_with_default")) {
            str2 = "2";
        } else if (o.LJ(str, "function_entry_medium")) {
            str2 = "1";
        } else {
            str2 = "";
        }
        c188727au2.LJI("widget_size", str2);
        LIZ(c188727au2, extraData);
        FMX.LJIIL("widget_added", c188727au2.LIZ);
    }

    public static void LIZIZ(String str, String str2, boolean z, java.util.Map extraData) {
        String str3;
        String str4;
        o.LJIIIZ(extraData, "extraData");
        if (z) {
            str3 = "enter_search_blankpage";
        } else {
            str3 = "enter_search";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "search_widget");
        c188727au.LJIIIZ("widget_type", str2);
        c188727au.LJIIIZ("add_widget_type", MA8.LIZ(str2));
        if (str == null) {
            str = "";
        }
        c188727au.LJIIIZ("words_content", str);
        if (z) {
            if (Z9N.LIZIZ.LJII()) {
                str4 = "1";
            } else {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            c188727au.LJI("has_coin_task", str4);
            c188727au.LJI("enter_from_sub", "app_outside");
            c188727au.LJI("enter_method", "enter");
        }
        LIZ(c188727au, extraData);
        FMX.LJIIL(str3, c188727au.LIZ);
    }

    public static void LJFF(SearchWidgetModel searchWidgetModel, String str, String str2, java.util.Map extraData) {
        o.LJIIIZ(extraData, "extraData");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("widget_type", str);
        c188727au.LJIIIZ("add_widget_type", MA8.LIZ(str));
        c188727au.LJIIIZ("widget_click_type", str2);
        if (searchWidgetModel != null) {
            c188727au.LJI("words_content", searchWidgetModel.getFirstGuessWord());
            c188727au.LJI("group_id", searchWidgetModel.getFirstGroupId());
        } else if (!extraData.isEmpty()) {
            c188727au.LJIIIIZZ(extraData);
        }
        c188727au.LJIIIZ("event_type", "search_widget_click");
        FMX.LJIIL("search_widget", c188727au.LIZ);
    }

    public static void LJII(SearchWidgetModel searchWidgetModel, String str, String type, java.util.Map extraData) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(extraData, "extraData");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("search_position", "search_widget");
        c188727au.LJIIIZ("widget_type", type);
        c188727au.LJIIIZ("add_widget_type", MA8.LIZ(str));
        if (searchWidgetModel != null) {
            c188727au.LIZLLL(0, "words_position");
            c188727au.LJI("words_content", searchWidgetModel.getFirstGuessWord());
            c188727au.LJI("group_id", searchWidgetModel.getFirstGroupId());
            c188727au.LJI("words_source", "widget_default_search_keyword");
            c188727au.LJI("impr_id", searchWidgetModel.getLogId());
        } else {
            c188727au.LJIIIIZZ(extraData);
        }
        FMX.LJIIL("trending_words_click", c188727au.LIZ);
    }

    public static void LJIIIIZZ(SearchWidgetModel searchWidgetModel, String str, String wordsSource, java.util.Map extraData) {
        String str2;
        String str3;
        o.LJIIIZ(extraData, "extraData");
        o.LJIIIZ(wordsSource, "wordsSource");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("search_position", "search_widget");
        c188727au.LJIIIZ("words_source", wordsSource);
        c188727au.LJIIIZ("widget_type", str);
        c188727au.LJIIIZ("add_widget_type", MA8.LIZ(str));
        if (extraData.isEmpty()) {
            c188727au.LIZLLL(0, "words_position");
            String str4 = null;
            if (searchWidgetModel != null) {
                str2 = searchWidgetModel.getFirstGuessWord();
            } else {
                str2 = null;
            }
            c188727au.LJI("words_content", str2);
            if (searchWidgetModel != null) {
                str3 = searchWidgetModel.getFirstGroupId();
            } else {
                str3 = null;
            }
            c188727au.LJI("group_id", str3);
            if (searchWidgetModel != null) {
                str4 = searchWidgetModel.getLogId();
            }
            c188727au.LJI("impr_id", str4);
        } else {
            c188727au.LJIIIIZZ(extraData);
        }
        FMX.LJIIL("trending_words_show", c188727au.LIZ);
    }
}
