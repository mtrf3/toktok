package X;

import android.content.Context;
import com.ss.android.ugc.aweme.search.core.model.SearchWidgetModel;
import com.ss.android.ugc.aweme.search.core.ui.SearchMIUIWidgetProvider;
import kotlin.jvm.internal.o;

/* renamed from: X.2lZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67932lZ {
    public static XKQ LIZ;
    public static volatile C67942la<SearchWidgetModel> LIZIZ = new C67942la<>();

    static {
        new C73893SzJ();
    }

    public static void LIZJ(Context context) {
        o.LJIIIZ(context, "context");
        if (o.LJ("widget_preinstall_blank_page", "no_search")) {
            LIZIZ.LIZ = 1;
            LIZ(context, "widget_preinstall_blank_page");
            return;
        }
        XKQ xkq = LIZ;
        if (xkq != null && !xkq.isCancelled()) {
            XKQ xkq2 = LIZ;
            if (xkq2 != null) {
                xkq2.LIZIZ(null);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        LIZ = XKX.LIZLLL(C780334l.LJLIL, C36636EZk.LIZ, null, new C67892lV(context, "widget_preinstall_blank_page", null), 2);
    }

    public static void LIZ(Context context, String reqSource) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(reqSource, "reqSource");
        if (o.LJ(reqSource, "widget_preinstall_blank_page")) {
            C56374MAo.LIZLLL(context, "com.ss.android.ugc.tiktok.app.widget.SEARCH_WIDGET_CHECK_STATE", C47261Igj.LJJIJ(new SearchMIUIWidgetProvider()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZIZ(String reqSource, SearchWidgetModel searchWidgetModel, boolean z) {
        int i;
        o.LJIIIZ(reqSource, "reqSource");
        int i2 = 2;
        if (o.LJ(reqSource, "widget_preinstall_blank_page")) {
            C67942la<SearchWidgetModel> c67942la = LIZIZ;
            T t = searchWidgetModel;
            if (!z) {
                t = 0;
            }
            c67942la.getClass();
            if (t == 0) {
                i = 3;
            } else {
                i = 2;
            }
            c67942la.LIZ = i;
            c67942la.LIZIZ = t;
        }
        if (o.LJ(reqSource, "widget_preinstall_blank_page")) {
            C67942la<SearchWidgetModel> c67942la2 = LIZIZ;
            if (!z) {
                i2 = 3;
            }
            c67942la2.LIZ = i2;
        }
    }
}
