package X;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
import kotlin.jvm.internal.AqS145S0200000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WlS, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83226WlS {
    public static C83224WlQ LIZ(Context context, C83221WlN config) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(config, "config");
        AqS145S0200000_14 aqS145S0200000_14 = new AqS145S0200000_14(context, config, 10);
        C83225WlR c83225WlR = new C83225WlR(context);
        aqS145S0200000_14.invoke(c83225WlR);
        C83224WlQ LIZIZ = c83225WlR.LIZIZ();
        TextView textView = LIZIZ.getTextView();
        if (textView != null) {
            if (C82852WfQ.LIZ().LJFF) {
                textView.setTextSize(12.0f);
                C78880UxY.LJLIIL(textView);
            } else {
                textView.setTextSize(11.0f);
                textView.setTypeface(Typeface.defaultFromStyle(0));
            }
        }
        return LIZIZ;
    }
}
