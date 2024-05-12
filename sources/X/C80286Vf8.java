package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import o3.h0;

/* renamed from: X.Vf8, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80286Vf8 extends C80236VeK implements C02P {
    public static final int[] LLIIIILZ = {R.attr.state_checked};
    public int LLD;
    public boolean LLF;
    public boolean LLFF;
    public final CheckedTextView LLFFF;
    public FrameLayout LLFII;
    public C281618q LLFZ;
    public ColorStateList LLI;
    public boolean LLIFFJFJJ;
    public Drawable LLII;
    public final C80287Vf9 LLIIII;

    @Override // X.C02P
    public C281618q getItemData() {
        return this.LLFZ;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.LLFII == null) {
                this.LLFII = (FrameLayout) ((ViewStub) findViewById(com.zhiliaoapp.musically.R.id.c8p)).inflate();
            }
            this.LLFII.removeAllViews();
            this.LLFII.addView(view);
        }
    }

    @Override // X.C02P
    public final void LJIIIIZZ(C281618q c281618q) {
        int i;
        StateListDrawable stateListDrawable;
        this.LLFZ = c281618q;
        int i2 = c281618q.LIZ;
        if (i2 > 0) {
            setId(i2);
        }
        if (c281618q.isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.zhiliaoapp.musically.R.attr.a4i, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(LLIIIILZ, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            C16300kU.LJIILLIIL(this, stateListDrawable);
        }
        setCheckable(c281618q.isCheckable());
        setChecked(c281618q.isChecked());
        setEnabled(c281618q.isEnabled());
        setTitle(c281618q.LJ);
        setIcon(c281618q.getIcon());
        setActionView(c281618q.getActionView());
        setContentDescription(c281618q.LJIILLIIL);
        C03E.LIZ(this, c281618q.LJIIZILJ);
        C281618q c281618q2 = this.LLFZ;
        if (c281618q2.LJ == null && c281618q2.getIcon() == null && this.LLFZ.getActionView() != null) {
            this.LLFFF.setVisibility(8);
            FrameLayout frameLayout = this.LLFII;
            if (frameLayout != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
                layoutParams.width = -1;
                this.LLFII.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.LLFFF.setVisibility(0);
        FrameLayout frameLayout2 = this.LLFII;
        if (frameLayout2 == null) {
            return;
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) frameLayout2.getLayoutParams();
        layoutParams2.width = -2;
        this.LLFII.setLayoutParams(layoutParams2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C281618q c281618q = this.LLFZ;
        if (c281618q != null && c281618q.isCheckable() && this.LLFZ.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, LLIIIILZ);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.LLFF != z) {
            this.LLFF = z;
            this.LLIIII.sendAccessibilityEvent(this.LLFFF, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.LLFFF.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.LLIFFJFJJ) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C07840Sm.LJFF(drawable).mutate();
                C07820Sk.LJII(drawable, this.LLI);
            }
            int i = this.LLD;
            drawable.setBounds(0, 0, i, i);
        } else if (this.LLF) {
            if (this.LLII == null) {
                Drawable LIZ = C0OW.LIZ(getResources(), com.zhiliaoapp.musically.R.drawable.bt0, getContext().getTheme());
                this.LLII = LIZ;
                if (LIZ != null) {
                    int i2 = this.LLD;
                    LIZ.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.LLII;
        }
        C07Z.LJ(this.LLFFF, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.LLFFF.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.LLD = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        boolean z;
        this.LLI = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        this.LLIFFJFJJ = z;
        C281618q c281618q = this.LLFZ;
        if (c281618q != null) {
            setIcon(c281618q.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.LLFFF.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.LLF = z;
    }

    public void setTextAppearance(int i) {
        C023107f.LJII(this.LLFFF, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.LLFFF.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.LLFFF.setText(charSequence);
    }

    public C80286Vf8(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C80286Vf8(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        C80287Vf9 c80287Vf9 = new C80287Vf9(this);
        this.LLIIII = c80287Vf9;
        setOrientation(0);
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), com.zhiliaoapp.musically.R.layout.ake, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.zhiliaoapp.musically.R.dimen.mf));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.zhiliaoapp.musically.R.id.c8q);
        this.LLFFF = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        h0.LJIJI(checkedTextView, c80287Vf9);
    }
}
