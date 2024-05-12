package X;

import Y.ALAdapterS11S0200000_14;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WSa, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82308WSa implements InterfaceC83879Wvz {
    public boolean LIZ;
    public boolean LIZIZ;
    public final WHP LIZJ;
    public final ImageView LIZLLL;
    public final C62822Ol8 LJ;
    public final C62822Ol8 LJFF;
    public final C62822Ol8 LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public final C62822Ol8 LJIIIZ;
    public final Context LJIIJ;
    public final InterfaceC83624Wrs LJIIJJI;
    public final InterfaceC83931Wwp LJIIL;

    public final AnimatorSet LIZIZ() {
        return (AnimatorSet) this.LJ.getValue();
    }

    public final InterfaceC82309WSb LIZJ() {
        return (InterfaceC82309WSb) this.LJIIIZ.getValue();
    }

    @Override // X.InterfaceC83879Wvz
    public final void LLLLLILLIL() {
        if (this.LIZIZ) {
            if (this.LJII) {
                LIZIZ().end();
            } else {
                ((AnimatorSet) this.LJFF.getValue()).end();
            }
        }
    }

    @Override // X.InterfaceC83879Wvz
    public final void LLLLZIL() {
        if (this.LIZ) {
            if (this.LJII) {
                LIZIZ().end();
            } else {
                ((AnimatorSet) this.LJI.getValue()).end();
            }
        }
    }

    @Override // X.InterfaceC83879Wvz
    public final boolean getIsExposureSeekBarShowing() {
        return this.LIZIZ;
    }

    public final AnimatorSet LIZ(View view) {
        ObjectAnimator LIZ = DIK.LIZ(view, View.ALPHA, new float[]{1.0f, 1.0f}, "waitAnimator1", 500L);
        ObjectAnimator LIZ2 = DIK.LIZ(view, View.ALPHA, new float[]{1.0f, 0.5f}, "disappearAnimator1", 1000L);
        ObjectAnimator LIZ3 = DIK.LIZ(view, View.ALPHA, new float[]{0.5f, 0.5f}, "waitAnimator2", 500L);
        ObjectAnimator LIZ4 = DIK.LIZ(view, View.ALPHA, new float[]{0.5f, 0.0f}, "disappearAnimator2", 500L);
        LIZ4.addListener(new ALAdapterS11S0200000_14(this, view, 13));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(LIZ, LIZ2, LIZ3, LIZ4);
        return animatorSet;
    }

    @Override // X.InterfaceC83879Wvz
    public final void LLLLLLLLLL(boolean z) {
        this.LJIIIIZZ = z;
    }

    @Override // X.InterfaceC83879Wvz
    public final void setExposureSeekBarProgress(float f) {
        if (this.LJII) {
            LIZIZ().end();
            LIZJ().removeView(this.LIZLLL);
            LIZJ().removeView(this.LIZJ);
            LIZJ().LJZI(this.LIZJ);
            LIZJ().LJZI(this.LIZLLL);
            this.LIZIZ = true;
            this.LIZ = true;
        } else {
            ((AnimatorSet) this.LJI.getValue()).end();
            ((AnimatorSet) this.LJFF.getValue()).end();
            LIZJ().removeView(this.LIZLLL);
            LIZJ().removeView(this.LIZJ);
            LIZJ().LJZI(this.LIZJ);
            LIZJ().LJZI(this.LIZLLL);
            this.LIZIZ = true;
            this.LIZ = true;
        }
        this.LIZJ.setProgress(f);
        float progress = this.LIZJ.getProgress();
        C63824P3c cameraECInfo = this.LJIIJJI.getCameraECInfo();
        if (cameraECInfo != null) {
            int i = cameraECInfo.LIZJ;
            int i2 = cameraECInfo.LIZ;
            if (Math.abs(i) < Math.abs(i2)) {
                i2 = -i;
            } else if (Math.abs(i2) < Math.abs(i)) {
                i = -i2;
            }
            this.LJIIJJI.setExposureCompensation((int) ((progress * (i2 - i)) + i));
        }
        ((AnimatorSet) this.LJFF.getValue()).start();
        ((AnimatorSet) this.LJI.getValue()).start();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6  */
    @Override // X.InterfaceC83879Wvz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLLL(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82308WSa.LLLLLL(int, int):void");
    }

    @Override // X.InterfaceC83879Wvz
    public final void LLLLZLLIL(float f, float f2) {
        float LIZ;
        if (this.LIZIZ) {
            ((AnimatorSet) this.LJFF.getValue()).end();
        }
        LIZJ().removeView(this.LIZJ);
        if (f > J7C.LIZIZ(this.LJIIJ) - J7C.LIZ(this.LJIIJ, 64.0f)) {
            LIZ = f - J7C.LIZ(this.LJIIJ, 51.5f);
        } else {
            LIZ = f + J7C.LIZ(this.LJIIJ, 51.5f);
        }
        double d = 0;
        double seekBarTotalLength = (this.LIZJ.getSeekBarTotalLength() * 0.5d) + d;
        double seekBarTotalLength2 = d - (this.LIZJ.getSeekBarTotalLength() * 0.5d);
        double d2 = f2;
        if (d2 >= seekBarTotalLength && d2 <= seekBarTotalLength2) {
            float[] fArr = {LIZ, f2};
            this.LIZIZ = true;
            WHP whp = this.LIZJ;
            float f3 = fArr[0];
            float f4 = fArr[1];
            whp.LJLJJLL = f3;
            whp.LJLJL = f4;
            whp.LJLLI = false;
            whp.LJLJLJ = 0.5f;
            whp.invalidate();
            this.LIZJ.setAlpha(1.0f);
            this.LJIIJJI.setExposureCompensation(0);
            LIZJ().LJZI(this.LIZJ);
        }
    }

    public C82308WSa(Context context, InterfaceC83624Wrs rootView, InterfaceC83931Wwp cameraContext) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(rootView, "rootView");
        o.LJIIIZ(cameraContext, "cameraContext");
        this.LJIIJ = context;
        this.LJIIJJI = rootView;
        this.LJIIL = cameraContext;
        this.LIZJ = new WHP(context);
        this.LIZLLL = new ImageView(context);
        this.LJ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 519));
        this.LJFF = C221108m2.LIZIZ(new AqS164S0100000_14(this, 520));
        this.LJI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 521));
        this.LJIIIIZZ = true;
        this.LJIIIZ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 523));
    }
}
