package X;

import android.view.View;

/* renamed from: X.NhM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60040NhM {
    public static String LIZ(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility != 0) {
            return visibility != 4 ? visibility != 8 ? "viewNotVisible" : "viewGone" : "viewInvisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }
}
