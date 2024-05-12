package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.8Fg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208248Fg extends TuxTextView {
    public int LJLLLL;
    public int LJLLLLLL;
    public boolean LJLZ;
    public final java.util.Map<Integer, View> LJZ;

    @Override // com.bytedance.tux.input.TuxTextView
    public final View LJJIJIL(int i) {
        java.util.Map<Integer, View> map = this.LJZ;
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

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (!this.LJLZ) {
            super.onDraw(canvas);
            return;
        }
        ColorStateList textColors = getTextColors();
        getPaint().setStyle(Paint.Style.STROKE);
        getPaint().setStrokeJoin(Paint.Join.ROUND);
        getPaint().setStrokeWidth(this.LJLLLL);
        setTextColor(this.LJLLLLLL);
        super.onDraw(canvas);
        setTextColor(textColors);
        getPaint().setStrokeWidth(0.0f);
        getPaint().setStyle(Paint.Style.FILL);
        super.onDraw(canvas);
    }

    public final void setStrokeColor$nearby_release(int i) {
        this.LJLLLLLL = i;
    }

    public final void setStrokeWidth$nearby_release(int i) {
        this.LJLLLL = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C208248Fg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
        this.LJZ = C62850Ola.LJFF(context, "context");
        this.LJLLLLLL = -1;
        this.LJLZ = true;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.b1w, R.attr.b1x});
            o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…leable.StrokeTuxTextView)");
            this.LJLLLL = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.LJLLLLLL = obtainStyledAttributes.getColor(0, -1);
            obtainStyledAttributes.recycle();
        }
    }
}
