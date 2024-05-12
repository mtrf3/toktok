package X;

import Y.ACListenerS31S0100000_11;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import com.zhiliaoapp.musically.R;

/* loaded from: classes12.dex */
public abstract class Q6Z extends Button {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public View.OnClickListener LJLJI;
    public View.OnClickListener LJLJJI;
    public boolean LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public C66426Q5e LJLJLJ;

    public abstract int getDefaultRequestCode();

    public int getDefaultStyleResource() {
        C40700FyC.LIZ(this);
        return 0;
    }

    public Activity getActivity() {
        if (C40700FyC.LIZ(this)) {
            return null;
        }
        try {
            Context context = getContext();
            while (!(context instanceof Activity) && (context instanceof ContextWrapper)) {
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (context instanceof Activity) {
                return (Activity) context;
            }
            throw new Q4W("Unable to get Activity.");
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getAnalyticsButtonCreatedEventName() {
        String str = null;
        if (C40700FyC.LIZ(this)) {
            return null;
        }
        try {
            str = this.LJLIL;
            return str;
        } catch (Throwable unused) {
            return str;
        }
    }

    public String getAnalyticsButtonTappedEventName() {
        String str = null;
        if (C40700FyC.LIZ(this)) {
            return null;
        }
        try {
            str = this.LJLILLLLZI;
            return str;
        } catch (Throwable unused) {
            return str;
        }
    }

    public InterfaceC008701r getAndroidxActivityResultRegistryOwner() {
        if (C40700FyC.LIZ(this)) {
            return null;
        }
        try {
            ComponentCallbacks2 activity = getActivity();
            if (activity instanceof InterfaceC008701r) {
                return (InterfaceC008701r) activity;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (C40700FyC.LIZ(this)) {
            return 0;
        }
        try {
            if (this.LJLJJL) {
                return this.LJLJJLL;
            }
            return super.getCompoundPaddingLeft();
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingRight() {
        if (C40700FyC.LIZ(this)) {
            return 0;
        }
        try {
            if (this.LJLJJL) {
                return this.LJLJL;
            }
            return super.getCompoundPaddingRight();
        } catch (Throwable unused) {
            return 0;
        }
    }

    public Fragment getFragment() {
        if (C40700FyC.LIZ(this)) {
            return null;
        }
        try {
            C66426Q5e c66426Q5e = this.LJLJLJ;
            if (c66426Q5e == null) {
                return null;
            }
            return (Fragment) c66426Q5e.LIZ;
        } catch (Throwable unused) {
            return null;
        }
    }

    public android.app.Fragment getNativeFragment() {
        if (C40700FyC.LIZ(this)) {
            return null;
        }
        try {
            C66426Q5e c66426Q5e = this.LJLJLJ;
            if (c66426Q5e == null) {
                return null;
            }
            return (android.app.Fragment) c66426Q5e.LIZIZ;
        } catch (Throwable unused) {
            return null;
        }
    }

    public int getRequestCode() {
        int i = 0;
        if (C40700FyC.LIZ(this)) {
            return 0;
        }
        try {
            i = getDefaultRequestCode();
            return i;
        } catch (Throwable unused) {
            return i;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        if (C40700FyC.LIZ(this)) {
            return;
        }
        try {
            super.onAttachedToWindow();
            if (!isInEditMode()) {
                getContext();
                C40700FyC.LIZ(this);
            }
        } catch (Throwable unused) {
        }
    }

    public Q6Z(Context context) {
        super(context, null, 0);
        int defaultStyleResource = getDefaultStyleResource();
        LIZ(context, defaultStyleResource == 0 ? R.style.a5r : defaultStyleResource);
        this.LJLIL = "fb_login_button_create";
        this.LJLILLLLZI = "fb_login_button_did_tap";
        setClickable(true);
        setFocusable(true);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int ceil;
        if (C40700FyC.LIZ(this)) {
            return;
        }
        try {
            if ((getGravity() & 1) != 0) {
                int compoundPaddingLeft = getCompoundPaddingLeft();
                int compoundPaddingRight = getCompoundPaddingRight();
                int width = (getWidth() - (getCompoundDrawablePadding() + compoundPaddingLeft)) - compoundPaddingRight;
                String charSequence = getText().toString();
                if (!C40700FyC.LIZ(this)) {
                    try {
                        ceil = (int) Math.ceil(getPaint().measureText(charSequence));
                    } catch (Throwable unused) {
                    }
                    int min = Math.min((width - ceil) / 2, (compoundPaddingLeft - getPaddingLeft()) / 2);
                    this.LJLJJLL = compoundPaddingLeft - min;
                    this.LJLJL = compoundPaddingRight + min;
                    this.LJLJJL = true;
                }
                ceil = 0;
                int min2 = Math.min((width - ceil) / 2, (compoundPaddingLeft - getPaddingLeft()) / 2);
                this.LJLJJLL = compoundPaddingLeft - min2;
                this.LJLJL = compoundPaddingRight + min2;
                this.LJLJJL = true;
            }
            super.onDraw(canvas);
            this.LJLJJL = false;
        } catch (Throwable unused2) {
        }
    }

    public void setFragment(android.app.Fragment fragment) {
        if (C40700FyC.LIZ(this)) {
            return;
        }
        try {
            this.LJLJLJ = new C66426Q5e(fragment);
        } catch (Throwable unused) {
        }
    }

    public void setInternalOnClickListener(View.OnClickListener onClickListener) {
        if (C40700FyC.LIZ(this)) {
            return;
        }
        try {
            this.LJLJJI = onClickListener;
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        if (C40700FyC.LIZ(this)) {
            return;
        }
        try {
            this.LJLJI = onClickListener;
        } catch (Throwable unused) {
        }
    }

    public void setFragment(Fragment fragment) {
        if (C40700FyC.LIZ(this)) {
            return;
        }
        try {
            this.LJLJLJ = new C66426Q5e(fragment);
        } catch (Throwable unused) {
        }
    }

    public void LIZ(Context context, int i) {
        if (C40700FyC.LIZ(this)) {
            return;
        }
        try {
            LIZIZ(context, i);
            LIZJ(context, i);
            LIZLLL(context, i);
            LJ(context, i);
            if (!C40700FyC.LIZ(this)) {
                super.setOnClickListener(new ACListenerS31S0100000_11(this, 15));
            }
        } catch (Throwable unused) {
        }
    }

    public final void LIZIZ(Context context, int i) {
        if (C40700FyC.LIZ(this)) {
            return;
        }
        try {
            if (isInEditMode()) {
                return;
            }
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.background}, 0, i);
            try {
                if (obtainStyledAttributes.hasValue(0)) {
                    int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        setBackgroundResource(resourceId);
                    } else {
                        setBackgroundColor(obtainStyledAttributes.getColor(0, 0));
                    }
                } else {
                    setBackgroundColor(C04330Ez.LIZIZ(context, R.color.gj));
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        } catch (Throwable unused) {
        }
    }

    public final void LIZJ(Context context, int i) {
        if (C40700FyC.LIZ(this)) {
            return;
        }
        try {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.drawableLeft, android.R.attr.drawableTop, android.R.attr.drawableRight, android.R.attr.drawableBottom, android.R.attr.drawablePadding}, 0, i);
            try {
                setCompoundDrawablesWithIntrinsicBounds(obtainStyledAttributes.getResourceId(0, 0), obtainStyledAttributes.getResourceId(1, 0), obtainStyledAttributes.getResourceId(2, 0), obtainStyledAttributes.getResourceId(3, 0));
                setCompoundDrawablePadding(obtainStyledAttributes.getDimensionPixelSize(4, 0));
            } finally {
                obtainStyledAttributes.recycle();
            }
        } catch (Throwable unused) {
        }
    }

    public final void LIZLLL(Context context, int i) {
        if (C40700FyC.LIZ(this)) {
            return;
        }
        try {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.paddingLeft, android.R.attr.paddingTop, android.R.attr.paddingRight, android.R.attr.paddingBottom}, 0, i);
            try {
                setPadding(obtainStyledAttributes.getDimensionPixelSize(0, 0), obtainStyledAttributes.getDimensionPixelSize(1, 0), obtainStyledAttributes.getDimensionPixelSize(2, 0), obtainStyledAttributes.getDimensionPixelSize(3, 0));
            } finally {
                obtainStyledAttributes.recycle();
            }
        } catch (Throwable unused) {
        }
    }

    public final void LJ(Context context, int i) {
        if (C40700FyC.LIZ(this)) {
            return;
        }
        try {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.textColor}, 0, i);
            try {
                setTextColor(obtainStyledAttributes.getColorStateList(0));
                obtainStyledAttributes.recycle();
                obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.gravity}, 0, i);
                try {
                    setGravity(obtainStyledAttributes.getInt(0, 17));
                    obtainStyledAttributes.recycle();
                    obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.textSize, android.R.attr.textStyle, android.R.attr.text}, 0, i);
                    try {
                        setTextSize(0, obtainStyledAttributes.getDimensionPixelSize(0, 0));
                        setTypeface(Typeface.create(getTypeface(), 1));
                        setText(C16880lQ.LLLZLZ(obtainStyledAttributes, 2));
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (Throwable unused) {
        }
    }
}
