package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I59 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ I56 LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.LJLIL.LLJJ().getRootView().getViewTreeObserver().removeOnPreDrawListener(this);
        I56 i56 = this.LJLIL;
        if (i56.LLFF == null || i56.LLFFF == null) {
            return false;
        }
        RecyclerView LLJJ = i56.LLJJ();
        ArrayList arrayList = new ArrayList();
        AnimatorSet LIZ = C1DD.LIZ(300L);
        LIZ.play(ObjectAnimator.ofFloat(LLJJ, "alpha", 0.0f, 1.0f));
        AnimatorSet animatorSet = new AnimatorSet();
        I56 i562 = this.LJLIL;
        animatorSet.setDuration(300L);
        TextView textView = i562.LJLL;
        if (textView != null) {
            animatorSet.play(ObjectAnimator.ofFloat(textView, "alpha", 0.0f, 1.0f));
            arrayList.add(animatorSet);
            arrayList.add(LIZ);
            AnimatorSet animatorSet2 = new AnimatorSet();
            I56 i563 = this.LJLIL;
            animatorSet2.setDuration(300L);
            TextView textView2 = i563.LJLJJL;
            if (textView2 != null) {
                animatorSet2.play(ObjectAnimator.ofFloat(textView2, "alpha", 0.0f, 1.0f));
                arrayList.add(animatorSet2);
                I56 i564 = this.LJLIL;
                AnimatorSet animatorSet3 = new AnimatorSet();
                I56 i565 = this.LJLIL;
                boolean z = this.LJLILLLLZI;
                animatorSet3.playTogether(arrayList);
                animatorSet3.addListener(new I57(i565, z));
                i564.LLFII = animatorSet3;
                AnimatorSet animatorSet4 = this.LJLIL.LLFII;
                if (animatorSet4 != null) {
                    animatorSet4.start();
                }
                C46048I5k c46048I5k = this.LJLIL.LJLIL;
                if (c46048I5k != null) {
                    c46048I5k.LJLILLLLZI = 0;
                }
                return false;
            }
            o.LJIJI("tvVideoSegmentDes");
            throw null;
        }
        o.LJIJI("singleEditTitle");
        throw null;
    }

    public I59(I56 i56, boolean z) {
        this.LJLIL = i56;
        this.LJLILLLLZI = z;
    }
}
