package X;

import Y.IDObjectS187S0100000_42;
import android.R;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.TextView;
import kotlin.jvm.internal.o;

/* renamed from: X.ak0, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94624ak0 extends C94459ahL {
    public static final C93692aUy LJLJLLL = new C93692aUy();
    public boolean LJLJL;
    public String LJLJLJ;

    public C94624ak0(Context context) {
        super(context, null, R.attr.editTextStyle);
        this.LJLJL = true;
        this.LJLJLJ = "s";
        addTextChangedListener(new IDObjectS187S0100000_42(this, 0));
        setHapticFeedbackEnabled(false);
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.LJLJL) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public final void setTouchable(boolean z) {
        this.LJLJL = z;
    }

    public final void setUnit(String unit) {
        o.LJIIIZ(unit, "unit");
        this.LJLJLJ = unit;
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if ((i != 0 || i2 != 0) && getText() != null && i2 >= String.valueOf(getText()).length() - this.LJLJLJ.length()) {
            int max = Math.max(String.valueOf(getText()).length() - this.LJLJLJ.length(), 0);
            if (i < 0) {
                i = 0;
            }
            if (i > max) {
                i = max;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            if (i2 <= max) {
                max = i2;
            }
            setSelection(i, max);
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        if (charSequence != null) {
            C93692aUy c93692aUy = LJLJLLL;
            String str = this.LJLJLJ;
            c93692aUy.getClass();
            charSequence2 = C93692aUy.LIZ(charSequence, str);
        } else {
            charSequence2 = null;
        }
        super.setText(charSequence2, bufferType);
    }
}
