package X;

import Y.ARunnableS39S0100000_3;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* renamed from: X.8HF, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8HF extends TuxTextView {
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public long LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public final float LJZL;
    public int LL;
    public int LLD;
    public final java.util.Map<Integer, View> LLF;

    @Override // com.bytedance.tux.input.TuxTextView
    public final View LJJIJIL(int i) {
        java.util.Map<Integer, View> map = this.LLF;
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

    public final void LJJJJJ() {
        if (!this.LJZ) {
            return;
        }
        this.LJZ = false;
        this.LJZI = false;
        this.LJLZ = -1L;
        setScrollX(this.LLD);
        this.LL = -1;
        setEllipsize(TextUtils.TruncateAt.END);
    }

    @Override // android.view.View
    public final boolean isFocused() {
        if (this.LJLLLL) {
            return false;
        }
        return true;
    }

    public final boolean LJJJIL() {
        Layout layout;
        int right = ((getRight() - getLeft()) - getCompoundPaddingLeft()) - getCompoundPaddingRight();
        if (right <= 0 || (layout = getLayout()) == null || Float.valueOf(layout.getLineWidth(0)) == null || getLayout().getLineWidth(0) <= right) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(super.toString());
        LIZ.append(", text: ");
        LIZ.append((Object) getText());
        return X1D.LIZIZ(LIZ);
    }

    public final boolean getOnlyMarqueeOnce() {
        return this.LJLLLLLL;
    }

    public final void LJJJJ(boolean z) {
        if (!this.LJLLLLLL || getEllipsize() == TextUtils.TruncateAt.END) {
            return;
        }
        if (z) {
            if (!LJJJIL() || !this.LJLLLLLL || this.LJZI) {
                return;
            }
            this.LJZ = true;
            this.LJZI = true;
            this.LLD = getScrollX();
            invalidate();
            return;
        }
        LJJJJJ();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.LJZI) {
            if (this.LL <= 0) {
                if (getLayout() == null) {
                    invalidate();
                } else {
                    this.LL = (int) (getLayout().getLineWidth(0) - getWidth());
                }
            }
            if (this.LJLZ <= 0) {
                this.LJLZ = System.currentTimeMillis();
            }
            if (isFocused() || isSelected()) {
                long currentTimeMillis = System.currentTimeMillis();
                long j = currentTimeMillis - this.LJLZ;
                this.LJLZ = currentTimeMillis;
                setScrollX(O6R.LJJIIZ(((float) j) * this.LJZL) + getScrollX());
                int scrollX = getScrollX();
                int i = this.LLD;
                int i2 = scrollX - i;
                int i3 = this.LL;
                if (i2 >= i3) {
                    setScrollX(i + i3);
                    this.LJZI = false;
                    postDelayed(new ARunnableS39S0100000_3(this, 163), 1200L);
                }
                invalidate();
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            boolean LJJJIL = LJJJIL();
            if (!this.LJLLLLLL) {
                setSelected(!LJJJIL);
                setSelected(LJJJIL);
                System.currentTimeMillis();
            }
        } else {
            setSelected(false);
        }
        LJJJJ(z);
    }

    public final void setChangeState(boolean z) {
        this.LJLLLL = z;
    }

    public final void setOnlyMarqueeOnce(boolean z) {
        setEllipsize(null);
        this.LJLLLLLL = z;
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean z) {
        boolean isSelected = isSelected();
        super.setSelected(z);
        if (z != isSelected) {
            LJJJJ(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8HF(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLF = C62850Ola.LJFF(context, "context");
        this.LJLZ = -1L;
        this.LJZL = C74275TDb.LIZJ(30.0d, context) / 1000.0f;
        this.LL = -1;
    }

    @Override // com.bytedance.tux.input.TuxTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        LJJJJJ();
        if (this.LJLLLLLL) {
            setEllipsize(null);
        }
        super.setText(charSequence, bufferType);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z) {
            boolean LJJJIL = LJJJIL();
            if (!this.LJLLLLLL) {
                setSelected(!LJJJIL);
                setSelected(LJJJIL);
                System.currentTimeMillis();
            }
        } else {
            setSelected(false);
        }
        LJJJJ(z);
    }
}
