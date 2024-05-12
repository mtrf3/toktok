package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.badge.BadgeDrawable;
import o3.h0;

/* renamed from: X.Veu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80272Veu extends FrameLayout implements C02P {
    public static final int[] LJLZ = {R.attr.state_checked};
    public final int LJLIL;
    public float LJLILLLLZI;
    public float LJLJI;
    public float LJLJJI;
    public int LJLJJL;
    public boolean LJLJJLL;
    public final ImageView LJLJL;
    public final ViewGroup LJLJLJ;
    public final TextView LJLJLLL;
    public final TextView LJLL;
    public int LJLLI;
    public C281618q LJLLILLLL;
    public ColorStateList LJLLJ;
    public Drawable LJLLL;
    public Drawable LJLLLL;
    public BadgeDrawable LJLLLLLL;

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < indexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof C80272Veu) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    public BadgeDrawable getBadge() {
        return this.LJLLLLLL;
    }

    @Override // X.C02P
    public C281618q getItemData() {
        return this.LJLLILLLL;
    }

    public int getItemPosition() {
        return this.LJLLI;
    }

    public C80272Veu(Context context) {
        super(context, null, 0);
        this.LJLLI = -1;
        Resources resources = getResources();
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), com.zhiliaoapp.musically.R.layout.ak3, this, true);
        setBackgroundResource(com.zhiliaoapp.musically.R.drawable.am4);
        this.LJLIL = resources.getDimensionPixelSize(com.zhiliaoapp.musically.R.dimen.m1);
        ImageView imageView = (ImageView) findViewById(com.zhiliaoapp.musically.R.id.e_q);
        this.LJLJL = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(com.zhiliaoapp.musically.R.id.ff4);
        this.LJLJLJ = viewGroup;
        TextView textView = (TextView) findViewById(com.zhiliaoapp.musically.R.id.k5f);
        this.LJLJLLL = textView;
        TextView textView2 = (TextView) findViewById(com.zhiliaoapp.musically.R.id.ffq);
        this.LJLL = textView2;
        viewGroup.setTag(com.zhiliaoapp.musically.R.id.gol, Integer.valueOf(viewGroup.getPaddingBottom()));
        C16300kU.LJIJ(textView, 2);
        C16300kU.LJIJ(textView2, 2);
        setFocusable(true);
        LIZ(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC80273Vev(this));
        }
    }

    @Override // X.C02P
    public final void LJIIIIZZ(C281618q c281618q) {
        CharSequence charSequence;
        int i;
        this.LJLLILLLL = c281618q;
        setCheckable(c281618q.isCheckable());
        setChecked(c281618q.isChecked());
        setEnabled(c281618q.isEnabled());
        setIcon(c281618q.getIcon());
        setTitle(c281618q.LJ);
        setId(c281618q.LIZ);
        if (!TextUtils.isEmpty(c281618q.LJIILLIIL)) {
            setContentDescription(c281618q.LJIILLIIL);
        }
        if (!TextUtils.isEmpty(c281618q.LJIIZILJ)) {
            charSequence = c281618q.LJIIZILJ;
        } else {
            charSequence = c281618q.LJ;
        }
        C03E.LIZ(this, charSequence);
        if (c281618q.isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C281618q c281618q = this.LJLLILLLL;
        if (c281618q != null && c281618q.isCheckable() && this.LJLLILLLL.isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, LJLZ);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        BadgeDrawable badgeDrawable = this.LJLLLLLL;
        if (badgeDrawable != null && badgeDrawable.isVisible()) {
            C281618q c281618q = this.LJLLILLLL;
            CharSequence charSequence = c281618q.LJ;
            if (!TextUtils.isEmpty(c281618q.LJIILLIIL)) {
                charSequence = this.LJLLILLLL.LJIILLIIL;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append((Object) charSequence);
            LIZ.append(", ");
            LIZ.append((Object) this.LJLLLLLL.LIZJ());
            accessibilityNodeInfo.setContentDescription(X1D.LIZIZ(LIZ));
        }
        C17760mq c17760mq = new C17760mq(accessibilityNodeInfo);
        c17760mq.LJIIZILJ(C17740mo.LIZ(0, 1, getItemVisiblePosition(), 1, isSelected()));
        if (isSelected()) {
            c17760mq.LJIILL(false);
            c17760mq.LJII(C17720mm.LJI);
        }
        c17760mq.LJJIFFI(getResources().getString(com.zhiliaoapp.musically.R.string.hjp));
    }

    public void setBadge(BadgeDrawable badgeDrawable) {
        this.LJLLLLLL = badgeDrawable;
        ImageView imageView = this.LJLJL;
        if (imageView != null && badgeDrawable != null) {
            setClipChildren(false);
            setClipToPadding(false);
            BadgeDrawable badgeDrawable2 = this.LJLLLLLL;
            Rect rect = new Rect();
            imageView.getDrawingRect(rect);
            badgeDrawable2.setBounds(rect);
            badgeDrawable2.LJIIIIZZ(imageView, null);
            if (badgeDrawable2.LIZLLL() != null) {
                badgeDrawable2.LIZLLL().setForeground(badgeDrawable2);
            } else {
                imageView.getOverlay().add(badgeDrawable2);
            }
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        this.LJLL.setPivotX(r1.getWidth() / 2);
        this.LJLL.setPivotY(r1.getBaseline());
        this.LJLJLLL.setPivotX(r1.getWidth() / 2);
        this.LJLJLLL.setPivotY(r1.getBaseline());
        int i = this.LJLJJL;
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        LIZIZ(this.LJLIL, 17, this.LJLJL);
                        this.LJLL.setVisibility(8);
                        this.LJLJLLL.setVisibility(8);
                    }
                } else {
                    ViewGroup viewGroup = this.LJLJLJ;
                    LIZLLL(((Integer) viewGroup.getTag(com.zhiliaoapp.musically.R.id.gol)).intValue(), viewGroup);
                    if (z) {
                        LIZIZ((int) (this.LJLIL + this.LJLILLLLZI), 49, this.LJLJL);
                        LIZJ(1.0f, 1.0f, 0, this.LJLL);
                        TextView textView = this.LJLJLLL;
                        float f = this.LJLJI;
                        LIZJ(f, f, 4, textView);
                    } else {
                        LIZIZ(this.LJLIL, 49, this.LJLJL);
                        TextView textView2 = this.LJLL;
                        float f2 = this.LJLJJI;
                        LIZJ(f2, f2, 4, textView2);
                        LIZJ(1.0f, 1.0f, 0, this.LJLJLLL);
                    }
                }
            } else {
                if (z) {
                    LIZIZ(this.LJLIL, 49, this.LJLJL);
                    ViewGroup viewGroup2 = this.LJLJLJ;
                    LIZLLL(((Integer) viewGroup2.getTag(com.zhiliaoapp.musically.R.id.gol)).intValue(), viewGroup2);
                    this.LJLL.setVisibility(0);
                } else {
                    LIZIZ(this.LJLIL, 17, this.LJLJL);
                    LIZLLL(0, this.LJLJLJ);
                    this.LJLL.setVisibility(4);
                }
                this.LJLJLLL.setVisibility(4);
            }
        } else if (this.LJLJJLL) {
            if (z) {
                LIZIZ(this.LJLIL, 49, this.LJLJL);
                ViewGroup viewGroup3 = this.LJLJLJ;
                LIZLLL(((Integer) viewGroup3.getTag(com.zhiliaoapp.musically.R.id.gol)).intValue(), viewGroup3);
                this.LJLL.setVisibility(0);
            } else {
                LIZIZ(this.LJLIL, 17, this.LJLJL);
                LIZLLL(0, this.LJLJLJ);
                this.LJLL.setVisibility(4);
            }
            this.LJLJLLL.setVisibility(4);
        } else {
            ViewGroup viewGroup4 = this.LJLJLJ;
            LIZLLL(((Integer) viewGroup4.getTag(com.zhiliaoapp.musically.R.id.gol)).intValue(), viewGroup4);
            if (z) {
                LIZIZ((int) (this.LJLIL + this.LJLILLLLZI), 49, this.LJLJL);
                LIZJ(1.0f, 1.0f, 0, this.LJLL);
                TextView textView3 = this.LJLJLLL;
                float f3 = this.LJLJI;
                LIZJ(f3, f3, 4, textView3);
            } else {
                LIZIZ(this.LJLIL, 49, this.LJLJL);
                TextView textView4 = this.LJLL;
                float f4 = this.LJLJJI;
                LIZJ(f4, f4, 4, textView4);
                LIZJ(1.0f, 1.0f, 0, this.LJLJLLL);
            }
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.LJLJLLL.setEnabled(z);
        this.LJLL.setEnabled(z);
        this.LJLJL.setEnabled(z);
        if (z) {
            h0.LJJIFFI(this, C16110kB.LIZ(getContext()));
        } else {
            h0.LJJIFFI(this, null);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.LJLLL) {
            return;
        }
        this.LJLLL = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = C07840Sm.LJFF(drawable).mutate();
            this.LJLLLL = drawable;
            ColorStateList colorStateList = this.LJLLJ;
            if (colorStateList != null) {
                C07820Sk.LJII(drawable, colorStateList);
            }
        }
        this.LJLJL.setImageDrawable(drawable);
    }

    public void setIconSize(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.LJLJL.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.LJLJL.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.LJLLJ = colorStateList;
        if (this.LJLLILLLL != null && (drawable = this.LJLLLL) != null) {
            C07820Sk.LJII(drawable, colorStateList);
            this.LJLLLL.invalidateSelf();
        }
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        C16300kU.LJIILLIIL(this, drawable);
    }

    public void setItemPosition(int i) {
        this.LJLLI = i;
    }

    public void setLabelVisibilityMode(int i) {
        if (this.LJLJJL != i) {
            this.LJLJJL = i;
            C281618q c281618q = this.LJLLILLLL;
            if (c281618q != null) {
                setChecked(c281618q.isChecked());
            }
        }
    }

    public void setShifting(boolean z) {
        if (this.LJLJJLL != z) {
            this.LJLJJLL = z;
            C281618q c281618q = this.LJLLILLLL;
            if (c281618q != null) {
                setChecked(c281618q.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i) {
        C023107f.LJII(this.LJLL, i);
        LIZ(this.LJLJLLL.getTextSize(), this.LJLL.getTextSize());
    }

    public void setTextAppearanceInactive(int i) {
        C023107f.LJII(this.LJLJLLL, i);
        LIZ(this.LJLJLLL.getTextSize(), this.LJLL.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.LJLJLLL.setTextColor(colorStateList);
            this.LJLL.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.LJLJLLL.setText(charSequence);
        this.LJLL.setText(charSequence);
        C281618q c281618q = this.LJLLILLLL;
        if (c281618q == null || TextUtils.isEmpty(c281618q.LJIILLIIL)) {
            setContentDescription(charSequence);
        }
        C281618q c281618q2 = this.LJLLILLLL;
        if (c281618q2 != null && !TextUtils.isEmpty(c281618q2.LJIIZILJ)) {
            charSequence = this.LJLLILLLL.LJIIZILJ;
        }
        C03E.LIZ(this, charSequence);
    }

    public void setItemBackground(int i) {
        Drawable LIZIZ;
        if (i == 0) {
            LIZIZ = null;
        } else {
            LIZIZ = C04270Et.LIZIZ(getContext(), i);
        }
        setItemBackground(LIZIZ);
    }

    public static void LIZLLL(int i, View view) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    public final void LIZ(float f, float f2) {
        this.LJLILLLLZI = f - f2;
        this.LJLJI = (f2 * 1.0f) / f;
        this.LJLJJI = (f * 1.0f) / f2;
    }

    public static void LIZIZ(int i, int i2, View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    public static void LIZJ(float f, float f2, int i, View view) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }
}
