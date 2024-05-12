package X;

import Y.AObserverS69S0100000_1;
import Y.ARunnableS37S0100000_1;
import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import java.util.List;

/* renamed from: X.39G, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C39G implements C3J7, C3JJ {
    public final C39H LJLIL = new C39H();
    public final C39N LJLILLLLZI = C39N.LOGIN;
    public final Handler LJLJI = new Handler(C16880lQ.LLJJJJ());
    public final AObserverS69S0100000_1 LJLJJI = new AObserverS69S0100000_1(this, UserLevelGeckoUpdateSetting.DEFAULT);

    @Override // X.C3JJ
    public final void LIZLLL() {
    }

    @Override // X.C3J7
    public final void LJI(List<? extends C3L4> list) {
        this.LJLIL.getClass();
    }

    @Override // X.C3JJ
    public final void LJIILIIL() {
    }

    @Override // X.C3JJ
    public final void LJIIJ() {
        C95773pN c95773pN = C95773pN.LJLIL;
        c95773pN.getClass();
        C95773pN.LJLILLLLZI.clear();
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        C4WC.LIZIZ.LJIIIZ(c95773pN);
        this.LJLJI.post(new ARunnableS37S0100000_1(this, 125));
    }

    @Override // X.C3JJ
    public final void LJIIL() {
        C95773pN c95773pN = C95773pN.LJLIL;
        c95773pN.getClass();
        C95773pN.LJLILLLLZI.clear();
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        C4WC.LIZIZ.LJFF(c95773pN);
        this.LJLJI.post(new ARunnableS37S0100000_1(this, 126));
    }

    @Override // X.C3J7
    public final C39N LIZJ() {
        return this.LJLILLLLZI;
    }

    @Override // X.C3J7
    public final void LIZIZ(InterfaceC88472Yns<? super InterfaceC81693In, C76800UCe> interfaceC88472Yns) {
        C39H c39h = this.LJLIL;
        c39h.getClass();
        c39h.LJLJI = interfaceC88472Yns;
    }

    @Override // X.C3J7
    public final void LJFF(InterfaceC88472Yns<? super InterfaceC81723Iq, C76800UCe> interfaceC88472Yns) {
        C39H c39h = this.LJLIL;
        c39h.getClass();
        c39h.LJLILLLLZI = interfaceC88472Yns;
    }
}
