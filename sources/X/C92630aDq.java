package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.aDq, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92630aDq extends T5T implements TextWatcher {
    public boolean LJLJJLL;
    public int LJLJL;
    public InterfaceC91814a0g LJLJLJ;
    public String LJLJLLL;
    public final int LJLL;
    public final float LJLLI;
    public final float LJLLILLLL;
    public final float LJLLJ;
    public final int LJLLL;
    public final int LJLLLL;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i;
        InterfaceC91814a0g interfaceC91814a0g;
        InterfaceC91814a0g interfaceC91814a0g2;
        if (editable != null) {
            i = editable.length();
        } else {
            i = 0;
        }
        int i2 = this.LJLJL;
        if (i2 > 0 && i >= 0 && i2 > i && (interfaceC91814a0g2 = this.LJLJLJ) != null) {
            interfaceC91814a0g2.LIZIZ();
        }
        if (this.LJLJJLL && editable != null) {
            this.LJLJLLL = editable.toString();
            if (editable.length() > 0 && editable.length() == this.LJLL && (interfaceC91814a0g = this.LJLJLJ) != null) {
                interfaceC91814a0g.LIZ(this.LJLJLLL);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (canvas != null) {
            Paint paint = new Paint();
            paint.setColor(this.LJLLL);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.LJLLJ);
            int i = this.LJLL;
            for (int length = this.LJLJLLL.length(); length < i; length++) {
                canvas.drawCircle(((length + r2) * this.LJLLI) / 2, getHeight() / 2, this.LJLLILLLL, paint);
            }
            Paint paint2 = new Paint();
            paint2.setColor(this.LJLLLL);
            paint2.setStyle(Paint.Style.FILL);
            int length2 = this.LJLJLLL.length();
            for (int i2 = 0; i2 < length2; i2++) {
                canvas.drawCircle(((i2 + r2) * this.LJLLI) / 2, getHeight() / 2, this.LJLLILLLL, paint2);
            }
        }
    }

    public final void setInputCallback(InterfaceC91814a0g callback) {
        o.LJIIIZ(callback, "callback");
        this.LJLJLJ = callback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92630aDq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.jy);
        o.LJIIIZ(context, "context");
        new LinkedHashMap();
        this.LJLJJLL = true;
        this.LJLJLLL = "";
        this.LJLL = 6;
        this.LJLLILLLL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(6));
        O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
        Double valueOf = Double.valueOf(1.5d);
        this.LJLLJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(valueOf));
        this.LJLLL = R.attr.dw;
        this.LJLLLL = R.attr.go;
        addTextChangedListener(this);
        setBackgroundColor(0);
        setCursorVisible(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.b2, R.attr.b3, R.attr.b4, R.attr.b5, R.attr.b6, R.attr.b7}, R.attr.jy, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…\n            0,\n        )");
        int integer = obtainStyledAttributes.getInteger(0, 6);
        this.LJLL = integer;
        float dimension = obtainStyledAttributes.getDimension(1, O6R.LJJIIZ(C32151Nz.LJIIZILJ(6)));
        this.LJLLILLLL = dimension;
        float dimension2 = obtainStyledAttributes.getDimension(2, O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)));
        this.LJLLJ = obtainStyledAttributes.getDimension(4, O6R.LJJIIZ(C32151Nz.LJIIZILJ(valueOf)));
        this.LJLLL = obtainStyledAttributes.getColor(3, R.attr.dv);
        this.LJLLLL = obtainStyledAttributes.getColor(5, R.attr.go);
        obtainStyledAttributes.recycle();
        float f = (2 * dimension) + dimension2;
        this.LJLLI = f;
        setWidth((int) (f * integer));
        setHeight((int) (dimension + O6R.LJJIIZ(C32151Nz.LJIIZILJ(24))));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        if (charSequence != null) {
            i4 = charSequence.length();
        } else {
            i4 = 0;
        }
        this.LJLJL = i4;
    }

    @Override // android.widget.TextView, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        InterfaceC91814a0g interfaceC91814a0g;
        if (i2 > i3 && (interfaceC91814a0g = this.LJLJLJ) != null) {
            interfaceC91814a0g.LIZIZ();
        }
    }
}
