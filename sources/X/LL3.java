package X;

import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ecommerce.mall.ECommerceMallService;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LL3 implements LL4 {
    public final LNP LJLIL;
    public final IECommerceMallService LJLILLLLZI;
    public final String LJLJI;

    @Override // X.LM4
    public final void LIZ() {
    }

    @Override // X.LM4
    public final int LIZIZ() {
        return 8388629;
    }

    @Override // X.LM4
    public final void LIZJ() {
    }

    @Override // X.LM4
    public final void LJ(LMX lmx, int i) {
    }

    @Override // X.LM4
    public final void LJFF(View view) {
    }

    @Override // X.LM4
    public final void LJIIJ() {
    }

    @Override // X.LM4
    public final void LJIIL() {
    }

    @Override // X.LM4
    public final void LJIILJJIL() {
    }

    @Override // X.LM4
    public final void LJIIZILJ() {
    }

    @Override // X.LM4
    public final boolean LJIJ() {
        return false;
    }

    @Override // X.LM4
    public final void onCreate() {
    }

    @Override // X.LM4
    public final void onDestroyView() {
    }

    @Override // X.LM4
    public final void onPause() {
    }

    @Override // X.LM4
    public final void onResume() {
    }

    @Override // X.LM4
    public final View LJII() {
        ActivityC45651qj activity = this.LJLIL.getActivity();
        if (activity == null) {
            return null;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C17N.LJIILL(55.0d), C17N.LJIILL(55.0d));
        layoutParams.setMargins(0, 0, C17N.LJIILL(7.0d), 0);
        View LJLJLLL = this.LJLILLLLZI.LJLJLLL(activity);
        LJLJLLL.setLayoutParams(layoutParams);
        return LJLJLLL;
    }

    @Override // X.LM4
    public final boolean enabled() {
        return this.LJLILLLLZI.Q1();
    }

    @Override // X.LM4
    public final String getTag() {
        return this.LJLJI;
    }

    public LL3(LNP environmentConfig) {
        o.LJIIIZ(environmentConfig, "environmentConfig");
        this.LJLIL = environmentConfig;
        this.LJLILLLLZI = ECommerceMallService.v3();
        this.LJLJI = LMF.SHOP.getTag();
    }
}
