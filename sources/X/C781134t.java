package X;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.34t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C781134t {
    public static boolean LIZ;

    static {
        new HashMap();
    }

    public static void LIZIZ(ViewGroup viewGroup) {
        View findViewById;
        if (viewGroup != null && (findViewById = viewGroup.findViewById(R.id.b6q)) != null) {
            ViewParent parent = findViewById.getParent();
            if (parent instanceof ViewGroup) {
                C16880lQ.LJLLL(findViewById, (ViewGroup) parent);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.app.Activity] */
    /* JADX WARN: Type inference failed for: r12v1, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r12v2, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.34v, T, android.view.View] */
    public static void LIZ(ViewGroup viewGroup, Activity activity) {
        ?? r0;
        String str;
        C71082qe c71082qe = C71042qa.LIZIZ;
        if (c71082qe == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C68322mC c68322mC = new C68322mC();
        String str2 = null;
        if (viewGroup != 0) {
            r0 = viewGroup.findViewById(R.id.b6q);
        } else {
            r0 = 0;
        }
        c68322mC.element = r0;
        if (r0 != 0 && viewGroup != 0) {
            C16880lQ.LJLLL(r0, viewGroup);
        }
        if (activity != 0 || (viewGroup != 0 && (activity = viewGroup.getContext()) != 0)) {
            ?? c781334v = new C781334v(activity, false);
            c781334v.setId(R.id.b6q);
            c68322mC.element = c781334v;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            float LJIJJLI = C17N.LJIJJLI(49);
            try {
                Resources resources = activity.getResources();
                if (resources != null) {
                    LJIJJLI = resources.getDimension(R.dimen.a8c);
                }
            } catch (Resources.NotFoundException unused) {
            }
            layoutParams.bottomMargin = (int) LJIJJLI;
            if (viewGroup != 0) {
                viewGroup.addView((View) c68322mC.element, layoutParams);
            }
            Object obj = c68322mC.element;
            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.casting.ui.playback.PlaybackControlLayout");
            ((View) obj).setZ(2.0f);
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        Aweme aweme = c71082qe.LIZJ.LIZIZ;
        if (aweme != null) {
            str = aweme.getGroupId();
        } else {
            str = null;
        }
        Aweme aweme2 = c71082qe.LIZJ.LIZIZ;
        if (aweme2 != null) {
            str2 = aweme2.getAuthorUid();
        }
        C779634e.LIZIZ(c71082qe.LIZJ.LIZJ, str, str2, c71082qe.LIZIZ.LJIIIIZZ(), Integer.valueOf(EF7.LJIIIZ), currentTimeMillis2);
    }
}
