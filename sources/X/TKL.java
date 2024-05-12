package X;

import android.content.Context;
import android.graphics.Typeface;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TKL {
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

    public static OSZ LIZ(TKR createNewStickerHolderItemViewV2, Context context, boolean z, float f, float f2, float f3, float f4, InterfaceC88472Yns interfaceC88472Yns, int i) {
        int i2;
        int i3;
        TKM configLayout;
        float f5 = f;
        boolean z2 = z;
        float f6 = f3;
        float f7 = f2;
        InterfaceC88472Yns configureImageView = interfaceC88472Yns;
        float f8 = f4;
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            f5 = createNewStickerHolderItemViewV2.LJLJJLL;
        }
        if ((i & 8) != 0) {
            f7 = createNewStickerHolderItemViewV2.LJLJL;
        }
        if ((i & 16) != 0) {
            f6 = createNewStickerHolderItemViewV2.LJLJLJ;
        }
        if ((i & 32) != 0) {
            f8 = createNewStickerHolderItemViewV2.LJLJLLL;
        }
        if ((i & 64) != 0) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        if ((i & 128) != 0) {
            i3 = 2;
        } else {
            i3 = 0;
        }
        if ((i & 512) != 0) {
            configLayout = TKM.LJLIL;
        } else {
            configLayout = null;
        }
        if ((i & 1024) != 0) {
            configureImageView = TKN.LJLIL;
        }
        o.LJIIIZ(createNewStickerHolderItemViewV2, "$this$createNewStickerHolderItemViewV2");
        o.LJIIIZ(configLayout, "configLayout");
        o.LJIIIZ(configureImageView, "configureImageView");
        C74457TKb c74457TKb = new C74457TKb(context, f5, f7, (int) (((C81184Vtc.LJ(context) - (LIZIZ(context, createNewStickerHolderItemViewV2.LJLLILLLL) * createNewStickerHolderItemViewV2.LLIIJLIL)) - LIZIZ(context, 8.0f)) / createNewStickerHolderItemViewV2.LLIIJLIL), createNewStickerHolderItemViewV2, i2, i3, z2, false, configureImageView);
        C74459TKd c74459TKd = new C74459TKd(context);
        c74457TKb.invoke(c74459TKd);
        TDC LIZIZ = c74459TKd.LIZIZ();
        TextView textView = LIZIZ.getTextView();
        if (textView != null) {
            textView.setTextSize(11.0f);
        }
        TextView textView2 = LIZIZ.getTextView();
        if (textView2 != null) {
            textView2.setTypeface(Typeface.defaultFromStyle(0));
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) LIZIZ(context, f6), (int) LIZIZ(context, f8));
        layoutParams.gravity = 17;
        configLayout.invoke(layoutParams);
        LIZIZ.setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        frameLayout.addView(LIZIZ);
        return new OSZ(frameLayout, LIZIZ);
    }
}
