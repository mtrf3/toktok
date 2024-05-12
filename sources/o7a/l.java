package o7a;

import X.C73305Spp;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;
import p8.a;

/* loaded from: classes2.dex */
public final class l {
    public static void LIZ(a.c cVar, C73305Spp c73305Spp, ViewGroup.LayoutParams layoutParams) {
        if (o.LJ("app:tux_layoutVariant", "app:tux_layoutVariant")) {
            String str = cVar.LIZ;
            if (o.LJ(str, "fixed_height")) {
                c73305Spp.setLayoutVariant(0);
            } else {
                if (!o.LJ(str, "hug_content")) {
                    return;
                }
                c73305Spp.setLayoutVariant(1);
            }
        }
    }
}
