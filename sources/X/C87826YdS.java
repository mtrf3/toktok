package X;

import android.animation.Animator;
import android.widget.TextView;
import kotlin.jvm.internal.o;

/* renamed from: X.YdS, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87826YdS extends C87797Ycz {
    public final /* synthetic */ C87819YdL LJLIL;
    public final /* synthetic */ C87837Ydd LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    @Override // X.C87797Ycz, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        int i;
        o.LJIIIZ(animation, "animation");
        TextView textView = this.LJLIL.LJIJI;
        if (textView != null) {
            textView.setAlpha(1.0f);
            TextView textView2 = this.LJLIL.LJIJI;
            if (textView2 != null) {
                textView2.setText(String.valueOf(this.LJLILLLLZI.LIZIZ));
                TextView textView3 = this.LJLIL.LJIJI;
                if (textView3 != null) {
                    textView3.setScaleX(1.3f);
                    TextView textView4 = this.LJLIL.LJIJI;
                    if (textView4 != null) {
                        textView4.setScaleY(1.3f);
                        C87819YdL c87819YdL = this.LJLIL;
                        TextView textView5 = c87819YdL.LJIJI;
                        if (textView5 != null) {
                            if (this.LJLJI) {
                                i = c87819YdL.LJJ;
                            } else {
                                i = c87819YdL.LIZIZ.LJII;
                            }
                            textView5.setTextColor(i);
                            C87819YdL c87819YdL2 = this.LJLIL;
                            TextView textView6 = c87819YdL2.LJIJI;
                            if (textView6 != null) {
                                textView6.setTranslationY(c87819YdL2.LIZIZ.LJIIJ);
                                return;
                            } else {
                                o.LJIJI("numText2");
                                throw null;
                            }
                        }
                        o.LJIJI("numText2");
                        throw null;
                    }
                    o.LJIJI("numText2");
                    throw null;
                }
                o.LJIJI("numText2");
                throw null;
            }
            o.LJIJI("numText2");
            throw null;
        }
        o.LJIJI("numText2");
        throw null;
    }

    public C87826YdS(C87819YdL c87819YdL, C87837Ydd c87837Ydd, boolean z) {
        this.LJLIL = c87819YdL;
        this.LJLILLLLZI = c87837Ydd;
        this.LJLJI = z;
    }
}
