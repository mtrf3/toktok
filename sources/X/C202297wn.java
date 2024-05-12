package X;

import Y.ARunnableS39S0100000_3;
import android.view.View;

/* renamed from: X.7wn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202297wn {
    public static void LIZ(View view) {
        if (view == null) {
            return;
        }
        view.animate().scaleX(0.8f).scaleY(0.8f).setDuration(80L).withEndAction(new ARunnableS39S0100000_3(view, 198)).start();
    }
}
