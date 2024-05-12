package X;

import Y.ALAdapterS10S0100000_13;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS180S0100000_14;

/* loaded from: classes14.dex */
public final class UYH implements InterfaceC81592W0m {
    public final Effect LJLIL;
    public FrameLayout LJLILLLLZI;
    public View LJLJI;
    public boolean LJLJJI;
    public final InterfaceC88472Yns<FrameLayout, C76800UCe> LJLJJL;

    @Override // X.InterfaceC81592W0m
    public final boolean isShowing() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC81592W0m
    public final void LIZ(FrameLayout frameLayout) {
        if (this.LJLIL == null || frameLayout == null) {
            return;
        }
        this.LJLILLLLZI = frameLayout;
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(frameLayout.getContext()), R.layout.bn9, frameLayout, false);
        this.LJLJI = LLLLIILL;
        FrameLayout frameLayout2 = this.LJLILLLLZI;
        if (frameLayout2 != null) {
            frameLayout2.addView(LLLLIILL);
            View view = this.LJLJI;
            if (view != null) {
                view.setAlpha(0.0f);
                view.animate().alpha(1.0f).setDuration(150L).start();
            }
            InterfaceC88472Yns<FrameLayout, C76800UCe> interfaceC88472Yns = this.LJLJJL;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(frameLayout);
            }
            this.LJLJJI = true;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
    }

    @Override // X.InterfaceC81592W0m
    public final void LJJLIIIJL(boolean z) {
        if (this.LJLIL == null) {
            return;
        }
        View view = this.LJLJI;
        if (view != null) {
            C09K.LIZ(view, 0.0f, 150L).setListener(new ALAdapterS10S0100000_13(this, 22)).start();
        }
        this.LJLJJI = false;
    }

    public UYH(Effect effect, AqS180S0100000_14 aqS180S0100000_14) {
        this.LJLJJL = aqS180S0100000_14;
        this.LJLIL = effect;
    }
}
