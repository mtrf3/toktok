package X;

import Y.AfS36S0101000_5;
import com.ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2RJ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2RJ implements M5A {
    public final WeakReference<IPlayerComponentAbility> LJLIL;
    public final int LJLILLLLZI;
    public final C73318Sq2 LJLJI = new C73318Sq2();

    @Override // X.M5A
    public final void onAppEnterBackGround() {
        this.LJLJI.dispose();
        this.LJLJI.LIZ(AbstractC73672Svk.LJJIJIL("").LJIIL(this.LJLILLLLZI, TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS36S0101000_5(5, this, 47), new C76143TuV(2)));
    }

    @Override // X.M5A
    public final void onAppEnterForeground() {
        this.LJLJI.dispose();
    }

    public C2RJ(IPlayerComponentAbility iPlayerComponentAbility, int i) {
        this.LJLIL = new WeakReference<>(iPlayerComponentAbility);
        this.LJLILLLLZI = i;
        ((M59) BusinessComponentServiceUtils.getAppStateReporter()).LIZJ(this);
    }
}
