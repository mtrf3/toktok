package X;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8HE, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8HE extends TuxTextView {
    public CharSequence LJLLLL;
    public String LJLLLLLL;
    public final Handler LJLZ;
    public final C62822Ol8 LJZ;
    public final java.util.Map<Integer, View> LJZI;

    @Override // com.bytedance.tux.input.TuxTextView
    public final View LJJIJIL(int i) {
        java.util.Map<Integer, View> map = this.LJZI;
        Integer valueOf = Integer.valueOf(R.id.title);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.title);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    public final Runnable getRunnable() {
        return (Runnable) this.LJZ.getValue();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LJLZ.removeCallbacks(getRunnable());
    }

    public final void setOriginalText(CharSequence originalText) {
        o.LJIIIZ(originalText, "originalText");
        this.LJLLLL = originalText;
        this.LJLLLLLL = "";
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8HE(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJZI = C62850Ola.LJFF(context, "context");
        this.LJLLLL = "";
        this.LJLLLLLL = "";
        this.LJLZ = new Handler(C16880lQ.LLJJJJ());
        this.LJZ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1626));
    }

    @Override // com.bytedance.tux.input.TuxTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append((Object) this.LJLLLL);
        LIZ.append("...");
        setText(X1D.LIZIZ(LIZ));
        super.onMeasure(i, i2);
        setText(this.LJLLLL);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View changedView, int i) {
        o.LJIIIZ(changedView, "changedView");
        super.onVisibilityChanged(changedView, i);
        if (i == 0) {
            this.LJLZ.post(getRunnable());
        } else {
            this.LJLZ.removeCallbacks(getRunnable());
        }
    }

    @Override // com.bytedance.tux.input.TuxTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append((Object) this.LJLLLL);
        LIZ.append(this.LJLLLLLL);
        super.setText(X1D.LIZIZ(LIZ), bufferType);
    }
}
