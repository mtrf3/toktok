package og7;

import X.C29306Beo;
import X.C47121t6;
import X.C49616Jdc;
import X.O6R;
import android.content.Context;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class f {
    public static void LIZ(String str, p8.a aVar, C47121t6 c47121t6, ViewGroup.LayoutParams layoutParams) {
        String LJ = q8.a.LJ(str);
        int hashCode = LJ.hashCode();
        if (hashCode != -515807685) {
            if (hashCode != 365645865) {
                if (hashCode != 930483431 || !LJ.equals("layout_marginHorizontal")) {
                    return;
                }
                Context context = c47121t6.getContext();
                o.LJIIIIZZ(context, "view.context");
                int LJJIIZ = O6R.LJJIIZ(q8.a.LIZJ(context, aVar));
                C29306Beo.LJJJJZ(LJJIIZ, LJJIIZ, c47121t6);
                return;
            }
            if (!LJ.equals("fontType")) {
                return;
            }
            c47121t6.setTypeface(C49616Jdc.LIZIZ().LIZLLL(aVar.LIZ));
            return;
        }
        if (!LJ.equals("lineHeight")) {
            return;
        }
        Context context2 = c47121t6.getContext();
        o.LJIIIIZZ(context2, "view.context");
        c47121t6.setLineHeight(O6R.LJJIIZ(q8.a.LIZJ(context2, aVar)));
    }
}
