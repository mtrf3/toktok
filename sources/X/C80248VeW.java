package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* renamed from: X.VeW, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80248VeW extends FrameLayout {
    public Drawable LJLIL;
    public Rect LJLILLLLZI;
    public final Rect LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;

    public void LIZ(C16800lI c16800lI) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.LJLIL;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.LJLILLLLZI != null && this.LJLIL != null) {
            int save = canvas.save();
            canvas.translate(getScrollX(), getScrollY());
            if (this.LJLJJI) {
                this.LJLJI.set(0, 0, width, this.LJLILLLLZI.top);
                this.LJLIL.setBounds(this.LJLJI);
                this.LJLIL.draw(canvas);
            }
            if (this.LJLJJL) {
                this.LJLJI.set(0, height - this.LJLILLLLZI.bottom, width, height);
                this.LJLIL.setBounds(this.LJLJI);
                this.LJLIL.draw(canvas);
            }
            Rect rect = this.LJLJI;
            Rect rect2 = this.LJLILLLLZI;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.LJLIL.setBounds(this.LJLJI);
            this.LJLIL.draw(canvas);
            Rect rect3 = this.LJLJI;
            Rect rect4 = this.LJLILLLLZI;
            rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
            this.LJLIL.setBounds(this.LJLJI);
            this.LJLIL.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.LJLJJL = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.LJLJJI = z;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.LJLIL = drawable;
    }

    public C80248VeW(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C80248VeW(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLJI = new Rect();
        this.LJLJJI = true;
        this.LJLJJL = true;
        TypedArray LIZLLL = C80244VeS.LIZLLL(context, attributeSet, new int[]{R.attr.ai4}, i, R.style.y8, new int[0]);
        this.LJLIL = LIZLLL.getDrawable(0);
        LIZLLL.recycle();
        setWillNotDraw(true);
        C16360ka.LJIJJ(this, new C80249VeX(this));
    }
}
