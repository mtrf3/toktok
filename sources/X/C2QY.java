package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.2QY, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2QY extends LinearLayout {
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

    public C2QY(Context context) {
        super(context, null, 0);
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.yd, this, true);
    }

    public final void setThirdPartyLogistics(boolean z) {
        int i;
        View extra_logistic_middle_layout = LIZ(R.id.d2l);
        o.LJIIIIZZ(extra_logistic_middle_layout, "extra_logistic_middle_layout");
        if (!z) {
            i = 0;
        } else {
            i = 8;
        }
        extra_logistic_middle_layout.setVisibility(i);
    }
}
