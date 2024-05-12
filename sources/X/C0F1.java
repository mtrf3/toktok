package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.0F1, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C0F1 {
    public static Uri.Builder LIZ(String str) {
        return new Uri.Builder().scheme(str);
    }

    public static boolean LIZIZ(View view, String str) {
        Context context = view.getContext();
        o.LJIIIIZZ(context, str);
        return AnonymousClass636.LJIILJJIL(context);
    }
}
