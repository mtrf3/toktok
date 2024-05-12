package X;

import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.services.MandatoryLoginService;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LU4 implements InterfaceC54326LTu {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ LU1 LIZIZ;

    public LU4(boolean z, LU1 lu1) {
        this.LIZ = z;
        this.LIZIZ = lu1;
    }

    @Override // X.InterfaceC54326LTu
    public final void LJLIIL() {
        IMandatoryLoginService createIMandatoryLoginServicebyMonsterPlugin = MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false);
        o.LJIIIIZZ(createIMandatoryLoginServicebyMonsterPlugin, "get()\n                  …                        )");
        if (createIMandatoryLoginServicebyMonsterPlugin.shouldShowForcedLogin(false) && this.LIZ) {
            this.LIZIZ.w3();
        }
    }
}
