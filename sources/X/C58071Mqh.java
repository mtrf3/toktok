package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.badge.TuxAlertBadgeLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Mqh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58071Mqh {
    public static Y4F LIZIZ(Context context, ViewGroup viewGroup) {
        Y4F y4f = (Y4F) C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.c8q, viewGroup, false);
        y4f.setImageResource(R.raw.icon_3pt_collection);
        y4f.setAdditionalSupportImageResource(R.raw.icon_arrow_triangle_down_large_fill);
        y4f.setAnimationEnabled(true);
        C9AE.LIZ(y4f, C9AC.ALPHA, 0.0f);
        return y4f;
    }

    public static LBF LIZ(Context context, int i, ViewGroup viewGroup) {
        LBF lbf = (LBF) C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.c8s, viewGroup, false);
        ((LBE) lbf).setImageResource(i);
        lbf.setAnimationEnabled(true);
        C9AE.LIZ(lbf, C9AC.ALPHA, 0.0f);
        return lbf;
    }

    public static LBF LIZJ(Context context, int i, ViewGroup viewGroup) {
        LBF lbf = (LBF) C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.c8t, viewGroup, false);
        ((LBE) lbf).setImageResource(i);
        lbf.setAnimationEnabled(true);
        C9AE.LIZ(lbf, C9AC.ALPHA, 0.0f);
        return lbf;
    }

    public static Y4F LIZLLL(Context context, ViewGroup viewGroup, String str, Integer num, Boolean bool) {
        Y4F y4f = (Y4F) C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.c8d, viewGroup, false);
        y4f.setAnimationEnabled(true);
        TextView textView = (TextView) y4f.findViewById(R.id.kyz);
        if (!bool.booleanValue()) {
            y4f.setAdditionViewVisibility(8);
        } else {
            y4f.setAdditionViewVisibility(0);
            y4f.setAdditionalSupportImageResource(num.intValue());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMarginStart(C32151Nz.LJIILLIIL(2));
            textView.setLayoutParams(layoutParams);
        }
        Integer num2 = 15;
        o.LJIIIZ(num2, "<this>");
        textView.setTextSize(num2.intValue());
        textView.setText(str);
        ((TuxAlertBadgeLayout) y4f.findViewById(R.id.ky9)).LIZIZ();
        C9AE.LIZ(y4f, C9AC.ALPHA, 0.0f);
        return y4f;
    }
}
