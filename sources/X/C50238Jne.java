package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Jne, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50238Jne {
    public static final List<String> LIZ = C47261Igj.LJJIJ("fe_tiktok_lynx_search_transfer");

    public static final String LIZLLL() {
        CharSequence charSequence;
        SearchResultActivity LJ = C50989Jzl.LJ();
        if (LJ != null) {
            charSequence = C79045V0n.LJIIJJI(LJ);
        } else {
            charSequence = null;
        }
        if (TextUtils.equals(charSequence, "TikTok Theme Dark")) {
            return "dark";
        }
        return "light";
    }

    public static final boolean LJ() {
        return o.LJ(LIZLLL(), "dark");
    }

    public static final C50240Jng LIZIZ(Context ctx) {
        int i;
        o.LJIIIZ(ctx, "ctx");
        Integer LJI = C79045V0n.LJI(R.attr.cl, new ContextThemeWrapper(ctx, R.style.ux));
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        return new C50240Jng("dark", i, null, Boolean.FALSE);
    }

    public static final C50240Jng LIZJ(Context ctx) {
        int i;
        o.LJIIIZ(ctx, "ctx");
        Integer LJI = C79045V0n.LJI(R.attr.cl, ctx);
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        return new C50240Jng("light", i, null, Boolean.FALSE);
    }

    public static final View LIZ(int i, LayoutInflater inflater, ViewGroup container) {
        View LLLLIILL;
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        if (o.LJ(LIZLLL(), "dark")) {
            Context context = container.getContext();
            o.LJIIIIZZ(context, "container.context");
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.ux);
            if (C49500Jbk.LIZ()) {
                LLLLIILL = C38619FDr.LIZIZ(i, contextThemeWrapper, container, false);
            } else {
                LLLLIILL = C16880lQ.LLLLIILL(inflater.cloneInContext(contextThemeWrapper), i, container, false);
            }
            o.LJIIIIZZ(LLLLIILL, "{\n            val themeW…)\n            }\n        }");
        } else {
            if (C49500Jbk.LIZ()) {
                Context context2 = inflater.getContext();
                o.LJIIIIZZ(context2, "inflater.context");
                LLLLIILL = C38619FDr.LIZIZ(i, context2, container, false);
            } else {
                LLLLIILL = C16880lQ.LLLLIILL(inflater, i, container, false);
            }
            o.LJIIIIZZ(LLLLIILL, "{\n            if (Search…)\n            }\n        }");
        }
        return LLLLIILL;
    }
}
