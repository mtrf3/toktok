package X;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.journey.step.ComponentDependencies;
import com.ss.android.ugc.aweme.journey.step.swipeup.SwipeUpVideoComponent;
import java.util.Locale;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.Fzp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40801Fzp extends G0N<SwipeUpVideoComponent, InterfaceC40802Fzq> {
    public SwipeUpVideoComponent LIZ;

    @Override // X.G0N, X.InterfaceC40768FzI
    public final InterfaceC88472Yns<InterfaceC40802Fzq, C76800UCe> LJI() {
        return new AqS172S0100000_6(this, 81);
    }

    @Override // X.InterfaceC40768FzI
    public final void LIZIZ(ComponentDependencies dependencies) {
        o.LJIIIZ(dependencies, "dependencies");
        InterfaceC88472Yns<Fragment, C76800UCe> LJIIZILJ = dependencies.LJIIZILJ();
        SwipeUpVideoComponent swipeUpVideoComponent = this.LIZ;
        o.LJI(swipeUpVideoComponent);
        LJIIZILJ.invoke(swipeUpVideoComponent);
    }

    @Override // X.InterfaceC40768FzI
    public final Object LIZLLL(ComponentDependencies dependencies) {
        G36 LLLLZIL;
        o.LJIIIZ(dependencies, "dependencies");
        this.LIZ = new SwipeUpVideoComponent();
        G36 LLLLZIL2 = dependencies.LLLLZIL();
        if ((LLLLZIL2 == null || TextUtils.equals(LLLLZIL2.LIZJ(), dependencies.LLLLLIL().LIZJ())) && (LLLLZIL = dependencies.LLLLZIL()) != null) {
            Locale locale = LLLLZIL.getLocale();
            Context context = dependencies.ZC().invoke().get();
            if (context != null) {
                new Configuration(context.getResources().getConfiguration()).setLocale(locale);
            }
        }
        return this.LIZ;
    }

    @Override // X.InterfaceC40768FzI
    public final boolean LJ(ComponentDependencies componentDependencies) {
        if ((((RBX) HG3.LJIILL()).isNewUser() || !((Boolean) C2RE.LIZIZ.getValue()).booleanValue()) && !componentDependencies.LLJJJIL()) {
            componentDependencies.LJLJJL().getClass();
            if (!EOO.LJII() && !EOO.LJFF() && !E5H.LIZIZ(EnumC40761FzB.JOURNEY_SWIPE_UP_ID)) {
                return true;
            }
        }
        return false;
    }
}
