package X;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.BGa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28488BGa extends LinearLayout {
    public final java.util.Map<Integer, View> LJLIL = new LinkedHashMap();

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLIL;
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

    public C28488BGa(Context context) {
        super(context, null, 0);
        int i;
        if (C28503BGp.LIZ()) {
            i = R.layout.dge;
        } else {
            i = R.layout.dgd;
        }
        C29306Beo.LJIIIIZZ(i, this, true);
        TextView textView = (TextView) LIZ(R.id.h67);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(0);
    }

    public final void setArrowVisibility(int i) {
        ((ImageView) LIZ(R.id.a7n)).setVisibility(i);
    }

    public final void setNotifyText(CharSequence text) {
        o.LJIIIZ(text, "text");
        ((TextView) LIZ(R.id.h67)).setText(text);
    }
}
