package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS29S1000000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.Ay7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27955Ay7 extends ConstraintLayout {
    public final java.util.Map<Integer, View> LJLIL = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void setLabel(String str) {
        C2RX c2rx = (C2RX) _$_findCachedViewById(R.id.mw1);
        c2rx.LJJLJLI(new AqS29S1000000_4(str, 28));
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZLLL = Integer.valueOf(C45804HyK.LJJI(1));
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        c110614Vt.LJ = Integer.valueOf(AnonymousClass636.LJIIIIZZ(R.attr.eb, context));
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        c2rx.setBackground(c110614Vt.LIZ(context2));
    }

    public final void setProductImg(Image image) {
        C62562cu imageUrlModel;
        SmartImageView smartImageView = (SmartImageView) _$_findCachedViewById(R.id.mw3);
        if (image != null && (imageUrlModel = image.toImageUrlModel()) != null) {
            C27949Ay1.LJJJJJL();
            W5F LIZLLL = C70759Rpr.LIZLLL(imageUrlModel);
            LIZLLL.LJJI = KL0.HIGH;
            LIZLLL.LIZIZ("product_image_tag");
            LIZLLL.LJJIIJ = smartImageView;
            C16880lQ.LLJJJ(LIZLLL);
            smartImageView.setColorFilter(134217728);
        }
    }

    public final void setSkuNumber(Integer num) {
        String LIZIZ;
        TextView setSkuNumber$lambda$3 = (TextView) _$_findCachedViewById(R.id.mw2);
        o.LJIIIIZZ(setSkuNumber$lambda$3, "setSkuNumber$lambda$3");
        int i = 0;
        if (num == null) {
            i = 8;
        }
        setSkuNumber$lambda$3.setVisibility(i);
        Context context = setSkuNumber$lambda$3.getContext();
        o.LJIIIIZZ(context, "context");
        if (C26338AVi.LIZJ(context)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(num);
            LIZ.append(" x");
            LIZIZ = X1D.LIZIZ(LIZ);
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("x ");
            LIZ2.append(num);
            LIZIZ = X1D.LIZIZ(LIZ2);
        }
        setSkuNumber$lambda$3.setText(LIZIZ);
    }

    public final void setSkuPros(String str) {
        TextView us_order_submit_main_order_gift_sku_props = (TextView) _$_findCachedViewById(R.id.mw6);
        o.LJIIIIZZ(us_order_submit_main_order_gift_sku_props, "us_order_submit_main_order_gift_sku_props");
        OUP.LJJLIIIJILLIZJL(us_order_submit_main_order_gift_sku_props, str);
    }

    public C27955Ay7(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.a96, this, true);
    }
}
