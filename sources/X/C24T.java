package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.24T, reason: invalid class name */
/* loaded from: classes.dex */
public final class C24T extends C45071pn {
    public LiveIconView LJLJJI;
    public TextView LJLJJL;
    public C2HJ LJLJJLL;

    public Drawable getDefaultMask() {
        return this.LJLJJLL.LJLJJI;
    }

    public Drawable getDisabledMask() {
        return this.LJLJJLL.LJLJI;
    }

    public Drawable getPressedMask() {
        return this.LJLJJLL.LJLILLLLZI;
    }

    @Override // X.C45071pn, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2HJ c2hj = this.LJLJJLL;
        if (c2hj.LJLILLLLZI != null || c2hj.LJLJI != null) {
            invalidate();
        }
    }

    public LiveIconView getIconView() {
        return this.LJLJJI;
    }

    public C24T(Context context) {
        super(context, null, 0);
        LinearLayout.inflate(getContext(), R.layout.bpt, this);
        setWillNotDraw(false);
        this.LJLJJI = (LiveIconView) findViewById(R.id.fzx);
        this.LJLJJL = (TextView) findViewById(R.id.fzy);
        C2HJ c2hj = new C2HJ(this);
        this.LJLJJLL = c2hj;
        c2hj.LLLLZLLLI(null, 0, 0);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Drawable drawable;
        boolean z;
        C2HJ c2hj = this.LJLJJLL;
        if (c2hj == null) {
            super.draw(canvas);
            return;
        }
        if (!c2hj.LJLIL.isEnabled()) {
            drawable = c2hj.LJLJI;
        } else if (c2hj.LJLIL.isPressed()) {
            drawable = c2hj.LJLILLLLZI;
        } else {
            drawable = c2hj.LJLJJI;
        }
        if (drawable != null) {
            drawable.draw(canvas);
            z = true;
        } else {
            z = false;
        }
        super.draw(canvas);
        this.LJLJJLL.getClass();
        if (!z) {
            return;
        }
        canvas.restore();
    }

    public void setDefaultMask(Drawable drawable) {
        C2HJ c2hj = this.LJLJJLL;
        c2hj.LJLJJI = drawable;
        c2hj.LLLZ(drawable);
        c2hj.LJLIL.invalidate();
    }

    public void setDisabledMask(Drawable drawable) {
        C2HJ c2hj = this.LJLJJLL;
        c2hj.LJLJI = drawable;
        c2hj.LLLZ(drawable);
        c2hj.LJLIL.invalidate();
    }

    public void setIcon(int i) {
        setIcon(C20110qd.LIZ(getContext(), i));
    }

    public void setPressedMask(Drawable drawable) {
        C2HJ c2hj = this.LJLJJLL;
        c2hj.LJLILLLLZI = drawable;
        c2hj.LLLZ(drawable);
        c2hj.LJLIL.invalidate();
    }

    public void setText(int i) {
        this.LJLJJL.setText(i);
    }

    public void setIcon(Drawable drawable) {
        this.LJLJJI.setImageDrawable(drawable);
    }

    public void setText(CharSequence charSequence) {
        this.LJLJJL.setText(charSequence);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C2HJ c2hj = this.LJLJJLL;
        c2hj.LLLZ(c2hj.LJLILLLLZI);
        c2hj.LLLZ(c2hj.LJLJI);
        c2hj.LLLZ(c2hj.LJLJJI);
    }
}
