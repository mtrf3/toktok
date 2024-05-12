package lda;

import X.C018905p;
import X.C119354mJ;
import X.O6R;
import android.content.Context;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class a {
    public static void LIZ(String str, p8.a aVar, C119354mJ c119354mJ, C018905p c018905p) {
        Context context = c119354mJ.getContext();
        switch (str.hashCode()) {
            case -1021999200:
                if (!str.equals("app:statusStrokeColor")) {
                    return;
                }
                o.LJIIIIZZ(context, "context");
                c119354mJ.setStrokeColor(q8.a.LIZIZ(context, aVar));
                return;
            case -306311534:
                if (!str.equals("app:activeStatusColor")) {
                    return;
                }
                o.LJIIIIZZ(context, "context");
                c119354mJ.setActiveStatusColor(q8.a.LIZIZ(context, aVar));
                return;
            case 332870221:
                if (!str.equals("app:inactiveStatusColor")) {
                    return;
                }
                o.LJIIIIZZ(context, "context");
                c119354mJ.setInactiveStatusColor(q8.a.LIZIZ(context, aVar));
                return;
            case 544073831:
                if (!str.equals("app:drawStatusStroke")) {
                    return;
                }
                c119354mJ.setDrawStroke(q8.a.LIZ(aVar));
                return;
            case 600946460:
                if (!str.equals("statusStrokeWidth")) {
                    return;
                }
                o.LJIIIIZZ(context, "context");
                c119354mJ.setStrokeWidth(O6R.LJJIIZ(q8.a.LIZJ(context, aVar)));
                return;
            default:
                return;
        }
    }
}
