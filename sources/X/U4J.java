package X;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U4J extends C19870qF {
    public U4J(U4K u4k) {
        super(u4k);
        int i;
        Context context = this.LIZ;
        if (context != null) {
            C79268V9c LIZIZ = u4k.LIZIZ(context);
            if (!TextUtils.isEmpty(u4k.LJIILLIIL)) {
                LinearLayout linearLayout = new LinearLayout(this.LIZ);
                linearLayout.setOrientation(0);
                C47121t6 c47121t6 = new C47121t6(this.LIZ, null);
                c47121t6.LJJIJIL(R.style.a4a);
                Context context2 = c47121t6.getContext();
                o.LJIIIIZZ(context2, "context");
                Integer LJI = C79045V0n.LJI(R.attr.bmu, context2);
                if (LJI != null) {
                    i = LJI.intValue();
                } else {
                    i = 0;
                }
                c47121t6.setTextColor(i);
                c47121t6.setIncludeFontPadding(false);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 16;
                linearLayout.addView(LIZIZ, layoutParams);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
                layoutParams2.gravity = 16;
                linearLayout.addView(c47121t6, layoutParams2);
                Collection collection = u4k.LJIJJLI;
                if (collection != null) {
                    LIZIZ.setDrawables(collection);
                }
                c47121t6.setText(u4k.LJIILLIIL);
                this.LJIIJJI = u4k.LJIILLIIL;
                this.LIZJ = linearLayout;
            }
        }
    }
}
