package X;

import Y.ACListenerS30S0100000_10;
import Y.AUListenerS98S0100000_10;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.NZn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59571NZn extends RelativeLayout implements NUM {
    public Animator LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public InterfaceC59573NZp LJLJJI;
    public InterfaceC59574NZq LJLJJL;
    public final java.util.Map<Integer, View> LJLJJLL;

    public final View LJII(int i) {
        java.util.Map<Integer, View> map = this.LJLJJLL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void LJIIIZ() {
        if (!this.LJLILLLLZI) {
            Animator animator = this.LJLIL;
            if ((animator != null && animator.isRunning()) || this.LJLJI) {
                return;
            }
            this.LJLILLLLZI = true;
            this.LJLJI = true;
            LJIIIIZZ(C17N.LJIILL(-52.0d), 0);
        }
    }

    private final int getBottomMargin() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        return ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }

    @Override // X.NUM
    public final void LJ() {
        ((ImageView) LJII(R.id.hxc)).setVisibility(8);
        ((ImageView) LJII(R.id.hxe)).setVisibility(8);
        LJII(R.id.k83).setVisibility(0);
        ((ImageView) LJII(R.id.hxd)).setVisibility(0);
        ((ImageView) LJII(R.id.hxf)).setVisibility(0);
        setVisibility(0);
        LJIIIZ();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Animator animator = this.LJLIL;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final InterfaceC59574NZq getAdWebBottomBarListener() {
        return this.LJLJJL;
    }

    public final InterfaceC59573NZp getNaviBarListener() {
        return this.LJLJJI;
    }

    @Override // X.NUM
    public final void LIZIZ(boolean z) {
        setGoForwardEnable(z);
    }

    @Override // X.NUM
    public final void LJFF(MotionEvent event) {
        o.LJIIIZ(event, "event");
        if (getVisibility() != 8 && event.getAction() == 0) {
            this.LJLJI = false;
        }
    }

    @Override // X.NUM
    public final void LJI(boolean z) {
        setGoBackEnable(z);
    }

    public final void setAdWebBottomBarListener(InterfaceC59574NZq interfaceC59574NZq) {
        this.LJLJJL = interfaceC59574NZq;
    }

    public final void setBottomMargin(int i) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = i;
        setLayoutParams(marginLayoutParams);
    }

    public final void setGoBackEnable(boolean z) {
        float f;
        View LJII = LJII(R.id.hxc);
        float f2 = 1.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.34f;
        }
        LJII.setAlpha(f);
        View LJII2 = LJII(R.id.hxd);
        if (!z) {
            f2 = 0.34f;
        }
        LJII2.setAlpha(f2);
    }

    public final void setGoForwardEnable(boolean z) {
        float f;
        View LJII = LJII(R.id.hxe);
        float f2 = 1.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.34f;
        }
        LJII.setAlpha(f);
        View LJII2 = LJII(R.id.hxf);
        if (!z) {
            f2 = 0.34f;
        }
        LJII2.setAlpha(f2);
    }

    @Override // X.NUM
    public void setListener(InterfaceC59574NZq interfaceC59574NZq) {
        this.LJLJJL = interfaceC59574NZq;
        C16880lQ.LJJJ((TuxIconView) LJII(R.id.hxd), new ACListenerS30S0100000_10(interfaceC59574NZq, 40));
        C16880lQ.LJJJ((TuxIconView) LJII(R.id.hxf), new ACListenerS30S0100000_10(interfaceC59574NZq, 41));
    }

    public final void setNaviBarListener(InterfaceC59573NZp interfaceC59573NZp) {
        this.LJLJJI = interfaceC59573NZp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59571NZn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJJLL = C62850Ola.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.dtb, this, true);
        C16880lQ.LJJJ((TuxIconView) LJII(R.id.hxc), new ACListenerS30S0100000_10(this, 137));
        C16880lQ.LJJJ((TuxIconView) LJII(R.id.hxd), new ACListenerS30S0100000_10(this, 138));
        C16880lQ.LJJJ((TuxIconView) LJII(R.id.hxe), new ACListenerS30S0100000_10(this, 139));
        C16880lQ.LJJJ((TuxIconView) LJII(R.id.hxf), new ACListenerS30S0100000_10(this, UserLevelGeckoUpdateSetting.DEFAULT));
    }

    @Override // X.NUM
    public final void LIZ(int i, int i2) {
        boolean z;
        boolean z2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("visibility ");
        if (getVisibility() == 8) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        X1D.LIZIZ(LIZ);
        if (getVisibility() == 8) {
            return;
        }
        int i3 = i - i2;
        if (i3 > 0) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("delta ");
            LIZ2.append(i3);
            LIZ2.append(' ');
            LIZ2.append(i);
            LIZ2.append(' ');
            LIZ2.append(i2);
            LIZ2.append(" isShowing ");
            LIZ2.append(this.LJLILLLLZI);
            LIZ2.append(" animator?.isRunning ");
            Animator animator = this.LJLIL;
            if (animator != null && animator.isRunning()) {
                z2 = true;
            } else {
                z2 = false;
            }
            LIZ2.append(z2);
            LIZ2.append(" animatedInOneTouch ");
            LIZ2.append(this.LJLJI);
            X1D.LIZIZ(LIZ2);
            if (this.LJLILLLLZI) {
                Animator animator2 = this.LJLIL;
                if ((animator2 != null && animator2.isRunning()) || this.LJLJI) {
                    return;
                }
                this.LJLILLLLZI = false;
                this.LJLJI = true;
                LJIIIIZZ(0, C17N.LJIILL(-52.0d));
                return;
            }
            return;
        }
        LJIIIZ();
    }

    public final void LJIIIIZZ(int i, int i2) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.addUpdateListener(new AUListenerS98S0100000_10(this, 14));
        ofInt.setDuration(300L);
        ofInt.setInterpolator(new SJI());
        ofInt.setTarget(this);
        ofInt.start();
        this.LJLIL = ofInt;
    }

    public final void LJIIJ(C59314NPq c59314NPq, boolean z) {
        if (NWB.LIZIZ(c59314NPq) && !z) {
            ((ImageView) LJII(R.id.hxc)).setVisibility(8);
            ((ImageView) LJII(R.id.hxe)).setVisibility(8);
            LJII(R.id.k83).setVisibility(0);
            ((ImageView) LJII(R.id.hxd)).setVisibility(0);
            ((ImageView) LJII(R.id.hxf)).setVisibility(0);
            return;
        }
        ((ImageView) LJII(R.id.hxc)).setVisibility(0);
        ((ImageView) LJII(R.id.hxe)).setVisibility(0);
        LJII(R.id.k83).setVisibility(8);
        ((ImageView) LJII(R.id.hxd)).setVisibility(8);
        ((ImageView) LJII(R.id.hxf)).setVisibility(8);
    }

    @Override // X.NUM
    public final void LIZJ(boolean z, String str, C59222NMc c59222NMc) {
        String str2;
        String str3;
        String str4;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        Integer num = null;
        if (c59222NMc == null || (awemeRawAd2 = c59222NMc.LIZ) == null || (str2 = awemeRawAd2.getCreativeIdStr()) == null) {
            str2 = "";
        }
        if (c59222NMc != null && (awemeRawAd = c59222NMc.LIZ) != null) {
            str3 = awemeRawAd.getLogExtra();
        } else {
            str3 = null;
        }
        C58655N0h LJ = C58704N2e.LJ("landing_ad", "forward", str2, str3, null);
        if (c59222NMc != null) {
            str4 = c59222NMc.LJIILL;
        } else {
            str4 = null;
        }
        LJ.LIZIZ(str4, "url");
        if (c59222NMc != null) {
            num = Integer.valueOf(c59222NMc.LJIILLIIL);
        }
        LJ.LIZIZ(num, "first_page");
        LJ.LIZIZ(Integer.valueOf(z ? 1 : 0), "is_enabled");
        LJ.LIZIZ(str, "forward_url");
        LJ.LJI();
    }

    @Override // X.NUM
    public final void LIZLLL(boolean z, String str, C59222NMc c59222NMc) {
        String str2;
        String str3;
        String str4;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        Integer num = null;
        if (c59222NMc == null || (awemeRawAd2 = c59222NMc.LIZ) == null || (str2 = awemeRawAd2.getCreativeIdStr()) == null) {
            str2 = "";
        }
        if (c59222NMc != null && (awemeRawAd = c59222NMc.LIZ) != null) {
            str3 = awemeRawAd.getLogExtra();
        } else {
            str3 = null;
        }
        C58655N0h LJ = C58704N2e.LJ("landing_ad", "back", str2, str3, null);
        if (c59222NMc != null) {
            str4 = c59222NMc.LJIILL;
        } else {
            str4 = null;
        }
        LJ.LIZIZ(str4, "url");
        if (c59222NMc != null) {
            num = Integer.valueOf(c59222NMc.LJIILLIIL);
        }
        LJ.LIZIZ(num, "first_page");
        LJ.LIZIZ(Integer.valueOf(z ? 1 : 0), "is_enabled");
        LJ.LIZIZ(str, "back_url");
        LJ.LJI();
    }
}
