package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.6dn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C165036dn extends TuxTextView {
    public int LJLLLL;
    public int LJLLLLLL;
    public int LJLZ;
    public float LJZ;
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

    public final void LJJJIL() {
        TextPaint paint = getPaint();
        o.LJIIIIZZ(paint, "paint");
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.LJLLLL);
        super.setTextColor(this.LJLLLLLL);
        setShadowLayer(0.0f, 0.0f, 0.0f, 0);
    }

    public final int getOutlineColor() {
        return this.LJLLLLLL;
    }

    public final int getOutlineSize() {
        return this.LJLLLL;
    }

    private final void setAttributes(AttributeSet attributeSet) {
        setOutlineSize(0);
        setOutlineColor(0);
        this.LJLZ = getCurrentTextColor();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{android.R.attr.shadowColor, android.R.attr.shadowDx, android.R.attr.shadowDy, android.R.attr.shadowRadius, R.attr.b3d, R.attr.b3e, R.attr.bf_, R.attr.bfa});
            o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…styleable.StrokeTextView)");
            if (obtainStyledAttributes.hasValue(5)) {
                setOutlineSize((int) obtainStyledAttributes.getDimension(5, 0.0f));
            }
            if (obtainStyledAttributes.hasValue(4)) {
                setOutlineColor(obtainStyledAttributes.getColor(4, 0));
            }
            if (obtainStyledAttributes.hasValue(3) || obtainStyledAttributes.hasValue(1) || obtainStyledAttributes.hasValue(2) || obtainStyledAttributes.hasValue(0)) {
                this.LJZ = obtainStyledAttributes.getFloat(3, 0.0f);
                obtainStyledAttributes.getFloat(1, 0.0f);
                obtainStyledAttributes.getFloat(2, 0.0f);
                obtainStyledAttributes.getColor(0, 0);
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        LJJJIL();
        super.onDraw(canvas);
        TextPaint paint = getPaint();
        o.LJIIIIZZ(paint, "paint");
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(0.0f);
        super.setTextColor(this.LJLZ);
        setShadowLayer(this.LJZ, getShadowDx(), getShadowDy(), getShadowColor());
        super.onDraw(canvas);
    }

    public final void setOutlineColor(int i) {
        this.LJLLLLLL = i;
        LJJJIL();
        invalidate();
    }

    public final void setOutlineSize(int i) {
        this.LJLLLL = i;
        LJJJIL();
        invalidate();
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        this.LJLZ = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C165036dn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
        this.LJZI = C62850Ola.LJFF(context, "context");
        setAttributes(attributeSet);
    }

    @Override // com.bytedance.tux.input.TuxTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        LJJJIL();
    }
}
