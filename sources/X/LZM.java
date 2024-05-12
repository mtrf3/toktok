package X;

import Y.IDAListenerS77S0100000_9;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.feed.platform.panel.homeviewpager.EdgeSlideGuideAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LZM implements LZQ {
    public final /* synthetic */ EdgeSlideGuideAssem LIZ;

    @Override // X.LZQ
    public final void LIZ() {
        this.LIZ.LLD = false;
    }

    @Override // X.LZQ
    public final boolean LJJLIIJ() {
        return this.LIZ.LLD;
    }

    public LZM(EdgeSlideGuideAssem edgeSlideGuideAssem) {
        this.LIZ = edgeSlideGuideAssem;
    }

    @Override // X.LZQ
    public final void LIZIZ(M78 wrapper) {
        String str;
        o.LJIIIZ(wrapper, "wrapper");
        EdgeSlideGuideAssem edgeSlideGuideAssem = this.LIZ;
        edgeSlideGuideAssem.LLIIIJ = wrapper;
        edgeSlideGuideAssem.LLD = false;
        if (!edgeSlideGuideAssem.LLFF) {
            View view = edgeSlideGuideAssem.LJLLLL;
            int i = C61447O9r.LJIILJJIL;
            if (view != null) {
                C26338AVi.LJI(view, null, null, null, Integer.valueOf(i), false, 23);
            }
            edgeSlideGuideAssem.LLFF = true;
        }
        View containerView = edgeSlideGuideAssem.getContainerView();
        if (containerView != null) {
            C17N.LJJLIIIJJI(containerView);
        }
        View view2 = edgeSlideGuideAssem.LJLZ;
        if (view2 != null) {
            C17N.LJJLIIIJJI(view2);
        }
        C29701Eo c29701Eo = edgeSlideGuideAssem.LJLLL;
        if (c29701Eo != null) {
            C17N.LJJLIIIJJI(c29701Eo);
        }
        LZP lzp = edgeSlideGuideAssem.I3().LIZLLL;
        if (lzp != null) {
            int LIZLLL = lzp.LIZLLL();
            TuxTextView tuxTextView = edgeSlideGuideAssem.LJZ;
            if (tuxTextView != null) {
                Context context = tuxTextView.getContext();
                if (context == null || (str = context.getString(LIZLLL)) == null) {
                    str = "";
                }
                tuxTextView.setText(str);
            }
        }
        TuxTextView tuxTextView2 = edgeSlideGuideAssem.LJZ;
        if (tuxTextView2 != null) {
            C17N.LJJLIIIJJI(tuxTextView2);
        }
        View view3 = edgeSlideGuideAssem.LJLLLL;
        if (view3 != null) {
            C17N.LJJLIIIJJI(view3);
        }
        TuxIconView tuxIconView = edgeSlideGuideAssem.LJZI;
        if (tuxIconView != null) {
            C17N.LJJLIIIJJI(tuxIconView);
        }
        View view4 = edgeSlideGuideAssem.LJLLLL;
        if (view4 != null) {
            view4.setAlpha(1.0f);
        }
        TuxIconView tuxIconView2 = edgeSlideGuideAssem.LJZI;
        if (tuxIconView2 != null) {
            tuxIconView2.setAlpha(1.0f);
        }
        TuxTextView tuxTextView3 = edgeSlideGuideAssem.LJZ;
        if (tuxTextView3 != null) {
            tuxTextView3.setAlpha(1.0f);
        }
        ObjectAnimator objectAnimator = edgeSlideGuideAssem.LLFII;
        if (objectAnimator != null) {
            objectAnimator.addListener(new IDAListenerS77S0100000_9(edgeSlideGuideAssem, 7));
        }
        ObjectAnimator objectAnimator2 = edgeSlideGuideAssem.LLFII;
        if (objectAnimator2 != null) {
            objectAnimator2.start();
        }
        LZP lzp2 = this.LIZ.I3().LIZLLL;
        if (lzp2 != null) {
            lzp2.LIZ();
        }
    }
}
