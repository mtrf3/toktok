package X;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.4hy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C116664hy extends FrameLayout {
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
    public C116664hy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TextPaint paint;
        this.LJLIL = C62850Ola.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.anv, this, true);
        TextView textView = (TextView) LIZ(R.id.i6c);
        if (textView != null && (paint = textView.getPaint()) != null) {
            paint.setFlags(16);
            paint.setAntiAlias(true);
        }
    }

    public final void LIZIZ(String str, String str2) {
        if (C78857UxB.LJJJIL(str)) {
            View LIZ = LIZ(R.id.i6c);
            if (LIZ != null) {
                LIZ.setVisibility(0);
            }
            TextView textView = (TextView) LIZ(R.id.i6c);
            if (textView != null) {
                textView.setText(str);
            }
        } else {
            View LIZ2 = LIZ(R.id.i6c);
            if (LIZ2 != null) {
                LIZ2.setVisibility(8);
            }
        }
        if (C78857UxB.LJJJIL(str2)) {
            View LIZ3 = LIZ(R.id.i5v);
            if (LIZ3 != null) {
                LIZ3.setVisibility(0);
            }
            TextView textView2 = (TextView) LIZ(R.id.i5v);
            if (textView2 == null) {
                return;
            }
            textView2.setText(str2);
            return;
        }
        View LIZ4 = LIZ(R.id.i5v);
        if (LIZ4 == null) {
            return;
        }
        LIZ4.setVisibility(8);
    }
}
