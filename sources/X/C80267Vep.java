package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.google.android.material.badge.BadgeDrawable;
import com.zhiliaoapp.musically.R;
import o3.h0;

/* renamed from: X.Vep, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80267Vep extends LinearLayout {
    public View badgeAnchorView;
    public BadgeDrawable badgeDrawable;
    public Drawable baseBackgroundDrawable;
    public ImageView customIconView;
    public TextView customTextView;
    public View customView;
    public int defaultMaxLines;
    public ImageView iconView;
    public C78856UxA tab;
    public TextView textView;
    public final /* synthetic */ C80261Vej this$0;

    private FrameLayout getCustomParentForBadge(View view) {
        return null;
    }

    public int getContentHeight() {
        int i = 0;
        View[] viewArr = {this.textView, this.iconView, this.customView};
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        do {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                if (z) {
                    i3 = Math.min(i3, view.getTop());
                    i2 = Math.max(i2, view.getBottom());
                } else {
                    i3 = view.getTop();
                    i2 = view.getBottom();
                }
                z = true;
            }
            i++;
        } while (i < 3);
        return i2 - i3;
    }

    public int getContentWidth() {
        int i = 0;
        View[] viewArr = {this.textView, this.iconView, this.customView};
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        do {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                if (z) {
                    i3 = Math.min(i3, view.getLeft());
                    i2 = Math.max(i2, view.getRight());
                } else {
                    i3 = view.getLeft();
                    i2 = view.getRight();
                }
                z = true;
            }
            i++;
        } while (i < 3);
        return i2 - i3;
    }

    public void reset() {
        setTab(null);
        setSelected(false);
    }

    private FrameLayout createPreApi18BadgeAnchorRoot() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        return frameLayout;
    }

    public BadgeDrawable getOrCreateBadge() {
        if (this.badgeDrawable == null) {
            Context context = getContext();
            BadgeDrawable badgeDrawable = new BadgeDrawable(context);
            TypedArray LIZLLL = C80244VeS.LIZLLL(context, null, new int[]{R.attr.x9, R.attr.xn, R.attr.xr, R.attr.ag3, R.attr.b0a, R.attr.b2r, R.attr.bw5}, R.attr.xq, R.style.zn, new int[0]);
            badgeDrawable.LJII(LIZLLL.getInt(4, 4));
            if (LIZLLL.hasValue(5)) {
                int max = Math.max(0, LIZLLL.getInt(5, 0));
                BadgeDrawable.SavedState savedState = badgeDrawable.LJLJLJ;
                if (savedState.number != max) {
                    savedState.number = max;
                    badgeDrawable.LJLJI.LIZLLL = true;
                    badgeDrawable.LJIIIZ();
                    badgeDrawable.invalidateSelf();
                }
            }
            int defaultColor = C80285Vf7.LIZ(context, LIZLLL, 0).getDefaultColor();
            badgeDrawable.LJLJLJ.backgroundColor = defaultColor;
            ColorStateList valueOf = ColorStateList.valueOf(defaultColor);
            C80418VhG c80418VhG = badgeDrawable.LJLILLLLZI;
            if (c80418VhG.LJLIL.LIZJ != valueOf) {
                c80418VhG.LJIIJJI(valueOf);
                badgeDrawable.invalidateSelf();
            }
            if (LIZLLL.hasValue(2)) {
                int defaultColor2 = C80285Vf7.LIZ(context, LIZLLL, 2).getDefaultColor();
                badgeDrawable.LJLJLJ.badgeTextColor = defaultColor2;
                if (badgeDrawable.LJLJI.LIZ.getColor() != defaultColor2) {
                    badgeDrawable.LJLJI.LIZ.setColor(defaultColor2);
                    badgeDrawable.invalidateSelf();
                }
            }
            badgeDrawable.LJI(LIZLLL.getInt(1, 8388661));
            badgeDrawable.LJLJLJ.horizontalOffset = LIZLLL.getDimensionPixelOffset(3, 0);
            badgeDrawable.LJIIIZ();
            badgeDrawable.LJLJLJ.verticalOffset = LIZLLL.getDimensionPixelOffset(6, 0);
            badgeDrawable.LJIIIZ();
            LIZLLL.recycle();
            this.badgeDrawable = badgeDrawable;
        }
        tryUpdateBadgeAnchor();
        BadgeDrawable badgeDrawable2 = this.badgeDrawable;
        if (badgeDrawable2 != null) {
            return badgeDrawable2;
        }
        throw new IllegalStateException("Unable to create badge");
    }

    public boolean hasBadgeDrawable() {
        if (this.badgeDrawable != null) {
            return true;
        }
        return false;
    }

    public void removeBadge() {
        if (this.badgeAnchorView != null) {
            tryRemoveBadgeFromAnchor();
        }
        this.badgeDrawable = null;
    }

    public final void update() {
        boolean z;
        Drawable drawable;
        Drawable mutate;
        View view;
        C78856UxA c78856UxA = this.tab;
        if (c78856UxA != null && (view = c78856UxA.LJFF) != null) {
            ViewParent parent = view.getParent();
            if (parent != this) {
                if (parent != null) {
                    C16880lQ.LJLLL(view, (ViewGroup) parent);
                }
                addView(view);
            }
            this.customView = view;
            TextView textView = this.textView;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.iconView;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.iconView.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(android.R.id.text1);
            this.customTextView = textView2;
            if (textView2 != null) {
                this.defaultMaxLines = C07Y.LIZIZ(textView2);
            }
            this.customIconView = (ImageView) view.findViewById(android.R.id.icon);
        } else {
            View view2 = this.customView;
            if (view2 != null) {
                if (C78996UzQ.LJJIIJZLJL(view2)) {
                    C78996UzQ.LJI();
                }
                removeView(view2);
                this.customView = null;
            }
            this.customTextView = null;
            this.customIconView = null;
        }
        if (this.customView == null) {
            if (this.iconView == null) {
                inflateAndAddDefaultIconView();
            }
            if (c78856UxA != null && (drawable = c78856UxA.LIZIZ) != null && (mutate = C07840Sm.LJFF(drawable).mutate()) != null) {
                C07820Sk.LJII(mutate, this.this$0.tabIconTint);
                PorterDuff.Mode mode = this.this$0.tabIconTintMode;
                if (mode != null) {
                    C07820Sk.LJIIIIZZ(mutate, mode);
                }
            }
            if (this.textView == null) {
                inflateAndAddDefaultTextView();
                this.defaultMaxLines = C07Y.LIZIZ(this.textView);
            }
            C023107f.LJII(this.textView, this.this$0.tabTextAppearance);
            ColorStateList colorStateList = this.this$0.tabTextColors;
            if (colorStateList != null) {
                this.textView.setTextColor(colorStateList);
            }
            updateTextAndIcon(this.textView, this.iconView);
            tryUpdateBadgeAnchor();
            addOnLayoutChangeListener(this.iconView);
            addOnLayoutChangeListener(this.textView);
        } else {
            TextView textView3 = this.customTextView;
            if (textView3 != null || this.customIconView != null) {
                updateTextAndIcon(textView3, this.customIconView);
            }
        }
        if (c78856UxA != null) {
            if (!TextUtils.isEmpty(c78856UxA.LIZLLL)) {
                setContentDescription(c78856UxA.LIZLLL);
            }
            if (c78856UxA.LIZ()) {
                z = true;
                setSelected(z);
            }
        }
        z = false;
        setSelected(z);
    }

    public final void updateOrientation() {
        setOrientation(!this.this$0.inlineLabel ? 1 : 0);
        TextView textView = this.customTextView;
        if (textView != null || this.customIconView != null) {
            updateTextAndIcon(textView, this.customIconView);
        } else {
            updateTextAndIcon(this.textView, this.iconView);
        }
    }

    private void inflateAndAddDefaultIconView() {
        ImageView imageView = (ImageView) C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.ak7, this, false);
        this.iconView = imageView;
        addView(imageView, 0);
    }

    private void inflateAndAddDefaultTextView() {
        TextView textView = (TextView) C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.ak8, this, false);
        this.textView = textView;
        addView(textView);
    }

    private void tryRemoveBadgeFromAnchor() {
        if (!hasBadgeDrawable()) {
            return;
        }
        clipViewToPaddingForBadge(true);
        View view = this.badgeAnchorView;
        if (view != null) {
            BadgeDrawable badgeDrawable = this.badgeDrawable;
            if (badgeDrawable != null) {
                if (badgeDrawable.LIZLLL() != null) {
                    badgeDrawable.LIZLLL().setForeground(null);
                } else {
                    view.getOverlay().remove(badgeDrawable);
                }
            }
            this.badgeAnchorView = null;
        }
    }

    private void tryUpdateBadgeAnchor() {
        C78856UxA c78856UxA;
        C78856UxA c78856UxA2;
        if (!hasBadgeDrawable()) {
            return;
        }
        if (this.customView != null) {
            tryRemoveBadgeFromAnchor();
            return;
        }
        ImageView imageView = this.iconView;
        if (imageView != null && (c78856UxA2 = this.tab) != null && c78856UxA2.LIZIZ != null) {
            if (this.badgeAnchorView != imageView) {
                tryRemoveBadgeFromAnchor();
                tryAttachBadgeToAnchor(this.iconView);
                return;
            } else {
                tryUpdateBadgeDrawableBounds(imageView);
                return;
            }
        }
        TextView textView = this.textView;
        if (textView != null && (c78856UxA = this.tab) != null && c78856UxA.LJI == 1) {
            if (this.badgeAnchorView != textView) {
                tryRemoveBadgeFromAnchor();
                tryAttachBadgeToAnchor(this.textView);
                return;
            } else {
                tryUpdateBadgeDrawableBounds(textView);
                return;
            }
        }
        tryRemoveBadgeFromAnchor();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.baseBackgroundDrawable;
        if (drawable != null && drawable.isStateful() && (false | this.baseBackgroundDrawable.setState(drawableState))) {
            invalidate();
            this.this$0.invalidate();
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        boolean performClick = super.performClick();
        if (this.tab != null) {
            if (!performClick) {
                playSoundEffect(0);
            }
            this.tab.LIZIZ();
            return true;
        }
        return performClick;
    }

    public BadgeDrawable getBadge() {
        return this.badgeDrawable;
    }

    public C78856UxA getTab() {
        return this.tab;
    }

    private void addOnLayoutChangeListener(View view) {
        if (view == null) {
            return;
        }
        view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC80269Ver(this, view));
    }

    private void clipViewToPaddingForBadge(boolean z) {
        setClipChildren(z);
        setClipToPadding(z);
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(z);
            viewGroup.setClipToPadding(z);
        }
    }

    private void tryAttachBadgeToAnchor(View view) {
        if (hasBadgeDrawable() && view != null) {
            clipViewToPaddingForBadge(false);
            BadgeDrawable badgeDrawable = this.badgeDrawable;
            FrameLayout customParentForBadge = getCustomParentForBadge(view);
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            badgeDrawable.setBounds(rect);
            badgeDrawable.LJIIIIZZ(view, customParentForBadge);
            if (badgeDrawable.LIZLLL() != null) {
                badgeDrawable.LIZLLL().setForeground(badgeDrawable);
            } else {
                view.getOverlay().add(badgeDrawable);
            }
            this.badgeAnchorView = view;
        }
    }

    public void drawBackground(Canvas canvas) {
        Drawable drawable = this.baseBackgroundDrawable;
        if (drawable != null) {
            drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
            this.baseBackgroundDrawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        BadgeDrawable badgeDrawable = this.badgeDrawable;
        if (badgeDrawable != null && badgeDrawable.isVisible()) {
            CharSequence contentDescription = getContentDescription();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append((Object) contentDescription);
            LIZ.append(", ");
            LIZ.append((Object) this.badgeDrawable.LIZJ());
            accessibilityNodeInfo.setContentDescription(X1D.LIZIZ(LIZ));
        }
        C17760mq c17760mq = new C17760mq(accessibilityNodeInfo);
        c17760mq.LJIIZILJ(C17740mo.LIZ(0, 1, this.tab.LJ, 1, isSelected()));
        if (isSelected()) {
            c17760mq.LJIILL(false);
            c17760mq.LJII(C17720mm.LJI);
        }
        c17760mq.LJJIFFI(getResources().getString(R.string.hjp));
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.textView;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.iconView;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        View view = this.customView;
        if (view != null) {
            view.setSelected(z);
        }
    }

    public void setTab(C78856UxA c78856UxA) {
        if (c78856UxA != this.tab) {
            this.tab = c78856UxA;
            update();
        }
    }

    public void tryUpdateBadgeDrawableBounds(View view) {
        if (hasBadgeDrawable() && view == this.badgeAnchorView) {
            BadgeDrawable badgeDrawable = this.badgeDrawable;
            FrameLayout customParentForBadge = getCustomParentForBadge(view);
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            badgeDrawable.setBounds(rect);
            badgeDrawable.LJIIIIZZ(view, customParentForBadge);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.graphics.drawable.RippleDrawable] */
    public void updateBackgroundDrawable(Context context) {
        int i = this.this$0.tabBackgroundResId;
        GradientDrawable gradientDrawable = null;
        if (i != 0) {
            Drawable LIZ = C20110qd.LIZ(context, i);
            this.baseBackgroundDrawable = LIZ;
            if (LIZ != null && LIZ.isStateful()) {
                this.baseBackgroundDrawable.setState(getDrawableState());
            }
        } else {
            this.baseBackgroundDrawable = null;
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(0);
        if (this.this$0.tabRippleColorStateList != null) {
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setCornerRadius(1.0E-5f);
            gradientDrawable3.setColor(-1);
            ColorStateList LIZ2 = C80270Ves.LIZ(this.this$0.tabRippleColorStateList);
            if (this.this$0.unboundedRipple) {
                gradientDrawable2 = null;
            } else {
                gradientDrawable = gradientDrawable3;
            }
            gradientDrawable2 = new RippleDrawable(LIZ2, gradientDrawable2, gradientDrawable);
        }
        C16300kU.LJIILLIIL(this, gradientDrawable2);
        this.this$0.invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80267Vep(C80261Vej c80261Vej, Context context) {
        super(context);
        this.this$0 = c80261Vej;
        this.defaultMaxLines = 2;
        updateBackgroundDrawable(context);
        C16310kV.LJIIJ(this, c80261Vej.tabPaddingStart, c80261Vej.tabPaddingTop, c80261Vej.tabPaddingEnd, c80261Vej.tabPaddingBottom);
        setGravity(17);
        setOrientation(!c80261Vej.inlineLabel ? 1 : 0);
        setClickable(true);
        h0.LJJIFFI(this, C16110kB.LIZ(getContext()));
    }

    private void updateTextAndIcon(TextView textView, ImageView imageView) {
        Drawable drawable;
        CharSequence charSequence;
        int i;
        Drawable drawable2;
        C78856UxA c78856UxA = this.tab;
        CharSequence charSequence2 = null;
        if (c78856UxA != null && (drawable2 = c78856UxA.LIZIZ) != null) {
            drawable = C07840Sm.LJFF(drawable2).mutate();
        } else {
            drawable = null;
        }
        C78856UxA c78856UxA2 = this.tab;
        if (c78856UxA2 != null) {
            charSequence = c78856UxA2.LIZJ;
        } else {
            charSequence = null;
        }
        if (imageView != null) {
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                setVisibility(0);
            } else {
                imageView.setVisibility(8);
                imageView.setImageDrawable(null);
            }
        }
        boolean z = !TextUtils.isEmpty(charSequence);
        if (textView != null) {
            if (z) {
                textView.setText(charSequence);
                if (this.tab.LJI == 1) {
                    textView.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                }
                setVisibility(0);
            } else {
                textView.setVisibility(8);
                textView.setText((CharSequence) null);
            }
        }
        if (imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            if (z && imageView.getVisibility() == 0) {
                i = (int) C80250VeY.LIZIZ(8, getContext());
            } else {
                i = 0;
            }
            if (this.this$0.inlineLabel) {
                if (i != C16530kr.LIZIZ(marginLayoutParams)) {
                    C16530kr.LJI(marginLayoutParams, i);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (i != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = i;
                C16530kr.LJI(marginLayoutParams, 0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        C78856UxA c78856UxA3 = this.tab;
        if (c78856UxA3 != null) {
            charSequence2 = c78856UxA3.LIZLLL;
        }
        if (!z) {
            charSequence = charSequence2;
        }
        C03E.LIZ(this, charSequence);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Layout layout;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int tabMaxWidth = this.this$0.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i = View.MeasureSpec.makeMeasureSpec(this.this$0.tabMaxWidth, LiveLayoutPreloadThreadPriority.DEFAULT);
        }
        super.onMeasure(i, i2);
        if (this.textView != null) {
            float f = this.this$0.tabTextSize;
            int i3 = this.defaultMaxLines;
            ImageView imageView = this.iconView;
            if (imageView != null && imageView.getVisibility() == 0) {
                i3 = 1;
            } else {
                TextView textView = this.textView;
                if (textView != null && textView.getLineCount() > 1) {
                    f = this.this$0.tabTextMultiLineSize;
                }
            }
            float textSize = this.textView.getTextSize();
            int lineCount = this.textView.getLineCount();
            int LIZIZ = C07Y.LIZIZ(this.textView);
            if (f != textSize || (LIZIZ >= 0 && i3 != LIZIZ)) {
                if (this.this$0.mode == 1 && f > textSize && lineCount == 1 && ((layout = this.textView.getLayout()) == null || approximateLineWidth(layout, 0, f) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                    return;
                }
                this.textView.setTextSize(0, f);
                this.textView.setMaxLines(i3);
                super.onMeasure(i, i2);
            }
        }
    }

    private float approximateLineWidth(Layout layout, int i, float f) {
        return (f / layout.getPaint().getTextSize()) * layout.getLineWidth(i);
    }
}
