package X;

import android.text.Html;
import android.text.Spanned;

/* renamed from: X.0gG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13680gG {
    public static Spanned LIZ(String str, int i) {
        return Html.fromHtml(str, i);
    }

    public static String LIZJ(Spanned spanned, int i) {
        return Html.toHtml(spanned, i);
    }

    public static Spanned LIZIZ(String str, int i, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
        return Html.fromHtml(str, i, imageGetter, tagHandler);
    }
}
