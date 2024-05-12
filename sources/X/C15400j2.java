package X;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* renamed from: X.0j2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15400j2 {
    public static final Drawable LIZ(int i) {
        Context LIZLLL = C15380j0.LIZLLL();
        if (LIZLLL == null) {
            return null;
        }
        try {
            if (LIZLLL.getResources() == null) {
                return null;
            }
            return LIZLLL.getResources().getDrawable(i);
        } catch (Exception unused) {
            return null;
        }
    }
}
