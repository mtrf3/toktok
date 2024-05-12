package X;

import android.content.Context;
import com.ss.android.ugc.aweme.search.core.model.SearchWidgetModel;
import com.ss.android.ugc.aweme.search.core.ui.SearchMIUIWidgetProvider;
import com.ss.android.ugc.aweme.search.core.ui.SearchMiddleWidget;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes10.dex */
public final class MAR {
    public static volatile boolean LIZIZ;
    public static XKQ LIZLLL;
    public static final MAR LIZ = new MAR();
    public static volatile C67942la<SearchWidgetModel> LIZJ = new C67942la<>();

    public static String LIZ() {
        if (LIZJ.LIZIZ == null) {
            return "";
        }
        SearchWidgetModel searchWidgetModel = LIZJ.LIZIZ;
        if (searchWidgetModel != null) {
            return searchWidgetModel.getFirstGuessWord();
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0111, code lost:
    
        if (r5 > 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010f, code lost:
    
        if (r6 == 0) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(android.content.Context r13) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MAR.LIZIZ(android.content.Context):void");
    }

    public static void LIZJ(Context context, String str) {
        String str2;
        if (o.LJ(str, "widget_preinstall_blank_page")) {
            if (AV1.LJIILLIIL() || a.LJIIIZ().LIZJ()) {
                str2 = "com.ss.android.ugc.tiktok.app.widget.SEARCH_SUGGEST_LIST_WIDGET_NO_SEARCH";
            } else {
                str2 = "com.ss.android.ugc.tiktok.app.widget.SEARCH_SUGGEST_LIST_WIDGET_UPDATE";
            }
            C56374MAo.LIZLLL(context, str2, C47261Igj.LJJIJ(new SearchMIUIWidgetProvider()));
            return;
        }
        C56374MAo.LIZLLL(context, "com.ss.android.ugc.tiktok.app.widget.SEARCH_WIDGET_CHECK_STATE", C47261Igj.LJJIJ(new SearchMiddleWidget()));
    }

    public static void LIZLLL(MAR mar, Context context) {
        mar.getClass();
        o.LJIIIZ(context, "context");
        if (!LIZIZ) {
            mar.LIZIZ(context);
            return;
        }
        if (AV1.LJIILLIIL() || a.LJIIIZ().LIZJ()) {
            LIZJ.LIZ = 1;
            LIZJ(context, "widget_blank_page");
            return;
        }
        if (LIZJ.LIZIZ == null) {
            LIZJ.LIZ = 3;
            LIZJ(context, "widget_blank_page");
        }
        XKQ xkq = LIZLLL;
        if (xkq != null && !xkq.isCancelled()) {
            XKQ xkq2 = LIZLLL;
            if (xkq2 != null) {
                xkq2.LIZIZ(null);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        LIZLLL = XKX.LIZLLL(C780334l.LJLIL, C36636EZk.LIZ, null, new C66652jV(context, null), 2);
    }
}
