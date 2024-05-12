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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.tux.input.TuxTextView;
import o3.h0;

/* renamed from: X.VlX, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80683VlX extends LinearLayout {
    public C80688Vlc LJLIL;
    public TuxTextView LJLILLLLZI;
    public ImageView LJLJI;
    public View LJLJJI;
    public TextView LJLJJL;
    public ImageView LJLJJLL;
    public int LJLJL;
    public final /* synthetic */ C80684VlY LJLJLJ;

    public void setTabViewSelectedListener(InterfaceC80693Vlh interfaceC80693Vlh) {
    }

    public final void LIZ() {
        View view;
        C80688Vlc c80688Vlc = this.LJLIL;
        if (c80688Vlc != null && (view = c80688Vlc.LJ) != null) {
            ViewParent parent = view.getParent();
            if (parent != this) {
                if (parent != null) {
                    C16880lQ.LJLLL(view, (ViewGroup) parent);
                }
                addView(view);
            }
            this.LJLJJI = view;
            TuxTextView tuxTextView = this.LJLILLLLZI;
            if (tuxTextView != null) {
                tuxTextView.setVisibility(8);
            }
            ImageView imageView = this.LJLJI;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.LJLJI.setImageDrawable(null);
            }
            TextView textView = (TextView) view.findViewById(R.id.text1);
            this.LJLJJL = textView;
            if (textView != null) {
                this.LJLJL = C07Y.LIZIZ(textView);
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
                TuxTextView tuxTextView2 = new TuxTextView(getContext());
                tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
                tuxTextView2.setGravity(17);
                tuxTextView2.setMaxLines(2);
                addView(tuxTextView2, new FrameLayout.LayoutParams(-2, -2));
                this.LJLILLLLZI = tuxTextView2;
                this.LJLJL = C07Y.LIZIZ(tuxTextView2);
            }
            this.LJLILLLLZI.setTuxFont(this.LJLJLJ.LJLL);
            this.LJLJLJ.LJLLI = this.LJLILLLLZI.getTextSize();
            ColorStateList colorStateList = this.LJLJLJ.LJLJLLL;
            if (colorStateList != null) {
                this.LJLILLLLZI.setTextColor(colorStateList);
            }
            LIZIZ(this.LJLILLLLZI, this.LJLJI);
        } else {
            TextView textView2 = this.LJLJJL;
            if (textView2 != null || this.LJLJJLL != null) {
                LIZIZ(textView2, this.LJLJJLL);
            }
        }
        if (c80688Vlc != null) {
            C80684VlY c80684VlY = c80688Vlc.LJI;
            if (c80684VlY != null) {
                if (c80684VlY.getSelectedTabPosition() == c80688Vlc.LIZLLL) {
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
            C75Z c75z = this.LJLJLJ.LLIIIJ;
            if (c75z != null) {
                c75z.LIZ(this.LJLIL);
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

    public C80688Vlc getTab() {
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
        TuxTextView tuxTextView = this.LJLILLLLZI;
        if (tuxTextView != null) {
            tuxTextView.setSelected(z);
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

    public void setTab(C80688Vlc c80688Vlc) {
        if (c80688Vlc != this.LJLIL) {
            this.LJLIL = c80688Vlc;
            LIZ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80683VlX(C80684VlY c80684VlY, Context context) {
        super(context);
        this.LJLJLJ = c80684VlY;
        this.LJLJL = 2;
        int i = c80684VlY.LJLLJ;
        if (i != 0) {
            C16300kU.LJIILLIIL(this, C20110qd.LIZ(context, i));
        }
        C16310kV.LJIIJ(this, c80684VlY.LJLJJL, c80684VlY.LJLJJLL, c80684VlY.LJLJL, c80684VlY.LJLJLJ);
        setGravity(17);
        setOrientation(1);
        setClickable(true);
        h0.LJJIFFI(this, C16110kB.LIZ(getContext()));
    }

    public final void LIZIZ(TextView textView, ImageView imageView) {
        Drawable drawable;
        CharSequence charSequence;
        CharSequence charSequence2;
        C80688Vlc c80688Vlc = this.LJLIL;
        CharSequence charSequence3 = null;
        if (c80688Vlc != null) {
            drawable = c80688Vlc.LIZ;
            charSequence = c80688Vlc.LIZIZ;
            charSequence2 = c80688Vlc.LIZJ;
        } else {
            drawable = null;
            charSequence = null;
            charSequence2 = null;
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
                TuxTextView tuxTextView = this.LJLILLLLZI;
                if (tuxTextView != null && tuxTextView.getLineCount() > 1) {
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
