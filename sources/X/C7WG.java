package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.7WG, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7WG extends LinearLayout {
    public final int LJLIL;
    public final java.util.Map<Integer, View> LJLILLLLZI;

    public final View LIZ(int i) {
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

    private final void setCountDownViewWidth(String str) {
        ((TextView) LIZ(R.id.icg)).getPaint().measureText(str);
        if (s.LJJJLZIJ(str, ":", false) && LIZ(R.id.icg).getWidth() != this.LJLIL) {
            ((TextView) LIZ(R.id.icg)).setWidth(this.LJLIL);
        }
    }

    public final void LIZIZ(C7WH c7wh) {
        String str;
        long j;
        ((TuxTextView) LIZ(R.id.icf)).setTuxFont(c7wh.LIZJ);
        ((TuxTextView) LIZ(R.id.icf)).setTextColorRes(c7wh.LIZLLL);
        TextView textView = (TextView) LIZ(R.id.icf);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(c7wh.LIZ);
        LIZ.append(' ');
        textView.setText(X1D.LIZIZ(LIZ));
        Long l = c7wh.LIZIZ;
        if (l != null) {
            long longValue = l.longValue();
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            str = C46104I7o.LJJIFFI(longValue, context);
        } else {
            str = null;
        }
        ((TextView) LIZ(R.id.icg)).setText(str);
        View promotion_header_desc = LIZ(R.id.icf);
        o.LJIIIIZZ(promotion_header_desc, "promotion_header_desc");
        Long l2 = c7wh.LIZIZ;
        if (l2 != null) {
            j = l2.longValue();
        } else {
            j = 0;
        }
        int i = 0;
        if (j > 86400000) {
            i = 8;
        }
        promotion_header_desc.setVisibility(i);
    }

    public final void LIZJ(long j) {
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        String LJJIFFI = C46104I7o.LJJIFFI(j, context);
        ((TextView) LIZ(R.id.icg)).setText(LJJIFFI);
        setCountDownViewWidth(LJJIFFI);
        View promotion_header_desc = LIZ(R.id.icf);
        o.LJIIIIZZ(promotion_header_desc, "promotion_header_desc");
        int i = 0;
        if (j > 86400000) {
            i = 8;
        }
        promotion_header_desc.setVisibility(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7WG(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLILLLLZI = C62850Ola.LJFF(context, "context");
        this.LJLIL = C7MY.LIZIZ(72);
        View.inflate(context, R.layout.yy, this);
    }
}
