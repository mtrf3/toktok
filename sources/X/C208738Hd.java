package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.8Hd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208738Hd extends ConstraintLayout {
    public S2E LJLIL;
    public final java.util.Map<Integer, View> LJLILLLLZI;

    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
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

    public final void LJJLJLI() {
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.c_);
        Integer valueOf = Integer.valueOf(R.attr.d0);
        c110614Vt.LJFF = valueOf;
        Double valueOf2 = Double.valueOf(0.5d);
        c110614Vt.LIZLLL = Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(valueOf2)));
        c110614Vt.LJIIIIZZ = Float.valueOf(C32151Nz.LJIIZILJ(2));
        c110614Vt.LJIIJ = Float.valueOf(C32151Nz.LJIIZILJ(2));
        C110614Vt c110614Vt2 = new C110614Vt();
        c110614Vt2.LIZIZ = Integer.valueOf(R.attr.ct);
        c110614Vt2.LJFF = valueOf;
        c110614Vt2.LIZLLL = Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(valueOf2)));
        c110614Vt2.LJIIIZ = Float.valueOf(C32151Nz.LJIIZILJ(2));
        c110614Vt2.LJIIJJI = Float.valueOf(C32151Nz.LJIIZILJ(2));
        View _$_findCachedViewById = _$_findCachedViewById(R.id.ck_);
        if (_$_findCachedViewById != null) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            _$_findCachedViewById.setBackgroundDrawable(c110614Vt.LIZ(context));
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(R.id.ckb);
        if (appCompatTextView != null) {
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            appCompatTextView.setBackgroundDrawable(c110614Vt2.LIZ(context2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C208738Hd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLILLLLZI = C62850Ola.LJFF(context, "context");
        new L3H();
        C16880lQ.LLLZIIL(R.layout.anq, C16880lQ.LLZIL(context), this);
    }

    public final void LJJLL(String firstOrderIconText, String firstOrderPromotionText, String str) {
        o.LJIIIZ(firstOrderIconText, "firstOrderIconText");
        o.LJIIIZ(firstOrderPromotionText, "firstOrderPromotionText");
        LJJLJLI();
        ((TextView) _$_findCachedViewById(R.id.cka)).setText(firstOrderIconText);
        ((TextView) _$_findCachedViewById(R.id.ckb)).setText(firstOrderPromotionText);
        if (!TextUtils.isEmpty(str)) {
            ImageView imageView = (ImageView) _$_findCachedViewById(R.id.ck9);
            if (imageView != null) {
                W5F LJIIIIZZ = W5U.LJIIIIZZ(String.valueOf(str));
                LJIIIIZZ.LJJIIJZLJL = imageView;
                C16880lQ.LLJJJ(LJIIIIZZ);
                return;
            }
            return;
        }
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_coupon_label_fill;
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        c2068389v.LIZLLL = C79045V0n.LJI(R.attr.eb, context);
        c2068389v.LIZIZ = C7MY.LIZIZ(12);
        c2068389v.LIZJ = C7MY.LIZIZ(12);
        View _$_findCachedViewById = _$_findCachedViewById(R.id.ck9);
        if (_$_findCachedViewById == null) {
            return;
        }
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        _$_findCachedViewById.setBackgroundDrawable(c2068389v.LIZ(context2));
    }

    public final void LJJZ(String firstOrderIconText, String firstOrderPromotionText, String str) {
        o.LJIIIZ(firstOrderIconText, "firstOrderIconText");
        o.LJIIIZ(firstOrderPromotionText, "firstOrderPromotionText");
        LJJLJLI();
        ((TextView) _$_findCachedViewById(R.id.cka)).setText(firstOrderIconText);
        View e_commerce_base_first_order_icon_text = _$_findCachedViewById(R.id.cka);
        o.LJIIIIZZ(e_commerce_base_first_order_icon_text, "e_commerce_base_first_order_icon_text");
        C26338AVi.LJIIIZ(e_commerce_base_first_order_icon_text, 0, 0, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(3))), 0, 16);
        ((TextView) _$_findCachedViewById(R.id.ckb)).setText(firstOrderPromotionText);
        View e_commerce_base_first_order_promotion_text = _$_findCachedViewById(R.id.ckb);
        o.LJIIIIZZ(e_commerce_base_first_order_promotion_text, "e_commerce_base_first_order_promotion_text");
        C26338AVi.LJIIIZ(e_commerce_base_first_order_promotion_text, C1FJ.LIZIZ(4), 0, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4))), 0, 16);
        if (!TextUtils.isEmpty(str)) {
            ImageView imageView = (ImageView) _$_findCachedViewById(R.id.ck9);
            if (imageView != null) {
                W5F LJIIIIZZ = W5U.LJIIIIZZ(String.valueOf(str));
                LJIIIIZZ.LJJIIJZLJL = imageView;
                C16880lQ.LLJJJ(LJIIIIZZ);
            }
        } else {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_coupon_label_fill;
            c2068389v.LJ = Integer.valueOf(R.attr.eb);
            c2068389v.LIZIZ = C7MY.LIZIZ(12);
            c2068389v.LIZJ = C7MY.LIZIZ(12);
            View _$_findCachedViewById = _$_findCachedViewById(R.id.ck9);
            if (_$_findCachedViewById != null) {
                Context context = getContext();
                o.LJIIIIZZ(context, "context");
                _$_findCachedViewById.setBackgroundDrawable(c2068389v.LIZ(context));
            }
        }
        View e_commerce_base_first_order_icon = _$_findCachedViewById(R.id.ck9);
        o.LJIIIIZZ(e_commerce_base_first_order_icon, "e_commerce_base_first_order_icon");
        C26338AVi.LJI(e_commerce_base_first_order_icon, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(3))), 0, 0, 0, false, 16);
    }
}
