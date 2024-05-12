package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* renamed from: X.Ae1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26709Ae1 extends FrameLayout {
    public final java.util.Map<Integer, View> LJLIL = new LinkedHashMap();

    public final View LIZ(int i) {
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

    public C26709Ae1(Context context) {
        super(context, null, 0);
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.a4_, this, true);
    }

    public final void setIcon(Icon icon) {
        C62562cu c62562cu;
        Image image;
        if (icon != null && (image = icon.icon) != null) {
            c62562cu = image.toThumbFirstImageUrlModel();
        } else {
            c62562cu = null;
        }
        W5F LIZLLL = C70759Rpr.LIZLLL(c62562cu);
        LIZLLL.LJIIJJI = R.drawable.adx;
        LIZLLL.LJIJJ = EnumC72807Shn.FIT_XY;
        LIZLLL.LJJIIJZLJL = (ImageView) LIZ(R.id.jxb);
        C16880lQ.LLJJJ(LIZLLL);
    }

    public final void setServiceContents(String str) {
        if (str != null) {
            ((TextView) LIZ(R.id.jxa)).setText(str);
        }
    }

    public final void setServiceName(String str) {
        if (str != null) {
            ((TextView) LIZ(R.id.jxc)).setText(str);
        }
    }
}
