package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommercelive.common.data.SellingItem;
import com.ss.android.ugc.aweme.ecommercelive.common.settings.PinCardRefactorSettings;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.S1x, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71437S1x extends AbstractC71432S1s<C119754mx> {
    public final void LJFF(C71438S1y c71438S1y) {
        String str;
        boolean z = false;
        if (!PinCardRefactorSettings.LIZ().getSellingPointEnable()) {
            LIZJ(false);
            return;
        }
        this.LJ.clear();
        ((ViewGroup) this.LIZ).removeAllViews();
        int i = c71438S1y.LJLILLLLZI;
        if (i > 0) {
            ((C119754mx) this.LIZ).setMaxTagCount(i);
        }
        for (SellingItem sellingItem : c71438S1y.LJLIL) {
            if (!AbstractC71432S1s.LJI.contains(Integer.valueOf(sellingItem.sellingItemType)) && (str = sellingItem.showText) != null) {
                this.LJ.add(sellingItem);
                int i2 = sellingItem.sellingItemType;
                if (i2 != 3) {
                    if (i2 != 7) {
                        LIZLLL(C71428S1o.LIZ(this.LIZJ, str, this.LJFF));
                    } else {
                        LIZLLL(C71428S1o.LIZIZ(this.LIZJ, str, this.LJFF));
                    }
                } else {
                    String str2 = sellingItem.optShowText;
                    if (str2 == null) {
                        StringBuilder LJFF = C72972SkS.LJFF(str, ' ');
                        LJFF.append(this.LIZJ.getResources().getString(R.string.f9u));
                        str2 = X1D.LIZIZ(LJFF);
                    }
                    LIZLLL(C71428S1o.LIZ(this.LIZJ, str2, this.LJFF));
                }
            }
        }
        if (((ViewGroup) this.LIZ).getChildCount() > 0) {
            z = true;
        }
        LIZJ(z);
    }

    public final void LJI(InterfaceC71429S1p style) {
        o.LJIIIZ(style, "style");
        this.LJFF = style;
        if (style.LJFF()) {
            C119754mx c119754mx = (C119754mx) this.LIZ;
            int LIZIZ = C7MY.LIZIZ(5);
            int LIZIZ2 = C7MY.LIZIZ(3);
            c119754mx.LJLJJL = LIZIZ;
            c119754mx.LJLJJI = LIZIZ2;
            C119754mx c119754mx2 = (C119754mx) this.LIZ;
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.d9);
            c110614Vt.LJII = C7MY.LIZIZ(1);
            c110614Vt.LJI = C7MY.LIZIZ(8);
            c119754mx2.setDividerDrawable(c110614Vt.LIZ(this.LIZJ));
            return;
        }
        T t = this.LIZ;
        C119754mx c119754mx3 = (C119754mx) t;
        c119754mx3.LJLJJL = 0;
        c119754mx3.LJLJJI = 0;
        ((C119754mx) t).setDividerDrawable(null);
        ((C119754mx) this.LIZ).setChildHorizontalMargin(style.LIZIZ());
    }

    public C71437S1x(C119754mx c119754mx, java.util.Map<String, String> map) {
        super(c119754mx, map);
    }
}
