package X;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.nows.feed.optimize.NowFeedXmlPreLoadConfig;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8Ms, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210188Ms {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C210198Mt.LJLIL);
    public static final List<Integer> LIZIZ = C47261Igj.LJJIJIIJI(Integer.valueOf(R.layout.byi), Integer.valueOf(R.layout.by6));
    public static final List<Integer> LIZJ = C47261Igj.LJJIJ(Integer.valueOf(R.layout.bxw));
    public static final List<Integer> LIZLLL = C47261Igj.LJJIJIIJI(Integer.valueOf(R.layout.bxx), Integer.valueOf(R.layout.byg), Integer.valueOf(R.layout.byf));
    public static final List<Integer> LJ;

    static {
        Integer valueOf = Integer.valueOf(R.layout.byp);
        LJ = C47261Igj.LJJIJIIJI(Integer.valueOf(R.layout.byd), Integer.valueOf(R.layout.bye), Integer.valueOf(R.layout.byq), Integer.valueOf(R.layout.byr), Integer.valueOf(R.layout.bxh), Integer.valueOf(R.layout.byc), Integer.valueOf(R.layout.by7), Integer.valueOf(R.layout.by0), Integer.valueOf(R.layout.by1), Integer.valueOf(R.layout.byh), valueOf, valueOf);
    }

    public static C212518Vr LIZJ() {
        C212518Vr c212518Vr = C212518Vr.LIZ;
        if ((((Number) LIZ.getValue()).intValue() & 1) == 1) {
            if (!((NowFeedXmlPreLoadConfig) C210208Mu.LIZIZ.getValue()).getOnlyForNowFeed() || Z89.LIZIZ.LJIIL()) {
                return C8NZ.LIZ;
            }
            return c212518Vr;
        }
        return c212518Vr;
    }

    public static boolean LIZLLL() {
        if ((((Number) LIZ.getValue()).intValue() & 2) == 2) {
            return true;
        }
        return false;
    }

    public static void LIZ(W5F w5f) {
        if (LIZLLL()) {
            w5f.LJ();
        } else {
            C16880lQ.LLJJJ(w5f);
        }
    }

    public static View LIZIZ(Context context, int i, ViewGroup viewGroup, boolean z, LayoutInflater layoutInflater) {
        o.LJIIIZ(context, "context");
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if ((((Number) LIZ.getValue()).intValue() & 1) == 1 && LJIJJ != null && (!((NowFeedXmlPreLoadConfig) C210208Mu.LIZIZ.getValue()).getOnlyForNowFeed() || Z89.LIZIZ.LJIIL())) {
            return C38619FDr.LIZIZ(i, context, viewGroup, z);
        }
        if (layoutInflater == null) {
            layoutInflater = C16880lQ.LLZIL(context);
        }
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, i, viewGroup, z);
        o.LJIIIIZZ(LLLLIILL, "{\n            val nonInf…, attachToRoot)\n        }");
        return LLLLIILL;
    }
}
