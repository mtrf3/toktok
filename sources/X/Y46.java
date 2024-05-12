package X;

import Y.ALAdapterS12S0100000_15;
import Y.AUListenerS102S0100000_15;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.tux.sheet.sheet.TuxSheet;

/* loaded from: classes16.dex */
public final class Y46 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ Y45 LJLIL;
    public final /* synthetic */ View LJLILLLLZI;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view;
        int measuredHeight;
        TuxSheet tuxSheet = this.LJLIL.LJLJJL.get();
        if (tuxSheet == null || (view = tuxSheet.getView()) == null || (measuredHeight = view.getMeasuredHeight()) <= 0) {
            return;
        }
        this.LJLILLLLZI.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.LJLIL.LJLJJLL = measuredHeight;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(C55953Lxd.LJIIJ());
        Y45 y45 = this.LJLIL;
        ofFloat.addUpdateListener(new AUListenerS102S0100000_15(y45, 18));
        ofFloat.addListener(new ALAdapterS12S0100000_15(y45, 18));
        ofFloat.start();
    }

    public Y46(Y45 y45, View view) {
        this.LJLIL = y45;
        this.LJLILLLLZI = view;
    }
}
