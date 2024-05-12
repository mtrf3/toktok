package X;

import Y.ARunnableS11S0101000_7;
import Y.ARunnableS2S0102000_10;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUITasks;
import com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;
import ujb.o;

/* loaded from: classes11.dex */
public abstract class NQ1 extends FrameLayout {
    public static final /* synthetic */ int LLII = 0;
    public View LJLIL;
    public boolean LJLILLLLZI;
    public int LJLJI;
    public TextView LJLJJI;
    public TextView LJLJJL;
    public C62846OlW LJLJJLL;
    public View LJLJL;
    public View LJLJLJ;
    public ImageView LJLJLLL;
    public ObjectAnimator LJLL;
    public int LJLLI;
    public final Context LJLLILLLL;
    public String LJLLJ;
    public ARunnableS2S0102000_10 LJLLL;
    public Aweme LJLLLL;
    public ARunnableS2S0102000_10 LJLLLLLL;
    public C29701Eo LJLZ;
    public AnimatedDrawable2 LJZ;
    public ValueAnimator LJZI;
    public View LJZL;
    public boolean LL;
    public final ARunnableS11S0101000_7 LLD;
    public int LLF;
    public long LLFF;
    public DataCenter LLFFF;
    public NQ7 LLFII;
    public RunnableC31793Cdp LLFZ;
    public final PThreadScheduledThreadPoolExecutor LLI;
    public boolean LLIFFJFJJ;

    public abstract void LIZ();

    public final void LJ() {
        this.LJLILLLLZI = false;
        this.LJLJI = 0;
        ARunnableS2S0102000_10 aRunnableS2S0102000_10 = this.LJLLL;
        if (aRunnableS2S0102000_10 != null) {
            removeCallbacks(aRunnableS2S0102000_10);
        }
        ARunnableS2S0102000_10 aRunnableS2S0102000_102 = this.LJLLLLLL;
        if (aRunnableS2S0102000_102 != null) {
            removeCallbacks(aRunnableS2S0102000_102);
        }
        this.LLIFFJFJJ = true;
        RunnableC31793Cdp runnableC31793Cdp = this.LLFZ;
        if (runnableC31793Cdp != null) {
            removeCallbacks(runnableC31793Cdp);
            this.LLFZ = null;
        }
        NQ7 nq7 = this.LLFII;
        if (nq7 != null) {
            nq7.dispose();
            this.LLFII = null;
        }
    }

    public abstract void LJIIJ(int i, int i2);

    public abstract boolean LJIIJJI();

    public abstract boolean LJIIL();

    public abstract boolean LJIILIIL();

    public abstract int getLayoutId();

    public abstract void setLabelVisibility(int i);

    static {
        C16880lQ.LJLLJ(NQ1.class);
    }

    private void LIZLLL() {
        ObjectAnimator objectAnimator = this.LJLL;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.LJLJL.clearAnimation();
        }
        View view = this.LJLJL;
        if (view != null) {
            view.setBackgroundDrawable(null);
        }
        View view2 = this.LJLJLJ;
        if (view2 != null) {
            view2.setBackgroundDrawable(null);
        }
    }

    public final boolean LJFF() {
        int i = this.LJLLI;
        if (i != 2 && i != 4 && i != 3) {
            return false;
        }
        return true;
    }

    public final void LJI() {
        if (!this.LL) {
            View inflate = View.inflate(getContext(), getLayoutId(), this);
            this.LJLIL = inflate;
            this.LJLJL = inflate.findViewById(R.id.cfu);
            this.LJLJLJ = this.LJLIL.findViewById(R.id.cfv);
            this.LJLJJI = (TextView) this.LJLIL.findViewById(R.id.g8w);
            this.LJLJJL = (TextView) this.LJLIL.findViewById(R.id.g8t);
            this.LJLJLLL = (ImageView) this.LJLIL.findViewById(R.id.cft);
            this.LJZL = this.LJLIL.findViewById(R.id.cg7);
            this.LJLZ = (C29701Eo) this.LJLIL.findViewById(R.id.lhn);
            this.LJLJJLL = (C62846OlW) this.LJLIL.findViewById(R.id.j3k);
            KP0.LIZ(this);
            this.LJLJI = 0;
            this.LL = true;
        }
    }

    public final void LJIILJJIL() {
        int i;
        int i2;
        ARunnableS2S0102000_10 aRunnableS2S0102000_10 = this.LJLLL;
        if (aRunnableS2S0102000_10 != null) {
            removeCallbacks(aRunnableS2S0102000_10);
        }
        int showSeconds = getShowSeconds();
        CommerceSmartUITasks predictTaskIndex = SmartFeedAdUIService.instance().getPredictTaskIndex();
        if (predictTaskIndex != null) {
            i = predictTaskIndex.getButtonShow();
        } else {
            i = -100;
        }
        int i3 = 0;
        if (i >= 0) {
            showSeconds = i * 1000;
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (this.LJLLL == null) {
            this.LJLLL = new ARunnableS2S0102000_10(i2, this, showSeconds, 0);
        }
        long j = showSeconds;
        if (this.LLFF >= j || O5Y.LJJIJL(this.LJLLLL)) {
            int showSeconds2 = getShowSeconds() / 1000;
            if (C63081OpJ.LJJLIIIJJI(this.LJLLLL) && !LJIILIIL()) {
                OJY LJIL = C73340SqO.LJIL();
                Context context = this.LJLLILLLL;
                Aweme aweme = this.LJLLLL;
                LJIL.getClass();
                OJY.LJI(context, aweme);
                Aweme aweme2 = this.LJLLLL;
                if (aweme2 != null) {
                    C58704N2e.LIZLLL("draw_ad", "button_show", aweme2.getAwemeRawAd()).LJII();
                    C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "othershow", this.LJLLLL.getAwemeRawAd());
                    LIZLLL.LIZJ("button", "refer");
                    LIZLLL.LIZIZ(0, "is_lynx");
                    LIZLLL.LIZIZ(2, "button_type");
                    LIZLLL.LJII();
                    if (SmartFeedAdUIService.instance().getSmartAdUIExperimentValue() != null) {
                        LJIIIZ(showSeconds2, 0, 1, i2);
                    }
                }
            }
            if (this.LJLIL != null) {
                setLabelVisibility(0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LJLIL.getLayoutParams();
                marginLayoutParams.bottomMargin = 0;
                this.LJLIL.setLayoutParams(marginLayoutParams);
                DataCenter dataCenter = this.LLFFF;
                if (dataCenter != null) {
                    View view = this.LJLIL;
                    if (view != null) {
                        i3 = view.getHeight();
                    }
                    dataCenter.jv0(Integer.valueOf(i3), "ad_bottom_label_show");
                    return;
                }
                return;
            }
            return;
        }
        postDelayed(this.LJLLL, j - this.LLFF);
    }

    public int getBackGroundColor() {
        int i = this.LLF;
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            return ((ColorDrawable) background).getColor();
        }
        return i;
    }

    public int getColorChangeSeconds() {
        Aweme aweme = this.LJLLLL;
        if (aweme != null && aweme.isAd() && this.LJLLLL.getAwemeRawAd() != null) {
            if (C63081OpJ.LLJILLL(this.LJLLLL)) {
                return Math.max(getShowSeconds(), this.LJLLLL.getAwemeRawAd().getSlideBackInfoModel().getButtonStrategy().getShowColorSeconds() * 1000);
            }
            if (this.LJLLLL.getAwemeRawAd().getAnimationType() == 3) {
                return Math.max(getShowSeconds(), this.LJLLLL.getAwemeRawAd().getShowButtonColorSeconds() * 1000);
            }
        }
        return getShowSeconds();
    }

    public final void LJIILL() {
        int i;
        if (!LJIIL() || (i = this.LJLLI) == 4 || i == 3) {
            return;
        }
        LJI();
        LIZLLL();
        View view = this.LJLJL;
        if (view != null) {
            view.setVisibility(0);
            this.LJLJL.setBackgroundResource(R.drawable.ags);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LJLJL, "translationX", -r3, KL2.LJIIJJI(this.LJLLILLLL));
        this.LJLL = ofFloat;
        ofFloat.setDuration(1500L);
        this.LJLL.setRepeatCount(0);
        this.LJLL.start();
    }

    public final void LJIIZILJ() {
        if (!LJIIL()) {
            return;
        }
        if (!LJIILIIL()) {
            setLabelVisibility(8);
        } else {
            setLabelVisibility(0);
        }
    }

    public int getShowSeconds() {
        int showButtonSeconds;
        if (LJFF()) {
            return 0;
        }
        if (C63081OpJ.LJLIIIL(this.LJLLLL)) {
            showButtonSeconds = this.LJLLLL.getAwemeRawAd().getSlideBackInfoModel().getButtonStrategy().getShowSeconds();
        } else {
            showButtonSeconds = this.LJLLLL.getAwemeRawAd().getShowButtonSeconds();
        }
        return showButtonSeconds * 1000;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!TextUtils.isEmpty(this.LJLLJ)) {
            this.LJLLJ = null;
        }
        LIZLLL();
    }

    public int getDefaultColor() {
        return this.LLF;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public final void LJII(String str) {
        LJI();
        this.LJLLI = 1;
        this.LJLJL.setVisibility(8);
        this.LJLJLJ.setVisibility(8);
        this.LJLJJL.setVisibility(0);
        this.LJLJJL.setText(str);
        this.LJLJJL.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dj, this.LJLLILLLL));
        this.LJLJJI.setVisibility(8);
        LJIILLIIL(true);
    }

    public final void LJIIIIZZ(long j) {
        AwemeRawAd awemeRawAd;
        String buttonIcon;
        Aweme aweme = this.LJLLLL;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (buttonIcon = awemeRawAd.getButtonIcon()) == null || !o.LJJJJ(buttonIcon, ".webp", false)) {
            return;
        }
        this.LJLJJLL.postDelayed(this.LLD, j);
    }

    public final void LJIILLIIL(boolean z) {
        Aweme aweme = this.LJLLLL;
        if (aweme == null) {
            return;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null || awemeRawAd.getButtonIcon() == null) {
            KL2.LJIILLIIL(8, this.LJLJJLL);
            return;
        }
        KL2.LJIILLIIL(0, this.LJLJJLL);
        if (z) {
            this.LJLJJLL.setAlpha(1.0f);
        } else {
            this.LJLJJLL.setAlpha(0.5f);
        }
    }

    public void setDefaultColor(int i) {
        this.LLF = i;
    }

    public void setDownloadUrl(String str) {
        this.LJLLJ = str;
    }

    public void setTopViewLivePlayingViewVisible(int i) {
        C29701Eo c29701Eo = this.LJLZ;
        if (c29701Eo != null) {
            if (i == 0) {
                if (!c29701Eo.isAnimating()) {
                    this.LJLZ.playAnimation();
                }
            } else if (c29701Eo.isAnimating()) {
                this.LJLZ.cancelAnimation();
            }
            this.LJLZ.setVisibility(i);
        }
    }

    public NQ1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void LIZJ(Aweme aweme, DataCenter dataCenter) {
        String LIZ;
        AwemeRawAd awemeRawAd;
        boolean z;
        AwemeRawAd awemeRawAd2;
        String buttonIcon;
        this.LLFFF = dataCenter;
        this.LJLLLL = aweme;
        if (!LJIIL()) {
            setLabelVisibility(8);
            return;
        }
        Aweme aweme2 = this.LJLLLL;
        if (aweme2 != null && aweme2.isAd()) {
            LJI();
            LIZ();
            if (!LJIILIIL()) {
                setLabelVisibility(8);
            } else {
                setLabelVisibility(0);
            }
            if (C63081OpJ.LLIIIL(aweme)) {
                LIZ = C63081OpJ.LJJIZ(aweme);
            } else {
                C61491OBj LJIJJLI = C73340SqO.LJIJJLI();
                Context context = getContext();
                LJIJJLI.getClass();
                LIZ = M2C.LIZ(context, aweme, false);
            }
            if (C63081OpJ.LJJLIIIJLLLLLLLZ(aweme)) {
                LJI();
                LIZLLL();
                this.LJLLI = 0;
                View view = this.LJLJL;
                if (view != null) {
                    view.setVisibility(8);
                }
                View view2 = this.LJLJLJ;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                this.LJLJJL.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dm, this.LJLLILLLL));
                this.LJLJJL.setText(LIZ);
                this.LJLJJI.setVisibility(8);
                this.LJLJLLL.setImageResource(R.drawable.bnu);
                this.LJLJLLL.setVisibility(0);
                LJIILLIIL(false);
            } else {
                if (LJIIJJI()) {
                    LIZ = this.LJLLILLLL.getString(R.string.cdr, LIZ);
                }
                LJII(LIZ);
            }
            Aweme aweme3 = this.LJLLLL;
            if (aweme3 == null || (awemeRawAd = aweme3.getAwemeRawAd()) == null || awemeRawAd.getButtonIcon() == null) {
                return;
            }
            Aweme aweme4 = this.LJLLLL;
            if (aweme4 == null || (awemeRawAd2 = aweme4.getAwemeRawAd()) == null || (buttonIcon = awemeRawAd2.getButtonIcon()) == null) {
                z = false;
            } else {
                z = o.LJJJJ(buttonIcon, ".webp", false);
            }
            if (z) {
                C78765Uvh.LIZJ(this.LJLJJLL, awemeRawAd.getButtonIcon(), -1, -1, false);
                return;
            } else {
                C78765Uvh.LJIIIZ(this.LJLJJLL, awemeRawAd.getButtonIcon(), -1, -1);
                return;
            }
        }
        setLabelVisibility(8);
    }

    public NQ1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.LLD = new ARunnableS11S0101000_7(4, this, 10);
        this.LLFF = 0L;
        this.LLFII = null;
        this.LLFZ = null;
        this.LLI = new PThreadScheduledThreadPoolExecutor(1, new DefaultThreadFactory("BaseAdBottomLabelView"));
        this.LLIFFJFJJ = false;
        this.LJLLILLLL = context;
    }

    public final void LIZIZ(View view, Runnable runnable, boolean z) {
        PThreadScheduledThreadPoolExecutor pThreadScheduledThreadPoolExecutor;
        if (runnable == null || view == null || !C16330kX.LIZIZ(view)) {
            return;
        }
        if (C27740Aue.LJI(view) && !C84763XOl.LJIIJJI && C2YY.LIZ(view.getContext()) != 2) {
            runnable.run();
            this.LLI.remove(this.LLFZ);
            NQ7 nq7 = this.LLFII;
            if (nq7 != null) {
                nq7.dispose();
                return;
            }
            return;
        }
        if (z) {
            this.LLIFFJFJJ = false;
            RunnableC31793Cdp runnableC31793Cdp = this.LLFZ;
            if (runnableC31793Cdp != null) {
                removeCallbacks(runnableC31793Cdp);
                this.LLFZ = null;
            }
            this.LLFZ = new RunnableC31793Cdp(1, this, view, runnable);
        }
        if (this.LLIFFJFJJ) {
            return;
        }
        if (this.LLFII == null) {
            this.LLFII = new NQ7(this);
            C84763XOl.LJI().LIZ(this.LLFII);
        }
        RunnableC31793Cdp runnableC31793Cdp2 = this.LLFZ;
        if (runnableC31793Cdp2 == null || (pThreadScheduledThreadPoolExecutor = this.LLI) == null) {
            return;
        }
        pThreadScheduledThreadPoolExecutor.remove(runnableC31793Cdp2);
        this.LLI.schedule(this.LLFZ, 100L, TimeUnit.MILLISECONDS);
    }

    public final void LJIIIZ(int i, int i2, int i3, int i4) {
        C188727au LIZJ = C0RN.LIZJ(i, "original_time", i2, "real_time");
        LIZJ.LIZLLL(i3, "tag");
        LIZJ.LJIIIZ("group_id", this.LJLLLL.getAid());
        LIZJ.LJIIIZ("request_id", this.LJLLLL.getRequestId());
        LIZJ.LIZLLL(i4, "is_adjusted");
        FMX.LJIIL("ad_ui_adjust", LIZJ.LIZ);
    }
}
