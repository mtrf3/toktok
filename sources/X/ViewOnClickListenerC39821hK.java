package X;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: X.1hK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class ViewOnClickListenerC39821hK extends AppCompatTextView implements C02P, View.OnClickListener, C02V {
    public C281618q LJLJL;
    public CharSequence LJLJLJ;
    public Drawable LJLJLLL;
    public C02K LJLL;
    public C280818i LJLLI;
    public C02F LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public final int LJLLLL;
    public int LJLLLLLL;
    public final int LJLZ;

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public final void LJJIJLIJ() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.LJLJLJ);
        if (this.LJLJLLL != null && ((this.LJLJL.LJJI & 4) != 4 || (!this.LJLLJ && !this.LJLLL))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence3 = null;
        if (z3) {
            charSequence = this.LJLJLJ;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence4 = this.LJLJL.LJIILLIIL;
        if (TextUtils.isEmpty(charSequence4)) {
            if (z3) {
                charSequence2 = null;
            } else {
                charSequence2 = this.LJLJL.LJ;
            }
            setContentDescription(charSequence2);
        } else {
            setContentDescription(charSequence4);
        }
        CharSequence charSequence5 = this.LJLJL.LJIIZILJ;
        if (TextUtils.isEmpty(charSequence5)) {
            if (!z3) {
                charSequence3 = this.LJLJL.LJ;
            }
            C03E.LIZ(this, charSequence3);
            return;
        }
        C03E.LIZ(this, charSequence5);
    }

    @Override // X.C02V
    public final boolean LIZLLL() {
        if (LJJIJIL() && this.LJLJL.getIcon() == null) {
            return true;
        }
        return false;
    }

    @Override // X.C02V
    public final boolean LJIJJ() {
        return LJJIJIL();
    }

    public final boolean LJJIJIL() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean LJJIJL() {
        Configuration configuration = getContext().getResources().getConfiguration();
        if (configuration.screenWidthDp >= 480 || configuration.orientation == 2) {
            return true;
        }
        return false;
    }

    @Override // X.C02P
    public C281618q getItemData() {
        return this.LJLJL;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.18i] */
    @Override // X.C02P
    public final void LJIIIIZZ(C281618q c281618q) {
        int i;
        this.LJLJL = c281618q;
        setIcon(c281618q.getIcon());
        setTitle(c281618q.getTitleCondensed());
        setId(c281618q.LIZ);
        if (c281618q.isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        setEnabled(c281618q.isEnabled());
        if (c281618q.hasSubMenu() && this.LJLLI == null) {
            this.LJLLI = new C03O() { // from class: X.18i
                @Override // X.C03O
                public final AnonymousClass112 LIZIZ() {
                    C281818s c281818s;
                    C02F c02f = ViewOnClickListenerC39821hK.this.LJLLILLLL;
                    if (c02f == null || (c281818s = ((C281918t) c02f).LIZ.LL) == null) {
                        return null;
                    }
                    return c281818s.LIZ();
                }

                @Override // X.C03O
                public final boolean LIZJ() {
                    AnonymousClass112 LIZIZ;
                    ViewOnClickListenerC39821hK viewOnClickListenerC39821hK = ViewOnClickListenerC39821hK.this;
                    C02K c02k = viewOnClickListenerC39821hK.LJLL;
                    if (c02k == null || !c02k.LIZIZ(viewOnClickListenerC39821hK.LJLJL) || (LIZIZ = LIZIZ()) == null || !LIZIZ.isShowing()) {
                        return false;
                    }
                    return true;
                }

                {
                    super(ViewOnClickListenerC39821hK.this);
                }
            };
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C02K c02k = this.LJLL;
        if (c02k != null) {
            c02k.LIZIZ(this.LJLJL);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.LJLLJ = LJJIJL();
        LJJIJLIJ();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C280818i c280818i;
        if (this.LJLJL.hasSubMenu() && (c280818i = this.LJLLI) != null && c280818i.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z) {
        if (this.LJLLL != z) {
            this.LJLLL = z;
            C281618q c281618q = this.LJLJL;
            if (c281618q != null) {
                C281318n c281318n = c281618q.LJIILIIL;
                c281318n.LJIIJ = true;
                c281318n.LJIILL(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.LJLJLLL = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.LJLZ;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        LJJIJLIJ();
    }

    public void setItemInvoker(C02K c02k) {
        this.LJLL = c02k;
    }

    public void setPopupCallback(C02F c02f) {
        this.LJLLILLLL = c02f;
    }

    public void setTitle(CharSequence charSequence) {
        this.LJLJLJ = charSequence;
        LJJIJLIJ();
    }

    public ViewOnClickListenerC39821hK(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.LJLLJ = LJJIJL();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.minWidth}, 0, 0);
        this.LJLLLL = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.LJLZ = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(new ViewOnClickListenerC13880ga(this));
        this.LJLLLLLL = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean LJJIJIL = LJJIJIL();
        if (LJJIJIL && (i4 = this.LJLLLLLL) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(size, this.LJLLLL);
        } else {
            i3 = this.LJLLLL;
        }
        if (mode != 1073741824 && this.LJLLLL > 0 && measuredWidth < i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
        if (!LJJIJIL && this.LJLJLLL != null) {
            super.setPadding((getMeasuredWidth() - this.LJLJLLL.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.LJLLLLLL = i;
        super.setPadding(i, i2, i3, i4);
    }
}
