package X;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.EdgeEffect;

/* renamed from: X.MlH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C57735MlH extends EdgeEffect {
    public final View LIZ;
    public final int LIZIZ;
    public C39661h4 LIZJ;

    public final C39661h4 LIZ() {
        C39661h4 c39661h4 = this.LIZJ;
        if (c39661h4 == null) {
            c39661h4 = new C39661h4(this.LIZ, C17T.LJIILIIL);
        }
        C00Q c00q = new C00Q();
        c00q.LJIIIIZZ = 0.0f;
        c00q.LIZ(1.0f);
        c00q.LIZIZ(200.0f);
        c39661h4.LJIL = c00q;
        return c39661h4;
    }

    @Override // android.widget.EdgeEffect
    public final boolean isFinished() {
        C39661h4 c39661h4 = this.LIZJ;
        if (c39661h4 == null || !c39661h4.LJFF) {
            return true;
        }
        return false;
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        super.onRelease();
        if ((this.LIZIZ == 0 && this.LIZ.getTranslationY() > 0.0f) || (this.LIZIZ == 1 && this.LIZ.getTranslationY() < 0.0f)) {
            C39661h4 LIZ = LIZ();
            this.LIZJ = LIZ;
            LIZ.LJIIIZ();
        }
    }

    public final void LIZIZ(float f) {
        int i;
        if (this.LIZIZ == 0) {
            i = 1;
        } else {
            i = -1;
        }
        float width = this.LIZ.getWidth() * i * f * 0.2f;
        View view = this.LIZ;
        view.setTranslationY(view.getTranslationY() + width);
        C39661h4 c39661h4 = this.LIZJ;
        if (c39661h4 != null) {
            c39661h4.LIZLLL();
        }
    }

    @Override // android.widget.EdgeEffect
    public final boolean draw(Canvas canvas) {
        return !isFinished();
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        int i2;
        super.onAbsorb(i);
        if (this.LIZIZ == 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        float f = i2 * i * 0.5f;
        C39661h4 c39661h4 = this.LIZJ;
        if (c39661h4 != null) {
            c39661h4.LIZLLL();
        }
        C39661h4 LIZ = LIZ();
        LIZ.LIZ = f;
        this.LIZJ = LIZ;
        LIZ.LJIIIZ();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f) {
        super.onPull(f);
        LIZIZ(f);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f, float f2) {
        super.onPull(f, f2);
        LIZIZ(f);
    }

    public C57735MlH(Context context, View view, int i) {
        super(context);
        this.LIZ = view;
        this.LIZIZ = i;
    }
}
