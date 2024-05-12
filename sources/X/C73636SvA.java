package X;

import Y.AfS61S0200000_12;
import Y.AfS64S0100000_12;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.account.login.v2.base.MaybeBindLifeCycleTransformer;
import kotlin.jvm.internal.o;

/* renamed from: X.SvA, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73636SvA implements InterfaceC73592SuS {
    public static final C73636SvA LJLIL = new C73636SvA();

    @Override // X.InterfaceC73592SuS
    public boolean test(Object it) {
        o.LJIIIZ(it, "it");
        return it instanceof InterfaceC40262Fr8;
    }

    public static final C73626Sv0 LIZ(Fragment fragment, InterfaceC69056R8i accountCallback, AbstractC73635Sv9 abstractC73635Sv9) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(accountCallback, "accountCallback");
        C34K c34k = new C34K();
        C73608Sui LJIJJ = abstractC73635Sv9.LJIJJ(C73969T1h.LIZIZ());
        Lifecycle lifecycle = fragment.getLifecycle();
        o.LJIIIIZZ(lifecycle, "fragment.lifecycle");
        MaybeBindLifeCycleTransformer maybeBindLifeCycleTransformer = new MaybeBindLifeCycleTransformer();
        lifecycle.addObserver(maybeBindLifeCycleTransformer);
        C73626Sv0 LJI = new C73596SuW(((AbstractC73635Sv9) maybeBindLifeCycleTransformer.LIZ(LJIJJ)).LJIIIZ(new AfS61S0200000_12(accountCallback, c34k, 2)), new C69085R9l(accountCallback, c34k, fragment)).LJI(new C73637SvB(accountCallback, c34k));
        AfS64S0100000_12 afS64S0100000_12 = new AfS64S0100000_12(accountCallback, 15);
        C42222Ghe c42222Ghe = C73674Svm.LIZLLL;
        IMU imu = C73674Svm.LIZJ;
        return new C73626Sv0(LJI, afS64S0100000_12, c42222Ghe, c42222Ghe, imu, imu);
    }
}
