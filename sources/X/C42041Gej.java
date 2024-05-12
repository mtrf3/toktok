package X;

import Y.ARunnableS18S0300000_7;
import Y.ARunnableS26S0200000_7;
import Y.AgS110S0200000_7;
import Y.IDAListenerS233S0100000_7;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS96S0300000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Gej, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42041Gej extends FrameLayout implements InterfaceC41630GVm {
    public final HashSet<String> LJLIL;
    public C74040T4a LJLILLLLZI;
    public TextView LJLJI;
    public ImageView LJLJJI;
    public ImageView LJLJJL;
    public ImageView LJLJJLL;
    public TextView LJLJL;
    public TuxTextView LJLJLJ;
    public String LJLJLLL;
    public TextView LJLL;
    public BaseShortVideoContext LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public final HashMap<String, Boolean> LJLLL;
    public final C42051Get LJLLLL;
    public final IAVPublishService LJLLLLLL;
    public final C41625GVh LJLZ;
    public boolean LJZ;

    public final void LIZIZ() {
        float f;
        C74040T4a c74040T4a = this.LJLILLLLZI;
        if (c74040T4a != null) {
            float f2 = 0.8f;
            if (this.LJLLJ) {
                f = 0.8f;
            } else {
                f = 1.0f;
            }
            c74040T4a.setScaleX(f);
            C74040T4a c74040T4a2 = this.LJLILLLLZI;
            if (c74040T4a2 != null) {
                if (!this.LJLLJ) {
                    f2 = 1.0f;
                }
                c74040T4a2.setScaleY(f2);
                return;
            }
            o.LJIJI("progressView");
            throw null;
        }
        o.LJIJI("progressView");
        throw null;
    }

    public final void LIZJ() {
        setVisibility(8);
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity != null) {
            LRD.LIZ(topActivity).LJIIIZ(false);
        }
    }

    public final void LIZLLL() {
        ImageView imageView = this.LJLJJI;
        if (imageView != null) {
            imageView.setAlpha(1.0f);
            ImageView imageView2 = this.LJLJJI;
            if (imageView2 != null) {
                imageView2.setTranslationX(0.0f);
                ImageView imageView3 = this.LJLJJI;
                if (imageView3 != null) {
                    imageView3.setTranslationY(0.0f);
                    ImageView imageView4 = this.LJLJJL;
                    if (imageView4 != null) {
                        imageView4.setAlpha(1.0f);
                        ImageView imageView5 = this.LJLJJL;
                        if (imageView5 != null) {
                            imageView5.setTranslationX(0.0f);
                            ImageView imageView6 = this.LJLJJL;
                            if (imageView6 != null) {
                                imageView6.setTranslationY(0.0f);
                                ImageView imageView7 = this.LJLJJLL;
                                if (imageView7 != null) {
                                    imageView7.setAlpha(1.0f);
                                    ImageView imageView8 = this.LJLJJLL;
                                    if (imageView8 != null) {
                                        imageView8.setTranslationX(0.0f);
                                        ImageView imageView9 = this.LJLJJLL;
                                        if (imageView9 != null) {
                                            imageView9.setTranslationY(0.0f);
                                            return;
                                        } else {
                                            o.LJIJI("bgCoverThird");
                                            throw null;
                                        }
                                    }
                                    o.LJIJI("bgCoverThird");
                                    throw null;
                                }
                                o.LJIJI("bgCoverThird");
                                throw null;
                            }
                            o.LJIJI("bgCoverSecond");
                            throw null;
                        }
                        o.LJIJI("bgCoverSecond");
                        throw null;
                    }
                    o.LJIJI("bgCoverSecond");
                    throw null;
                }
                o.LJIJI("bgCoverFirst");
                throw null;
            }
            o.LJIJI("bgCoverFirst");
            throw null;
        }
        o.LJIJI("bgCoverFirst");
        throw null;
    }

    public final void LJ() {
        if (this.LJLLLLLL.needShowAnim()) {
            ImageView imageView = this.LJLJJI;
            if (imageView != null) {
                int id = imageView.getId();
                if (this.LJLLLLLL.isMultiTaskRecover()) {
                    ImageView imageView2 = this.LJLJJL;
                    if (imageView2 != null) {
                        id = imageView2.getId();
                        TextView textView = this.LJLL;
                        if (textView != null) {
                            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                            o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.width = C7MY.LIZIZ(116);
                            marginLayoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)));
                            TextView textView2 = this.LJLL;
                            if (textView2 != null) {
                                textView2.setLayoutParams(marginLayoutParams);
                            } else {
                                o.LJIJI("autoUploadingText");
                                throw null;
                            }
                        } else {
                            o.LJIJI("autoUploadingText");
                            throw null;
                        }
                    } else {
                        o.LJIJI("bgCoverSecond");
                        throw null;
                    }
                }
                TextView textView3 = this.LJLL;
                if (textView3 != null) {
                    if (textView3.getLineCount() <= 3) {
                        View findViewById = findViewById(R.id.j71);
                        o.LJIIIIZZ(findViewById, "findViewById(R.id.root)");
                        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById;
                        AnonymousClass064 LIZ = C57396Mfo.LIZ(constraintLayout);
                        TextView textView4 = this.LJLL;
                        if (textView4 != null) {
                            LIZ.LJIIIIZZ(textView4.getId(), 4, id, 4);
                            LIZ.LIZIZ(constraintLayout);
                        } else {
                            o.LJIJI("autoUploadingText");
                            throw null;
                        }
                    }
                    TextView textView5 = this.LJLL;
                    if (textView5 != null) {
                        textView5.setVisibility(0);
                        TextView textView6 = this.LJLL;
                        if (textView6 != null) {
                            textView6.setAlpha(1.0f);
                            JVD.LIZ(this, C41633GVp.LJLIL);
                        } else {
                            o.LJIJI("autoUploadingText");
                            throw null;
                        }
                    } else {
                        o.LJIJI("autoUploadingText");
                        throw null;
                    }
                } else {
                    o.LJIJI("autoUploadingText");
                    throw null;
                }
            } else {
                o.LJIJI("bgCoverFirst");
                throw null;
            }
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 0, getTranslateDistance(), 1, 0.0f, 1, 0.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(300L);
        animationSet.setFillAfter(true);
        animationSet.setAnimationListener(new IDAListenerS233S0100000_7(this, 3));
        TextView textView7 = this.LJLL;
        if (textView7 != null) {
            if (textView7.getVisibility() == 0) {
                C10K.LJII(3000L).LJ(new AgS110S0200000_7(this, animationSet, 13), C10K.LJIIIIZZ, null);
                this.LJLLLLLL.setNeedShowAnim(false);
                this.LJLLLLLL.setMultiTaskRecover(false);
                return;
            }
            return;
        }
        o.LJIJI("autoUploadingText");
        throw null;
    }

    @Override // X.InterfaceC41630GVm
    public final void X3() {
        this.LJLLLL.LIZ();
        LIZLLL();
        ImageView imageView = this.LJLJJL;
        if (imageView != null) {
            imageView.setAlpha(0.0f);
            ImageView imageView2 = this.LJLJJL;
            if (imageView2 != null) {
                imageView2.setTranslationX(C17N.LJIILL(15.0d));
                ImageView imageView3 = this.LJLJJL;
                if (imageView3 != null) {
                    imageView3.setTranslationY(C17N.LJIILL(15.0d));
                    C43356Gzw c43356Gzw = new C43356Gzw();
                    ImageView imageView4 = this.LJLJJL;
                    if (imageView4 != null) {
                        ViewPropertyAnimator withEndAction = imageView4.animate().alpha(1.0f).translationX(0.0f).translationY(0.0f).setDuration(300L).withEndAction(new ARunnableS26S0200000_7(c43356Gzw, this, 25));
                        o.LJIIIIZZ(withEndAction, "override fun startSwitch…cancellationSignal)\n    }");
                        c43356Gzw.LIZIZ(new C42046Geo(this, c43356Gzw, withEndAction));
                        this.LJLLLL.LIZJ(c43356Gzw);
                        return;
                    }
                    o.LJIJI("bgCoverSecond");
                    throw null;
                }
                o.LJIJI("bgCoverSecond");
                throw null;
            }
            o.LJIJI("bgCoverSecond");
            throw null;
        }
        o.LJIJI("bgCoverSecond");
        throw null;
    }

    public final int getEnterAnim() {
        if (this.LJLLLLLL.needShowAnim()) {
            return R.anim.eu;
        }
        return R.anim.fx;
    }

    private final float getTranslateDistance() {
        if (C90193gN.LIZ()) {
            return O6R.LJJIIZ(C32151Nz.LJIIZILJ(12));
        }
        return -O6R.LJJIIZ(C32151Nz.LJIIZILJ(12));
    }

    public final boolean getEnableClickCover() {
        return this.LJZ;
    }

    public final IAVPublishService getPublishService() {
        return this.LJLLLLLL;
    }

    @Override // X.InterfaceC41630GVm
    public C41625GVh getState() {
        return this.LJLZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42041Gej(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        this.LJLIL = new HashSet<>();
        this.LJLLL = new HashMap<>();
        this.LJLLLL = new C42051Get();
        this.LJLLLLLL = AVExternalServiceImpl.LIZ().publishService();
        C41625GVh c41625GVh = new C41625GVh();
        c41625GVh.LIZLLL.setValue(-1);
        c41625GVh.LIZ.setValue(0);
        this.LJLZ = c41625GVh;
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.ax6, this, true);
        View findViewById = findViewById(R.id.aj6);
        if (findViewById != null) {
            this.LJLJJI = (ImageView) findViewById;
            View findViewById2 = findViewById(R.id.aj8);
            if (findViewById2 != null) {
                this.LJLJJL = (ImageView) findViewById2;
                View findViewById3 = findViewById(R.id.aj9);
                if (findViewById3 != null) {
                    this.LJLJJLL = (ImageView) findViewById3;
                    View findViewById4 = findViewById(R.id.f6h);
                    if (findViewById4 != null) {
                        C74040T4a c74040T4a = (C74040T4a) findViewById4;
                        this.LJLILLLLZI = c74040T4a;
                        c74040T4a.setIndeterminate(false);
                        View findViewById5 = findViewById(R.id.lxc);
                        if (findViewById5 != null) {
                            this.LJLJI = (TextView) findViewById5;
                            View findViewById6 = findViewById(R.id.n3y);
                            if (findViewById6 != null) {
                                this.LJLJL = (TextView) findViewById6;
                                View findViewById7 = findViewById(R.id.aa_);
                                if (findViewById7 != null) {
                                    this.LJLL = (TextView) findViewById7;
                                    View findViewById8 = findViewById(R.id.m7x);
                                    o.LJIIIIZZ(findViewById8, "findViewById(R.id.tv_group_counter)");
                                    this.LJLJLJ = (TuxTextView) findViewById8;
                                    View findViewById9 = findViewById(R.id.aj7);
                                    o.LJIIIIZZ(findViewById9, "findViewById(R.id.bg_cover_mask)");
                                    LIZ(findViewById9);
                                    ImageView imageView = this.LJLJJI;
                                    if (imageView != null) {
                                        LIZ(imageView);
                                        ImageView imageView2 = this.LJLJJL;
                                        if (imageView2 != null) {
                                            LIZ(imageView2);
                                            ImageView imageView3 = this.LJLJJLL;
                                            if (imageView3 != null) {
                                                LIZ(imageView3);
                                                this.LJZ = true;
                                                return;
                                            } else {
                                                o.LJIJI("bgCoverThird");
                                                throw null;
                                            }
                                        }
                                        o.LJIJI("bgCoverSecond");
                                        throw null;
                                    }
                                    o.LJIJI("bgCoverFirst");
                                    throw null;
                                }
                                "ID does not reference a View inside this View".toString();
                                throw new IllegalArgumentException("ID does not reference a View inside this View");
                            }
                            "ID does not reference a View inside this View".toString();
                            throw new IllegalArgumentException("ID does not reference a View inside this View");
                        }
                        "ID does not reference a View inside this View".toString();
                        throw new IllegalArgumentException("ID does not reference a View inside this View");
                    }
                    "ID does not reference a View inside this View".toString();
                    throw new IllegalArgumentException("ID does not reference a View inside this View");
                }
                "ID does not reference a View inside this View".toString();
                throw new IllegalArgumentException("ID does not reference a View inside this View");
            }
            "ID does not reference a View inside this View".toString();
            throw new IllegalArgumentException("ID does not reference a View inside this View");
        }
        "ID does not reference a View inside this View".toString();
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    public static final void LIZ(View view) {
        view.setClipToOutline(true);
        view.setOutlineProvider(new C42044Gem());
    }

    @Override // X.InterfaceC41630GVm
    public final void Bh(AqS154S0200000_7 aqS154S0200000_7) {
        this.LJLLLL.LIZ();
        LIZLLL();
        ImageView imageView = this.LJLJJI;
        if (imageView != null) {
            float x = imageView.getX();
            ImageView imageView2 = this.LJLJJL;
            if (imageView2 != null) {
                float x2 = x - imageView2.getX();
                ImageView imageView3 = this.LJLJJI;
                if (imageView3 != null) {
                    float y = imageView3.getY();
                    ImageView imageView4 = this.LJLJJL;
                    if (imageView4 != null) {
                        float y2 = y - imageView4.getY();
                        C43356Gzw c43356Gzw = new C43356Gzw();
                        ImageView imageView5 = this.LJLJJI;
                        if (imageView5 != null) {
                            ViewPropertyAnimator alpha = imageView5.animate().alpha(0.0f);
                            if (this.LJLJJI != null) {
                                ViewPropertyAnimator duration = alpha.translationY(((-r0.getHeight()) * 2) / 3.0f).setDuration(300L);
                                o.LJIIIIZZ(duration, "bgCoverFirst.animate()\n …ation(ANIMATION_DURATION)");
                                ImageView imageView6 = this.LJLJJL;
                                if (imageView6 != null) {
                                    ViewPropertyAnimator withEndAction = imageView6.animate().translationX(x2).translationY(y2).setDuration(300L).withEndAction(new ARunnableS18S0300000_7(this, c43356Gzw, aqS154S0200000_7, 13));
                                    o.LJIIIIZZ(withEndAction, "override fun startSwitch…cancellationSignal)\n    }");
                                    c43356Gzw.LIZIZ(new C42049Ger(this, c43356Gzw, duration, withEndAction));
                                    this.LJLLLL.LIZJ(c43356Gzw);
                                    return;
                                }
                                o.LJIJI("bgCoverSecond");
                                throw null;
                            }
                            o.LJIJI("bgCoverFirst");
                            throw null;
                        }
                        o.LJIJI("bgCoverFirst");
                        throw null;
                    }
                    o.LJIJI("bgCoverSecond");
                    throw null;
                }
                o.LJIJI("bgCoverFirst");
                throw null;
            }
            o.LJIJI("bgCoverSecond");
            throw null;
        }
        o.LJIJI("bgCoverFirst");
        throw null;
    }

    @Override // X.InterfaceC41630GVm
    public final void Ia(AqS96S0300000_7 aqS96S0300000_7) {
        this.LJLLLL.LIZ();
        LIZLLL();
        ImageView imageView = this.LJLJJI;
        if (imageView != null) {
            float x = imageView.getX();
            ImageView imageView2 = this.LJLJJL;
            if (imageView2 != null) {
                float x2 = x - imageView2.getX();
                ImageView imageView3 = this.LJLJJI;
                if (imageView3 != null) {
                    float y = imageView3.getY();
                    ImageView imageView4 = this.LJLJJL;
                    if (imageView4 != null) {
                        float y2 = y - imageView4.getY();
                        C43356Gzw c43356Gzw = new C43356Gzw();
                        ImageView imageView5 = this.LJLJJI;
                        if (imageView5 != null) {
                            ViewPropertyAnimator alpha = imageView5.animate().alpha(0.0f);
                            if (this.LJLJJI != null) {
                                ViewPropertyAnimator duration = alpha.translationY(((-r0.getHeight()) * 2) / 3.0f).setDuration(300L);
                                o.LJIIIIZZ(duration, "bgCoverFirst.animate()\n …ation(ANIMATION_DURATION)");
                                ImageView imageView6 = this.LJLJJLL;
                                if (imageView6 != null) {
                                    imageView6.setAlpha(0.0f);
                                    ImageView imageView7 = this.LJLJJLL;
                                    if (imageView7 != null) {
                                        imageView7.setTranslationX(C17N.LJIILL(15.0d));
                                        ImageView imageView8 = this.LJLJJLL;
                                        if (imageView8 != null) {
                                            imageView8.setTranslationY(C17N.LJIILL(15.0d));
                                            ImageView imageView9 = this.LJLJJLL;
                                            if (imageView9 != null) {
                                                ViewPropertyAnimator duration2 = imageView9.animate().alpha(1.0f).translationX(0.0f).translationY(0.0f).setDuration(300L);
                                                o.LJIIIIZZ(duration2, "bgCoverThird.animate().a…ation(ANIMATION_DURATION)");
                                                ImageView imageView10 = this.LJLJJL;
                                                if (imageView10 != null) {
                                                    ViewPropertyAnimator withEndAction = imageView10.animate().translationX(x2).translationY(y2).setDuration(300L).withEndAction(new ARunnableS18S0300000_7(this, c43356Gzw, aqS96S0300000_7, 10));
                                                    o.LJIIIIZZ(withEndAction, "override fun startSwitch…cancellationSignal)\n    }");
                                                    c43356Gzw.LIZIZ(new C42050Ges(this, c43356Gzw, duration, duration2, withEndAction));
                                                    this.LJLLLL.LIZJ(c43356Gzw);
                                                    return;
                                                }
                                                o.LJIJI("bgCoverSecond");
                                                throw null;
                                            }
                                            o.LJIJI("bgCoverThird");
                                            throw null;
                                        }
                                        o.LJIJI("bgCoverThird");
                                        throw null;
                                    }
                                    o.LJIJI("bgCoverThird");
                                    throw null;
                                }
                                o.LJIJI("bgCoverThird");
                                throw null;
                            }
                            o.LJIJI("bgCoverFirst");
                            throw null;
                        }
                        o.LJIJI("bgCoverFirst");
                        throw null;
                    }
                    o.LJIJI("bgCoverSecond");
                    throw null;
                }
                o.LJIJI("bgCoverFirst");
                throw null;
            }
            o.LJIJI("bgCoverSecond");
            throw null;
        }
        o.LJIJI("bgCoverFirst");
        throw null;
    }

    @Override // X.InterfaceC41630GVm
    public final boolean Ib(String publishId) {
        o.LJIIIZ(publishId, "publishId");
        if (this.LJLIL.contains(publishId)) {
            return false;
        }
        this.LJLIL.add(publishId);
        return true;
    }

    public final void LJFF(int i) {
        StringBuilder LIZ;
        if (this.LJLLJ) {
            this.LJLLJ = false;
            LIZIZ();
        }
        C74040T4a c74040T4a = this.LJLILLLLZI;
        if (c74040T4a != null) {
            c74040T4a.setProgress(i);
            TextView textView = this.LJLJI;
            if (textView != null) {
                if (C90193gN.LIZ()) {
                    LIZ = X1D.LIZ();
                    LIZ.append('%');
                    LIZ.append(i);
                } else {
                    LIZ = X1D.LIZ();
                    LIZ.append(i);
                    LIZ.append('%');
                }
                textView.setText(X1D.LIZIZ(LIZ));
                TuxTextView tuxTextView = this.LJLJLJ;
                if (tuxTextView != null) {
                    tuxTextView.setText("");
                    return;
                } else {
                    o.LJIJI("tvGroupCounter");
                    throw null;
                }
            }
            o.LJIJI("progressText");
            throw null;
        }
        o.LJIJI("progressView");
        throw null;
    }

    public final void setEnableClickCover(boolean z) {
        this.LJZ = z;
    }
}
