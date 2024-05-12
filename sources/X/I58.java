package X;

import Y.ALAdapterS5S0100000_7;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I58 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ I56 LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ Rect LJLJI;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view;
        TextView textView = this.LJLIL.LJLL;
        if (textView != null) {
            textView.getRootView().getViewTreeObserver().removeOnPreDrawListener(this);
            RecyclerView LLJJ = this.LJLIL.LLJJ();
            AnimatorSet LIZ = C1DD.LIZ(300L);
            LIZ.play(ObjectAnimator.ofFloat(LLJJ, "alpha", 1.0f, 0.0f));
            AnimatorSet animatorSet = new AnimatorSet();
            I56 i56 = this.LJLIL;
            animatorSet.setDuration(300L);
            TextView textView2 = i56.LJLL;
            if (textView2 != null) {
                animatorSet.play(ObjectAnimator.ofFloat(textView2, "alpha", 0.0f, 1.0f));
                I56 i562 = this.LJLIL;
                RecyclerView.ViewHolder LJJIZ = i562.LLJJ().LJJIZ(this.LJLILLLLZI);
                if (LJJIZ != null) {
                    view = LJJIZ.itemView;
                } else {
                    view = null;
                }
                i562.LLFF = view;
                I56 i563 = this.LJLIL;
                i563.LLFFF = C8DQ.LIZ(i563.LLJJ());
                if (this.LJLJI == null || this.LJLIL.LLFF == null) {
                    return false;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(LIZ);
                arrayList.add(animatorSet);
                AnimatorSet animatorSet2 = new AnimatorSet();
                I56 i564 = this.LJLIL;
                animatorSet2.setDuration(300L);
                TextView textView3 = i564.LJLJJL;
                if (textView3 != null) {
                    animatorSet2.play(ObjectAnimator.ofFloat(textView3, "alpha", 1.0f, 0.0f));
                    arrayList.add(animatorSet2);
                    I56 i565 = this.LJLIL;
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    I56 i566 = this.LJLIL;
                    animatorSet3.playTogether(arrayList);
                    animatorSet3.addListener(new ALAdapterS5S0100000_7(i566, 12));
                    i565.LLFII = animatorSet3;
                    AnimatorSet animatorSet4 = this.LJLIL.LLFII;
                    if (animatorSet4 != null) {
                        animatorSet4.start();
                    }
                    return false;
                }
                o.LJIJI("tvVideoSegmentDes");
                throw null;
            }
            o.LJIJI("singleEditTitle");
            throw null;
        }
        o.LJIJI("singleEditTitle");
        throw null;
    }

    public I58(I56 i56, int i, Rect rect) {
        this.LJLIL = i56;
        this.LJLILLLLZI = i;
        this.LJLJI = rect;
    }
}
