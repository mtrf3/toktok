package X;

import Y.ACListenerS29S0100000_9;
import Y.ACListenerS45S0200000_10;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AdGestureGuidance;
import com.ss.android.ugc.aweme.feed.model.AdInteractionData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.List;
import kotlin.jvm.internal.o;
import o53.IDdS476S0100000_10;

/* loaded from: classes11.dex */
public final class OA5 extends FrameLayout implements InterfaceC49610JdW, InterfaceC59717Nc9 {
    public W5G LJLIL;
    public KMH LJLILLLLZI;
    public C49609JdV LJLJI;
    public Aweme LJLJJI;
    public AdInteractionData LJLJJL;
    public String LJLJJLL;
    public AnimatedDrawable2 LJLJL;
    public OA9 LJLJLJ;
    public NL9 LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public int LJLLJ;
    public XU2 LJLLL;

    @Override // X.InterfaceC59717Nc9
    public final void LIZ() {
        this.LJLL = false;
        reset();
    }

    @Override // X.InterfaceC59717Nc9
    public final void LIZJ() {
        this.LJLL = true;
        reset();
    }

    public final void LJII() {
        AnimatedDrawable2 animatedDrawable2;
        this.LJLLI = false;
        setVisibility(8);
        AnimatedDrawable2 animatedDrawable22 = this.LJLJL;
        if (animatedDrawable22 != null && animatedDrawable22.isRunning() && (animatedDrawable2 = this.LJLJL) != null) {
            animatedDrawable2.stop();
        }
        this.LJLJL = null;
        XU2 xu2 = this.LJLLL;
        if (xu2 != null) {
            xu2.release();
        }
        this.LJLLL = null;
    }

    private final W4V<InterfaceC81599W0t> getControllerListener() {
        return new IDdS476S0100000_10(this, 1);
    }

    public final void LJIIIZ() {
        AwemeRawAd awemeRawAd;
        Aweme aweme = this.LJLJJI;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        C025908h.LIZLLL("draw_ad", "otherclick", awemeRawAd, "interactive_gesture", "refer");
    }

    @Override // X.InterfaceC59717Nc9
    public final void LJJJJJL() {
        OA9 oa9;
        if ((this.LJLLI || this.LJLLILLLL) && (oa9 = this.LJLJLJ) != null) {
            oa9.LJJJJL();
        }
    }

    @Override // X.InterfaceC59717Nc9
    public final void onPause() {
        AnimatedDrawable2 animatedDrawable2;
        if (!this.LJLLI) {
            return;
        }
        AnimatedDrawable2 animatedDrawable22 = this.LJLJL;
        if (animatedDrawable22 != null && animatedDrawable22.isRunning() && (animatedDrawable2 = this.LJLJL) != null) {
            animatedDrawable2.stop();
        }
        XU2 xu2 = this.LJLLL;
        if (xu2 != null) {
            xu2.pause();
        }
    }

    @Override // X.InterfaceC59717Nc9
    public final void show() {
        AdGestureGuidance gestureGuidance;
        String str;
        int width;
        int height;
        int i;
        int i2;
        int i3;
        int i4;
        AdInteractionData adInteractionData = this.LJLJJL;
        if (adInteractionData == null || (gestureGuidance = adInteractionData.getGestureGuidance()) == null || (str = this.LJLJJLL) == null) {
            return;
        }
        Object parent = getParent();
        o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        View view = (View) parent;
        NL9 nl9 = this.LJLJLLL;
        if (nl9 != null) {
            width = nl9.LJLIL;
        } else {
            width = view.getWidth();
        }
        NL9 nl92 = this.LJLJLLL;
        if (nl92 != null) {
            height = nl92.LJLILLLLZI;
        } else {
            height = view.getHeight();
        }
        if (width < view.getWidth()) {
            i = (view.getWidth() - width) / 2;
        } else {
            i = 0;
        }
        if (height < view.getHeight()) {
            i2 = (view.getHeight() - height) / 2;
        } else {
            i2 = 0;
        }
        float f = width;
        float f2 = height;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (gestureGuidance.getWidth() * f), (int) (gestureGuidance.getHeight() * f2));
        W5G w5g = this.LJLIL;
        if (w5g != null) {
            w5g.setLayoutParams(layoutParams);
            if (width > view.getWidth()) {
                i3 = (width - view.getWidth()) / 2;
            } else {
                i3 = 0;
            }
            if (height > view.getHeight()) {
                i4 = (height - view.getHeight()) / 2;
            } else {
                i4 = 0;
            }
            float positionX = ((gestureGuidance.getPositionX() * f) - i3) + i;
            float positionY = ((gestureGuidance.getPositionY() * f2) - i4) + i2;
            W5G w5g2 = this.LJLIL;
            if (w5g2 != null) {
                if (C90193gN.LIZIZ(getContext())) {
                    positionX = -positionX;
                }
                w5g2.setTranslationX(positionX);
                W5G w5g3 = this.LJLIL;
                if (w5g3 != null) {
                    w5g3.setTranslationY(positionY);
                    C81705W4v LIZJ = W5I.LIZJ();
                    LIZJ.LJII(str);
                    LIZJ.LJII = getControllerListener();
                    LIZJ.LJIIJ = true;
                    W4R LIZ = LIZJ.LIZ();
                    W5G w5g4 = this.LJLIL;
                    if (w5g4 != null) {
                        w5g4.setController(LIZ);
                        setVisibility(0);
                        return;
                    } else {
                        o.LJIJI("interactiveGuideView");
                        throw null;
                    }
                }
                o.LJIJI("interactiveGuideView");
                throw null;
            }
            o.LJIJI("interactiveGuideView");
            throw null;
        }
        o.LJIJI("interactiveGuideView");
        throw null;
    }

    @Override // X.InterfaceC49610JdW
    public final void LIZIZ() {
        LJII();
        OA9 oa9 = this.LJLJLJ;
        if (oa9 != null) {
            oa9.LJL();
        }
    }

    @Override // X.InterfaceC49610JdW
    public final void LJ() {
        UrlModel urlModel;
        ViewStub viewStub;
        if (getVisibility() == 0) {
            Object LLILL = C16880lQ.LLILL(getContext(), "vibrator");
            o.LJII(LLILL, "null cannot be cast to non-null type android.os.Vibrator");
            ((Vibrator) LLILL).vibrate(200L);
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            Activity LJIJJ = C45804HyK.LJIJJ(context);
            if (LJIJJ != null) {
                KeyEvent.Callback findViewById = LJIJJ.findViewById(R.id.d6m);
                if (findViewById == null && (viewStub = (ViewStub) LJIJJ.findViewById(R.id.e6j)) != null) {
                    viewStub.setLayoutResource(R.layout.bjh);
                    KeyEvent.Callback inflate = viewStub.inflate();
                    o.LJII(inflate, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ad.feed.interactive.FeedAdInteractiveAwardMask");
                    findViewById = (C53857LBt) inflate;
                }
                C53857LBt c53857LBt = (C53857LBt) findViewById;
                if (c53857LBt != null) {
                    c53857LBt.setCallback(new OA6(this));
                    AdInteractionData adInteractionData = this.LJLJJL;
                    AwemeRawAd awemeRawAd = null;
                    if (adInteractionData != null) {
                        urlModel = adInteractionData.getPopupImage();
                    } else {
                        urlModel = null;
                    }
                    Aweme aweme = this.LJLJJI;
                    if (urlModel != null) {
                        W5F LIZLLL = C40084FoG.LIZLLL(urlModel, "FeedAdInteractiveAwardMask");
                        LIZLLL.LJIJI = Bitmap.Config.ARGB_8888;
                        SmartImageView smartImageView = (SmartImageView) c53857LBt.LIZ(R.id.ad4);
                        o.LJII(smartImageView, "null cannot be cast to non-null type com.bytedance.lighten.core.ISmartImageView");
                        LIZLLL.LJJIIJ = smartImageView;
                        LIZLLL.LIZLLL = true;
                        C16880lQ.LLJJJ(LIZLLL);
                    }
                    C16880lQ.LJIILLIIL((ImageView) c53857LBt.LIZ(R.id.bfa), new ACListenerS29S0100000_9(c53857LBt, 89));
                    C16880lQ.LJJIJLIJ((SmartImageView) c53857LBt.LIZ(R.id.ad4), new ACListenerS45S0200000_10(c53857LBt, aweme, 11));
                    c53857LBt.setVisibility(0);
                    c53857LBt.LIZ(R.id.ad5).setAlpha(0.0f);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c53857LBt.LIZ(R.id.ad5), "alpha", 0.0f, 1.0f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c53857LBt.LIZ(R.id.ad5), "scaleX", 0.0f, 1.0f);
                    o.LJIIIIZZ(ofFloat2, "ofFloat(awardLayout, \"scaleX\", 0f, 1f)");
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(c53857LBt.LIZ(R.id.ad5), "scaleY", 0.0f, 1.0f);
                    o.LJIIIIZZ(ofFloat3, "ofFloat(awardLayout, \"scaleY\", 0f, 1f)");
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(400L);
                    animatorSet.setInterpolator(new SJI());
                    animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3);
                    animatorSet.start();
                    this.LJLLILLLL = true;
                    Aweme aweme2 = this.LJLJJI;
                    if (aweme2 != null) {
                        awemeRawAd = aweme2.getAwemeRawAd();
                    }
                    C025908h.LIZLLL("draw_ad", "othershow", awemeRawAd, "popup_window", "refer");
                }
            }
        }
        LJII();
        LJIIIZ();
    }

    public final void LJIIIIZZ() {
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ == null) {
            return;
        }
        View findViewById = LJIJJ.findViewById(R.id.d6m);
        if (findViewById != null && findViewById.getVisibility() != 8) {
            findViewById.setVisibility(8);
        }
        this.LJLLILLLL = false;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.s6);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.ad_interactive_guide_view)");
        this.LJLIL = (W5G) findViewById;
        View findViewById2 = findViewById(R.id.s5);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.ad_interactive_draw_view)");
        this.LJLILLLLZI = (KMH) findViewById2;
        View findViewById3 = findViewById(R.id.s4);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.ad_interactive_click_view)");
        this.LJLJI = (C49609JdV) findViewById3;
        W5G w5g = this.LJLIL;
        if (w5g != null) {
            C79077V1t c79077V1t = new C79077V1t(getContext().getResources());
            c79077V1t.LJIIJ = InterfaceC78716Uuu.LJJL;
            w5g.setHierarchy(c79077V1t.LIZ());
            KMH kmh = this.LJLILLLLZI;
            if (kmh != null) {
                kmh.setInteractiveListener(this);
                C49609JdV c49609JdV = this.LJLJI;
                if (c49609JdV != null) {
                    c49609JdV.setInteractiveListener(this);
                    return;
                } else {
                    o.LJIJI("interactiveClickView");
                    throw null;
                }
            }
            o.LJIJI("interactiveDrawView");
            throw null;
        }
        o.LJIJI("interactiveGuideView");
        throw null;
    }

    @Override // X.InterfaceC59717Nc9
    public final void reset() {
        LJII();
        LJIIIIZZ();
        this.LJLLJ = 0;
    }

    @Override // X.InterfaceC49610JdW
    public final void LJI() {
        LJIIIZ();
    }

    public final NL9 getTextureSize() {
        return this.LJLJLLL;
    }

    @Override // X.InterfaceC59717Nc9
    public final boolean isShowing() {
        return this.LJLLILLLL;
    }

    public final void LJIIJ(AnimatedDrawable2 animatedDrawable2) {
        UrlModel music;
        List<String> urlList;
        AdInteractionData adInteractionData = this.LJLJJL;
        if (adInteractionData == null) {
            return;
        }
        OA8 oa8 = new OA8(animatedDrawable2.LJLJI);
        animatedDrawable2.LJFF(oa8);
        animatedDrawable2.LJI(new OA7(this, oa8));
        animatedDrawable2.start();
        if (adInteractionData.getInteractionType() == 0) {
            C49609JdV c49609JdV = this.LJLJI;
            if (c49609JdV != null) {
                c49609JdV.setVisibility(0);
                KMH kmh = this.LJLILLLLZI;
                if (kmh != null) {
                    kmh.setVisibility(8);
                } else {
                    o.LJIJI("interactiveDrawView");
                    throw null;
                }
            } else {
                o.LJIJI("interactiveClickView");
                throw null;
            }
        } else {
            C49609JdV c49609JdV2 = this.LJLJI;
            if (c49609JdV2 != null) {
                c49609JdV2.setVisibility(8);
                KMH kmh2 = this.LJLILLLLZI;
                if (kmh2 != null) {
                    kmh2.setVisibility(0);
                } else {
                    o.LJIJI("interactiveDrawView");
                    throw null;
                }
            } else {
                o.LJIJI("interactiveClickView");
                throw null;
            }
        }
        OA9 oa9 = this.LJLJLJ;
        if (oa9 != null) {
            oa9.LJJJJL();
        }
        AdInteractionData adInteractionData2 = this.LJLJJL;
        if (adInteractionData2 == null || (music = adInteractionData2.getMusic()) == null || (urlList = music.getUrlList()) == null || urlList.isEmpty()) {
            return;
        }
        if (this.LJLLL == null) {
            this.LJLLL = new XU2("FeedAdInteractiveLayout");
        }
        XU2 xu2 = this.LJLLL;
        if (xu2 == null) {
            return;
        }
        C47325Ihl c47325Ihl = new C47325Ihl();
        c47325Ihl.LIZJ = 4;
        c47325Ihl.LIZIZ = urlList;
        c47325Ihl.LJI = true;
        xu2.LIZLLL(c47325Ihl);
    }

    @Override // X.InterfaceC59717Nc9
    public void setOperator(OA9 operator) {
        o.LJIIIZ(operator, "operator");
        this.LJLJLJ = operator;
    }

    public final void setTextureSize(NL9 nl9) {
        this.LJLJLLL = nl9;
    }

    @Override // X.InterfaceC59717Nc9
    public void setVideoSize(NL9 nl9) {
        this.LJLJLLL = nl9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OA5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
    }

    @Override // X.InterfaceC59717Nc9
    public final void LIZLLL(String str, boolean z) {
        if (!o.LJ(str, "HOME") || !this.LJLLI || !z) {
            return;
        }
        AnimatedDrawable2 animatedDrawable2 = this.LJLJL;
        if (animatedDrawable2 != null && !animatedDrawable2.isRunning()) {
            AnimatedDrawable2 animatedDrawable22 = this.LJLJL;
            if (animatedDrawable22 != null) {
                animatedDrawable22.start();
            }
            AnimatedDrawable2 animatedDrawable23 = this.LJLJL;
            if (animatedDrawable23 != null) {
                animatedDrawable23.LJ(this.LJLLJ);
            }
        }
        XU2 xu2 = this.LJLLL;
        if (xu2 == null) {
            return;
        }
        xu2.resume();
    }

    @Override // X.InterfaceC59717Nc9
    public final void LJFF(Aweme aweme, String str) {
        AdInteractionData adInteractionData;
        AwemeRawAd awemeRawAd;
        this.LJLJJI = aweme;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            adInteractionData = awemeRawAd.getAdInteractionData();
        } else {
            adInteractionData = null;
        }
        this.LJLJJL = adInteractionData;
        this.LJLJJLL = str;
    }
}
