package X;

import Y.ARunnableS40S0100000_4;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftAddComboDuration;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchRequestLayoutSettings;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.UcD, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77557UcD extends FrameLayout {
    public View LJLIL;
    public C47121t6 LJLILLLLZI;
    public AnimatorSet LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public AbstractC32698CsQ<?> LJLJJLL;
    public C9CS LJLJL;
    public C76836UDo LJLJLJ;
    public C73099SmV LJLJLLL;
    public long LJLL;

    public final void LIZLLL() {
        this.LJLJJL = 0;
        LIZ();
        setScaleX(1.0f);
        setScaleY(1.0f);
        View view = this.LJLIL;
        if (view != null) {
            view.setRotation(0.0f);
        }
        C9CS c9cs = this.LJLJL;
        if (c9cs != null) {
            InterfaceC92693kP interfaceC92693kP = c9cs.LJLIL;
            if (interfaceC92693kP != null) {
                interfaceC92693kP.dispose();
            }
            c9cs.post(new ARunnableS40S0100000_4(c9cs, 5));
        }
        C76836UDo c76836UDo = this.LJLJLJ;
        if (c76836UDo != null) {
            InterfaceC92693kP interfaceC92693kP2 = c76836UDo.LJLILLLLZI;
            if (interfaceC92693kP2 != null) {
                interfaceC92693kP2.dispose();
            }
            c76836UDo.removeAllViews();
        }
        C73099SmV c73099SmV = this.LJLJLLL;
        if (c73099SmV != null) {
            c73099SmV.LJLIL = 0;
            c73099SmV.LIZJ();
            c73099SmV.LIZIZ();
        }
    }

    public final void LIZ() {
        ViewPropertyAnimator animate;
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
        View view = this.LJLIL;
        if (view != null && (animate = view.animate()) != null) {
            animate.cancel();
        }
    }

    public final int getComboCount() {
        return this.LJLJJL;
    }

    public final long getLastClickTime() {
        return this.LJLL;
    }

    public final void setAnimationType(EnumC77563UcJ type) {
        C73099SmV c73099SmV;
        o.LJIIIZ(type, "type");
        if (C77562UcI.LIZ[type.ordinal()] != 1 || (c73099SmV = this.LJLJLLL) == null) {
            return;
        }
        C29306Beo.LJIIIZ(c73099SmV);
    }

    public final void setLastClickTime(long j) {
        this.LJLL = j;
    }

    public final void setPanel(AbstractC32698CsQ<?> abstractC32698CsQ) {
        this.LJLJJLL = abstractC32698CsQ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77557UcD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TextPaint paint;
        a1.LJFF(context, "mContext");
        FrameLayout.inflate(context, R.layout.cug, this);
        this.LJLIL = findViewById(R.id.biz);
        this.LJLILLLLZI = (C47121t6) findViewById(R.id.bjc);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(' ');
        LIZ.append(C15380j0.LJIILJJIL(R.string.kn9));
        LIZ.append(' ');
        String LIZIZ = X1D.LIZIZ(LIZ);
        C47121t6 c47121t6 = this.LJLILLLLZI;
        if (c47121t6 != null) {
            c47121t6.setText(LIZIZ);
        }
        this.LJLJL = (C9CS) findViewById(R.id.bjb);
        this.LJLJLJ = (C76836UDo) findViewById(R.id.bj5);
        this.LJLJLLL = (C73099SmV) findViewById(R.id.bj8);
        View findViewById = findViewById(R.id.bj6);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.combo_fixed_size_container)");
        C80955Vpv c80955Vpv = (C80955Vpv) findViewById;
        c80955Vpv.setEnableSizeChange(true);
        c80955Vpv.setEnableFixedSize(LiveMatchRequestLayoutSettings.INSTANCE.isMatchEnabled());
        C23010vJ.LJ(700, this.LJLILLLLZI);
        C47121t6 c47121t62 = this.LJLILLLLZI;
        if (c47121t62 == null || (paint = c47121t62.getPaint()) == null) {
            return;
        }
        paint.setTextSkewX(-0.25f);
    }

    public static int LIZIZ(int i, String str) {
        LiveGiftAddComboDuration liveGiftAddComboDuration = LiveGiftAddComboDuration.INSTANCE;
        if (liveGiftAddComboDuration.optimiseFirstBigGiftCombo3s() && i == 1 && str.equals("live_stream")) {
            return 1;
        }
        if (liveGiftAddComboDuration.optimiseFirstBigGiftCombo4s() && i == 1 && str.equals("live_stream")) {
            return 2;
        }
        if (!liveGiftAddComboDuration.optimiseAllGiftCombo()) {
            return 0;
        }
        return 3;
    }

    public final void LJ(long j, Runnable runnable) {
        LIZ();
        this.LJLJI = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.LJLIL, (Property<View, Float>) FrameLayout.ROTATION, 0.0f, 360.0f);
        o.LJIIIIZZ(ofFloat, "ofFloat(comboBg, ROTATION, 0f, 360f)");
        AnimatorSet animatorSet = this.LJLJI;
        if (animatorSet != null) {
            animatorSet.playTogether(ofFloat);
        }
        AnimatorSet animatorSet2 = this.LJLJI;
        if (animatorSet2 != null) {
            animatorSet2.setDuration(j);
        }
        AnimatorSet animatorSet3 = this.LJLJI;
        if (animatorSet3 != null) {
            animatorSet3.addListener(new C77558UcE(this, runnable));
        }
        AnimatorSet animatorSet4 = this.LJLJI;
        if (animatorSet4 != null) {
            animatorSet4.start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0412 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0118  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.lang.Runnable r26, java.lang.Runnable r27, long r28, java.lang.String r30, java.lang.String r31, long r32) {
        /*
            Method dump skipped, instructions count: 1224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77557UcD.LIZJ(java.lang.Runnable, java.lang.Runnable, long, java.lang.String, java.lang.String, long):void");
    }
}
