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

/* renamed from: X.VlM, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80672VlM extends LinearLayout {
    public C80674VlO LJLIL;
    public TextView LJLILLLLZI;
    public ImageView LJLJI;
    public View LJLJJI;
    public TextView LJLJJL;
    public ImageView LJLJJLL;
    public int LJLJL;
    public boolean LJLJLJ;
    public final /* synthetic */ C80675VlP LJLJLLL;

    public void setTabViewSelectedListener(InterfaceC80673VlN interfaceC80673VlN) {
    }

    public final void LIZ() {
        View view;
        C80674VlO c80674VlO = this.LJLIL;
        if (c80674VlO != null && (view = c80674VlO.LJFF) != null) {
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
                TextView textView3 = (TextView) C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), com.zhiliaoapp.musically.R.layout.dqz, this, false);
                addView(textView3);
                this.LJLILLLLZI = textView3;
                this.LJLJL = C07Y.LIZIZ(textView3);
            }
            C023107f.LJII(this.LJLILLLLZI, this.LJLJLLL.LJLJLLL);
            ColorStateList colorStateList = this.LJLJLLL.LJLL;
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
        if (c80674VlO != null) {
            C80675VlP c80675VlP = c80674VlO.LJII;
            if (c80675VlP != null) {
                if (c80675VlP.getSelectedTabPosition() == c80674VlO.LJ) {
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
            TAY tay = this.LJLJLLL.LLIIIJ;
            if (tay != null) {
                tay.LIZIZ(this.LJLIL);
            } else {
                this.LJLIL.LIZ();
            }
            return true;
        }
        return performClick;
    }

    public TextView getCustomTextView() {
        return this.LJLJJL;
    }

    public C80674VlO getTab() {
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

    public void setTab(C80674VlO c80674VlO) {
        if (c80674VlO != this.LJLIL) {
            this.LJLIL = c80674VlO;
            LIZ();
        }
    }

    public void setUseInnerMarginBottomWhenUseIconView(boolean z) {
        this.LJLJLJ = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80672VlM(C80675VlP c80675VlP, Context context) {
        super(context);
        this.LJLJLLL = c80675VlP;
        this.LJLJL = 2;
        this.LJLJLJ = true;
        int i = c80675VlP.LJLLJ;
        if (i != 0) {
            C16300kU.LJIILLIIL(this, C20110qd.LIZ(context, i));
        }
        C16310kV.LJIIJ(this, c80675VlP.LJLJJL, c80675VlP.LJLJJLL, c80675VlP.LJLJL, c80675VlP.LJLJLJ);
        setGravity(17);
        setOrientation(1);
        setClickable(true);
        h0.LJJIFFI(this, C16110kB.LIZ(getContext()));
    }

    public final void LIZIZ(TextView textView, ImageView imageView) {
        Drawable drawable;
        CharSequence charSequence;
        CharSequence charSequence2;
        C80674VlO c80674VlO = this.LJLIL;
        CharSequence charSequence3 = null;
        if (c80674VlO != null) {
            drawable = c80674VlO.LIZIZ;
            charSequence = c80674VlO.LIZJ;
            charSequence2 = c80674VlO.LIZLLL;
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
        if (imageView != null && this.LJLJLJ) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            if (z && imageView.getVisibility() == 0) {
                i = this.LJLJLLL.LJIIIIZZ(8);
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
        int tabMaxWidth = this.LJLJLLL.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i = View.MeasureSpec.makeMeasureSpec(this.LJLJLLL.LJLLL, LiveLayoutPreloadThreadPriority.DEFAULT);
        }
        super.onMeasure(i, i2);
        if (this.LJLILLLLZI != null) {
            getResources();
            float f = this.LJLJLLL.LJLLI;
            int i3 = this.LJLJL;
            ImageView imageView = this.LJLJI;
            if (imageView != null && imageView.getVisibility() == 0) {
                i3 = 1;
            } else {
                TextView textView = this.LJLILLLLZI;
                if (textView != null && textView.getLineCount() > 1) {
                    f = this.LJLJLLL.LJLLILLLL;
                }
            }
            float textSize = this.LJLILLLLZI.getTextSize();
            int lineCount = this.LJLILLLLZI.getLineCount();
            int LIZIZ = C07Y.LIZIZ(this.LJLILLLLZI);
            if (f != textSize || (LIZIZ >= 0 && i3 != LIZIZ)) {
                if (this.LJLJLLL.LJZL == 1 && f > textSize && lineCount == 1) {
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
