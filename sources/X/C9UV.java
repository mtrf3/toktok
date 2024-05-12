package X;

import android.view.View;
import com.bytedance.keva.Keva;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.9UV, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9UV {
    public static int LIZ;
    public static final Keva LIZIZ = Keva.getRepo("prompt_repo");

    public static void LIZ(View view, String str) {
        if (view == null) {
            return;
        }
        String string = view.getContext().getString(R.string.jhr, 20);
        o.LJIIIIZZ(string, "view.context.getString(R…, PROMPT_COUNT_MAX_LIMIT)");
        C26045AKb c26045AKb = new C26045AKb(view);
        c26045AKb.LJIIIZ(string);
        c26045AKb.LIZLLL(3000L);
        c26045AKb.LJIIJ();
        C26244ARs.LJIIIZ(str, "reach_limit");
    }
}
