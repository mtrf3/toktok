package X;

import Y.IDAListenerS79S0100000_12;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelShowOptV2Setting;
import com.bytedance.android.livesdk.livesetting.performance.LiveComboLargeClickableAreaSetting;
import com.zhiliaoapp.musically.R;

/* renamed from: X.SmV, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73099SmV extends FrameLayout {
    public static final float LJLJJLL = C15380j0.LIZ(-30.0f);
    public static final float LJLJL = C15380j0.LIZ(34.0f);
    public static final float LJLJLJ = C15380j0.LIZ(1.0f);
    public static Typeface LJLJLLL;
    public int LJLIL;
    public AnimatorSet LJLILLLLZI;
    public AnimatorSet LJLJI;
    public boolean LJLJJI;
    public final java.util.Map<Integer, View> LJLJJL;

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLJJL;
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

    public final void LIZIZ() {
        AnimatorSet animatorSet = this.LJLJI;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.LJLJI;
            if (animatorSet2 != null) {
                C16880lQ.LJLJJL(animatorSet2);
            }
            AnimatorSet animatorSet3 = this.LJLJI;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
        }
        this.LJLJI = null;
    }

    public final void LIZJ() {
        AnimatorSet animatorSet = this.LJLILLLLZI;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.LJLILLLLZI;
            if (animatorSet2 != null) {
                C16880lQ.LJLJJL(animatorSet2);
            }
            AnimatorSet animatorSet3 = this.LJLILLLLZI;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
        }
        this.LJLILLLLZI = null;
    }

    public final void LIZLLL() {
        Integer num;
        View LIZ;
        LIZIZ();
        if (LiveComboLargeClickableAreaSetting.INSTANCE.getValue()) {
            C40517FvF c40517FvF = new C40517FvF(0, (int) LJLJL);
            View LIZ2 = LIZ(R.id.bj1);
            if (LIZ2 != null) {
                num = Integer.valueOf((int) LIZ2.getTranslationY());
            } else {
                num = null;
            }
            if (((num != null && c40517FvF.LJIILJJIL(num.intValue())) || this.LJLIL <= 1) && (LIZ = LIZ(R.id.bj1)) != null) {
                LIZ.setTranslationY(0.0f);
            }
            if (LIZ(R.id.bj1).getTranslationY() >= LJLJJLL) {
                View LIZ3 = LIZ(R.id.bj1);
                LIZ3.setTranslationY(LIZ3.getTranslationY() - LJLJLJ);
                return;
            }
            return;
        }
        View LIZ4 = LIZ(R.id.bj1);
        if (LIZ4 == null) {
            return;
        }
        LIZ4.setTranslationY(0.0f);
    }

    public final void LJ(long j) {
        ObjectAnimator ofFloat;
        LIZIZ();
        this.LJLJI = new AnimatorSet();
        if (LiveComboLargeClickableAreaSetting.INSTANCE.getValue()) {
            ofFloat = ObjectAnimator.ofFloat(LIZ(R.id.bj1), (Property<View, Float>) View.TRANSLATION_Y, LIZ(R.id.bj1).getTranslationY(), LJLJL);
        } else {
            ofFloat = ObjectAnimator.ofFloat(LIZ(R.id.bj1), (Property<View, Float>) View.TRANSLATION_Y, LJLJL);
        }
        AnimatorSet animatorSet = this.LJLJI;
        if (animatorSet != null) {
            animatorSet.playTogether(ofFloat);
        }
        AnimatorSet animatorSet2 = this.LJLJI;
        if (animatorSet2 != null) {
            animatorSet2.setInterpolator(new PathInterpolator(0.66f, 0.0f, 0.86f, 0.0f));
        }
        AnimatorSet animatorSet3 = this.LJLJI;
        if (animatorSet3 != null) {
            animatorSet3.setDuration(j);
        }
        AnimatorSet animatorSet4 = this.LJLJI;
        if (animatorSet4 != null) {
            animatorSet4.start();
        }
    }

    public final void LJFF(long j) {
        float f;
        LIZJ();
        this.LJLILLLLZI = new AnimatorSet();
        View LIZ = LIZ(R.id.bj_);
        if (LIZ != null) {
            View LIZ2 = LIZ(R.id.bj_);
            if (LIZ2 != null) {
                f = LIZ2.getHeight();
            } else {
                f = 0.0f;
            }
            LIZ.setPivotY(f);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(LIZ(R.id.bj_), (Property<View, Float>) View.SCALE_Y, 1.0f, 0.2f);
        AnimatorSet animatorSet = this.LJLILLLLZI;
        if (animatorSet != null) {
            animatorSet.playTogether(ofFloat);
        }
        AnimatorSet animatorSet2 = this.LJLILLLLZI;
        if (animatorSet2 != null) {
            animatorSet2.addListener(new IDAListenerS79S0100000_12(this, 1));
        }
        AnimatorSet animatorSet3 = this.LJLILLLLZI;
        if (animatorSet3 != null) {
            animatorSet3.setInterpolator(new PathInterpolator(0.66f, 0.0f, 0.86f, 0.0f));
        }
        AnimatorSet animatorSet4 = this.LJLILLLLZI;
        if (animatorSet4 != null) {
            animatorSet4.setDuration(j);
        }
        AnimatorSet animatorSet5 = this.LJLILLLLZI;
        if (animatorSet5 != null) {
            animatorSet5.start();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73099SmV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Typeface typeface;
        this.LJLJJL = C62850Ola.LJFF(context, "context");
        C16880lQ.LLLZIIL(R.layout.cue, C16880lQ.LLZIL(context), this);
        try {
            if (!LiveGiftPanelShowOptV2Setting.INSTANCE.getValue()) {
                typeface = Typeface.createFromAsset(context.getAssets(), "font/ttlive_base_gift_combo_font.ttf");
            } else {
                typeface = LJLJLLL;
                if (typeface == null) {
                    typeface = Typeface.createFromAsset(context.getAssets(), "font/ttlive_base_gift_combo_font.ttf");
                    LJLJLLL = typeface;
                }
            }
            C47121t6 c47121t6 = (C47121t6) LIZ(R.id.bj2);
            if (c47121t6 != null) {
                c47121t6.setTypeface(typeface);
            }
            C47121t6 c47121t62 = (C47121t6) LIZ(R.id.bj3);
            if (c47121t62 != null) {
                c47121t62.setTypeface(typeface);
            }
            C47121t6 c47121t63 = (C47121t6) LIZ(R.id.bj4);
            if (c47121t63 != null) {
                c47121t63.setTypeface(typeface);
            }
        } catch (Exception e) {
            StringBuilder LIZIZ = C59895Nf1.LIZIZ(e, "load font asset exception: ");
            LIZIZ.append(e.getMessage());
            C0NB.LJ("ComboProgressAnimationView", X1D.LIZIZ(LIZIZ));
        }
    }
}
