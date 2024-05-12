package X;

import Y.IDLListenerS188S0100000;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.AppCompatSpinner$SavedState;

/* renamed from: X.02e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C010002e extends Spinner {
    public static final int[] LJLJLLL = {R.attr.spinnerMode};
    public final C03A LJLIL;
    public final Context LJLILLLLZI;
    public final C19W LJLJI;
    public SpinnerAdapter LJLJJI;
    public final boolean LJLJJL;
    public final InterfaceC009902d LJLJJLL;
    public int LJLJL;
    public final Rect LJLJLJ;

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC009902d interfaceC009902d = this.LJLJJLL;
        if (interfaceC009902d != null) {
            return interfaceC009902d.LJIIIZ();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC009902d interfaceC009902d = this.LJLJJLL;
        if (interfaceC009902d != null) {
            return interfaceC009902d.LJIIIIZZ();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.LJLJJLL != null) {
            return this.LJLJL;
        }
        return super.getDropDownWidth();
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC009902d interfaceC009902d = this.LJLJJLL;
        if (interfaceC009902d != null) {
            return interfaceC009902d.LIZ();
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC009902d interfaceC009902d = this.LJLJJLL;
        if (interfaceC009902d != null) {
            return interfaceC009902d.LJIIJJI();
        }
        return super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C03A c03a = this.LJLIL;
        if (c03a != null) {
            return c03a.LIZIZ();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C03A c03a = this.LJLIL;
        if (c03a != null) {
            return c03a.LIZJ();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z;
        AppCompatSpinner$SavedState appCompatSpinner$SavedState = new AppCompatSpinner$SavedState(super.onSaveInstanceState());
        InterfaceC009902d interfaceC009902d = this.LJLJJLL;
        if (interfaceC009902d != null && interfaceC009902d.isShowing()) {
            z = true;
        } else {
            z = false;
        }
        appCompatSpinner$SavedState.LJLIL = z;
        return appCompatSpinner$SavedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC009902d interfaceC009902d = this.LJLJJLL;
        if (interfaceC009902d != null) {
            if (!interfaceC009902d.isShowing()) {
                this.LJLJJLL.LIZIZ(getTextDirection(), getTextAlignment());
                return true;
            }
            return true;
        }
        return super.performClick();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C03A c03a = this.LJLIL;
        if (c03a != null) {
            c03a.LIZ();
        }
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC009902d interfaceC009902d = this.LJLJJLL;
        if (interfaceC009902d != null && interfaceC009902d.isShowing()) {
            this.LJLJJLL.dismiss();
        }
    }

    public final InterfaceC009902d getInternalPopup() {
        return this.LJLJJLL;
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.LJLILLLLZI;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        AppCompatSpinner$SavedState appCompatSpinner$SavedState = (AppCompatSpinner$SavedState) parcelable;
        super.onRestoreInstanceState(appCompatSpinner$SavedState.getSuperState());
        if (appCompatSpinner$SavedState.LJLIL && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new IDLListenerS188S0100000(this, 2));
        }
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C19W c19w = this.LJLJI;
        if (c19w != null && c19w.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.LJLJJL) {
            this.LJLJJI = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.LJLJJLL != null) {
            Context context = this.LJLILLLLZI;
            if (context == null) {
                context = getContext();
            }
            this.LJLJJLL.LJIILIIL(new C009602a(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C03A c03a = this.LJLIL;
        if (c03a != null) {
            c03a.LJ();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C03A c03a = this.LJLIL;
        if (c03a != null) {
            c03a.LJFF(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        InterfaceC009902d interfaceC009902d = this.LJLJJLL;
        if (interfaceC009902d != null) {
            interfaceC009902d.LJII(i);
            this.LJLJJLL.LJIIJ(i);
        } else {
            super.setDropDownHorizontalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        InterfaceC009902d interfaceC009902d = this.LJLJJLL;
        if (interfaceC009902d != null) {
            interfaceC009902d.LJI(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.LJLJJLL != null) {
            this.LJLJL = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC009902d interfaceC009902d = this.LJLJJLL;
        if (interfaceC009902d != null) {
            interfaceC009902d.LJFF(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C20110qd.LIZ(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC009902d interfaceC009902d = this.LJLJJLL;
        if (interfaceC009902d != null) {
            interfaceC009902d.LJIIL(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C03A c03a = this.LJLIL;
        if (c03a != null) {
            c03a.LJII(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C03A c03a = this.LJLIL;
        if (c03a != null) {
            c03a.LJIIIIZZ(mode);
        }
    }

    public final int LIZ(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.LJLJLJ);
            Rect rect = this.LJLJLJ;
            return i2 + rect.left + rect.right;
        }
        return i2;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.LJLJJLL != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), LIZ(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
    
        if (r1 != null) goto L12;
     */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.19W] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C010002e(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            r10.<init>(r11, r12, r13)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r10.LJLJLJ = r0
            android.content.Context r0 = r10.getContext()
            X.C16880lQ.LLLLII(r0)
            r6 = 5
            int[] r0 = new int[r6]
            r0 = {x00ce: FILL_ARRAY_DATA , data: [16842930, 16843126, 16843131, 16843362, 2130971027} // fill-array
            r5 = 0
            X.033 r4 = X.AnonymousClass033.LJIILIIL(r11, r12, r0, r13, r5)
            X.03A r0 = new X.03A
            r0.<init>(r10)
            r10.LJLIL = r0
            r0 = 4
            int r1 = r4.LJIIIIZZ(r0, r5)
            if (r1 == 0) goto L34
            X.0zU r0 = new X.0zU
            r0.<init>(r11, r1)
            r10.LJLILLLLZI = r0
        L31:
            r7 = -1
            r3 = 0
            goto L37
        L34:
            r10.LJLILLLLZI = r11
            goto L31
        L37:
            int[] r0 = X.C010002e.LJLJLLL     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> Lc4
            android.content.res.TypedArray r1 = r11.obtainStyledAttributes(r12, r0, r13, r5)     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> Lc4
            boolean r0 = r1.hasValue(r5)     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> Lc6
            if (r0 == 0) goto L4a
            int r7 = r1.getInt(r5, r5)     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> Lc6
            goto L4a
        L48:
            if (r1 == 0) goto L4d
        L4a:
            r1.recycle()
        L4d:
            r8 = 2
            r2 = 1
            if (r7 == 0) goto Lb6
            if (r7 == r2) goto L80
        L53:
            android.content.res.TypedArray r0 = r4.LIZIZ
            java.lang.CharSequence[] r5 = r0.getTextArray(r5)
            if (r5 == 0) goto L6c
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r0 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r11, r0, r5)
            r0 = 2131563024(0x7f0d1210, float:1.8751493E38)
            r1.setDropDownViewResource(r0)
            r10.setAdapter(r1)
        L6c:
            r4.LJIILJJIL()
            r10.LJLJJL = r2
            android.widget.SpinnerAdapter r0 = r10.LJLJJI
            if (r0 == 0) goto L7a
            r10.setAdapter(r0)
            r10.LJLJJI = r3
        L7a:
            X.03A r0 = r10.LJLIL
            r0.LIZLLL(r12, r13)
            return
        L80:
            X.1hO r7 = new X.1hO
            android.content.Context r0 = r10.LJLILLLLZI
            r7.<init>(r10, r0, r12, r13)
            android.content.Context r1 = r10.LJLILLLLZI
            int[] r0 = new int[r6]
            r0 = {x00dc: FILL_ARRAY_DATA , data: [16842930, 16843126, 16843131, 16843362, 2130971027} // fill-array
            X.033 r6 = X.AnonymousClass033.LJIILIIL(r1, r12, r0, r13, r5)
            android.content.res.TypedArray r9 = r6.LIZIZ
            r1 = 3
            r0 = -2
            int r0 = r9.getLayoutDimension(r1, r0)
            r10.LJLJL = r0
            android.graphics.drawable.Drawable r0 = r6.LJ(r2)
            r7.LJFF(r0)
            java.lang.String r0 = r4.LJIIIZ(r8)
            r7.LLIFFJFJJ = r0
            r6.LJIILJJIL()
            r10.LJLJJLL = r7
            X.19W r0 = new X.19W
            r0.<init>(r10)
            r10.LJLJI = r0
            goto L53
        Lb6:
            X.193 r1 = new X.193
            r1.<init>(r10)
            r10.LJLJJLL = r1
            java.lang.String r0 = r4.LJIIIZ(r8)
            r1.LJLJI = r0
            goto L53
        Lc4:
            r0 = move-exception
            goto Lcc
        Lc6:
            r0 = move-exception
            if (r1 == 0) goto Lcc
            r1.recycle()
        Lcc:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C010002e.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
