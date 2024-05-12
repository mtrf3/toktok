package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LC4 extends TuxTextView {
    public final C5H3 LJLLLL;
    public final C5H3 LJLLLLLL;
    public final C5H3 LJLZ;
    public HashMap LJZ;

    private final int getHasIconPaddingLeft() {
        return ((Number) this.LJLLLLLL.getValue()).intValue();
    }

    private final int getHasIconPaddingRight() {
        return ((Number) this.LJLZ.getValue()).intValue();
    }

    private final int getNoIconPadding() {
        return ((Number) this.LJLLLL.getValue()).intValue();
    }

    @Override // com.bytedance.tux.input.TuxTextView
    public final View LJJIJIL(int i) {
        if (this.LJZ == null) {
            this.LJZ = new HashMap();
        }
        View view = (View) this.LJZ.get(Integer.valueOf(R.id.title));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.title);
        this.LJZ.put(Integer.valueOf(R.id.title), findViewById);
        return findViewById;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int intrinsicWidth;
        o.LJIIIZ(canvas, "canvas");
        Drawable[] compoundDrawables = getCompoundDrawables();
        o.LJIIIIZZ(compoundDrawables, "compoundDrawables");
        if (compoundDrawables.length == 4) {
            Drawable drawable = compoundDrawables[0];
            Drawable drawableRight = compoundDrawables[2];
            float measureText = getPaint().measureText(getText().toString());
            if (drawable != null || drawableRight != null) {
                int compoundDrawablePadding = getCompoundDrawablePadding();
                if (drawable != null) {
                    intrinsicWidth = drawable.getIntrinsicWidth();
                } else {
                    o.LJIIIIZZ(drawableRight, "drawableRight");
                    intrinsicWidth = drawableRight.getIntrinsicWidth();
                }
                float paddingStart = measureText + intrinsicWidth + compoundDrawablePadding + getPaddingStart() + getPaddingEnd();
                if (drawable != null) {
                    setGravity(19);
                    canvas.translate((getWidth() - paddingStart) / 2, 0.0f);
                } else {
                    setGravity(21);
                    canvas.translate((paddingStart - getWidth()) / 2, 0.0f);
                }
                if (C251659uD.LIZ()) {
                    if (getPaddingStart() != getHasIconPaddingRight() || getPaddingEnd() != getHasIconPaddingLeft()) {
                        setPadding(getHasIconPaddingRight(), getPaddingTop(), getHasIconPaddingLeft(), getPaddingBottom());
                    }
                } else if (getPaddingStart() != getHasIconPaddingLeft() || getPaddingEnd() != getHasIconPaddingRight()) {
                    setPadding(getHasIconPaddingLeft(), getPaddingTop(), getHasIconPaddingRight(), getPaddingBottom());
                }
            } else {
                setGravity(17);
                if (getPaddingStart() != getNoIconPadding()) {
                    setPadding(getNoIconPadding(), getPaddingTop(), getNoIconPadding(), getPaddingBottom());
                }
            }
        }
        super.onDraw(canvas);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LC4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ku);
        o.LJIIIZ(context, "context");
        EnumC221088m0 enumC221088m0 = EnumC221088m0.NONE;
        this.LJLLLL = C221108m2.LIZ(enumC221088m0, C53532Kzg.LJLIL);
        this.LJLLLLLL = C221108m2.LIZ(enumC221088m0, C53530Kze.LJLIL);
        this.LJLZ = C221108m2.LIZ(enumC221088m0, C53531Kzf.LJLIL);
    }
}
