package X;

import Y.IDAListenerS77S0100000_9;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.LLp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54113LLp extends FrameLayout {
    public final LH4 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public View.OnTouchListener LJLJI;
    public ImageView LJLJJI;
    public TuxTextView LJLJJL;
    public ImageView LJLJJLL;
    public TextView LJLJL;
    public ImageView LJLJLJ;
    public AbstractC54111LLn LJLJLLL;
    public ImageView LJLL;
    public View LJLLI;
    public ImageView LJLLILLLL;
    public boolean LJLLJ;
    public final C54100LLc LJLLL;

    private final TimeInterpolator getAvatarInterpolator() {
        return (TimeInterpolator) this.LJLILLLLZI.getValue();
    }

    public final void LIZ() {
        if (this.LJLJJI == null || this.LJLL == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new IDAListenerS77S0100000_9(this, 17));
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(getAvatarInterpolator());
        if (this.LJLJL != null) {
            Animator[] animatorArr = new Animator[3];
            ImageView imageView = this.LJLL;
            if (imageView != null) {
                animatorArr[0] = ObjectAnimator.ofFloat(imageView, "alpha", 0.0f, 1.0f);
                ImageView imageView2 = this.LJLL;
                if (imageView2 != null) {
                    animatorArr[1] = ObjectAnimator.ofFloat(imageView2, "alpha", 0.0f, 1.0f);
                    TextView textView = this.LJLJL;
                    if (textView != null) {
                        animatorArr[2] = ObjectAnimator.ofFloat(textView, "alpha", 0.0f, 1.0f);
                        animatorSet.playTogether(animatorArr);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            Animator[] animatorArr2 = new Animator[2];
            ImageView imageView3 = this.LJLL;
            if (imageView3 != null) {
                animatorArr2[0] = ObjectAnimator.ofFloat(imageView3, "alpha", 0.0f, 1.0f);
                ImageView imageView4 = this.LJLL;
                if (imageView4 != null) {
                    animatorArr2[1] = ObjectAnimator.ofFloat(imageView4, "alpha", 0.0f, 1.0f);
                    animatorSet.playTogether(animatorArr2);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        animatorSet.start();
    }

    public final void LIZIZ() {
        ImageView imageView = this.LJLL;
        if (imageView != null) {
            C17N.LJJIIJZLJL(imageView);
        }
        ImageView imageView2 = this.LJLJJI;
        if (imageView2 != null) {
            imageView2.setAlpha(1.0f);
        }
        TextView textView = this.LJLJL;
        if (textView != null) {
            textView.setAlpha(1.0f);
        }
        setTabIconVisibility(0);
    }

    public final void LIZJ() {
        TextView textView = this.LJLJL;
        if (textView != null && textView.getAlpha() == 0.0f) {
            textView.setAlpha(1.0f);
        }
    }

    public final Drawable getTabIconBackImageDrawable() {
        ImageView imageView = this.LJLJJI;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public final float getTabIconViewScaleX() {
        ImageView imageView = this.LJLJJI;
        if (imageView != null) {
            return imageView.getScaleX();
        }
        return 1.0f;
    }

    public final CharSequence getTitleText() {
        TuxTextView tuxTextView = this.LJLJJL;
        if (tuxTextView != null) {
            return tuxTextView.getText();
        }
        return null;
    }

    public final TextView getCountDotView() {
        return this.LJLJL;
    }

    public final ImageView getCustomIconView$homepage_common_release() {
        return this.LJLLILLLL;
    }

    public final View getCustomizedNoticeUI() {
        return this.LJLLI;
    }

    public final LH4 getIconData() {
        return this.LJLIL;
    }

    public final AbstractC54111LLn getIconTabLogic() {
        return this.LJLJLLL;
    }

    public final ImageView getRedDotVIew() {
        return this.LJLJJLL;
    }

    public final ImageView getTabIcon() {
        return this.LJLJJI;
    }

    public final TuxTextView getTabTitleView() {
        return this.LJLJJL;
    }

    public final View.OnTouchListener getTouchListener() {
        return this.LJLJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54113LLp(LH4 iconData) {
        super(iconData.LIZ);
        o.LJIIIZ(iconData, "iconData");
        new LinkedHashMap();
        this.LJLIL = iconData;
        this.LJLILLLLZI = C221108m2.LIZIZ(C54118LLu.LJLIL);
        this.LJLLL = new C54100LLc(this);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.LJLJI;
        if (onTouchListener != null) {
            onTouchListener.onTouch(this, motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setAvatarImageViewScaleX(float f) {
        ImageView imageView = this.LJLL;
        if (imageView == null) {
            return;
        }
        imageView.setScaleX(f);
    }

    public final void setAvatarImageViewScaleY(float f) {
        ImageView imageView = this.LJLL;
        if (imageView == null) {
            return;
        }
        imageView.setScaleY(f);
    }

    public final void setCountDotText(String text) {
        o.LJIIIZ(text, "text");
        TextView textView = this.LJLJL;
        if (textView == null) {
            return;
        }
        textView.setText(text);
    }

    public final void setCountDotView(TextView textView) {
        this.LJLJL = textView;
    }

    public final void setCountDotVisibility(int i) {
        TextView textView = this.LJLJL;
        if (textView == null) {
            return;
        }
        textView.setVisibility(i);
    }

    public final void setCustomIconView$homepage_common_release(ImageView imageView) {
        this.LJLLILLLL = imageView;
    }

    public final void setCustomViewAnimation$homepage_common_release(AbstractC55918Lx4 block) {
        ImageView imageView;
        o.LJIIIZ(block, "block");
        ImageView imageView2 = this.LJLJJI;
        if (imageView2 != null && (imageView = this.LJLLILLLL) != null) {
            block.LJ(imageView2, imageView);
        }
    }

    public final void setIconTabLogic(AbstractC54111LLn iconTabLogic) {
        o.LJIIIZ(iconTabLogic, "iconTabLogic");
        this.LJLJLLL = iconTabLogic;
    }

    public final void setRedDotVIew(ImageView imageView) {
        this.LJLJJLL = imageView;
    }

    public final void setRedViewScaleX(float f) {
        ImageView imageView = this.LJLJJLL;
        if (imageView != null) {
            imageView.setScaleX(f);
        }
        TextView textView = this.LJLJL;
        if (textView == null) {
            return;
        }
        textView.setScaleX(f);
    }

    public final void setRedViewScaleY(float f) {
        ImageView imageView = this.LJLJJLL;
        if (imageView != null) {
            imageView.setScaleY(f);
        }
        TextView textView = this.LJLJL;
        if (textView == null) {
            return;
        }
        textView.setScaleY(f);
    }

    public final void setTabDotVisibility(int i) {
        ImageView imageView = this.LJLJJLL;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(i);
    }

    public final void setTabIconBackImageDrawable(Drawable drawable) {
        o.LJIIIZ(drawable, "drawable");
        ImageView imageView = this.LJLJJI;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    public final void setTabIconBackLayoutParams(ViewGroup.LayoutParams layoutParams) {
        o.LJIIIZ(layoutParams, "layoutParams");
        ImageView imageView = this.LJLJJI;
        if (imageView == null) {
            return;
        }
        imageView.setLayoutParams(layoutParams);
    }

    public final void setTabIconBackScaleType(ImageView.ScaleType scaleType) {
        o.LJIIIZ(scaleType, "scaleType");
        ImageView imageView = this.LJLJJI;
        if (imageView == null) {
            return;
        }
        imageView.setScaleType(scaleType);
    }

    public final void setTabIconImageDrawable(Drawable drawable) {
        o.LJIIIZ(drawable, "drawable");
        ImageView imageView = this.LJLJJI;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    public final void setTabIconScaleX(float f) {
        ImageView imageView = this.LJLJJI;
        if (imageView == null) {
            return;
        }
        imageView.setScaleX(f);
    }

    public final void setTabIconScaleY(float f) {
        ImageView imageView = this.LJLJJI;
        if (imageView == null) {
            return;
        }
        imageView.setScaleY(f);
    }

    public final void setTabIconVisibility(int i) {
        ImageView imageView = this.LJLJJI;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(i);
    }

    public final void setTabRefreshAlpha(float f) {
        ImageView imageView = this.LJLJLJ;
        if (imageView == null) {
            return;
        }
        imageView.setAlpha(f);
    }

    public final void setTabRefreshIconColor(int i) {
        ImageView imageView = this.LJLJLJ;
        if (imageView != null) {
            imageView.setColorFilter(i);
        }
    }

    public final void setTabRefreshRotation(float f) {
        ImageView imageView = this.LJLJLJ;
        if (imageView == null) {
            return;
        }
        imageView.setRotation(f);
    }

    public final void setTabRefreshScaleX(float f) {
        ImageView imageView = this.LJLJLJ;
        if (imageView == null) {
            return;
        }
        imageView.setScaleX(f);
    }

    public final void setTabRefreshScaleY(float f) {
        ImageView imageView = this.LJLJLJ;
        if (imageView == null) {
            return;
        }
        imageView.setScaleY(f);
    }

    public final void setTabRefreshVisibility(int i) {
        ImageView imageView = this.LJLJLJ;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(i);
    }

    public final void setTitleLetterSpacing(float f) {
        TuxTextView tuxTextView = this.LJLJJL;
        if (tuxTextView == null) {
            return;
        }
        tuxTextView.setLetterSpacing(f);
    }

    public final void setTitleText(CharSequence charSequence) {
        o.LJIIIZ(charSequence, "charSequence");
        TuxTextView tuxTextView = this.LJLJJL;
        if (tuxTextView == null) {
            return;
        }
        tuxTextView.setText(charSequence);
    }

    public final void setTitleTextColor(int i) {
        TuxTextView tuxTextView = this.LJLJJL;
        if (tuxTextView != null) {
            tuxTextView.setTextColor(i);
        }
    }

    public final void setTitleTextResource(int i) {
        TuxTextView tuxTextView = this.LJLJJL;
        if (tuxTextView != null) {
            tuxTextView.setText(i);
        }
    }

    public final void setTitleTuxFont(int i) {
        TuxTextView tuxTextView = this.LJLJJL;
        if (tuxTextView != null) {
            tuxTextView.setTuxFont(i);
        }
    }

    public final void setTitleVisibility(int i) {
        TuxTextView tuxTextView = this.LJLJJL;
        if (tuxTextView == null) {
            return;
        }
        tuxTextView.setVisibility(i);
    }

    public final void setTouchListener(View.OnTouchListener onTouchListener) {
        this.LJLJI = onTouchListener;
    }
}
