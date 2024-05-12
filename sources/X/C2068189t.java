package X;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.89t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2068189t {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C47121t6 c47121t6, int i, Drawable drawable) {
        o.LJIIIZ(c47121t6, "<this>");
        String string = c47121t6.getContext().getString(i);
        o.LJIIIIZZ(string, "context.getString(rawTextId)");
        SpannableString valueOf = SpannableString.valueOf(string);
        o.LJIIIIZZ(valueOf, "SpannableString.valueOf(this)");
        int LJJLIIIJL = s.LJJLIIIJL(string, "{icon}", 0, false, 6);
        if (LJJLIIIJL != -1) {
            valueOf.setSpan(new C8FR(drawable, 2), LJJLIIIJL, LJJLIIIJL + 6, 33);
        }
        c47121t6.setText(valueOf);
    }
}
