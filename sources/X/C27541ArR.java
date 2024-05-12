package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.ArR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27541ArR extends FrameLayout {
    public final java.util.Map<Integer, View> LJLIL;

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

    public final void LIZIZ(C27546ArW item) {
        int i;
        o.LJIIIZ(item, "item");
        W5F LIZLLL = C70759Rpr.LIZLLL(item.LJLILLLLZI);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SimpleShopProfileView ");
        LIZ.append(item.hashCode());
        LIZLLL.LIZIZ(X1D.LIZIZ(LIZ));
        LIZLLL.LJJIIJ = (SmartImageView) LIZ(R.id.jy5);
        C16880lQ.LLJJJ(LIZLLL);
        ((TextView) LIZ(R.id.jy8)).setText(item.LJLJI);
        if (C78685UuP.LJJJZ(item.LJLLL)) {
            View ll_simple_detail = LIZ(R.id.g68);
            o.LJIIIIZZ(ll_simple_detail, "ll_simple_detail");
            if (C78685UuP.LJJJZ(item.LJLLL)) {
                i = 0;
            } else {
                i = 8;
            }
            ll_simple_detail.setVisibility(i);
            View text_slogan = LIZ(R.id.l58);
            o.LJIIIIZZ(text_slogan, "text_slogan");
            text_slogan.setVisibility(0);
            ((TextView) LIZ(R.id.l58)).setText(item.LJLLL);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27541ArR(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLIL = C62850Ola.LJFF(context, "context");
        C27531ArH.LIZ(R.layout.a4g, context, this, true);
    }
}
