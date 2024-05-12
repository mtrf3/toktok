package X;

import Y.ACListenerS32S0100000_12;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes13.dex */
public final class T4Y extends LinearLayout {
    public final int LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public InterfaceC65784Pro<C76800UCe> LJLJJI;
    public final java.util.Map<Integer, View> LJLJJL;

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLJJL;
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

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        OSZ<String, String> LIZ = C15670jT.LIZ(this.LJLILLLLZI, "[", "]");
        String first = LIZ.getFirst();
        String second = LIZ.getSecond();
        String LIZIZ = Q8U.LIZIZ(new Object[]{second, this.LJLJI}, 2, "%s %s", "format(format, *args)");
        ((TextView) LIZ(R.id.ly8)).setText(LIZIZ);
        if (((TextView) LIZ(R.id.ly8)).getLineCount() >= this.LJLIL) {
            C29306Beo.LJJLJLI(LIZ(R.id.ly8));
            C29306Beo.LJJLJLI(LIZ(R.id.ly9));
            ((TextView) LIZ(R.id.ly8)).setText(second);
            int lineEnd = ((TextView) LIZ(R.id.ly8)).getLayout().getLineEnd(this.LJLIL - 1);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append((Object) ((AppCompatTextView) LIZ(R.id.ly8)).getText().subSequence(0, lineEnd - 3));
            LIZ2.append("...");
            String LIZIZ2 = X1D.LIZIZ(LIZ2);
            TextView textView = (TextView) LIZ(R.id.ly8);
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            textView.setText(C15670jT.LIZJ(context, LIZIZ2, null, 0, first, null, 92));
            ((TextView) LIZ(R.id.ly8)).setMovementMethod(LinkMovementMethod.getInstance());
            ((TextView) LIZ(R.id.ly9)).setText(this.LJLJI);
            C16880lQ.LJJIIZ((C47121t6) LIZ(R.id.ly9), new ACListenerS32S0100000_12(this, 19));
            LIZ(R.id.ly8).invalidate();
            return;
        }
        try {
            String substring = LIZIZ.substring(((C47121t6) LIZ(R.id.ly8)).getLayout().getLineStart(((C47121t6) LIZ(R.id.ly8)).getLineCount() - 1), ((C47121t6) LIZ(R.id.ly8)).getLayout().getLineEnd(((C47121t6) LIZ(R.id.ly8)).getLineCount() - 1));
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            if (!s.LJJJLZIJ(substring, this.LJLJI, false)) {
                TextView textView2 = (TextView) LIZ(R.id.ly8);
                Context context2 = getContext();
                o.LJIIIIZZ(context2, "context");
                textView2.setText(C15670jT.LIZJ(context2, second, null, 0, first, null, 92));
                ((TextView) LIZ(R.id.ly8)).setMovementMethod(LinkMovementMethod.getInstance());
                ((TextView) LIZ(R.id.ly9)).setText(this.LJLJI);
                C16880lQ.LJJIIZ((C47121t6) LIZ(R.id.ly9), new ACListenerS32S0100000_12(this, 18));
                return;
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        TextView textView3 = (TextView) LIZ(R.id.ly8);
        Context context3 = getContext();
        o.LJIIIIZZ(context3, "context");
        textView3.setText(C15670jT.LIZJ(context3, LIZIZ, this.LJLJI, 0, first, new AqS162S0100000_12(this, 50), 24));
        ((TextView) LIZ(R.id.ly8)).setMovementMethod(LinkMovementMethod.getInstance());
        C29306Beo.LJJLJLI(LIZ(R.id.ly8));
        C29306Beo.LJI(LIZ(R.id.ly9));
    }

    public final void setOnText2Clicked(InterfaceC65784Pro<C76800UCe> onClicked) {
        o.LJIIIZ(onClicked, "onClicked");
        this.LJLJJI = onClicked;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T4Y(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJJL = C62850Ola.LJFF(context, "context");
        this.LJLIL = 10;
        this.LJLILLLLZI = "";
        this.LJLJI = "";
        LinearLayout.inflate(context, R.layout.db6, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bp0, R.attr.bpj, R.attr.bpk}, 0, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…defStyleAttr, 0\n        )");
        int integer = obtainStyledAttributes.getInteger(0, 10);
        this.LJLIL = integer;
        String LLLZLZ = C16880lQ.LLLZLZ(obtainStyledAttributes, 1);
        this.LJLILLLLZI = LLLZLZ == null ? "" : LLLZLZ;
        String LLLZLZ2 = C16880lQ.LLLZLZ(obtainStyledAttributes, 2);
        this.LJLJI = LLLZLZ2 != null ? LLLZLZ2 : "";
        ((TextView) LIZ(R.id.ly8)).setMaxLines(integer);
        obtainStyledAttributes.recycle();
    }
}
