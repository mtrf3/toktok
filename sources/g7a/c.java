package g7a;

import X.C141415gn;
import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.tux.tag.TuxTag;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class c {
    public static void LIZ(String str, p8.a aVar, TuxTag tuxTag, ViewGroup.LayoutParams layoutParams) {
        int i;
        int hashCode = str.hashCode();
        if (hashCode != -1036066630) {
            if (hashCode != -834883116) {
                if (hashCode != 400734493 || !str.equals("app:tux_tagTextColor")) {
                    return;
                }
                Context context = tuxTag.getContext();
                o.LJIIIIZZ(context, "view.context");
                tuxTag.setTagTextColor(q8.a.LIZIZ(context, aVar));
                return;
            }
            if (!str.equals("app:tux_backgroundColor")) {
                return;
            }
            Context context2 = tuxTag.getContext();
            o.LJIIIIZZ(context2, "view.context");
            tuxTag.setTagBackgroundColor(q8.a.LIZIZ(context2, aVar));
            return;
        }
        if (!str.equals("app:tux_tagSize")) {
            return;
        }
        String str2 = aVar.LIZ;
        o.LJIIIIZZ(str2, "value.value");
        Locale locale = Locale.ROOT;
        String LIZIZ = C141415gn.LIZIZ(locale, "ROOT", str2, locale, "this as java.lang.String).toLowerCase(locale)");
        switch (LIZIZ.hashCode()) {
            case -1078030475:
                if (!LIZIZ.equals("medium")) {
                    return;
                }
                i = 2;
                break;
            case 3560192:
                if (!LIZIZ.equals("tiny")) {
                    return;
                }
                i = 0;
                break;
            case 102742843:
                if (!LIZIZ.equals("large")) {
                    return;
                }
                i = 3;
                break;
            case 109548807:
                if (!LIZIZ.equals("small")) {
                    return;
                }
                i = 1;
                break;
            default:
                return;
        }
        tuxTag.setTagSize(i);
    }
}
