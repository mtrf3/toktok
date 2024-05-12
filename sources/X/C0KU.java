package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import o3.h0;

/* renamed from: X.0KU, reason: invalid class name */
/* loaded from: classes.dex */
public class C0KU extends LinearLayout {
    public C0KT LJLIL;
    public TextView LJLILLLLZI;
    public LiveIconView LJLJI;
    public View LJLJJI;
    public TextView LJLJJL;
    public LiveIconView LJLJJLL;
    public Drawable LJLJL;
    public int LJLJLJ;
    public final /* synthetic */ C0KV LJLJLLL;

    public int getContentWidth() {
        int i = 0;
        View[] viewArr = {this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
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

    public final void LIZ() {
        View view;
        C0KT c0kt = this.LJLIL;
        if (c0kt != null && (view = c0kt.LJI) != null) {
            ViewParent parent = view.getParent();
            if (parent != this) {
                if (parent != null) {
                    C16880lQ.LJLLL(view, (ViewGroup) parent);
                }
                addView(view);
            }
            this.LJLJJI = view;
            TextView textView = this.LJLILLLLZI;
            if (textView != null) {
                textView.setVisibility(8);
            }
            LiveIconView liveIconView = this.LJLJI;
            if (liveIconView != null) {
                liveIconView.setVisibility(8);
                this.LJLJI.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(R.id.text1);
            this.LJLJJL = textView2;
            if (textView2 != null) {
                this.LJLJLJ = C07Y.LIZIZ(textView2);
            }
            this.LJLJJLL = (LiveIconView) view.findViewById(R.id.icon);
        } else {
            View view2 = this.LJLJJI;
            if (view2 != null) {
                if (C78996UzQ.LJJIIJZLJL(view2)) {
                    C78996UzQ.LJI();
                }
                removeView(view2);
                this.LJLJJI = null;
            }
            this.LJLJJL = null;
            this.LJLJJLL = null;
        }
        boolean z = false;
        if (this.LJLJJI == null) {
            if (this.LJLJI == null) {
                View view3 = (ImageView) C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), com.zhiliaoapp.musically.R.layout.bpq, this, false);
                addView(view3, 0);
                LiveIconView liveIconView2 = (LiveIconView) view3;
                this.LJLJI = liveIconView2;
                ColorStateList colorStateList = this.LJLJLLL.LJLLJ;
                if (colorStateList != null) {
                    liveIconView2.setIconTintList(colorStateList);
                }
            }
            if (this.LJLILLLLZI == null) {
                TextView textView3 = (TextView) C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), com.zhiliaoapp.musically.R.layout.bpr, this, false);
                addView(textView3);
                this.LJLILLLLZI = textView3;
                this.LJLJLJ = C07Y.LIZIZ(textView3);
            }
            C023107f.LJII(this.LJLILLLLZI, this.LJLJLLL.LJLLI);
            ColorStateList colorStateList2 = this.LJLJLLL.LJLLILLLL;
            if (colorStateList2 != null) {
                this.LJLILLLLZI.setTextColor(colorStateList2);
            }
            LIZJ(this.LJLILLLLZI, this.LJLJI);
        } else {
            TextView textView4 = this.LJLJJL;
            if (textView4 != null || this.LJLJJLL != null) {
                LIZJ(textView4, this.LJLJJLL);
            }
        }
        if (c0kt != null) {
            if (!TextUtils.isEmpty(c0kt.LJ)) {
                setContentDescription(c0kt.LJ);
            }
            C0KV c0kv = c0kt.LJII;
            if (c0kv != null) {
                if (c0kv.getSelectedTabPosition() == c0kt.LJFF) {
                    z = true;
                }
            } else {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
        }
        setSelected(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.LJLJL;
        if (drawable != null && drawable.isStateful() && (false | this.LJLJL.setState(drawableState))) {
            invalidate();
            this.LJLJLLL.invalidate();
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (this.LJLIL != null) {
            if (!performClick) {
                playSoundEffect(0);
            }
            this.LJLIL.LIZ();
            return true;
        }
        return performClick;
    }

    public C0KT getTab() {
        return this.LJLIL;
    }

    public View getTitleView() {
        return this.LJLILLLLZI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.graphics.drawable.RippleDrawable] */
    public final void LIZIZ(Context context) {
        int i = this.LJLJLLL.LJZL;
        GradientDrawable gradientDrawable = null;
        if (i != 0) {
            Drawable LIZ = C20110qd.LIZ(context, i);
            this.LJLJL = LIZ;
            if (LIZ != null && LIZ.isStateful()) {
                this.LJLJL.setState(getDrawableState());
            }
        } else {
            this.LJLJL = null;
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(0);
        if (this.LJLJLLL.LJLLL != null) {
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setCornerRadius(1.0E-5f);
            gradientDrawable3.setColor(-1);
            ColorStateList LIZ2 = C80270Ves.LIZ(this.LJLJLLL.LJLLL);
            if (this.LJLJLLL.LLIIIILZ) {
                gradientDrawable2 = null;
            } else {
                gradientDrawable = gradientDrawable3;
            }
            gradientDrawable2 = new RippleDrawable(LIZ2, gradientDrawable2, gradientDrawable);
        }
        C16300kU.LJIILLIIL(this, gradientDrawable2);
        this.LJLJLLL.invalidate();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(AnonymousClass020.class.getName());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(AnonymousClass020.class.getName());
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.LJLILLLLZI;
        if (textView != null) {
            textView.setSelected(z);
        }
        LiveIconView liveIconView = this.LJLJI;
        if (liveIconView != null) {
            liveIconView.setSelected(z);
        }
        View view = this.LJLJJI;
        if (view != null) {
            view.setSelected(z);
        }
    }

    public void setTab(C0KT c0kt) {
        if (c0kt != this.LJLIL) {
            this.LJLIL = c0kt;
            LIZ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KU(C0KV c0kv, Context context) {
        super(context);
        this.LJLJLLL = c0kv;
        this.LJLJLJ = 2;
        LIZIZ(context);
        C16310kV.LJIIJ(this, c0kv.LJLJL, c0kv.LJLJLJ, c0kv.LJLJLLL, c0kv.LJLL);
        setGravity(17);
        setOrientation(!c0kv.LLII ? 1 : 0);
        setClickable(true);
        h0.LJJIFFI(this, C16110kB.LIZ(getContext()));
    }

    public final void LIZJ(TextView textView, LiveIconView liveIconView) {
        Drawable drawable;
        CharSequence charSequence;
        CharSequence charSequence2;
        int i;
        Drawable drawable2;
        C0KT c0kt = this.LJLIL;
        CharSequence charSequence3 = null;
        if (c0kt != null && (drawable2 = c0kt.LIZIZ) != null) {
            drawable = C07840Sm.LJFF(drawable2).mutate();
        } else {
            drawable = null;
        }
        C0KT c0kt2 = this.LJLIL;
        if (c0kt2 != null) {
            charSequence = c0kt2.LIZJ;
        } else {
            charSequence = null;
        }
        if (liveIconView != null) {
            if (drawable != null) {
                liveIconView.setImageDrawable(drawable);
                liveIconView.setVisibility(0);
                setVisibility(0);
            } else {
                liveIconView.setVisibility(8);
                liveIconView.setImageDrawable(null);
            }
        }
        boolean z = !TextUtils.isEmpty(charSequence);
        if (textView != null) {
            if (z) {
                textView.setText(charSequence);
                textView.setVisibility(0);
                setVisibility(0);
            } else {
                textView.setVisibility(8);
                textView.setText((CharSequence) null);
            }
        }
        if (liveIconView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) liveIconView.getLayoutParams();
            if (z && liveIconView.getVisibility() == 0) {
                i = this.LJLJLLL.LJIIIIZZ(8);
            } else {
                i = 0;
            }
            if (this.LJLJLLL.LLII) {
                if (i != C16530kr.LIZIZ(marginLayoutParams)) {
                    C16530kr.LJI(marginLayoutParams, i);
                    marginLayoutParams.bottomMargin = 0;
                    liveIconView.setLayoutParams(marginLayoutParams);
                    liveIconView.requestLayout();
                }
            } else if (i != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = i;
                C16530kr.LJI(marginLayoutParams, 0);
                liveIconView.setLayoutParams(marginLayoutParams);
                liveIconView.requestLayout();
            }
        }
        C0KT c0kt3 = this.LJLIL;
        if (c0kt3 != null) {
            charSequence2 = c0kt3.LJ;
        } else {
            charSequence2 = null;
        }
        if (!z) {
            charSequence3 = charSequence2;
        }
        C03E.LIZ(this, charSequence3);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int tabMaxWidth = this.LJLJLLL.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i = View.MeasureSpec.makeMeasureSpec(this.LJLJLLL.LL, LiveLayoutPreloadThreadPriority.DEFAULT);
        }
        super.onMeasure(i, i2);
        if (this.LJLILLLLZI != null) {
            float f = this.LJLJLLL.LJZ;
            C0KT c0kt = this.LJLIL;
            if (c0kt != null) {
                i3 = c0kt.LJIIIZ;
                if (i3 <= 0) {
                    i3 = this.LJLJLJ;
                }
            } else {
                i3 = this.LJLJLJ;
            }
            LiveIconView liveIconView = this.LJLJI;
            if (liveIconView != null && liveIconView.getVisibility() == 0) {
                i3 = 1;
            } else {
                TextView textView = this.LJLILLLLZI;
                if (textView != null && textView.getLineCount() > 1) {
                    f = this.LJLJLLL.LJZI;
                }
            }
            float textSize = this.LJLILLLLZI.getTextSize();
            int lineCount = this.LJLILLLLZI.getLineCount();
            int LIZIZ = C07Y.LIZIZ(this.LJLILLLLZI);
            if (f != textSize || (LIZIZ >= 0 && i3 != LIZIZ)) {
                if (this.LJLJLLL.LLIFFJFJJ == 1 && f > textSize && lineCount == 1) {
                    Layout layout = this.LJLILLLLZI.getLayout();
                    if (layout != null) {
                        if ((f / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.LJLILLLLZI.setTextSize(0, f);
                this.LJLILLLLZI.setMaxLines(i3);
                C0KT c0kt2 = this.LJLIL;
                if (c0kt2 != null && (i4 = c0kt2.LJIIJ) > 0) {
                    this.LJLILLLLZI.setMaxWidth(i4);
                }
                super.onMeasure(i, i2);
            }
        }
    }
}
