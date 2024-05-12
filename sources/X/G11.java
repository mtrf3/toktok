package X;

import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.services.MandatoryLoginService;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G11 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final G11 LJLIL = new G11();

    public G11() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        IMandatoryLoginService createIMandatoryLoginServicebyMonsterPlugin = MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false);
        o.LJIIIIZZ(createIMandatoryLoginServicebyMonsterPlugin, "get().getService(IMandat…LoginService::class.java)");
        return Boolean.valueOf(createIMandatoryLoginServicebyMonsterPlugin.shouldShowForcedLogin(false));
    }
}
