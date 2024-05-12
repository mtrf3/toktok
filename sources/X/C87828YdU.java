package X;

import android.animation.Animator;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.YdU, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87828YdU extends C87797Ycz {
    public final /* synthetic */ C87819YdL LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    @Override // X.C87797Ycz, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        int i;
        o.LJIIIZ(animation, "animation");
        ImageView imageView = this.LJLIL.LJIJJLI;
        if (imageView != null) {
            imageView.setVisibility(0);
            ImageView imageView2 = this.LJLIL.LJIJJLI;
            if (imageView2 != null) {
                if (this.LJLILLLLZI) {
                    i = R.drawable.d_v;
                } else {
                    i = R.drawable.d_u;
                }
                imageView2.setImageResource(i);
                C87819YdL c87819YdL = this.LJLIL;
                ImageView imageView3 = c87819YdL.LJIJJLI;
                if (imageView3 != null) {
                    imageView3.setTranslationY(c87819YdL.LJIL);
                    ImageView imageView4 = this.LJLIL.LJIJJLI;
                    if (imageView4 != null) {
                        AbstractC87817YdJ.LJFF(imageView4);
                        C87819YdL c87819YdL2 = this.LJLIL;
                        ImageView imageView5 = c87819YdL2.LJIJJLI;
                        if (imageView5 != null) {
                            TextView textView = c87819YdL2.LJIJI;
                            if (textView != null) {
                                int left = textView.getLeft();
                                TextView textView2 = this.LJLIL.LJIJI;
                                if (textView2 != null) {
                                    int right = (textView2.getRight() + left) / 2;
                                    if (this.LJLIL.LJIJJLI != null) {
                                        imageView5.setTranslationX(right - (r0.getMeasuredWidth() / 2));
                                        return;
                                    } else {
                                        o.LJIJI("numArrow");
                                        throw null;
                                    }
                                }
                                o.LJIJI("numText2");
                                throw null;
                            }
                            o.LJIJI("numText2");
                            throw null;
                        }
                        o.LJIJI("numArrow");
                        throw null;
                    }
                    o.LJIJI("numArrow");
                    throw null;
                }
                o.LJIJI("numArrow");
                throw null;
            }
            o.LJIJI("numArrow");
            throw null;
        }
        o.LJIJI("numArrow");
        throw null;
    }

    public C87828YdU(C87819YdL c87819YdL, boolean z) {
        this.LJLIL = c87819YdL;
        this.LJLILLLLZI = z;
    }
}
