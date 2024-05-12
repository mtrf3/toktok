package X;

import android.content.Context;
import android.graphics.Typeface;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TKQ {
    public static final HashMap<Float, Float> LIZ = new HashMap<>();

    public static final float LIZIZ(Context context, float f) {
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

    public static OSZ LIZ(TKR createNewStickerHolderItemView, Context context, float f, float f2, boolean z, int i) {
        TKT configLayout;
        int i2;
        boolean z2 = z;
        float f3 = f;
        float f4 = f2;
        if ((i & 2) != 0) {
            f3 = createNewStickerHolderItemView.LJLJJLL;
        }
        if ((i & 4) != 0) {
            f4 = createNewStickerHolderItemView.LJLJL;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        TKW configureImageView = null;
        if ((i & 16) != 0) {
            configLayout = TKT.LJLIL;
        } else {
            configLayout = null;
        }
        if ((i & 32) != 0) {
            configureImageView = TKW.LJLIL;
        }
        o.LJIIIZ(createNewStickerHolderItemView, "$this$createNewStickerHolderItemView");
        o.LJIIIZ(configLayout, "configLayout");
        o.LJIIIZ(configureImageView, "configureImageView");
        int i3 = createNewStickerHolderItemView.LLIIJLIL;
        boolean z3 = createNewStickerHolderItemView.LLIIJI;
        float f5 = createNewStickerHolderItemView.LJLLILLLL;
        int LJ = C81184Vtc.LJ(context);
        if (z3) {
            if (i3 == 3) {
                f5 = 30.0f;
            } else {
                f5 = 18.0f;
            }
        }
        float f6 = LJ;
        float f7 = i3;
        int LIZIZ = (int) (((f6 - (LIZIZ(context, f5) * f7)) - LIZIZ(context, 8.0f)) / f7);
        C74456TKa c74456TKa = new C74456TKa(context, f3, f4, LIZIZ, createNewStickerHolderItemView, z2, configureImageView);
        C74460TKe c74460TKe = new C74460TKe(context);
        c74456TKa.invoke(c74460TKe);
        TDF LIZIZ2 = c74460TKe.LIZIZ();
        if (C82852WfQ.LIZ().LJFF) {
            TextView textView = LIZIZ2.getTextView();
            if (textView != null) {
                textView.setTextSize(12.0f);
            }
            TextView textView2 = LIZIZ2.getTextView();
            if (textView2 != null) {
                C78880UxY.LJLIIL(textView2);
            }
        } else {
            TextView textView3 = LIZIZ2.getTextView();
            if (textView3 != null) {
                textView3.setTextSize(11.0f);
            }
            TextView textView4 = LIZIZ2.getTextView();
            if (textView4 != null) {
                textView4.setTypeface(Typeface.defaultFromStyle(0));
            }
        }
        if (createNewStickerHolderItemView.LLIIJI && !z2) {
            i2 = -2;
        } else {
            i2 = -1;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, i2);
        layoutParams.gravity = 17;
        configLayout.invoke(layoutParams);
        LIZIZ2.setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(context);
        if (!createNewStickerHolderItemView.LLIIIZ || createNewStickerHolderItemView.LLIIJI) {
            LIZIZ = -2;
        }
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, LIZIZ));
        frameLayout.addView(LIZIZ2);
        return new OSZ(frameLayout, LIZIZ2);
    }
}
