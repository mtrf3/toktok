package f87;

import android.content.Context;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import p8.a;

/* loaded from: classes9.dex */
public final class n {
    public static void LIZ(String str, a aVar, CardView cardView, ViewGroup.LayoutParams layoutParams) {
        Context context = cardView.getContext();
        String LJ = q8.a.LJ(str);
        int hashCode = LJ.hashCode();
        if (hashCode != 504672677) {
            if (hashCode != 873639543) {
                if (hashCode != 1488078125 || !LJ.equals("cardElevation")) {
                    return;
                }
                kotlin.jvm.internal.o.LJIIIIZZ(context, "context");
                cardView.setCardElevation(q8.a.LIZJ(context, aVar));
                return;
            }
            if (!LJ.equals("cardCornerRadius")) {
                return;
            }
            kotlin.jvm.internal.o.LJIIIIZZ(context, "context");
            cardView.setRadius(q8.a.LIZJ(context, aVar));
            return;
        }
        if (!LJ.equals("cardBackgroundColor")) {
            return;
        }
        kotlin.jvm.internal.o.LJIIIIZZ(context, "context");
        cardView.setCardBackgroundColor(q8.a.LIZIZ(context, aVar));
    }
}
