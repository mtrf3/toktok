package X;

import com.ss.android.ugc.aweme.account.main.LoginAndConsentAssem;
import java.util.concurrent.Callable;

/* renamed from: X.FYy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class CallableC39172FYy<V> implements Callable {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ LoginAndConsentAssem LJLJJI;

    public CallableC39172FYy(boolean z, boolean z2, boolean z3, LoginAndConsentAssem loginAndConsentAssem) {
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = z3;
        this.LJLJJI = loginAndConsentAssem;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if ((C38986FRu.LIZ().LIZIZ() != 2 && !this.LJLIL && !this.LJLILLLLZI) || this.LJLJI) {
            this.LJLJJI.v3(this.LJLJI);
        }
        return C76800UCe.LIZ;
    }
}
