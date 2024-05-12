package X;

import android.content.Context;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: X.Inf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47691Inf extends SurfaceView implements InterfaceC47678InS {
    public long LJLIL;

    public final /* synthetic */ void LIZ(String str, ViewGroup.LayoutParams layoutParams) {
        C48690J9a.LIZLLL(this, str, layoutParams);
    }

    @Override // X.InterfaceC47678InS
    public /* bridge */ /* synthetic */ String getStackTraceString() {
        return C48690J9a.LIZ();
    }

    @Override // X.InterfaceC47678InS
    public final boolean LIZIZ() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.LJLIL < 500) {
            return false;
        }
        this.LJLIL = currentTimeMillis;
        return true;
    }

    public C47691Inf(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LIZLLL(layoutParams, "UNKNOWN");
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        C48690J9a.LJ(this, f);
        super.setScaleX(f);
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        C48690J9a.LJFF(this, f);
        super.setScaleY(f);
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        LIZJ(f, "UNKNOWN");
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        C48690J9a.LJII(this, f);
        super.setTranslationY(f);
    }

    @Override // android.view.SurfaceView, android.view.View
    public void setVisibility(int i) {
        C48690J9a.LJIIIIZZ(this, i);
        super.setVisibility(i);
    }

    @Override // android.view.View
    public final void startAnimation(Animation animation) {
        C48690J9a.LJIIIZ(this);
        super.startAnimation(animation);
    }

    @Override // X.InterfaceC47678InS
    public final void LIZJ(float f, String str) {
        C48690J9a.LJI(this, str, f);
        super.setTranslationX(f);
    }

    public final void LIZLLL(ViewGroup.LayoutParams layoutParams, String str) {
        if ("UNKNOWN".equals(str)) {
            str = getStackTraceString();
        }
        LIZ(str, layoutParams);
        super.setLayoutParams(layoutParams);
    }
}
