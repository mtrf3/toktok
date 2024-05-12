package X;

import Y.ACListenerS21S0100000_1;
import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.3jm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92303jm extends LinearLayout {
    public final java.util.Map<Integer, View> LJLIL;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92303jm(Context context) {
        super(context, null, 0);
        this.LJLIL = C62850Ola.LJFF(context, "context");
        setOrientation(1);
        setGravity(1);
        C16880lQ.LLLZIIL(R.layout.b11, C16880lQ.LLZIL(context), this);
        C16880lQ.LJJJ((TuxIconView) LIZ(R.id.f0h), new ACListenerS21S0100000_1(this, 258));
        C16880lQ.LJJJ((TuxIconView) LIZ(R.id.f71), new ACListenerS21S0100000_1(context, 259));
        C33381Ss c33381Ss = new C33381Ss();
        c33381Ss.LJLIL = R.drawable.b_4;
        ((ImageView) LIZ(R.id.f05)).setImageDrawable(c33381Ss.LIZ(context));
        String string = context.getString(R.string.etc);
        o.LJIIIIZZ(string, "context.getString(R.stri…indon_v3_modal_body2_btn)");
        String string2 = context.getString(R.string.etb);
        o.LJIIIIZZ(string2, "context.getString(R.stri…_remindon_v3_modal_body2)");
        String LIZIZ = Q8U.LIZIZ(new Object[]{string}, 1, string2, "format(format, *args)");
        SpannableString spannableString = new SpannableString(LIZIZ);
        int LJJLIIIJL = s.LJJLIIIJL(LIZIZ, string, 0, false, 6);
        int length = string.length() + LJJLIIIJL;
        if (LJJLIIIJL >= 0 && length >= 0) {
            spannableString.setSpan(new T5U(42, false), LJJLIIIJL, length, 33);
            Integer LJI = C79045V0n.LJI(R.attr.go, context);
            spannableString.setSpan(new ForegroundColorSpan(LJI != null ? LJI.intValue() : 0), LJJLIIIJL, length, 33);
        }
        ((TextView) LIZ(R.id.an7)).setText(spannableString);
        ((TextView) LIZ(R.id.an7)).setMovementMethod(LinkMovementMethod.getInstance());
        if (C99W.LIZ) {
            LIZ(R.id.i4c).getClass();
        }
        C16880lQ.LJJIZ((SY4) LIZ(R.id.i4c), new ACListenerS21S0100000_1(this, 260));
    }
}
