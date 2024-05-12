package X;

import android.content.Context;
import android.graphics.Typeface;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TKO {
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

    public static final OSZ<FrameLayout, TDE> LIZJ(TKR normalStickerItemView, Context context, boolean z) {
        o.LJIIIZ(normalStickerItemView, "$this$normalStickerItemView");
        return LIZ(normalStickerItemView, context, z, 0.0f, 0.0f, normalStickerItemView.LJLJLJ, normalStickerItemView.LJLJLLL, 0.0f, 0.0f, null, 972);
    }

    public static OSZ LIZ(TKR createStickerHolderItemView, Context context, boolean z, float f, float f2, float f3, float f4, float f5, float f6, InterfaceC88472Yns interfaceC88472Yns, int i) {
        TKS configLayout;
        InterfaceC88472Yns configureImageView = interfaceC88472Yns;
        float f7 = f6;
        float f8 = f;
        boolean z2 = z;
        float f9 = f2;
        float f10 = f3;
        float f11 = f4;
        float f12 = f5;
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            f8 = createStickerHolderItemView.LJLJJLL;
        }
        if ((i & 8) != 0) {
            f9 = createStickerHolderItemView.LJLJL;
        }
        if ((i & 16) != 0) {
            f10 = createStickerHolderItemView.LJLJLJ;
        }
        if ((i & 32) != 0) {
            f11 = createStickerHolderItemView.LJLJLLL;
        }
        if ((i & 64) != 0) {
            f12 = createStickerHolderItemView.LJLL;
        }
        if ((i & 128) != 0) {
            f7 = createStickerHolderItemView.LJLLI;
        }
        if ((i & 256) != 0) {
            configLayout = TKS.LJLIL;
        } else {
            configLayout = null;
        }
        if ((i & 512) != 0) {
            configureImageView = TKV.LJLIL;
        }
        o.LJIIIZ(createStickerHolderItemView, "$this$createStickerHolderItemView");
        o.LJIIIZ(configLayout, "configLayout");
        o.LJIIIZ(configureImageView, "configureImageView");
        C74458TKc c74458TKc = new C74458TKc(context, f8, f9, createStickerHolderItemView, z2, configureImageView);
        C74461TKf c74461TKf = new C74461TKf(context);
        c74458TKc.invoke(c74461TKf);
        TDE LIZIZ = c74461TKf.LIZIZ();
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
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) LIZIZ(context, f10), (int) LIZIZ(context, f11));
        layoutParams.gravity = 17;
        configLayout.invoke(layoutParams);
        LIZIZ.setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams((int) LIZIZ(context, f12), (int) LIZIZ(context, f7)));
        frameLayout.addView(LIZIZ);
        return new OSZ(frameLayout, LIZIZ);
    }
}
