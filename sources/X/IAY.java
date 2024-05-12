package X;

import Y.ARunnableS43S0100000_7;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Space;
import com.zhiliaoapp.musically.R;

/* loaded from: classes8.dex */
public final class IAY extends ScrollView implements InterfaceC42882GsI {
    public I6Y LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public LinearLayout LJLJJI;
    public C8H9 LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public boolean LJLJLJ;
    public View.OnClickListener LJLJLLL;
    public int LJLL;

    public final void LJ() {
        int i;
        if (this.LJLJJI == null || this.LJLIL == null) {
            return;
        }
        Resources resources = getResources();
        C8H9 c8h9 = this.LJLJJL;
        if (c8h9 != null) {
            if (this.LJLL == 0) {
                i = R.color.cs;
            } else {
                i = R.color.be;
            }
            c8h9.setTextColor(resources.getColor(i));
        }
    }

    public final void LIZIZ() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            int i = layoutParams.height;
            if (i >= 0) {
                this.LJLILLLLZI = i;
            } else if (i != -2) {
            } else {
                throw new IllegalArgumentException("DmtDefaultView doesn't support layout_height set to WRAP_CONTENT!");
            }
        }
    }

    public final void LIZJ() {
        int i;
        LIZIZ();
        if (this.LJLIL == null || (i = this.LJLILLLLZI) < this.LJLJJLL) {
            return;
        }
        ((LinearLayout.LayoutParams) this.LJLJJL.getLayoutParams()).topMargin = (int) ((i * 0.3f) + 0.5f);
        this.LJLJJL.requestLayout();
    }

    public final void LIZLLL() {
        LIZIZ();
        removeAllViews();
        setScrollY(0);
        if (this.LJLIL == null || this.LJLILLLLZI < this.LJLJJLL) {
            return;
        }
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.cqk, this, true);
        this.LJLJJI = (LinearLayout) findViewById(R.id.fk6);
        C8H9 c8h9 = (C8H9) findViewById(R.id.m4n);
        this.LJLJJL = c8h9;
        I6Y i6y = this.LJLIL;
        if (i6y.LIZIZ) {
            c8h9.setText(i6y.LIZ);
        }
        this.LJLJJI.addView(new Space(getContext()), new LinearLayout.LayoutParams(-1, this.LJLJL));
        View.OnClickListener onClickListener = this.LJLJLLL;
        if (onClickListener != null) {
            C16880lQ.LJIIZILJ(this.LJLJJI, onClickListener);
        }
        this.LJLJLJ = true;
        LJ();
        if (C16310kV.LIZLLL(this) == 1) {
            setLayoutDirection(0);
            this.LJLJJI.setLayoutDirection(1);
        }
        LIZJ();
    }

    public IAY(Context context) {
        super(context, null, 0);
        C60903NvH.LJIIJJI().getUiService().getClass();
        this.LJLL = 0;
        LIZIZ();
        getContext().getResources();
        this.LJLJJLL = C32151Nz.LJIILLIIL(100);
        this.LJLJL = C32151Nz.LJIILLIIL(40);
    }

    @Override // X.InterfaceC42882GsI
    public final void LIZ(int i) {
        if (this.LJLL != i) {
            this.LJLL = i;
            LJ();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (C38413F5t.LIZ("dispatchScrollViewTouchEvent")) {
            C35532Dx2.LIZLLL();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.LJLJLLL = onClickListener;
        LinearLayout linearLayout = this.LJLJJI;
        if (linearLayout != null) {
            C16880lQ.LJIIZILJ(linearLayout, onClickListener);
        }
    }

    public void setStatus(I6Y i6y) {
        if (i6y == null) {
            return;
        }
        this.LJLIL = i6y;
        if (!i6y.LIZIZ || !TextUtils.isEmpty(i6y.LIZ)) {
            this.LJLJLJ = false;
            if (this.LJLILLLLZI > 0) {
                LIZLLL();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("desc text should not be empty String!");
    }

    @Override // android.widget.ScrollView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.LJLILLLLZI != i2 || this.LJLJI != i) {
            this.LJLJI = i;
            this.LJLILLLLZI = i2;
            LinearLayout linearLayout = this.LJLJJI;
            if (linearLayout == null) {
                if (this.LJLIL != null) {
                    if (this.LJLJLJ) {
                        LIZJ();
                        return;
                    } else {
                        LIZLLL();
                        return;
                    }
                }
                return;
            }
            linearLayout.post(new ARunnableS43S0100000_7(this, 90));
        }
    }
}
