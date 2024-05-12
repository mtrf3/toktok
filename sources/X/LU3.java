package X;

import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.services.MandatoryLoginService;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LU3 implements InterfaceC54327LTv {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ LU2 LIZIZ;

    public LU3(boolean z, LU2 lu2) {
        this.LIZ = z;
        this.LIZIZ = lu2;
    }

    @Override // X.InterfaceC54327LTv
    public final void LJLIIL() {
        IMandatoryLoginService createIMandatoryLoginServicebyMonsterPlugin = MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false);
        o.LJIIIIZZ(createIMandatoryLoginServicebyMonsterPlugin, "get()\n                  …                        )");
        if (createIMandatoryLoginServicebyMonsterPlugin.shouldShowForcedLogin(false) && this.LIZ) {
            this.LIZIZ.w3();
        }
    }
}
