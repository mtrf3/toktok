package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
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
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import o3.h0;

/* renamed from: X.Vl3, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80653Vl3 extends LinearLayout {
    public C80654Vl4 LJLIL;
    public TextView LJLILLLLZI;
    public ImageView LJLJI;
    public View LJLJJI;
    public TextView LJLJJL;
    public ImageView LJLJJLL;
    public int LJLJL;
    public final /* synthetic */ C80655Vl5 LJLJLJ;

    public final void LIZ() {
        View view;
        C80654Vl4 c80654Vl4 = this.LJLIL;
        if (c80654Vl4 != null && (view = c80654Vl4.LJ) != null) {
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
            ImageView imageView = this.LJLJI;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.LJLJI.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(R.id.text1);
            this.LJLJJL = textView2;
            if (textView2 != null) {
                this.LJLJL = C07Y.LIZIZ(textView2);
            }
            this.LJLJJLL = (ImageView) view.findViewById(R.id.icon);
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
                ImageView imageView2 = (ImageView) C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), com.zhiliaoapp.musically.R.layout.ak7, this, false);
                addView(imageView2, 0);
                this.LJLJI = imageView2;
            }
            if (this.LJLILLLLZI == null) {
                TextView textView3 = (TextView) C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), com.zhiliaoapp.musically.R.layout.ak8, this, false);
                addView(textView3);
                this.LJLILLLLZI = textView3;
                this.LJLJL = C07Y.LIZIZ(textView3);
            }
            C023107f.LJII(this.LJLILLLLZI, this.LJLJLJ.LJLJLLL);
            ColorStateList colorStateList = this.LJLJLJ.LJLL;
            if (colorStateList != null) {
                this.LJLILLLLZI.setTextColor(colorStateList);
            }
            LIZIZ(this.LJLILLLLZI, this.LJLJI);
        } else {
            TextView textView4 = this.LJLJJL;
            if (textView4 != null || this.LJLJJLL != null) {
                LIZIZ(textView4, this.LJLJJLL);
            }
        }
        if (c80654Vl4 != null) {
            C80655Vl5 c80655Vl5 = c80654Vl4.LJI;
            if (c80655Vl5 != null) {
                if (c80655Vl5.getSelectedTabPosition() == c80654Vl4.LIZLLL) {
                    z = true;
                }
            } else {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
        }
        setSelected(z);
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (this.LJLIL != null) {
            if (!performClick) {
                playSoundEffect(0);
            }
            this.LJLJLJ.getClass();
            C80654Vl4 c80654Vl4 = this.LJLIL;
            C80655Vl5 c80655Vl5 = c80654Vl4.LJI;
            if (c80655Vl5 != null) {
                c80655Vl5.LJIIJJI(c80654Vl4, true);
                return true;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        return performClick;
    }

    public TextView getCustomTextView() {
        return this.LJLJJL;
    }

    public C80654Vl4 getTab() {
        return this.LJLIL;
    }

    public TextView getTextView() {
        return this.LJLILLLLZI;
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
        ImageView imageView = this.LJLJI;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        View view = this.LJLJJI;
        if (view != null) {
            view.setSelected(z);
        }
    }

    public void setTab(C80654Vl4 c80654Vl4) {
        if (c80654Vl4 != this.LJLIL) {
            this.LJLIL = c80654Vl4;
            LIZ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80653Vl3(C80655Vl5 c80655Vl5, Context context) {
        super(context);
        this.LJLJLJ = c80655Vl5;
        this.LJLJL = 2;
        int i = c80655Vl5.LJLLJ;
        if (i != 0) {
            C16300kU.LJIILLIIL(this, C20110qd.LIZ(context, i));
        }
        C16310kV.LJIIJ(this, c80655Vl5.LJLJJL, c80655Vl5.LJLJJLL, c80655Vl5.LJLJL, c80655Vl5.LJLJLJ);
        setGravity(17);
        setOrientation(1);
        setClickable(true);
        h0.LJJIFFI(this, C16110kB.LIZ(getContext()));
    }

    public final void LIZIZ(TextView textView, ImageView imageView) {
        Drawable drawable;
        CharSequence charSequence;
        CharSequence charSequence2;
        C80654Vl4 c80654Vl4 = this.LJLIL;
        CharSequence charSequence3 = null;
        if (c80654Vl4 != null) {
            drawable = c80654Vl4.LIZ;
            charSequence = c80654Vl4.LIZIZ;
            charSequence2 = c80654Vl4.LIZJ;
        } else {
            drawable = null;
            charSequence = null;
            charSequence2 = null;
        }
        int i = 0;
        if (imageView != null) {
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                setVisibility(0);
            } else {
                imageView.setVisibility(8);
                imageView.setImageDrawable(null);
            }
            imageView.setContentDescription(charSequence2);
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
            textView.setContentDescription(charSequence2);
        }
        if (imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            if (z && imageView.getVisibility() == 0) {
                i = this.LJLJLJ.LJII(8);
            }
            if (i != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = i;
                imageView.requestLayout();
            }
        }
        if (!z) {
            charSequence3 = charSequence2;
        }
        C03E.LIZ(this, charSequence3);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int tabMaxWidth = this.LJLJLJ.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i = View.MeasureSpec.makeMeasureSpec(this.LJLJLJ.LJLLL, LiveLayoutPreloadThreadPriority.DEFAULT);
        }
        super.onMeasure(i, i2);
        if (this.LJLILLLLZI != null) {
            getResources();
            float f = this.LJLJLJ.LJLLI;
            int i3 = this.LJLJL;
            ImageView imageView = this.LJLJI;
            if (imageView != null && imageView.getVisibility() == 0) {
                i3 = 1;
            } else {
                TextView textView = this.LJLILLLLZI;
                if (textView != null && textView.getLineCount() > 1) {
                    f = this.LJLJLJ.LJLLILLLL;
                }
            }
            float textSize = this.LJLILLLLZI.getTextSize();
            int lineCount = this.LJLILLLLZI.getLineCount();
            int LIZIZ = C07Y.LIZIZ(this.LJLILLLLZI);
            if (f != textSize || (LIZIZ >= 0 && i3 != LIZIZ)) {
                if (this.LJLJLJ.LJZL == 1 && f > textSize && lineCount == 1) {
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
                super.onMeasure(i, i2);
            }
        }
    }
}
