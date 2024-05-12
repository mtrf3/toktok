package X;

import Y.ACListenerS30S0100000_10;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* loaded from: classes11.dex */
public final class OJV extends LinearLayout {
    public View LJLIL;
    public ValueAnimator LJLILLLLZI;
    public final java.util.Map<Integer, View> LJLJI;

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

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.LJLILLLLZI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final ValueAnimator getCurrentAnimator() {
        return this.LJLILLLLZI;
    }

    public final View getUnderView() {
        return this.LJLIL;
    }

    public final void setCurrentAnimator(ValueAnimator valueAnimator) {
        this.LJLILLLLZI = valueAnimator;
    }

    public final void setUnderView(View view) {
        this.LJLIL = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OJV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJI = C62850Ola.LJFF(context, "context");
        View.inflate(context, R.layout.dsm, this);
        setOrientation(1);
        C16880lQ.LJJJ((TuxIconView) LIZ(R.id.bmn), new ACListenerS30S0100000_10(this, 224));
        ((TextView) LIZ(R.id.bmm)).setText(getContext().getString(R.string.dnc));
        setLayerType(1, null);
    }
}
