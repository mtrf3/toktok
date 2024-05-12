package X;

import android.content.res.Configuration;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.journey.step.swipeup.SwipeUpVideoComponent;
import com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment;
import com.ss.android.ugc.aweme.services.SmartLockService;
import kotlin.jvm.internal.o;

/* renamed from: X.Fzy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40810Fzy extends AbstractC40836G0y<C35656Dz2> {
    @Override // X.G04
    public final EnumC40761FzB type() {
        return EnumC40761FzB.JOURNEY_SWIPE_UP_ID;
    }

    @Override // X.G04
    public final boolean LIZIZ(C35656Dz2 c35656Dz2) {
        if (!((RBX) HG3.LJIILL()).isNewUser() && ((Boolean) C2RE.LIZIZ.getValue()).booleanValue()) {
            return false;
        }
        G09 g09 = (G09) this.LIZ.LIZ(G09.class);
        if (g09 != null && g09.LLJJJIL()) {
            return false;
        }
        if ((EOO.LIZJ() && SmartLockService.createISmartLockServicebyMonsterPlugin(false).isLoginSuccessBySmartLock() && EOO.LJI()) || EOO.LJFF() || E5H.LIZIZ(EnumC40761FzB.JOURNEY_SWIPE_UP_ID)) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC40836G0y
    public final NUJComponentFragment LJ(C35656Dz2 c35656Dz2) {
        G36 g36;
        G36 g362;
        SwipeUpVideoComponent swipeUpVideoComponent = new SwipeUpVideoComponent();
        InterfaceC40740Fyq interfaceC40740Fyq = (InterfaceC40740Fyq) this.LIZ.LIZ(InterfaceC40740Fyq.class);
        String str = null;
        if (interfaceC40740Fyq != null) {
            g36 = interfaceC40740Fyq.LLLLZIL();
        } else {
            g36 = null;
        }
        InterfaceC40740Fyq interfaceC40740Fyq2 = (InterfaceC40740Fyq) this.LIZ.LIZ(InterfaceC40740Fyq.class);
        if (interfaceC40740Fyq2 != null) {
            g362 = interfaceC40740Fyq2.LLLLLIL();
        } else {
            g362 = null;
        }
        if (g36 != null) {
            String LIZJ = g36.LIZJ();
            if (g362 != null) {
                str = g362.LIZJ();
            }
            if (TextUtils.equals(LIZJ, str)) {
                new Configuration(((InterfaceC40755Fz5) this.LIZ.LJLILLLLZI).LIZ().getResources().getConfiguration()).setLocale(g36.getLocale());
            }
        }
        return swipeUpVideoComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40810Fzy(G0D context, G15 flowEngine) {
        super(context, flowEngine);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(flowEngine, "flowEngine");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (android.text.TextUtils.equals(r0, r3) == false) goto L14;
     */
    @Override // X.AbstractC40836G0y, X.G0C, X.G04
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.G0D r5, X.C35656Dz2 r6, X.InterfaceC88472Yns<? super X.C40745Fyv, X.C76800UCe> r7) {
        /*
            r4 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            X.G0D r1 = r4.LIZ
            java.lang.Class<X.Fyq> r0 = X.InterfaceC40740Fyq.class
            java.lang.Object r0 = r1.LIZ(r0)
            X.Fyq r0 = (X.InterfaceC40740Fyq) r0
            r3 = 0
            if (r0 == 0) goto L48
            X.G36 r2 = r0.LLLLZIL()
        L16:
            X.G0D r1 = r4.LIZ
            java.lang.Class<X.Fyq> r0 = X.InterfaceC40740Fyq.class
            java.lang.Object r0 = r1.LIZ(r0)
            X.Fyq r0 = (X.InterfaceC40740Fyq) r0
            if (r0 == 0) goto L46
            X.G36 r1 = r0.LLLLLIL()
        L26:
            if (r2 == 0) goto L3c
            java.lang.String r0 = r2.LIZJ()
            if (r1 == 0) goto L32
            java.lang.String r3 = r1.LIZJ()
        L32:
            boolean r0 = android.text.TextUtils.equals(r0, r3)
            if (r0 != 0) goto L3c
        L38:
            super.LIZ(r5, r6, r7)
            return
        L3c:
            X.G0D r0 = r4.LIZ
            java.lang.Object r0 = r0.LJLILLLLZI
            X.Fz5 r0 = (X.InterfaceC40755Fz5) r0
            r0.LIZIZ()
            goto L38
        L46:
            r1 = r3
            goto L26
        L48:
            r2 = r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40810Fzy.LIZ(X.G0D, X.Dz2, X.Yns):void");
    }
}
