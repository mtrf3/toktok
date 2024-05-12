package X;

import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ui.DubbingStatusAssem;
import kotlin.jvm.internal.AqS104S0300000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.Y1x, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86725Y1x extends AbstractC65781Prl implements InterfaceC88473Ynt<DubbingStatusAssem, Y3Y, Boolean, C76800UCe> {
    public static final C86725Y1x LJLIL = new C86725Y1x();

    public C86725Y1x() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(DubbingStatusAssem dubbingStatusAssem, Y3Y y3y, Boolean bool) {
        TuxTextView tuxTextView;
        View view;
        Y3Y y3y2;
        DubbingStatusAssem selectSubscribe = dubbingStatusAssem;
        Y3Y state = y3y;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(state, "state");
        if (selectSubscribe.LLIIL != booleanValue || (y3y2 = selectSubscribe.LLIILII) == null || !o.LJ(y3y2.getClass(), state.getClass())) {
            if (booleanValue) {
                selectSubscribe.Y3().setVisibility(8);
                TuxTextView tuxTextView2 = selectSubscribe.LLIIIILZ;
                if (tuxTextView2 != null) {
                    tuxTextView2.setVisibility(8);
                }
                TuxTextView tuxTextView3 = selectSubscribe.LLIIIL;
                if (tuxTextView3 != null) {
                    tuxTextView3.setVisibility(8);
                }
                ImageView imageView = selectSubscribe.LLIIIZ;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                FrameLayout frameLayout = selectSubscribe.LLIIJLIL;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
                ObjectAnimator objectAnimator = selectSubscribe.LLIIII;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
            } else {
                selectSubscribe.Y3().setVisibility(0);
                if (selectSubscribe.LLIIL) {
                    FrameLayout frameLayout2 = selectSubscribe.LLIIJLIL;
                    C150165uu.LIZ(null, frameLayout2, new AqS104S0300000_15((View) null, selectSubscribe, frameLayout2, 1));
                }
                if (o.LJ(state, C86758Y3e.LIZIZ)) {
                    if (selectSubscribe.LLIILII instanceof C86759Y3f) {
                        view = selectSubscribe.LLIIIILZ;
                    } else {
                        view = selectSubscribe.LLIIIZ;
                    }
                    TuxTextView tuxTextView4 = selectSubscribe.LLIIIL;
                    C150165uu.LIZ(view, tuxTextView4, new AqS104S0300000_15(view, selectSubscribe, tuxTextView4, 1));
                } else if (o.LJ(state, C86760Y3g.LIZIZ)) {
                    if (selectSubscribe.LLIILII instanceof C86759Y3f) {
                        tuxTextView = selectSubscribe.LLIIIILZ;
                    } else {
                        tuxTextView = selectSubscribe.LLIIIL;
                    }
                    ImageView imageView2 = selectSubscribe.LLIIIZ;
                    C150165uu.LIZ(tuxTextView, imageView2, new AqS104S0300000_15(tuxTextView, selectSubscribe, imageView2, 1));
                } else if (o.LJ(state, C86759Y3f.LIZIZ)) {
                    ImageView imageView3 = selectSubscribe.LLIIIZ;
                    TuxTextView tuxTextView5 = selectSubscribe.LLIIIILZ;
                    C150165uu.LIZ(imageView3, tuxTextView5, new AqS104S0300000_15(imageView3, selectSubscribe, tuxTextView5, 1));
                }
            }
            selectSubscribe.LLIIL = booleanValue;
            selectSubscribe.LLIILII = state;
        }
        return C76800UCe.LIZ;
    }
}
