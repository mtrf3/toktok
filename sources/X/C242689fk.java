package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;

/* renamed from: X.9fk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C242689fk {
    public static final /* synthetic */ int LIZ = 0;

    public static SY9 LIZIZ(Context context, Aweme aweme) {
        int i;
        Integer valueOf;
        if (context == null) {
            return null;
        }
        C2068389v c2068389v = new C2068389v();
        if (aweme.getUserDigg() == 1) {
            i = R.raw.icon_like_fill;
        } else {
            i = R.raw.icon_like_bold;
        }
        c2068389v.LIZ = i;
        if (aweme.getUserDigg() == 1) {
            valueOf = Integer.valueOf(R.attr.eb);
        } else {
            valueOf = Integer.valueOf(R.attr.dj);
        }
        c2068389v.LJ = valueOf;
        float f = 14;
        c2068389v.LIZIZ = C05040Hs.LIZ(1, f);
        c2068389v.LIZJ = C05040Hs.LIZ(1, f);
        return c2068389v.LIZ(context);
    }

    public static Drawable LIZ(Context context, Aweme aweme, int i) {
        if (context == null) {
            return null;
        }
        if (aweme.getUserDigg() == 1) {
            return C04270Et.LIZIZ(context, R.drawable.c2i);
        }
        return C04270Et.LIZIZ(context, i);
    }
}
