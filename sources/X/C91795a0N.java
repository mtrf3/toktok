package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.a0N, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91795a0N extends LinearLayout {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91795a0N(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o.LJIIIZ(context, "context");
        this.LJLIL = new LinkedHashMap();
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.ad, this, true);
    }

    public final void LIZIZ(int i, int i2) {
        ((TextView) LIZ(R.id.eg)).setTextColor(i);
        ((TextView) LIZ(R.id.eh)).setTextColor(i);
        ((TextView) LIZ(R.id.ei)).setTextColor(i);
        ((TextView) LIZ(R.id.ed)).setTextColor(i2);
        ((TextView) LIZ(R.id.ee)).setTextColor(i2);
        ((TextView) LIZ(R.id.ef)).setTextColor(i2);
    }
}
