package X;

import Y.ARunnableS46S0100000_10;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.N7v, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC58851N7v extends FrameLayout {
    public View LJLIL;
    public TextView LJLILLLLZI;
    public C29701Eo LJLJI;
    public ARunnableS46S0100000_10 LJLJJI;
    public ARunnableS46S0100000_10 LJLJJL;
    public AwemeRawAd LJLJJLL;
    public Aweme LJLJL;
    public AwemeSearchAdModel LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public int LJLLI;

    public abstract void LIZ(View view);

    public abstract void LJ(int i, int i2);

    public abstract boolean LJFF();

    public abstract int getLayoutId$commercialize_search_impl_release();

    public abstract void setTransformButtonVisibility$commercialize_search_impl_release(int i);

    private final float getColorChangeMillSeconds() {
        float f;
        AwemeSearchAdModel awemeSearchAdModel = this.LJLJLJ;
        if (awemeSearchAdModel != null) {
            f = awemeSearchAdModel.getButtonColorShowSeconds();
        } else {
            f = 0.0f;
        }
        return f * 1000.0f;
    }

    private final float getShowMillSeconds() {
        float f;
        AwemeSearchAdModel awemeSearchAdModel = this.LJLJLJ;
        if (awemeSearchAdModel != null) {
            f = awemeSearchAdModel.getShowButtonSeconds();
        } else {
            f = 0.0f;
        }
        return f * 1000.0f;
    }

    private final String getTransformButtonText() {
        String buttonText;
        AwemeSearchAdModel awemeSearchAdModel = this.LJLJLJ;
        if (awemeSearchAdModel == null || (buttonText = awemeSearchAdModel.getSearchAdTransformButtonText()) == null) {
            AwemeRawAd awemeRawAd = this.LJLJJLL;
            if (awemeRawAd != null) {
                buttonText = awemeRawAd.getButtonText();
            }
            return "";
        }
        if (buttonText != null && buttonText.length() > 0) {
            return buttonText;
        }
        return "";
    }

    public final void LIZJ() {
        ARunnableS46S0100000_10 aRunnableS46S0100000_10 = this.LJLJJL;
        if (aRunnableS46S0100000_10 != null) {
            removeCallbacks(aRunnableS46S0100000_10);
        }
        if (this.LJLL) {
            return;
        }
        if (this.LJLJJL == null) {
            this.LJLJJL = new ARunnableS46S0100000_10(this, 118);
        }
        postDelayed(this.LJLJJL, 0L);
    }

    public final void LJI() {
        ARunnableS46S0100000_10 aRunnableS46S0100000_10 = this.LJLJJI;
        if (aRunnableS46S0100000_10 != null) {
            removeCallbacks(aRunnableS46S0100000_10);
        }
        if (this.LJLJJI == null) {
            this.LJLJJI = new ARunnableS46S0100000_10(this, 119);
        }
        postDelayed(this.LJLJJI, 0L);
    }

    public final int getBackGroundColor() {
        int i = this.LJLLI;
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            return ((ColorDrawable) background).getColor();
        }
        return i;
    }

    public final int getBgColor() {
        String searchAdTransformButtonColor;
        AwemeSearchAdModel awemeSearchAdModel = this.LJLJLJ;
        if (awemeSearchAdModel != null && (searchAdTransformButtonColor = awemeSearchAdModel.getSearchAdTransformButtonColor()) != null && searchAdTransformButtonColor.length() > 0) {
            return ColorProtector.parseColor(searchAdTransformButtonColor);
        }
        return C78609UtB.LJJJ(R.attr.eb, getContext());
    }

    public final void LIZLLL() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = -200;
        setLayoutParams(marginLayoutParams);
    }

    public int getBtnBottomMargin() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        return ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }

    public final int getDefaultBackgroundColor() {
        return this.LJLLI;
    }

    public final AwemeSearchAdModel getMAmemeSearchAdInfo$commercialize_search_impl_release() {
        return this.LJLJLJ;
    }

    public final AwemeRawAd getMAwemeRawAd$commercialize_search_impl_release() {
        return this.LJLJJLL;
    }

    public final void LJII(int i) {
        Aweme aweme;
        if (this.LJLJI != null && (aweme = this.LJLJL) != null && C1DF.LJIL(aweme)) {
            setVisibility(0);
            setLivePlayingViewVisibility(0);
            if (i == 2) {
                this.LJLL = true;
                LJ(this.LJLLI, 0);
            }
        }
    }

    public final void setDefaultBackgroundColor(int i) {
        this.LJLLI = i;
    }

    public void setLivePlayingViewVisibility(int i) {
        C29701Eo c29701Eo = this.LJLJI;
        if (c29701Eo != null) {
            if (i == 0) {
                if (!c29701Eo.isAnimating()) {
                    c29701Eo.playAnimation();
                }
            } else if (c29701Eo.isAnimating()) {
                c29701Eo.cancelAnimation();
            }
            c29701Eo.setVisibility(i);
        }
    }

    public final void setMAmemeSearchAdInfo$commercialize_search_impl_release(AwemeSearchAdModel awemeSearchAdModel) {
        this.LJLJLJ = awemeSearchAdModel;
    }

    public final void setMAwemeRawAd$commercialize_search_impl_release(AwemeRawAd awemeRawAd) {
        this.LJLJJLL = awemeRawAd;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC58851N7v(Context mContext, AttributeSet attributeSet) {
        this(mContext, attributeSet, 0);
        o.LJIIIZ(mContext, "mContext");
    }

    public final void LIZIZ(Aweme aweme, View.OnClickListener onClickListener) {
        AwemeRawAd awemeRawAd;
        AwemeSearchAdModel awemeSearchAdModel;
        TextView textView;
        this.LJLJL = aweme;
        C29701Eo c29701Eo = null;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        this.LJLJJLL = awemeRawAd;
        if (awemeRawAd != null) {
            awemeSearchAdModel = awemeRawAd.getSearchAdInfo();
        } else {
            awemeSearchAdModel = null;
        }
        this.LJLJLJ = awemeSearchAdModel;
        if (!LJFF()) {
            setTransformButtonVisibility$commercialize_search_impl_release(8);
            return;
        }
        if (this.LJLJJLL != null) {
            if (!this.LJLJLLL) {
                View inflate = View.inflate(getContext(), getLayoutId$commercialize_search_impl_release(), this);
                this.LJLIL = inflate;
                if (inflate != null) {
                    textView = (TextView) inflate.findViewById(R.id.je1);
                } else {
                    textView = null;
                }
                this.LJLILLLLZI = textView;
                View view = this.LJLIL;
                if (view != null) {
                    view.findViewById(R.id.je0);
                }
                View view2 = this.LJLIL;
                if (view2 != null) {
                    c29701Eo = (C29701Eo) view2.findViewById(R.id.jdv);
                }
                this.LJLJI = c29701Eo;
                LIZ(this.LJLIL);
                this.LJLJLLL = true;
            }
            setTransformButtonVisibility$commercialize_search_impl_release(0);
            TextView textView2 = this.LJLILLLLZI;
            if (textView2 != null) {
                textView2.setText(getTransformButtonText());
            }
            LJ(this.LJLLI, 0);
        } else {
            setTransformButtonVisibility$commercialize_search_impl_release(8);
        }
        setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC58851N7v(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "mContext");
    }
}
