package X;

import android.content.Context;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Rzv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71383Rzv {
    public static final int LIZ = C17N.LJIILL(4.0d);
    public static final int LIZIZ = C17N.LJIILL(7.0d);
    public static final int LIZJ = C17N.LJIILL(8.0d);
    public static final int LIZLLL = C17N.LJIILL(12.0d);
    public static final int LJ = C17N.LJIILL(16.0d);

    public static void LIZ(View view, boolean z, boolean z2, ShopWindowAnchorModel product) {
        o.LJIIIZ(product, "product");
        Integer num = product.LIZ.platform;
        if (num == null || num.intValue() != 5) {
            KL2.LJIILLIIL(4, view);
            return;
        }
        if (view instanceof TuxIconView) {
            TuxIconView tuxIconView = (TuxIconView) view;
            tuxIconView.setVisibility(0);
            tuxIconView.setIconRes(R.raw.icon_add_shopping_cart_ltr);
            tuxIconView.setBackground(null);
            if (z) {
                tuxIconView.setTintColorRes(R.attr.eb);
                return;
            }
            if (!z2) {
                return;
            }
            tuxIconView.setTintColorRes(R.attr.gp);
            C71361RzZ c71361RzZ = C71361RzZ.LIZ;
            Context context = tuxIconView.getContext();
            o.LJIIIIZZ(context, "context");
            Integer valueOf = Integer.valueOf(R.attr.cu);
            Integer valueOf2 = Integer.valueOf(R.attr.eb);
            c71361RzZ.getClass();
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZJ = C61328O5c.LIZJ(2);
            c110614Vt.LIZIZ = valueOf;
            c110614Vt.LIZLLL = Integer.valueOf(C45804HyK.LJJI(1));
            c110614Vt.LJFF = valueOf2;
            tuxIconView.setBackgroundDrawable(c110614Vt.LIZ(context));
            Context context2 = tuxIconView.getContext();
            o.LJIIIIZZ(context2, "context");
            tuxIconView.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.cf, context2));
            return;
        }
        if (!(view instanceof SY4)) {
            return;
        }
        SY4 sy4 = (SY4) view;
        if (z) {
            sy4.setEnabled(true);
        } else {
            if (!z2) {
                return;
            }
            sy4.setEnabled(false);
            sy4.setSupportClickWhenDisable(true);
        }
    }
}
