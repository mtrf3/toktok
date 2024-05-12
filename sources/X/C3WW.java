package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.3WW, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3WW extends FrameLayout {
    public static final /* synthetic */ int LJLILLLLZI = 0;
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

    public final void LIZIZ() {
        int i;
        if (LIZ(R.id.ja7).getVisibility() == 0 || LIZ(R.id.kbs).getVisibility() == 0) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
    }

    public final void setSales$ecommerce_video_release(long j) {
        if (j > 0) {
            C45804HyK.LJJLL(this);
            C45804HyK.LJJLL(LIZ(R.id.ja7));
            View rating_number_real = LIZ(R.id.inm);
            o.LJIIIIZZ(rating_number_real, "rating_number_real");
            if (rating_number_real.getVisibility() == 0) {
                C45804HyK.LJJLL(LIZ(R.id.cdj));
            }
            String countString = C77123UOp.LJJIIJ(j);
            String string = getContext().getResources().getString(R.string.f3q);
            o.LJIIIIZZ(string, "this.context.resources.g…ing(R.string.ec_pdp_sold)");
            String LLLZ = C16880lQ.LLLZ(string, Arrays.copyOf(new Object[]{countString}, 1));
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
            o.LJIIIIZZ(countString, "countString");
            int LJJLIIIJL = s.LJJLIIIJL(LLLZ, countString, 0, false, 6);
            if (LJJLIIIJL >= 0) {
                TextView textView = (TextView) LIZ(R.id.ja7);
                SpannableString spannableString = new SpannableString(LLLZ);
                Context context = getContext();
                o.LJIIIIZZ(context, "context");
                Integer LJI = C79045V0n.LJI(R.attr.go, context);
                if (LJI != null) {
                    spannableString.setSpan(new ForegroundColorSpan(LJI.intValue()), LJJLIIIJL, countString.length() + LJJLIIIJL, 33);
                }
                spannableString.setSpan(new T5U(52, true), LJJLIIIJL, countString.length() + LJJLIIIJL, 33);
                textView.setText(spannableString);
            }
        } else {
            LIZ(R.id.ja7).setVisibility(8);
            LIZ(R.id.cdj).setVisibility(8);
        }
        LIZIZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3WW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLIL = C62850Ola.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.a5l, this, true);
    }
}
