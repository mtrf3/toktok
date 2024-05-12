package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Rgs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70202Rgs extends ConstraintLayout {
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

    private final void setOriginalPrice(String str) {
        int i;
        View origin_price = _$_findCachedViewById(R.id.hdl);
        o.LJIIIIZZ(origin_price, "origin_price");
        if (C78685UuP.LJJJZ(str)) {
            i = 0;
        } else {
            i = 8;
        }
        origin_price.setVisibility(i);
        if (str != null) {
            ((TextView) _$_findCachedViewById(R.id.hdl)).setText(str);
        }
        ((TextView) _$_findCachedViewById(R.id.hdl)).getPaint().setFlags(16);
        ((TextView) _$_findCachedViewById(R.id.hdl)).getPaint().setAntiAlias(true);
    }

    private final void setPrice(String str) {
        int i;
        View real_price = _$_findCachedViewById(R.id.ip8);
        o.LJIIIIZZ(real_price, "real_price");
        if (C78685UuP.LJJJZ(str)) {
            i = 0;
        } else {
            i = 8;
        }
        real_price.setVisibility(i);
        if (str != null) {
            ((TextView) _$_findCachedViewById(R.id.ip8)).setText(str);
        }
    }

    private final void setPromotion(RVG rvg) {
        boolean z;
        int i;
        View promotion_container = _$_findCachedViewById(R.id.ic5);
        o.LJIIIIZZ(promotion_container, "promotion_container");
        if (rvg != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        promotion_container.setVisibility(i);
        if (rvg != null) {
            Integer num = rvg.LJFF;
            if (num != null) {
                if (num.intValue() == 1) {
                    View hot_deal_text = _$_findCachedViewById(R.id.e7i);
                    o.LJIIIIZZ(hot_deal_text, "hot_deal_text");
                    hot_deal_text.setVisibility(8);
                    View flash_view = _$_findCachedViewById(R.id.dix);
                    o.LJIIIIZZ(flash_view, "flash_view");
                    flash_view.setVisibility(0);
                    ((C7WG) _$_findCachedViewById(R.id.dix)).LIZIZ(C17J.LJJJJLL(rvg));
                    ((C2RU) _$_findCachedViewById(R.id.icm)).LJJLJLI(Integer.valueOf(R.raw.icon_bolt_fill), rvg.LIZJ);
                    return;
                }
                if (num.intValue() == 2) {
                    View hot_deal_text2 = _$_findCachedViewById(R.id.e7i);
                    o.LJIIIIZZ(hot_deal_text2, "hot_deal_text");
                    hot_deal_text2.setVisibility(0);
                    View flash_view2 = _$_findCachedViewById(R.id.dix);
                    o.LJIIIIZZ(flash_view2, "flash_view");
                    flash_view2.setVisibility(8);
                    ((TextView) _$_findCachedViewById(R.id.e7i)).setText(rvg.LIZLLL);
                    ((C2RU) _$_findCachedViewById(R.id.icm)).LJJLJLI(Integer.valueOf(R.raw.icon_3pt_fire), rvg.LIZJ);
                    return;
                }
            }
            View promotion_container2 = _$_findCachedViewById(R.id.ic5);
            o.LJIIIIZZ(promotion_container2, "promotion_container");
            promotion_container2.setVisibility(8);
        }
    }

    private final void setPurchaseLimit(String str) {
        int i;
        View discount_limit = _$_findCachedViewById(R.id.car);
        o.LJIIIIZZ(discount_limit, "discount_limit");
        if (C78685UuP.LJJJZ(str)) {
            i = 0;
        } else {
            i = 8;
        }
        discount_limit.setVisibility(i);
        if (str != null) {
            ((TextView) _$_findCachedViewById(R.id.car)).setText(str);
        }
    }

    public final void LJJLJLI(C69690RWs c69690RWs) {
        setPrice(c69690RWs.LIZ);
        setOriginalPrice(c69690RWs.LIZIZ);
        setPurchaseLimit(c69690RWs.LIZJ);
    }

    public C70202Rgs(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.a5k, this, true);
    }
}
