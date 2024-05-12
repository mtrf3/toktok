package X;

import Y.AUListenerS101S0100000_14;
import Y.IDRunnableS6S0101000;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.zhiliaoapp.musically.R;

/* renamed from: X.W0d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81583W0d implements InterfaceC81592W0m {
    public View LJLIL;
    public FrameLayout LJLILLLLZI;
    public View LJLJI;
    public ValueAnimator LJLJJI;
    public boolean LJLJJL;
    public C81582W0c LJLJJLL;

    public C81583W0d() {
    }

    @Override // X.InterfaceC81592W0m
    public final boolean isShowing() {
        return this.LJLJJL;
    }

    public C81583W0d(C81582W0c c81582W0c) {
        this.LJLJJLL = c81582W0c;
    }

    @Override // X.InterfaceC81592W0m
    public final void LIZ(FrameLayout frameLayout) {
        boolean z;
        this.LJLILLLLZI = frameLayout;
        if (this.LJLJJLL == null) {
            return;
        }
        int i = 0;
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(frameLayout.getContext()), R.layout.bn5, frameLayout, false);
        this.LJLIL = LLLLIILL;
        this.LJLILLLLZI.addView(LLLLIILL, 0);
        this.LJLJI = this.LJLIL.findViewById(R.id.dc7);
        TextView textView = (TextView) this.LJLIL.findViewById(R.id.kir);
        String str = this.LJLJJLL.LJLIL;
        if (str != null) {
            textView.setText(str);
        }
        W5G w5g = (W5G) this.LJLIL.findViewById(R.id.kis);
        UrlModel urlModel = this.LJLJJLL.LJLILLLLZI;
        if (urlModel != null && !C77413UZt.LJIILL(urlModel.getUrlList())) {
            z = true;
        } else {
            z = false;
            i = 8;
        }
        C162696a1.LIZLLL(i, w5g);
        if (z) {
            C78764Uvg.LJI(w5g, C78963Uyt.LJIL(this.LJLJJLL.LJLILLLLZI), -1, -1);
        }
        this.LJLJI.setAlpha(0.3f);
        if (!C82894Wg6.LIZIZ.LJ()) {
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 5500);
            this.LJLJJI = ofInt;
            ofInt.setDuration(5500L);
            this.LJLJJI.setInterpolator(new LinearInterpolator());
            this.LJLJJI.addUpdateListener(new AUListenerS101S0100000_14(this, 24));
            this.LJLJJI.start();
        } else {
            this.LJLJI.setAlpha(0.5f);
            this.LJLJI.postDelayed(new IDRunnableS6S0101000(5, this, 12), 5500L);
        }
        this.LJLJJL = true;
    }

    @Override // X.InterfaceC81592W0m
    public final void LJJLIIIJL(boolean z) {
        if (this.LJLJJLL == null || this.LJLJI == null || this.LJLILLLLZI == null) {
            return;
        }
        ValueAnimator valueAnimator = this.LJLJJI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        C16880lQ.LJLLLL(this.LJLIL, this.LJLILLLLZI);
        this.LJLJJL = false;
    }
}
