package X;

import android.graphics.Typeface;
import kotlin.jvm.internal.o;

/* renamed from: X.0fr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13430fr {
    public static final C13430fr LIZ = new C13430fr();

    public static final Typeface LIZ(Typeface typeface, int i, boolean z) {
        o.LJIIIZ(typeface, "typeface");
        Typeface create = Typeface.create(typeface, i, z);
        o.LJIIIIZZ(create, "create(typeface, finalFontWeight, finalFontStyle)");
        return create;
    }
}
