package X;

import Y.ACListenerS24S0100000_4;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.9Wo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C238229Wo extends LinearLayout {
    public boolean LJLIL;
    public InterfaceC238239Wp LJLILLLLZI;
    public final java.util.Map<Integer, View> LJLJI = new LinkedHashMap();

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLJI;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void setOnCheckedListener(InterfaceC238239Wp listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLILLLLZI = listener;
    }

    public C238229Wo(Context context, C238219Wn c238219Wn) {
        super(context, null, 0);
        this.LJLIL = c238219Wn.LJLJJI;
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.c3z, this, true);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -1;
            layoutParams.width = -1;
            setOrientation(1);
        } else {
            layoutParams = new LinearLayout.LayoutParams(-1, -1);
            setOrientation(1);
        }
        setLayoutParams(layoutParams);
        ((TextView) LIZ(R.id.e4r)).setText(c238219Wn.LJLIL);
        ((TextView) LIZ(R.id.c80)).setText(c238219Wn.LJLILLLLZI);
        ((TextView) LIZ(R.id.b_g)).setText(c238219Wn.LJLJI);
        ((C71897SJp) LIZ(R.id.b_d)).setChecked(this.LJLIL);
        C16880lQ.LJIILJJIL((FrameLayout) LIZ(R.id.b_f), new ACListenerS24S0100000_4(this, 230));
        ((C71897SJp) LIZ(R.id.b_d)).setInterceptToggleListener(new AqS154S0100000_4(this, 1050));
    }
}
