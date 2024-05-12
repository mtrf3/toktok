package X;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.jvm.internal.o;

/* renamed from: X.0fm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13380fm {
    public static final C13380fm LIZ = new C13380fm();

    public static final Typeface LIZ(Context context, C32961Rc font) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(font, "font");
        Typeface font2 = context.getResources().getFont(0);
        o.LJIIIIZZ(font2, "context.resources.getFont(font.resId)");
        return font2;
    }
}
