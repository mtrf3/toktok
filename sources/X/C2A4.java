package X;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.2A4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2A4 extends C47061t0 {
    public String LLIIJI;
    public InterfaceC81841WAb LLIIJLIL;
    public W4R LLIIL;
    public boolean LLIILII;
    public AnimatedDrawable2 LLIILZL;
    public boolean LLIIZ;

    public final void LJ() {
        this.LLIILII = false;
        AnimatedDrawable2 animatedDrawable2 = this.LLIILZL;
        if (animatedDrawable2 != null) {
            animatedDrawable2.stop();
        }
    }

    public final void LJII() {
        this.LLIILII = true;
        LIZIZ();
    }

    public final void LIZIZ() {
        if (this.LLIIL == null) {
            C81705W4v LIZJ = W5I.LIZJ();
            LIZJ.LJII(this.LLIIJI);
            LIZJ.LJIIJ = false;
            LIZJ.LJII = new W4Z<InterfaceC81599W0t>() { // from class: X.1GS
                @Override // X.W4Z
                public final void LIZIZ(String str, Throwable th) {
                }

                @Override // X.W4Z
                public final void LIZJ(String str) {
                }

                @Override // X.W4Z
                public final void LJ(String str, Throwable th) {
                }

                @Override // X.W4Z
                public final void LJI(Object obj, String str) {
                }

                @Override // X.W4Z
                public final /* bridge */ /* synthetic */ void LIZLLL(Object obj, String str) {
                }

                @Override // X.W4Z
                public final void LJFF(String str, InterfaceC81599W0t interfaceC81599W0t, Animatable animatable) {
                    InterfaceC81599W0t interfaceC81599W0t2 = interfaceC81599W0t;
                    if (C2A4.this.getUseWrapContent() && interfaceC81599W0t2 != null) {
                        C2A4 c2a4 = C2A4.this;
                        int width = interfaceC81599W0t2.getWidth();
                        int height = interfaceC81599W0t2.getHeight();
                        int measuredWidth = c2a4.getMeasuredWidth();
                        int measuredHeight = c2a4.getMeasuredHeight();
                        if (measuredHeight > measuredWidth) {
                            measuredWidth = (width / height) * measuredHeight;
                        } else {
                            measuredHeight = (height / width) * measuredWidth;
                        }
                        c2a4.getLayoutParams().height = measuredHeight;
                        c2a4.getLayoutParams().width = measuredWidth;
                        c2a4.setLayoutParams(c2a4.getLayoutParams());
                    }
                    if (animatable instanceof AnimatedDrawable2) {
                        AnimatedDrawable2 animatedDrawable2 = (AnimatedDrawable2) animatable;
                        animatedDrawable2.LJI(C2A4.this.LLIIJLIL);
                        if (C2A4.this.LLIILII) {
                            animatedDrawable2.start();
                        }
                        C2A4.this.setAnimatedDrawable2(animatedDrawable2);
                    }
                }
            };
            this.LLIIL = LIZJ.LIZ();
        }
        setController(this.LLIIL);
    }

    public final boolean LJFF() {
        AnimatedDrawable2 animatedDrawable2 = this.LLIILZL;
        if (animatedDrawable2 != null) {
            return animatedDrawable2.isRunning();
        }
        return false;
    }

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    public final AnimatedDrawable2 getAnimatedDrawable2() {
        return this.LLIILZL;
    }

    public final boolean getUseWrapContent() {
        return this.LLIIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2A4(Context context) {
        super(context);
        new LinkedHashMap();
        this.LLIIJI = "";
        this.LLIILII = true;
    }

    public final void LJIIIIZZ(String resUrl) {
        o.LJIIIZ(resUrl, "resUrl");
        this.LLIIJI = resUrl;
    }

    public final void setAnimatedDrawable2(AnimatedDrawable2 animatedDrawable2) {
        this.LLIILZL = animatedDrawable2;
    }

    public final void setAutoPlay(boolean z) {
        this.LLIILII = z;
    }

    public final void setUseWrapContent(boolean z) {
        this.LLIIZ = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2A4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new LinkedHashMap();
        this.LLIIJI = "";
        this.LLIILII = true;
    }
}
