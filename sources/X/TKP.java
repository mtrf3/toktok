package X;

import android.content.Context;
import android.graphics.Typeface;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TKP {
    public static final HashMap<Float, Float> LIZ = new HashMap<>();

    public static final float LIZ(Context context, float f) {
        if (f < 0) {
            return f;
        }
        HashMap<Float, Float> hashMap = LIZ;
        Float f2 = hashMap.get(Float.valueOf(f));
        if (f2 == null) {
            f2 = Float.valueOf(C74275TDb.LIZIZ(context, f));
            hashMap.put(Float.valueOf(f), Float.valueOf(f2.floatValue()));
        }
        o.LJIIIIZZ(f2, "dipContainer[target] ?: …pContainer[target] = it }");
        return f2.floatValue();
    }

    public static final OSZ<FrameLayout, TD2> LIZIZ(TKR searchItemView, Context context) {
        o.LJIIIZ(searchItemView, "$this$searchItemView");
        float f = searchItemView.LJLJLJ;
        float f2 = searchItemView.LJLJLLL;
        float f3 = searchItemView.LJLJJLL;
        float f4 = searchItemView.LJLJL;
        float f5 = searchItemView.LJLL;
        float f6 = searchItemView.LJLLI;
        TKU configLayout = TKU.LJLIL;
        TKX configureImageView = TKX.LJLIL;
        o.LJIIIZ(configLayout, "configLayout");
        o.LJIIIZ(configureImageView, "configureImageView");
        TKZ tkz = new TKZ(context, f3, f4, searchItemView, configureImageView);
        C74463TKh c74463TKh = new C74463TKh(context);
        tkz.invoke(c74463TKh);
        TD2 LIZIZ = c74463TKh.LIZIZ();
        if (C82852WfQ.LIZ().LJFF) {
            TextView textView = LIZIZ.getTextView();
            if (textView != null) {
                textView.setTextSize(12.0f);
            }
            TextView textView2 = LIZIZ.getTextView();
            if (textView2 != null) {
                C78880UxY.LJLIIL(textView2);
            }
        } else {
            TextView textView3 = LIZIZ.getTextView();
            if (textView3 != null) {
                textView3.setTextSize(11.0f);
            }
            TextView textView4 = LIZIZ.getTextView();
            if (textView4 != null) {
                textView4.setTypeface(Typeface.defaultFromStyle(0));
            }
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) LIZ(context, f), (int) LIZ(context, f2));
        layoutParams.gravity = 8388611;
        float f7 = 17;
        layoutParams.leftMargin = (int) C74275TDb.LIZIZ(context, f7);
        layoutParams.rightMargin = (int) C74275TDb.LIZIZ(context, f7);
        layoutParams.topMargin = (int) C74275TDb.LIZIZ(context, 9);
        configLayout.invoke(layoutParams);
        LIZIZ.setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams((int) LIZ(context, f5), (int) LIZ(context, f6)));
        frameLayout.addView(LIZIZ);
        return new OSZ<>(frameLayout, LIZIZ);
    }
}
